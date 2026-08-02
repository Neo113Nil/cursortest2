package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcn0;", "", "Companion", "e", "c", "b", "a", "d", "zm0", "fn0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class cn0 {
    public static final fn0 Companion = new fn0();
    public final e a;
    public final b b;
    public final a c;

    public /* synthetic */ cn0(int i, e eVar, b bVar, a aVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = eVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcn0$a;", "", "Companion", "an0", "bn0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a {
        public static final bn0 Companion = new bn0();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean b() {
            String str = this.a;
            return !(str == null || str.length() == 0);
        }

        public a() {
            this.a = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcn0$d;", "", "Companion", "in0", "jn0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final jn0 Companion = new jn0();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ d(int i, FormattedText formattedText, FormattedText formattedText2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
        }

        public d() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcn0$c;", "", "Companion", "gn0", "hn0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class c {
        public static final hn0 Companion = new hn0();
        public final String a;
        public final String b;

        public /* synthetic */ c(int i, String str, String str2) {
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

        public static final /* synthetic */ void c(c cVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
            if (yjdVar.F() || !jl40.l(cVar.a, "")) {
                yjdVar.o(serialDescriptor, 0, cVar.a);
            }
            if (!yjdVar.F() && jl40.l(cVar.b, "")) {
                return;
            }
            yjdVar.o(serialDescriptor, 1, cVar.b);
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public c() {
            this.a = "";
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcn0$b;", "", "Companion", "dn0", "en0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class b {
        public static final en0 Companion = new en0();
        public final Integer a;
        public final String b;
        public final FormattedText c;

        public /* synthetic */ b(int i, Integer num, String str, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText;
            }
        }

        /* renamed from: a, reason: from getter */
        public final Integer getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final FormattedText getC() {
            return this.c;
        }

        public final boolean d() {
            String str;
            return (this.a == null || (str = this.b) == null || str.length() == 0) ? false : true;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcn0$e;", "", "Companion", "kn0", "ln0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class e {
        public static final ln0 Companion = new ln0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c20(29))};
        public final String a;
        public final String b;
        public final List c;

        public /* synthetic */ e(int i, String str, String str2, List list) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = list;
            }
        }

        /* renamed from: a, reason: from getter */
        public final List getC() {
            return this.c;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean c() {
            String str;
            List list;
            String str2 = this.a;
            return (str2 == null || str2.length() == 0 || (str = this.b) == null || str.length() == 0 || (list = this.c) == null || list.isEmpty()) ? false : true;
        }

        public e() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public cn0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
