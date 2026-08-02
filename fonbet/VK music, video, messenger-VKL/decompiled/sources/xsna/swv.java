package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import xsna.hg1;

/* compiled from: ImAttachmentUploader.kt */
/* loaded from: classes7.dex */
public final class swv extends pc {
    public final a1w c;
    public final d7a0 d;
    public final m130 e;
    public io.reactivex.rxjava3.disposables.c f;

    public swv(a1w a1wVar, com.vk.movika.sdk.base.asset.b bVar, d7a0 d7a0Var, m130 m130Var) {
        super(bVar);
        this.c = a1wVar;
        this.d = d7a0Var;
        this.e = m130Var;
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
        this.f = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.i0(this.c.l.a(), new hg1.u1()).U(new hg1.t1()).a0(asu0.a.d()), null, new af2(27), new pwk(this, 21));
    }

    @Override // xsna.o34
    public final void e(ju90<?> ju90Var) {
        Attach h = h(ju90Var);
        if (h == null) {
            return;
        }
        this.c.D(this, new e34(h, (Peer) this.e.invoke(), AttachUploadingEndpoint.CHAT));
    }

    @Override // xsna.o34
    public final void f(ju90<?> ju90Var) {
        Attach h = h(ju90Var);
        if (h == null) {
            return;
        }
        this.c.D(this, new z04(h));
    }

    @Override // xsna.o34
    public final void g() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
