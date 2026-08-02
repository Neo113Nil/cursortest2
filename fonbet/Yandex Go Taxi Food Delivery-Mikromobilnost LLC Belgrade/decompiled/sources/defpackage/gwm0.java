package defpackage;

import com.yandex.go.scooters.passes.model.PassPayment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lgwm0;", "Lswm0;", "Companion", "c", "a", "b", "d", "cwm0", "iwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class gwm0 extends swm0 {
    public static final iwm0 Companion = new iwm0();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final c e;
    public final a f;
    public final b g;
    public final d h;

    public gwm0(int i, FormattedText formattedText, FormattedText formattedText2, String str, String str2, c cVar, a aVar, b bVar, d dVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = new c(0);
        } else {
            this.e = cVar;
        }
        if ((i & 32) == 0) {
            this.f = new a(0);
        } else {
            this.f = aVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = dVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgwm0$a;", "", "Companion", "a", "dwm0", "hwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class a {
        public static final hwm0 Companion = new hwm0();
        public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(15)), null, null};
        public final FormattedText a;
        public final FormattedText b;
        public final List c;
        public final FormattedText d;
        public final FormattedText e;

        public /* synthetic */ a(int i, List list, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = formattedText4;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgwm0$a$a;", "", "Companion", "ewm0", "fwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: gwm0$a$a, reason: collision with other inner class name */
        public static final class C0096a {
            public static final fwm0 Companion = new fwm0();
            public final FormattedText a;
            public final String b;

            public /* synthetic */ C0096a(int i, String str, FormattedText formattedText) {
                this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str;
                }
            }

            public C0096a() {
                this.a = FormattedText.c;
                this.b = null;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            this.a = FormattedText.c;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lgwm0$b;", "", "Companion", "a", "jwm0", "kwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class b {
        public static final kwm0 Companion = new kwm0();
        public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(16)), null, null};
        public final FormattedText a;
        public final FormattedText b;
        public final String c;
        public final List d;
        public final FormattedText e;
        public final FormattedText f;

        public /* synthetic */ b(int i, FormattedText formattedText, FormattedText formattedText2, String str, List list, FormattedText formattedText3, FormattedText formattedText4) {
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
                this.d = EmptyList.a;
            } else {
                this.d = list;
            }
            if ((i & 16) == 0) {
                this.e = FormattedText.c;
            } else {
                this.e = formattedText3;
            }
            if ((i & 32) == 0) {
                this.f = FormattedText.c;
            } else {
                this.f = formattedText4;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgwm0$b$a;", "", "Companion", "lwm0", "mwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class a {
            public static final mwm0 Companion = new mwm0();
            public final FormattedText a;
            public final FormattedText b;
            public final String c;

            public /* synthetic */ a(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
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
            }

            public a() {
                this.a = FormattedText.c;
                this.b = null;
                this.c = "";
            }
        }

        public b() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = null;
            this.c = "";
            this.d = EmptyList.a;
            this.e = formattedText;
            this.f = formattedText;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgwm0$d;", "", "Companion", "pwm0", "qwm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final qwm0 Companion = new qwm0();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final String e;
        public final FormattedText f;
        public final FormattedText g;
        public final FormattedText h;

        public /* synthetic */ d(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, String str, FormattedText formattedText5, FormattedText formattedText6, FormattedText formattedText7) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = formattedText5;
            }
            if ((i & 64) == 0) {
                this.g = FormattedText.c;
            } else {
                this.g = formattedText6;
            }
            if ((i & 128) == 0) {
                this.h = FormattedText.c;
            } else {
                this.h = formattedText7;
            }
        }

        public d() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = null;
            this.c = formattedText;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = formattedText;
            this.h = formattedText;
        }
    }

    public gwm0() {
        FormattedText formattedText = FormattedText.c;
        c cVar = new c(0);
        a aVar = new a(0);
        this.a = formattedText;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = cVar;
        this.f = aVar;
        this.g = null;
        this.h = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgwm0$c;", "", "Companion", "nwm0", "owm0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final owm0 Companion = new owm0();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final FormattedText e;
        public final FormattedText f;
        public final FormattedText g;
        public final PassPayment h;
        public final boolean i;
        public final FormattedText j;
        public final FormattedText k;
        public final FormattedText l;

        public /* synthetic */ c(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5, FormattedText formattedText6, FormattedText formattedText7, PassPayment passPayment, boolean z, FormattedText formattedText8, FormattedText formattedText9, FormattedText formattedText10) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText4;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = formattedText5;
            }
            if ((i & 32) == 0) {
                this.f = FormattedText.c;
            } else {
                this.f = formattedText6;
            }
            if ((i & 64) == 0) {
                this.g = FormattedText.c;
            } else {
                this.g = formattedText7;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = passPayment;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z;
            }
            if ((i & 512) == 0) {
                this.j = FormattedText.c;
            } else {
                this.j = formattedText8;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = formattedText9;
            }
            if ((i & 2048) == 0) {
                this.l = null;
            } else {
                this.l = formattedText10;
            }
        }

        public c() {
            this(0);
        }

        public c(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = null;
            this.c = null;
            this.d = formattedText;
            this.e = null;
            this.f = formattedText;
            this.g = formattedText;
            this.h = null;
            this.i = false;
            this.j = formattedText;
            this.k = null;
            this.l = null;
        }
    }
}
