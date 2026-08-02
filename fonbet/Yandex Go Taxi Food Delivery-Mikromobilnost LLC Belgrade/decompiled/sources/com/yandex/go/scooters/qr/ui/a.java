package com.yandex.go.scooters.qr.ui;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.InputFilter;
import android.util.Size;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.camera.core.f;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.scooters.qr.analytics.ScootersQrAnalytics$State;
import defpackage.apo0;
import defpackage.bpo0;
import defpackage.bys;
import defpackage.co7;
import defpackage.d8p0;
import defpackage.gl;
import defpackage.kp50;
import defpackage.mpo0;
import defpackage.n5o0;
import defpackage.npo0;
import defpackage.pxm0;
import defpackage.qp7;
import defpackage.tje;
import defpackage.too0;
import defpackage.yso;
import defpackage.z8n0;
import defpackage.zoo0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;

/* loaded from: classes13.dex */
public final class a implements npo0 {
    public final ValueAnimator a;
    public final RectF b;
    public final RectF c;
    public final int w;
    public final /* synthetic */ ScootersQrModalView x;

    public a(ScootersQrModalView scootersQrModalView) {
        this.x = scootersQrModalView;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setDuration(100L);
        valueAnimator.addUpdateListener(new yso(28, scootersQrModalView));
        this.a = valueAnimator;
        this.b = new RectF();
        this.c = new RectF();
        this.w = tje.u(8, scootersQrModalView.getContext());
    }

    public static final void h(a aVar) {
        ru.yandex.taxi.camera.ml.c cVar;
        zoo0 zoo0Var;
        ru.yandex.taxi.camera.ml.c cVar2;
        ScootersQrCameraPreview scootersQrCameraPreview;
        int i;
        ScootersQrCameraPreview scootersQrCameraPreview2;
        int i2;
        ScootersQrCameraPreview scootersQrCameraPreview3;
        ScootersQrCameraPreview scootersQrCameraPreview4;
        ScootersQrModalView scootersQrModalView = aVar.x;
        cVar = scootersQrModalView.mlCameraController;
        zoo0Var = scootersQrModalView.scootersQrMlVisionDetectorFactory;
        cVar.d = new com.yandex.go.scooters.qr.ml_detector.a((gl) ((z8n0) ((apo0) zoo0Var).a.b).get(), new ScootersQrModalView$InnerMvpView$startMlDetection$1(1, aVar, a.class, "onQrFound", "onQrFound(Lru/yandex/taxi/qr/QrUriScan;)V", 0), new bpo0(scootersQrModalView, 5));
        cVar2 = scootersQrModalView.mlCameraController;
        scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
        if (scootersQrCameraPreview.getWidth() != 0) {
            scootersQrCameraPreview4 = scootersQrModalView.qrCameraPreview;
            i = scootersQrCameraPreview4.getWidth();
        } else {
            i = 1080;
        }
        scootersQrCameraPreview2 = scootersQrModalView.qrCameraPreview;
        if (scootersQrCameraPreview2.getHeight() != 0) {
            scootersQrCameraPreview3 = scootersQrModalView.qrCameraPreview;
            i2 = scootersQrCameraPreview3.getHeight();
        } else {
            i2 = 2080;
        }
        cVar2.b(new Size(i, i2));
    }

    @Override // defpackage.npo0
    public final void G0() {
        View view;
        ru.yandex.taxi.camera.ml.c cVar;
        qp7 b;
        ScootersQrModalView scootersQrModalView = this.x;
        view = scootersQrModalView.flashlightBtn;
        view.setSelected(true);
        cVar = scootersQrModalView.mlCameraController;
        co7 co7Var = cVar.i;
        if (co7Var == null || (b = co7Var.b()) == null) {
            return;
        }
        b.f(true);
    }

