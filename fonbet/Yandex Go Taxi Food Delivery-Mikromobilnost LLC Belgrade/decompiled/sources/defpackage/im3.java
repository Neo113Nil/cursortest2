package defpackage;

import com.yandex.messenger.websdk.api.Cancelable;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final /* synthetic */ class im3 implements Cancelable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ im3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.yandex.messenger.websdk.api.Cancelable
    public final void cancel() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jm3 jm3Var = (jm3) obj2;
                jm3Var.c.b("wm_auth_cancel_token_subscription");
                vx21.b(new mw2(3, jm3Var, (xdb) obj));
                break;
            case 1:
                jl40.m();
                ((rax) obj2).h.remove((String) obj);
                break;
            default:
                fh41 fh41Var = (fh41) obj2;
                qsx qsxVar = (qsx) obj;
                jl40.m();
                fh41Var.b = null;
                qsxVar.b.remove(fh41Var);
                Iterator it = qsxVar.a.keySet().iterator();
                while (it.hasNext()) {
                    String str = (String) fh41Var.a.remove((ChatRequest) it.next());
                    if (str != null) {
                        fh41Var.b(str);
                    }
                }
                break;
        }
    }
}
