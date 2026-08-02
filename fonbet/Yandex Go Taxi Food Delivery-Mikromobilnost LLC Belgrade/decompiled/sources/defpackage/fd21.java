package defpackage;

import com.yandex.messaging.core.net.entities.ContactsUploadData;
import com.yandex.messaging.core.net.entities.ContactsUploadParam;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class fd21 implements ho3, go3 {
    public final ContactsUploadParam.Record[] a;
    public final String[] b;
    public final ContactsUploadData.Record[] c;
    public final int w;
    public final /* synthetic */ gd21 x;

    public fd21(gd21 gd21Var, ContactsUploadParam.Record[] recordArr, String[] strArr, ContactsUploadData.Record[] recordArr2, int i) {
        this.x = gd21Var;
        this.a = recordArr;
        this.b = strArr;
        this.c = recordArr2;
        this.w = i;
    }

    @Override // defpackage.go3
    public final void D(Object obj) {
        ContactsUploadData.Record[] recordArr = (ContactsUploadData.Record[]) obj;
        gd21 gd21Var = this.x;
        if (gd21Var.p == null) {
            gd21Var.b(4, 7);
            return;
        }
        gd21Var.p = null;
        if (recordArr == null) {
            gd21Var.c("empty_response", null);
            gd21Var.b(4, 7);
            return;
        }
        ContactsUploadData.Record[] recordArr2 = this.c;
        if (recordArr2 != null) {
            recordArr = (ContactsUploadData.Record[]) f73.t(recordArr2, recordArr);
        }
        ContactsUploadParam.Record[] recordArr3 = this.a;
        int length = recordArr3.length;
        String[] strArr = this.b;
        if (length > 0 || strArr.length > 0) {
            gd21Var.d(recordArr3, strArr, recordArr);
            return;
        }
        aqb1.d(gd21Var.i, "sync_upload_response", b.i(new Pair("uuid", gd21Var.c), new Pair("version", Long.valueOf(gd21Var.l)), new Pair("count", Integer.valueOf(recordArr.length)), new Pair("type", gd21Var.m)));
        if (gd21Var.b(4, 5)) {
            gd21Var.a.post(new bd21(gd21Var, recordArr));
        }
    }

    @Override // defpackage.ho3
    /* renamed from: c */
    public final boolean mo103c(int i) {
        if (!j73.w(i, gd21.s)) {
            return false;
        }
        gd21 gd21Var = this.x;
        gd21Var.c("http_" + i, null);
        gd21Var.b(4, 7);
        return true;
    }
}
