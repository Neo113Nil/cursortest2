package androidx.compose.material3;

import defpackage.k810;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 extends FunctionReferenceImpl implements wls {
    public static final InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 b = new InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1(2, 1, k810.class, "min", "min(II)I");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
