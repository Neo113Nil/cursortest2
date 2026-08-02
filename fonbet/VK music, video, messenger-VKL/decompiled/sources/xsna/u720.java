package xsna;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* compiled from: Menu.kt */
/* loaded from: classes11.dex */
public final class u720 implements uki0<MenuItem> {
    public final /* synthetic */ Menu a;

    public u720(Menu menu) {
        this.a = menu;
    }

    @Override // xsna.uki0
    public final Iterator<MenuItem> iterator() {
        return new v720(this.a);
    }
}
