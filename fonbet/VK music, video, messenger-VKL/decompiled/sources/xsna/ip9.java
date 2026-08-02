package xsna;

/* compiled from: CancelAllPeriodicWorkersUseCase.kt */
/* loaded from: classes5.dex */
public final class ip9 {
    public final ezx0 a;

    public ip9(ezx0 ezx0Var) {
        this.a = ezx0Var;
    }

    public final void a() {
        ezx0 ezx0Var = this.a;
        ezx0Var.a("VKPNS_StopDeliverToUninstalledWork");
        ezx0Var.a("VKPNS_PushTokensHealthCheckWork");
        ezx0Var.a("VKPNS_OneTimePushReceiveWorker");
    }
}
