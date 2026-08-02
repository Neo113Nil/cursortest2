package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes11.dex */
public final class yoi {
    public static final jai a = new jai(-1759434350, a.i, false);

    /* compiled from: Wrapper.android.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1759434350, intValue, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda$-1759434350.<anonymous> (Wrapper.android.kt:103)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }
}
