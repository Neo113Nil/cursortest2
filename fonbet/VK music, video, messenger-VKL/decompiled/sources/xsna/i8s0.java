package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;

/* compiled from: VideoCardScreenContent.kt */
/* loaded from: classes18.dex */
public final class i8s0 implements yah0 {

    /* compiled from: VideoCardScreenContent.kt */
    public interface a {

        /* compiled from: VideoCardScreenContent.kt */
        /* renamed from: xsna.i8s0$a$a, reason: collision with other inner class name */
        public static final class C3039a implements a {
            public final VideoCardViewState a;

            public C3039a(VideoCardViewState videoCardViewState) {
                this.a = videoCardViewState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3039a) && epx.f(this.a, ((C3039a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Card(card=" + this.a + ')';
            }
        }

        /* compiled from: VideoCardScreenContent.kt */
        public static final class b implements a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Head(text="), this.a, ')');
            }
        }

        /* compiled from: VideoCardScreenContent.kt */
        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Subhead(text="), this.a, ')');
            }
        }
    }

    public static PreviewViewState.DurationBadge d() {
        return new PreviewViewState.DurationBadge(new mno0.i("22:34"), false, null, 6);
    }

    public static PlaceholderViewState e() {
        return new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_users_outline_28), new mno0.i("Только для подписчиков"), null, null, null, 28);
    }

    public static PlaceholderViewState f() {
        return new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_hide_outline_24), new mno0.i("Возможно, это неприятный контент"), null, null, null, 28);
    }

    public static VideoCardViewState.c g() {
        return new VideoCardViewState.c("https://sun9-67.userapi.com/s/v1/ig2/bcTDi8CsBgqeT6nxTPRVQVwYh7TfWAoDYhaWx8IJIR1uSixIBwKEG61c68HXyOBMs_-gnFA_zTRz0bRdj8qe7Vcb.jpg?quality=95&crop=0,0,1280,1280&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080,1280x1280&ava=1&u=o2zz14OYgEKwsgo6T4jjUw70LnRkzM3wE9VVg8N8naQ&cs=100x100", new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2), new VideoMetaViewState.a(null, null, new mno0.i("VK Видео"), true, new mno0.i("398 тыс просмотров"), new mno0.i("10 месяцев назад"), null, 0, 195), 4), new rmw.d(R.drawable.vk_icon_more_vertical_24), new mno0.g(R.string.accessibility_actions));
    }

    public static VideoCardViewState.c h(boolean z) {
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2);
        VideoMetaViewState.a aVar = new VideoMetaViewState.a(null, null, new mno0.i("VK Видео"), true, null, null, null, 0, 243);
        VideoMetaViewState.DownloadStatus downloadStatus = VideoMetaViewState.DownloadStatus.Downloading;
        if (!z) {
            downloadStatus = null;
        }
        return new VideoCardViewState.c(null, new VideoMetaViewState(iVar, aVar, downloadStatus), new rmw.d(R.drawable.vk_icon_more_vertical_24), new mno0.g(R.string.accessibility_actions));
    }

    public static VideoCardViewState.c i() {
        return new VideoCardViewState.c(null, new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2), new VideoMetaViewState.a(null, null, null, false, null, new mno0.i("10 месяцев назад"), null, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), 4), new rmw.d(R.drawable.vk_icon_more_vertical_24), new mno0.g(R.string.accessibility_actions));
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(993608013);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(993608013, i2, -1, "com.vk.design.demo.presentation.screens.VideoCardScreenContent.Content (VideoCardScreenContent.kt:45)");
            }
            q630 d = txj0.d(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jjn0.a("Video Card", gzsVar3, x5Var, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
            djn0.a(true, false, M, 438, 0);
            q630 f = txj0.f(q9g.a(aVar2, 1.0f), 1.0f);
            float f2 = 16;
            u890 u890Var = new u890(f2, f2, f2, f2);
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            boolean z = (458752 & i2) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new c4q0(this, 2);
                M.R(x);
            }
            lqy.a(f, null, u890Var, g, null, null, false, null, (izs) x, M, 24960, 490);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vcv(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1183808129);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1183808129, i2, -1, "com.vk.design.demo.presentation.screens.VideoCardScreenContent.InteractiveVideoCard (VideoCardScreenContent.kt:124)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(0L);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(new VideoCardViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), false, d(), null, null, new PreviewViewState.a(PreviewViewState.a.C1224a.a(R.drawable.vk_icon_clock_24, null), PreviewViewState.a.C1224a.a(R.drawable.vk_icon_subtitles_slash_24, new mno0.g(R.string.subtitles_on_content_description)), PreviewViewState.a.C1224a.a(R.drawable.vk_icon_mute_24, new mno0.g(R.string.video_accessibility_sound_on))), null, null, null, new PreviewViewState.w(new TimelineViewState(wh50Var, androidx.compose.runtime.k.b(50L), new TimelineViewState.c(e43.l(new TimelineViewState.c.a(0L, 10L, "Interval 0-10"), new TimelineViewState.c.a(10L, 25L, "Interval 10-25"), new TimelineViewState.c.a(25L, 50L, "Interval 25-50"), new TimelineViewState.c.a(50L, 100L, "Interval 50-100"))), 248)), null, 1496), g()));
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            TimelineViewState b = ((VideoCardViewState) wh50Var2.getValue()).a.b();
            dai.d<Long> a2 = b != null ? b.a() : null;
            if (a2 == null) {
                M.K(-849411516);
            } else {
                M.K(526788957);
                Object x3 = M.x();
                if (x3 == c0012a) {
                    x3 = new lhh0(1, wh50Var);
                    M.R(x3);
                }
                a2.c((izs) x3, M, 6);
            }
            M.j();
            com.vk.libvideo.design.compose.video.videocard.a.d((VideoCardViewState) wh50Var2.getValue(), null, M, 0, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vg3(this, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(a aVar, jai jaiVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(1785529374);
        int i2 = i | (M.J(aVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1785529374, i2, -1, "com.vk.design.demo.presentation.screens.VideoCardScreenContent.Item (VideoCardScreenContent.kt:96)");
            }
            boolean z = aVar instanceof a.b;
            q630.a aVar4 = q630.a.a;
            if (z) {
                M.K(-464196852);
                String str = ((a.b) aVar).a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().m;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                yqv0.c(str, s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.l1, M, 48, 0, 8184);
                aVar3 = M;
                aVar3.j();
            } else {
                aVar3 = M;
                if (aVar instanceof a.c) {
                    aVar3.K(-463883411);
                    String str2 = ((a.c) aVar).a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var2.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var2 = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, s200.F(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), j2, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.d0, aVar3, 48, 0, 8184);
                    aVar3.j();
                } else {
                    if (!(aVar instanceof a.C3039a)) {
                        throw alb0.c(-2093185020, aVar3);
                    }
                    aVar3.K(-463579735);
                    jaiVar.invoke(aVar, aVar3, 48);
                    com.vk.libvideo.design.compose.video.videocard.a.d(((a.C3039a) aVar).a, null, aVar3, 0, 2);
                    aVar3.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new t3g(i, 4, this, aVar, jaiVar);
        }
    }
}
