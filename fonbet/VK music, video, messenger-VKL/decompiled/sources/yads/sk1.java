package yads;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* loaded from: classes10.dex */
public final class sk1 implements pi, pf0 {
    public final f51 a;
    public final to1 b;

    public sk1(f51 f51Var, to1 to1Var) {
        this.a = f51Var;
        this.b = to1Var;
    }

    @Override // yads.pi
    public final void a() {
        to1 to1Var;
        f51 f51Var;
        ImageView imageView = (ImageView) a((ll3) this.a);
        if (imageView != null && (f51Var = this.a) != null) {
            imageView.setImageDrawable(null);
            f51Var.e.a(imageView);
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setSelected(false);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ll3) this.b);
        if (customizableMediaView == null || (to1Var = this.b) == null) {
            return;
        }
        to1Var.a((View) customizableMediaView);
    }

    @Override // yads.pi
    public final boolean b() {
        to1 to1Var = this.b;
        if (to1Var != null && to1Var.b() != null) {
            return true;
        }
        f51 f51Var = this.a;
        return (f51Var == null || f51Var.b() == null) ? false : true;
    }

    @Override // yads.pi
    public final dm3 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ll3) this.b);
        ImageView imageView = (ImageView) a((ll3) this.a);
        if (customizableMediaView != null) {
            return new dm3(customizableMediaView.getWidth(), customizableMediaView.getHeight());
        }
        if (imageView != null) {
            return new dm3(imageView.getWidth(), imageView.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final boolean d() {
        to1 to1Var = this.b;
        boolean z = to1Var != null && om3.a(to1Var.b()) >= 100;
        f51 f51Var = this.a;
        return z || (f51Var != null && om3.a(f51Var.b()) >= 100);
    }

    @Override // yads.pi
    public final void destroy() {
        to1 to1Var = this.b;
        if (to1Var != null) {
            to1Var.a();
        }
    }

    @Override // yads.pi
    public final boolean e() {
        f51 f51Var;
        to1 to1Var = this.b;
        return (to1Var != null && to1Var.c()) || ((f51Var = this.a) != null && f51Var.c());
    }

    @Override // yads.pf0
    public final void b(Object obj) {
        po1 po1Var = (po1) obj;
        x41 a = a(po1Var.c);
        ImageView imageView = (ImageView) a((ll3) this.a);
        if (imageView != null && a != null) {
            f51 f51Var = this.a;
            if (f51Var != null) {
                f51Var.a(a);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ll3) this.b);
        if (customizableMediaView == null) {
            return;
        }
        to1 to1Var = this.b;
        if (to1Var != null) {
            to1Var.a(po1Var);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // yads.pi
    public final void c(Object obj) {
        po1 po1Var = (po1) obj;
        x41 a = a(po1Var.c);
        ImageView imageView = (ImageView) a((ll3) this.a);
        if (imageView != null && a != null) {
            f51 f51Var = this.a;
            if (f51Var != null) {
                f51Var.a(a);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((ll3) this.b);
        if (customizableMediaView != null) {
            to1 to1Var = this.b;
            if (to1Var != null) {
                to1Var.b(customizableMediaView, po1Var);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // yads.pi
    public final void a(oi oiVar, ol3 ol3Var) {
        po1 po1Var = (po1) oiVar.c;
        f51 f51Var = this.a;
        if (f51Var != null) {
            f51Var.a(oiVar, ol3Var, a(po1Var.c));
        }
        to1 to1Var = this.b;
        if (to1Var != null) {
            to1Var.a(oiVar, ol3Var, po1Var);
        }
    }

    public static View a(ll3 ll3Var) {
        if (ll3Var != null) {
            return ll3Var.b();
        }
        return null;
    }

    public static x41 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (x41) list.get(0);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        po1 po1Var = (po1) obj;
        f51 f51Var = this.a;
        x41 a = a(po1Var.c);
        View a2 = a((ll3) f51Var);
        boolean z = (a2 == null || a == null || f51Var == null || !f51Var.a(a2, a)) ? false : true;
        to1 to1Var = this.b;
        View a3 = a((ll3) to1Var);
        return z || (a3 != null && to1Var != null && to1Var.a(a3, po1Var));
    }
}
