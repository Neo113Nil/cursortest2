package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.shortcuts.dto.response.superapp.StickersStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lfdu0;", "", "Companion", "edu0", "ddu0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class fdu0 {
    public static final edu0 Companion = new edu0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new fet0(25))};
    public static final fdu0 c = new fdu0(StickersStyle.Unknown);
    public final StickersStyle a;

    public /* synthetic */ fdu0(int i, StickersStyle stickersStyle) {
        if ((i & 1) == 0) {
            this.a = StickersStyle.Unknown;
        } else {
            this.a = stickersStyle;
        }
    }

    /* renamed from: a, reason: from getter */
    public final StickersStyle getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fdu0) && this.a == ((fdu0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StickersContext(style=" + this.a + Extension.C_BRAKE;
    }

    public fdu0(StickersStyle stickersStyle) {
        this.a = stickersStyle;
    }

    public fdu0() {
        this(StickersStyle.Unknown);
    }
}
