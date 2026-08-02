package defpackage;

import java.awt.Component;
import java.util.ResourceBundle;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ru.CryptoPro.JCP.ControlPane.MainControlPane;
import ru.CryptoPro.JCP.ControlPane.StaticLastFrame;
import ru.CryptoPro.JCP.ControlPane.images.IconsChooser;
import ru.CryptoPro.JCP.pref.BundleChooser;

/* loaded from: classes4.dex */
public class eq61 extends gq61 {
    public static final ResourceBundle d = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");

    @Override // defpackage.gq61
    public final boolean c(String[] strArr) {
        int i;
        JFrame jFrame;
        Object component = StaticLastFrame.getComponent();
        MainControlPane.setStyle();
        ResourceBundle resourceBundle = d;
        if (component == null) {
            i = JOptionPane.showConfirmDialog((Component) null, strArr, resourceBundle.getString("container.work"), 0, 1, IconsChooser.QUEST_LARGE_ICON);
        } else {
            if (component instanceof JFrame) {
                jFrame = (JFrame) component;
            } else if (component instanceof JDialog) {
                jFrame = (JDialog) component;
            } else if (component instanceof JPanel) {
                jFrame = (JPanel) component;
            } else {
                i = -1;
            }
            i = JOptionPane.showConfirmDialog(jFrame, strArr, resourceBundle.getString("container.work"), 0, 1, IconsChooser.QUEST_LARGE_ICON);
        }
        return i == 0;
    }
}
