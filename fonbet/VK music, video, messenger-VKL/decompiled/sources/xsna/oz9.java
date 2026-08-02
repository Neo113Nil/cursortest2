package xsna;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.mediarouter.app.MediaRouteActionProvider;
import java.util.ArrayList;
import one.video.cast.activity.ExpandedControlsActivity;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class oz9 {
    public static final ArrayList a;
    public static final Object b;
    public static final ArrayList c;
    public static final Object d;

    static {
        exc0.g("CastButtonFactory", "The log tag cannot be null or empty.");
        a = new ArrayList();
        b = new Object();
        c = new ArrayList();
        d = new Object();
    }

    public static void a(ExpandedControlsActivity expandedControlsActivity, @NonNull MenuItem menuItem) throws IllegalArgumentException {
        ex10 c2;
        exc0.e("Must be called from the main thread.");
        MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) (menuItem instanceof nin0 ? ((nin0) menuItem).b() : null);
        MediaRouteActionProvider mediaRouteActionProvider2 = mediaRouteActionProvider != null ? mediaRouteActionProvider : null;
        if (mediaRouteActionProvider2 == null) {
            throw new IllegalArgumentException("cannot refreshButtonSelector with null mediaRouteActionProvider");
        }
        uz9 g = uz9.g(expandedControlsActivity);
        if (g == null || (c2 = g.c()) == null || mediaRouteActionProvider2.b.equals(c2)) {
            return;
        }
        mediaRouteActionProvider2.b = c2;
        nw10 nw10Var = mediaRouteActionProvider2.d;
        if (nw10Var != null) {
            nw10Var.setRouteSelector(c2);
        }
    }
}
