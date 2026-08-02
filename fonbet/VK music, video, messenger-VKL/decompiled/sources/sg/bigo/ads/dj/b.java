package sg.bigo.ads.dj;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes9.dex */
public final class b implements sg.bigo.ads.di.b {

    @NonNull
    private final Node a;
    private List<sg.bigo.ads.di.d> b;

    public b(@NonNull Node node) {
        this.a = node;
    }

    @Override // sg.bigo.ads.di.b
    public final List<sg.bigo.ads.di.d> a() {
        if (this.b == null) {
            this.b = new ArrayList();
            Iterator<Node> it = sg.bigo.ads.dg.a.c(this.a, "Companion").iterator();
            while (it.hasNext()) {
                this.b.add(new d(it.next()));
            }
        }
        return this.b;
    }
}
