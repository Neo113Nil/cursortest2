package defpackage;

import android.text.Html;
import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.shared.antifraud.experiments.CorpAntiFraudExperiment;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes13.dex */
public final class iue implements hue {
    public final cda0 a;
    public final n3a b;
    public final ic4 c;

    public iue(cda0 cda0Var, n3a n3aVar, ic4 ic4Var) {
        this.a = cda0Var;
        this.b = n3aVar;
        this.c = ic4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gue a() {
        boolean z;
        CorpAntiFraudExperiment corpAntiFraudExperiment = (CorpAntiFraudExperiment) this.b.b.b();
        if (corpAntiFraudExperiment == CorpAntiFraudExperiment.f) {
            corpAntiFraudExperiment.getClass();
        } else if (corpAntiFraudExperiment.b) {
            z = true;
            CorpAntiFraudExperiment.CorpScreen corpScreen = corpAntiFraudExperiment.d;
            if (z) {
                return gue.g;
            }
            ListBuilder h = ((c) this.a).h();
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = h.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                }
                Object next = qqyVar.next();
                if (next instanceof jve) {
                    arrayList.add(next);
                }
            }
            if (arrayList.isEmpty()) {
                return gue.g;
            }
            return new gue(d6z.Y(corpAntiFraudExperiment, corpScreen.a), Html.fromHtml(cvu0.v(d6z.Y(corpAntiFraudExperiment, corpScreen.b), "$$ACCOUNT_NAME$$", oyr.p("<b>«", a.X(arrayList, null, null, null, new foc(20), 31), "»</b>"), false), 0), d6z.Y(corpAntiFraudExperiment, corpScreen.d.a), d6z.Y(corpAntiFraudExperiment, corpScreen.c.a), corpScreen.e, this.c.getLogo());
        }
        z = false;
        CorpAntiFraudExperiment.CorpScreen corpScreen2 = corpAntiFraudExperiment.d;
        if (z) {
        }
    }
}
