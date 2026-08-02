package defpackage;

import ru.yandex.taxi.logistics.sdk.LogisticsTimedNotification;
import ru.yandex.taxi.logistics.sdk.l;

/* loaded from: classes14.dex */
public final class m0v implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ m0v(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = obj3;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.w;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                tls tlsVar = (tls) obj3;
                tlsVar.invoke(new ce31((wzu) obj2));
                tlsVar.invoke(new od31((pzu) obj));
                break;
            case 1:
                tls tlsVar2 = (tls) obj3;
                tlsVar2.invoke(new ce31((a0v) obj2));
                tlsVar2.invoke(new od31((pzu) obj));
                break;
            case 2:
                tls tlsVar3 = (tls) obj3;
                tlsVar3.invoke(new ce31((yzu) obj2));
                tlsVar3.invoke(new od31((pzu) obj));
                break;
            case 3:
                LogisticsTimedNotification logisticsTimedNotification = (LogisticsTimedNotification) obj2;
                ((l) obj3).d.c(logisticsTimedNotification.getUid());
                logisticsTimedNotification.getUid();
                ((ci60) obj).b.T(new dj60());
                break;
            case 4:
                tls tlsVar4 = (tls) obj3;
                fu30 fu30Var = (fu30) obj2;
                tlsVar4.invoke(new pt30(fu30Var));
                tlsVar4.invoke(new tt30(fu30Var.g));
                ((sls) obj).invoke();
                break;
            default:
                w7b0 w7b0Var = (w7b0) obj2;
                ((tls) obj3).invoke(new r4b0(w7b0Var.a));
                ((oz40) obj).setValue(w7b0Var);
                break;
        }
        return zy11Var;
    }
}
