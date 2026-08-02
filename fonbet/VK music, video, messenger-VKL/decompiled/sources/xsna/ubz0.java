package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ubz0 {
    public WeakReference b;
    public ArrayList c;
    public WeakReference d;
    public WeakReference e;
    public WeakReference f;
    public WeakReference g;
    public WeakReference h;
    public WeakReference i;
    public WeakReference j;
    public WeakReference k;
    public WeakReference l;
    public WeakReference m;
    public WeakReference n;
    public WeakReference o;
    public WeakReference p;
    public final ArrayList a = new ArrayList();
    public boolean q = false;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public ViewGroup a;
        public lv50 b;
        public List c;
        public int d = 0;

        public static ArrayList a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof IconAdView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof s4e0) {
                    arrayList.add(childAt);
                } else if (childAt instanceof MediaAdView) {
                    arrayList.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    arrayList.addAll(a((ViewGroup) childAt));
                } else {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ubz0 b() {
            lv50 lv50Var;
            lv50 lv50Var2;
            ubz0 ubz0Var = new ubz0();
            if (this.c != null) {
                ubz0Var.c = new ArrayList();
                for (View view : this.c) {
                    if (view != null) {
                        ubz0Var.c.add(new WeakReference(view));
                        if (view instanceof MediaAdView) {
                            ubz0Var.q = true;
                        }
                    }
                }
            }
            int i = this.d;
            if (i != 0) {
                ViewGroup d = i == 1 ? this.a : (i != 2 || (lv50Var = this.b) == null) ? null : lv50Var.d();
                if (d == null) {
                    gu8.d("NativeViewsHolderBuilder: can't init root ad view");
                    return ubz0Var;
                }
                ubz0Var.b = new WeakReference(d);
                ArrayList a = a(d);
                int i2 = this.d;
                ArrayList arrayList = ubz0Var.a;
                if (i2 == 1) {
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        View view2 = (View) it.next();
                        if (view2 instanceof IconAdView) {
                            ubz0Var.e = new WeakReference((IconAdView) view2);
                        } else if (view2 instanceof r5z0) {
                            ubz0Var.f = new WeakReference(view2);
                        } else if (view2 instanceof s4e0) {
                            ubz0Var.g = new WeakReference((cjy0) view2);
                        } else if (view2 instanceof MediaAdView) {
                            if (ubz0Var.d == null) {
                                ubz0Var.d = new WeakReference((MediaAdView) view2);
                            }
                        } else if (R.id.nativeads_advertising == view2.getId()) {
                            ubz0Var.i = new WeakReference(view2);
                        } else if (R.id.nativeads_title == view2.getId()) {
                            ubz0Var.n = new WeakReference(view2);
                        } else if (R.id.nativeads_description == view2.getId()) {
                            ubz0Var.k = new WeakReference(view2);
                        } else if (R.id.nativeads_rating == view2.getId()) {
                            ubz0Var.p = new WeakReference(view2);
                        } else if (R.id.nativeads_domain == view2.getId()) {
                            ubz0Var.m = new WeakReference(view2);
                        } else if (R.id.nativeads_age_restrictions == view2.getId()) {
                            ubz0Var.j = new WeakReference(view2);
                        } else if (R.id.nativeads_disclaimer == view2.getId()) {
                            ubz0Var.l = new WeakReference(view2);
                        } else if (R.id.nativeads_call_to_action == view2.getId()) {
                            ubz0Var.h = new WeakReference((Button) view2);
                        } else if (R.id.nativeads_votes == view2.getId()) {
                            ubz0Var.o = new WeakReference(view2);
                        } else {
                            arrayList.add(new WeakReference(view2));
                        }
                    }
                } else if (i2 == 2 && (lv50Var2 = this.b) != null) {
                    View i3 = lv50Var2.i();
                    if (i3 != null) {
                        ubz0Var.i = new WeakReference(i3);
                        a.remove(i3);
                    }
                    View c = lv50Var2.c();
                    if (c != null) {
                        ubz0Var.j = new WeakReference(c);
                        a.remove(c);
                    }
                    View g = lv50Var2.g();
                    if (g != null) {
                        ubz0Var.h = new WeakReference(g);
                        a.remove(g);
                    }
                    View descriptionView = lv50Var2.getDescriptionView();
                    if (descriptionView != null) {
                        ubz0Var.k = new WeakReference(descriptionView);
                        a.remove(descriptionView);
                    }
                    View f = lv50Var2.f();
                    if (f != null) {
                        ubz0Var.l = new WeakReference(f);
                        a.remove(f);
                    }
                    View h = lv50Var2.h();
                    if (h != null) {
                        ubz0Var.m = new WeakReference(h);
                        a.remove(h);
                    }
                    s4e0 j0 = lv50Var2.j0();
                    if (j0 != null) {
                        ubz0Var.g = new WeakReference(j0);
                        a.remove(j0);
                    }
                    View titleView = lv50Var2.getTitleView();
                    if (titleView != null) {
                        ubz0Var.n = new WeakReference(titleView);
                        a.remove(titleView);
                    }
                    View e = lv50Var2.e();
                    if (e != null) {
                        ubz0Var.f = new WeakReference(e);
                        a.remove(e);
                    }
                    MediaAdView o = lv50Var2.o();
                    if (o != null) {
                        ubz0Var.d = new WeakReference(o);
                        a.remove(o);
                    }
                    IconAdView iconView = lv50Var2.getIconView();
                    ubz0Var.e = new WeakReference(iconView);
                    a.remove(iconView);
                    Iterator it2 = a.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new WeakReference((View) it2.next()));
                    }
                }
            }
            return ubz0Var;
        }
    }

    public final void a() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((WeakReference) it.next()).clear();
            }
            this.c.clear();
            this.c = null;
        }
        ArrayList arrayList2 = this.a;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((WeakReference) it2.next()).clear();
        }
        arrayList2.clear();
        WeakReference weakReference = this.i;
        if (weakReference != null) {
            weakReference.clear();
            this.i = null;
        }
        WeakReference weakReference2 = this.j;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.j = null;
        }
        WeakReference weakReference3 = this.h;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.h = null;
        }
        WeakReference weakReference4 = this.k;
        if (weakReference4 != null) {
            weakReference4.clear();
            this.k = null;
        }
        WeakReference weakReference5 = this.l;
        if (weakReference5 != null) {
            weakReference5.clear();
            this.l = null;
        }
        WeakReference weakReference6 = this.m;
        if (weakReference6 != null) {
            weakReference6.clear();
            this.m = null;
        }
        WeakReference weakReference7 = this.e;
        if (weakReference7 != null) {
            weakReference7.clear();
            this.e = null;
        }
        WeakReference weakReference8 = this.p;
        if (weakReference8 != null) {
            weakReference8.clear();
            this.p = null;
        }
        WeakReference weakReference9 = this.n;
        if (weakReference9 != null) {
            weakReference9.clear();
            this.n = null;
        }
        WeakReference weakReference10 = this.o;
        if (weakReference10 != null) {
            weakReference10.clear();
            this.o = null;
        }
        WeakReference weakReference11 = this.d;
        if (weakReference11 != null) {
            weakReference11.clear();
            this.d = null;
        }
        WeakReference weakReference12 = this.g;
        if (weakReference12 != null) {
            weakReference12.clear();
            this.g = null;
        }
        WeakReference weakReference13 = this.b;
        if (weakReference13 != null) {
            weakReference13.clear();
            this.b = null;
        }
    }

    public final ArrayList b() {
        if (this.c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public final View c() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final IconAdView d() {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            return (IconAdView) weakReference.get();
        }
        return null;
    }

    public final MediaAdView e() {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            return (MediaAdView) weakReference.get();
        }
        return null;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            arrayList.add((View) ((WeakReference) it.next()).get());
        }
        return arrayList;
    }

    public final ViewGroup g() {
        WeakReference weakReference = this.b;
        if (weakReference != null) {
            return (ViewGroup) weakReference.get();
        }
        return null;
    }
}
