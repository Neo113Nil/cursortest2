package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.settings.email.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class bue {
    public final due a;
    public final a b;
    public final g c;
    public final h d;

    public bue(due dueVar, a aVar, g gVar, h hVar) {
        this.a = dueVar;
        this.b = aVar;
        this.c = gVar;
        this.d = hVar;
    }

    public static aue a(bue bueVar) {
        return new aue((CorpAccountFlowExperiment) bueVar.a.a.b(), bueVar.b, bueVar.c, bueVar.d);
    }
}
