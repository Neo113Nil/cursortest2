package com.yandex.div.legacy.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.k;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.yandex.alicekit.core.utils.animation.PressTouchAnimator;
import com.yandex.div.legacy.BackgroundImageDrawable;
import com.yandex.div.legacy.DivContext;
import com.yandex.div.legacy.dagger.DivComponent;
import defpackage.b5l;
import defpackage.b64;
import defpackage.d090;
import defpackage.d4x;
import defpackage.eil;
import defpackage.esk;
import defpackage.g8a1;
import defpackage.gtk;
import defpackage.h8l;
import defpackage.hdu;
import defpackage.hrk;
import defpackage.hxy;
import defpackage.idl;
import defpackage.l76;
import defpackage.lfk;
import defpackage.lj2;
import defpackage.ljl;
import defpackage.lmk;
import defpackage.m9y;
import defpackage.mpl;
import defpackage.n15;
import defpackage.nl;
import defpackage.nmk;
import defpackage.ny61;
import defpackage.o9y;
import defpackage.ogh0;
import defpackage.pmk;
import defpackage.q9y;
import defpackage.rml;
import defpackage.rrk;
import defpackage.shk;
import defpackage.ssk;
import defpackage.tdl;
import defpackage.tiz0;
import defpackage.tpl;
import defpackage.u4r0;
import defpackage.w53;
import defpackage.x3k;
import defpackage.xal;
import defpackage.xdb1;
import defpackage.xol;
import defpackage.ym11;
import defpackage.yol;
import defpackage.ysk;
import defpackage.z83;
import defpackage.zjk;
import defpackage.zmk;
import defpackage.zsk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes11.dex */
public class DivView extends LinearLayout {
    private final DivComponent mComponent;
    private m9y mConfig;
    private int mCurrentStateId;
    private pmk mData;
    private final List<WeakReference<hxy>> mImageLoadReferences;
    private final List<d090> mOverflowMenuListeners;
    private zmk mTag;

