package xsna;

import android.util.Size;
import androidx.compose.runtime.a;
import one.video.player.OneVideoPlayer;
import one.video.transform.TransformController;
import one.video.view.compose.models.RenderType;
import xsna.dt1;
import xsna.q630;

/* compiled from: PlayerSurface.kt */
/* loaded from: classes7.dex */
public final class y4b0 {

    /* compiled from: PlayerSurface.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RenderType.values().length];
            try {
                iArr[RenderType.SURFACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderType.TEXTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(v020 v020Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-783666884);
        int i2 = (M.J(v020Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-783666884, i2, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.playersurface.MediaView (PlayerSurface.kt:102)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new j4x(v020Var, 29);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i3 == 4;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new yhu(v020Var, 19);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z3 = i3 == 4;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new iia0(v020Var, 3);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean J = M.J(izsVar) | M.J(izsVar2) | M.J(gzsVar);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                x4 = new yf1(izsVar, izsVar2, gzsVar, 8);
                M.R(x4);
            }
            izs izsVar3 = (izs) x4;
            int i4 = a.$EnumSwitchMapping$0[v020Var.b.ordinal()];
            if (i4 == 1) {
                M.K(1222922859);
                q630Var2 = q630Var;
                q82.b(0, 6, M, izsVar3, q630Var2, false);
                M.j();
            } else {
                if (i4 != 2) {
                    throw alb0.c(-1484573505, M);
                }
                M.K(-1484564242);
                q82.a(6, M, izsVar3, q630Var, false);
                M.j();
                q630Var2 = q630Var;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wn7(v020Var, q630Var2, i, 12);
        }
    }

    public static final void b(q630 q630Var, final OneVideoPlayer oneVideoPlayer, final RenderType renderType, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(515915129);
        int i2 = i | (M.y(oneVideoPlayer) ? 32 : 16) | 1408;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                renderType = RenderType.SURFACE;
            } else {
                M.h();
            }
            int i3 = i2 & (-7169);
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(515915129, i3, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.playersurface.PlayerSurface (PlayerSurface.kt:38)");
            }
            q630 E = ahn.E(q630Var, "PlayerSurfaceTags.SURFACE");
            dt1.a.getClass();
            ua8.a(E, dt1.a.f, false, kai.c(-1123073437, new yzs() { // from class: xsna.v4b0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1123073437, intValue, -1, "com.vk.video.ui.upload.impl.videoviewer.presentation.compose.playersurface.PlayerSurface.<anonymous> (PlayerSurface.kt:44)");
                        }
                        Object x = aVar2.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = androidx.compose.runtime.d.a(1.0f);
                            aVar2.R(x);
                        }
                        final kg50 kg50Var = (kg50) x;
                        Object x2 = aVar2.x();
                        if (x2 == c0012a) {
                            x2 = androidx.compose.runtime.d.a(1.0f);
                            aVar2.R(x2);
                        }
                        final kg50 kg50Var2 = (kg50) x2;
                        OneVideoPlayer oneVideoPlayer2 = OneVideoPlayer.this;
                        boolean J = aVar2.J(oneVideoPlayer2);
                        Object x3 = aVar2.x();
                        if (J || x3 == c0012a) {
                            x3 = new xjp0() { // from class: xsna.u4b0
                                @Override // xsna.xjp0
                                public final void a(float f, float f2, float f3, float f4) {
                                    kg50.this.g(f);
                                    kg50Var2.g(f2);
                                }
                            };
                            aVar2.R(x3);
                        }
                        xjp0 xjp0Var = (xjp0) x3;
                        boolean n = aVar2.n(va8Var.j()) | aVar2.J(oneVideoPlayer2);
                        Object x4 = aVar2.x();
                        Object obj4 = x4;
                        if (n || x4 == c0012a) {
                            TransformController transformController = new TransformController(xjp0Var);
                            Size size = new Size((int) va8Var.j(), (int) va8Var.g());
                            if (!epx.f(transformController.i, size)) {
                                transformController.i(new Size(size.getWidth(), size.getHeight()));
                                transformController.i = size;
                            }
                            aVar2.R(transformController);
                            obj4 = transformController;
                        }
                        TransformController transformController2 = (TransformController) obj4;
                        if (oneVideoPlayer2 != null) {
                            aVar2.K(315121765);
                            v020 v020Var = new v020(oneVideoPlayer2, renderType);
                            Object x5 = aVar2.x();
                            if (x5 == c0012a) {
                                x5 = new mz80(5, kg50Var, kg50Var2);
                                aVar2.R(x5);
                            }
                            y4b0.a(v020Var, rdu.a(q630.a.a, (izs) x5), aVar2, 48);
                            Float valueOf = Float.valueOf(va8Var.j());
                            boolean y = aVar2.y(transformController2) | aVar2.y(oneVideoPlayer2);
                            Object x6 = aVar2.x();
                            if (y || x6 == c0012a) {
                                x6 = new gb(25, transformController2, oneVideoPlayer2);
                                aVar2.R(x6);
                            }
                            bap.b(oneVideoPlayer2, valueOf, (izs) x6, aVar2, 0);
                        } else {
                            aVar2.K(312619135);
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3120, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        RenderType renderType2 = renderType;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zle(i, 6, q630Var, oneVideoPlayer, renderType2);
        }
    }
}
