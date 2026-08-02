package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lhbo0;", "", "Companion", "a", "b", "ebo0", "kbo0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class hbo0 {
    public static final kbo0 Companion = new kbo0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final a f;
    public final b g;

    public hbo0(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str2, a aVar, b bVar) {
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
            this.f = aVar;
        }
        if ((i & 64) != 0) {
            this.g = bVar;
        } else {
            b.Companion.getClass();
            this.g = b.e;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhbo0$a;", "", "Companion", "fbo0", "gbo0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final gbo0 Companion = new gbo0();
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
            this.a = FormattedText.c;
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhbo0$b;", "", "Companion", "jbo0", "ibo0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final jbo0 Companion = new jbo0();
        public static final b e = new b(0);
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;

        public /* synthetic */ b(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4) {
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

        public b() {
            this(0);
        }

        public b(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
        }
    }

    public hbo0() {
        FormattedText formattedText = FormattedText.c;
        b.Companion.getClass();
        b bVar = b.e;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
        this.e = "";
        this.f = null;
        this.g = bVar;
    }
}
