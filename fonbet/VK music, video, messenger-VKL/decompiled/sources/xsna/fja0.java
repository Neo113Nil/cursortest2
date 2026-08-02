package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.modal.picking.PickerItem;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: PickingPatch.kt */
/* loaded from: classes17.dex */
public interface fja0 extends xl50 {

    /* compiled from: PickingPatch.kt */
    public static final class a implements fja0 {
        public final List<PickerItem> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends PickerItem> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Init(items="), this.b);
        }
    }

    /* compiled from: PickingPatch.kt */
    public static final class b implements fja0 {
        public final UserId b;
        public final PickerItem.User c;

        public b(UserId userId, PickerItem.User user) {
            this.b = userId;
            this.c = user;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
        }

        public final String toString() {
            return "ItemUpdated(userId=" + this.b + ", newItem=" + this.c + ')';
        }
    }
}
