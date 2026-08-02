package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lg590;", "", "Companion", "e590", "f590", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g590 {
    public static final f590 Companion = new f590();
    public static final i3y[] h = {a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(16)), null, null, null, null, null, null};
    public final List a;
    public final b4o b;
    public final FormattedText c;
    public final FormattedText d;
    public final v20 e;
    public final f9o0 f;
    public final hbo0 g;

    public /* synthetic */ g590(int i, List list, b4o b4oVar, FormattedText formattedText, FormattedText formattedText2, v20 v20Var, f9o0 f9o0Var, hbo0 hbo0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b4oVar;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = v20Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f9o0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = hbo0Var;
        }
    }

    public g590() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = null;
        this.c = formattedText;
        this.d = formattedText;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
