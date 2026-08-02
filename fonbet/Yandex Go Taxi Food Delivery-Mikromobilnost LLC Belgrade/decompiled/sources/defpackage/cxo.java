package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcxo;", "Ln96;", "Companion", "a", "b", "zwo", "ywo", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class cxo extends n96 {
    public static final zwo Companion = new zwo();
    public static final cxo i = new cxo(0);
    public final boolean b;
    public final a c;
    public final b d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ cxo(int i2, boolean z, a aVar, b bVar, String str, String str2, String str3, String str4) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
        }
        if ((i2 & 4) == 0) {
            this.d = new b(0);
        } else {
            this.d = bVar;
        }
        if ((i2 & 8) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i2 & 64) == 0) {
            this.h = null;
        } else {
            this.h = str4;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcxo$b;", "", "Companion", "dxo", "exo", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final exo Companion = new exo();
        public final boolean a;

        public /* synthetic */ b(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public b(int i) {
            this.a = false;
        }

        public b() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcxo$a;", "", "Companion", "axo", "bxo", "order"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final bxo Companion = new bxo();
        public final boolean a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public /* synthetic */ a(String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str4;
            }
        }

        public a(int i) {
            this.a = false;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
        }

        public a() {
            this(0);
        }
    }

    public cxo() {
        this(0);
    }

    public cxo(int i2) {
        a aVar = new a(0);
        b bVar = new b(0);
        this.b = false;
        this.c = aVar;
        this.d = bVar;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
