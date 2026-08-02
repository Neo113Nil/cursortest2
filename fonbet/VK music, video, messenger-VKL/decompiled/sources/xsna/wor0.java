package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: Ruler.kt */
/* loaded from: classes11.dex */
public final class wor0 extends Lambda implements wzs<tra0.a, Float, Float> {
    final /* synthetic */ xor0[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wor0(xor0[] xor0VarArr) {
        super(2);
        this.$rulers = xor0VarArr;
    }

    @Override // xsna.wzs
    public final Float invoke(tra0.a aVar, Float f) {
        return Float.valueOf(rrg0.a(aVar, false, this.$rulers, f.floatValue()));
    }
}
