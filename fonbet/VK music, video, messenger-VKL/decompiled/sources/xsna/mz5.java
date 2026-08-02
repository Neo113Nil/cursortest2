package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: BadgesModalImageViewControllerFactory.kt */
/* loaded from: classes17.dex */
public final class mz5 implements VkCell.e {
    public final hny a;

    public mz5(hny hnyVar) {
        this.a = hnyVar;
    }

    @Override // com.vk.core.view.components.cell.VkCell.e
    public final VkCell.d create(Context context) {
        return new lz5(context, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mz5(Context context, int i) {
        this(r0);
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(i, context);
        if (a != null) {
            a.setTint(e3m.f(R.attr.vk_ui_icon_secondary, context));
        } else {
            a = null;
        }
        hny hnyVar = new hny(context);
        hnyVar.a(e3m.a(R.dimen.clips_additions_bottomsheet_preview_corner_radius, context), R.color.vk_gray_850);
        hnyVar.b(a);
    }
}
