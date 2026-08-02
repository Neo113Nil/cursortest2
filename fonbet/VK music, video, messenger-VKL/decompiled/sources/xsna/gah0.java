package xsna;

import android.content.Context;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ScopesHolder.kt */
/* loaded from: classes6.dex */
public final class gah0 {
    public final Context a;
    public fah0 b;
    public fah0 c;

    public gah0(Context context) {
        this.a = context;
    }

    public final void a(fah0 fah0Var, List<String> list, l1w0 l1w0Var) {
        WebApiApplication webApiApplication = fah0Var.b;
        fah0Var.d = l1w0Var;
        czi cziVar = fah0Var.c;
        boolean z = cziVar instanceof lzq0;
        Context context = this.a;
        if (z) {
            if (list.isEmpty()) {
                l1w0 l1w0Var2 = fah0Var.d;
                if (l1w0Var2 == null) {
                    l1w0Var2 = null;
                }
                l1w0Var2.c(EmptyList.b);
            }
            vdx0 vdx0Var = e370.e;
            (vdx0Var != null ? vdx0Var : null).d().Y(webApiApplication.b, list).subscribe(new f5y(new ftm(fah0Var, context, list, 7), 20), new nex(new r9c0(fah0Var, 5), 20));
            return;
        }
        if (list.isEmpty()) {
            List<bah0> list2 = Collections.EMPTY_LIST;
            fah0Var.c(context, list2, list2);
            return;
        }
        HashMap hashMap = fah0.e;
        if (hashMap.get(cziVar.k()) != null) {
            fah0Var.d(context, (Map) hashMap.get(cziVar.k()), list);
            return;
        }
        WeakReference weakReference = new WeakReference(context);
        vdx0 vdx0Var2 = e370.e;
        (vdx0Var2 != null ? vdx0Var2 : null).d().L(webApiApplication.b, cziVar.k()).subscribe(new wx00(new cp9(fah0Var, weakReference, list, 5), 15), new uk40(new fa00(l1w0Var, 22), 14));
    }
}
