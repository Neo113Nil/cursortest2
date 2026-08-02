package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Loqj0;", "Lxn11;", "Lc6z;", "Companion", "b", "a", "lqj0", "kqj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class oqj0 implements xn11, c6z {
    public static final lqj0 Companion = new lqj0();
    public static final i3y[] d;
    public static final oqj0 e;
    public final Map b;
    public final List c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new zfj0(4)), kotlin.a.b(lazyThreadSafetyMode, new zfj0(5))};
        e = new oqj0(0);
    }

    public /* synthetic */ oqj0(int i, List list, Map map) {
        this.b = (i & 1) == 0 ? kotlin.collections.b.f() : map;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final b a(String str) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((b) obj).getB(), str)) {
                break;
            }
        }
        return (b) obj;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Loqj0$a;", "", "Companion", "mqj0", "nqj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a {
        public static final nqj0 Companion = new nqj0();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
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

        public a() {
            this.a = "";
            this.b = "";
        }
    }

    public oqj0() {
        this(0);
    }

    public oqj0(int i) {
        this.b = kotlin.collections.b.f();
        this.c = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Loqj0$b;", "", "Companion", "pqj0", "qqj0", "go-client-android.features.requirements:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class b {
        public static final qqj0 Companion = new qqj0();
        public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(6))};
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final String f;
        public final String g;
        public final List h;

        public /* synthetic */ b(int i2, boolean z, String str, String str2, boolean z2, String str3, String str4, String str5, List list) {
            if ((i2 & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i2 & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i2 & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i2 & 8) == 0) {
                this.d = false;
            } else {
                this.d = z2;
            }
            if ((i2 & 16) == 0) {
                this.e = "";
            } else {
                this.e = str3;
            }
            if ((i2 & 32) == 0) {
                this.f = "";
            } else {
                this.f = str4;
            }
            if ((i2 & 64) == 0) {
                this.g = "";
            } else {
                this.g = str5;
            }
            if ((i2 & 128) == 0) {
                this.h = EmptyList.a;
            } else {
                this.h = list;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public b() {
            this.a = false;
            this.b = null;
            this.c = null;
            this.d = false;
            this.e = "";
            this.f = "";
            this.g = "";
            this.h = EmptyList.a;
        }
    }
}
