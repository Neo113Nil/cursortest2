package xsna;

import android.view.View;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MessagesListReporterImpl.kt */
/* loaded from: classes16.dex */
public final class bg20 implements yf20 {
    public final OpenMessagesHistoryReporter a;
    public final mdz<OpenMessagesHistoryReporter.Span> b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final bpn0 d = new bpn0(new r5i(this, 27));
    public final bpn0 e = new bpn0(new zf20(this, 0));
    public final bpn0 f = new bpn0(new x3i(this, 22));
    public final bpn0 g = new bpn0(new y3i(this, 22));
    public final bpn0 h = new bpn0(new f5x(this, 8));
    public final bpn0 i = new bpn0(new ag20(this, 0));

    public bg20(OpenMessagesHistoryReporter openMessagesHistoryReporter, mdz<OpenMessagesHistoryReporter.Span> mdzVar) {
        this.a = openMessagesHistoryReporter;
        this.b = mdzVar;
    }

    @Override // xsna.vm30.c
    public final void a() {
        this.a.f((mdz) this.d.getValue(), null);
    }

    @Override // xsna.yf20
    public final void b() {
        this.a.b();
    }

    @Override // xsna.yf20
    public final void c() {
        this.a.f((mdz) this.h.getValue(), null);
    }

    @Override // xsna.vm30.c
    public final void d() {
        this.a.c((mdz) this.e.getValue());
    }

    @Override // xsna.yf20
    public final void e() {
        this.a.f((mdz) this.g.getValue(), null);
    }

    @Override // xsna.yf20
    public final void f() {
        mdz mdzVar = (mdz) this.i.getValue();
        OpenMessagesHistoryReporter openMessagesHistoryReporter = this.a;
        openMessagesHistoryReporter.f(mdzVar, null);
        openMessagesHistoryReporter.f((mdz) this.f.getValue(), null);
    }

    @Override // xsna.yf20
    public final void g() {
        this.a.c((mdz) this.i.getValue());
    }

    @Override // xsna.vm30.c
    public final boolean getEnabled() {
        return !this.c.get() && this.a.h();
    }

    @Override // xsna.vm30.c
    public final void h(int i, int i2, View view) {
        mdz mdzVar = (mdz) this.e.getValue();
        OpenMessagesHistoryReporter openMessagesHistoryReporter = this.a;
        openMessagesHistoryReporter.f(mdzVar, null);
        openMessagesHistoryReporter.f(this.b, new pr80(i2, i, view));
        this.c.set(true);
    }

    @Override // xsna.yf20
    public final void i() {
        this.a.c((mdz) this.h.getValue());
    }

    @Override // xsna.vm30.c
    public final void j() {
        this.a.c((mdz) this.d.getValue());
    }
}
