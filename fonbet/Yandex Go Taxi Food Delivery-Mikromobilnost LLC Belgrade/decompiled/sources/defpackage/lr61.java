package defpackage;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.XAdES.XAdESParameters;

/* loaded from: classes4.dex */
public class lr61 extends xw61 implements dr61 {
    public ft61 x;

    public lr61(Node node, String str) {
        super(node, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, str);
    }

    @Override // defpackage.dr61
    public ft61 a() {
        Element f;
        if (this.x == null && (f = f("CertRefs")) != null) {
            this.x = new ft61(f, this.b, this.c, this.w, 2);
        }
        return this.x;
    }
}
