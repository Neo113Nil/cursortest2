package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.api.generated.video.dto.VideoStopStreamingResponseDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.chromium.base.TimeUtils;
import org.json.JSONObject;

/* compiled from: LiveVideoControllerImpl.kt */
/* loaded from: classes3.dex */
public final class gnz implements anz {
    public final ecm a;
    public final VideoApiHelperRepository b;
    public final byp c;
    public boolean d;
    public final LinkedHashMap e;

    public gnz() {
        throw null;
    }

    public gnz(o2i o2iVar, VideoApiHelperRepository videoApiHelperRepository) {
        this.a = new ecm(o2iVar, 23);
        this.b = videoApiHelperRepository;
        this.c = byp.b();
        this.e = new LinkedHashMap();
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 a0(int i, UserId userId, Boolean bool, Integer num, Integer num2) {
        dz2 x = yfb.x(tft0.C(new uft0(), i, userId, null, bool, num, 0, num2, VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST, e43.l("photo_base", "verified", "video_files"), null, null, null, 8192));
        ahn.D(x);
        return rsg0.y0(x, null, null, 3);
    }

    public static void b0(int i, UserId userId, boolean z) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        SharedPreferences.Editor edit = Preference.g(context).edit();
        edit.putBoolean("live_liked_" + userId + i, z);
        edit.apply();
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> A(int i, UserId userId) {
        return P(i, userId, UserId.d);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> B(int i, UserId userId) {
        pit0 pit0Var = new pit0("video.liveStopHeartbeat");
        pit0Var.F(userId, "owner_id");
        pit0Var.C(i, "video_id");
        ahn.D(pit0Var);
        return rsg0.y0(pit0Var, null, null, 3);
    }

    @Override // xsna.anz
    public final void C(boolean z) {
        SharedPreferences.Editor edit = Preference.f("LIVE_PREF_KEY").edit();
        edit.putBoolean("BROADCAST_PREF_PUBLISH_POST", z);
        edit.apply();
    }

    @Override // xsna.anz
    public final fjz D(ViewGroup viewGroup, yjk0 yjk0Var, boolean z, emz emzVar) {
        return new l0x(viewGroup, yjk0Var, z, emzVar);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q E(final int i, final UserId userId, final String str, final boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.enz
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                return rsg0.y0(new kns0(i, userId, str, z), null, null, 3).U(new oyr(new d0k(12), 4));
            }
        });
    }

