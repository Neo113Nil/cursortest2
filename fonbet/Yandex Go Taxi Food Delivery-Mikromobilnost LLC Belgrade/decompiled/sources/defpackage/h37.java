package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh37;", "", "Companion", "f37", "g37", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h37 {
    public static final g37 Companion = new g37();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new r66(10)), null, null};
    public final ButtonState a;
    public final String b;
    public final String c;

    public /* synthetic */ h37(int i, ButtonState buttonState, String str, String str2) {
        this.a = (i & 1) == 0 ? ButtonState.ALREADY_DONE : buttonState;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public h37() {
        this.a = ButtonState.ALREADY_DONE;
        this.b = null;
        this.c = null;
    }
}
