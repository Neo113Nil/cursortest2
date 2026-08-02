package xsna;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: CompositeDrawableVerifier.kt */
/* loaded from: classes18.dex */
public final class ati implements UsableRecyclerView.k {
    public final ArrayList<UsableRecyclerView.k> b = new ArrayList<>();

    @Override // me.grishka.appkit.views.UsableRecyclerView.k
    public final boolean c(Drawable drawable) {
        Iterator<UsableRecyclerView.k> it = this.b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().c(drawable)) {
                z = true;
            }
        }
        return z;
    }
}
