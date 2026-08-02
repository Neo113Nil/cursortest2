package xsna;

import com.vk.dto.common.id.UserId;
import xsna.crd0;
import xsna.qr6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jr6 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jr6(long j, UserId userId, k6u k6uVar) {
        this.d = k6uVar;
        this.e = userId;
        this.c = j;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return "UPLOAD_TRACE doUpload: upload finished for attach " + ((qr6) this.d).o + " in " + this.c + "ms, fileSize=" + ((qr6.b) this.e).c;
            default:
                ((k6u) this.d).j.b(new crd0.f(this.c, fkq0.a((UserId) this.e)));
                return s3q0.a;
        }
    }

    public /* synthetic */ jr6(qr6 qr6Var, long j, qr6.b bVar) {
        this.d = qr6Var;
        this.c = j;
        this.e = bVar;
    }
}
