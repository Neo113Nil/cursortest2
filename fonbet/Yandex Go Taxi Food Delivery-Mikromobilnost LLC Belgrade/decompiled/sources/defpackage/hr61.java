package defpackage;

import com.objsys.asn1j.runtime.Asn1Exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCP.KeyStore.CPKeyContainer;
import ru.CryptoPro.JCP.KeyStore.ContainerEncoder;
import ru.CryptoPro.JCP.KeyStore.ContainerReaderInterface;
import ru.CryptoPro.JCP.KeyStore.ContainerStore;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageReader;
import ru.CryptoPro.JCP.tools.ExpandException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.LocalMutex;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.PropertyExpander;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes4.dex */
public final class hr61 implements PrivilegedExceptionAction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hr61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ContainerReaderInterface) obj).getCreationDate();
            case 1:
                return ((URL) obj).openConnection();
            case 2:
                return ((ContainerStore) obj).a.lock();
            case 3:
                String expand = PropertyExpander.expand(LocalMutex.g);
                String str = (String) obj;
                if (str.length() >= 260) {
                    str = str.substring(str.length() - MSException.ERROR_NO_MORE_ITEMS);
                }
                File file = new File(expand);
                if (!file.isDirectory()) {
                    if (!file.mkdirs()) {
                        ny61.v(g8e.o("Failed to create path: ", expand));
                        return null;
                    }
                    try {
                        if (!Platform.isWindows() && !Platform.isAndroid) {
                            int waitFor = Runtime.getRuntime().exec("chmod a+rwxt " + file).waitFor();
                            if (waitFor != 0) {
                                JCPLogger.warning("Chmod shell script failed. Returned code: ", Integer.valueOf(waitFor));
                            }
                        }
                    } catch (IOException e) {
                        JCPLogger.warning("IOException while exec Shell Chmod Script", (Throwable) e);
                    } catch (InterruptedException e2) {
                        JCPLogger.warning("Shell Chmod Script interrupted", (Throwable) e2);
                    }
                }
                String absolutePath = new File(file, str).getAbsolutePath();
                if (absolutePath.length() >= 260) {
                    absolutePath = absolutePath.substring(0, MSException.ERROR_NO_MORE_ITEMS);
                }
                return absolutePath;
            case 4:
                File file2 = (File) obj;
                try {
                    if (file2.exists()) {
                        return new FileInputStream(file2);
                    }
                    return null;
                } catch (FileNotFoundException unused) {
                    return null;
                }
            case 5:
                HDImageReader hDImageReader = (HDImageReader) obj;
                String[] strArr = HDImageReader.y;
                try {
                    File file3 = new File(HDImageReader.getDirExpanded(hDImageReader.c, hDImageReader.w));
                    hDImageReader.x = file3;
                    if (!file3.isDirectory()) {
                        File file4 = hDImageReader.x;
                        try {
                            if (file4.getParentFile() != null && file4.getParentFile().mkdirs() && !Platform.isWindows() && !Platform.isAndroid) {
                                int waitFor2 = Runtime.getRuntime().exec("chmod a+rwxt " + file4.getParentFile()).waitFor();
                                if (waitFor2 != 0) {
                                    JCPLogger.warning("Chmod shell script failed. Returned code: ", Integer.valueOf(waitFor2));
                                }
                            }
                            if (file4.mkdirs() && !Platform.isWindows() && !Platform.isAndroid) {
                                String defaultChmodScript = HDImageReader.getDefaultChmodScript();
                                if (defaultChmodScript.length() == 0) {
                                    JCPLogger.warning("Security issue: no chmod shell script specified.");
                                } else {
                                    int waitFor3 = Runtime.getRuntime().exec(defaultChmodScript + " " + file4.getAbsolutePath()).waitFor();
                                    if (waitFor3 != 0) {
                                        JCPLogger.warning("Chmod shell script failed. Returned code: ", Integer.valueOf(waitFor3));
                                    }
                                }
                            }
                        } catch (IOException e3) {
                            JCPLogger.warning("IOException while exec Shell Chmod Script", (Throwable) e3);
                        } catch (InterruptedException e4) {
                            JCPLogger.warning("Shell Chmod Script interrupted", (Throwable) e4);
                        }
                    }
                    return null;
                } catch (ExpandException e5) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException(e5.getMessage());
                    try {
                        fileNotFoundException.initCause(e5);
                        throw fileNotFoundException;
                    } catch (Throwable unused2) {
                        throw fileNotFoundException;
                    }
                }
            case 6:
                i97 i97Var = new i97();
                ContainerEncoder containerEncoder = ((CPKeyContainer) obj).i;
                i97Var.a = containerEncoder.readName();
                try {
                    i97Var.b = containerEncoder.readHeaderV2();
                    i97Var.d = 2;
                } catch (Asn1Exception unused3) {
                    i97Var.c = containerEncoder.readHeaderV4();
                    i97Var.d = 4;
                }
                return i97Var;
            default:
                try {
                    ((LocalMutex) obj).lock();
                    return null;
                } catch (Exception e6) {
                    IOException iOException = new IOException(e6.toString());
                    iOException.initCause(e6);
                    throw iOException;
                }
        }
    }
}
