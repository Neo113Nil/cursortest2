package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: MsgListState.kt */
/* loaded from: classes2.dex */
public final class li30 {
    public final List<Msg> a;

    /* JADX WARN: Multi-variable type inference failed */
    public li30(List<? extends Msg> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof li30) && epx.f(this.a, ((li30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MsgDisplayedOnUiReport(messages="), this.a);
    }
}
