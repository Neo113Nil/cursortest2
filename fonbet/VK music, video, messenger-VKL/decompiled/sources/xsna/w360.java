package xsna;

import com.vk.core.preference.Preference;
import com.vk.httpexecutor.api.utils.debug.FakeNetworkConditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NetworkInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class w360 extends FunctionReferenceImpl implements gzs<EnumSet<FakeNetworkConditions>> {
    @Override // xsna.gzs
    public final EnumSet<FakeNetworkConditions> invoke() {
        Set<String> stringSet;
        EnumSet<FakeNetworkConditions> copyOf;
        Object failure;
        o2l o2lVar = (o2l) this.receiver;
        o2lVar.getClass();
        o2l.a.getClass();
        if (!o2l.g()) {
            o2lVar = null;
        }
        if (o2lVar != null && (stringSet = Preference.j().getStringSet("__dbg_fake_network_conditions_to_fail_with", null)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    failure = FakeNetworkConditions.valueOf((String) it.next());
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                FakeNetworkConditions fakeNetworkConditions = (FakeNetworkConditions) failure;
                if (fakeNetworkConditions != null) {
                    arrayList.add(fakeNetworkConditions);
                }
            }
            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
            if (arrayList2 != null && (copyOf = EnumSet.copyOf((Collection) arrayList2)) != null) {
                return copyOf;
            }
        }
        return EnumSet.noneOf(FakeNetworkConditions.class);
    }
}
