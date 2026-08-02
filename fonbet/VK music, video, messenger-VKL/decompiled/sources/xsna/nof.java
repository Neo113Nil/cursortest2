package xsna;

import com.vk.toggle.Features;
import com.vk.toggle.b;
import org.json.JSONObject;
import xsna.vqd;

/* compiled from: FeatureFactory.kt */
/* loaded from: classes.dex */
public final class nof extends enk<vqd> {
    public final /* synthetic */ pof k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nof(Features.Type type, izs izsVar, gpf gpfVar, epf epfVar, pof pofVar) {
        super(type, izsVar, gpfVar, false, epfVar);
        this.k = pofVar;
    }

    @Override // xsna.enk
    public final vqd b(b.a aVar) {
        JSONObject a;
        if (aVar != null && (a = puq.a(aVar)) != null) {
            if (((Boolean) this.k.e.getValue()).booleanValue()) {
                a = null;
            }
            if (a != null) {
                return vqd.a.a(a);
            }
        }
        return vqd.c;
    }
}
