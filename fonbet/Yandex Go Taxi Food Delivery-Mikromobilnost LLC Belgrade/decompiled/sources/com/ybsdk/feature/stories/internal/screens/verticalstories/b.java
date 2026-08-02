package com.ybsdk.feature.stories.internal.screens.verticalstories;

import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.t8j0;
import defpackage.u8j0;
import defpackage.vfc;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b {
    public final u8j0 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final a f;

    public /* synthetic */ b(int i) {
        this(new t8j0(), 0, 0, 0, 0, new a(0, 0));
    }

    public static b a(b bVar, u8j0 u8j0Var, int i, int i2, int i3, int i4, a aVar, int i5) {
        if ((i5 & 1) != 0) {
            u8j0Var = bVar.a;
        }
        u8j0 u8j0Var2 = u8j0Var;
        if ((i5 & 2) != 0) {
            i = bVar.b;
        }
        int i6 = i;
        if ((i5 & 4) != 0) {
            i2 = bVar.c;
        }
        int i7 = i2;
        if ((i5 & 8) != 0) {
            i3 = bVar.d;
        }
        int i8 = i3;
        if ((i5 & 16) != 0) {
            i4 = bVar.e;
        }
        int i9 = i4;
        if ((i5 & 32) != 0) {
            aVar = bVar.f;
        }
        bVar.getClass();
        return new b(u8j0Var2, i6, i7, i8, i9, aVar);
    }

    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && jl40.l(this.f, bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + oyr.b(this.e, oyr.b(this.d, oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalStoriesState(stories=");
        sb.append(this.a);
        sb.append(", realPageIndex=");
        sb.append(this.b);
        sb.append(", fakePageIndex=");
        vfc.u(this.c, this.d, ", prevPageIndex=", ", storyIndex=", sb);
        sb.append(this.e);
        sb.append(", pageContentPadding=");
        sb.append(this.f);
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
            return b64.d(this.a, this.b, "PageContentPadding(topPx=", ", bottomPx=", Extension.C_BRAKE);
        }

        public a() {
            this(0, 0);
        }
    }

    public b(u8j0 u8j0Var, int i, int i2, int i3, int i4, a aVar) {
        this.a = u8j0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = aVar;
    }

    public b() {
        this(0);
    }
}
