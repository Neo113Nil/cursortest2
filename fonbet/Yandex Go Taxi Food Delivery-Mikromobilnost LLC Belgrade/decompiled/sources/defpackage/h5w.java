package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lh5w;", "Lvqo;", "Companion", "b", "a", "d5w", "e5w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h5w implements vqo {
    public static final e5w Companion = new e5w();
    public final Boolean a;
    public final String b;
    public final String c;
    public final b d;

    public /* synthetic */ h5w(int i, Boolean bool, String str, String str2, b bVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
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
            this.d = null;
        } else {
            this.d = bVar;
        }
    }

    @Override // defpackage.vqo
    /* renamed from: isEnabled, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh5w$b;", "", "Companion", "i5w", "j5w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final j5w Companion = new j5w();
        public final a a;
        public final a b;

        public /* synthetic */ b(int i, a aVar, a aVar2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = aVar;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = aVar2;
            }
        }

        public b() {
            this.a = null;
            this.b = null;
        }
    }

    public h5w() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh5w$a;", "", "Companion", "f5w", "g5w", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final g5w Companion = new g5w();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;
        public final String d;

        public /* synthetic */ a(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
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
                this.d = "";
            } else {
                this.d = str;
            }
        }

        public a() {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = formattedText;
            this.d = "";
        }
    }
}
