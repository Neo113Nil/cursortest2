package androidx.compose.animation;

import defpackage.gl11;
import defpackage.ldc;
import defpackage.rj2;
import defpackage.rzo;
import defpackage.tls;
import defpackage.ugc;
import defpackage.wgc;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lugc;", "colorSpace", "Lgl11;", "Lldc;", "Lrj2;", "invoke", "(Lugc;)Lgl11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes10.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements tls {
    public static final ColorVectorConverterKt$ColorToVector$1 w = new ColorVectorConverterKt$ColorToVector$1(1);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lldc;", "color", "Lrj2;", "invoke-8_81llA", "(J)Lrj2;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements tls {
        public static final AnonymousClass1 w = new AnonymousClass1(1);

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            long a = ldc.a(((ldc) obj).a, wgc.x);
            return new rj2(ldc.d(a), ldc.h(a), ldc.g(a), ldc.e(a));
        }
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        final ugc ugcVar = (ugc) obj;
        return new gl11(AnonymousClass1.w, new tls() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                rj2 rj2Var = (rj2) obj2;
                float f = rj2Var.b;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f2 = rj2Var.c;
                if (f2 < -0.5f) {
                    f2 = -0.5f;
                }
                if (f2 > 0.5f) {
                    f2 = 0.5f;
                }
                float f3 = rj2Var.d;
                float f4 = f3 >= -0.5f ? f3 : -0.5f;
                float f5 = f4 <= 0.5f ? f4 : 0.5f;
                float f6 = rj2Var.a;
                float f7 = f6 >= 0.0f ? f6 : 0.0f;
                return new ldc(ldc.a(rzo.c(f, f2, f5, f7 <= 1.0f ? f7 : 1.0f, wgc.x), ugc.this));
            }
        });
    }
}
