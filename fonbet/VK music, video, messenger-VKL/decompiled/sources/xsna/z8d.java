package xsna;

import com.vk.clips.editor.templates.impl.player.MusicPlayerState;
import com.vk.media.player.PlayerError;
import java.util.List;
import xsna.y7f;

/* compiled from: ClipPlaybackControllerImpl.kt */
/* loaded from: classes16.dex */
public final class z8d implements y8d {
    public final y7f.c a;
    public Boolean b;
    public boolean c;
    public Long d;
    public long e;
    public final vou f = new vou(this);

    public z8d(y7f.c cVar) {
        this.a = cVar;
    }

    @Override // xsna.y8d
    public final void a(PlayerError playerError, Exception exc) {
        if (playerError != PlayerError.ERROR_NETWORK) {
            cvk.w(y8g0.e(gpt0.n(playerError, true)), true);
        }
        if (exc != null) {
            com.vk.metrics.eventtracking.b.a.a(new RuntimeException("editor player error", exc));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if ((r1 != null ? xsna.t850.a(((xsna.q850) r1.a.b).i) : null) == com.vk.clips.editor.templates.impl.player.MusicPlayerState.STOPPED) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0071, code lost:
    
        if (xsna.epx.f(((xsna.q850) r1.a.b).i, xsna.u850.f.a) == true) goto L29;
     */
    @Override // xsna.y8d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        r8f b;
        qyd a;
        y7f.c cVar = this.a;
        qyd a2 = cVar.a();
        if (a2 == null || !((q850) a2.a.b).d.b()) {
            if ((a2 == null || !a2.i) && (b = cVar.b()) != null) {
                boolean z = false;
                if (cVar.c() && (a = cVar.a()) != null && a.b != null) {
                    if ((a2 != null ? t850.a(((q850) a2.a.b).i) : null) != MusicPlayerState.PREPARED) {
                    }
                    z = true;
                } else if (a2 != null) {
                }
                s8f s8fVar = (s8f) b;
                if (s8fVar.g() == 2 && z) {
                    if (a2 != null) {
                        a2.b(Long.valueOf(s8fVar.f() + ((z8d) this.f.b).e));
                    }
                    this.d = Long.valueOf(s8fVar.f());
                    s8fVar.p(true);
                    return;
                }
                qyd a3 = cVar.a();
                if (a3 == null || a3.b != null) {
                    return;
                }
                s8fVar.p(true);
            }
        }
    }

    @Override // com.vk.clips.editor.templates.impl.player.a.k
    public final void c(long j) {
        y7f.c cVar = this.a;
        qyd a = cVar.a();
        if (a != null) {
            a.b(Long.valueOf(((z8d) this.f.b).e + j));
        }
        Long l = this.d;
        if (l == null || j == l.longValue()) {
            return;
        }
        qyd a2 = cVar.a();
        if (a2 != null) {
            a2.c(true);
        }
        this.d = null;
    }

    public final void d(boolean z) {
        this.c = false;
        this.d = null;
        y7f.c cVar = this.a;
        r8f b = cVar.b();
        if (b != null) {
            s8f s8fVar = (s8f) b;
            s8fVar.p(false);
            qyd a = cVar.a();
            if (a != null) {
                som0 som0Var = a.a;
                boolean z2 = a.h;
                if (z2) {
                    a.i = z2;
                    a.j.removeCallbacksAndMessages(null);
                    ((q850) som0Var.b).m(null, 6, false, false);
                } else {
                    ((q850) som0Var.b).m(null, 6, false, false);
                }
            }
            qyd a2 = cVar.a();
            if (a2 != null) {
                a2.b(Long.valueOf(s8fVar.f() + ((z8d) this.f.b).e));
            }
            if (z) {
                cVar.d(true);
            }
        }
    }

    public final void e(long j, boolean z) {
        this.c = true;
        y7f.c cVar = this.a;
        r8f b = cVar.b();
        if (b != null) {
            cVar.d(false);
            qyd a = cVar.a();
            if (!cVar.c() || a == null || a.b == null) {
                s8f s8fVar = (s8f) b;
                s8fVar.k(j);
                s8fVar.p(true);
            } else {
                s8f s8fVar2 = (s8f) b;
                s8fVar2.p(false);
                s8fVar2.k(j);
                s8fVar2.p(true);
                a.c(false);
                a.a(j + ((z8d) this.f.b).e, z);
            }
        }
    }

    public final void f() {
        r8f b = this.a.b();
        if (b != null) {
            e(((s8f) b).a(), false);
        }
    }

    public final void g() {
        z7f B;
        List<n7f> list;
        y7f.c cVar = this.a;
        r8f b = cVar.b();
        if (b != null) {
            s8f s8fVar = (s8f) b;
            if (s8fVar.g() == 2) {
                if (s8fVar.e() <= 0 || s8fVar.e() > s8fVar.f()) {
                    e(s8fVar.f(), true);
                } else {
                    f();
                }
            }
            if (s8fVar.g() != 3 || (B = y7f.this.B()) == null || (list = B.d) == null || !(!list.isEmpty())) {
                return;
            }
            f();
        }
    }

    public final void h(long j) {
        y7f.c cVar = this.a;
        r8f b = cVar.b();
        if (b != null) {
            if (this.c) {
                e(j, true);
                return;
            }
            qyd a = cVar.a();
            if (a != null) {
                a.a(((z8d) this.f.b).e + j, true);
            }
            qyd a2 = cVar.a();
            if (a2 != null) {
                a2.i = a2.h;
            }
            ((s8f) b).k(j);
        }
    }

    @Override // xsna.y8d
    public final void onVideoEnd() {
        r8f b = this.a.b();
        this.b = b != null ? Boolean.valueOf(((s8f) b).h()) : null;
        d(true);
    }
}
