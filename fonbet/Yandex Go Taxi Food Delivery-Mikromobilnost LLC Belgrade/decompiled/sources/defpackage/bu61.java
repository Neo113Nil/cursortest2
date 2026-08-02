package defpackage;

import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.JFrame;
import ru.CryptoPro.CAdES.CAdESParameters;
import ru.CryptoPro.CAdES.CAdESSignature;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class bu61 implements qs61 {
    public static final /* synthetic */ int c = 0;

    static {
        HashMap hashMap = new HashMap();
        String str = b490.w3.a;
        ResourceBundle resourceBundle = qs61.a;
        hashMap.put(str, resourceBundle.getString("about.signature.signer.signing.date"));
        hashMap.put(b490.r3.a, resourceBundle.getString("about.signature.signer.email"));
        hashMap.put(b490.t3.a, resourceBundle.getString("about.signature.signer.content.type"));
        hashMap.put(b490.u3.a, resourceBundle.getString("about.signature.signer.message.digest"));
        hashMap.put(b490.x3.a, resourceBundle.getString("about.signature.signer.cosigner"));
        hashMap.put(b490.G3.a, resourceBundle.getString("about.signature.signer.signing.cert"));
        hashMap.put(b490.I3.a, resourceBundle.getString("about.signature.signer.signing.cert.v2"));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(b490.J3.a, resourceBundle.getString("about.signature.signer.signature.timestamp"));
        hashMap2.put(b490.K3.a, resourceBundle.getString("about.signature.signer.certificate.refs"));
        hashMap2.put(b490.L3.a, resourceBundle.getString("about.signature.signer.revocation.refs"));
        hashMap2.put(b490.M3.a, resourceBundle.getString("about.signature.signer.certificate.values"));
        hashMap2.put(b490.O3.a, resourceBundle.getString("about.signature.signer.revocation.values"));
        hashMap2.put(b490.P3.a, resourceBundle.getString("about.signature.signer.revocation.timestamp"));
        hashMap2.put(CAdESParameters.id_aa_ets_archiveTimestampV3.a, resourceBundle.getString("about.signature.signer.archive.timestamp.v3"));
    }

    public static String a(CAdESSigner cAdESSigner, u2 u2Var) {
        vc3 c2;
        xc3 signerSignedAttributes = cAdESSigner.getSignerSignedAttributes();
        if (signerSignedAttributes == null || (c2 = signerSignedAttributes.c(u2Var)) == null) {
            return null;
        }
        lqf lqfVar = (lqf) c2.b;
        if (u2Var.q(b490.w3)) {
            return ((v3) lqfVar.a[0]).u();
        }
        if (u2Var.q(b490.r3)) {
            return quu0.a(((xpf) lqfVar.a[0]).a);
        }
        return null;
    }

    public static void b(CAdESSignature cAdESSignature, Set set, Set set2) {
        JCPLogger.subEnter();
        JFrame jFrame = new JFrame("CAdES Signature Viewer");
        jFrame.setResizable(false);
        os61 os61Var = new os61();
        os61Var.h(cAdESSignature, set, set2);
        jFrame.setContentPane(os61Var.g);
        jFrame.pack();
        jFrame.setDefaultCloseOperation(2);
        jFrame.setVisible(true);
        JCPLogger.subExit();
    }
}
