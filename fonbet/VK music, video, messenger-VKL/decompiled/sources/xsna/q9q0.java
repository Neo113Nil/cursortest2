package xsna;

/* compiled from: UploadAttachmentsQueueEventsHandler.kt */
/* loaded from: classes4.dex */
public final class q9q0 implements w8i {
    public sq9 b;
    public final bpn0 c = new bpn0(new hri0(this, 8));

    public final void a() {
        synchronized (this) {
            try {
                ((vre0) this.c.getValue()).f("wallpost_upload_attachment");
                sq9 sq9Var = this.b;
                if (sq9Var != null) {
                    sq9Var.cancel();
                }
                this.b = null;
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
