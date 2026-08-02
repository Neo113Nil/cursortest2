package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.adjust.sdk.Constants;
import defpackage.c7e;
import defpackage.ia30;
import defpackage.iix;
import defpackage.kbs;
import defpackage.kih0;
import defpackage.oyr;
import defpackage.qbn;
import defpackage.ra30;
import defpackage.rug;
import defpackage.vmn0;
import defpackage.we6;
import defpackage.xa30;
import defpackage.xv31;
import defpackage.z3i0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public final class c {
    public final MotionLayout a;
    public final we6 b;
    public xa30 c;
    public boolean d = false;
    public final ArrayList e;
    public final xa30 f;
    public final ArrayList g;
    public final SparseArray h;
    public final HashMap i;
    public final SparseIntArray j;
    public int k;
    public int l;
    public MotionEvent m;
    public boolean n;
    public boolean o;
    public ra30 p;
    public boolean q;
    public final vmn0 r;
    public float s;
    public float t;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public c(Context context, MotionLayout motionLayout, int i) {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = null;
        this.g = new ArrayList();
        this.h = new SparseArray();
        this.i = new HashMap();
        this.j = new SparseIntArray();
        this.k = Constants.MINIMAL_ERROR_STATUS_CODE;
        this.l = 0;
        this.n = false;
        this.o = false;
        this.a = motionLayout;
        this.r = new vmn0(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            xa30 xa30Var = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                j(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                iix iixVar = new iix(context, xml);
                                if (xa30Var != null) {
                                    xa30Var.k.add(iixVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -687739768:
                            if (!name.equals("Include")) {
                                break;
                            }
                            l(context, xml);
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                e eVar = new e(context, xml);
                                vmn0 vmn0Var = this.r;
                                ((ArrayList) vmn0Var.b).add(eVar);
                                vmn0Var.c = null;
                                int i2 = eVar.b;
                                if (i2 == 4) {
                                    ConstraintLayout.getSharedValues().a(eVar.u, new xv31());
                                    break;
                                } else if (i2 == 5) {
                                    ConstraintLayout.getSharedValues().a(eVar.u, new xv31());
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name.equals("Transition")) {
                                xa30Var = new xa30(this, context, xml);
                                boolean z = xa30Var.b;
                                arrayList.add(xa30Var);
                                if (this.c == null && !z) {
                                    this.c = xa30Var;
                                    d dVar = xa30Var.l;
                                    if (dVar != null) {
                                        dVar.c(this.q);
                                    }
                                }
                                if (z) {
                                    if (xa30Var.c == -1) {
                                        this.f = xa30Var;
                                    } else {
                                        this.g.add(xa30Var);
                                    }
                                    arrayList.remove(xa30Var);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 312750793:
                            if (name.equals("OnClick") && xa30Var != null && !motionLayout.isInEditMode()) {
                                xa30Var.m.add(new MotionScene$Transition$TransitionOnClick(context, xa30Var, xml));
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (xa30Var == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                if (xa30Var != null) {
                                    xa30Var.l = new d(context, motionLayout, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new we6(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1942574248:
                            if (name.equals("include")) {
                                l(context, xml);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.h.put(kih0.motion_base, new androidx.constraintlayout.widget.e());
        this.i.put("motion_base", Integer.valueOf(kih0.motion_base));
    }

    public static int d(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return i;
    }

    public final boolean a(MotionLayout motionLayout, int i) {
        xa30 xa30Var;
        if (this.p != null || this.d) {
            return false;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            xa30 xa30Var2 = (xa30) it.next();
            int i2 = xa30Var2.n;
            if (i2 != 0 && ((xa30Var = this.c) != xa30Var2 || (xa30Var.r & 2) == 0)) {
                if (i == xa30Var2.d && (i2 == 4 || i2 == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(xa30Var2);
                    if (xa30Var2.n == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.evaluate(true);
                    motionLayout.setState(MotionLayout.TransitionState.SETUP);
                    motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    motionLayout.setState(transitionState);
                    motionLayout.onNewStateAttachHandlers();
                    return true;
                }
                if (i == xa30Var2.c && (i2 == 3 || i2 == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(xa30Var2);
                    if (xa30Var2.n == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        return true;
                    }
                    motionLayout.setProgress(0.0f);
                    motionLayout.evaluate(true);
                    motionLayout.setState(MotionLayout.TransitionState.SETUP);
                    motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    motionLayout.setState(transitionState2);
                    motionLayout.onNewStateAttachHandlers();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.e b(int i) {
        int e;
        we6 we6Var = this.b;
        if (we6Var != null && (e = we6Var.e(i)) != -1) {
            i = e;
        }
        SparseArray sparseArray = this.h;
        if (sparseArray.get(i) != null) {
            return (androidx.constraintlayout.widget.e) sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + rug.c(i, this.a.getContext()) + " In MotionScene");
        return (androidx.constraintlayout.widget.e) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        xa30 xa30Var = this.c;
        return xa30Var != null ? xa30Var.h : this.k;
    }

    public final Interpolator e() {
        xa30 xa30Var = this.c;
        int i = xa30Var.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i == -1) {
            final qbn c = qbn.c(xa30Var.f);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene$1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f) {
                    return (float) c.a(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(ia30 ia30Var) {
        xa30 xa30Var = this.c;
        if (xa30Var != null) {
            Iterator it = xa30Var.k.iterator();
            while (it.hasNext()) {
                ((iix) it.next()).a(ia30Var);
            }
        } else {
            xa30 xa30Var2 = this.f;
            if (xa30Var2 != null) {
                Iterator it2 = xa30Var2.k.iterator();
                while (it2.hasNext()) {
                    ((iix) it2.next()).a(ia30Var);
                }
            }
        }
    }

    public final float g() {
        d dVar;
        xa30 xa30Var = this.c;
        if (xa30Var == null || (dVar = xa30Var.l) == null) {
            return 0.0f;
        }
        return dVar.t;
    }

    public final int h() {
        xa30 xa30Var = this.c;
        if (xa30Var == null) {
            return -1;
        }
        return xa30Var.d;
    }

    public final ArrayList i(int i) {
        int e;
        we6 we6Var = this.b;
        if (we6Var != null && (e = we6Var.e(i)) != -1) {
            i = e;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            xa30 xa30Var = (xa30) it.next();
            if (xa30Var.d == i || xa30Var.c == i) {
                arrayList.add(xa30Var);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int j(Context context, XmlResourceParser xmlResourceParser) {
        boolean z;
        boolean z2;
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 973381616:
                    if (attributeName.equals("stateLabels")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    i2 = d(context, attributeValue);
                    break;
                case true:
                    try {
                        eVar.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z2 = 2;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z2 = 3;
                                    break;
                                }
                                z2 = -1;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z2 = 4;
                                    break;
                                }
                                z2 = -1;
                                break;
                            default:
                                z2 = -1;
                                break;
                        }
                        switch (z2) {
                            case false:
                                eVar.d = 4;
                                break;
                            case true:
                                eVar.d = 2;
                                break;
                            case true:
                                eVar.d = 0;
                                break;
                            case true:
                                eVar.d = 1;
                                break;
                            case true:
                                eVar.d = 3;
                                break;
                        }
                    }
                    break;
                case true:
                    i = d(context, attributeValue);
                    int indexOf = attributeValue.indexOf(47);
                    if (indexOf >= 0) {
                        attributeValue = attributeValue.substring(indexOf + 1);
                    }
                    this.i.put(attributeValue, Integer.valueOf(i));
                    eVar.a = rug.c(i, context);
                    break;
                case true:
                    eVar.c = attributeValue.split(",");
                    int i4 = 0;
                    while (true) {
                        String[] strArr = eVar.c;
                        if (i4 < strArr.length) {
                            strArr[i4] = strArr[i4].trim();
                            i4++;
                        }
                    }
                    break;
            }
        }
        if (i != -1) {
            int i5 = this.a.mDebugPath;
            eVar.r(context, xmlResourceParser);
            if (i2 != -1) {
                this.j.put(i, i2);
            }
            this.h.put(i, eVar);
        }
        return i;
    }

    public final int k(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return j(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.include_constraintSet) {
                k(obtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.k);
                this.k = i2;
                if (i2 < 8) {
                    this.k = 8;
                }
            } else if (index == z3i0.MotionScene_layoutDuringTransition) {
                this.l = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void n(MotionLayout motionLayout, int i) {
        SparseArray sparseArray = this.h;
        androidx.constraintlayout.widget.e eVar = (androidx.constraintlayout.widget.e) sparseArray.get(i);
        String str = eVar.a;
        HashMap hashMap = eVar.g;
        eVar.b = str;
        int i2 = this.j.get(i);
        if (i2 > 0) {
            n(motionLayout, i2);
            androidx.constraintlayout.widget.e eVar2 = (androidx.constraintlayout.widget.e) sparseArray.get(i2);
            if (eVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + rug.c(i2, this.a.getContext()));
                return;
            }
            HashMap hashMap2 = eVar2.g;
            eVar.b += "/" + eVar2.b;
            for (Integer num : hashMap2.keySet()) {
                num.getClass();
                e.a aVar = (e.a) hashMap2.get(num);
                if (!hashMap.containsKey(num)) {
                    hashMap.put(num, new e.a());
                }
                e.a aVar2 = (e.a) hashMap.get(num);
                if (aVar2 != null) {
                    e.b bVar = aVar2.e;
                    if (!bVar.b) {
                        bVar.a(aVar.e);
                    }
                    e.d dVar = aVar2.c;
                    if (!dVar.a) {
                        dVar.a(aVar.c);
                    }
                    e.C0007e c0007e = aVar2.f;
                    if (!c0007e.a) {
                        c0007e.a(aVar.f);
                    }
                    e.c cVar = aVar2.d;
                    if (!cVar.a) {
                        cVar.a(aVar.d);
                    }
                    for (String str2 : aVar.g.keySet()) {
                        if (!aVar2.g.containsKey(str2)) {
                            aVar2.g.put(str2, (c7e) aVar.g.get(str2));
                        }
                    }
                }
            }
        } else {
            eVar.b = oyr.t(new StringBuilder(), eVar.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (eVar.f && id == -1) {
                    kbs.g("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!hashMap.containsKey(Integer.valueOf(id))) {
                    hashMap.put(Integer.valueOf(id), new e.a());
                }
                e.a aVar3 = (e.a) hashMap.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    e.d dVar2 = aVar3.c;
                    e.b bVar2 = aVar3.e;
                    e.C0007e c0007e2 = aVar3.f;
                    if (!bVar2.b) {
                        aVar3.d(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            bVar2.j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar2.o0 = barrier.getAllowsGoneWidget();
                                bVar2.g0 = barrier.getType();
                                bVar2.h0 = barrier.getMargin();
                            }
                        }
                        bVar2.b = true;
                    }
                    if (!dVar2.a) {
                        dVar2.b = childAt.getVisibility();
                        dVar2.d = childAt.getAlpha();
                        dVar2.a = true;
                    }
                    if (!c0007e2.a) {
                        c0007e2.a = true;
                        c0007e2.b = childAt.getRotation();
                        c0007e2.c = childAt.getRotationX();
                        c0007e2.d = childAt.getRotationY();
                        c0007e2.e = childAt.getScaleX();
                        c0007e2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            c0007e2.g = pivotX;
                            c0007e2.h = pivotY;
                        }
                        c0007e2.j = childAt.getTranslationX();
                        c0007e2.k = childAt.getTranslationY();
                        c0007e2.l = childAt.getTranslationZ();
                        if (c0007e2.m) {
                            c0007e2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (e.a aVar4 : hashMap.values()) {
            if (aVar4.h != null) {
                if (aVar4.b == null) {
                    aVar4.h.e(eVar.p(aVar4.a));
                } else {
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        e.a p = eVar.p(((Integer) it.next()).intValue());
                        String str3 = p.e.l0;
                        if (str3 != null && aVar4.b.matches(str3)) {
                            aVar4.h.e(p);
                            p.g.putAll((HashMap) aVar4.g.clone());
                        }
                    }
                }
            }
        }
    }

    public final void o(MotionLayout motionLayout) {
        int i = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.h;
            if (i >= sparseArray.size()) {
                return;
            }
            int keyAt = sparseArray.keyAt(i);
            SparseIntArray sparseIntArray = this.j;
            int i2 = sparseIntArray.get(keyAt);
            int size = sparseIntArray.size();
            while (i2 > 0) {
                if (i2 == keyAt) {
                    break loop0;
                }
                int i3 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i2 = sparseIntArray.get(i2);
                size = i3;
            }
            n(motionLayout, keyAt);
            i++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r1 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(int i, int i2) {
        int i3;
        int i4;
        we6 we6Var = this.b;
        if (we6Var != null) {
            i3 = we6Var.e(i);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = we6Var.e(i2);
        } else {
            i3 = i;
        }
        i4 = i2;
        xa30 xa30Var = this.c;
        if (xa30Var != null && xa30Var.c == i2 && xa30Var.d == i) {
            return;
        }
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xa30 xa30Var2 = (xa30) it.next();
            int i5 = xa30Var2.c;
            if ((i5 == i4 && xa30Var2.d == i3) || (i5 == i2 && xa30Var2.d == i)) {
                this.c = xa30Var2;
                d dVar = xa30Var2.l;
                if (dVar != null) {
                    dVar.c(this.q);
                    return;
                }
                return;
            }
        }
        Iterator it2 = this.g.iterator();
        xa30 xa30Var3 = this.f;
        while (it2.hasNext()) {
            xa30 xa30Var4 = (xa30) it2.next();
            if (xa30Var4.c == i2) {
                xa30Var3 = xa30Var4;
            }
        }
        xa30 xa30Var5 = new xa30(this, xa30Var3);
        xa30Var5.d = i3;
        xa30Var5.c = i4;
        if (i3 != -1) {
            arrayList.add(xa30Var5);
        }
        this.c = xa30Var5;
    }

    public final boolean q() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (((xa30) it.next()).l != null) {
                return true;
            }
        }
        xa30 xa30Var = this.c;
        return (xa30Var == null || xa30Var.l == null) ? false : true;
    }
}
