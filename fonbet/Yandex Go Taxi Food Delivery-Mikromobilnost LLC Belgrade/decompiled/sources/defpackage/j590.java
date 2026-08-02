package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lj590;", "", "Companion", "h590", "i590", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j590 {
    public static final i590 Companion = new i590();
    public static final i3y[] e = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new aw80(17))};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final List d;

    public /* synthetic */ j590(int i, String str, FormattedText formattedText, FormattedText formattedText2, List list) {
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
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public j590() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = formattedText;
        this.d = EmptyList.a;
    }
}
