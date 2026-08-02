package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljzs0;", "", "Companion", "a", "fzs0", "gzs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class jzs0 {
    public static final gzs0 Companion = new gzs0();
    public final String a;
    public final String b;
    public final a c;

    public /* synthetic */ jzs0(int i, String str, String str2, a aVar) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = new a(0);
        } else {
            this.c = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljzs0$a;", "", "Companion", "hzs0", "izs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final izs0 Companion = new izs0();
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

    public jzs0() {
        a aVar = new a(0);
        this.a = "";
        this.b = "";
        this.c = aVar;
    }
}
