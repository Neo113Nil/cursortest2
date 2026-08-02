package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.woy;

/* compiled from: SubcomposeLayout.kt */
/* loaded from: classes11.dex */
public final class bpy extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;
    final /* synthetic */ woy.b $nodeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bpy(woy.b bVar, wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        super(2);
        this.$nodeState = bVar;
        this.$content = wzsVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1524156494, intValue, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:706)");
            }
            Boolean bool = (Boolean) ((zak0) this.$nodeState.g).getValue();
            boolean booleanValue = bool.booleanValue();
            wzs<androidx.compose.runtime.a, Integer, s3q0> wzsVar = this.$content;
            aVar2.g(bool);
            boolean l = aVar2.l(booleanValue);
            if (booleanValue) {
                wzsVar.invoke(aVar2, 0);
            } else {
                aVar2.A(l);
            }
            aVar2.w();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
