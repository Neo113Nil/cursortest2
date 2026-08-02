package xsna;

import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.me8;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class je8 extends FunctionReferenceImpl implements izs<me8.a, String> {
    @Override // xsna.izs
    public final String invoke(me8.a aVar) {
        Object obj;
        me8.a aVar2 = aVar;
        ke8 ke8Var = (ke8) this.receiver;
        ke8Var.getClass();
        Iterator<T> it = aVar2.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((dfw0) obj).a, aVar2.e)) {
                break;
            }
        }
        dfw0 dfw0Var = (dfw0) obj;
        return dfw0Var == null ? ke8Var.a.getString(R.string.voip_broadcast_target_description_new) : dfw0Var.f;
    }
}
