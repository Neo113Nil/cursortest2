package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import com.vk.core.ui.themes.VKTheme;
import com.vungle.ads.internal.protos.Sdk;
import xsna.dhr0;

/* compiled from: VkMapUtils.kt */
/* loaded from: classes18.dex */
public final class j3v0 {

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ Lifecycle a;
        public final /* synthetic */ i3v0 b;

        public a(Lifecycle lifecycle, i3v0 i3v0Var) {
            this.a = lifecycle;
            this.b = i3v0Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.removeObserver(this.b);
        }
    }

    /* compiled from: VkMapUtils.kt */
    public static final class b implements dhr0.e {
        public final /* synthetic */ qow<oj00> b;

        public b(qow<oj00> qowVar) {
            this.b = qowVar;
        }

        @Override // xsna.dhr0.e
        public final void sb(VKTheme vKTheme) {
            oj00 oj00Var;
            qow<oj00> qowVar = this.b;
            if (qowVar == null || (oj00Var = qowVar.a) == null) {
                return;
            }
            dhr0.a.getClass();
            oj00Var.f(dhr0.I());
        }
    }

    /* compiled from: Effects.kt */
    public static final class c implements kgn {
        public final /* synthetic */ b a;

        public c(b bVar) {
            this.a = bVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            dhr0.a.getClass();
            dhr0.X(this.a);
        }
    }

    /* compiled from: VkMapUtils.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(Lifecycle lifecycle, Object obj, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(519592488);
        int i2 = (M.y(lifecycle) ? 4 : 2) | i | (M.J(obj) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(519592488, i2, -1, "com.vk.ecomm.cart.impl.common.ui.compose.map.ObserveLifecycle (VkMapUtils.kt:62)");
            }
            qow qowVar = new qow(obj);
            boolean y = M.y(lifecycle) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new uwi0(6, lifecycle, obj);
                M.R(x);
            }
            bap.b(lifecycle, qowVar, (izs) x, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yb1(lifecycle, obj, i, 14);
        }
    }

    public static final void b(qow<oj00> qowVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1132746375);
        int i2 = (M.J(qowVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1132746375, i2, -1, "com.vk.ecomm.cart.impl.common.ui.compose.map.ObserveTheme (VkMapUtils.kt:90)");
            }
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new qjl0(qowVar, 18);
                M.R(x);
            }
            bap.c(qowVar, (izs) x, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wa5(qowVar, i, 15);
        }
    }

    public static final jm00 c(Context context) {
        vj00 vj00Var = ofx.a;
        if (vj00Var == null) {
            vj00Var = null;
        }
        return vj00Var.d(context, new xl00(1055, false, true, true, true));
    }
}
