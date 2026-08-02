package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnt60;", "", "Companion", "lt60", "mt60", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class nt60 {
    public static final mt60 Companion = new mt60();
    public static final i3y[] i;
    public final String a;
    public final FormattedText b;
    public final String c;
    public final FormattedText d;
    public final String e;
    public final FormattedText f;
    public final List g;
    public final List h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, null, null, a.b(lazyThreadSafetyMode, new oi60(19)), a.b(lazyThreadSafetyMode, new oi60(20))};
    }

    public /* synthetic */ nt60(int i2, String str, FormattedText formattedText, String str2, FormattedText formattedText2, String str3, FormattedText formattedText3, List list, List list2) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
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
            this.f = FormattedText.c;
        } else {
            this.f = formattedText3;
        }
        int i3 = i2 & 64;
        EmptyList emptyList = EmptyList.a;
        if (i3 == 0) {
            this.g = emptyList;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = emptyList;
        } else {
            this.h = list2;
        }
    }

    public nt60() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = "";
        this.d = formattedText;
        this.e = "";
        this.f = formattedText;
        EmptyList emptyList = EmptyList.a;
        this.g = emptyList;
        this.h = emptyList;
    }
}
