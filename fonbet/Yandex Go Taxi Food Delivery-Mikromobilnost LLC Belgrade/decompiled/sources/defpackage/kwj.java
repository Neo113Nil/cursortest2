package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkwj;", "Lrl2;", "Companion", "iwj", "jwj", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class kwj extends rl2 {
    public static final jwj Companion = new jwj();
    public final String a;
    public final FormattedText b;
    public final String c;

    public /* synthetic */ kwj(int i, String str, String str2, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public kwj() {
        this.a = "";
        this.b = null;
        this.c = null;
    }
}
