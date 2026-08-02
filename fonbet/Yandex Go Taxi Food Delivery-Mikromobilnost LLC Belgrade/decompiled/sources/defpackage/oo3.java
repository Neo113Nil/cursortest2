package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.RequestUserData;
import com.yandex.messaging.core.net.entities.RequestUserParams;
import com.yandex.messaging.internal.net.Error;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public final class oo3 extends w920 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public oo3(h7b h7bVar, String str) {
        this.a = 2;
        this.c = h7bVar;
        this.b = str;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        rvj0 rvj0Var;
        rb3 rb3Var;
        switch (this.a) {
            case 0:
                return new dg70(kvj0Var);
            case 1:
                return ouu.b(((to3) this.b).b, "request_user", RequestUserData.class, kvj0Var);
            default:
                File file = (File) ((h7b) this.c).c;
                boolean z = kvj0Var.J;
                String str = kvj0Var.c;
                int i = kvj0Var.w;
                if (z && (rvj0Var = kvj0Var.z) != null) {
                    try {
                        InputStream byteStream = rvj0Var.byteStream();
                        try {
                            String parent = file.getParent();
                            if (parent != null) {
                                File createTempFile = File.createTempFile(".atomic_", ".tmp", new File(parent));
                                createTempFile.deleteOnExit();
                                rb3Var = new rb3(file, createTempFile, new FileOutputStream(createTempFile));
                            } else {
                                ny61.v("Can't get directory to write to");
                                rb3Var = null;
                            }
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = byteStream.read(bArr);
                                    if (read == -1) {
                                        dg70 dg70Var = new dg70(file);
                                        rb3Var.close();
                                        byteStream.close();
                                        return dg70Var;
                                    }
                                    rb3Var.write(bArr, 0, read);
                                }
                            } finally {
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                        return new gg70();
                    }
                }
                return gg70.b(i, str);
        }
    }

    @Override // defpackage.w920
    public boolean e(ngz ngzVar) {
        switch (this.a) {
            case 0:
                ((kde) this.c).h(ngzVar.b == 403 ? Error.PRIVACY_RESTRICTIONS : Error.GENERIC);
                return true;
            default:
                return super.e(ngzVar);
        }
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((kde) obj2).g((kvj0) obj);
                break;
            case 1:
                ((go3) obj2).D(((RequestUserData) obj).user);
                break;
            default:
                h7b h7bVar = (h7b) obj2;
                z83.g(null, (Looper) h7bVar.w, Looper.myLooper());
                wf4 wf4Var = (wf4) ((m6) h7bVar.x).b;
                wf4Var.w.execute(new uf4((Object) wf4Var, obj, true, 0));
                break;
        }
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((to3) obj).b.a(null, "purge_contacts");
            case 1:
                RequestUserParams requestUserParams = new RequestUserParams();
                requestUserParams.bindPhoneNumber = true;
                to3 to3Var = (to3) obj;
                t4j0 a = to3Var.b.a(requestUserParams, "request_user");
                to3Var.f.b(a);
                return a;
            default:
                z83.g(null, (Looper) ((h7b) this.c).w, Looper.myLooper());
                t4j0 t4j0Var = new t4j0();
                t4j0Var.h((String) obj);
                return t4j0Var;
        }
    }

    public /* synthetic */ oo3(to3 to3Var, Object obj, int i) {
        this.a = i;
        this.b = to3Var;
        this.c = obj;
    }
}
