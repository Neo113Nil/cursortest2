package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class bz81 extends zsx0 {
    public final /* synthetic */ ysx0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz81(ysx0 ysx0Var, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.d = ysx0Var;
    }

    @Override // defpackage.zsx0
    public final void b(om2 om2Var, atx0 atx0Var) {
        this.d.a.accept(om2Var, atx0Var);
    }
}
