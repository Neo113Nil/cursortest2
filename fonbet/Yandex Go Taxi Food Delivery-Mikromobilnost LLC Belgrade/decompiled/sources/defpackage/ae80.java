package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import com.yandex.go.places.impl.ui.organizations.recycler.OrganisationsVisibilityTracker$start$cb$1;
import java.lang.ref.WeakReference;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ae80 {
    public final String a;
    public final a4j0 b;
    public final bm50 c;
    public final WeakReference d;
    public Choreographer e;
    public OrganisationsVisibilityTracker$start$cb$1 f;
    public boolean h;
    public long g = -1;
    public final Rect i = new Rect();

    public ae80(RobotoTextView robotoTextView, String str, a4j0 a4j0Var, bm50 bm50Var) {
        this.a = str;
        this.b = a4j0Var;
        this.c = bm50Var;
        this.d = new WeakReference(robotoTextView);
    }

    public final void a() {
        Choreographer choreographer;
        OrganisationsVisibilityTracker$start$cb$1 organisationsVisibilityTracker$start$cb$1 = this.f;
        if (organisationsVisibilityTracker$start$cb$1 != null && (choreographer = this.e) != null) {
            choreographer.removeFrameCallback(organisationsVisibilityTracker$start$cb$1);
        }
        this.f = null;
        this.e = null;
        this.g = -1L;
    }
}