    public DivView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mOverflowMenuListeners = new ArrayList(1);
        this.mImageLoadReferences = new ArrayList();
        this.mCurrentStateId = -1;
        this.mConfig = m9y.E2;
        this.mTag = zmk.b;
        if (!(context instanceof DivContext)) {
            ny61.r("Use DivContext for creating this v");
            throw null;
        }
        setOrientation(1);
        this.mComponent = ((DivContext) context).getComponent();
    }

    private void cancelImageLoads() {
        Iterator<WeakReference<hxy>> it = this.mImageLoadReferences.iterator();
        while (it.hasNext()) {
            hxy hxyVar = it.next().get();
            if (hxyVar != null) {
                hxyVar.cancel();
            }
        }
        this.mImageLoadReferences.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setActionHandlerForView$0(View view, x3k x3kVar, View view2) {
        this.mComponent.a();
        TextUtils.isEmpty(x3kVar.a);
        handleUri(x3kVar.b);
    }

    private void setBackgroundData(pmk pmkVar) {
        ArrayList<lfk> arrayList = pmkVar.a;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (lfk lfkVar : arrayList) {
            gtk d = this.mComponent.d();
            Object obj = null;
            if (lfkVar != null) {
                d4x d4xVar = lfkVar.a;
                String str = lfkVar.b;
                xal xalVar = "div-solid-background".equals(str) ? (xal) d4xVar : null;
                if (xalVar != null) {
                    obj = new ColorDrawable(xalVar.a);
                } else {
                    esk eskVar = "div-gradient-background".equals(str) ? (esk) d4xVar : null;
                    if (eskVar != null) {
                        obj = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{eskVar.b, eskVar.a});
                    } else {
                        ssk sskVar = "div-image-background".equals(str) ? (ssk) d4xVar : null;
                        if (sskVar != null) {
                            String uri = sskVar.a.toString();
                            obj = new BackgroundImageDrawable(getContext());
                            int i = 1;
                            addLoadReference(d.loadImage(uri, new zsk(i, new tpl(this, obj, i))), this);
                        }
                    }
                }
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        setBackground(new LayerDrawable((Drawable[]) arrayList2.toArray(new Drawable[arrayList2.size()])));
    }

    private void setState(int i) {
        nmk nmkVar;
        View a;
        ArrayList arrayList;
        this.mCurrentStateId = i;
        removeAllViews();
        pmk pmkVar = this.mData;
        int i2 = this.mCurrentStateId;
        if (i2 != -1) {
            Iterator it = pmkVar.b.iterator();
            while (it.hasNext()) {
                nmkVar = (nmk) it.next();
                if (nmkVar.c == i2) {
                    break;
                }
            }
            z83.j("Non existent state id got " + i2);
        }
        nmkVar = null;
        if (nmkVar == null) {
            this.mCurrentStateId = -1;
            return;
        }
        hdu stateManager = this.mComponent.getStateManager();
        zmk zmkVar = this.mTag;
        int i3 = this.mCurrentStateId;
        if (!zmk.b.equals(zmkVar)) {
            o9y l = stateManager.l(zmkVar);
            ((w53) stateManager.b).put(zmkVar, l == null ? new o9y(i3) : new o9y(i3, l.b));
            ((q9y) stateManager.a).a.put(zmkVar.a, String.valueOf(i3));
        }
        setActionHandlerForView(this, nmkVar.a);
        yol c = this.mComponent.c();
        String a2 = n15.a(b64.j(UUID.randomUUID().toString(), "/state"), String.valueOf(this.mCurrentStateId));
        ArrayList arrayList2 = nmkVar.b;
        xol xolVar = new xol(c, this, a2);
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            lmk lmkVar = (lmk) arrayList2.get(i4);
            String str = lmkVar.b;
            n15 n15Var = lmkVar.a;
            shk shkVar = "div-buttons-block".equals(str) ? (shk) n15Var : null;
            yol yolVar = xolVar.d;
            if (shkVar != null) {
                if (!shkVar.z.isEmpty()) {
                    a = xolVar.a(shkVar, yolVar.a);
                }
                a = null;
            } else {
                hrk hrkVar = "div-footer-block".equals(str) ? (hrk) n15Var : null;
                if (hrkVar != null) {
                    a = xolVar.a(hrkVar, yolVar.c);
                } else {
                    ysk yskVar = "div-image-block".equals(str) ? (ysk) n15Var : null;
                    if (yskVar != null) {
                        if (xdb1.d(yskVar.x)) {
                            a = xolVar.a(yskVar, yolVar.e);
                        }
                        a = null;
                    } else {
                        h8l h8lVar = "div-separator-block".equals(str) ? (h8l) n15Var : null;
                        if (h8lVar != null) {
                            a = xolVar.a(h8lVar, yolVar.f);
                        } else {
                            idl idlVar = "div-table-block".equals(str) ? (idl) n15Var : null;
                            if (idlVar != null) {
                                a = xolVar.a(idlVar, yolVar.g);
                            } else {
                                eil eilVar = "div-title-block".equals(str) ? (eil) n15Var : null;
                                if (eilVar != null) {
                                    if (!TextUtils.isEmpty(eilVar.z) || ((arrayList = eilVar.y) != null && !arrayList.isEmpty())) {
                                        a = xolVar.a(eilVar, yolVar.i);
                                    }
                                    a = null;
                                } else {
                                    ljl ljlVar = "div-traffic-block".equals(str) ? (ljl) n15Var : null;
                                    if (ljlVar != null) {
                                        a = xolVar.b(ljlVar);
                                    } else {
                                        rml rmlVar = "div-universal-block".equals(str) ? (rml) n15Var : null;
                                        if (rmlVar != null) {
                                            a = xolVar.a(rmlVar, yolVar.k);
                                        } else {
                                            rrk rrkVar = "div-gallery-block".equals(str) ? (rrk) n15Var : null;
                                            if (rrkVar != null) {
                                                a = xolVar.a(rrkVar, yolVar.d);
                                            } else {
                                                zjk zjkVar = "div-container-block".equals(str) ? (zjk) n15Var : null;
                                                if (zjkVar != null) {
                                                    a = xolVar.a(zjkVar, yolVar.b);
                                                } else {
                                                    tdl tdlVar = "div-tabs-block".equals(str) ? (tdl) n15Var : null;
                                                    if (tdlVar != null) {
                                                        a = xolVar.a(tdlVar, yolVar.h);
                                                    } else {
                                                        z83.j("Unknown div block got ".concat(lmkVar.toString()));
                                                        a = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            xolVar.c++;
            if (a != null) {
                addView(a);
            }
        }
    }

    private void setWidth() {
        pmk pmkVar = this.mData;
        b5l b = pmkVar != null ? pmkVar.c.b() : null;
        if (b == null || !"wrap_content".equals(b.a)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
    }

    public void addLoadReference(hxy hxyVar, View view) {
        Object tag = view.getTag(ogh0.load_references_tag);
        if (tag == null) {
            view.setTag(ogh0.load_references_tag, u4r0.d(hxyVar));
        } else {
            ym11.d(tag).add(hxyVar);
        }
        this.mImageLoadReferences.add(new WeakReference<>(hxyVar));
    }

    public void cleanup() {
        dismissPendingOverflowMenus();
        this.mOverflowMenuListeners.clear();
        this.mCurrentStateId = -1;
        this.mData = null;
        setBackground(null);
        cancelImageLoads();
        clearSubscriptions();
    }

    public void clearSubscriptions() {
        this.mOverflowMenuListeners.clear();
    }

    public void dismissPendingOverflowMenus() {
        Iterator<d090> it = this.mOverflowMenuListeners.iterator();
        while (it.hasNext()) {
            com.yandex.div.legacy.widget.menu.a aVar = ((tiz0) it.next()).a;
            k kVar = aVar.m;
            if (kVar != null) {
                kVar.c.a();
                aVar.m = null;
            }
        }
    }

    public m9y getConfig() {
        return this.mConfig;
    }

    public o9y getCurrentState() {
        o9y l = this.mComponent.getStateManager().l(this.mTag);
        pmk pmkVar = this.mData;
        if (pmkVar == null || l == null) {
            return null;
        }
        Iterator it = pmkVar.b.iterator();
        while (it.hasNext()) {
            if (((nmk) it.next()).c == l.a) {
                return l;
            }
        }
        return null;
    }

    public int getCurrentStateId() {
        return this.mCurrentStateId;
    }

    public pmk getDivData() {
        return this.mData;
    }

    public zmk getDivTag() {
        return this.mTag;
    }

    public View getView() {
        return this;
    }

    public void handleUri(Uri uri) {
        this.mComponent.b().a(uri, this);
    }

    public boolean hasScrollableViewUnder(MotionEvent motionEvent) {
        int[] iArr = mpl.a;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = motionEvent.getHistorySize() < 1 ? -1 : motionEvent.getHistoricalX(0) < motionEvent.getX() ? 4 : 8;
        int childCount = getChildCount();
        loop0: for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() == ogh0.div_tabs_block && g8a1.f(rawX, rawY, childAt)) {
                ViewPager viewPager = (ViewPager) g8a1.e(ogh0.div_tabs_pager_container, childAt);
                if (!(i < 0 ? true : i != 4 ? i != 8 ? false : viewPager.canScrollHorizontally(1) : viewPager.canScrollHorizontally(-1))) {
                    for (int i3 = 0; i3 < 2; i3++) {
                        RecyclerView recyclerView = (RecyclerView) viewPager.findViewById(mpl.a[i3]);
                        if (recyclerView != null && mpl.a(recyclerView, rawX, rawY, i)) {
                            break loop0;
                        }
                    }
                }
                return true;
            }
            if ((childAt instanceof RecyclerView) && mpl.a((RecyclerView) childAt, rawX, rawY, i)) {
                return true;
            }
        }
        return false;
    }

    public void onConfigurationChangedOutside(Configuration configuration) {
        dismissPendingOverflowMenus();
    }

    public void resetToInitialState() {
        int b;
        o9y currentState = getCurrentState();
        if (currentState != null) {
            currentState.b.clear();
        }
        pmk pmkVar = this.mData;
        if (pmkVar == null) {
            z83.j("This shouldn't happen. Fix in MOBSEARCHANDROID-16428");
            b = -1;
        } else {
            b = xdb1.b(pmkVar);
        }
        setState(b);
    }

    public void setActionHandlerForView(View view, x3k x3kVar) {
        if (x3kVar == null) {
            FastOutSlowInInterpolator fastOutSlowInInterpolator = lj2.a;
            setOnTouchListener(null);
            setOnClickListener(null);
        } else {
            FastOutSlowInInterpolator fastOutSlowInInterpolator2 = lj2.a;
            view.setOnTouchListener(new PressTouchAnimator(view, view.getAlpha(), l76.w));
            view.setOnClickListener(new nl(6, this, view, x3kVar));
            if (TextUtils.isEmpty(x3kVar.a)) {
                return;
            }
            this.mComponent.e();
        }
    }

    public void setConfig(m9y m9yVar) {
        this.mConfig = m9yVar;
    }

    public boolean setDivData(pmk pmkVar, zmk zmkVar) {
        if (this.mData == pmkVar) {
            return false;
        }
        cleanup();
        this.mData = pmkVar;
        this.mTag = zmkVar;
        setBackgroundData(pmkVar);
        setWidth();
        o9y currentState = getCurrentState();
        switchToState(currentState == null ? xdb1.b(pmkVar) : currentState.a);
        return true;
    }

    public void subscribe(d090 d090Var) {
        this.mOverflowMenuListeners.add(d090Var);
    }

    public void switchToInitialState() {
        pmk pmkVar = this.mData;
        if (pmkVar == null) {
            return;
        }
        setState(xdb1.b(pmkVar));
    }

    public void switchToState(int i) {
        if (this.mCurrentStateId == i) {
            return;
        }
        setState(i);
    }

    public DivView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DivView(Context context) {
        this(context, null);
    }
}
