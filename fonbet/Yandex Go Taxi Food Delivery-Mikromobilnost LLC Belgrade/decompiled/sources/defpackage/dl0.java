package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.persuggest.api.ActionButtonSize;
import ru.yandex.taxi.persuggest.api.AdditionalButtonStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldl0;", "", "Companion", "bl0", "cl0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class dl0 {
    public static final cl0 Companion = new cl0();
    public static final i3y[] e;
    public final FormattedText a;
    public final AdditionalButtonStyle b;
    public final ActionButtonSize c;
    public final uk0 d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, a.b(lazyThreadSafetyMode, new c20(25)), a.b(lazyThreadSafetyMode, new c20(26)), null};
    }

    public /* synthetic */ dl0(int i, FormattedText formattedText, AdditionalButtonStyle additionalButtonStyle, ActionButtonSize actionButtonSize, uk0 uk0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = additionalButtonStyle;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = actionButtonSize;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = uk0Var;
        }
    }

    public dl0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
