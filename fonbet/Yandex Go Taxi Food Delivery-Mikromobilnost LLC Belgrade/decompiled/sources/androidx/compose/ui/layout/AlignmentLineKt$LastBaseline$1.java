package androidx.compose.ui.layout;

import defpackage.k810;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements wls {
    public static final AlignmentLineKt$LastBaseline$1 b = new AlignmentLineKt$LastBaseline$1(2, 1, k810.class, CspBioProgressConstants.MAX, "max(II)I");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