    @Override // xsna.anz
    public final p1u0 F(int i, int i2, int i3, ImageScreenSize imageScreenSize, gzs gzsVar) {
        return new qjz(i, i2, i3, imageScreenSize, gzsVar);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> G(UserId userId) {
        ArrayList o = e43.o(userId);
        oss0 oss0Var = new oss0("video.liveDeleteBan");
        oss0Var.M("owners_ids", o);
        return rsg0.y0(oss0Var, null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q H(int i, UserId userId, UserId userId2) {
        return this.b.a(i, userId, userId2);
    }

    @Override // xsna.anz
    public final ne8 I(pe8 pe8Var, String str) {
        return new qh8(pe8Var, str, (o2i) this.a.c);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> J(int i, UserId userId) {
        css0 css0Var = new css0("likes.add");
        css0Var.K("type", "video");
        css0Var.F(userId, "owner_id");
        css0Var.C(i, "item_id");
        return rsg0.y0(css0Var, null, null, 3).L(new dnz(new nyq(8), 0), false).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.anz
    public final void K() {
        if (System.currentTimeMillis() - Preference.f("LIVE_PREF_KEY").getLong("LIVE_PREF_LATEST_RED_DOT_APPEAR", 0L) <= TimeUtils.MILLISECONDS_PER_DAY || System.currentTimeMillis() - Preference.f("LIVE_PREF_KEY").getLong("LIVE_PREF_LATEST_RECOMMENDED_APPEAR", 0L) <= TimeUtils.MILLISECONDS_PER_DAY) {
            return;
        }
        this.d = true;
        this.c.c(new fjj0());
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = Preference.f("LIVE_PREF_KEY").edit();
        edit.putLong("LIVE_PREF_LATEST_RED_DOT_APPEAR", currentTimeMillis);
        edit.apply();
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> L(int i, UserId userId, int i2) {
        rss0 rss0Var = new rss0("video.liveSendSticker");
        rss0Var.F(userId, "owner_id");
        rss0Var.C(i, "video_id");
        rss0Var.C(i2, "sticker_id");
        return rsg0.y0(rss0Var, null, null, 3).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Integer> M(int i, UserId userId) {
        return a0(i, userId, Boolean.FALSE, 0, 10).L(new k7(new gky(3), 20), false);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q N(String str, final JSONObject jSONObject, final String str2, final String str3) {
        return new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.cnz
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                String str4;
                ons0 ons0Var = new ons0("video.getRecommendedLiveVideos");
                ons0Var.p = true;
                ons0Var.C(1, "extended");
                String str5 = str2;
                if (str5 != null && (str4 = str3) != null) {
                    ons0Var.K("latitude", str5);
                    ons0Var.K("longitude", str4);
                }
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 != null) {
                    ons0Var.K("filters", jSONObject2.toString());
                }
                ons0Var.K("fields", "can_comment,friend_status,photo_base,first_name_gen,first_name,last_name,nickname,bdate,city,country,sex,verified,trending");
                return rsg0.y0(ons0Var, null, null, 3);
            }
        }).U(new nm3(new l74(str, 2), 16));
    }

    @Override // xsna.anz
    public final boolean O() {
        return Preference.f("LIVE_PREF_KEY").getBoolean("BROADCAST_PREF_GROUP_CANCOMMENT", true);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> P(int i, UserId userId, UserId userId2) {
        return rsg0.y0(new sm4(i, userId, userId2), null, null, 3);
    }

    @Override // xsna.anz
    public final oiz Q(piz pizVar) {
        return new com.vk.libvideo.live.impl.views.live.b(pizVar);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> R(UserId userId) {
        ArrayList o = e43.o(userId);
        nss0 nss0Var = new nss0("video.liveAddBan");
        nss0Var.M("owners_ids", o);
        return rsg0.y0(nss0Var, null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q S(int i, UserId userId) {
        return m0(i, userId) ? io.reactivex.rxjava3.core.q.H(new Throwable("Cant like twice")) : rsg0.y0(yfb.x(k0x.d(new k0x(4), "video_comment", i, userId, null, null, null, null, null, 512)), null, null, 3).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new o7(new knt(this, userId, i), 19));
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q T(int i, UserId userId) {
        return a0(i, userId, Boolean.TRUE, null, 10);
    }

    @Override // xsna.anz
    public final piz U(Context context) {
        return new LiveView(context);
    }

    @Override // xsna.anz
    public final void V(UserProfile userProfile, String str) {
        g(str).add(userProfile);
    }

    @Override // xsna.anz
    public final boolean W() {
        return this.d;
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q X(int i, UserId userId) {
        return rsg0.y0(yfb.x(k0x.e(new k0x(4), "video_comment", i, userId, null, null, null, 128)), null, null, 3).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new rt0(new fnz(this, userId, i), 19));
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> Y(int i, UserId userId) {
        fs fsVar = new fs("stories.createFromLive");
        fsVar.F(userId, "owner_id");
        fsVar.C(i, "video_id");
        return rsg0.y0(fsVar, null, null, 3);
    }

    @Override // xsna.anz
    public final rnz Z(piz pizVar) {
        return new nnz(pizVar);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q a(int i, UserId userId) {
        return rsg0.y0(new ros(userId, i, "live_video", null), null, null, 3);
    }

    @Override // xsna.anz
    public final void b() {
        this.d = false;
        this.c.c(new l4v());
    }

    @Override // xsna.anz
    public final flz c(kxc kxcVar, r4k r4kVar) {
        return new llz(kxcVar, r4kVar);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> d(UserId userId, boolean z) {
        return rsg0.y0(new r6z(userId, !z), null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q e(int i, UserId userId) {
        tfx tfxVar = new tfx("video.pinComment", new hsi0(6), new vul0(5));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "comment_id", i, 1, 0, 8);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new ql2(new hyu(2), 23));
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q f(int i, UserId userId) {
        tfx tfxVar = new tfx("video.unpinComment", new a690(10), new hlx0());
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "comment_id", i, 1, 0, 8);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new lp0(new qm0(28), 25));
    }

    @Override // xsna.anz
    public final Set<UserProfile> g(String str) {
        LinkedHashMap linkedHashMap = this.e;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new LinkedHashSet();
            linkedHashMap.put(str, obj);
        }
        return (Set) obj;
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> h(int i, UserId userId, String str) {
        return rsg0.y0(new cgt0(userId, Integer.valueOf(i), str), null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> i(int i, UserId userId) {
        return rsg0.y0(new oct0(userId, Integer.valueOf(i)), null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<rit0> j() {
        return rsg0.y0(new qns0(), null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<Boolean> k(int i, UserId userId) {
        return rsg0.y0(new ilt0(userId, Integer.valueOf(i)), null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<VideoGetCommentsExtendedResponseDto> l(int i, UserId userId, int i2) {
        return a0(i, userId, Boolean.TRUE, Integer.valueOf(i2), 1);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q m(final int i, final UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.observable.c2(new io.reactivex.rxjava3.internal.operators.observable.z1(new io.reactivex.rxjava3.internal.operators.observable.t(new io.reactivex.rxjava3.functions.n() { // from class: xsna.bnz
            @Override // io.reactivex.rxjava3.functions.n
            public final Object get() {
                yw4 yw4Var = new yw4("video.liveHeartbeat", 2);
                yw4Var.F(UserId.this, "owner_id");
                yw4Var.C(i, "video_id");
                yw4Var.C(10, "spectators_count");
                yw4Var.C(1, "extended");
                yw4Var.K("fields", "members_count,counters,screen_name,domain,name,photo_base,city,country,friend_status,counters,screen_name,domain,first_name_gen,first_name,last_name,nickname,bdate,city,country,sex");
                ahn.D(yw4Var);
                yw4Var.p = true;
                return rsg0.y0(yw4Var, null, null, 3);
            }
        }), new n0g0(5000)), new c4g0());
    }

    @Override // xsna.anz
    public final boolean m0(int i, UserId userId) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return Preference.g(context).getBoolean("live_liked_" + userId + i, false);
    }

    @Override // xsna.anz
    public final boolean n() {
        return Preference.f("LIVE_PREF_KEY").getBoolean("ENABLE_LIVE_STORY_SHARING", true);
    }

    @Override // xsna.anz
    public final void o(boolean z) {
        SharedPreferences.Editor edit = Preference.f("LIVE_PREF_KEY").edit();
        edit.putBoolean("ENABLE_LIVE_STORY_SHARING_24", z);
        edit.apply();
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<vqk0> p(wqk0 wqk0Var) {
        String str = wqk0Var.a;
        Integer num = wqk0Var.b;
        UserId userId = wqk0Var.c;
        boolean z = wqk0Var.d;
        boolean z2 = wqk0Var.e;
        Location location = wqk0Var.f;
        boolean z3 = wqk0Var.g;
        List<String> list = wqk0Var.h;
        kit0 kit0Var = new kit0("video.startStreaming");
        if (!TextUtils.isEmpty(str)) {
            kit0Var.K("name", str);
        }
        if (num != null) {
            kit0Var.C(num.intValue(), "video_id");
        }
        if (fkq0.b(userId)) {
            kit0Var.F(fkq0.e(userId), "group_id");
        } else {
            kit0Var.F(userId, "user_id");
        }
        kit0Var.C(z ? 1 : 0, "wallpost");
        kit0Var.C(z2 ? 1 : 0, "stories_post");
        if (location != null) {
            kit0Var.K("latitude", Double.toString(location.getLatitude()));
            kit0Var.K("longitude", Double.toString(location.getLongitude()));
        }
        if (!z3 && fkq0.b(userId)) {
            kit0Var.K("no_comments", "true");
        }
        if (!list.isEmpty()) {
            kit0Var.G("privacy_view", list);
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(kit0Var, null, null, 3);
        sf sfVar = new sf(new x8m(14), 28);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(sfVar, lVar, kVar, kVar).L(new pa(new xpt(4), 24), false);
    }

    @Override // xsna.anz
    public final pe8 q(l7s l7sVar) {
        return new ek8(l7sVar);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q<VideoStopStreamingResponseDto> r(int i, UserId userId) {
        Collection collection;
        UserId e = fkq0.b(userId) ? fkq0.e(userId) : null;
        List a = n6j.a(0, StringUtils.COMMA, "unique_viewers,friends_viewers,sex,first_name,last_name,photo_base");
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = j5g.H0(a, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = EmptyList.b;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        List l = e43.l(Arrays.copyOf(strArr, strArr.length));
        tfx tfxVar = new tfx("video.stopStreaming", new a690(9), new v11(28));
        if (e != null) {
            tfx.n(tfxVar, "group_id", e, 1L, 0L, 8);
        }
        tfx.l(tfxVar, "video_id", i, 0, 0, 8);
        tfxVar.j("extended", true);
        if (l != null) {
            tfxVar.i("fields", l);
        }
        return rsg0.y0(yfb.x(tfxVar), null, null, 3);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q s(VideoFile videoFile, String str, boolean z) {
        xy2 o;
        o = new uft0().o(videoFile.o0(), videoFile.I0(), videoFile.C1(), str, null, Boolean.valueOf(z), null, 0, (r33 & 256) != 0 ? null : String.valueOf(new Random().nextInt()), null, null, "live_video", null, (r33 & 8192) != 0 ? null : null, null);
        return rsg0.y0(yfb.x(o), null, null, 3).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // xsna.anz
    public final boolean t() {
        return Preference.f("LIVE_PREF_KEY").getBoolean("ENABLE_LIVE_STORY_SHARING_24", true);
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.a u(int i, UserId userId, boolean z) {
        return new io.reactivex.rxjava3.internal.operators.observable.b1(rsg0.T(new r6z(i, userId, z))).o(asu0.a.d());
    }

    @Override // xsna.anz
    public final io.reactivex.rxjava3.core.q v(int i, UserId userId) {
        tfx tfxVar = new tfx("video.deleteComment", new s3j0(8), new t3j0(7));
        tfx.l(tfxVar, "comment_id", i, 0, 0, 12);
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.o(tfxVar, "ref", "live_video", 0, 0, 12);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new op0(new v4v(4), 21));
    }

    @Override // xsna.anz
    public final void w() {
        SharedPreferences.Editor edit = Preference.f("LIVE_PREF_KEY").edit();
        edit.putBoolean("SWIPE_TOOLTIP_WAS_DISPLAYED_PREF", true);
        edit.apply();
    }

    @Override // xsna.anz
    public final prk0 x(Context context) {
        return new xsk0(context);
    }

    @Override // xsna.anz
    public final boolean y() {
        return Preference.f("LIVE_PREF_KEY").getBoolean("BROADCAST_PREF_PUBLISH_POST", true);
    }

    @Override // xsna.anz
    public final void z(long j) {
        SharedPreferences.Editor edit = Preference.f("LIVE_PREF_KEY").edit();
        edit.putLong("LIVE_PREF_LATEST_RECOMMENDED_APPEAR", j);
        edit.apply();
    }
}
