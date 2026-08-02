package com.ybsdk.feature.stories.internal.screens.stories;

import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.t8j0;
import defpackage.u8j0;
import defpackage.unr0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c {
    public final u8j0 a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final a e;

    public /* synthetic */ c(int i) {
        this(new t8j0(), 0, true, true, new a(0, 0));
    }

    public static c a(c cVar, u8j0 u8j0Var, int i, boolean z, boolean z2, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            u8j0Var = cVar.a;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i2 & 2) != 0) {
            i = cVar.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            z = cVar.c;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = cVar.d;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            aVar = cVar.e;
        }
        cVar.getClass();
        return new c(u8j0Var2, i3, z3, z4, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jl40.l(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && jl40.l(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.e(unr0.e(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesState(stories=");
        sb.append(this.a);
        sb.append(", storyIndex=");
        sb.append(this.b);
        sb.append(", showBackButton=");
        nnm.v(", showCloseButton=", ", contentPadding=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
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
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            return b64.d(this.a, this.b, "ContentPadding(topPx=", ", bottomPx=", Extension.C_BRAKE);
        }

        public a() {
            this(0, 0);
        }
    }

    public c(u8j0 u8j0Var, int i, boolean z, boolean z2, a aVar) {
        this.a = u8j0Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = aVar;
    }

    public c() {
        this(0);
    }
}
