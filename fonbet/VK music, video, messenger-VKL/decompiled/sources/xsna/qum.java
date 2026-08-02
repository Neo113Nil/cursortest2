package xsna;

import com.vk.im.reporters.api.dialog.OpenChatListReporter;

/* compiled from: DialogsLoaderReporterImpl.kt */
/* loaded from: classes18.dex */
public final class qum implements esz {
    public final mdz<OpenChatListReporter.Span> b;
    public final OpenChatListReporter c;
    public final bpn0 d = new bpn0(new wqf(this, 12));

    public qum(OpenChatListReporter openChatListReporter, mdz mdzVar) {
        this.b = mdzVar;
        this.c = openChatListReporter;
    }

    @Override // xsna.esz
    public final void a(boolean z) {
        OpenChatListReporter openChatListReporter = this.c;
        if (z) {
            openChatListReporter.f((mdz) this.d.getValue(), null);
        } else {
            openChatListReporter.b();
        }
    }

    @Override // xsna.esz
    public final void b() {
        this.c.c((mdz) this.d.getValue());
    }
}
