package defpackage;

import com.yandex.messaging.core.net.entities.JoinThreadData;

/* loaded from: classes15.dex */
public final class o99 implements ho3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p99 b;
    public final /* synthetic */ b9y c;
    public final /* synthetic */ j3b w;

    public /* synthetic */ o99(p99 p99Var, b9y b9yVar, j3b j3bVar, int i) {
        this.a = i;
        this.b = p99Var;
        this.c = b9yVar;
        this.w = j3bVar;
    }

    @Override // defpackage.go3
    public final void D(Object obj) {
        int i = this.a;
        j3b j3bVar = this.w;
        b9y b9yVar = this.c;
        p99 p99Var = this.b;
        switch (i) {
            case 0:
                p99Var.e.b();
                b9yVar.h();
                p99Var.f.f("leave chat", "chat id", j3bVar.b, "chat type", j3bVar.N);
                return;
            default:
                JoinThreadData joinThreadData = (JoinThreadData) obj;
                p99Var.e.b();
                l020 C = p99Var.b.C();
                try {
                    C.R(p99Var.d.b, joinThreadData.getChatMember());
                    C.s();
                    C.close();
                    b9yVar.h();
                    p99Var.f.f("leave chat", "chat id", j3bVar.b, "chat type", j3bVar.N);
                    return;
                } finally {
                }
        }
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        int i2 = this.a;
        b9y b9yVar = this.c;
        p99 p99Var = this.b;
        switch (i2) {
            case 0:
                if (i == 409) {
                    p99Var.e.a(null);
                    b9yVar.h();
                    break;
                }
                break;
            default:
                if (i == 409) {
                    p99Var.e.a(null);
                    b9yVar.h();
                    break;
                }
                break;
        }
        return true;
    }
}
