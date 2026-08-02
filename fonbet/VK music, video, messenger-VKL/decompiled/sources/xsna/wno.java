package xsna;

import android.net.Uri;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.audiomsg.player.Speed;
import java.util.Collection;
import java.util.List;

/* compiled from: DumpEventsToLogPlugin.kt */
/* loaded from: classes.dex */
public final class wno implements pr4 {
    public final a68 a;
    public final uwv b;
    public final a c = new a();

    /* compiled from: DumpEventsToLogPlugin.kt */
    public final class a implements kr4 {
        public a() {
        }

        @Override // xsna.kr4
        public final void a(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onTrackPause: source=" + bgk0Var + ", track=" + ur4Var);
            }
        }

        @Override // xsna.kr4
        public final void b(ir4 ir4Var, bgk0 bgk0Var, Collection<ur4> collection) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void c(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onTrackChanged: source=" + bgk0Var + ", track=" + ur4Var);
            }
        }

        @Override // xsna.kr4
        public final void d(ir4 ir4Var, ur4 ur4Var, Uri uri, Throwable th) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void e(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onTrackPlay: source=" + bgk0Var + ", track=" + ur4Var);
            }
        }

        @Override // xsna.kr4
        public final void f(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void g(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void h(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void i(ir4 ir4Var, ur4 ur4Var) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void j(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void k(ir4 ir4Var, ur4 ur4Var, Uri uri) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void l(ir4 ir4Var, bgk0 bgk0Var, SpeakerType speakerType) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void m(ir4 ir4Var, ur4 ur4Var, Throwable th) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void n(ir4 ir4Var, bgk0 bgk0Var) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onTrackListComplete: source=" + bgk0Var);
            }
        }

        @Override // xsna.kr4
        public final void o(ir4 ir4Var, ur4 ur4Var, Uri uri, Throwable th) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void p(ir4 ir4Var, bgk0 bgk0Var, List<ur4> list) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onTrackListChanged: source=" + bgk0Var + ", tracklist=" + list);
            }
        }

        @Override // xsna.kr4
        public final void q(ir4 ir4Var, bgk0 bgk0Var, Speed speed) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onSpeedChanged: source=" + bgk0Var + ", speed=" + speed);
            }
        }

        @Override // xsna.kr4
        public final void r(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var, float f) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void s(ir4 ir4Var, bgk0 bgk0Var, ur4 ur4Var) {
            wno wnoVar = wno.this;
            if (wno.b(wnoVar)) {
                wno.a(wnoVar, "onTrackStop: source=" + bgk0Var + ", track=" + ur4Var);
            }
        }

        @Override // xsna.kr4
        public final void t(ir4 ir4Var, bgk0 bgk0Var, float f) {
            vwv vwvVar = vwv.b;
        }

        @Override // xsna.kr4
        public final void v(ir4 ir4Var, bgk0 bgk0Var, Collection<ur4> collection) {
            vwv vwvVar = vwv.b;
        }
    }

    public wno(a68 a68Var, uwv uwvVar) {
        this.a = a68Var;
        this.b = uwvVar;
    }

    public static final void a(wno wnoVar, String str) {
        wnoVar.b.invoke(str, null);
    }

    public static final boolean b(wno wnoVar) {
        a68 a68Var = wnoVar.a;
        vwv vwvVar = vwv.b;
        return Boolean.FALSE.booleanValue();
    }

    @Override // xsna.pr4
    public final void u(ir4 ir4Var) {
        ir4Var.v(this.c);
    }
}