    @Override // defpackage.npo0
    public final void J2(int i, int i2, List list, List list2) {
        KeyboardAwareRobotoEditText keyboardAwareRobotoEditText;
        List list3;
        List list4;
        Flow flow;
        ListItemCheckComponent createVendorSelectorItem;
        List list5;
        ConstraintLayout constraintLayout;
        Flow flow2;
        List list6;
        ConstraintLayout constraintLayout2;
        Flow flow3;
        bys prefixSelectorButtonsAdapter;
        RecyclerView recyclerView;
        ScootersQrModalView scootersQrModalView = this.x;
        scootersQrModalView.vendorsForManualSelection = list2;
        scootersQrModalView.numberLength = i;
        scootersQrModalView.validNumberMinLength = Math.min(i2, i);
        keyboardAwareRobotoEditText = scootersQrModalView.invisibleEditText;
        keyboardAwareRobotoEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i), new InputFilter.AllCaps()});
        Object obj = null;
        if (list.size() > 1) {
            scootersQrModalView.multiplePrefixes = true;
            prefixSelectorButtonsAdapter = scootersQrModalView.getPrefixSelectorButtonsAdapter();
            prefixSelectorButtonsAdapter.submitList(list, null);
            recyclerView = scootersQrModalView.prefixSelectorRecyclerView;
            recyclerView.setVisibility(0);
        }
        String str = (String) kotlin.collections.a.R(list);
        if (str == null) {
            str = "";
        }
        scootersQrModalView.selectedPrefix = str;
        if (list2.size() > 1) {
            scootersQrModalView.multipleVendors = true;
            list3 = scootersQrModalView.vendorSelectorItems;
            int size = list3.size() - list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                list6 = scootersQrModalView.vendorSelectorItems;
                ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) kp50.M(list6);
                constraintLayout2 = scootersQrModalView.qrRoot;
                constraintLayout2.removeView(listItemCheckComponent);
                flow3 = scootersQrModalView.vendorSelectorFlow;
                flow3.removeView(listItemCheckComponent);
            }
            int size2 = list2.size();
            list4 = scootersQrModalView.vendorSelectorItems;
            int size3 = size2 - list4.size();
            for (int i4 = 0; i4 < size3; i4++) {
                createVendorSelectorItem = scootersQrModalView.createVendorSelectorItem();
                list5 = scootersQrModalView.vendorSelectorItems;
                list5.add(createVendorSelectorItem);
                constraintLayout = scootersQrModalView.qrRoot;
                constraintLayout.addView(createVendorSelectorItem);
                flow2 = scootersQrModalView.vendorSelectorFlow;
                flow2.addView(createVendorSelectorItem);
            }
            flow = scootersQrModalView.vendorSelectorFlow;
            flow.setVisibility(0);
        }
        if (!list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((mpo0) next).a.equals(d8p0.a)) {
                    obj = next;
                    break;
                }
            }
            mpo0 mpo0Var = (mpo0) obj;
            if (mpo0Var == null) {
                mpo0Var = (mpo0) kotlin.collections.a.P(list2);
            }
            scootersQrModalView.selectedVendor = mpo0Var;
        }
        scootersQrModalView.refreshManualEnterField();
    }

    @Override // defpackage.npo0
    public final void L(Rect rect) {
        ScootersQrCameraPreview scootersQrCameraPreview;
        Runnable runnable;
        Runnable runnable2;
        ScootersQrModalView scootersQrModalView = this.x;
        scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
        Rect rect2 = new Rect(rect);
        int i = -this.w;
        rect2.set(rect2.left - i, rect2.top - i, rect2.right + i, rect2.bottom + i);
        scootersQrCameraPreview.grabQrRect(rect2);
        runnable = scootersQrModalView.leaveGrabbedQrRectRunnable;
        scootersQrModalView.removeCallbacks(runnable);
        runnable2 = scootersQrModalView.leaveGrabbedQrRectRunnable;
        scootersQrModalView.postDelayed(runnable2, 300L);
    }

    @Override // defpackage.npo0
    public final void M() {
        ru.yandex.taxi.camera.ml.c cVar;
        cVar = this.x.mlCameraController;
        f fVar = cVar.g;
        if (fVar != null) {
            fVar.N((ExecutorService) cVar.h.getValue(), new ru.yandex.taxi.camera.ml.b(cVar));
        }
    }

    @Override // defpackage.npo0
    public final void V() {
        ScootersQrCameraPreview scootersQrCameraPreview;
        Group group;
        too0 too0Var;
        pxm0 pxm0Var;
        ScootersQrModalView scootersQrModalView = this.x;
        scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
        scootersQrCameraPreview.setActive(false);
        group = scootersQrModalView.permissionsGroup;
        group.setVisibility(0);
        too0Var = scootersQrModalView.scootersQrAnalytics;
        ScootersQrAnalytics$State scootersQrAnalytics$State = ScootersQrAnalytics$State.PERMISSION_REQUEST;
        pxm0Var = scootersQrModalView.scootersAnalyticPath;
        too0Var.a(scootersQrAnalytics$State, pxm0Var.b);
    }

    @Override // defpackage.npo0
    public final void je() {
        View view;
        ru.yandex.taxi.camera.ml.c cVar;
        qp7 b;
        ScootersQrModalView scootersQrModalView = this.x;
        view = scootersQrModalView.flashlightBtn;
        view.setSelected(false);
        cVar = scootersQrModalView.mlCameraController;
        co7 co7Var = cVar.i;
        if (co7Var == null || (b = co7Var.b()) == null) {
            return;
        }
        b.f(false);
    }

    @Override // defpackage.npo0
    public final void n4(int i) {
        Guideline guideline;
        Guideline guideline2;
        ValueAnimator valueAnimator = this.a;
        valueAnimator.cancel();
        ScootersQrModalView scootersQrModalView = this.x;
        guideline = scootersQrModalView.offerCardOffsetGuideline;
        int i2 = ((ConstraintLayout.LayoutParams) guideline.getLayoutParams()).guideEnd;
        guideline2 = scootersQrModalView.offerCardOffsetGuideline;
        valueAnimator.setIntValues(i2, Math.max(i, guideline2.getPaddingBottom()));
        valueAnimator.start();
    }

    @Override // defpackage.npo0
    public final void p0() {
        ru.yandex.taxi.camera.ml.c cVar;
        cVar = this.x.mlCameraController;
        f fVar = cVar.g;
        if (fVar != null) {
            fVar.H();
        }
    }

    @Override // defpackage.npo0
    public final void releaseCamera() {
        ru.yandex.taxi.camera.ml.c cVar;
        ScootersQrCameraPreview scootersQrCameraPreview;
        je();
        ScootersQrModalView scootersQrModalView = this.x;
        cVar = scootersQrModalView.mlCameraController;
        cVar.a();
        scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
        scootersQrCameraPreview.detachPreview();
    }

    @Override // defpackage.npo0
    public final void startCamera() {
        n5o0 n5o0Var;
        Group group;
        ScootersQrCameraPreview scootersQrCameraPreview;
        ConstraintLayout constraintLayout;
        ScootersQrModalView scootersQrModalView = this.x;
        n5o0Var = scootersQrModalView.scootersOneShotHistogramTimeReporter;
        n5o0Var.b("Perf.ScootersQrView.InitScan");
        group = scootersQrModalView.permissionsGroup;
        group.setVisibility(8);
        scootersQrCameraPreview = scootersQrModalView.qrCameraPreview;
        scootersQrCameraPreview.setVisibility(0);
        scootersQrModalView.applyManualOrQrViewState();
        constraintLayout = scootersQrModalView.qrRoot;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.scooters.qr.ui.ScootersQrModalView$InnerMvpView$startCamera$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    a.h(a.this);
                }
            });
        } else {
            h(this);
        }
    }

    @Override // defpackage.npo0
    public final void stopCamera() {
        ru.yandex.taxi.camera.ml.c cVar;
        cVar = this.x.mlCameraController;
        cVar.f.c();
    }
}
