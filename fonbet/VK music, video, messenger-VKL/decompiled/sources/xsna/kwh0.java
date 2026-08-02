package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.R;

/* compiled from: SearchMenuInflaterImpl.kt */
/* loaded from: classes5.dex */
public final class kwh0 implements iwh0 {

    /* compiled from: SearchMenuInflaterImpl.kt */
    public static final class a extends LayerDrawable {
        @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
        public final void setTintList(ColorStateList colorStateList) {
            super.setTintList(colorStateList);
            if (onStateChange(getState())) {
                invalidateSelf();
            }
        }
    }

    @Override // xsna.iwh0
    public final void a(Menu menu) {
        menu.removeItem(R.id.search_ui_search_feature_menu_button);
    }

    @Override // xsna.iwh0
    public final n8q b(Menu menu, Toolbar toolbar, Context context, boolean z) {
        Drawable icon;
        MenuItem add = menu.add(0, R.id.search_ui_search_feature_menu_button, 0, "");
        add.setVisible(true);
        add.setShowAsAction(10);
        a aVar = new a(new Drawable[]{context.getDrawable(R.drawable.vk_icon_search_outline_28)});
        if (z) {
            aVar.setLayerInset(0, gbg0.a(context.getResources(), -8.0f), gbg0.a(context.getResources(), -4.0f), 0, 0);
        }
        int i = BuildInfo.q() ? R.attr.vk_ui_icon_accent : R.attr.toolbarIconsColor;
        dhr0 dhr0Var = dhr0.a;
        add.setIcon(aVar);
        if (i != 0 && (icon = add.getIcon()) != null) {
            icon.setTint(dhr0.u.c(i));
        }
        n8q n8qVar = new n8q(toolbar, add, context);
        String string = context.getString(R.string.search);
        add.setActionView(n8qVar.f);
        add.setTitle(string);
        add.setContentDescription(string);
        add.setOnMenuItemClickListener(new jwh0());
        add.setOnActionExpandListener(n8qVar);
        return n8qVar;
    }
}
