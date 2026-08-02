package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatParam;
import com.yandex.messaging.internal.PrivateChat;
import com.yandex.messaging.internal.StaffChat;
import com.yandex.messaging.internal.net.Error;
import com.yandex.messaging.internal.net.file.CacheType;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import java.io.File;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes15.dex */
public final class h7b implements x08, b9b, fo3, w0r {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;

    public h7b(String str, kdf0 kdf0Var, m6 m6Var, File file) {
        this.a = 1;
        this.w = new Handler().getLooper();
        this.c = file;
        this.x = m6Var;
        String uuid = UUID.randomUUID().toString();
        oo3 oo3Var = new oo3(this, str);
        Looper looper = kdf0Var.a;
        z83.g(null, looper, Looper.myLooper());
        hfy hfyVar = new hfy();
        z83.g(null, looper, Looper.myLooper());
        this.b = new jdf0(kdf0Var, uuid, oo3Var, hfyVar);
    }

    @Override // defpackage.b9b
    public void a(Error error) {
    }

    @Override // defpackage.x08
    public final void cancel() {
        switch (this.a) {
            case 0:
                ((t2r) ((i7b) this.w).f.get()).a((bz31) this.x);
                v1b v1bVar = (v1b) this.c;
                if (v1bVar != null) {
                    v1bVar.close();
                }
                this.c = null;
                x08 x08Var = (x08) this.b;
                if (x08Var != null) {
                    x08Var.cancel();
                }
                this.b = null;
                break;
            case 1:
                z83.g(null, (Looper) this.w, Looper.myLooper());
                ((x08) this.b).cancel();
                this.b = wfz.z;
                this.x = null;
                break;
            case 2:
                this.c = null;
                xo3 xo3Var = (xo3) this.w;
                if (xo3Var != null) {
                    xo3Var.cancel();
                    this.w = null;
                }
                e1k e1kVar = (e1k) this.b;
                if (e1kVar != null) {
                    e1kVar.close();
                    this.b = null;
                    break;
                }
                break;
            default:
                this.c = null;
                z0r z0rVar = (z0r) this.w;
                if (z0rVar != null) {
                    z0rVar.close();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.w0r
    public void f(long j, long j2) {
    }

    @Override // defpackage.fo3
    public void g(Error error) {
    }

    @Override // defpackage.fo3
    public void h(ChatData chatData, UserData userData) {
        l020 C = ((k020) ((r1s) this.x).b).C();
        if (userData != null) {
            try {
                C.P0(userData);
            } catch (Throwable th) {
                if (C != null) {
                    try {
                        C.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        C.I(chatData);
        C.s();
        C.close();
        Runnable runnable = (Runnable) this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.b9b
    public void k(j3b j3bVar, s020 s020Var) {
        Runnable runnable = (Runnable) this.c;
        if (runnable == null) {
            return;
        }
        if (!j3bVar.H) {
            runnable.run();
            return;
        }
        if (!j3bVar.D) {
            runnable.run();
            return;
        }
        to3 to3Var = (to3) ((r1s) this.x).c;
        String str = j3bVar.e;
        Objects.requireNonNull(str);
        to3Var.getClass();
        this.w = to3Var.a.a(new io3(4, to3Var, new CreatePrivateChatParam(str, null), this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r6.exists() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r6.exists() == false) goto L29;
     */
    @Override // defpackage.w0r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        File file;
        File file2;
        if (ny31.a[fileProgressObservable$Listener$Status.ordinal()] == 1) {
            myq d = ((oy31) this.x).a.d(CacheType.VOICE);
            String str = (String) this.b;
            String encode = Uri.encode(str);
            cyj cyjVar = d.a;
            lyq lyqVar = new lyq(cyjVar, encode);
            String encode2 = Uri.encode(str);
            if (cyjVar.B == null) {
                ny61.r("cache is closed");
                return;
            }
            qxj qxjVar = (qxj) cyjVar.C.get(encode2);
            if (qxjVar != null && qxjVar.c) {
                file = qxjVar.a(0);
            }
            file = null;
            if (file == null) {
                lyqVar = null;
            }
            if (lyqVar != null) {
                cyj cyjVar2 = lyqVar.a;
                String str2 = lyqVar.b;
                if (cyjVar2.B == null) {
                    ny61.r("cache is closed");
                    return;
                }
                qxj qxjVar2 = (qxj) cyjVar2.C.get(str2);
                if (qxjVar2 != null && qxjVar2.c) {
                    file2 = qxjVar2.a(0);
                }
                file2 = null;
                Uri fromFile = file2 != null ? Uri.fromFile(file2) : null;
                if (fromFile != null) {
                    qq31 qq31Var = (qq31) this.c;
                    if (qq31Var != null) {
                        qq31Var.invoke(fromFile);
                        return;
                    }
                    return;
                }
            }
            z83.i();
        }
    }

    public h7b(r1s r1sVar, PrivateChat privateChat, uhm uhmVar) {
        this.a = 2;
        this.x = r1sVar;
        this.c = uhmVar;
        this.b = ((h9b) r1sVar.w).c(privateChat, this);
    }

    public h7b(r1s r1sVar, StaffChat staffChat, uhm uhmVar) {
        this.a = 2;
        this.x = r1sVar;
        this.c = uhmVar;
        this.b = ((h9b) r1sVar.w).c(staffChat, this);
    }

    public h7b(oy31 oy31Var, String str, qq31 qq31Var) {
        this.a = 3;
        this.x = oy31Var;
        this.b = str;
        this.c = qq31Var;
        a1r a1rVar = oy31Var.b;
        a1rVar.getClass();
        this.w = new z0r(a1rVar, str, this);
        tje.e();
    }

    public h7b(i7b i7bVar, bz31 bz31Var, yw80 yw80Var, long j, jsa0 jsa0Var) {
        this.a = 0;
        this.w = i7bVar;
        this.x = bz31Var;
        this.c = ((t2r) i7bVar.f.get()).b(bz31Var, new g7b(this, i7bVar, yw80Var, j, jsa0Var));
    }
}
