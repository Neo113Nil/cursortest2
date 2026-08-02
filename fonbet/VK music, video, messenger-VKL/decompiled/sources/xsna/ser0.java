package xsna;

import com.vkontakte.android.VKApplication;

/* compiled from: VKRunConfigTask.kt */
/* loaded from: classes11.dex */
public final class ser0 implements gzs<s3q0>, w8i {
    public final VKApplication b;
    public final bpn0 c = new bpn0(new qx2(this, 7));

    public ser0(VKApplication vKApplication) {
        this.b = vKApplication;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        if (o25.a().b()) {
            ((v0v) this.c.getValue()).a(this.b);
        } else {
            o25.a().b0(new rer0(this));
        }
        return s3q0.a;
    }
}
