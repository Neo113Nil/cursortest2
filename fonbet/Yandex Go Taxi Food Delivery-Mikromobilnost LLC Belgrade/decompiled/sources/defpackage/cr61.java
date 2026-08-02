package defpackage;

import java.io.IOException;
import java.security.PrivilegedAction;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import ru.CryptoPro.JCP.tools.JarTools;

/* loaded from: classes4.dex */
public final class cr61 implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ String c;

    public cr61(Class cls, String str, String str2) {
        this.a = str;
        this.b = cls;
        this.c = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        JarFile jarFile;
        String value;
        String str = this.c;
        String str2 = this.a;
        ?? r3 = 0;
        try {
            try {
                jarFile = JarTools.getJAR(this.b);
                try {
                    if (jarFile != null) {
                        Manifest manifest = jarFile.getManifest();
                        if (manifest != null && (value = manifest.getMainAttributes().getValue(str)) != null) {
                            str2 = value;
                        }
                    } else {
                        ResourceBundle bundle = ResourceBundle.getBundle(JarTools.ATTRIBUTE_BUNDLE_NAME, Locale.getDefault());
                        String string = bundle != null ? bundle.getString(str) : null;
                        if (string != null) {
                            str2 = string;
                        }
                    }
                } catch (Exception unused) {
                    ResourceBundle bundle2 = ResourceBundle.getBundle(JarTools.ATTRIBUTE_BUNDLE_NAME, Locale.getDefault());
                    String string2 = bundle2 != null ? bundle2.getString(str) : null;
                    if (string2 != null) {
                        str2 = string2;
                    }
                }
            } catch (Throwable th) {
                th = th;
                r3 = this;
                if (r3 != 0) {
                    try {
                        r3.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            jarFile = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
            }
            throw th;
        }
        return str2;
    }
}
