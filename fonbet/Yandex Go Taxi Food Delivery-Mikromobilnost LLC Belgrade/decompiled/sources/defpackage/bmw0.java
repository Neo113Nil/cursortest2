package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType;

@gsq0
/* loaded from: classes9.dex */
public final class bmw0 {
    public static final wlw0 Companion = new wlw0();
    public static final i3y[] c = {a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(29)), null};
    public final SupportedOptionType a;
    public final amw0 b;

    public /* synthetic */ bmw0(int i, SupportedOptionType supportedOptionType, amw0 amw0Var) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, vlw0.a.getDescriptor());
            throw null;
        }
        this.a = supportedOptionType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = amw0Var;
        }
    }

    public bmw0(SupportedOptionType supportedOptionType, amw0 amw0Var) {
        this.a = supportedOptionType;
        this.b = amw0Var;
    }
}
