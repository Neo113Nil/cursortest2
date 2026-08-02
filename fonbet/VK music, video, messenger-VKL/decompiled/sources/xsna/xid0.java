package xsna;

import android.content.Context;
import com.vk.dto.group.Group;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xid0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xid0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((yid0) this.d).k(this.c, (Context) this.e);
                break;
            default:
                q3n0 q3n0Var = (q3n0) this.d;
                q3n0.f((Group) this.e, this.c);
                q3n0Var.a.o6();
                break;
        }
        return s3q0.a;
    }
}
