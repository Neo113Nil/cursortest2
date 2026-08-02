package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldde0;", "", "Companion", "bde0", "cde0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class dde0 {
    public static final cde0 Companion = new cde0();
    public static final i3y[] i = {a.b(LazyThreadSafetyMode.PUBLICATION, new yud0(23)), null, null, null, null, null, null, null};
    public final List a;
    public final String b;
    public final String c;
    public final FormattedText d;
    public final FormattedText e;
    public final Integer f;
    public final Integer g;
    public final Double h;

    public /* synthetic */ dde0(int i2, List list, String str, String str2, FormattedText formattedText, FormattedText formattedText2, Integer num, Integer num2, Double d) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = formattedText;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = formattedText2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = d;
        }
    }

    public dde0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
