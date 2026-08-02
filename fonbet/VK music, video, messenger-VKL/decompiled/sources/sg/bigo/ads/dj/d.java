package sg.bigo.ads.dj;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes9.dex */
public final class d implements sg.bigo.ads.di.d {

    @NonNull
    private final Node a;
    private final String b;
    private final int c;
    private final int d;
    private String g;
    private sg.bigo.ads.di.a h;
    private String i;
    private final List<sg.bigo.ads.di.g> e = new ArrayList();
    private final List<String> f = new ArrayList();
    private final List<sg.bigo.ads.di.c> j = new ArrayList();

    public d(@NonNull Node node) {
        this.a = node;
        this.b = sg.bigo.ads.dg.a.e(node, "id");
        this.c = sg.bigo.ads.dg.a.d(node, "width").intValue();
        this.d = sg.bigo.ads.dg.a.d(node, "height").intValue();
        g();
    }

    private void g() {
        List<Node> b = sg.bigo.ads.dg.a.b(this.a, "StaticResource", null, null);
        if (!l.a((Collection) b)) {
            for (Node node : b) {
                this.e.add(new g(sg.bigo.ads.dg.a.e(node, "creativeType"), sg.bigo.ads.dg.a.a(node)));
            }
        }
        List<Node> b2 = sg.bigo.ads.dg.a.b(this.a, "IFrameResource", null, null);
        if (!l.a((Collection) b2)) {
            Iterator<Node> it = b2.iterator();
            while (it.hasNext()) {
                this.e.add(new f(sg.bigo.ads.dg.a.b(it.next())));
            }
        }
        List<Node> b3 = sg.bigo.ads.dg.a.b(this.a, "HTMLResource", null, null);
        if (!l.a((Collection) b3)) {
            Iterator<Node> it2 = b3.iterator();
            while (it2.hasNext()) {
                this.e.add(new e(sg.bigo.ads.dg.a.b(it2.next())));
            }
        }
        Node a = sg.bigo.ads.dg.a.a(this.a, "AltText", null, null);
        if (a != null) {
            this.g = sg.bigo.ads.dg.a.b(a);
        }
        Node a2 = sg.bigo.ads.dg.a.a(this.a, "AdParameters", null, null);
        if (a2 != null) {
            this.h = new a(TextUtils.equals(sg.bigo.ads.dg.a.e(a2, "xmlEncoded"), "true"), sg.bigo.ads.dg.a.b(a2));
        }
        Node a3 = sg.bigo.ads.dg.a.a(this.a, "CompanionClickThrough", null, null);
        if (a3 != null) {
            this.i = sg.bigo.ads.dg.a.a(a3);
        }
        List<Node> b4 = sg.bigo.ads.dg.a.b(this.a, "CompanionClickTracking", null, null);
        if (!l.a((Collection) b4)) {
            for (Node node2 : b4) {
                this.j.add(new c(sg.bigo.ads.dg.a.e(node2, "id"), sg.bigo.ads.dg.a.a(node2)));
            }
        }
        Node a4 = sg.bigo.ads.dg.a.a(this.a, "TrackingEvents", null, null);
        if (a4 != null) {
            List<Node> b5 = sg.bigo.ads.dg.a.b(a4, "Tracking", NotificationCompat.CATEGORY_EVENT, Arrays.asList("creativeView"));
            if (l.a((Collection) b5)) {
                return;
            }
            Iterator<Node> it3 = b5.iterator();
            while (it3.hasNext()) {
                String a5 = sg.bigo.ads.dg.a.a(it3.next());
                if (!TextUtils.isEmpty(a5)) {
                    this.f.add(a5);
                }
            }
        }
    }

    @Override // sg.bigo.ads.di.d
    public final int a() {
        return this.c;
    }

    @Override // sg.bigo.ads.di.d
    public final int b() {
        return this.d;
    }

    @Override // sg.bigo.ads.di.d
    public final List<sg.bigo.ads.di.g> c() {
        return this.e;
    }

    @Override // sg.bigo.ads.di.d
    public final String d() {
        return this.i;
    }

    @Override // sg.bigo.ads.di.d
    public final List<sg.bigo.ads.di.c> e() {
        return this.j;
    }

    @Override // sg.bigo.ads.di.d
    public final List<String> f() {
        return this.f;
    }
}
