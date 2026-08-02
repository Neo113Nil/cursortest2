package defpackage;

import com.yandex.plus.webview.internal.security.CombinedWebViewRequestSecurityChecker$Strategy;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class fjc implements at41 {
    public final ArrayList a;
    public final CombinedWebViewRequestSecurityChecker$Strategy b;

    public fjc(ArrayList arrayList, CombinedWebViewRequestSecurityChecker$Strategy combinedWebViewRequestSecurityChecker$Strategy) {
        this.a = arrayList;
        this.b = combinedWebViewRequestSecurityChecker$Strategy;
    }

    @Override // defpackage.at41
    public final boolean o(urd0 urd0Var) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i = ejc.a[this.b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return false;
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((at41) it.next()).o(urd0Var)) {
                        }
                    }
                }
                return false;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!((at41) it2.next()).o(urd0Var)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
