package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderOverlayImageDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.component.modal.SheetValue;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.fave.entities.FaveType;
import com.vk.feed.core.models.OverlayImage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONObject;
import xsna.kg10;

/* compiled from: AnimatorSetCompat.java */
/* loaded from: classes13.dex */
public final class nr2 implements l9t0, q701, gn60, pc00, yg10, ouf0 {
    public static final jai b = new jai(-1093471326, new gbi(0), false);
    public static final jai c = new jai(759990090, new uii(), false);
    public static final nr2 d = new nr2();
    public static final /* synthetic */ nr2 e = new nr2();
    public static final /* synthetic */ nr2 f = new nr2();

    public nr2() {
        new bpn0(new com.vk.movika.sdk.base.ui.g0(27));
        new bpn0(new iy2(26));
        new bpn0(new com.vk.movika.sdk.base.logic.interactor.g(23));
        new bpn0(new qc00(0));
        new bpn0(new com.vk.movika.sdk.base.ui.o0(24));
        new bpn0(new lk(24));
        new bpn0(new com.vk.movika.sdk.base.logic.interactor.l(24));
    }

    public static final Integer B(MapBuilder mapBuilder, String str) {
        String str2 = (String) mapBuilder.get(str);
        if (str2 == null) {
            return null;
        }
        Integer m = arm0.m(10, str2);
        if (m != null) {
            return m;
        }
        Float l = arm0.l(str2);
        if (l != null) {
            return Integer.valueOf((int) l.floatValue());
        }
        return null;
    }

    public static final boolean C(KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 82 && keyEvent.getAction() == 1;
    }

    public static OverlayImage D(NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto, Map map) {
        Image a;
        List<PhotosPhotoSizesDto> g;
        NewsfeedNewsfeedItemHeaderImageDto e2 = newsfeedNewsfeedItemHeaderOverlayImageDto.e();
        UserId i = e2 != null ? e2.i() : null;
        Owner owner = (i == null || map == null) ? null : (Owner) map.get(i);
        if (owner == null || (a = owner.g) == null) {
            NewsfeedNewsfeedItemHeaderImageDto e3 = newsfeedNewsfeedItemHeaderOverlayImageDto.e();
            a = (e3 == null || (g = e3.g()) == null) ? null : elg.a(g);
        }
        NewsfeedNewsfeedItemHeaderImageDto e4 = newsfeedNewsfeedItemHeaderOverlayImageDto.e();
        String e5 = e4 != null ? e4.e() : null;
        NewsfeedNewsfeedItemHeaderImageDto e6 = newsfeedNewsfeedItemHeaderOverlayImageDto.e();
        String f2 = e6 != null ? e6.f() : null;
        NewsfeedNewsfeedItemHeaderActionDto d2 = newsfeedNewsfeedItemHeaderOverlayImageDto.d();
        return new OverlayImage(a, e5, f2, d2 != null ? ju60.a(d2, map) : null);
    }

