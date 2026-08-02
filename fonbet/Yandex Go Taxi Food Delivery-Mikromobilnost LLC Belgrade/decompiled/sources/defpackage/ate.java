package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.q;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ate {
    public final CorpAccountFlowExperiment.CorpCreationNavigatorModalDto a;
    public final Map b;

    static {
        q qVar = CorpAccountFlowExperiment.CorpCreationNavigatorModalDto.Companion;
    }

    public ate(CorpAccountFlowExperiment.CorpCreationNavigatorModalDto corpCreationNavigatorModalDto, Map map) {
        this.a = corpCreationNavigatorModalDto;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ate)) {
            return false;
        }
        ate ateVar = (ate) obj;
        return jl40.l(this.a, ateVar.a) && jl40.l(this.b, ateVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CorpAccountCreateNavigatorModalData(modalDto=" + this.a + ", l10n=" + this.b + Extension.C_BRAKE;
    }
}
