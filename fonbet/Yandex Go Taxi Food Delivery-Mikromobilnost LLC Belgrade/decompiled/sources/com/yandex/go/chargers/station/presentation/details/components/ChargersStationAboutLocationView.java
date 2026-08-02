package com.yandex.go.chargers.station.presentation.details.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.payment.common.result.ResultType;
import defpackage.a2i0;
import defpackage.aki0;
import defpackage.aqa;
import defpackage.ara;
import defpackage.bgh;
import defpackage.bqa;
import defpackage.bys;
import defpackage.cma1;
import defpackage.cqa;
import defpackage.dqa;
import defpackage.eqa;
import defpackage.f3x;
import defpackage.f89;
import defpackage.fss;
import defpackage.g18;
import defpackage.hra;
import defpackage.j3x;
import defpackage.m810;
import defpackage.mj1;
import defpackage.n8a;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qha;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.vhh0;
import defpackage.wls;
import defpackage.wsh0;
import defpackage.wxs;
import defpackage.xji0;
import defpackage.xw31;
import defpackage.ypa;
import defpackage.zpa;
import defpackage.zqa;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0005*\u0001N\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001eQB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\n*\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\n*\u00020\u00182\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020&*\u00020\u001b2\u0006\u0010%\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020\u0006*\u00020)H\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\n\u0012\u0006\b\u0000\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00103\u001a\n\u0012\u0006\b\u0000\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u001c\u00104\u001a\n\u0012\u0006\b\u0000\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00102R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R<\u0010?\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010F\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationAboutLocationView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", ResultType.RESULT_TYPE_LOADING, "Lara;", "aboutLocation", "success", "(Lara;)V", "getDescriptionsAndBricksHeight", "()I", "Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationDetailsBrickView;", "createBrickView", "()Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationDetailsBrickView;", "Lru/yandex/taxi/widget/RobotoTextView;", "createTextView", "()Lru/yandex/taxi/widget/RobotoTextView;", "Lcom/yandex/go/design/view/GoImageView;", "createPhotoView", "()Lcom/yandex/go/design/view/GoImageView;", "Ldqa;", "brickState", "bindBrick", "(Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationDetailsBrickView;Ldqa;)V", "item", "bindDescriptionItem", "(Lru/yandex/taxi/widget/RobotoTextView;Ldqa;)V", "photoState", "Lg18;", "bindPhoto", "(Lcom/yandex/go/design/view/GoImageView;Ldqa;)Lg18;", "Landroid/view/View;", "getVisibleHeight", "(Landroid/view/View;)I", "Lhra;", "binding", "Lhra;", "Lbys;", "", "descriptionsAdapter", "Lbys;", "bricksAdapter", "photosAdapter", "Lpav;", "imageLoader", "Lpav;", "getImageLoader", "()Lpav;", "setImageLoader", "(Lpav;)V", "Lkotlin/Function2;", "", "", "onImageClickListener", "Lwls;", "getOnImageClickListener", "()Lwls;", "setOnImageClickListener", "(Lwls;)V", "Lfss;", "galleryViewerAnalyticsProxy", "Lfss;", "getGalleryViewerAnalyticsProxy", "()Lfss;", "setGalleryViewerAnalyticsProxy", "(Lfss;)V", "currentPhotoIndex", CA20Status.STATUS_USER_I, "eqa", "photoScrollListener", "Leqa;", "aqa", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersStationAboutLocationView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final hra binding;
    private final bys bricksAdapter;
    private int currentPhotoIndex;
    private final bys descriptionsAdapter;
    private fss galleryViewerAnalyticsProxy;
    private pav imageLoader;
    private wls onImageClickListener;
    private final eqa photoScrollListener;
    private final bys photosAdapter;

    public ChargersStationAboutLocationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(wsh0.chargers_station_details_about_location_view, this);
        int i2 = vhh0.bricks_rv;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i2, this);
        if (recyclerView != null) {
            i2 = vhh0.descriptions_rv;
            RecyclerView recyclerView2 = (RecyclerView) cma1.O(i2, this);
            if (recyclerView2 != null) {
                i2 = vhh0.photos_rv;
                RecyclerView recyclerView3 = (RecyclerView) cma1.O(i2, this);
                if (recyclerView3 != null) {
                    this.binding = new hra(this, recyclerView, recyclerView2, recyclerView3);
                    j3x j3xVar = new j3x();
                    descriptionsAdapter$lambda$0(this, context, j3xVar);
                    LinearLayoutManager linearLayoutManager = j3xVar.b;
                    recyclerView2.setLayoutManager(linearLayoutManager == null ? new LinearLayoutManager(recyclerView2.getContext(), 1, false) : linearLayoutManager);
                    bys bysVar = new bys(new wxs(), j3xVar.a);
                    recyclerView2.setAdapter(bysVar);
                    this.descriptionsAdapter = bysVar;
                    j3x j3xVar2 = new j3x();
                    bricksAdapter$lambda$0(context, this, j3xVar2);
                    LinearLayoutManager linearLayoutManager2 = j3xVar2.b;
                    recyclerView.setLayoutManager(linearLayoutManager2 == null ? new LinearLayoutManager(recyclerView.getContext(), 1, false) : linearLayoutManager2);
                    bys bysVar2 = new bys(new wxs(), j3xVar2.a);
                    recyclerView.setAdapter(bysVar2);
                    this.bricksAdapter = bysVar2;
                    j3x j3xVar3 = new j3x();
                    photosAdapter$lambda$0(context, this, j3xVar3);
                    LinearLayoutManager linearLayoutManager3 = j3xVar3.b;
                    recyclerView3.setLayoutManager(linearLayoutManager3 == null ? new LinearLayoutManager(recyclerView3.getContext(), 1, false) : linearLayoutManager3);
                    bys bysVar3 = new bys(new wxs(), j3xVar3.a);
                    recyclerView3.setAdapter(bysVar3);
                    this.photosAdapter = bysVar3;
                    this.photoScrollListener = new eqa(this);
                    setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void bindBrick(ChargersStationDetailsBrickView chargersStationDetailsBrickView, dqa dqaVar) {
        if (dqaVar instanceof bqa) {
            chargersStationDetailsBrickView.startLoading();
            return;
        }
        if (dqaVar instanceof cqa) {
            Object obj = ((cqa) dqaVar).a;
            if (obj instanceof zqa) {
                chargersStationDetailsBrickView.setTitle(((zqa) obj).a);
                chargersStationDetailsBrickView.setSubtitle(((zqa) obj).b);
                chargersStationDetailsBrickView.stopLoading();
            }
        }
    }

    private final void bindDescriptionItem(RobotoTextView robotoTextView, dqa dqaVar) {
        if (dqaVar instanceof cqa) {
            Object obj = ((cqa) dqaVar).a;
            if (obj instanceof CharSequence) {
                robotoTextView.setText((CharSequence) obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g18 bindPhoto(GoImageView goImageView, dqa dqaVar) {
        pav pavVar = this.imageLoader;
        if (pavVar != null && (dqaVar instanceof cqa)) {
            cqa cqaVar = (cqa) dqaVar;
            Object obj = cqaVar.a;
            if (obj instanceof String) {
                nac nacVar = (nac) pavVar.a(goImageView);
                nacVar.h = new f89(3, goImageView, cqaVar, this);
                return nacVar.c((String) obj);
            }
        }
        return g18.u1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindPhoto$lambda$0(GoImageView goImageView, dqa dqaVar, ChargersStationAboutLocationView chargersStationAboutLocationView, Drawable drawable) {
        c.z(new n8a(7, dqaVar, chargersStationAboutLocationView), goImageView);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindPhoto$lambda$0$0(dqa dqaVar, ChargersStationAboutLocationView chargersStationAboutLocationView) {
        cqa cqaVar = (cqa) dqaVar;
        int indexOf = cqaVar.b.indexOf(cqaVar.a);
        wls wlsVar = chargersStationAboutLocationView.onImageClickListener;
        if (wlsVar != null) {
            wlsVar.invoke(cqaVar.b, Integer.valueOf(indexOf));
        }
        return zy11.a;
    }

    private static final zy11 bricksAdapter$lambda$0(Context context, ChargersStationAboutLocationView chargersStationAboutLocationView, j3x j3xVar) {
        j3xVar.b = new GridLayoutManager(context, 4);
        aki0.b(new f3x(dqa.class, j3xVar, new ChargersStationAboutLocationView$bricksAdapter$1$1(0, chargersStationAboutLocationView, ChargersStationAboutLocationView.class, "createBrickView", "createBrickView()Lcom/yandex/go/chargers/station/presentation/details/components/ChargersStationDetailsBrickView;", 0)), new zpa(chargersStationAboutLocationView, 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bricksAdapter$lambda$0$0(ChargersStationAboutLocationView chargersStationAboutLocationView, ChargersStationDetailsBrickView chargersStationDetailsBrickView, dqa dqaVar) {
        chargersStationAboutLocationView.bindBrick(chargersStationDetailsBrickView, dqaVar);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChargersStationDetailsBrickView createBrickView() {
        return new ChargersStationDetailsBrickView(getContext(), null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GoImageView createPhotoView() {
        Context context = getContext();
        int b = m810.b(xw31.v() / 1.5f);
        int v = xw31.v() / 2;
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        goImageView.setLayoutParams(new ViewGroup.MarginLayoutParams(b, v));
        goImageView.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(16, goImageView.getContext())));
        goImageView.setClipToOutline(true);
        goImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return goImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RobotoTextView createTextView() {
        RobotoTextView robotoTextView = new RobotoTextView(getContext(), null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return robotoTextView;
    }

    private static final zy11 descriptionsAdapter$lambda$0(ChargersStationAboutLocationView chargersStationAboutLocationView, Context context, j3x j3xVar) {
        ypa ypaVar = new ypa(context, chargersStationAboutLocationView, 1);
        j3xVar.getClass();
        aki0.b(new f3x(bqa.class, j3xVar, ypaVar), new qha(4));
        aki0.b(new f3x(dqa.class, j3xVar, new ChargersStationAboutLocationView$descriptionsAdapter$1$3(0, chargersStationAboutLocationView, ChargersStationAboutLocationView.class, "createTextView", "createTextView()Lru/yandex/taxi/widget/RobotoTextView;", 0)), new zpa(chargersStationAboutLocationView, 2));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmeringBar descriptionsAdapter$lambda$0$0(Context context, ChargersStationAboutLocationView chargersStationAboutLocationView) {
        int h = c.h(30, chargersStationAboutLocationView);
        ShimmeringBar shimmeringBar = new ShimmeringBar(context, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
        shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, h));
        return shimmeringBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 descriptionsAdapter$lambda$0$1(ShimmeringBar shimmeringBar, bqa bqaVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 descriptionsAdapter$lambda$0$2(ChargersStationAboutLocationView chargersStationAboutLocationView, RobotoTextView robotoTextView, dqa dqaVar) {
        chargersStationAboutLocationView.bindDescriptionItem(robotoTextView, dqaVar);
        return zy11.a;
    }

    private final int getVisibleHeight(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getHeight();
    }

    private static final zy11 photosAdapter$lambda$0(Context context, ChargersStationAboutLocationView chargersStationAboutLocationView, j3x j3xVar) {
        int i = 0;
        j3xVar.b = new LinearLayoutManager(context, 0, false);
        aki0.b(new f3x(bqa.class, j3xVar, new ypa(context, chargersStationAboutLocationView, i)), new qha(3));
        f3x f3xVar = new f3x(cqa.class, j3xVar, new ChargersStationAboutLocationView$photosAdapter$1$3(0, chargersStationAboutLocationView, ChargersStationAboutLocationView.class, "createPhotoView", "createPhotoView()Lcom/yandex/go/design/view/GoImageView;", 0));
        j3xVar.a.add(new zxs(cqa.class, new xji0(f3xVar, 1), new mj1(new zpa(chargersStationAboutLocationView, i), f3xVar, 4)));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmeringBar photosAdapter$lambda$0$0(Context context, ChargersStationAboutLocationView chargersStationAboutLocationView) {
        int h = c.h(188, chargersStationAboutLocationView);
        ShimmeringBar shimmeringBar = new ShimmeringBar(context, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
        shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, h));
        return shimmeringBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 photosAdapter$lambda$0$1(ShimmeringBar shimmeringBar, bqa bqaVar) {
        return zy11.a;
    }

    public final int getDescriptionsAndBricksHeight() {
        return getVisibleHeight(this.binding.c) + getVisibleHeight(this.binding.b);
    }

    public final fss getGalleryViewerAnalyticsProxy() {
        return this.galleryViewerAnalyticsProxy;
    }

    public final pav getImageLoader() {
        return this.imageLoader;
    }

    public final wls getOnImageClickListener() {
        return this.onImageClickListener;
    }

    public final void loading() {
        if (getVisibility() == 0) {
            int visibility = this.binding.c.getVisibility();
            bqa bqaVar = bqa.a;
            if (visibility == 0) {
                this.descriptionsAdapter.submitList(Collections.singletonList(bqaVar), null);
            }
            if (this.binding.b.getVisibility() == 0) {
                this.bricksAdapter.submitList(scc.g(bqaVar, bqaVar, bqaVar, bqaVar), null);
            }
            if (this.binding.d.getVisibility() == 0) {
                this.photosAdapter.submitList(scc.g(bqaVar, bqaVar, bqaVar), null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.c.setItemAnimator(null);
        this.binding.b.setItemAnimator(null);
        this.binding.b.addItemDecoration(new aqa(getContext()));
        this.binding.d.setItemAnimator(null);
        this.binding.d.setClipToPadding(false);
        this.binding.d.setNestedScrollingEnabled(false);
        this.binding.d.addItemDecoration(new bgh(tje.u(16, getContext()), tje.u(4, getContext()), tje.u(16, getContext())));
        new f0().b(this.binding.d);
        this.binding.d.addOnScrollListener(this.photoScrollListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.binding.d.removeOnScrollListener(this.photoScrollListener);
    }

    public final void setGalleryViewerAnalyticsProxy(fss fssVar) {
        this.galleryViewerAnalyticsProxy = fssVar;
    }

    public final void setImageLoader(pav pavVar) {
        this.imageLoader = pavVar;
    }

    public final void setOnImageClickListener(wls wlsVar) {
        this.onImageClickListener = wlsVar;
    }

    public final void success(ara aboutLocation) {
        List list = aboutLocation != null ? aboutLocation.a : null;
        List list2 = aboutLocation != null ? aboutLocation.c : null;
        List list3 = aboutLocation != null ? aboutLocation.b : null;
        if (list == null && list2 == null && list3 == null) {
            setVisibility(8);
            return;
        }
        List list4 = list;
        if (list4 == null || list4.isEmpty()) {
            this.binding.c.setVisibility(8);
        } else {
            bys bysVar = this.descriptionsAdapter;
            List list5 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(new cqa((CharSequence) it.next(), list));
            }
            bysVar.submitList(arrayList, null);
            this.binding.c.setVisibility(0);
        }
        List list6 = list3;
        if (list6 == null || list6.isEmpty()) {
            this.binding.b.setVisibility(8);
        } else {
            bys bysVar2 = this.bricksAdapter;
            List list7 = list3;
            ArrayList arrayList2 = new ArrayList(tcc.n(list7, 10));
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new cqa((zqa) it2.next(), list3));
            }
            bysVar2.submitList(arrayList2, null);
            this.binding.b.setVisibility(0);
        }
        List list8 = list2;
        if (list8 == null || list8.isEmpty()) {
            this.binding.d.setVisibility(8);
        } else {
            bys bysVar3 = this.photosAdapter;
            List list9 = list2;
            ArrayList arrayList3 = new ArrayList(tcc.n(list9, 10));
            Iterator it3 = list9.iterator();
            while (it3.hasNext()) {
                arrayList3.add(new cqa((String) it3.next(), list2));
            }
            bysVar3.submitList(arrayList3, null);
            this.binding.d.setVisibility(0);
        }
        setVisibility(0);
        this.currentPhotoIndex = 0;
    }

    public ChargersStationAboutLocationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ChargersStationAboutLocationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ChargersStationAboutLocationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
