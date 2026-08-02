package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.queue.sync.models.QueueAccessException;
import com.vk.queue.sync.utils.InterruptionType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ij20;
import xsna.sft0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hse0 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;

    public /* synthetic */ hse0(clj0 clj0Var, String str, String str2, boolean z) {
        this.d = clj0Var;
        this.e = str;
        this.f = str2;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.vk.queue.sync.models.QueueAccessException, java.lang.Throwable] */
    @Override // xsna.gzs
    public final Object invoke() {
        boolean z;
        InterruptionType j;
        dfw0 dfw0Var;
        switch (this.b) {
            case 0:
                boolean z2 = this.c;
                dox doxVar = (dox) this.d;
                ise0 ise0Var = (ise0) this.e;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f;
                try {
                    j = sdy.j(z2);
                } catch (QueueAccessException e) {
                    Map<xqe0, wqe0> d = e.d();
                    if (!d.isEmpty()) {
                        Iterator<Map.Entry<xqe0, wqe0>> it = d.entrySet().iterator();
                        while (it.hasNext()) {
                            if (it.next().getValue().d) {
                                ref$ObjectRef.element = e;
                                z = true;
                            }
                        }
                    }
                    Map<xqe0, wqe0> d2 = e.d();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<xqe0, wqe0> entry : d2.entrySet()) {
                        if (entry.getValue().c) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((xqe0) ((Map.Entry) it2.next()).getKey()).a);
                    }
                    if (arrayList.isEmpty()) {
                        throw e;
                    }
                    ise0Var.b.b(arrayList);
                    ref$ObjectRef.element = e;
                    z = true;
                }
                if (!j.i()) {
                    ise0Var.a(ise0Var.f);
                    throw null;
                }
                if (doxVar != null) {
                    doxVar.invoke("OBSERVE_EVENTS", Boolean.valueOf(j.h()));
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                clj0 clj0Var = (clj0) this.d;
                String str = (String) this.e;
                String str2 = (String) this.f;
                se8 se8Var = clj0Var.b;
                wy2 wy2Var = se8Var.a;
                if (this.c) {
                    uft0 uft0Var = new uft0();
                    UserId userId = new UserId(Long.parseLong(str2));
                    int parseInt = Integer.parseInt(str);
                    Boolean bool = Boolean.TRUE;
                    tfx tfxVar = new tfx("video.liveHeartbeat", new yga0(7), new hgj0(2));
                    tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                    tfx.l(tfxVar, "video_id", parseInt, 0, 0, 8);
                    tfxVar.f(10, 0, 10, "spectators_count");
                    tfxVar.j("extended", true);
                    dfw0Var = (dfw0) new com.vk.api.request.rx.batch.f(yfb.x(tfxVar), yfb.x(tft0.y(uft0Var, parseInt, userId, null, null, 0, null, 32668)), yfb.x(sft0.a.b(uft0Var, userId, Collections.singletonList(userId + '_' + str), null, null, null, bool, null, 16776182)), new qe8(se8Var, 0)).f(wy2Var);
                } else {
                    ij20.a aVar = new ij20.a();
                    aVar.c = "video.liveHeartbeat";
                    aVar.b("video_id", str);
                    aVar.b("owner_id", str2);
                    aVar.h = true;
                    aVar.i = false;
                    aVar.p(0);
                    wy2Var.f(aVar.c());
                    dfw0Var = null;
                }
                return new it80(dfw0Var);
        }
    }

    public /* synthetic */ hse0(boolean z, dox doxVar, ise0 ise0Var, Ref$ObjectRef ref$ObjectRef) {
        this.c = z;
        this.d = doxVar;
        this.e = ise0Var;
        this.f = ref$ObjectRef;
    }
}
