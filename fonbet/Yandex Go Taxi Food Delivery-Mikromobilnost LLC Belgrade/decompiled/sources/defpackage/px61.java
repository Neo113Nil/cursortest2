package defpackage;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.util.ResourceBundle;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/* loaded from: classes4.dex */
public class px61 {
    public JPanel a;
    public JProgressBar b;
    public JButton c;
    public JLabel d;
    public JPanel e;

    public px61() {
        c();
    }

    public static void a(AbstractButton abstractButton, String str) {
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

    public static void b(JLabel jLabel, String str) {
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

    public final void c() {
        JPanel jPanel = new JPanel();
        this.a = jPanel;
        jPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        JPanel jPanel2 = new JPanel();
        this.e = jPanel2;
        jPanel2.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        this.a.add(this.e, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel3 = new JPanel();
        jPanel3.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        this.e.add(jPanel3, new GridConstraints(3, 0, 1, 1, 2, 1, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel4 = new JPanel();
        jPanel4.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel4, new GridConstraints(0, 1, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JProgressBar jProgressBar = new JProgressBar();
        this.b = jProgressBar;
        jPanel4.add(jProgressBar, new GridConstraints(1, 0, 1, 1, 0, 1, 4, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JButton jButton = new JButton();
        this.c = jButton;
        jButton.setFocusable(false);
        this.c.setFont(new Font(this.c.getFont().getName(), this.c.getFont().getStyle(), 16));
        this.c.setMargin(new Insets(2, 14, 2, 14));
        a(this.c, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/frameres").getString("CANCELKey"));
        jPanel4.add(this.c, new GridConstraints(3, 0, 1, 1, 0, 0, 3, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel5 = new JPanel();
        jPanel5.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel4.add(jPanel5, new GridConstraints(4, 0, 1, 1, 0, 3, 3, 3, new Dimension(-1, 200), new Dimension(-1, 200), (Dimension) null, 0, false));
        jPanel5.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel6 = new JPanel();
        jPanel6.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel4.add(jPanel6, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel6.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel7 = new JPanel();
        jPanel7.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel4.add(jPanel7, new GridConstraints(2, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel7.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel8 = new JPanel();
        jPanel8.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel8, new GridConstraints(0, 2, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel8.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JPanel jPanel9 = new JPanel();
        jPanel9.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jPanel3.add(jPanel9, new GridConstraints(0, 0, 1, 1, 0, 3, 3, 3, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        jPanel9.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 1, 4, 1, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        JLabel jLabel = new JLabel();
        this.d = jLabel;
        jLabel.setFont(new Font(this.d.getFont().getName(), this.d.getFont().getStyle(), 18));
        this.d.setHorizontalAlignment(0);
        this.d.setHorizontalTextPosition(11);
        b(this.d, ResourceBundle.getBundle("ru/CryptoPro/JCP/pref/resources/exres").getString("BioFrameText"));
        this.e.add(this.d, new GridConstraints(1, 0, 1, 1, 0, 1, 0, 0, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.e.add(new Spacer(), new GridConstraints(0, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
        this.e.add(new Spacer(), new GridConstraints(2, 0, 1, 1, 0, 2, 1, 4, (Dimension) null, (Dimension) null, (Dimension) null, 0, false));
    }
}
