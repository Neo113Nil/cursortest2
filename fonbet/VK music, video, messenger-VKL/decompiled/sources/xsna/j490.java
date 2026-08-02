package xsna;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* compiled from: OwnCameraMirroring.kt */
/* loaded from: classes7.dex */
public final class j490 {
    public final rct0 a;
    public final gj9 b;
    public final io.reactivex.rxjava3.disposables.c c;

    /* compiled from: OwnCameraMirroring.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MirroringState(isFrontCamera=");
            sb.append(this.a);
            sb.append(", isFrontCameraMirroringEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public j490(rct0 rct0Var, gj9 gj9Var) {
        this.a = rct0Var;
        this.b = gj9Var;
        io.reactivex.rxjava3.core.q m = io.reactivex.rxjava3.core.q.m(gj9Var.c(), gj9Var.d(), new qs6(new a76((byte) 0, 7), 27));
        m.getClass();
        this.c = new io.reactivex.rxjava3.internal.operators.observable.y(m, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()).subscribe(new ow40(new mgz(this, 17), 6));
    }

    public final boolean a() {
        gj9 gj9Var = this.b;
        return gj9Var.e() && gj9Var.g();
    }

    public final void b() {
        rct0 rct0Var = this.a;
        ConversationVideoTrackParticipantKey ownVideoTrack = rct0Var.getOwnVideoTrack();
        if (ownVideoTrack != null) {
            rct0Var.setMirror(ownVideoTrack, a());
        }
    }

    public final void c() {
        io.reactivex.rxjava3.disposables.c cVar = this.c;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
