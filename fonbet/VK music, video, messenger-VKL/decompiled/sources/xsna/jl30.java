package xsna;

import android.view.View;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.vm30;

/* compiled from: MsgListComponentReporterImpl.kt */
/* loaded from: classes2.dex */
public final class jl30 implements vm30.c {
    public final OpenMessagesHistoryReporter a;
    public final mdz<OpenMessagesHistoryReporter.Span> b;
    public final AtomicBoolean c = new AtomicBoolean();
    public final bpn0 d = new bpn0(new m130(this, 3));
    public final bpn0 e = new bpn0(new p5y(this, 9));
    public final bpn0 f = new bpn0(new r5i(this, 29));
    public final bpn0 g = new bpn0(new zf20(this, 1));
    public final bpn0 h = new bpn0(new x3i(this, 23));
    public final bpn0 i = new bpn0(new y3i(this, 25));
    public final bpn0 j = new bpn0(new f5x(this, 12));

    public jl30(OpenMessagesHistoryReporter openMessagesHistoryReporter, mdz<OpenMessagesHistoryReporter.Span> mdzVar) {
        this.a = openMessagesHistoryReporter;
        this.b = mdzVar;
    }

    @Override // xsna.vm30.c
    public final void a() {
        this.a.f((mdz) this.d.getValue(), null);
    }

    @Override // xsna.vm30.c
    public final void d() {
        this.a.c((mdz) this.e.getValue());
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

    @Override // xsna.vm30.c
    public final void j() {
        this.a.c((mdz) this.d.getValue());
    }

    public final mdz<OpenMessagesHistoryReporter.Span> k() {
        return (mdz) this.f.getValue();
    }
}
