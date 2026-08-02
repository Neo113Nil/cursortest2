package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lo8p0;", "Lw96;", "Lc6z;", "Companion", "n8p0", "m8p0", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class o8p0 extends w96 implements c6z {
    public static final n8p0 Companion = new n8p0();
    public static final i3y[] i = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(13)), null, null, null, null, null};
    public static final o8p0 j = new o8p0(0);
    public final boolean b;
    public final Map c;
    public final String d;
    public final FormattedText e;
    public final FormattedText f;
    public final Integer g;
    public final boolean h;

    public /* synthetic */ o8p0(int i2, boolean z, Map map, String str, FormattedText formattedText, FormattedText formattedText2, Integer num, boolean z2) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText;
        }
        if ((i2 & 16) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText2;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i2 & 64) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public o8p0() {
        this(0);
    }

    public o8p0(int i2) {
        Map f = b.f();
        FormattedText formattedText = FormattedText.c;
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = formattedText;
        this.f = formattedText;
        this.g = null;
        this.h = false;
    }
}
