package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Ln1o0;", "Lw96;", "Lc6z;", "Companion", "b", "a", "c", "k1o0", "j1o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n1o0 extends w96 implements c6z {
    public static final k1o0 Companion = new k1o0();
    public static final i3y[] g = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new zqn0(14)), null, null, null};
    public static final n1o0 h = new n1o0(0);
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final b e;
    public final a f;

    public /* synthetic */ n1o0(int i, boolean z, Map map, boolean z2, b bVar, a aVar) {
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
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = aVar;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln1o0$a;", "", "Companion", "l1o0", "m1o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final m1o0 Companion = new m1o0();
        public final c a;
        public final c b;
        public final c c;

        public /* synthetic */ a(int i, c cVar, c cVar2, c cVar3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = cVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = cVar2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = cVar3;
            }
        }

        public a() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ln1o0$c;", "", "Companion", "a", "q1o0", "r1o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class c {
        public static final r1o0 Companion = new r1o0();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final String d;
        public final a e;

        public /* synthetic */ c(int i, String str, FormattedText formattedText, FormattedText formattedText2, String str2, a aVar) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = aVar;
            }
        }

        public c() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
            this.d = null;
            this.e = null;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln1o0$c$a;", "", "Companion", "s1o0", "t1o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final t1o0 Companion = new t1o0();
            public final String a;
            public final FormattedText b;
            public final FormattedText c;
            public final String d;
            public final String e;

            public /* synthetic */ a(int i, String str, FormattedText formattedText, FormattedText formattedText2, String str2, String str3) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText;
                }
                if ((i & 4) == 0) {
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText2;
                }
                if ((i & 8) == 0) {
                    this.d = "";
                } else {
                    this.d = str2;
                }
                if ((i & 16) == 0) {
                    this.e = "";
                } else {
                    this.e = str3;
                }
            }

            public a() {
                FormattedText formattedText = FormattedText.c;
                this.a = "";
                this.b = formattedText;
                this.c = formattedText;
                this.d = "";
                this.e = "";
            }
        }
    }

    public n1o0() {
        this(0);
    }

    public n1o0(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = false;
        this.e = null;
        this.f = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ln1o0$b;", "", "Companion", "o1o0", "p1o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final p1o0 Companion = new p1o0();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final FormattedText e;
        public final String f;

        public /* synthetic */ b(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText3;
            }
            if ((i & 16) == 0) {
                this.e = FormattedText.c;
            } else {
                this.e = formattedText4;
            }
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str2;
            }
        }

        public b() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
            this.e = formattedText;
            this.f = "";
        }
    }
}
