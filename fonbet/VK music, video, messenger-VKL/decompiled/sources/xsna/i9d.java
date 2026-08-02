package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import one.video.view.OneVideoPlayerView;
import xsna.q630;

/* compiled from: ClipPlayer.kt */
/* loaded from: classes17.dex */
public final class i9d {

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ f5z a;
        public final /* synthetic */ f9d b;

        public a(f5z f5zVar, f9d f9dVar) {
            this.a = f5zVar;
            this.b = f9dVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
        }
    }

    /* compiled from: ClipPlayer.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(izs<? super lze, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(765365193);
        int i2 = (M.y(izsVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(765365193, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.LifecycleObserver (ClipPlayer.kt:110)");
            }
            f5z f5zVar = (f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean y = M.y(f5zVar) | ((i2 & 14) == 4);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new h1(4, f5zVar, izsVar);
                M.R(x);
            }
            bap.c(f5zVar, (izs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aza((izs) izsVar, i);
        }
    }

    public static final void b(final e3b0 e3b0Var, final mtk0 mtk0Var, final boolean z, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1928747212);
        int i2 = (M.J(e3b0Var) ? 4 : 2) | i | (M.J(mtk0Var) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1928747212, i2, -1, "com.vk.clips.upload.vk.impl.preview.compose.Player (ClipPlayer.kt:46)");
            }
            ua8.a(q630Var, null, false, kai.c(-1146666590, new yzs() { // from class: xsna.g9d
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    e3b0 e3b0Var2;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1146666590, intValue, -1, "com.vk.clips.upload.vk.impl.preview.compose.Player.<anonymous> (ClipPlayer.kt:50)");
                        }
                        azl azlVar = (azl) aVar2.r(uvi.h);
                        Context context = (Context) aVar2.r(AndroidCompositionLocals_androidKt.b);
                        Object x = aVar2.x();
                        izs izsVar2 = izs.this;
                        Object obj5 = a.C0011a.a;
                        if (x == obj5) {
                            x = new o2b0(izsVar2);
                            aVar2.R(x);
                        }
                        o2b0 o2b0Var = (o2b0) x;
                        Object x2 = aVar2.x();
                        if (x2 == obj5) {
                            Object oneVideoPlayerView = new OneVideoPlayerView(context, null, 0, 14, 0);
                            aVar2.R(oneVideoPlayerView);
                            x2 = oneVideoPlayerView;
                        }
                        OneVideoPlayerView oneVideoPlayerView2 = (OneVideoPlayerView) x2;
                        wh50 a2 = s4z.a(((f5z) aVar2.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle(), aVar2);
                        i9d.a(izsVar2, aVar2, 0);
                        boolean z2 = z;
                        Boolean valueOf = Boolean.valueOf(z2);
                        Lifecycle.Event event = (Lifecycle.Event) a2.getValue();
                        boolean l = aVar2.l(z2) | aVar2.J(a2) | aVar2.J(izsVar2);
                        e3b0 e3b0Var3 = e3b0Var;
                        boolean J = l | aVar2.J(e3b0Var3);
                        mtk0 mtk0Var2 = mtk0Var;
                        boolean J2 = J | aVar2.J(mtk0Var2) | aVar2.y(oneVideoPlayerView2);
                        Object x3 = aVar2.x();
                        if (J2 || x3 == obj5) {
                            x3 = new j9d(z2, izsVar2, e3b0Var3, a2, mtk0Var2, oneVideoPlayerView2, null);
                            obj4 = oneVideoPlayerView2;
                            aVar2.R(x3);
                        } else {
                            obj4 = oneVideoPlayerView2;
                        }
                        bap.f(valueOf, event, (wzs) x3, aVar2, 0);
                        s3q0 s3q0Var = s3q0.a;
                        boolean J3 = ((intValue & 14) == 4) | aVar2.J(e3b0Var3) | aVar2.y(context) | aVar2.J(azlVar);
                        Object x4 = aVar2.x();
                        if (J3 || x4 == obj5) {
                            e3b0Var2 = e3b0Var3;
                            Object k9dVar = new k9d(e3b0Var2, context, o2b0Var, azlVar, va8Var, null);
                            aVar2.R(k9dVar);
                            x4 = k9dVar;
                        } else {
                            e3b0Var2 = e3b0Var3;
                        }
                        bap.g(s3q0Var, (wzs) x4, aVar2, 6);
                        boolean y = aVar2.y(obj4) | aVar2.J(e3b0Var2);
                        Object x5 = aVar2.x();
                        if (y || x5 == obj5) {
                            x5 = new v53(6, obj4, e3b0Var2);
                            aVar2.R(x5);
                        }
                        ae2.a(48, 4, aVar2, (izs) x5, null, ahn.E(txj0.B(q630.a.a, null, 3), "Player"));
                        cv10 cv10Var = e3b0Var2.c;
                        boolean J4 = aVar2.J(e3b0Var2) | aVar2.y(obj4);
                        Object x6 = aVar2.x();
                        if (J4 || x6 == obj5) {
                            x6 = new cv1(e3b0Var2, o2b0Var, obj4, 1);
                            aVar2.R(x6);
                        }
                        bap.c(cv10Var, (izs) x6, aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 12) & 14) | 3072, 6);
            q630Var2 = q630Var;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(mtk0Var, z, izsVar, q630Var2, i) { // from class: xsna.h9d
                public final /* synthetic */ mtk0 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    i9d.b(e3b0.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
