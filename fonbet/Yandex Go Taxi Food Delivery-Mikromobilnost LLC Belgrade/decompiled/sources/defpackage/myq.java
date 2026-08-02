package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public final class myq {
    public final cyj a;

    public myq(Context context, long j, String str) {
        File file = new File(context.getCacheDir(), str);
        PackageInfo f = vqb1.f(context);
        Long valueOf = f != null ? Long.valueOf(f.getLongVersionCode()) : null;
        try {
            this.a = cyj.e(file, valueOf != null ? (int) valueOf.longValue() : 0, j);
        } catch (IOException e) {
            if (ydz.a.a()) {
                ydz.c("FileCache", "Can't open files cache", e);
            }
            ny61.o(e);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InputStream inputStream, String str) {
        kzo kzoVar;
        cyj cyjVar = this.a;
        String encode = Uri.encode(str);
        synchronized (cyjVar) {
            try {
                if (cyjVar.B == null) {
                    throw new IllegalStateException("cache is closed");
                }
                char[] cArr = {HexString.CHAR_SPACE, '\t', HexString.LF, '\n'};
                for (int i = 0; i < 4; i++) {
                    if (encode.indexOf(cArr[i]) != -1) {
                        throw new IllegalArgumentException("No spaces, tabs, breaklines allowed as key");
                    }
                }
                qxj qxjVar = (qxj) cyjVar.C.get(encode);
                if (qxjVar == null) {
                    qxjVar = new qxj(cyjVar, encode);
                    cyjVar.C.put(encode, qxjVar);
                } else if (qxjVar.d != null) {
                    kzoVar = null;
                    if (kzoVar != null) {
                        return;
                    }
                    try {
                        try {
                            OutputStream v = kzoVar.v();
                            try {
                                bhb1.c(inputStream, v);
                                v.close();
                                boolean z = kzoVar.b;
                                cyj cyjVar2 = (cyj) kzoVar.x;
                                if (!z) {
                                    cyj.a(cyjVar2, kzoVar, true);
                                    return;
                                } else {
                                    cyj.a(cyjVar2, kzoVar, false);
                                    cyjVar2.w(((qxj) kzoVar.c).a);
                                    return;
                                }
                            } finally {
                            }
                        } catch (IOException e) {
                            kzoVar.b = true;
                            throw e;
                        }
                    } catch (Throwable th) {
                        boolean z2 = kzoVar.b;
                        cyj cyjVar3 = (cyj) kzoVar.x;
                        if (z2) {
                            cyj.a(cyjVar3, kzoVar, false);
                            cyjVar3.w(((qxj) kzoVar.c).a);
                        } else {
                            cyj.a(cyjVar3, kzoVar, true);
                        }
                        throw th;
                    }
                }
                kzo kzoVar2 = new kzo(cyjVar, qxjVar);
                qxjVar.d = kzoVar2;
                cyjVar.B.write("DIRTY " + encode + '\n');
                cyjVar.B.flush();
                kzoVar = kzoVar2;
                if (kzoVar != null) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
