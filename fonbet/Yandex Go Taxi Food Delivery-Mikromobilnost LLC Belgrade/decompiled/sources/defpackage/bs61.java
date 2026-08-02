package defpackage;

import java.io.File;
import java.io.IOException;
import java.security.PrivilegedAction;
import ru.CryptoPro.JCP.tools.JarTools;

/* loaded from: classes4.dex */
public final class bs61 implements PrivilegedAction {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;

    public bs61(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.jar.JarFile, java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object run() {
        String str;
        ?? r1;
        String str2 = null;
        try {
            ?? jar = JarTools.getJAR(Class.forName(this.a));
            r1 = jar;
            if (jar != 0) {
                try {
                    str2 = jar.getName();
                    r1 = jar;
                    if (this.b) {
                        int lastIndexOf = str2.lastIndexOf(File.separatorChar);
                        r1 = jar;
                        if (lastIndexOf != -1) {
                            str2 = str2.substring(lastIndexOf + 1);
                            r1 = jar;
                        }
                    }
                } catch (Exception | NoClassDefFoundError unused) {
                    str = null;
                    str2 = jar;
                    r1 = str2;
                    str2 = str;
                    if (r1 != 0) {
                    }
                    return str2;
                }
            }
        } catch (Exception | NoClassDefFoundError unused2) {
            str = null;
        }
        if (r1 != 0) {
            try {
                r1.close();
            } catch (IOException unused3) {
            }
        }
        return str2;
    }
}
