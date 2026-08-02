package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;

/* compiled from: ImCellAvatar.kt */
/* loaded from: classes2.dex */
public interface lyv extends VkCell.f {

    /* compiled from: ImCellAvatar.kt */
    public static final class a implements lyv {
        public final Dialog a;
        public final ProfilesSimpleInfo b;

        public a(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = dialog;
            this.b = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            Dialog dialog = this.a;
            int hashCode = (dialog == null ? 0 : dialog.hashCode()) * 31;
            ProfilesSimpleInfo profilesSimpleInfo = this.b;
            return hashCode + (profilesSimpleInfo != null ? profilesSimpleInfo.hashCode() : 0);
        }

        public final String toString() {
            return "Dialog(dialog=" + this.a + ", profiles=" + this.b + ')';
        }
    }

    /* compiled from: ImCellAvatar.kt */
    public static final class b implements lyv {
        public final dpg0 a;

        public b(dpg0 dpg0Var) {
            this.a = dpg0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Drawable(drawable=" + this.a + ')';
        }
    }
}
