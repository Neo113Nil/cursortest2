package xsna;

import com.vk.antispam.SpamAction;
import java.util.List;

/* compiled from: AntispamActionsBottomSheetResult.kt */
/* loaded from: classes14.dex */
public final class tv2 {
    public final List<SpamAction> a;

    /* JADX WARN: Multi-variable type inference failed */
    public tv2(List<? extends SpamAction> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tv2) && epx.f(this.a, ((tv2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AntispamActionsBottomSheetResult(spamActions="), this.a);
    }
}
