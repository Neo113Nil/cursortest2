package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.entities.AddresseeType;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import kotlin.Pair;
import kotlin.collections.b;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final class jpq0 extends xx4 {
    public static final /* synthetic */ int A = 0;
    public final ChatRequest w;
    public final long x;
    public final at2 y;
    public final x22 z;

    public jpq0(ChatRequest chatRequest, long j, at2 at2Var, x22 x22Var) {
        this.w = chatRequest;
        this.x = j;
        this.y = at2Var;
        this.z = x22Var;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        String str;
        s020 e;
        d9g d9gVar = (d9g) cl21Var;
        o1b0 o1b0Var = (o1b0) this.w.handle(new aq80(new p1b0((at2) d9gVar.c.z.get())));
        if (o1b0Var == null || (e = d9gVar.b().e((str = o1b0Var.b))) == null) {
            return;
        }
        vcz0 h = ((m8g) e).h();
        LocalMessageRef.Companion.getClass();
        long j = this.x;
        MessageData d = h.d(t3z.a(j));
        if (d == null) {
            return;
        }
        bv21 a = this.y.a();
        String str2 = o1b0Var.c;
        boolean c = str2 != null ? a.c(str2) : false;
        Pair pair = new Pair("chat", str);
        Pair pair2 = new Pair("ts", String.valueOf(j));
        Pair pair3 = new Pair("v", String.valueOf(d.lastEditTimestamp));
        Pair pair4 = new Pair(ACSPConstants.STATUS, d.hiddenByModeration ? "18+" : WriteBlocks.OK);
        Pair pair5 = new Pair("kind", p9b1.f(d));
        AddresseeType.INSTANCE.getClass();
        this.z.reportEvent("message shown", b.h(pair, pair2, pair3, pair4, pair5, new Pair("addressee type", (c ? AddresseeType.CONTACT : AddresseeType.OTHER).getReportName())));
    }
}
