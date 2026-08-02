package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: VectorPainter.kt */
/* loaded from: classes11.dex */
public final class olr0 extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ zzs<Float, Float, androidx.compose.runtime.a, Integer, s3q0> $content;
    final /* synthetic */ long $viewport;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public olr0(jai jaiVar, long j) {
        super(2);
        this.$content = jaiVar;
        this.$viewport = j;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1749374910, intValue, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
            }
            this.$content.invoke(Float.valueOf(Float.intBitsToFloat((int) (this.$viewport >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.$viewport & 4294967295L))), aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
