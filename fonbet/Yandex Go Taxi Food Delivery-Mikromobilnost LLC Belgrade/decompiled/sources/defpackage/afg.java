package defpackage;

import com.yandex.plus.core.graphql.type.ActionType;

/* loaded from: classes2.dex */
public final class afg {
    public final ActionType a;

    public afg(ActionType actionType) {
        this.a = actionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afg) && this.a == ((afg) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action(actionType=" + this.a + ')';
    }
}
