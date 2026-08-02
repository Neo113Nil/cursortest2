package xsna;

import com.vk.dto.group.Group;
import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class z67 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;

    public /* synthetic */ z67(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                s3q0 s3q0Var = s3q0.a;
                break;
            case 1:
                s3q0 s3q0Var2 = s3q0.a;
                break;
            case 2:
                L.i((Throwable) obj);
                break;
            default:
                t6g0 t6g0Var = t6g0.b;
                t6g0.b().t0((Group) obj);
                break;
        }
    }

    public /* synthetic */ z67(izs izsVar, int i) {
        this.b = i;
    }
}
