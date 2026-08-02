package xsna;

import com.vk.geo.impl.model.CameraBounds;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class sf9 implements wzs {
    public final /* synthetic */ vf9 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ omf d;
    public final /* synthetic */ qb6 e;

    public /* synthetic */ sf9(vf9 vf9Var, float f, omf omfVar, qb6 qb6Var) {
        this.b = vf9Var;
        this.c = f;
        this.d = omfVar;
        this.e = qb6Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        CameraBounds cameraBounds = (CameraBounds) obj;
        CameraBounds cameraBounds2 = (CameraBounds) obj2;
        if (cameraBounds == null || !this.b.a(cameraBounds2, cameraBounds, this.c, this.d, false)) {
            this.e.invoke(cameraBounds2);
        }
        return s3q0.a;
    }
}
