package defpackage;

import com.yandex.quark.capability.CapabilityListener;
import com.yandex.quark.core.common.internal.consumer.a;
import com.yandex.quark.utils.Disposable;

/* loaded from: classes8.dex */
public final /* synthetic */ class ks1 implements Disposable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ks1(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // com.yandex.quark.utils.Disposable
    public final void dispose() {
        switch (this.a) {
            case 0:
                ls1 ls1Var = (ls1) this.c;
                ls1Var.a.remove((CapabilityListener) this.b);
                return;
            case 1:
                hy4 hy4Var = (hy4) this.c;
                CapabilityListener capabilityListener = (CapabilityListener) this.b;
                synchronized (hy4Var) {
                    hy4Var.a.remove(capabilityListener);
                }
                return;
            case 2:
                az4 az4Var = (az4) this.c;
                Object obj = this.b;
                synchronized (az4Var) {
                    az4Var.x.remove(obj);
                }
                return;
            case 3:
                e8h e8hVar = (e8h) this.c;
                u28 u28Var = (u28) this.b;
                a aVar = e8hVar.a;
                if (aVar != null) {
                    aVar.c(new d38(u28Var));
                    return;
                }
                return;
            case 4:
                com.yandex.quark.js.implementation.webView.internal.a aVar2 = (com.yandex.quark.js.implementation.webView.internal.a) this.c;
                aVar2.x.remove((ifo) this.b);
                return;
            default:
                pzt0 pzt0Var = (pzt0) this.c;
                pzt0 pzt0Var2 = (pzt0) this.b;
                pzt0Var.a(null);
                pzt0Var2.a(null);
                return;
        }
    }
}
