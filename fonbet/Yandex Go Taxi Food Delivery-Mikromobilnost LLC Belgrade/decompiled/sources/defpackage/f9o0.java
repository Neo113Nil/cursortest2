package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lf9o0;", "", "Companion", "a", "e", "b", "d", "c", "c9o0", "g9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class f9o0 {
    public static final g9o0 Companion = new g9o0();
    public static final i3y[] h = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(2)), null};
    public final FormattedText a;
    public final FormattedText b;
    public final a c;
    public final e d;
    public final b e;
    public final List f;
    public final c g;

    public /* synthetic */ f9o0(int i, FormattedText formattedText, FormattedText formattedText2, a aVar, e eVar, b bVar, List list, c cVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = eVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = cVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf9o0$e;", "", "Companion", "aao0", "bao0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final bao0 Companion = new bao0();
        public final String a;

        public /* synthetic */ e(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public e() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lf9o0$d;", "", "Companion", "w9o0", "x9o0", "a", "n9o0", "o9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class d {
        public static final o9o0 Companion = new o9o0();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final w9o0 d;
        public final FormattedText e;
        public final a f;

        public d(int i, String str, FormattedText formattedText, FormattedText formattedText2, w9o0 w9o0Var, FormattedText formattedText3, a aVar) {
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
                this.d = new v9o0(0);
            } else {
                this.d = w9o0Var;
            }
            if ((i & 16) == 0) {
                this.e = FormattedText.c;
            } else {
                this.e = formattedText3;
            }
            if ((i & 32) != 0) {
                this.f = aVar;
            } else {
                a.Companion.getClass();
                this.f = a.c;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf9o0$d$a;", "", "Companion", "z9o0", "y9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final z9o0 Companion = new z9o0();
            public static final a c = new a(0);
            public final FormattedText a;
            public final FormattedText b;

            public /* synthetic */ a(int i, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
            }

            public a() {
                this(0);
            }

            public a(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
            }
        }

        public d() {
            FormattedText formattedText = FormattedText.c;
            v9o0 v9o0Var = new v9o0(0);
            a.Companion.getClass();
            a aVar = a.c;
            this.a = "";
            this.b = formattedText;
            this.c = formattedText;
            this.d = v9o0Var;
            this.e = formattedText;
            this.f = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf9o0$a;", "", "Companion", "e9o0", "d9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final e9o0 Companion = new e9o0();
        public static final a c = new a(0);
        public final FormattedText a;
        public final String b;

        public /* synthetic */ a(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            this.a = FormattedText.c;
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf9o0$b;", "", "Companion", "h9o0", "i9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final i9o0 Companion = new i9o0();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ b(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
        }

        public b() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lf9o0$c;", "", "Companion", "a", "j9o0", "k9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class c {
        public static final k9o0 Companion = new k9o0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(3))};
        public final FormattedText a;
        public final FormattedText b;
        public final List c;

        public /* synthetic */ c(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf9o0$c$a;", "", "Companion", "l9o0", "m9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final m9o0 Companion = new m9o0();
            public final FormattedText a;
            public final FormattedText b;
            public final String c;

            public /* synthetic */ a(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = "";
                } else {
                    this.c = str;
                }
            }

            public a() {
                FormattedText formattedText = FormattedText.c;
                this.a = formattedText;
                this.b = formattedText;
                this.c = "";
            }
        }

        public c() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = EmptyList.a;
        }
    }

    public f9o0() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = EmptyList.a;
        this.g = null;
    }
}
