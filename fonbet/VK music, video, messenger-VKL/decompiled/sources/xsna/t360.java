package xsna;

import com.vk.core.preference.Preference;
import com.vk.httpexecutor.api.NetworkClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class t360 extends FunctionReferenceImpl implements gzs<EnumSet<NetworkClient.ClientType>> {
    @Override // xsna.gzs
    public final EnumSet<NetworkClient.ClientType> invoke() {
        Set<String> stringSet;
        EnumSet<NetworkClient.ClientType> copyOf;
        Object failure;
        o2l o2lVar = (o2l) this.receiver;
        o2lVar.getClass();
        o2l.a.getClass();
        if (!o2l.g()) {
            o2lVar = null;
        }
        if (o2lVar != null && (stringSet = Preference.j().getStringSet("__dbg_network_fail_on_request", null)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    failure = NetworkClient.ClientType.valueOf((String) it.next());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                NetworkClient.ClientType clientType = (NetworkClient.ClientType) failure;
                if (clientType != null) {
                    arrayList.add(clientType);
                }
            }
            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
            if (arrayList2 != null && (copyOf = EnumSet.copyOf((Collection) arrayList2)) != null) {
                return copyOf;
            }
        }
        return EnumSet.noneOf(NetworkClient.ClientType.class);
    }
}
