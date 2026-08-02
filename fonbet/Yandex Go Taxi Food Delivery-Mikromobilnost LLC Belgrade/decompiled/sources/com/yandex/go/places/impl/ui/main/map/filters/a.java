package com.yandex.go.places.impl.ui.main.map.filters;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import defpackage.e3h0;
import defpackage.e6c0;
import defpackage.evu0;
import defpackage.f1h0;
import defpackage.g6c0;
import defpackage.jwd;
import defpackage.k5c0;
import defpackage.l5c0;
import defpackage.m2y;
import defpackage.n5c0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.rbc0;
import defpackage.sbc0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tt2;
import defpackage.vng;
import defpackage.xw90;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class a implements g6c0 {
    public final /* synthetic */ PlacesCategoryFiltersModalView a;

    public a(PlacesCategoryFiltersModalView placesCategoryFiltersModalView) {
        this.a = placesCategoryFiltersModalView;
    }

    @Override // defpackage.g6c0
    public final void Ff(String str, String str2) {
        e6c0 binding;
        e6c0 binding2;
        pav pavVar;
        PlacesCategoryFiltersModalView placesCategoryFiltersModalView = this.a;
        binding = placesCategoryFiltersModalView.getBinding();
        m2y m2yVar = binding.e;
        RobotoTextView robotoTextView = (RobotoTextView) m2yVar.b;
        GoLinearLayout goLinearLayout = (GoLinearLayout) m2yVar.c;
        robotoTextView.setText(str2);
        if (str != null) {
            pavVar = placesCategoryFiltersModalView.imageLoader;
            ((nac) pavVar.a((GoImageView) m2yVar.e)).c(str);
        }
        goLinearLayout.setVisibility(((str == null || evu0.J(str)) && str2.length() == 0) ? 8 : 0);
        binding2 = placesCategoryFiltersModalView.getBinding();
        binding2.b.setVisibility(goLinearLayout.getVisibility() != 0 ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[LOOP:1: B:20:0x00a4->B:22:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // defpackage.g6c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O9(k5c0 k5c0Var, ContinuationImpl continuationImpl) {
        PlacesCategoryFiltersModalView$InnerMvp$renderBookings$1 placesCategoryFiltersModalView$InnerMvp$renderBookings$1;
        int i;
        e6c0 binding;
        tt2 tt2Var;
        PlacesCategoryFiltersModalView placesCategoryFiltersModalView;
        n5c0 n5c0Var;
        List list;
        ?? h;
        int f;
        int bookingImageSize;
        int bookingImageSize2;
        int bookingImageOverlapMargin;
        pav pavVar;
        if (continuationImpl instanceof PlacesCategoryFiltersModalView$InnerMvp$renderBookings$1) {
            placesCategoryFiltersModalView$InnerMvp$renderBookings$1 = (PlacesCategoryFiltersModalView$InnerMvp$renderBookings$1) continuationImpl;
            int i2 = placesCategoryFiltersModalView$InnerMvp$renderBookings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesCategoryFiltersModalView$InnerMvp$renderBookings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesCategoryFiltersModalView$InnerMvp$renderBookings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesCategoryFiltersModalView$InnerMvp$renderBookings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlacesCategoryFiltersModalView placesCategoryFiltersModalView2 = this.a;
                    binding = placesCategoryFiltersModalView2.getBinding();
                    n5c0 n5c0Var2 = binding.c;
                    n5c0Var2.d.setText(k5c0Var.a);
                    CompressionResistantListComponent compressionResistantListComponent = n5c0Var2.c;
                    List<jwd> list2 = k5c0Var.b;
                    tt2Var = placesCategoryFiltersModalView2.appDispatchers;
                    placesCategoryFiltersModalView$InnerMvp$renderBookings$1.L$0 = k5c0Var;
                    placesCategoryFiltersModalView$InnerMvp$renderBookings$1.L$1 = placesCategoryFiltersModalView2;
                    placesCategoryFiltersModalView$InnerMvp$renderBookings$1.L$2 = n5c0Var2;
                    placesCategoryFiltersModalView$InnerMvp$renderBookings$1.label = 1;
                    if (compressionResistantListComponent.setTexts$impl(list2, tt2Var, placesCategoryFiltersModalView$InnerMvp$renderBookings$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    placesCategoryFiltersModalView = placesCategoryFiltersModalView2;
                    n5c0Var = n5c0Var2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n5c0Var = (n5c0) placesCategoryFiltersModalView$InnerMvp$renderBookings$1.L$2;
                    PlacesCategoryFiltersModalView placesCategoryFiltersModalView3 = (PlacesCategoryFiltersModalView) placesCategoryFiltersModalView$InnerMvp$renderBookings$1.L$1;
                    k5c0 k5c0Var2 = (k5c0) placesCategoryFiltersModalView$InnerMvp$renderBookings$1.L$0;
                    kotlin.b.b(obj);
                    placesCategoryFiltersModalView = placesCategoryFiltersModalView3;
                    k5c0Var = k5c0Var2;
                }
                list = k5c0Var.e;
                if (list != null || list.isEmpty()) {
                    h = scc.h(k5c0Var.c);
                } else {
                    List list3 = k5c0Var.e;
                    h = new ArrayList(tcc.n(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        h.add(((l5c0) it.next()).d);
                    }
                }
                for (f = scc.f(h); -1 < f; f--) {
                    ImageView imageView = new ImageView(placesCategoryFiltersModalView.getContext());
                    bookingImageSize = placesCategoryFiltersModalView.getBookingImageSize();
                    bookingImageSize2 = placesCategoryFiltersModalView.getBookingImageSize();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bookingImageSize, bookingImageSize2);
                    layoutParams.gravity = 8388613;
                    imageView.setClipToOutline(true);
                    bookingImageOverlapMargin = placesCategoryFiltersModalView.getBookingImageOverlapMargin();
                    layoutParams.setMarginEnd((scc.f(h) - f) * bookingImageOverlapMargin);
                    imageView.setBackgroundResource(e3h0.rounded_image_background);
                    imageView.setLayoutParams(layoutParams);
                    pavVar = placesCategoryFiltersModalView.imageLoader;
                    ((nac) pavVar.a(imageView)).c((String) h.get(f));
                    n5c0Var.b.addView(imageView);
                }
                GoLinearLayout goLinearLayout = n5c0Var.a;
                ru.yandex.taxi.design.utils.c.z(new xw90(20, k5c0Var, placesCategoryFiltersModalView), goLinearLayout);
                goLinearLayout.setVisibility(0);
                return zy11.a;
            }
        }
        placesCategoryFiltersModalView$InnerMvp$renderBookings$1 = new PlacesCategoryFiltersModalView$InnerMvp$renderBookings$1(this, continuationImpl);
        Object obj2 = placesCategoryFiltersModalView$InnerMvp$renderBookings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesCategoryFiltersModalView$InnerMvp$renderBookings$1.label;
        if (i != 0) {
        }
        list = k5c0Var.e;
        if (list != null) {
        }
        h = scc.h(k5c0Var.c);
        while (-1 < f) {
        }
        GoLinearLayout goLinearLayout2 = n5c0Var.a;
        ru.yandex.taxi.design.utils.c.z(new xw90(20, k5c0Var, placesCategoryFiltersModalView), goLinearLayout2);
        goLinearLayout2.setVisibility(0);
        return zy11.a;
    }

    @Override // defpackage.g6c0
    public final void b(float f, boolean z) {
        e6c0 binding;
        binding = this.a.getBinding();
        ControlButtonView controlButtonView = binding.d;
        controlButtonView.setVisibility(z ? 0 : 8);
        controlButtonView.setRotation(360.0f - f);
    }

    @Override // defpackage.g6c0
    public final void c(boolean z) {
        e6c0 binding;
        PlacesCategoryFiltersModalView placesCategoryFiltersModalView = this.a;
        binding = placesCategoryFiltersModalView.getBinding();
        binding.f.setImageDrawable(vng.t(z ? f1h0.ic_location_fill_24 : e3h0.ic_places_compass_crossed, placesCategoryFiltersModalView.getContext()));
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        e6c0 binding;
        rbc0 mapCategoryFiltersAdapter;
        sbc0 sbc0Var = (sbc0) obj;
        PlacesCategoryFiltersModalView placesCategoryFiltersModalView = this.a;
        placesCategoryFiltersModalView.hasRenderedCategoryFilters = true;
        binding = placesCategoryFiltersModalView.getBinding();
        binding.g.setVisibility(!sbc0Var.a.isEmpty() ? 0 : 8);
        mapCategoryFiltersAdapter = placesCategoryFiltersModalView.getMapCategoryFiltersAdapter();
        mapCategoryFiltersAdapter.submitList(sbc0Var.a, null);
    }
}
