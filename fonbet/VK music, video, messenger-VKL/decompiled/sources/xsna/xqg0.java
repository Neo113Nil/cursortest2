package xsna;

import com.huawei.hmf.tasks.Task;
import kotlin.Result;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xqg0 implements bc80, cc80, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xqg0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        igz0 igz0Var = (igz0) this.c;
        tez0 tez0Var = (tez0) this.d;
        hjz0.a aVar = igz0Var.a;
        String str = tez0Var.F;
        yil0.d(aVar);
    }

    @Override // xsna.bc80
    public void onSuccess(Object obj) {
        switch (this.b) {
            case 0:
                arg0 arg0Var = (arg0) this.c;
                io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) this.d;
                ReviewInfo reviewInfo = (ReviewInfo) obj;
                r100.a(arg0Var.f, "Request review flow completed successfully, result = " + reviewInfo);
                yVar.onSuccess(new Result(reviewInfo));
                break;
            default:
                Task task = (Task) this.c;
                cg1 cg1Var = (cg1) this.d;
                task.f();
                yxu0.a.g(false);
                yxu0.g = true;
                cg1Var.invoke();
                break;
        }
    }
}
