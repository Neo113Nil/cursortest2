package xsna;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.cri;

/* compiled from: Layout.kt */
/* loaded from: classes11.dex */
public final class koy extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ List<wzs<androidx.compose.runtime.a, Integer, s3q0>> $contents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public koy(List<? extends wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0>> list) {
        super(2);
        this.$contents = list;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1271844412, intValue, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:180)");
            }
            List<wzs<androidx.compose.runtime.a, Integer, s3q0>> list = this.$contents;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = list.get(i);
                int hashCode = Long.hashCode(n34.n(aVar2));
                cri.h7.getClass();
                cri.a.f fVar = cri.a.c;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(fVar);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                wzsVar.invoke(aVar2, 0);
                aVar2.G();
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
