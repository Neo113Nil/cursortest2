package defpackage;

import flex.theme.ThemedColor;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class ojh extends mjm0 {
    public static final njh Companion = new njh();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(9))};
    public final ThemedColor a;

    public /* synthetic */ ojh(int i, ThemedColor themedColor) {
        if (1 == (i & 1)) {
            this.a = themedColor;
        } else {
            qje.Z(i, 1, mjh.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ojh.class == obj.getClass() && jl40.l(this.a, ((ojh) obj).a);
    }

    public final int hashCode() {
        ThemedColor themedColor = this.a;
        if (themedColor != null) {
            return themedColor.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DefaultScaffold(backgroundColor=" + this.a + Extension.C_BRAKE;
    }
}
