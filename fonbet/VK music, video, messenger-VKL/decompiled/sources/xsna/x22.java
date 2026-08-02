package xsna;

import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidAutofillManager.android.kt */
/* loaded from: classes11.dex */
public final class x22 extends Lambda implements zzs<Integer, Integer, Integer, Integer, s3q0> {
    final /* synthetic */ agi0 $semanticsInfo;
    final /* synthetic */ v22 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x22(v22 v22Var, LayoutNode layoutNode) {
        super(4);
        this.this$0 = v22Var;
        this.$semanticsInfo = layoutNode;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        this.this$0.g.set(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        v22 v22Var = this.this$0;
        gta0 gta0Var = v22Var.b;
        gta0Var.a.requestAutofill(v22Var.d, this.$semanticsInfo.c(), this.this$0.g);
        return s3q0.a;
    }
}
