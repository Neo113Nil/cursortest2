package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lp0p0;", "", "Companion", "b", "a", "m0p0", "q0p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class p0p0 {
    public static final q0p0 Companion = new q0p0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final b f;
    public final a g;

    public p0p0(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str2, b bVar, a aVar) {
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
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bVar;
        }
        if ((i & 64) != 0) {
            this.g = aVar;
        } else {
            a.Companion.getClass();
            this.g = a.e;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp0p0$b;", "", "Companion", "r0p0", "s0p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final s0p0 Companion = new s0p0();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ b(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        public b() {
            this.a = FormattedText.c;
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp0p0$a;", "", "Companion", "o0p0", "n0p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final o0p0 Companion = new o0p0();
        public static final a e = new a(0);
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;

        public /* synthetic */ a(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText3;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText4;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
        }
    }

    public p0p0() {
        FormattedText formattedText = FormattedText.c;
        a.Companion.getClass();
        a aVar = a.e;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
        this.e = "";
        this.f = null;
        this.g = aVar;
    }
}
