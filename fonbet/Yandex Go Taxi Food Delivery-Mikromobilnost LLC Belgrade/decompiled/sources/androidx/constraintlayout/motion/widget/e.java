package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import defpackage.bo31;
import defpackage.c7e;
import defpackage.ha30;
import defpackage.ia30;
import defpackage.iix;
import defpackage.jhx;
import defpackage.kih0;
import defpackage.qbn;
import defpackage.rug;
import defpackage.ta30;
import defpackage.vmn0;
import defpackage.wv31;
import defpackage.xa30;
import defpackage.z3i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class e {
    public int a;
    public int e;
    public final iix f;
    public final e.a g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        if (r2.equals("CustomMethod") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                this.g = androidx.constraintlayout.widget.e.d(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", rug.a() + " unknown tag " + name);
                            StringBuilder sb = new StringBuilder();
                            sb.append(".xml:");
                            sb.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb.toString());
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                this.f = new iix(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", rug.a() + " unknown tag " + name);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(".xml:");
                            sb2.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2.toString());
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                d(context, xmlResourceParser);
                                break;
                            }
                            Log.e("ViewTransition", rug.a() + " unknown tag " + name);
                            StringBuilder sb22 = new StringBuilder();
                            sb22.append(".xml:");
                            sb22.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb22.toString());
                            break;
                        case 366511058:
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                c7e.e(context, xmlResourceParser, this.g.g);
                                break;
                            }
                            Log.e("ViewTransition", rug.a() + " unknown tag " + name);
                            StringBuilder sb222 = new StringBuilder();
                            sb222.append(".xml:");
                            sb222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb222.toString());
                            break;
                        default:
                            Log.e("ViewTransition", rug.a() + " unknown tag " + name);
                            StringBuilder sb2222 = new StringBuilder();
                            sb2222.append(".xml:");
                            sb2222.append(xmlResourceParser.getLineNumber());
                            Log.e("ViewTransition", sb2222.toString());
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ViewTransition", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ViewTransition", "Error parsing XML resource", e2);
        }
    }

    public final void a(vmn0 vmn0Var, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.e eVar, View... viewArr) {
        Interpolator loadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        iix iixVar = this.f;
        int i3 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            ia30 ia30Var = new ia30(view);
            ta30 ta30Var = ia30Var.f;
            ta30Var.c = 0.0f;
            ta30Var.w = 0.0f;
            ia30Var.H = true;
            ta30Var.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            ia30Var.g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            ha30 ha30Var = ia30Var.h;
            ha30Var.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            ha30Var.b(view);
            ha30 ha30Var2 = ia30Var.i;
            ha30Var2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            ha30Var2.b(view);
            ArrayList arrayList = (ArrayList) iixVar.a.get(-1);
            if (arrayList != null) {
                ia30Var.w.addAll(arrayList);
            }
            ia30Var.i(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i4 = this.h;
            int i5 = this.i;
            int i6 = this.b;
            Context context = motionLayout.getContext();
            int i7 = this.l;
            if (i7 == -2) {
                loadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            } else {
                if (i7 == -1) {
                    final qbn c = qbn.c(this.m);
                    interpolator = new Interpolator() { // from class: androidx.constraintlayout.motion.widget.ViewTransition$1
                        @Override // android.animation.TimeInterpolator
                        public float getInterpolation(float f) {
                            return (float) c.a(f);
                        }
                    };
                    new wv31(vmn0Var, ia30Var, i4, i5, i6, interpolator, this.p, this.q);
                    return;
                }
                loadInterpolator = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 5 ? i7 != 6 ? null : new AnticipateInterpolator() : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator();
            }
            interpolator = loadInterpolator;
            new wv31(vmn0Var, ia30Var, i4, i5, i6, interpolator, this.p, this.q);
            return;
        }
        e.a aVar = this.g;
        if (i2 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i8 = 0;
            while (i8 < constraintSetIds.length) {
                int i9 = constraintSetIds[i8];
                if (i9 != i) {
                    androidx.constraintlayout.widget.e constraintSet = motionLayout.getConstraintSet(i9);
                    int length = viewArr.length;
                    for (int i10 = i3; i10 < length; i10++) {
                        e.a p = constraintSet.p(viewArr[i10].getId());
                        if (aVar != null) {
                            androidx.constraintlayout.widget.d dVar = aVar.h;
                            if (dVar != null) {
                                dVar.e(p);
                            }
                            p.g.putAll(aVar.g);
                        }
                    }
                }
                i8++;
                i3 = 0;
            }
        }
        androidx.constraintlayout.widget.e eVar2 = new androidx.constraintlayout.widget.e();
        eVar2.h(eVar);
        for (View view2 : viewArr) {
            e.a p2 = eVar2.p(view2.getId());
            if (aVar != null) {
                androidx.constraintlayout.widget.d dVar2 = aVar.h;
                if (dVar2 != null) {
                    dVar2.e(p2);
                }
                p2.g.putAll(aVar.g);
            }
        }
        motionLayout.updateState(i, eVar2);
        motionLayout.updateState(kih0.view_transition, eVar);
        motionLayout.setState(kih0.view_transition, -1, -1);
        xa30 xa30Var = new xa30(motionLayout.mScene, kih0.view_transition, i);
        for (View view3 : viewArr) {
            int i11 = this.h;
            if (i11 != -1) {
                xa30Var.h = Math.max(i11, 8);
            }
            xa30Var.p = this.d;
            int i12 = this.l;
            String str = this.m;
            int i13 = this.n;
            xa30Var.e = i12;
            xa30Var.f = str;
            xa30Var.g = i13;
            int id = view3.getId();
            if (iixVar != null) {
                ArrayList arrayList2 = (ArrayList) iixVar.a.get(-1);
                iix iixVar2 = new iix();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jhx clone = ((jhx) it.next()).clone();
                    clone.b = id;
                    iixVar2.b(clone);
                }
                xa30Var.k.add(iixVar2);
            }
        }
        motionLayout.setTransition(xa30Var);
        motionLayout.transitionToEnd(new bo31(3, this, viewArr));
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.ViewTransition_android_id) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == z3i0.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == z3i0.ViewTransition_onStateTransition) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == z3i0.ViewTransition_transitionDisable) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == z3i0.ViewTransition_pathMotionArc) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == z3i0.ViewTransition_duration) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == z3i0.ViewTransition_upDuration) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == z3i0.ViewTransition_viewTransitionMode) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == z3i0.ViewTransition_motionInterpolator) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == z3i0.ViewTransition_setsTag) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == z3i0.ViewTransition_clearsTag) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == z3i0.ViewTransition_ifTagSet) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == z3i0.ViewTransition_ifTagNotSet) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == z3i0.ViewTransition_SharedValueId) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == z3i0.ViewTransition_SharedValue) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + rug.c(this.a, this.o) + Extension.C_BRAKE;
    }
}
