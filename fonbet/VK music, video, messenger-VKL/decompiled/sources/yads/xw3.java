package yads;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class xw3 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final HashSet e = new HashSet();
    public final HashSet f = new HashSet();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();
    public final WeakHashMap i = new WeakHashMap();
    public boolean j;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        Boolean bool;
        String str;
        rx3 rx3Var = rx3.c;
        if (rx3Var != null) {
            for (ax3 ax3Var : Collections.unmodifiableCollection(rx3Var.b)) {
                View view = (View) ax3Var.d.get();
                if (ax3Var.f && !ax3Var.g) {
                    String str2 = ax3Var.h;
                    if (view != null) {
                        boolean c = ly3.c(view);
                        if (c) {
                            this.h.add(str2);
                        }
                        if (view.isAttachedToWindow()) {
                            if (view.hasWindowFocus()) {
                                this.i.remove(view);
                                bool = Boolean.FALSE;
                            } else if (this.i.containsKey(view)) {
                                bool = (Boolean) this.i.get(view);
                            } else {
                                WeakHashMap weakHashMap = this.i;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || c) {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 == null) {
                                        this.d.addAll(hashSet);
                                        str = null;
                                        break;
                                    }
                                    String a = ly3.a(view2);
                                    if (a != null) {
                                        str = a;
                                        break;
                                    } else {
                                        hashSet.add(view2);
                                        Object parent = view2.getParent();
                                        view2 = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.e.add(str2);
                            this.a.put(view, str2);
                            Iterator it = ax3Var.c.a.iterator();
                            while (it.hasNext()) {
                                by3 by3Var = (by3) it.next();
                                View view3 = (View) by3Var.a.get();
                                if (view3 != null) {
                                    qw3 qw3Var = (qw3) this.b.get(view3);
                                    if (qw3Var != null) {
                                        qw3Var.b.add(ax3Var.h);
                                    } else {
                                        this.b.put(view3, new qw3(by3Var, ax3Var.h));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f.add(str2);
                            this.c.put(str2, view);
                            this.g.put(str2, str);
                        }
                    } else {
                        this.f.add(str2);
                        this.g.put(str2, "noAdView");
                    }
                }
            }
        }
    }
}
