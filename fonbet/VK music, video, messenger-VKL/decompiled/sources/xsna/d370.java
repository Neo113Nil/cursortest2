package xsna;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.health.platform.client.proto.b0;
import com.google.android.gms.internal.measurement.zznn;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vk.api.generated.account.dto.AccountInfoSettingsDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.biometrics.lock.impl.service.HidePushContentService;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.stickers.bonus.StickersBonusBalance;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vk.log.L;
import com.vk.music.offline.api.domain.download.DownloadType;
import com.vkontakte.android.R;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.chromium.base.TimeUtils;
import org.json.JSONObject;
import org.webrtc.PeerConnection;
import xsna.p4p;

/* compiled from: BubblePaddingProvider.kt */
@vby
/* loaded from: classes2.dex */
public final class d370 implements ll8, yxe, q701, bpv, l5t, h5p, e4q {
    public static final Pair c = new Pair(52, 61);
    public static final Pair d = new Pair(51, 51);
    public static final Pair e = new Pair(20, 50);
    public static final Pair f = new Pair(0, 19);
    public static final d370 g = new d370(4);
    public static final jai h = new jai(-1753005224, new vci(), false);
    public static final jai i = new jai(636288403, new vei(), false);
    public static final jai j = new jai(-1357803046, new wei(), false);
    public static final /* synthetic */ d370 k = new d370(8);
    public static boolean l;
    public final /* synthetic */ int b;

    public /* synthetic */ d370(int i2) {
        this.b = i2;
    }

    public static String A(String str) {
        if (brm0.B(str, "track_download_", false)) {
            return drm0.U(str, "track_download_");
        }
        if (brm0.B(str, "chapter_download_", false)) {
            return drm0.U(str, "chapter_download_");
        }
        if (brm0.B(str, "episode_download_", false)) {
            return drm0.U(str, "episode_download_");
        }
        return null;
    }

    public static rgg0 B(qgg0 qgg0Var, gzs gzsVar, gzs gzsVar2, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-718246992, 24576, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlock.Header.Companion.invoke (ReviewBlock.kt:27)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2105273740, 6, -1, "com.vk.ecomm.design.compose.reviewcell.remember (ReviewBlockHeaderImpl.kt:152)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new rgg0(qgg0Var, gzsVar, gzsVar2);
            aVar.R(x);
        }
        rgg0 rgg0Var = (rgg0) x;
        ((zak0) rgg0Var.a).setValue(qgg0Var);
        ((zak0) rgg0Var.b).setValue(gzsVar);
        ((zak0) rgg0Var.c).setValue(gzsVar2);
        ((zak0) rgg0Var.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return rgg0Var;
    }

    public static final JSONObject C(izs izsVar) {
        w9y w9yVar = new w9y();
        izsVar.invoke(w9yVar);
        return w9yVar.a;
    }

    public static void D(w2w w2wVar, List list, boolean z) {
        Iterable iterable;
        if (list.isEmpty()) {
            return;
        }
        z9m t = w2wVar.I0().t();
        try {
            iterable = (List) ((xpp) bz2.c(new u9m(list, z), null)).a();
            if (iterable == null) {
                iterable = EmptyList.b;
            }
        } catch (VKApiExecutionException e2) {
            L.E(e2, new Object[0]);
            iterable = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            x9m x9mVar = (x9m) obj;
            if (!t.a(x9mVar.b, x9mVar.a)) {
                arrayList.add(obj);
            }
        }
        w2wVar.I0().t().h(arrayList);
    }

