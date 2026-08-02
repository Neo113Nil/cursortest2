package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmct;", "", "Companion", "kct", "lct", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class mct {
    public static final lct Companion = new lct();
    public final String a;
    public final String b;
    public final c c;
    public final c d;

    public /* synthetic */ mct(int i, String str, String str2, c cVar, c cVar2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = cVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar2;
        }
    }

    public mct() {
        this(null, 15);
    }

    public mct(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        String str2 = (i & 2) == 0 ? TariffOrderFlow.ORDER_FLOW_TAXI_KEY : "";
        this.a = str;
        this.b = str2;
        this.c = null;
        this.d = null;
    }
}
