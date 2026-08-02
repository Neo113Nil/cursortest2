package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import xsna.hg1;

/* compiled from: ChannelAttachmentUploader.kt */
/* loaded from: classes16.dex */
public final class kua extends pc {
    public final a1w c;
    public final d7a0 d;
    public final long e;
    public io.reactivex.rxjava3.disposables.c f;

    public kua(a1w a1wVar, os9 os9Var, d7a0 d7a0Var, long j) {
        super(os9Var);
        this.c = a1wVar;
        this.d = d7a0Var;
        this.e = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Attach h(ju90 ju90Var) {
        Attachment attachment = ju90Var instanceof Attachment ? (Attachment) ju90Var : null;
        if (attachment != null) {
            return ca3.b(attachment);
        }
        throw new IllegalStateException("Unknown attachment type ".concat(ju90Var.getClass().getSimpleName()));
    }

    @Override // xsna.o34
    public final void c() {
        this.f = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.i0(this.c.l.a(), new hg1.o()).U(new hg1.n()).a0(asu0.a.d()), null, new cj1(8), new p40(this, 18));
    }

    @Override // xsna.o34
    public final void e(ju90<?> ju90Var) {
        Attach h = h(ju90Var);
        if (h == null) {
            return;
        }
        this.c.D("channel_attach_prefetch_upload_cmd" + h.xb(), new jua(h, this.e, AttachUploadingEndpoint.CHANNEL));
    }

    @Override // xsna.o34
    public final void f(ju90<?> ju90Var) {
        Attach h = h(ju90Var);
        if (h == null) {
            return;
        }
        this.c.D("attach_cancel_prefetch_upload_cmd" + h.xb(), new z04(h));
    }

    @Override // xsna.o34
    public final void g() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
