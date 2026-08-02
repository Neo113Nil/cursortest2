package defpackage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes11.dex */
public final class c491 {
    public static final il0 c = new il0("LocalTestingConfigParser", 1);
    public final XmlPullParser a;
    public final gr81 b;

    public c491(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
        mc91 mc91Var = ztb1.a;
        gr81 gr81Var = new gr81(5);
        gr81Var.c = new HashMap();
        this.b = gr81Var;
    }

    public static mc91 a(File file) {
        File file2 = new File(file, "local_testing_config.xml");
        if (!file2.exists()) {
            return ztb1.a;
        }
        try {
            FileReader fileReader = new FileReader(file2);
            try {
                XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                newPullParser.setInput(fileReader);
                c491 c491Var = new c491(newPullParser);
                c491Var.b("local-testing-config", new lm71(28, c491Var));
                gr81 gr81Var = c491Var.b;
                Map map = (Map) gr81Var.c;
                mc91 mc91Var = null;
                if (map != null) {
                    Map unmodifiableMap = Collections.unmodifiableMap(map);
                    if (unmodifiableMap != null) {
                        gr81Var.c = unmodifiableMap;
                        mc91Var = new mc91((Integer) gr81Var.b, (Map) gr81Var.c);
                    } else {
                        ny61.t("Null splitInstallErrorCodeByModule");
                    }
                } else {
                    ny61.r("Property \"splitInstallErrorCodeByModule\" has not been set");
                }
                fileReader.close();
                return mc91Var;
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
            return ztb1.a;
        }
    }

    public final void b(String str, ewb1 ewb1Var) {
        while (true) {
            XmlPullParser xmlPullParser = this.a;
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if (!xmlPullParser.getName().equals(str)) {
                    throw new XmlPullParserException(unr0.p("Expected '", str, "' tag but found '", xmlPullParser.getName(), "'."), xmlPullParser, null);
                }
                ewb1Var.zza();
            }
        }
    }
}
