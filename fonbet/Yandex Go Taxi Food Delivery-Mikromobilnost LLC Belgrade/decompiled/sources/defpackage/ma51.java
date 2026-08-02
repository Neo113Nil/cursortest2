package defpackage;

import androidx.work.Worker;

/* loaded from: classes10.dex */
public final /* synthetic */ class ma51 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Worker b;

    public /* synthetic */ ma51(Worker worker, int i) {
        this.a = i;
        this.b = worker;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Worker worker = this.b;
        switch (i) {
            case 0:
                return worker.doWork();
            default:
                return worker.getForegroundInfo();
        }
    }
}
