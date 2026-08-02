package defpackage;

import com.adjust.sdk.Constants;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Vector;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import ru.CryptoPro.CAdES.CAdESSignature;
import ru.CryptoPro.CAdES.CAdESSigner;
import ru.CryptoPro.CAdES.exception.CAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class os61 extends v5a1 implements ActionListener {
    public JButton d;
    public JLabel e;
    public JPanel f;
    public JPanel g;
    public JTable h;
    public final Vector i = new Vector();

    public os61() {
        i();
        ResourceBundle resourceBundle = qs61.a;
        this.h.setModel(new iv61(new String[]{resourceBundle.getString("signature.table.name"), resourceBundle.getString("signature.table.email"), resourceBundle.getString("signature.table.signing.date")}));
        this.h.setSelectionMode(0);
        this.d.addActionListener(this);
    }

    public static void f(AbstractButton abstractButton, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        char c = 0;
        int i2 = -1;
        boolean z = false;
        while (i < str.length()) {
            if (str.charAt(i) == '&') {
                i++;
                if (i == str.length()) {
                    break;
                }
                if (!z && str.charAt(i) != '&') {
                    char charAt = str.charAt(i);
                    i2 = stringBuffer.length();
                    c = charAt;
                    z = true;
                }
            }
            stringBuffer.append(str.charAt(i));
            i++;
        }
        abstractButton.setText(stringBuffer.toString());
        if (z) {
            abstractButton.setMnemonic(c);
            abstractButton.setDisplayedMnemonicIndex(i2);
        }
    }

    public static void g(JLabel jLabel, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        char c = 0;
        int i2 = -1;
        boolean z = false;
        while (i < str.length()) {
            if (str.charAt(i) == '&') {
                i++;
                if (i == str.length()) {
                    break;
                }
                if (!z && str.charAt(i) != '&') {
                    char charAt = str.charAt(i);
                    i2 = stringBuffer.length();
                    c = charAt;
                    z = true;
                }
            }
            stringBuffer.append(str.charAt(i));
            i++;
        }
        jLabel.setText(stringBuffer.toString());
        if (z) {
            jLabel.setDisplayedMnemonic(c);
            jLabel.setDisplayedMnemonicIndex(i2);
        }
    }

    public final void h(CAdESSignature cAdESSignature, Set set, Set set2) {
        String a;
        String a2;
        JCPLogger.subEnter();
        for (CAdESSigner cAdESSigner : cAdESSignature.getCAdESSignerInfos()) {
            try {
                cAdESSigner.verify(set, set2);
            } catch (CAdESException e) {
                JCPLogger.warning(e);
            }
            int i = bu61.c;
            X509Certificate signerCertificate = cAdESSigner.getSignerCertificate();
            String str = null;
            if (signerCertificate != null) {
                try {
                    str = x2v.d(jc51.m(new JcaX509CertificateHolder(signerCertificate).a.b.A).o(xc4.d)[0].m().b);
                } catch (CertificateEncodingException unused) {
                }
                a = bu61.a(cAdESSigner, b490.w3);
                a2 = bu61.a(cAdESSigner, b490.r3);
            } else {
                a = null;
                str = qs61.b;
                a2 = null;
            }
            this.h.getModel().addRow(new String[]{str, a2, a});
            Vector vector = this.i;
            ity ityVar = new ity();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (set != null) {
                hashSet.addAll(set);
            }
            if (set2 != null) {
                hashSet2.addAll(set2);
            }
            vector.add(ityVar);
        }
        JCPLogger.subExit();
    }

    public final void i() {
        JPanel jPanel = new JPanel();
        this.g = jPanel;
        jPanel.setLayout(new GridLayoutManager(4, 1, new Insets(5, 5, 5, 5), -1, -1));
        this.g.setPreferredSize(new Dimension(Constants.MINIMAL_ERROR_STATUS_CODE, 500));
        JPanel jPanel2 = new JPanel();
        jPanel2.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        this.g.add(jPanel2, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel = new JLabel();
        this.e = jLabel;
        g(jLabel, ResourceBundle.getBundle("ru/CryptoPro/CAdES/tools/gui/resources/gui").getString("signature.form"));
        jPanel2.add(this.e, new GridConstraints(0, 0, 1, 1, 0, 3, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 1, false));
        this.g.add(new Spacer(), new GridConstraints(3, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        this.f = jPanel3;
        jPanel3.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        this.g.add(this.f, new GridConstraints(1, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.f.setBorder(BorderFactory.createTitledBorder(ResourceBundle.getBundle("ru/CryptoPro/CAdES/tools/gui/resources/gui").getString("signature.form.signatures")));
        JScrollPane jScrollPane = new JScrollPane();
        this.f.add(jScrollPane, new GridConstraints(0, 0, 1, 1, 0, 3, 5, 5, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JTable jTable = new JTable();
        this.h = jTable;
        jScrollPane.setViewportView(jTable);
        JButton jButton = new JButton();
        this.d = jButton;
        jButton.setMargin(new Insets(2, 14, 2, 14));
        f(this.d, ResourceBundle.getBundle("ru/CryptoPro/CAdES/tools/gui/resources/gui").getString("signature.form.signer.info"));
        this.g.add(this.d, new GridConstraints(2, 0, 1, 1, 4, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
    }
}
