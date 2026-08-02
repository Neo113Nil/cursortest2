package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* compiled from: PerPriorityRequestsQueue.kt */
/* loaded from: classes2.dex */
public final class sv90 {
    public final int a;
    public final int b;
    public final Map<NetworkClient.ClientType, Integer> c;
    public final Set<ckv> d = Collections.newSetFromMap(new IdentityHashMap());
    public final LinkedList<ckv> e = new LinkedList<>();
    public final Set<ckv> f = Collections.newSetFromMap(new IdentityHashMap());
    public int g;

    public sv90(int i, int i2, Map<NetworkClient.ClientType, Integer> map) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    public final void a(ckv ckvVar) {
        Set<ckv> set = this.f;
        set.contains(ckvVar);
        set.add(ckvVar);
        if (ybd0.a(ckvVar, this.c) != this.b) {
            this.g++;
        }
        Set<ckv> set2 = this.d;
        if (set2.size() < this.a) {
            set2.add(ckvVar);
        } else {
            this.e.add(ckvVar);
        }
    }

    public final boolean b(ckv ckvVar) {
        Set<ckv> set = this.f;
        if (!set.contains(ckvVar)) {
            return false;
        }
        set.remove(ckvVar);
        if (ybd0.a(ckvVar, this.c) != this.b) {
            this.g--;
        }
        Set<ckv> set2 = this.d;
        boolean remove = set2.remove(ckvVar);
        LinkedList<ckv> linkedList = this.e;
        if (!remove) {
            linkedList.removeIf(new ycg(new bq00(ckvVar, 21), 1));
            return true;
        }
        if (linkedList.isEmpty()) {
            return true;
        }
        set2.add(linkedList.remove(0));
        return true;
    }
}
