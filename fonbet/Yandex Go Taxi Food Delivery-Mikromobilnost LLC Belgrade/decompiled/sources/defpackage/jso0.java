package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Ljso0;", "Lw96;", "Companion", "a", "b", "mso0", "gso0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class jso0 extends w96 {
    public static final mso0 Companion = new mso0();
    public static final jso0 d = new jso0(0);
    public final boolean b;
    public final a c;

    public /* synthetic */ jso0(int i, boolean z, a aVar) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljso0$a;", "", "Companion", "hso0", "iso0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final iso0 Companion = new iso0();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(26)), null};
        public final List a;
        public final int b;

        public /* synthetic */ a(int i, int i2, List list) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = 2;
            } else {
                this.b = i2;
            }
        }

        public a() {
            this.a = EmptyList.a;
            this.b = 2;
        }
    }

    public jso0(int i) {
        this.b = false;
        this.c = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljso0$b;", "", "Companion", "kso0", "lso0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final lso0 Companion = new lso0();
        public final String a;
        public final String b;

        public /* synthetic */ b(int i, String str, String str2) {
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
        }

        public b() {
            this.a = "";
            this.b = "";
        }
    }

    public jso0() {
        this(0);
    }
}
