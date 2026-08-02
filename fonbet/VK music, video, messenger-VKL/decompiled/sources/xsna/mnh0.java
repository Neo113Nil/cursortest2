package xsna;

import android.content.res.Resources;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.compose.runtime.a;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.autotest.attachment.AutoTestAttachmentUsage;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.VKApplication;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.DatagramSocket;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import org.chromium.base.TimeUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.movie.Movie;

/* compiled from: SearchButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class mnh0 implements mdy0, io.reactivex.rxjava3.functions.c, i620 {
    public static final jai b = new jai(1474331904, new nai(1), false);
    public static final jai c = new jai(1999514597, new nq2(0, 3), false);
    public static final jai d = new jai(-151986624, new oq2(0, 1), false);
    public static final jai e = new jai(-1673702017, new rai(2), false);

    public static String A(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static final io.reactivex.rxjava3.disposables.c B(io.reactivex.rxjava3.core.q qVar, ygg yggVar, izs izsVar, izs izsVar2, ngl nglVar) {
        return qVar.subscribe(new w00(new d74(izsVar, 3), 13), new y00(new ihb(yggVar, nglVar, izsVar2, 3), 14));
    }

    public static final io.reactivex.rxjava3.disposables.c C(io.reactivex.rxjava3.core.x xVar, ygg yggVar, izs izsVar, izs izsVar2, ngl nglVar) {
        return xVar.subscribe(new js1(new uw(izsVar, 2), 17), new i22(new ojg(yggVar, nglVar, izsVar2, 0), 12));
    }

    public static final CallMemberId E(ParticipantId participantId) {
        return new CallMemberId(participantId.id, participantId.deviceIndex);
    }

    public static final VKApiException F(JSONObject jSONObject, String str, int[] iArr) {
        return pbr0.a(jSONObject.getJSONArray("execute_errors"), str, iArr);
    }

    public static final ea60 G(wm60 wm60Var) {
        if (wm60Var instanceof bp5) {
            return e(((bp5) wm60Var).a);
        }
        return null;
    }

    public static ParticipantId H(CallMemberId callMemberId) {
        return new ParticipantId(callMemberId.b, false, callMemberId.c);
    }

    public static final VKApiException I(String str, String str2, JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("error");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        return pbr0.b(str, str2, jSONObject);
    }

    public static void c(p180 p180Var, f5z f5zVar, izs izsVar, int i) {
        if ((i & 1) != 0) {
            f5zVar = null;
        }
        q180 q180Var = new q180(izsVar);
        if (f5zVar != null) {
            p180Var.a(f5zVar, q180Var);
        } else {
            p180Var.b(q180Var);
        }
    }

    public static void d(Throwable th, Throwable th2) {
        if (th != th2) {
            qta0.a.a(th, th2);
        }
    }

    public static final ea60 e(NewsEntry newsEntry) {
        EntryHeader entryHeader;
        SourcePhoto sourcePhoto;
        if (newsEntry == null) {
            return null;
        }
        int i = 13;
        if (newsEntry instanceof Post) {
            UserId userId = ((Post) newsEntry).o.b;
            return new emi(i);
        }
        if (newsEntry instanceof Videos) {
            Videos videos = (Videos) newsEntry;
            Owner owner = videos.m;
            if ((owner == null || owner.b == null) && ((entryHeader = videos.r) == null || (sourcePhoto = entryHeader.b) == null || sourcePhoto.d() == null)) {
                UserId.b bVar = UserId.c;
            }
            VideoAttachment Nb = videos.Nb();
            if (Nb != null) {
                VideoFile videoFile = Nb.k;
            }
            VideoAttachment Nb2 = videos.Nb();
            if (Nb2 != null) {
                VideoFile videoFile2 = Nb2.k;
            }
            VideoAttachment Nb3 = videos.Nb();
            if (Nb3 != null) {
                VideoFile videoFile3 = Nb3.k;
            }
            videos.Ea();
            return new rdi();
        }
        if (newsEntry instanceof PromoPost) {
            Post post = ((PromoPost) newsEntry).n;
            UserId userId2 = post.m;
            UserId userId3 = post.o.b;
            return new sdy();
        }
        if (newsEntry instanceof ShitAttachment) {
            VideoAttachment videoAttachment = ((ShitAttachment) newsEntry).I;
            if (videoAttachment != null) {
                videoAttachment.getId();
            }
            if (videoAttachment != null) {
                videoAttachment.k.getClass();
            }
            return new crx0();
        }
        if (newsEntry instanceof MyTargetNativeAdEntry) {
            return new kci();
        }
        if (!(newsEntry instanceof FaveEntry)) {
            newsEntry.Db();
            return new sua();
        }
        gmq gmqVar = ((FaveEntry) newsEntry).i.f;
        if (!(gmqVar instanceof Post)) {
            return new sua();
        }
        Post post2 = (Post) gmqVar;
        UserId userId4 = post2.m;
        UserId userId5 = post2.o.b;
        return new emi(i);
    }

    @NonNull
    public static ail f(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new ail(httpURLConnection);
    }

    public static String g(long j, Resources resources) {
        long a = pvo0.a() - (j / 1000);
        String[] stringArray = resources.getStringArray(R.array.short_time);
        if (0 <= a && a < 60) {
            return resources.getString(R.string.date_ago_now);
        }
        if (60 <= a && a < TimeUtils.SECONDS_PER_HOUR) {
            return (a / 60) + stringArray[1];
        }
        if (TimeUtils.SECONDS_PER_HOUR <= a && a < TimeUtils.SECONDS_PER_DAY) {
            return (a / 3600) + stringArray[2];
        }
        if (TimeUtils.SECONDS_PER_DAY <= a && a < 604800) {
            return (a / 86400) + stringArray[3];
        }
        if (604800 > a || a >= 2592000) {
            return pvo0.j(j, true, true);
        }
        return (a / 604800) + stringArray[4];
    }

    public static final VKApiException h(per0 per0Var, String str, int[] iArr) {
        JSONArray jSONArray = per0Var.c;
        if (jSONArray == null) {
            return null;
        }
        if (iArr != null) {
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(Integer.valueOf(jSONArray.getJSONObject(i).getInt("error_code")));
            }
            for (int i2 : iArr) {
                hashSet.remove(Integer.valueOf(i2));
            }
            if (hashSet.isEmpty()) {
                return null;
            }
        }
        return pbr0.a(jSONArray, str, iArr);
    }

    public static final VKApiException i(per0 per0Var, String str, String str2) {
        JSONObject jSONObject = per0Var.b;
        if (jSONObject == null) {
            return null;
        }
        return pbr0.b(str, str2, jSONObject);
    }

    public static final boolean j(JSONObject jSONObject, int[] iArr) {
        if (jSONObject.has("execute_errors")) {
            if (iArr == null) {
                return true;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("execute_errors");
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                hashSet.add(Integer.valueOf(jSONArray.getJSONObject(i).getInt("error_code")));
            }
            for (int i2 : iArr) {
                hashSet.remove(Integer.valueOf(i2));
            }
            if (!hashSet.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean k(JSONObject jSONObject) {
        return jSONObject.has("error");
    }

    public static fkg0 l(gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getIcon().l;
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-976876091, 24576, -1, "com.vk.core.compose.component.search.Search.Right.Filter.Companion.invoke (Search.kt:69)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(578670372, 6, -1, "com.vk.core.compose.component.search.right.remember (RightFilterImpl.kt:51)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new fkg0(j, gzsVar);
            aVar.R(x);
        }
        fkg0 fkg0Var = (fkg0) x;
        ((zak0) fkg0Var.a).setValue(new l5g(j));
        ((zak0) fkg0Var.b).setValue(null);
        ((zak0) fkg0Var.d).setValue(gzsVar);
        ((zak0) fkg0Var.c).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return fkg0Var;
    }

    public static final boolean m(MotionEvent motionEvent) {
        return motionEvent.getAction() == 0;
    }

    public static final boolean n(CallMemberId callMemberId, ParticipantId participantId) {
        return callMemberId != null && epx.f(callMemberId.b, participantId.id) && callMemberId.c == participantId.deviceIndex;
    }

    public static final boolean o(MotionEvent motionEvent) {
        return motionEvent.getAction() == 2;
    }

    public static final boolean p(Uri uri) {
        return epx.f("oauth.".concat(a0a.d), uri.getHost()) && "/blank.html".equals(uri.getPath());
    }

    public static final boolean q(MotionEvent motionEvent) {
        return motionEvent.getAction() == 1;
    }

    public static final boolean r(MotionEvent motionEvent) {
        return motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
    }

    public static void s(xgl0 xgl0Var, long j, List list) {
        xgl0Var.b().e().j0(j, list);
    }

    public static aqu t(UserId userId, Long l) {
        return new aqu(userId, null, aqu.w, l);
    }

    public static final void u(View view, AutoTestAttachmentUsage autoTestAttachmentUsage, Attachment attachment, int i, NewsEntry newsEntry) {
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            attachment.getClass();
            e(newsEntry);
            attachment.zb();
            attachment.Bb();
            bwt0.Q(view, R.id.feed_ui_test_attachment_entry, new o19());
        }
    }

    public static final void v(View view, NewsEntry newsEntry) {
        ea60 e2;
        if (newsEntry == null) {
            return;
        }
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (!BuildInfo.h() || (e2 = e(newsEntry)) == null) {
            return;
        }
        bwt0.Q(view, R.id.feed_ui_test_news_entry, e2);
    }

    public static final void w(View view, boolean z) {
        if (view == null || !gz80.a(23)) {
            return;
        }
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    public static final void x(VKActivity vKActivity) {
        p90.b(vKActivity, dhr0.t.c(R.attr.vk_ui_background_modal), false);
        boolean L = dhr0.L();
        if (gz80.a(23)) {
            HashSet hashSet = iah0.a;
            if (fnj.d(vKActivity) || !L) {
                return;
            }
            View decorView = vKActivity.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }

    public static final void y(int i, FragmentActivity fragmentActivity) {
        View decorView = fragmentActivity.getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        boolean z = false;
        int i2 = (!gz80.a(26) ? 0 : 16) & systemUiVisibility;
        if (fragmentActivity.getWindow().getStatusBarColor() != i) {
            fragmentActivity.getWindow().setStatusBarColor(i);
        }
        if (!gz80.a(23)) {
            if (systemUiVisibility != 0) {
                decorView.setSystemUiVisibility(i2);
                return;
            }
            return;
        }
        if (l8g.d(i) || (((i >> 24) & 255) == 0 && !dhr0.a.c(fragmentActivity))) {
            z = true;
        }
        if (z && systemUiVisibility != 8192) {
            decorView.setSystemUiVisibility(8192 | i2);
        } else {
            if (z || systemUiVisibility == 0) {
                return;
            }
            decorView.setSystemUiVisibility(i2);
        }
    }

    public static final String z(Object obj) {
        StringBuilder b2 = v1v.b(obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName(), '@');
        b2.append(String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return b2.toString();
    }

    @Override // xsna.mdy0
    public DatagramSocket a() throws SocketException {
        return new DatagramSocket(new InetSocketAddress((InetAddress) null, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        Set<CallMemberId> set;
        boolean z;
        Set<CallMemberId> set2;
        boolean z2;
        List<Movie> list;
        CallMemberId callMemberId = (CallMemberId) ((it80) obj).a;
        dhw0 dhw0Var = (dhw0) ((it80) obj2).a;
        cjk0 cjk0Var = null;
        Set<CallMemberId> set3 = dhw0Var != null ? dhw0Var.o : null;
        Set<CallMemberId> set4 = dhw0Var != null ? dhw0Var.r : null;
        Set<CallMemberId> set5 = dhw0Var != null ? dhw0Var.p : null;
        Map<CallMemberId, List<Movie>> map = dhw0Var != null ? dhw0Var.q : null;
        if (callMemberId != null) {
            Set<CallMemberId> set6 = set3;
            if (set6 == null || !set6.contains(callMemberId)) {
                set = set4;
                z = false;
            } else {
                set = set4;
                z = true;
            }
            if (set == null || !set.contains(callMemberId)) {
                set2 = set5;
                z2 = false;
            } else {
                set2 = set5;
                z2 = true;
            }
            boolean z3 = set2 != null && set2.contains(callMemberId);
            if (map == null || (list = map.get(callMemberId)) == null) {
                list = EmptyList.b;
            }
            cjk0Var = new cjk0(callMemberId, z, z2, z3, list);
        }
        return new it80(cjk0Var);
    }

    @Override // xsna.i620
    public a520 b() {
        return new wyy0();
    }
}
