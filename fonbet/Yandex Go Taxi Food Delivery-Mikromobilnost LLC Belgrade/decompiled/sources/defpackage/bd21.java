package defpackage;

import com.yandex.messaging.core.net.entities.ContactsUploadData;

/* loaded from: classes15.dex */
public final class bd21 implements Runnable {
    public final ContactsUploadData.Record[] a;
    public volatile boolean b;
    public final /* synthetic */ gd21 c;

    public bd21(gd21 gd21Var, ContactsUploadData.Record[] recordArr) {
        this.c = gd21Var;
        this.a = recordArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = 14;
        try {
            gd21 gd21Var = this.c;
            int a = gd21Var.g.a(gd21Var.q, this.a);
            gd21 gd21Var2 = this.c;
            if (!gd21Var2.r && a <= 0) {
                z = false;
                gd21Var2.r = z;
                gd21Var2.a.post(new t601(i, gd21Var2, this));
                this.b = true;
            }
            z = true;
            gd21Var2.r = z;
            gd21Var2.a.post(new t601(i, gd21Var2, this));
            this.b = true;
        } catch (Throwable th) {
            gd21 gd21Var3 = this.c;
            gd21Var3.a.post(new t601(i, gd21Var3, this));
            throw th;
        }
    }
}
