package one.video.cast.activity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;
import xsna.exc0;
import xsna.nw10;
import xsna.oz9;
import xsna.qz9;
import xsna.rz9;

/* compiled from: ExpandedControlsActivity.kt */
/* loaded from: classes8.dex */
public final class ExpandedControlsActivity extends ExpandedControllerActivity {
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = super.getTheme();
        rz9 rz9Var = qz9.a;
        Integer num = rz9Var != null ? rz9Var.c : null;
        if (num != null) {
            theme.applyStyle(num.intValue(), true);
        }
        return theme;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.one_video_expanded_controller, menu);
        ArrayList arrayList = oz9.a;
        exc0.e("Must be called from the main thread.");
        MenuItem findItem = menu.findItem(R.id.one_video_media_route_menu_item);
        if (findItem == null) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException("menu doesn't contain a menu item whose ID is 2131369487.");
        }
        try {
            oz9.a(this, findItem);
            synchronized (oz9.b) {
                oz9.a.add(new WeakReference(findItem));
            }
            zzr.zzb(zzpm.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
            nw10 nw10Var = (nw10) menu.findItem(R.id.one_video_media_route_menu_item).getActionView();
            rz9 rz9Var = qz9.a;
            Integer num = rz9Var != null ? rz9Var.a : null;
            if (num == null) {
                return true;
            }
            Drawable drawable = getDrawable(num.intValue());
            rz9 rz9Var2 = qz9.a;
            Integer num2 = rz9Var2 != null ? rz9Var2.b : null;
            if (num2 != null) {
                int intValue = num2.intValue();
                if (drawable != null) {
                    drawable.setTint(getColor(intValue));
                }
            }
            nw10Var.setRemoteIndicatorDrawable(drawable);
            return true;
        } catch (IllegalArgumentException e) {
            Locale locale2 = Locale.ROOT;
            throw new IllegalArgumentException("menu item with ID 2131369487 doesn't have a MediaRouteActionProvider.", e);
        }
    }
}
