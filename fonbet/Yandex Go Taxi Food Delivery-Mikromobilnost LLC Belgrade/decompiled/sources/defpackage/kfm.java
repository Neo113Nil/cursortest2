package defpackage;

import com.yandex.go.drive.DriveSdkExperiment;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class kfm implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public kfm(rqo rqoVar) {
        DriveSdkExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(DriveSdkExperiment.h);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (DriveSdkExperiment) this.a.c();
    }
}
