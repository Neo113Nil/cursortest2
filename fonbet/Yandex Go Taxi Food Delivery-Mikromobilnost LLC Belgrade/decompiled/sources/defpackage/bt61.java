package defpackage;

import java.util.ResourceBundle;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public class bt61 extends gq61 {
    public static final ResourceBundle d = BundleChooser.getDefaultBundle(BundleChooser.EXRES_NAME);

    @Override // defpackage.gq61
    public final boolean c(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strArr) {
            stringBuffer.append("\n");
            stringBuffer.append(str);
        }
        JCPLogger.info(stringBuffer.toString());
        JCPLogger.info(d.getString("security.level.answer.no"));
        return false;
    }
}
