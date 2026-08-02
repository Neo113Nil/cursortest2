package defpackage;

import com.yandex.messaging.ui.timeline.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class e8b implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ int c;

    public /* synthetic */ e8b(b bVar, int i, int i2) {
        this.a = i2;
        this.b = bVar;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        b bVar = this.b;
        j3b j3bVar = (j3b) obj;
        switch (i) {
            case 0:
                bVar.a.f("thread search query", "thread id", j3bVar.b, "query length", Integer.valueOf(i2));
                break;
            default:
                bVar.a.f("thread search result", "thread id", j3bVar.b, "result count", Integer.valueOf(i2));
                break;
        }
        return zy11Var;
    }
}
