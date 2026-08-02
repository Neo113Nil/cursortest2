package xsna;

import android.net.Uri;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.b;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.dto.common.Peer;
import com.vk.im.converters.ImJpegConverter;
import com.vk.im.engine.exceptions.attach.AttachDownloadException;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.MessagesType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.instantjobs.InstantJob;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.u6x;

/* compiled from: AttachDownloadJob.kt */
/* loaded from: classes.dex */
public final class r14 extends u4w {
    public final Peer c;
    public final int d;
    public final AttachWithDownload e;
    public final MessagesType f;
    public l64 g;

    /* compiled from: AttachDownloadJob.kt */
    public static final class a implements s7x<r14> {
        @Override // xsna.s7x
        public final r14 a(ny90 ny90Var) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            Peer b = Peer.a.b(ny90Var.e("dialog_id"));
            int c = ny90Var.c("msg_local_id");
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(Base64.decode(ny90Var.f("attach"), 0)));
            try {
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(AttachWithDownload.class.getClassLoader());
                dataInputStream.close();
                return new r14(b, c, (AttachWithDownload) G, MessagesType.valueOf(ny90Var.f("messages_type")));
            } finally {
            }
        }

        @Override // xsna.s7x
        public final void b(r14 r14Var, ny90 ny90Var) {
            r14 r14Var2 = r14Var;
            ny90Var.n("dialog_id", r14Var2.c.b);
            ny90Var.l("msg_local_id", r14Var2.d);
            ny90Var.o("attach", dni0.a(r14Var2.e));
            ny90Var.o("messages_type", r14Var2.f.name());
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DownloadAttachJob";
        }
    }

    /* compiled from: AttachDownloadJob.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessagesType.values().length];
            try {
                iArr[MessagesType.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessagesType.CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ r14(Peer peer, int i, AttachWithDownload attachWithDownload) {
        this(peer, i, attachWithDownload, MessagesType.DIALOG);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean A() {
        return true;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final boolean B() {
        return true;
    }

    @Override // xsna.u4w
    public final void E(w2w w2wVar) {
        w2wVar.Z0().m();
    }

    @Override // xsna.u4w
    public final String F(w2w w2wVar) {
        return w2wVar.Z0().j();
    }

    @Override // xsna.u4w
    public final int G(w2w w2wVar) {
        return w2wVar.Z0().h(this.e.xb());
    }

    @Override // xsna.u4w
    public final int H(w2w w2wVar) {
        return w2wVar.Z0().g();
    }

    @Override // xsna.u4w
    public final String I(w2w w2wVar) {
        return w2wVar.Z0().i();
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        if (this.g == null) {
            this.g = m64.a(w2wVar, this.f);
        }
        bzp S0 = w2wVar.S0();
        AttachWithDownload attachWithDownload = this.e;
        S0.k(attachWithDownload);
        l64 l64Var = this.g;
        if (l64Var != null) {
            l64Var.c(attachWithDownload, DownloadState.DOWNLOAD_REQUIRED, null);
        }
        try {
            File Q = Q(attachWithDownload);
            Regex regex = com.vk.core.files.a.a;
            vhk0.b(Q);
        } catch (Throwable unused) {
        }
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        if (this.g == null) {
            this.g = m64.a(w2wVar, this.f);
        }
        bzp S0 = w2wVar.S0();
        AttachWithDownload attachWithDownload = this.e;
        S0.k(attachWithDownload);
        l64 l64Var = this.g;
        if (l64Var != null) {
            l64Var.c(attachWithDownload, DownloadState.DOWNLOAD_REQUIRED, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        int i = this.d;
        MessagesType messagesType = this.f;
        this.g = m64.a(w2wVar, messagesType);
        AttachWithDownload attachWithDownload = this.e;
        if (attachWithDownload.T0() != DownloadState.DOWNLOADING) {
            return;
        }
        o8o o8oVar = new o8o(attachWithDownload.t7().toString(), Q(attachWithDownload), messagesType == MessagesType.CHANNEL, 0);
        bz2.b(o8oVar, new s14(aVar, w2wVar, attachWithDownload));
        if (attachWithDownload.getContentLength() != -1 && o8oVar.a().length() != attachWithDownload.getContentLength()) {
            throw new AttachDownloadException("Downloaded file has different size");
        }
        File a2 = o8oVar.a();
        if (attachWithDownload instanceof AttachImage) {
            lu2 lu2Var = w2wVar.getConfig().a.j;
            ImJpegConverter imJpegConverter = new ImJpegConverter();
            Uri fromFile = Uri.fromFile(a2);
            if (imJpegConverter.b(w2wVar.getContext(), fromFile)) {
                Regex regex = com.vk.core.files.a.a;
                File k = com.vk.core.files.a.k(System.currentTimeMillis() + "", "tmp");
                imJpegConverter.a(w2wVar.getContext(), fromFile, k, null);
                vhk0.b(a2);
                k.renameTo(a2);
            }
        }
        String R = R(attachWithDownload.getFileName(), attachWithDownload.t7().toString());
        try {
            com.vk.core.files.b bVar = new com.vk.core.files.b(w2wVar.getContext());
            if (R == null) {
                R = a2.getName();
            }
            b.a aVar2 = (b.a) bVar.b(a2, attachWithDownload instanceof AttachVideo ? ExternalDirType.VIDEO : attachWithDownload instanceof AttachVideoMsg ? ExternalDirType.VIDEO : ExternalDirType.DOWNLOADS, R).c();
            File i2 = com.vk.core.files.a.i(w2wVar.getContext(), aVar2.a());
            if (i2 == null) {
                K(w2wVar, new AttachDownloadException("Can't get external attach file:" + aVar2.a()));
                return;
            }
            l64 l64Var = this.g;
            if (l64Var != null) {
                l64Var.c(attachWithDownload, DownloadState.DOWNLOADED, i2);
            }
            w2wVar.S0().f(attachWithDownload);
            vhk0.b(a2);
            if (attachWithDownload instanceof AttachVideoMsg) {
                Msg L = w2wVar.I0().o().L(i);
                w2wVar.K().l().h(this.c.b, ((AttachVideoMsg) attachWithDownload).q().b, L != null ? Integer.valueOf(L.Z5()) : null, Integer.valueOf(i), Integer.valueOf(((AttachVideoMsg) attachWithDownload).i()), Integer.valueOf(((AttachVideoMsg) attachWithDownload).i()));
            }
        } catch (Throwable th) {
            K(w2wVar, th);
        }
    }

    @Override // xsna.u4w
    public final boolean M() {
        return true;
    }

    @Override // xsna.u4w
    public final void O(w2w w2wVar, Map<InstantJob, ? extends InstantJob.a> map, NotificationCompat.h hVar) {
        int i = b.$EnumSwitchMapping$0[this.f.ordinal()];
        Peer peer = this.c;
        if (i == 1) {
            w8w Z0 = w2wVar.Z0();
            w2wVar.getExperiments();
            long j = peer.b;
            InstantJob.a aVar = map.get(this);
            if (aVar == null) {
                aVar = InstantJob.a.b.a;
            }
            Z0.n(hVar, j, this.d, this.e, aVar);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        w8w Z02 = w2wVar.Z0();
        w2wVar.getExperiments();
        long j2 = peer.b;
        InstantJob.a aVar2 = map.get(this);
        if (aVar2 == null) {
            aVar2 = InstantJob.a.b.a;
        }
        Z02.e(hVar, j2, this.d, this.e, aVar2);
    }

    @Override // xsna.u4w
    public final void P(w2w w2wVar, NotificationCompat.h hVar) {
        w8w Z0 = w2wVar.Z0();
        w2wVar.getExperiments();
        Z0.c(hVar);
    }

    public final File Q(AttachWithDownload attachWithDownload) {
        return ((attachWithDownload instanceof AttachVideo) || (attachWithDownload instanceof AttachVideoMsg)) ? com.vk.core.files.a.k(attachWithDownload.getFileName(), "mp4") : com.vk.core.files.a.k(R(attachWithDownload.getFileName(), attachWithDownload.t7().toString()), "tmp");
    }

    public final String R(String str, String str2) {
        String lastPathSegment = Uri.parse(str2).getLastPathSegment();
        String replace = str.replace('/', '_').replace('%', '-');
        AttachWithDownload attachWithDownload = this.e;
        return (((attachWithDownload instanceof AttachVideo) || (attachWithDownload instanceof AttachVideoMsg)) && replace.length() > 0) ? replace.concat(".mp4") : (replace.length() <= 0 || !drm0.D(replace, ".", false)) ? lastPathSegment : replace;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r14)) {
            return false;
        }
        r14 r14Var = (r14) obj;
        return epx.f(this.c, r14Var.c) && this.d == r14Var.d && epx.f(this.e, r14Var.e) && this.f == r14Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + shy.a(this.d, Long.hashCode(this.c.b) * 31, 31)) * 31);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.WHEN_SUBMITED;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return sa30.o(this.c.b);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "AttachDownloadJob";
    }

    public final String toString() {
        return "AttachDownloadJob(peer=" + this.c + ", msgLocalId=" + this.d + ", attach=" + this.e + ", messagesType=" + this.f + ')';
    }

    public r14(Peer peer, int i, AttachWithDownload attachWithDownload, MessagesType messagesType) {
        this.c = peer;
        this.d = i;
        this.e = attachWithDownload;
        this.f = messagesType;
    }
}
