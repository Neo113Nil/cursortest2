package xsna;

import kotlin.jvm.internal.Lambda;
import xsna.tra0;

/* compiled from: Ruler.kt */
/* loaded from: classes11.dex */
public final class mfv extends Lambda implements wzs<tra0.a, Float, Float> {
    final /* synthetic */ ofv[] $rulers;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfv(ofv[] ofvVarArr) {
        super(2);
        this.$rulers = ofvVarArr;
    }

    @Override // xsna.wzs
    public final Float invoke(tra0.a aVar, Float f) {
        return Float.valueOf(rrg0.a(aVar, true, this.$rulers, f.floatValue()));
    }
}
