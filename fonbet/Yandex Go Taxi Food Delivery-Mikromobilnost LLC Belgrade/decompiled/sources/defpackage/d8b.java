package defpackage;

import com.yandex.messaging.ui.timeline.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class d8b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ d8b(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        j3b j3bVar = (j3b) obj;
        switch (i) {
            case 0:
                bVar.a.c("thread close clicked", "thread id", j3bVar.b);
                break;
            case 1:
                bVar.a.c("thread parent message", "thread id", j3bVar.b);
                break;
            default:
                bVar.a.c("thread search closed", "thread id", j3bVar.b);
                break;
        }
        return zy11Var;
    }
}