    public static void E(@NonNull AnimatorSet animatorSet, @NonNull ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final twn F(boolean z, rek0 rek0Var, hwv hwvVar, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1981463823, 0, -1, "com.vk.donut.design.compose.banner.utils.rememberBackgroundPainterWithOverflowImage (BackgroundPainterWithOverflowImage.kt:19)");
        }
        boolean l = aVar.l(z) | aVar.J(rek0Var) | aVar.J(hwvVar);
        Object x = aVar.x();
        if (l || x == a.C0011a.a) {
            x = z ? new twn(rek0Var, hwvVar.a, hwvVar.c, hwvVar.d) : new twn(rek0Var, hwvVar.b, hwvVar.c, hwvVar.d);
            aVar.R(x);
        }
        twn twnVar = (twn) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return twnVar;
    }

    public static final fdj0 G(int i, int i2, androidx.compose.runtime.a aVar, izs izsVar) {
        boolean z = (i2 & 1) == 0;
        if ((i2 & 2) != 0) {
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new t6c0(6);
                aVar.R(x);
            }
            izsVar = (izs) x;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1965645225, i, -1, "com.vk.core.compose.component.modal.rememberModalBottomSheetState (SheetState.kt:424)");
        }
        fdj0 I = I(z, izsVar, SheetValue.Hidden, aVar, (i & 112) | (i & 14) | 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return I;
    }

    public static final fdj0 H(Mode mode, androidx.compose.runtime.a aVar, int i) {
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new t6c0(6);
            aVar.R(x);
        }
        izs izsVar = (izs) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1982889756, i, -1, "com.vk.core.compose.component.modal.rememberModalBottomSheetState (SheetState.kt:430)");
        }
        fdj0 I = I(mode != Mode.DynamicHeight, izsVar, SheetValue.Hidden, aVar, (i & 112) | 384);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return I;
    }

    public static final fdj0 I(final boolean z, final izs izsVar, final SheetValue sheetValue, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2003864869, i, -1, "com.vk.core.compose.component.modal.rememberSheetState (SheetState.kt:391)");
        }
        final azl azlVar = (azl) aVar.r(uvi.h);
        Object[] objArr = {Boolean.valueOf(z), izsVar};
        fh9 fh9Var = new fh9(new r1d(8), new l1r(z, azlVar, izsVar));
        boolean z2 = true;
        boolean J = ((((i & 14) ^ 6) > 4 && aVar.l(z)) || (i & 6) == 4) | aVar.J(azlVar) | ((((i & 896) ^ 384) > 256 && aVar.o(sheetValue.ordinal())) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && aVar.J(izsVar)) || (i & 48) == 32);
        if ((((i & 7168) ^ 3072) <= 2048 || !aVar.l(false)) && (i & 3072) != 2048) {
            z2 = false;
        }
        boolean z3 = J | z2;
        Object x = aVar.x();
        if (z3 || x == a.C0011a.a) {
            x = new gzs() { // from class: xsna.hdj0
                @Override // xsna.gzs
                public final Object invoke() {
                    return new fdj0(z, azlVar, sheetValue, izsVar);
                }
            };
            aVar.R(x);
        }
        fdj0 fdj0Var = (fdj0) crx0.D(objArr, fh9Var, (gzs) x, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return fdj0Var;
    }

    public static final void J(WebView webView, String str) {
        try {
            webView.evaluateJavascript(str, null);
        } catch (Exception unused) {
            webView.loadUrl("javascript:".concat(str));
        }
    }

    public static final void K(WebView webView, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("detail", jSONObject);
        webView.post(new w63(10, webView, "window.dispatchEvent(new CustomEvent('VKWebAppEvent', " + jSONObject2 + "));"));
    }

    public static final void L(Throwable th, Throwable th2) {
        Throwable th3;
        if (th2 == null) {
            return;
        }
        Throwable th4 = th;
        while (true) {
            th3 = null;
            if (th.getCause() == null || th.getCause() == th4) {
                break;
            } else {
                th4 = th4 != null ? th4.getCause() : null;
            }
        }
        if (th4 != null) {
            try {
                th3 = th4.getCause();
            } catch (IllegalStateException unused) {
                return;
            }
        }
        if (th3 != null || th4 == null) {
            return;
        }
        th4.initCause(th2);
    }

    public static final izg0 M(gzs gzsVar) {
        return new izg0(new gbk0(null, gzsVar, null));
    }

    public static final List N(String str) {
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6);
            }
        }
        return EmptyList.b;
    }

    public static List O(int i, unq unqVar) {
        int a0;
        String str;
        String str2;
        boolean z;
        boolean z2;
        String str3;
        int i2;
        FaveType faveType = unqVar.a;
        FaveTag faveTag = unqVar.b;
        boolean z3 = unqVar.c;
        boolean z4 = faveTag != null;
        if (faveType != null) {
            FaveType faveType2 = FaveType.PRODUCT;
            boolean z5 = faveType == faveType2;
            Integer valueOf = (faveType == faveType2 && z5) ? Integer.valueOf(R.string.fave_empty_product_grid_title) : null;
            if (valueOf == null || (str3 = y8g0.e(valueOf.intValue())) == null) {
                str3 = "";
            }
            switch (rrq.$EnumSwitchMapping$0[faveType.ordinal()]) {
                case -1:
                    i2 = R.string.fave_empty_common_category;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    i2 = R.string.fave_empty_post;
                    break;
                case 2:
                    i2 = R.string.fave_empty_article;
                    break;
                case 3:
                    i2 = R.string.fave_empty_link;
                    break;
                case 4:
                    i2 = R.string.fave_empty_podcast;
                    break;
                case 5:
                    i2 = R.string.fave_empty_video;
                    break;
                case 6:
                    i2 = R.string.fave_empty_clip;
                    break;
                case 7:
                    if (!z5) {
                        i2 = R.string.fave_empty_products_and_services;
                        break;
                    } else {
                        i2 = R.string.fave_empty_products_and_services_grid;
                        break;
                    }
                case 8:
                    i2 = R.string.fave_empty_narrative;
                    break;
            }
            String e2 = y8g0.e(i2);
            a0 = dhr0.a0(R.attr.actionBarSize);
            if (z5) {
                z4 = false;
            }
            r7 = z5 ? y8g0.e(R.string.fave_empty_product_grid_button) : null;
            str = str3;
            str2 = e2;
            z2 = z5;
            z = false;
        } else {
            String e3 = (!z4 && z3) ? y8g0.e(R.string.fave_empty_title) : null;
            String f2 = z4 ? y8g0.f(R.string.fave_empty_tag_common_category, faveTag.c) : y8g0.e(R.string.fave_empty_description);
            a0 = (z3 ? dhr0.a0(R.attr.actionBarSize) + y8g0.a(R.dimen.fave_divider_margin_top) : dhr0.a0(R.attr.actionBarSize) + y8g0.a(R.dimen.fave_divider_margin_top) + y8g0.a(R.dimen.fave_page_header_min_height)) + iah0.a(48);
            str = e3;
            str2 = f2;
            z = true;
            z2 = false;
        }
        return Collections.singletonList(new wnq(a0, str, !(str == null || str.length() == 0), str2, z4, r7, z2, z, i));
    }

    public static final UserId Q(MapBuilder mapBuilder, String str) {
        Long n;
        String str2 = (String) mapBuilder.get(str);
        if (str2 == null || (n = arm0.n(str2)) == null) {
            return null;
        }
        long longValue = n.longValue();
        gzs<s3q0> gzsVar = fkq0.a;
        return new UserId(longValue);
    }

    public static final boolean j(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (epx.g(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"JavascriptInterface"})
    public static final void k(WebView webView, cir0 cir0Var, c3y c3yVar) {
        webView.addJavascriptInterface(c3yVar, "AndroidBridge");
        webView.setWebViewClient(cir0Var);
        c3yVar.b = cir0Var.b.a;
    }

    @SuppressLint({"JavascriptInterface"})
    public static final void l(WebView webView, dir0 dir0Var) {
        n(webView, dir0Var);
    }

    public static /* synthetic */ void n(WebView webView, cir0 cir0Var) {
        k(webView, cir0Var, new c3y());
    }

    public static final Boolean o(MapBuilder mapBuilder, String str) {
        if (!mapBuilder.containsKey(str)) {
            return null;
        }
        String str2 = (String) mapBuilder.get(str);
        if (str2 == null) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(str2.equals("1") || str2.equalsIgnoreCase("true"));
    }

    public static void p(@NonNull String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    public static void q(@Nullable Object obj) {
        r(obj, "Argument must not be null");
    }

    @NonNull
    public static void r(@Nullable Object obj, @NonNull String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final wh50 s(ksr ksrVar, Object obj, kotlin.coroutines.d dVar, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            dVar = EmptyCoroutineContext.b;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:69)");
        }
        boolean y = aVar.y(dVar) | aVar.y(ksrVar);
        Object x = aVar.x();
        Object obj2 = a.C0011a.a;
        if (y || x == obj2) {
            x = new fbk0(dVar, ksrVar, null);
            aVar.R(x);
        }
        wzs wzsVar = (wzs) x;
        int i3 = (i & 896) | ((i >> 3) & 14);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1703169085, i3, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object x2 = aVar.x();
        if (x2 == obj2) {
            x2 = androidx.compose.runtime.k.b(obj);
            aVar.R(x2);
        }
        wh50 wh50Var = (wh50) x2;
        boolean y2 = aVar.y(wzsVar);
        Object x3 = aVar.x();
        if (y2 || x3 == obj2) {
            x3 = new ebk0(wzsVar, wh50Var, null);
            aVar.R(x3);
        }
        bap.f(ksrVar, dVar, (wzs) x3, aVar, (i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final wh50 u(ttk0 ttk0Var, androidx.compose.runtime.a aVar) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1439883919, 0, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:53)");
        }
        wh50 s = s(ttk0Var, ttk0Var.getValue(), emptyCoroutineContext, aVar, 0, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return s;
    }

    public static final io.reactivex.rxjava3.internal.operators.single.v v(final AudienceResearchSurfaceCode audienceResearchSurfaceCode, final List list, final db4 db4Var) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.fb4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(db4Var.a((String) it.next()).b(audienceResearchSurfaceCode).build());
                }
                return arrayList;
            }
        });
    }

    @Nullable
    public static ImageSize y(int i, @Nullable List list) {
        ImageSize imageSize = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (ImageSize) list.get(0);
        }
        int size = list.size();
        ImageSize imageSize2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            ImageSize imageSize3 = (ImageSize) list.get(i2);
            int i3 = imageSize3.d.b;
            if (i3 > i) {
                if (imageSize == null || i3 < imageSize.d.b) {
                    imageSize = imageSize3;
                }
            } else if (imageSize2 == null || i3 > imageSize2.d.b) {
                imageSize2 = imageSize3;
            }
        }
        return imageSize != null ? imageSize : imageSize2;
    }

    public static Long z(NewsEntry newsEntry) {
        VideoFile videoFile;
        if (newsEntry instanceof Post) {
            return Long.valueOf(((Post) newsEntry).n);
        }
        if (newsEntry instanceof PromoPost) {
            return Long.valueOf(((PromoPost) newsEntry).n.n);
        }
        if (newsEntry instanceof Photos) {
            return Long.valueOf(((Photos) newsEntry).m);
        }
        if (!(newsEntry instanceof Videos)) {
            return null;
        }
        VideoAttachment Nb = ((Videos) newsEntry).Nb();
        return Long.valueOf((Nb == null || (videoFile = Nb.k) == null) ? 0L : videoFile.o0());
    }

    @Override // xsna.l9t0
    public int A() {
        return R.layout.vk_video_profile_catalog_tab_skeleton_tablet;
    }

    public List P(MyTargetNativeAdEntry myTargetNativeAdEntry) {
        wjz0 content;
        l0n d2;
        gjx gjxVar = myTargetNativeAdEntry.B;
        return (gjxVar == null || (content = gjxVar.getContent()) == null || (d2 = content.d()) == null) ? EmptyList.b : Collections.singletonList(new cr50(myTargetNativeAdEntry, d2.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        ms01 ms01Var = (ms01) obj;
        o100 o100Var = a401.w;
        nwz0 nwz0Var = (nwz0) ms01Var.getService();
        ApiMetadata zza = zzff.zza(ms01Var.getContext());
        Parcel zza2 = nwz0Var.zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        nwz0Var.zzd(1, zza2);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // xsna.yg10
    public void c() {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.h0().h.e.onNext(kg10.b.a.a);
    }

    @Override // xsna.l9t0
    public int d() {
        return R.layout.vk_video_profile_catalog_item_skeleton_tablet;
    }

    @Override // xsna.l9t0
    public boolean e() {
        return true;
    }

    @Override // xsna.l9t0
    public int f() {
        return R.layout.vk_video_profile_header_new_skeleton_v2_tablet;
    }

    @Override // xsna.l9t0
    public int g() {
        return R.layout.vk_video_profile_header_new_v2_tablet;
    }

    @Override // xsna.yg10
    public void i(int i, Mask mask) {
        com.vk.voip.ui.c.b.getClass();
        com.vk.voip.ui.c.h0().h.e.onNext(new kg10.b.C3179b(mask));
    }

    @Override // xsna.l9t0
    public int m() {
        return R.layout.vk_video_profile_fragment_new_v2_tablet;
    }

    @Override // xsna.l9t0
    public int t() {
        return R.layout.vk_video_profile_fragment_new_appbar_v2_tablet;
    }

    @Override // xsna.l9t0
    public int w() {
        return R.layout.vk_video_profile_catalog_skeleton_tablet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return P((MyTargetNativeAdEntry) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Integer.valueOf((int) zznn.zzB());
    }

    @Override // xsna.yg10
    public void flush() {
    }

    @Override // xsna.yg10
    public void a(Mask mask) {
    }

    @Override // xsna.yg10
    public void b(Mask mask) {
    }

    @Override // xsna.yg10
    public void h(Mask mask) {
    }
}
