package xsna;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.fragments.FragmentImpl;
import com.vkontakte.android.R;

/* compiled from: ToolbarExt.kt */
/* loaded from: classes7.dex */
public final class f3p0 {
    public static final void a(Toolbar toolbar, FragmentImpl fragmentImpl, izs<? super View, s3q0> izsVar) {
        if (h3p0.f(fragmentImpl, toolbar)) {
            return;
        }
        u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
        toolbar.setNavigationOnClickListener(new bt8(izsVar, 5));
    }
}
