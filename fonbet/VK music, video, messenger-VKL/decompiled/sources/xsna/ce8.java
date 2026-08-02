package xsna;

import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.me8;

/* compiled from: BroadcastConfigView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ce8 extends FunctionReferenceImpl implements izs<me8.a, CharSequence> {
    @Override // xsna.izs
    public final CharSequence invoke(me8.a aVar) {
        Object obj;
        me8.a aVar2 = aVar;
        ke8 ke8Var = (ke8) this.receiver;
        ke8Var.getClass();
        Iterator<T> it = aVar2.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((qvw0) obj).getId(), aVar2.d)) {
                break;
            }
        }
        return ke8Var.a.getString(aVar2.e != null ? R.string.voip_broadcast_privacy_description_when_scheduled : ((qvw0) obj) instanceof rvw0 ? R.string.voip_broadcast_privacy_description_when_owner_group : R.string.voip_broadcast_privacy_description_when_owner_user);
    }
}
