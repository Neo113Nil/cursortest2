package defpackage;

import com.yandex.go.lootbox.impl.domain.interactors.animation.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.g;

/* loaded from: classes14.dex */
public final class a5r implements z4r {
    public final e a;

    public a5r(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r4.i(r2) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(List list, boolean z) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CommunicationItem communicationItem = (CommunicationItem) it.next();
            CommunicationItem.a aVar = communicationItem.g;
            List list2 = aVar != null ? aVar.e : null;
            if (list2 == null) {
                list2 = EmptyList.a;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((ActionButton) obj).e instanceof g) {
                    break;
                }
            }
            ActionButton actionButton = (ActionButton) obj;
            g gVar = actionButton != null ? (g) actionButton.e : null;
            if (gVar != null) {
                if (z) {
                    if (gVar instanceof ActionButton.g) {
                        String str = ((ActionButton.g) gVar).b;
                        e eVar = this.a;
                        if (eVar.e(str) != null) {
                        }
                    } else if (!(gVar instanceof ActionButton.f)) {
                        w511.b();
                        return null;
                    }
                }
                communicationItem = null;
            }
            if (communicationItem != null) {
                arrayList.add(communicationItem);
            }
        }
        return arrayList;
    }
}
