package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lh2n0;", "", "Companion", "a", "d2n0", "e2n0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h2n0 {
    public static final e2n0 Companion = new e2n0();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(29))};
    public final List a;

    public /* synthetic */ h2n0(int i, List list) {
        if ((i & 1) == 0) {
            this.a = EmptyList.a;
        } else {
            this.a = list;
        }
    }

    public h2n0() {
        this.a = EmptyList.a;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh2n0$a;", "", "Companion", "f2n0", "g2n0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final g2n0 Companion = new g2n0();
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
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public a() {
            this.a = FormattedText.c;
            this.b = null;
            this.c = null;
        }
    }
}
