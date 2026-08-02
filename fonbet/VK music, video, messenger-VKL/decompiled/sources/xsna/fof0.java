package xsna;

import java.util.regex.Pattern;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;

/* compiled from: ReefOkhttpNetworkClient.kt */
/* loaded from: classes5.dex */
public final class fof0 implements bof0 {
    public final bpn0 a = new bpn0(new qbe0(4));

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051 A[Catch: all -> 0x005a, TryCatch #3 {all -> 0x005a, blocks: (B:3:0x0001, B:17:0x0041, B:29:0x0051, B:30:0x0054, B:25:0x0057), top: B:2:0x0001 }] */
    @Override // xsna.bof0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(String str, String str2, String str3) {
        okhttp3.v vVar;
        p.a aVar;
        byte[] bytes;
        try {
            t.a aVar2 = okhttp3.t.Companion;
            Pattern pattern = okhttp3.m.e;
            okhttp3.m a = m.a.a(str3);
            aVar2.getClass();
            okhttp3.s a2 = t.a.a(str2, a);
            try {
                try {
                    aVar = new p.a();
                    aVar.i(str);
                    try {
                        aVar.f("POST", a2);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    vVar = ((f8f0) ((okhttp3.o) this.a.getValue()).a(aVar.b())).execute().h;
                    if (vVar != null) {
                        try {
                            bytes = vVar.bytes();
                        } catch (Exception unused) {
                            if (vVar != null) {
                                vVar.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (vVar != null) {
                            }
                            throw th;
                        }
                    } else {
                        bytes = null;
                    }
                    if (vVar != null) {
                        vVar.close();
                    }
                    return bytes;
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    vVar = null;
                    if (vVar != null) {
                        vVar.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                vVar = null;
            }
        } catch (Throwable unused3) {
        }
    }
}
