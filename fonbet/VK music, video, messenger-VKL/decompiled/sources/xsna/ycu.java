package xsna;

import xsna.cdu;

/* compiled from: GraffitiRender.kt */
/* loaded from: classes15.dex */
public final class ycu implements fm50 {
    public final yzt0<vlo> a;
    public final yzt0<c> b;
    public final yzt0<Boolean> c;
    public final yzt0<a> d;
    public final yzt0<b> e;
    public final yzt0<rho> f;
    public final yzt0<ghq0> g;

    /* compiled from: GraffitiRender.kt */
    public static final class a {
        public final cdu.a a;
        public final cdu.a b;
        public final z5g c;

        public a(cdu.a aVar, cdu.a aVar2, z5g z5gVar) {
            this.a = aVar;
            this.b = aVar2;
            this.c = z5gVar;
        }
    }

    /* compiled from: GraffitiRender.kt */
    public static final class b {
        public final a a;
        public final rho b;

        public b(a aVar, rho rhoVar) {
            this.a = aVar;
            this.b = rhoVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UiState(sceneState=" + this.a + ", drawConfiguration=" + this.b + ')';
        }
    }

    /* compiled from: GraffitiRender.kt */
    public static final class c {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UndoRedoState(canUndo=");
            sb.append(this.a);
            sb.append(", canRedo=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    public ycu(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7) {
        this.a = h0u0Var;
        this.b = h0u0Var2;
        this.c = h0u0Var3;
        this.d = h0u0Var4;
        this.e = h0u0Var5;
        this.f = h0u0Var6;
        this.g = h0u0Var7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycu)) {
            return false;
        }
        ycu ycuVar = (ycu) obj;
        return epx.f(this.a, ycuVar.a) && epx.f(this.b, ycuVar.b) && epx.f(this.c, ycuVar.c) && epx.f(this.d, ycuVar.d) && epx.f(this.e, ycuVar.e) && epx.f(this.f, ycuVar.f) && epx.f(this.g, ycuVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Main(drawingState=");
        sb.append(this.a);
        sb.append(", undoRedoState=");
        sb.append(this.b);
        sb.append(", canSave=");
        sb.append(this.c);
        sb.append(", sceneState=");
        sb.append(this.d);
        sb.append(", uiState=");
        sb.append(this.e);
        sb.append(", drawConfiguration=");
        sb.append(this.f);
        sb.append(", userData=");
        return tr.c(sb, this.g, ')');
    }
}
