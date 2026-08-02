package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.common.DownloadState;
import com.vk.im.engine.models.messages.MessagesType;
import java.io.File;

/* compiled from: AttachGetUpdateDownloadedCmd.kt */
/* loaded from: classes2.dex */
public final class e24 extends le6<a> {
    public final int b;
    public final MessagesType c;

    /* compiled from: AttachGetUpdateDownloadedCmd.kt */
    public static abstract class a {

        /* compiled from: AttachGetUpdateDownloadedCmd.kt */
        /* renamed from: xsna.e24$a$a, reason: collision with other inner class name */
        public static final class C2773a extends a {
            public final AttachWithDownload a;

            public C2773a(AttachWithDownload attachWithDownload) {
                this.a = attachWithDownload;
            }
        }

        /* compiled from: AttachGetUpdateDownloadedCmd.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: AttachGetUpdateDownloadedCmd.kt */
        public static final class c extends a {
            public static final c a = new c();
        }
    }

    public /* synthetic */ e24(int i) {
        this(i, MessagesType.DIALOG);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        l64 a2 = m64.a(w2wVar, this.c);
        Attach b = a2.b(this.b);
        if (!(b instanceof AttachWithDownload)) {
            return a.b.a;
        }
        AttachWithDownload attachWithDownload = (AttachWithDownload) b;
        if (attachWithDownload.Q8()) {
            return a.c.a;
        }
        if (!attachWithDownload.S4()) {
            return a.b.a;
        }
        File i1 = attachWithDownload.i1();
        boolean z = true;
        boolean z2 = i1 != null && i1.exists();
        boolean z3 = i1 != null && i1.length() == 0;
        if (attachWithDownload.getContentLength() == -1 || (i1 != null && i1.length() == attachWithDownload.getContentLength())) {
            z = false;
        }
        if (z2 && !z3 && !z) {
            return new a.C2773a(attachWithDownload);
        }
        a2.c(attachWithDownload, DownloadState.DOWNLOAD_REQUIRED, null);
        return a.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e24)) {
            return false;
        }
        e24 e24Var = (e24) obj;
        return this.b == e24Var.b && this.c == e24Var.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AttachGetUpdateDownloadedCmd(attachLocalId=" + this.b + ", messagesType=" + this.c + ')';
    }

    public e24(int i, MessagesType messagesType) {
        this.b = i;
        this.c = messagesType;
    }
}
