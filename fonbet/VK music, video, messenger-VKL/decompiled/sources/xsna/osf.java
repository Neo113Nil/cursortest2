package xsna;

import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.topbar.VkTopBar;
import java.util.List;

/* compiled from: ClipsWrapperNavigationPopupController.kt */
/* loaded from: classes17.dex */
public final class osf {
    public boolean a;
    public VkContextMenu b;

    /* compiled from: ClipsWrapperNavigationPopupController.kt */
    public static final class a {
        public final mrf a;
        public final View b;
        public final List<wrf> c;
        public final int d;
        public final nrf e;
        public final Rect f;

        public a(mrf mrfVar, VkTopBar vkTopBar, List list, int i, nrf nrfVar, Rect rect) {
            this.a = mrfVar;
            this.b = vkTopBar;
            this.c = list;
            this.d = i;
            this.e = nrfVar;
            this.f = rect;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e.equals(aVar.e) && this.f.equals(aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + qoy.b(shy.a(this.d, fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, false)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NavigationPopupParams(rootViewProvider=");
            sb.append(this.a);
            sb.append(", parent=");
            sb.append(this.b);
            sb.append(", items=");
            sb.append(this.c);
            sb.append(", currentItemIndex=");
            sb.append(this.d);
            sb.append(", allowTouchOutsidePopup=false, onItemSelected=");
            sb.append(this.e);
            sb.append(", anchorRect=");
            return yq.c(sb, this.f, ')');
        }
    }
}
