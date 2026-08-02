package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.gl.tf.Tensorflow;
import xsna.q630;
import xsna.wkj;

/* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
/* loaded from: classes11.dex */
public final class vol {
    public static final gxb0 a = new gxb0(false, false, 30);

    /* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
    public static final class a implements yzs<l5g, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ uco0 b;

        public a(edo0 edo0Var) {
            this.b = edo0Var;
        }

        @Override // xsna.yzs
        public final s3q0 invoke(l5g l5gVar, androidx.compose.runtime.a aVar, Integer num) {
            long j = l5gVar.a;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= aVar2.p(j) ? 4 : 2;
            }
            if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1930700965, intValue, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
                }
                vol.b(((edo0) this.b).c, j, aVar2, (intValue << 3) & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<vco0> {
        @Override // xsna.gzs
        public final vco0 invoke() {
            return ((wco0) this.receiver).L();
        }
    }

    public static final void a(jdo0 jdo0Var, vco0 vco0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1904307118);
        int i2 = (M.J(jdo0Var) ? 4 : 2) | i | (M.y(vco0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1904307118, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            M.K(-1009482584);
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            M.j();
            boolean y = M.y(vco0Var) | ((i2 & 14) == 4) | M.y(context);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new tol(vco0Var, context, jdo0Var, 0);
                M.R(x);
            }
            bpj.b(null, null, (izs) x, M, 0, 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sy5(jdo0Var, vco0Var, i, 2);
        }
    }

    public static final void b(final int i, final long j, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1240244237, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean J = ((i3 & 14) == 4) | M.J(context);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                M.R(x);
            }
            int intValue = ((Number) x).intValue();
            if (intValue == -1) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new wzs() { // from class: xsna.uol
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            int I = ne7.I(i2 | 1);
                            vol.b(i, j, (androidx.compose.runtime.a) obj, I);
                            return s3q0.a;
                        }
                    };
                    s.d = wzsVar;
                }
                return;
            }
            lg90 a2 = pg90.a(intValue, 0, M);
            boolean z = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                if (j == 16) {
                    x2 = null;
                } else {
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                    }
                    x2 = new oe7(j, 5, porterDuffColorFilter);
                }
                M.R(x2);
            }
            ja8.a(ng90.a(txj0.q(q630.a.a, woj.j), a2, null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (d6g) x2, 22), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs() { // from class: xsna.rol
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    vol.b(i, j, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public static final void c(jdo0 jdo0Var, wco0 wco0Var, gzs<? extends tny> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(jdo0Var) : M.y(jdo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(wco0Var) : M.y(wco0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2040393164, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && M.J(wco0Var));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new ng00(new xe8(new ew3(8, wco0Var, gzsVar)));
                M.R(x);
            }
            ng00 ng00Var = (ng00) x;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && M.y(jdo0Var))) {
                z = true;
            }
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new ncg(jdo0Var, 15);
                M.R(x2);
            }
            nb2.a(ng00Var, (gzs) x2, a, kai.c(1315155414, new cg4(3, wco0Var, jdo0Var), M), M, 3456, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sol(i, 0, jdo0Var, wco0Var, gzsVar);
        }
    }

    public static final void d(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1392105195);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1392105195, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            tt6.a(q630Var, hdo0.a, jaiVar, M, ((i2 << 6) & 7168) | (i2 & 14) | Tensorflow.FRAME_WIDTH);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qol(q630Var, jaiVar, i, 0);
        }
    }
}