    public static final String E(int i2, int i3, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1784741530, 0, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:71)");
        }
        String quantityString = ((Resources) aVar.r(AndroidCompositionLocals_androidKt.c)).getQuantityString(i2, i3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return quantityString;
    }

    public static final String F(int i2, int i3, Object[] objArr, androidx.compose.runtime.a aVar, int i4) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(523207213, i4, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:85)");
        }
        String quantityString = ((Resources) aVar.r(AndroidCompositionLocals_androidKt.c)).getQuantityString(i2, i3, Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return quantityString;
    }

    public static final String G(Context context, String str, int i2, boolean z) {
        return context.getResources().getQuantityString(R.plurals.stickers_bonus_catalog_points_expire_hint, i2, str, Integer.valueOf(i2), context.getString(z ? R.string.stickers_bonus_catalog_points_expire_3_status : R.string.stickers_bonus_catalog_points_expire_2_status));
    }

    public static final androidx.health.connect.client.aggregate.c H(androidx.health.platform.client.proto.j jVar) {
        Map<String, Long> v = jVar.v();
        Map<String, Double> t = jVar.t();
        b0.d s = jVar.s();
        HashSet hashSet = new HashSet();
        Iterator<E> it = s.iterator();
        while (it.hasNext()) {
            hashSet.add(new luk(((androidx.health.platform.client.proto.l) it.next()).u()));
        }
        return new androidx.health.connect.client.aggregate.c(v, t, hashSet);
    }

    public static final l9x I(zhf0 zhf0Var) {
        return new l9x(Math.round(zhf0Var.a), Math.round(zhf0Var.b), Math.round(zhf0Var.c), Math.round(zhf0Var.d));
    }

    public static String J(ww8 ww8Var) throws UnsupportedEncodingException {
        byte[] bytes = ww8Var.a().getBytes(Charset.forName(C.UTF8_NAME));
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static dcn K(ofx0 ofx0Var) {
        if (l) {
            return null;
        }
        dcn dcnVar = (dcn) ofx0Var.invoke();
        if (dcnVar != null) {
            l = true;
        }
        return dcnVar;
    }

    public static final void L(Throwable th) {
        String string;
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            string = vKApiExecutionException.getMessage() != null ? vKApiExecutionException.getMessage() : e43.a.getString(R.string.live_general_error_description);
        } else {
            string = e43.a.getString(R.string.live_general_error_description);
        }
        cvk.w(string, false);
    }

    public static final String[] M(int i2, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1562162650, 0, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:58)");
        }
        String[] stringArray = ((Resources) aVar.r(AndroidCompositionLocals_androidKt.c)).getStringArray(i2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return stringArray;
    }

    public static final String N(int i2, int i3, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1223887937, i3, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:33)");
        }
        String string = ((Resources) aVar.r(AndroidCompositionLocals_androidKt.c)).getString(i2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return string;
    }

    public static final String O(int i2, Object[] objArr, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2071230100, 0, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = ((Resources) aVar.r(AndroidCompositionLocals_androidKt.c)).getString(i2, Arrays.copyOf(objArr, objArr.length));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return string;
    }

    public static String P(String str) {
        return "track_download_".concat(str);
    }

    public static DownloadType Q(String str) {
        return brm0.B(str, "chapter_download_", false) ? DownloadType.AUDIO_BOOK_CHAPTER : brm0.B(str, "episode_download_", false) ? DownloadType.PODCAST_EPISODE : DownloadType.MUSIC_TRACK;
    }

    public static final yg5 R(kih0 kih0Var) {
        if (kih0Var instanceof qi5) {
            return ((qi5) kih0Var).a;
        }
        throw new IllegalStateException("There is shouldn't be other adapter then AutoPlayWrapper");
    }

    public static dzl k() {
        return new dzl(1.0f, 1.0f);
    }

    public static String l(String str) {
        return "chapter_download_".concat(str);
    }

    public static void n(HidePushContentService hidePushContentService) {
        ca70 ca70Var = ca70.a;
        ((NotificationManager) hidePushContentService.getSystemService("notification")).createNotificationChannel(new NotificationChannel("hide_push_content_service", hidePushContentService.getString(R.string.bl_hide_push_notification_channel_name), 2));
    }

    public static final LinkedHashMap o(List list, List list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) it.next();
                if (fkq0.c(groupsGroupFullDto.P0())) {
                    linkedHashMap.put(fkq0.e(groupsGroupFullDto.P0()), tci.t(groupsGroupFullDto));
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) it2.next();
                if (fkq0.c(usersUserFullDto.s1())) {
                    linkedHashMap.put(usersUserFullDto.s1(), tci.v(usersUserFullDto));
                }
            }
        }
        return linkedHashMap;
    }

    public static String p(MusicTrack musicTrack) {
        AudioBookChapter audioBookChapter = musicTrack.O;
        return audioBookChapter != null ? "chapter_download_".concat(audioBookChapter.b) : musicTrack.w != null ? "episode_download_".concat(musicTrack.Fb()) : "track_download_".concat(musicTrack.Fb());
    }

    public static String q(String str) {
        return "episode_download_".concat(str);
    }

    public static boolean r(String str, List list) {
        Object obj;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((AccountInfoSettingsDto) obj).f(), str)) {
                break;
            }
        }
        AccountInfoSettingsDto accountInfoSettingsDto = (AccountInfoSettingsDto) obj;
        if (accountInfoSettingsDto != null) {
            return accountInfoSettingsDto.d();
        }
        return false;
    }

    public static AccountInfoSettingsDto s(String str, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (epx.f(((AccountInfoSettingsDto) next).e().i(), str)) {
                obj = next;
                break;
            }
        }
        return (AccountInfoSettingsDto) obj;
    }

    public static final String t(Context context, StickersBonusBalance stickersBonusBalance, boolean z) {
        Object obj;
        kci kciVar = kci.c;
        sni sniVar = sni.d;
        kn4 kn4Var = kn4.f;
        Long l2 = stickersBonusBalance.c;
        Integer num = stickersBonusBalance.d;
        long currentTimeMillis = System.currentTimeMillis();
        if (l2 == null || l2.longValue() < currentTimeMillis) {
            obj = kciVar;
        } else {
            Calendar d2 = pvo0.d();
            d2.set(12, 0);
            d2.set(11, 0);
            d2.set(13, 0);
            d2.set(14, 0);
            long timeInMillis = d2.getTimeInMillis();
            long j2 = TimeUtils.MILLISECONDS_PER_DAY + timeInMillis;
            obj = swe0.r(j2, 172800000 + timeInMillis).f(l2.longValue()) ? kn4Var : swe0.r(timeInMillis, j2).f(l2.longValue()) ? sniVar : new a2l((int) TimeUnit.DAYS.convert(l2.longValue() - currentTimeMillis, TimeUnit.MILLISECONDS));
        }
        if (obj.equals(kciVar)) {
            return null;
        }
        if (obj.equals(sniVar)) {
            if (num == null) {
                return context.getString(z ? R.string.stickers_bonus_catalog_points_expire_3_today : R.string.stickers_bonus_catalog_points_expire_2_today, w(l2));
            }
            return G(context, context.getString(R.string.stickers_bonus_catalog_points_expire_today, w(l2)), num.intValue(), z);
        }
        if (obj.equals(kn4Var)) {
            if (num == null) {
                return context.getString(z ? R.string.stickers_bonus_catalog_points_expire_3_tomorrow : R.string.stickers_bonus_catalog_points_expire_2_tomorrow, w(l2));
            }
            return G(context, context.getString(R.string.stickers_bonus_catalog_points_expire_tomorrow, w(l2)), num.intValue(), z);
        }
        if (!(obj instanceof a2l)) {
            throw new NoWhenBranchMatchedException();
        }
        if (num == null) {
            return enj.f(z ? R.plurals.stickers_bonus_catalog_points_expire_3 : R.plurals.stickers_bonus_catalog_points_expire_2, ((a2l) obj).a, context);
        }
        return G(context, enj.f(R.plurals.stickers_bonus_catalog_points_expire_days, ((a2l) obj).a, context), num.intValue(), z);
    }

    public static final boolean u(w2w w2wVar) {
        if (!BuildInfo.s() && !BuildInfo.t()) {
            return false;
        }
        if (BuildInfo.h()) {
            w2wVar.getExperiments().getClass();
        }
        return !k9q0.p(w2wVar);
    }

    public static t89 v(Throwable th) {
        Pair pair;
        Pair pair2;
        Integer valueOf = Integer.valueOf(R.string.voip_error_common);
        Integer valueOf2 = Integer.valueOf(R.string.voip_error_request_new_link);
        if (th instanceof VKApiExecutionException) {
            int s = ((VKApiExecutionException) th).s();
            if (s != 951) {
                if (s == 954) {
                    pair2 = new Pair(Integer.valueOf(R.string.voip_error_incorrect_link_title), valueOf2);
                } else if (s != 961) {
                    pair = new Pair(valueOf, Integer.valueOf(zk70.a(th).h()));
                } else {
                    pair2 = new Pair(Integer.valueOf(R.string.voip_error_call_annon_link_outdated), valueOf2);
                }
                pair = pair2;
            } else {
                pair = new Pair(Integer.valueOf(R.string.voip_call_invite_dialog_error_title), Integer.valueOf(R.string.voip_error_call_has_been_finished));
            }
        } else {
            pair = new Pair(valueOf, Integer.valueOf(zk70.a(th).h()));
        }
        return new t89(((Number) pair.d()).intValue(), ((Number) pair.g()).intValue());
    }

    public static final String w(Long l2) {
        if (l2 == null) {
            return "";
        }
        Calendar d2 = pvo0.d();
        d2.setTimeInMillis(l2.longValue());
        return String.format(Locale.ENGLISH, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(d2.get(11)), Integer.valueOf(d2.get(12))}, 2));
    }

    public static final String x(ww8 ww8Var) {
        try {
            if (ww8Var instanceof d440) {
                throw null;
            }
            return J(ww8Var);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final ArrayList y(ww8 ww8Var) {
        try {
            if (ww8Var instanceof d440) {
                throw null;
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(ww8Var.b() ? ww8Var.a() : J(ww8Var));
            return arrayList;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final io.reactivex.rxjava3.internal.operators.observable.b0 z(mm50 mm50Var) {
        io.reactivex.rxjava3.subjects.d O0 = io.reactivex.rxjava3.subjects.d.O0(mm50Var.getCurrentState());
        return O0.C(new h53(mm50Var.G(new tw4(1, O0, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 13)), 5));
    }

    @Override // xsna.bpv
    public List a(List list) {
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) it.next();
            arrayList.add(PeerConnection.IceServer.builder(iceServer.urls).setUsername(iceServer.username).setHostname(iceServer.hostname).setTlsAlpnProtocols(iceServer.tlsAlpnProtocols).setTlsCertPolicy(iceServer.tlsCertPolicy).setTlsEllipticCurves(iceServer.tlsEllipticCurves).setPassword("broken password").createIceServer());
        }
        return arrayList;
    }

    @Override // xsna.l5t
    public LinearLayout b(Context context, p3h p3hVar, nwk nwkVar, cws cwsVar) {
        LinearLayout a = io.reactivex.rxjava3.internal.operators.observable.q1.a(0, context);
        bwt0.i0(LayoutInflater.from(context).inflate(R.layout.picker_clips_toolbar, a).findViewById(R.id.clips_entry_point_toolbar_close_button), new sz(p3hVar, 22));
        return a;
    }

    @Override // xsna.l5t
    public CustomSpinner d(Context context, LinearLayout linearLayout) {
        CustomSpinner customSpinner = (CustomSpinner) linearLayout.findViewById(R.id.clips_entry_point_toolbar_spinner);
        h(customSpinner);
        return customSpinner;
    }

    @Override // xsna.ll8
    public Rect e(MsgBubblePart msgBubblePart) {
        return ml8.z;
    }

    public boolean equals(Object obj) {
        switch (this.b) {
            case 0:
                if (this == obj) {
                    return true;
                }
                return d370.class.equals(obj != null ? obj.getClass() : null);
            default:
                return super.equals(obj);
        }
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        Bitmap bitmap;
        zhk zhkVar = (zhk) g5pVar;
        if (ota0Var == null) {
            return null;
        }
        if (!zhkVar.I()) {
            if (zhkVar instanceof cc0) {
                cc0 cc0Var = (cc0) zhkVar;
                ld7 ld7Var = ota0Var instanceof ld7 ? (ld7) ota0Var : null;
                if (ld7Var != null && (bitmap = ld7Var.a) != null) {
                    float[] fArr = zek.a;
                    cfk cfkVar = cc0Var.b;
                    tnt tntVar = cc0Var.a;
                    zek.b(cfkVar, tntVar);
                    zek.a(bitmap.getWidth(), bitmap.getHeight());
                    boolean z = tntVar.c;
                    Matrix matrix = zek.g;
                    matrix.reset();
                    float[] fArr2 = zek.d;
                    matrix.setPolyToPoly(fArr2, 0, zek.e, 0, 4);
                    int o = (int) edi.o(fArr2);
                    int n = (int) edi.n(fArr2);
                    if (o > 0 && n > 0) {
                        Bitmap b = n3p.b(o, n);
                        matrix.preScale(z ? -1.0f : 1.0f, 1.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                        new Canvas(b).drawBitmap(bitmap, matrix, null);
                        bitmap = b;
                    }
                    return new ld7(bitmap);
                }
            } else if (!(zhkVar instanceof pfp)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return ota0Var;
    }

    @Override // xsna.e4q
    public k6o g() {
        return atv0.d;
    }

    @Override // xsna.l5t
    public void h(CustomSpinner customSpinner) {
        customSpinner.setPopupBackgroundResource(R.drawable.story_picker_toolbar_spinner_popup_background);
        customSpinner.setBackgroundDrawable(null);
        bwt0.S(customSpinner, new yad(customSpinner, 6));
        customSpinner.setUseMaxWidthLogic(false);
    }

    public int hashCode() {
        switch (this.b) {
            case 0:
                return d370.class.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // xsna.ll8
    public Rect i(MsgBubblePart msgBubblePart) {
        return new Rect();
    }

    @Override // xsna.ll8
    public Rect j(MsgBubblePart msgBubblePart) {
        return ml8.z;
    }

    @Override // xsna.e4q
    public h300 m() {
        return atv0.d;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "NoOpBubblePaddingProvider";
            default:
                return super.toString();
        }
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzH());
    }

    @Override // xsna.l5t
    public void c(LinearLayout linearLayout) {
    }
}
