package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;

/* loaded from: classes11.dex */
public final class nwk0 {
    public static final String[] a = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache", "/data", "/dev"};
    public static final String[] b = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List a() {
        InputStream inputStream;
        Throwable th;
        List list = null;
        try {
            inputStream = Runtime.getRuntime().exec("mount").getInputStream();
            try {
                list = evu0.W(new Scanner(inputStream).useDelimiter("\\A").next(), new String[]{"\n"}, (r2 & 4) != 0 ? 0 : 2);
                if (inputStream == null) {
                    return list;
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th3) {
            inputStream = null;
            th = th3;
        }
        try {
            inputStream.close();
        } catch (Exception unused4) {
        }
        return list;
    }

    public static boolean b(String str) {
        try {
            String[] strArr = a;
            for (int i = 0; i < 14; i++) {
                if (new File(strArr[i], str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            EbsLogger.INSTANCE.error(e);
            return true;
        }
    }

    public static boolean c(String str) {
        Throwable th;
        Process process;
        BufferedReader bufferedReader = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{str, "su"});
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process.getInputStream()));
                try {
                    boolean z = bufferedReader2.readLine() != null;
                    try {
                        bufferedReader2.close();
                    } catch (Exception unused) {
                    }
                    try {
                        process.destroy();
                    } catch (Exception unused2) {
                    }
                    return z;
                } catch (Exception unused3) {
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused4) {
                        }
                    }
                    if (process != null) {
                        try {
                            process.destroy();
                        } catch (Exception unused5) {
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception unused6) {
                        }
                    }
                    if (process == null) {
                        throw th;
                    }
                    try {
                        process.destroy();
                        throw th;
                    } catch (Exception unused7) {
                        throw th;
                    }
                }
            } catch (Exception unused8) {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused9) {
            process = null;
        } catch (Throwable th4) {
            th = th4;
            process = null;
        }
    }
}
