package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class it80 implements pw80 {
    public static final gt80 Companion = new gt80();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new yi80(15))};
    public final String a;
    public final String b;
    public final OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType c;

    public /* synthetic */ it80(int i, String str, String str2, OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, ft80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it80)) {
            return false;
        }
        it80 it80Var = (it80) obj;
        return jl40.l(this.a, it80Var.a) && jl40.l(this.b, it80Var.b) && this.c == it80Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType = this.c;
        return b + (outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType != null ? outMessage$MiniStoryIsShownEvent$MiniStoryNavigationType.hashCode() : 0);
    }

    public final String toString() {
        return "MiniStoryIsShownEvent(trackId=" + this.a + ", id=" + this.b + ", type=" + this.c + ')';
    }
}
