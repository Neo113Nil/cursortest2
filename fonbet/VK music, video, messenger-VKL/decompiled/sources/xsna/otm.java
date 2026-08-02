package xsna;

import android.view.View;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: DialogsListReporterImpl.kt */
/* loaded from: classes18.dex */
public final class otm implements jtm {
    public final mdz<OpenChatListReporter.Span> b;
    public final OpenChatListReporter c;
    public final i2n0 d;
    public final bpn0 e = new bpn0(new nwk(this, 2));
    public final bpn0 f = new bpn0(new k5h(this, 9));
    public final AtomicBoolean g = new AtomicBoolean(false);
    public final qum h;

    public otm(mdz<OpenChatListReporter.Span> mdzVar, OpenChatListReporter openChatListReporter, i2n0 i2n0Var) {
        this.b = mdzVar;
        this.c = openChatListReporter;
        this.d = i2n0Var;
        this.h = new qum(openChatListReporter, mdzVar);
    }

    @Override // xsna.jtm
    public final void a() {
        this.c.c((mdz) this.e.getValue());
    }

    @Override // xsna.jtm
    public final void b(View view) {
        mdz mdzVar = (mdz) this.e.getValue();
        OpenChatListReporter openChatListReporter = this.c;
        openChatListReporter.f(mdzVar, null);
        openChatListReporter.f(this.b, view);
        this.g.set(true);
    }

    @Override // xsna.jtm
    public final void c() {
        this.c.f((mdz) this.f.getValue(), null);
    }

    @Override // xsna.jtm
    public final void d(boolean z) {
        this.d.e(z);
    }

    @Override // xsna.jtm
    public final void e() {
        this.c.c((mdz) this.f.getValue());
    }

    @Override // xsna.jtm
    public final esz f() {
        return this.h;
    }

    @Override // xsna.jtm
    public final boolean g() {
        return this.d.b();
    }

    @Override // xsna.jtm
    public final boolean isEnabled() {
        return !this.g.get() && this.c.h();
    }
}
