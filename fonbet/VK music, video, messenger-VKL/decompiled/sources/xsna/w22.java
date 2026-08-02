package xsna;

import android.graphics.Rect;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidAutofillManager.android.kt */
/* loaded from: classes11.dex */
public final class w22 extends Lambda implements zzs<Integer, Integer, Integer, Integer, s3q0> {
    final /* synthetic */ int $semanticsId;
    final /* synthetic */ v22 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(v22 v22Var, int i) {
        super(4);
        this.this$0 = v22Var;
        this.$semanticsId = i;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = num3.intValue();
        int intValue4 = num4.intValue();
        v22 v22Var = this.this$0;
        gta0 gta0Var = v22Var.b;
        gta0Var.a.notifyViewEntered(v22Var.d, this.$semanticsId, new Rect(intValue, intValue2, intValue3, intValue4));
        return s3q0.a;
    }
}
