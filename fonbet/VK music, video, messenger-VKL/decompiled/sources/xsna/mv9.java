package xsna;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: CarouselStrategyProvider.kt */
/* loaded from: classes4.dex */
public final class mv9 implements ppr, Continuation {
    public final Object b;
    public final Object c;

    public /* synthetic */ mv9(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ppr
    public int a() {
        return 10;
    }

    @Override // xsna.ppr
    public npr b(int i) {
        return i == 1 ? (ou9) this.c : (qu9) this.b;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        upg0 upg0Var = (upg0) this.b;
        Bundle bundle = (Bundle) this.c;
        upg0Var.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? task : upg0Var.a(bundle).onSuccessTask(ns01.b, fo50.e);
    }

    public mv9(gzs gzsVar) {
        this.b = new qu9(gzsVar);
        this.c = new ou9(gzsVar);
    }
}
