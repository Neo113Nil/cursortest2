package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ld610;", "Lxn11;", "Lc6z;", "Companion", "a", "b", "a610", "z510", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d610 implements xn11, c6z {
    public static final a610 Companion = new a610();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new g110(6)), null, null, null, null};
    public final boolean b;
    public final Map c;
    public final a d;
    public final b e;
    public final int f;
    public final boolean g;

    public d610(int i, boolean z, Map map, a aVar, b bVar, int i2, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            a.Companion.getClass();
            this.d = c610.a();
        } else {
            this.d = aVar;
        }
        if ((i & 8) == 0) {
            b.Companion.getClass();
            this.e = new b(0);
        } else {
            this.e = bVar;
        }
        if ((i & 16) == 0) {
            this.f = 6;
        } else {
            this.f = i2;
        }
        if ((i & 32) == 0) {
            this.g = false;
        } else {
            this.g = z2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld610$b;", "", "Companion", "f610", "e610", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final f610 Companion = new f610();
        public final FormattedText a;

        public /* synthetic */ b(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public b() {
            this(0);
        }

        public b(int i) {
            this.a = FormattedText.c;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ld610$a;", "", "Companion", "c610", "b610", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final c610 Companion = new c610();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ a(int i, String str, String str2, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str4;
            }
        }

        public a(int i) {
            this.a = "";
            this.b = null;
            this.c = "";
            this.d = "";
        }

        public a() {
            this(0);
        }
    }

    public d610() {
        this(0);
    }

    public d610(int i) {
        Map f = kotlin.collections.b.f();
        a.Companion.getClass();
        a a2 = c610.a();
        b.Companion.getClass();
        b bVar = new b(0);
        this.b = false;
        this.c = f;
        this.d = a2;
        this.e = bVar;
        this.f = 6;
        this.g = false;
    }
}
