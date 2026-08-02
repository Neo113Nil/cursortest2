package xsna;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class ytz0 {
    public static final lq01 c = new lq01("LocalTestingConfigParser");
    public final XmlPullParser a;
    public final ktz0 b;

    public ytz0(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
        w501 w501Var = yq01.a;
        ktz0 ktz0Var = new ktz0(11);
        ktz0Var.d = new HashMap();
        this.b = ktz0Var;
    }

    public static w501 a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return yq01.a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                ytz0 ytz0Var = new ytz0(newPullParser);
                ytz0Var.b("local-testing-config", new eml(ytz0Var));
                w501 q = ytz0Var.b.q();
                fileReader.close();
                return q;
            } catch (Throwable th) {
                try {
                    fileReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e) {
            c.e("%s can not be parsed, using default. Error: %s", "local_testing_config.xml", e.getMessage());
            return yq01.a;
        }
    }

    public final void b(String str, ws01 ws01Var) throws IOException, XmlPullParserException {
        while (true) {
            XmlPullParser xmlPullParser = this.a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException(ss9.a("Expected '", str, "' tag but found '", xmlPullParser.getName(), "'."), xmlPullParser, null);
                }
                ws01Var.zza();
            }
        }
    }
}
