package xsna;

import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import kotlin.Lazy;
import xsna.hux;

/* compiled from: DiscoverMediaDialogs.kt */
/* loaded from: classes4.dex */
public final class c3n {
    public final fo60 a;
    public final la60 b;
    public final a4r c;
    public VkContextMenu d;
    public final Lazy e;

    public c3n() {
        throw null;
    }

    public c3n(fo60 fo60Var, la60 la60Var, a4r a4rVar, Lazy lazy) {
        new vid();
        this.a = fo60Var;
        this.b = la60Var;
        this.c = a4rVar;
        this.e = lazy;
    }

    public final void a(View view) {
        this.c.g(new hux.a.c(view));
    }
}
