package xsna;

import com.vk.log.L;
import java.util.regex.Pattern;
import okhttp3.m;
import okhttp3.p;
import okhttp3.t;

/* compiled from: VkReefNetworkClient.kt */
/* loaded from: classes5.dex */
public final class pfv0 implements bof0 {
    public final ufm0 a;
    public final rfv0 b;

    public pfv0(ufm0 ufm0Var, rfv0 rfv0Var) {
        this.a = ufm0Var;
        this.b = rfv0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: Exception -> 0x0068, TryCatch #4 {Exception -> 0x0068, blocks: (B:3:0x0003, B:14:0x0064, B:31:0x0087, B:32:0x008a, B:26:0x0081), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[Catch: Exception -> 0x0068, SYNTHETIC, TRY_LEAVE, TryCatch #4 {Exception -> 0x0068, blocks: (B:3:0x0003, B:14:0x0064, B:31:0x0087, B:32:0x008a, B:26:0x0081), top: B:2:0x0003 }] */
    @Override // xsna.bof0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a(String str, String str2, String str3) {
        okhttp3.v vVar;
        byte[] bytes;
        rfv0 rfv0Var = this.b;
        try {
            t.a aVar = okhttp3.t.Companion;
            Pattern pattern = okhttp3.m.e;
            okhttp3.m a = m.a.a(str3);
            aVar.getClass();
            okhttp3.s a2 = t.a.a(str2, a);
            try {
                p.a aVar2 = new p.a();
                aVar2.i(str);
                aVar2.f("POST", a2);
                okhttp3.p b = aVar2.b();
                okhttp3.o oVar = (okhttp3.o) this.a.invoke();
                if (oVar != null) {
                    okhttp3.u execute = ((f8f0) oVar.a(b)).execute();
                    if (rfv0Var != null) {
                        rfv0Var.b.onNext(new viv(execute.e));
                    }
                    okhttp3.v vVar2 = execute.h;
                    if (vVar2 != null) {
                        try {
                            bytes = vVar2.bytes();
                        } catch (Exception e) {
                            vVar = vVar2;
                            e = e;
                            if (rfv0Var != null) {
                                try {
                                    rfv0Var.b.onNext(new g360(e));
                                } catch (Throwable th) {
                                    th = th;
                                    if (vVar != null) {
                                        throw th;
                                    }
                                    vVar.close();
                                    throw th;
                                }
                            }
                            L.g("can't read response: ", e);
                            if (vVar != null) {
                                vVar.close();
                            }
                            return null;
                        } catch (Throwable th2) {
                            vVar = vVar2;
                            th = th2;
                            if (vVar != null) {
                            }
                        }
                    } else {
                        bytes = null;
                    }
                    if (vVar2 == null) {
                        return bytes;
                    }
                    vVar2.close();
                    return bytes;
                }
            } catch (Exception e2) {
                e = e2;
                vVar = null;
            } catch (Throwable th3) {
                th = th3;
                vVar = null;
            }
            return null;
        } catch (Exception e3) {
            L.i(e3);
            return null;
        }
    }
}
