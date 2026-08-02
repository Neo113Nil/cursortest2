package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: AdsItemEndOverlayContainer.kt */
/* loaded from: classes17.dex */
public final class rw0 {
    public final Object a;
    public Object b;
    public Object c;

    public rw0(ViewGroup viewGroup) {
        this.a = (ConstraintLayout) viewGroup.findViewById(R.id.ads_end_overlay_container);
        this.b = (VkText) viewGroup.findViewById(R.id.ads_overlay_bottom_info);
        this.c = (VkPlaceholder) viewGroup.findViewById(R.id.ads_overlay_placeholder);
    }

    public rw0(yxu yxuVar, wiw0 wiw0Var, lec lecVar) {
        this.a = yxuVar;
        this.b = wiw0Var;
        this.c = lecVar;
    }

    public rw0(int i) {
        this.a = i != 1 ? new m900(i) : null;
    }
}
