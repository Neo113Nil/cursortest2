package xsna;

import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LifecycleEffect.kt */
/* loaded from: classes12.dex */
public final class o4z {

    /* compiled from: Effects.kt */
    public static final class a implements kgn {
        public final /* synthetic */ f5z a;
        public final /* synthetic */ n4z b;
        public final /* synthetic */ Ref$ObjectRef c;

        public a(f5z f5zVar, n4z n4zVar, Ref$ObjectRef ref$ObjectRef) {
            this.a = f5zVar;
            this.b = n4zVar;
            this.c = ref$ObjectRef;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
            o5z o5zVar = (o5z) this.c.element;
            if (o5zVar != null) {
                o5zVar.a();
            }
        }
    }

    /* compiled from: LifecycleEffect.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final Boolean bool, final Object obj, f5z f5zVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(696924721);
        if ((i & 6) == 0) {
            i2 = (M.y(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                f5zVar = (f5z) M.r(bvz.a);
            } else {
                M.h();
            }
            int i3 = i2 & (-897);
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(696924721, i3, -1, "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:187)");
            }
            boolean J = M.J(bool) | M.J(obj) | M.J(f5zVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new n5z(f5zVar.getLifecycle());
                M.R(x);
            }
            b(f5zVar, (n5z) x, izsVar, M, (i3 >> 3) & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final f5z f5zVar2 = f5zVar;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m4z
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    o4z.a(bool, obj, f5zVar2, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(f5z f5zVar, n5z n5zVar, izs<? super n5z, ? extends o5z> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(228371534);
        if ((i & 6) == 0) {
            i2 = (M.y(f5zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(n5zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(228371534, i2, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:340)");
            }
            boolean y = M.y(n5zVar) | ((i2 & 896) == 256) | M.y(f5zVar);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new isg(f5zVar, n5zVar, izsVar, 3);
                M.R(x);
            }
            bap.b(f5zVar, n5zVar, (izs) x, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new kw9(f5zVar, n5zVar, izsVar, i);
        }
    }
}
