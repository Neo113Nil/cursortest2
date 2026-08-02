package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgi30;", "Lvn11;", "Companion", "a", "di30", "ci30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class gi30 implements vn11 {
    public static final di30 Companion = new di30();
    public static final gi30 e = new gi30(0);
    public final boolean b;
    public final a c;
    public final String d;

    public gi30(int i, boolean z, a aVar, String str) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            a.Companion.getClass();
            this.c = a.e;
        } else {
            this.c = aVar;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
    }

    public gi30() {
        this(0);
    }

    public gi30(int i) {
        a.Companion.getClass();
        this.b = false;
        this.c = a.e;
        this.d = "";
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgi30$a;", "", "Companion", "fi30", "ei30", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final fi30 Companion = new fi30();
        public static final a e = new a(0);
        public final Float a;
        public final Integer b;
        public final Integer c;
        public final Integer d;

        public /* synthetic */ a(int i, Float f, Integer num, Integer num2, Integer num3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = f;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num3;
            }
        }

        public a(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }

        public a() {
            this(0);
        }
    }
}
