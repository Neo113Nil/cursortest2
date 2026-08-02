package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.posting.presentation.model.PickerAttachType;

/* compiled from: PickerRootNavigationEvent.kt */
/* loaded from: classes5.dex */
public abstract class jia0 {

    /* compiled from: PickerRootNavigationEvent.kt */
    public static final class a extends jia0 {
        public static final a a = new a();
    }

    /* compiled from: PickerRootNavigationEvent.kt */
    public static final class b extends jia0 {
        public final PickerAttachType a;
        public final UserId b;

        public b(PickerAttachType pickerAttachType, UserId userId) {
            this.a = pickerAttachType;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenSearch(attachType=");
            sb.append(this.a);
            sb.append(", userId=");
            return gp.b(sb, this.b, ')');
        }
    }
}
