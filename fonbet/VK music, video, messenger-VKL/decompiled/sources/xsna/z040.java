package xsna;

import android.content.Context;
import android.util.SparseArray;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.g1e0;
import xsna.pdg0;

/* compiled from: MsgToTextLoader.kt */
/* loaded from: classes2.dex */
public final class z040 {
    public static final z040 a = new z040();

    public final String a(Context context, a1w a1wVar, Collection<Integer> collection) throws Exception {
        Object obj;
        HashMap hashMap = ((t140) vdg0.c(a1wVar.n(this, new ej30(MsgIdType.LOCAL_ID, collection, null, null, 60)))).a.c;
        SparseArray sparseArray = new SparseArray(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            sparseArray.put(((Number) entry.getKey()).intValue(), (Msg) entry.getValue());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(sparseArray.get(((Number) it.next()).intValue()));
        }
        f1e0 f1e0Var = new f1e0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lv30.b((Msg) arrayList.get(i), f1e0Var);
        }
        Source source = Source.CACHE;
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(f1e0Var);
        aVar.b = source;
        aVar.c = true;
        aVar.d = null;
        pdg0 n = a1wVar.n(this, new d1e0(new g1e0(aVar)));
        if (n instanceof pdg0.a) {
            obj = new ProfilesInfo();
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        return new x040(context).a(arrayList, ((ProfilesInfo) obj).Ob(), a1wVar.q());
    }
}
