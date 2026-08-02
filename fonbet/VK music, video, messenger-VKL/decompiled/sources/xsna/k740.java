package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MultipleCoownershipAction.kt */
/* loaded from: classes3.dex */
public abstract class k740 implements kj50 {

    /* compiled from: MultipleCoownershipAction.kt */
    public static final class a extends k740 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -976659053;
        }

        public final String toString() {
            return "ActionButtonClicked";
        }
    }

    /* compiled from: MultipleCoownershipAction.kt */
    public static final class b extends k740 {
    }

    /* compiled from: MultipleCoownershipAction.kt */
    public static final class c extends k740 {
        public final UserId b;

        public c(UserId userId) {
            this.b = userId;
        }
    }
}
