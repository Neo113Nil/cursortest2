package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vkontakte.android.R;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;

/* compiled from: VideoCellScreenContent.kt */
/* loaded from: classes18.dex */
public final class vas0 implements yah0 {

    /* compiled from: VideoCellScreenContent.kt */
    public interface a {

        /* compiled from: VideoCellScreenContent.kt */
        /* renamed from: xsna.vas0$a$a, reason: collision with other inner class name */
        public static final class C3879a implements a {
            public final VideoCellViewState a;

            public C3879a(VideoCellViewState videoCellViewState) {
                this.a = videoCellViewState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3879a) && epx.f(this.a, ((C3879a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Card(card=" + this.a + ')';
            }
        }

        /* compiled from: VideoCellScreenContent.kt */
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

        /* compiled from: VideoCellScreenContent.kt */
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

    public static PreviewViewState.DurationBadge c() {
        return new PreviewViewState.DurationBadge(new mno0.i("22:34"), false, null, 6);
    }

    public static VideoCellViewState.g d() {
        return new VideoCellViewState.g(new VideoMetaViewState(new VideoMetaViewState.b(new mno0.i("Истории заканчиваются, а музыка остаётся — в плейлисте, рингтоне — и напоминает, как мало на свете мелодий, которые звучат не вокруг, а внутри...")), (VideoMetaViewState.g) null, 6));
    }

    public static VideoCellViewState.g e() {
        return new VideoCellViewState.g(new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2), new VideoMetaViewState.a(null, null, new mno0.i("VK Видео"), true, new mno0.i("398 тыс просмотров"), new mno0.i("10 месяцев назад"), null, 0, 195), 4));
    }

    public static VideoCellViewState.c f() {
        return new VideoCellViewState.c(new rmw.d(R.drawable.vk_icon_more_vertical_24));
    }

    public static VideoCellViewState.g g(vas0 vas0Var, int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        boolean z4 = (i & 8) != 0;
        boolean z5 = (i & 16) == 0;
        vas0Var.getClass();
        return new VideoCellViewState.g(new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2), new VideoMetaViewState.a(null, z ? "https://sun9-67.userapi.com/s/v1/ig2/bcTDi8CsBgqeT6nxTPRVQVwYh7TfWAoDYhaWx8IJIR1uSixIBwKEG61c68HXyOBMs_-gnFA_zTRz0bRdj8qe7Vcb.jpg?quality=95&crop=0,0,1280,1280&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080,1280x1280&ava=1&u=o2zz14OYgEKwsgo6T4jjUw70LnRkzM3wE9VVg8N8naQ&cs=100x100" : null, z2 ? new mno0.i("VK Видео") : null, z2, z3 ? new mno0.i("398 тыс просмотров") : null, z4 ? new mno0.i("10 месяцев назад") : null, z5 ? new VideoMetaViewState.c(new mno0.i("Вам доступно"), "") : null, 2, 1), 4));
    }

    public static VideoCellViewState.g h(boolean z) {
        VideoMetaViewState.i iVar = new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2);
        mno0.i iVar2 = new mno0.i("495,4 МБ");
        VideoMetaViewState.c cVar = new VideoMetaViewState.c(new mno0.i("Вам доступно"), "");
        if (!z) {
            cVar = null;
        }
        return new VideoCellViewState.g(new VideoMetaViewState(iVar, new VideoMetaViewState.d(iVar2, null, cVar, 2), 4));
    }

    public static VideoCellViewState.g i() {
        return new VideoCellViewState.g(new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2), new VideoMetaViewState.e(new mno0.i("2:17")), 4));
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1829344241);
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
                androidx.compose.runtime.b.f(1829344241, i2, -1, "com.vk.design.demo.presentation.screens.VideoCellScreenContent.Content (VideoCellScreenContent.kt:45)");
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
            jjn0.a("Video Cell", gzsVar3, x5Var, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
            djn0.a(true, false, M, 438, 0);
            q630 f = txj0.f(q9g.a(aVar2, 1.0f), 1.0f);
            float f2 = 16;
            u890 u890Var = new u890(f2, f2, f2, f2);
            a.j g = androidx.compose.foundation.layout.a.g(f2);
            boolean z = (458752 & i2) == 131072;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pod0(this, 25);
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
            s.d = new wzs() { // from class: xsna.tas0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vas0.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(final a aVar, boolean z, jai jaiVar, androidx.compose.runtime.a aVar2, final int i, final int i2) {
        boolean z2;
        jai jaiVar2;
        androidx.compose.runtime.a aVar3;
        final boolean z3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar2.M(-2003076634);
        int i3 = i | (M.J(aVar) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                jaiVar2 = jaiVar;
                aVar3 = M;
                aVar3.h();
                z3 = z2;
            } else {
                boolean z4 = i4 != 0 ? false : z2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2003076634, i3, -1, "com.vk.design.demo.presentation.screens.VideoCellScreenContent.Item (VideoCellScreenContent.kt:86)");
                }
                boolean z5 = aVar instanceof a.b;
                q630.a aVar4 = q630.a.a;
                if (z5) {
                    M.K(619824132);
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
                        aVar3.K(620137573);
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
                        if (!(aVar instanceof a.C3879a)) {
                            throw alb0.c(-811290351, aVar3);
                        }
                        aVar3.K(620449340);
                        jaiVar2 = jaiVar;
                        jaiVar2.invoke(aVar, aVar3, 48);
                        if (z4) {
                            aVar3.K(620510131);
                            q630 r = p490.r(aVar4, p490.x(aVar3), 14);
                            a.l lVar = androidx.compose.foundation.layout.a.a;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar3, 0);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c = qri.c(aVar3, r);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, a2, cri.a.f);
                            k9q0.w(aVar3, D, cri.a.e);
                            k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar3, cri.a.h);
                            k9q0.w(aVar3, c, cri.a.d);
                            com.vk.libvideo.design.compose.video.videocell.a.g(((a.C3879a) aVar).a, txj0.v(aVar4, Tensorflow.FRAME_HEIGHT), aVar3, 48, 0);
                            aVar3.G();
                            aVar3.j();
                        } else {
                            aVar3.K(620711228);
                            com.vk.libvideo.design.compose.video.videocell.a.g(((a.C3879a) aVar).a, null, aVar3, 0, 2);
                            aVar3.j();
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        z3 = z4;
                    }
                }
                jaiVar2 = jaiVar;
                if (androidx.compose.runtime.b.d()) {
                }
                z3 = z4;
            }
            s = aVar3.s();
            if (s == null) {
                final jai jaiVar3 = jaiVar2;
                s.d = new wzs() { // from class: xsna.uas0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        vas0.this.b(aVar, z3, jaiVar3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = aVar3.s();
        if (s == null) {
        }
    }
}
