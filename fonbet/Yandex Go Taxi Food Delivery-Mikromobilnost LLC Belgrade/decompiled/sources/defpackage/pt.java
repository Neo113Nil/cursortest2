package defpackage;

import com.yandex.fintechsdk.core.nfc.impl.internal.a;
import com.yandex.go.taxi.order.communications.e;
import java.util.Collections;
import java.util.Locale;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.b;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class pt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ pt(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DriveState c;
        String name;
        int i = this.a;
        boolean z = this.b;
        Object obj = this.y;
        Object obj2 = this.x;
        Object obj3 = this.w;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                e eVar = (e) obj4;
                CommunicationItem communicationItem = (CommunicationItem) obj3;
                ActionButton actionButton = (ActionButton) obj2;
                Runnable runnable = (Runnable) obj;
                tls tlsVar = eVar.s0;
                String str = communicationItem.a;
                o2y0 o2y0Var = eVar.r0;
                String str2 = null;
                String str3 = o2y0Var != null ? o2y0Var.b().a : null;
                if (o2y0Var != null && (c = o2y0Var.c()) != null && (name = c.name()) != null) {
                    str2 = name.toLowerCase(Locale.ROOT);
                }
                int G = eVar.G();
                b bVar = actionButton.e;
                tlsVar.invoke(new bpf0(new dpf0(str, str3, str2, G, bVar != null ? Collections.singletonList(bVar.b().name().toLowerCase(Locale.ROOT)) : EmptyList.a, communicationItem.k), runnable, z));
                break;
            default:
                String str4 = (String) obj4;
                h511 h511Var = (h511) obj3;
                a aVar = (a) obj2;
                zjy0 zjy0Var = (zjy0) obj;
                if (str4 != null) {
                    zjy0Var.invoke(str4);
                    if (z) {
                        aVar.c();
                        break;
                    }
                } else {
                    h511Var.invoke();
                    aVar.c();
                    break;
                }
                break;
        }
    }
}
