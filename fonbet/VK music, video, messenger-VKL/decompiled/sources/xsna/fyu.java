package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;

/* compiled from: HeaderTabsRepository.kt */
/* loaded from: classes17.dex */
public final class fyu {
    public final hhd0 a;
    public final g6b b = new g6b(8);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final io.reactivex.rxjava3.subjects.d<List<String>> e = io.reactivex.rxjava3.subjects.d.N0();

    public fyu(haf hafVar) {
        this.a = new hhd0(hafVar);
    }

    public final ArrayList a(ClipFeedTab.WithPayload.Payload payload) {
        List<String> P0 = this.e.P0();
        if (P0 == null && (P0 = ((haf) this.a.b).b) == null) {
            P0 = EmptyList.b;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = P0.iterator();
        while (it.hasNext()) {
            ClipFeedTab a = eyu.a((String) it.next(), payload);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
