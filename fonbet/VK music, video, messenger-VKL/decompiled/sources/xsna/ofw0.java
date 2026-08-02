package xsna;

import java.util.List;

/* compiled from: VoipCallAsrOnlineSubtitleDelegate.kt */
/* loaded from: classes11.dex */
public final class ofw0 {
    public final y380 a;
    public final lew0 b;
    public final h260 c;
    public final w94 d;

    public ofw0(h260 h260Var, w94 w94Var) {
        y380 y380Var = new y380(1);
        lew0 lew0Var = new lew0(0);
        this.a = y380Var;
        this.b = lew0Var;
        this.c = h260Var;
        this.d = w94Var;
    }

    public final gew0 a() {
        gew0 gew0Var;
        y380 y380Var = this.a;
        synchronized (y380Var) {
            gew0Var = new gew0(((Boolean) ((io.reactivex.rxjava3.subjects.d) y380Var.a).P0()).booleanValue(), ((Boolean) ((io.reactivex.rxjava3.subjects.d) y380Var.b).P0()).booleanValue());
        }
        return gew0Var;
    }

    public final io.reactivex.rxjava3.core.q b() {
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.a.a;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(dVar);
    }

    public final io.reactivex.rxjava3.core.q c() {
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.a.b;
        dVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(dVar);
    }

    public final io.reactivex.rxjava3.core.q d() {
        io.reactivex.rxjava3.subjects.f<List<iew0>> fVar = this.b.d;
        fVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.z0(fVar);
    }
}
