package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.map_object.BubbleFontStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnm6;", "Lxl6;", "Companion", "lm6", "mm6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class nm6 extends xl6 {
    public static final mm6 Companion = new mm6();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new av5(29))};
    public final String a;
    public final BubbleFontStyle b;

    public /* synthetic */ nm6(int i, String str, BubbleFontStyle bubbleFontStyle) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = BubbleFontStyle.DEFAULT;
        } else {
            this.b = bubbleFontStyle;
        }
    }

    /* renamed from: a, reason: from getter */
    public final BubbleFontStyle getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public nm6() {
        this(null, 3);
    }

    public nm6(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        BubbleFontStyle bubbleFontStyle = BubbleFontStyle.DEFAULT;
        this.a = str;
        this.b = bubbleFontStyle;
    }
}
