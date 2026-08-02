package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljd70;", "Led70;", "Companion", "a", "fd70", "gd70", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class jd70 extends ed70 {
    public static final gd70 Companion = new gd70();
    public final String a;
    public final String b;
    public final a c;

    public jd70(int i, String str, String str2, a aVar) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) != 0) {
            this.c = aVar;
        } else {
            a.Companion.getClass();
            this.c = a.b;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljd70$a;", "", "Companion", "id70", "hd70", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final id70 Companion = new id70();
        public static final a b = new a(0);
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a(int i) {
            this.a = "";
        }

        public a() {
            this(0);
        }
    }

    public jd70() {
        a.Companion.getClass();
        this.a = "";
        this.b = null;
        this.c = a.b;
    }
}
