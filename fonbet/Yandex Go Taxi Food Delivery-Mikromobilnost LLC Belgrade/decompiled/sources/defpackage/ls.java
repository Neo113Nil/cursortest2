package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonAction;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lls;", "", "Companion", "js", "ks", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ls {
    public static final ks Companion = new ks();
    public static final i3y[] e;
    public final String a;
    public final String b;
    public final ButtonAction c;
    public final List d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, null, a.b(lazyThreadSafetyMode, new ar(6)), a.b(lazyThreadSafetyMode, new ar(7))};
    }

    public /* synthetic */ ls(int i, String str, String str2, ButtonAction buttonAction, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = ButtonAction.UNSUPPORTED;
        } else {
            this.c = buttonAction;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    public ls() {
        ButtonAction buttonAction = ButtonAction.UNSUPPORTED;
        this.a = null;
        this.b = null;
        this.c = buttonAction;
        this.d = EmptyList.a;
    }
}
