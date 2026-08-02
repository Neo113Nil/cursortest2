package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lduw0;", "Lluw0;", "Companion", "buw0", "cuw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class duw0 extends luw0 {
    public static final cuw0 Companion = new cuw0();
    public static final i3y[] i;
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final SelectorStyle f;
    public final List g;
    public final boolean h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, null, a.b(lazyThreadSafetyMode, new bhw0(27)), a.b(lazyThreadSafetyMode, new bhw0(28)), null};
    }

    public duw0(int i2, String str, String str2, FormattedText formattedText, FormattedText formattedText2, String str3, SelectorStyle selectorStyle, List list, boolean z) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
        if ((i2 & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText2;
        }
        if ((i2 & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i2 & 32) == 0) {
            this.f = SelectorStyle.DEFAULT;
        } else {
            this.f = selectorStyle;
        }
        if ((i2 & 64) == 0) {
            this.g = EmptyList.a;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = true;
        } else {
            this.h = z;
        }
    }

    public duw0() {
        FormattedText formattedText = FormattedText.c;
        SelectorStyle selectorStyle = SelectorStyle.DEFAULT;
        this.a = "";
        this.b = "";
        this.c = formattedText;
        this.d = formattedText;
        this.e = "";
        this.f = selectorStyle;
        this.g = EmptyList.a;
        this.h = true;
    }
}
