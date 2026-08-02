package xsna;

import android.view.View;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DialogsListReporter.kt */
/* loaded from: classes2.dex */
public final class mtm implements ltm {
    public final OpenChatListReporter b;
    public final mdz<OpenChatListReporter.Span> c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final bpn0 e = new bpn0(new p3h(this, 8));
    public final bpn0 f = new bpn0(new cnh(this, 2));
    public final bpn0 g = new bpn0(new c5f(this, 11));

    public mtm(OpenChatListReporter openChatListReporter, mdz<OpenChatListReporter.Span> mdzVar) {
        this.b = openChatListReporter;
        this.c = mdzVar;
    }

    @Override // xsna.ltm
    public final void a() {
        this.b.c((mdz) this.f.getValue());
    }

    @Override // xsna.ltm
    public final void b(View view) {
        mdz mdzVar = (mdz) this.f.getValue();
        OpenChatListReporter openChatListReporter = this.b;
        openChatListReporter.f(mdzVar, null);
        openChatListReporter.f(this.c, view);
        this.d.set(true);
    }

    @Override // xsna.ltm
    public final void c() {
        this.b.f((mdz) this.g.getValue(), null);
    }

    @Override // xsna.ltm
    public final void d(boolean z) {
        OpenChatListReporter openChatListReporter = this.b;
        if (z) {
            openChatListReporter.f((mdz) this.e.getValue(), null);
        } else {
            openChatListReporter.b();
        }
    }

    @Override // xsna.ltm
    public final void e() {
        this.b.c((mdz) this.e.getValue());
    }

    @Override // xsna.ltm
    public final void f() {
        this.b.c((mdz) this.g.getValue());
    }

    @Override // xsna.ltm
    public final boolean isEnabled() {
        return !this.d.get() && this.b.h();
    }
}
