package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import io.appmetrica.analytics.IReporter;
import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import ru.CryptoPro.AdES.exception.AdESException;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public abstract class erd0 implements AdESAttributeDecoder {
    public Object a;
    public final Object b;
    public Object c;
    public final AbstractCollection w;

    public erd0(ViewGroup viewGroup, v8o v8oVar) {
        this.a = viewGroup;
        this.b = v8oVar;
        this.c = new aq80(this);
        this.w = new ArrayList();
    }

    public abstract void a();

    public void b() {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting existing certificate-values...");
        i3 i3Var = (i3) CAdESUtility.getSingleAttributeValue(((acs0) this.b).getUnsignedAttributes(), b490.M3);
        if (i3Var != null) {
            for (int i = 0; i < i3Var.size(); i++) {
                try {
                    ((HashSet) this.w).add((X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(((i3) i3Var.A(i)).getEncoded())));
                } catch (Exception e) {
                    throw new CAdESException(e, IAdESException.ecInternal);
                }
            }
        }
        JCPLogger.subExit();
    }

    public void c(View view) {
        Object tag = view.getTag(cfh0.micro_widget_view_holder_tag);
        if (tag instanceof crd0) {
            ((crd0) tag).b = true;
            return;
        }
        v8o v8oVar = (v8o) this.b;
        ((IReporter) v8oVar.b.getValue()).reportError("PlusViewGroupAdapter: make dirty by tag", "Has not tag at ".concat(view.getClass().getSimpleName()), new IllegalStateException());
    }

    public abstract void d(crd0 crd0Var, int i);

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    public void decode() {
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding base signer structure...");
        a();
        try {
            b();
        } catch (AdESException e) {
            JCPLogger.ignoredException(e);
        }
        JCPLogger.subExit();
    }

    public abstract crd0 e(ViewGroup viewGroup, int i);

    public void f(i iVar) {
        iVar.a((aq80) this.c);
        ArrayList arrayList = (ArrayList) this.w;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            crd0 crd0Var = (crd0) arrayList.get(i);
            crd0Var.c = i;
            if (crd0Var.b) {
                d(crd0Var, i);
            }
            crd0Var.b = false;
        }
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    public Set getExistingCertificateValues() {
        return Collections.unmodifiableSet((HashSet) this.w);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    public Object getSignerCertificateReference() {
        return this.c;
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    public void setProvider(String str) {
        this.a = str;
    }

    public erd0(acs0 acs0Var) {
        this.a = null;
        this.w = new HashSet();
        this.b = acs0Var;
    }
}
