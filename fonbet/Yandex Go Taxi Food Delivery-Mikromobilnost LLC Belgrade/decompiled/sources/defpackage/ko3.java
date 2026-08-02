package defpackage;

import com.yandex.messaging.core.net.entities.ContactsUploadData;
import com.yandex.messaging.core.net.entities.ContactsUploadParam;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class ko3 extends w920 {
    public final /* synthetic */ to3 a;
    public final /* synthetic */ ContactsUploadParam b;
    public final /* synthetic */ fd21 c;

    public ko3(to3 to3Var, ContactsUploadParam contactsUploadParam, fd21 fd21Var) {
        this.a = to3Var;
        this.b = contactsUploadParam;
        this.c = fd21Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        rvj0 rvj0Var = kvj0Var.z;
        if (rvj0Var != null) {
            rvj0Var.contentLength();
        }
        return ouu.b(this.a.b, "upload_contacts", ContactsUploadData.Record[].class, kvj0Var);
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        return this.c.mo103c(ngzVar.b);
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.c.D((ContactsUploadData.Record[]) obj);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        t4j0 a = this.a.b.a(this.b, "upload_contacts");
        if (a.a == null) {
            ny61.r("url == null");
            return null;
        }
        a.c.d();
        m5j0 m5j0Var = a.d;
        if (m5j0Var != null) {
            m5j0Var.a();
        }
        fd21 fd21Var = this.c;
        gd21 gd21Var = fd21Var.x;
        aqb1.d(gd21Var.i, "sync_upload_send", b.i(new Pair("uuid", gd21Var.c), new Pair("count", Integer.valueOf(fd21Var.w)), new Pair("type", gd21Var.m)));
        return a;
    }
}
