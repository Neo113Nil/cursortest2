package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldvr0;", "", "Companion", "cvr0", "bvr0", "multiorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class dvr0 {
    public static final cvr0 Companion = new cvr0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new mkr0(27))};
    public static final dvr0 c = new dvr0(ShimmeringStyle.Unknown);
    public final ShimmeringStyle a;

    public /* synthetic */ dvr0(int i, ShimmeringStyle shimmeringStyle) {
        if ((i & 1) == 0) {
            this.a = ShimmeringStyle.Unknown;
        } else {
            this.a = shimmeringStyle;
        }
    }

    /* renamed from: a, reason: from getter */
    public final ShimmeringStyle getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvr0) && this.a == ((dvr0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShimmeringContext(style=" + this.a + Extension.C_BRAKE;
    }

    public dvr0(ShimmeringStyle shimmeringStyle) {
        this.a = shimmeringStyle;
    }

    public dvr0() {
        this(ShimmeringStyle.Unknown);
    }
}
