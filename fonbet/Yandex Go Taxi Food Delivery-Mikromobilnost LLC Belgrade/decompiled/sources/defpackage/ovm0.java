package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lovm0;", "", "Companion", "a", "c", "d", "b", "e", "f", "lvm0", "rvm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ovm0 {
    public static final rvm0 Companion = new rvm0();
    public static final i3y[] l = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(13)), null, null, null, null, null};
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final a e;
    public final List f;
    public final d g;
    public final FormattedText h;
    public final e i;
    public final b j;
    public final b k;

    public /* synthetic */ ovm0(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, a aVar, List list, d dVar, FormattedText formattedText3, e eVar, b bVar, b bVar2) {
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
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = aVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = new d(0);
        } else {
            this.g = dVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = formattedText3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = eVar;
        }
        if ((i & 512) == 0) {
            this.j = new b(0);
        } else {
            this.j = bVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = bVar2;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lovm0$b;", "", "Companion", "pvm0", "qvm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final qvm0 Companion = new qvm0();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ b(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
        }

        public b() {
            this(0);
        }

        public b(int i) {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lovm0$f;", "", "Companion", "wwm0", "xwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class f {
        public static final xwm0 Companion = new xwm0();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ f(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
        }

        public f() {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lovm0$c;", "", "Companion", "a", "svm0", "tvm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class c {
        public static final tvm0 Companion = new tvm0();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;
        public final a d;

        public /* synthetic */ c(int i, FormattedText formattedText, FormattedText formattedText2, String str, a aVar) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = aVar;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lovm0$c$a;", "", "Companion", "uvm0", "vvm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final vvm0 Companion = new vvm0();
            public final FormattedText a;
            public final String b;
            public final String c;

            public /* synthetic */ a(int i, String str, String str2, FormattedText formattedText) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str2;
                }
            }

            public a() {
                this.a = FormattedText.c;
                this.b = null;
                this.c = null;
            }
        }

        public c() {
            this.a = FormattedText.c;
            this.b = null;
            this.c = "";
            this.d = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lovm0$d;", "", "Companion", "swm0", "twm0", "wvm0", "xvm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final xvm0 Companion = new xvm0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(14))};
        public final FormattedText a;
        public final FormattedText b;
        public final List c;

        public /* synthetic */ d(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public d() {
            this(0);
        }

        public d(int i) {
            this.a = FormattedText.c;
            this.b = null;
            this.c = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lovm0$a;", "", "Companion", "mvm0", "nvm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final nvm0 Companion = new nvm0();
        public final FormattedText a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ a(int i, FormattedText formattedText, String str, String str2, String str3) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
        }

        public a() {
            this.a = FormattedText.c;
            this.b = null;
            this.c = null;
            this.d = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lovm0$e;", "", "Companion", "uwm0", "vwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final vwm0 Companion = new vwm0();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final String e;
        public final f f;

        public /* synthetic */ e(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str2, f fVar) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = fVar;
            }
        }

        public e() {
            FormattedText formattedText = FormattedText.c;
            this.a = "";
            this.b = formattedText;
            this.c = null;
            this.d = formattedText;
            this.e = null;
            this.f = null;
        }
    }

    public ovm0() {
        FormattedText formattedText = FormattedText.c;
        d dVar = new d(0);
        b bVar = new b(0);
        this.a = "";
        this.b = "";
        this.c = formattedText;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = dVar;
        this.h = null;
        this.i = null;
        this.j = bVar;
        this.k = null;
    }
}
