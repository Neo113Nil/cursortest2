package xsna;

import android.util.Base64;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.im.engine.commands.uploads.AttachUploadingEndpoint;
import com.vk.instantjobs.InstantJob;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Collections;
import java.util.HashMap;
import xsna.u6x;

/* compiled from: AttachPrefetchUploadJob.kt */
/* loaded from: classes.dex */
public final class f34 extends u4w {
    public final Attach c;
    public final Peer d;
    public final AttachUploadingEndpoint e;
    public fz3<Attach> f;

    /* compiled from: AttachPrefetchUploadJob.kt */
    public static final class a implements s7x<f34> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.s7x
        public final f34 a(ny90 ny90Var) {
            AttachUploadingEndpoint attachUploadingEndpoint;
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(ny90Var.f("attach"), 0)));
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(Attach.class.getClassLoader());
                dataInputStream.close();
                Attach attach = (Attach) G;
                Peer e = ny90Var.g("peer") ? com.vk.dto.common.b.e(ny90Var.e("peer")) : Peer.Unknown.e;
                try {
                    attachUploadingEndpoint = (AttachUploadingEndpoint) AttachUploadingEndpoint.h().get(ny90Var.c("endpoint"));
                } catch (Exception unused) {
                    attachUploadingEndpoint = AttachUploadingEndpoint.CHAT;
                }
                return new f34(attach, e, attachUploadingEndpoint);
            } finally {
            }
        }

        @Override // xsna.s7x
        public final void b(f34 f34Var, ny90 ny90Var) {
            f34 f34Var2 = f34Var;
            ny90Var.o("attach", dni0.a(f34Var2.c));
            ny90Var.l("endpoint", f34Var2.e.ordinal());
            ny90Var.n("peer", f34Var2.d.b);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "AttachPrefetchUploadJob";
        }
    }

    public f34(Attach attach, Peer peer, AttachUploadingEndpoint attachUploadingEndpoint) {
        this.c = attach;
        this.d = peer;
        this.e = attachUploadingEndpoint;
        ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
        if (ftx0Var != null) {
            ftx0Var.i1();
        }
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        fz3<Attach> fz3Var = this.f;
        if (fz3Var != null) {
            fz3Var.dispose();
        }
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        gz3 J0 = w2wVar.J0(this, new eh30(Collections.singleton(this.d), this.c, this.e, null, 16));
        this.f = J0;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "AttachPrefetchUploadJob";
    }
}
