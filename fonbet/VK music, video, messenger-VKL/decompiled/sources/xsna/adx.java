package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.k240;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class adx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ adx(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        gzs gzsVar = this.c;
        switch (i) {
            case 0:
                wb3 wb3Var = (wb3) gzsVar;
                if (((NetworkClient.ClientType) obj) != NetworkClient.ClientType.CLIENT_API) {
                    return null;
                }
                wb3Var.invoke();
                return null;
            default:
                t1d0 t1d0Var = (t1d0) gzsVar;
                k240 k240Var = (k240) obj;
                r55 r55Var = r55.a;
                Iterator it = ((CopyOnWriteArrayList) r55.f().c.b).iterator();
                while (it.hasNext()) {
                    ((l240) it.next()).a(k240Var);
                }
                if (k240Var instanceof k240.a) {
                    ((VkClientMultiAccountComponent) t1d0Var.d.getValue()).Vc().b(Collections.singletonList(((k240.a) k240Var).a()));
                }
                return s3q0.a;
        }
    }
}
