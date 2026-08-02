package com.yandex.go.places.complaint.impl.ui.modal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.places.complaint.impl.ui.modal.recycler.a;
import defpackage.avj0;
import defpackage.axc;
import defpackage.bb0;
import defpackage.bxc;
import defpackage.c29;
import defpackage.e48;
import defpackage.f28;
import defpackage.f2b;
import defpackage.g0c;
import defpackage.hbp0;
import defpackage.hi;
import defpackage.hxc;
import defpackage.i9a;
import defpackage.ixc;
import defpackage.kyh0;
import defpackage.m950;
import defpackage.mdh;
import defpackage.mxc;
import defpackage.nxc;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.ruh0;
import defpackage.rxc;
import defpackage.sjh;
import defpackage.sxc;
import defpackage.tje;
import defpackage.txc;
import defpackage.uxc;
import defpackage.uyj;
import defpackage.vqb;
import defpackage.zuj0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B7\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001a\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/places/complaint/impl/ui/modal/ComplaintModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lixc;", "Landroid/content/Context;", "context", "Lnxc;", "presenter", "Lmxc;", "payload", "Lzuj0;", "resourcesProxy", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lnxc;Lmxc;Lzuj0;Lpav;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lixc;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/content/Context;", "getContext$annotations", "Lnxc;", "Lmxc;", "Lzuj0;", "Lsxc;", "adapter", "Lsxc;", "", "closeActionId", CA20Status.STATUS_USER_I, "hxc", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComplaintModalView extends SlideableBindingModalView<ixc> {
    private final sxc adapter;
    private int closeActionId;
    private final Context context;
    private final mxc payload;
    private final nxc presenter;
    private final zuj0 resourcesProxy;

    public ComplaintModalView(Context context, nxc nxcVar, mxc mxcVar, zuj0 zuj0Var, pav pavVar) {
        super(context);
        this.context = context;
        this.presenter = nxcVar;
        this.payload = mxcVar;
        this.resourcesProxy = zuj0Var;
        vqb vqbVar = new vqb(12, this);
        txc txcVar = new txc(0, vqbVar);
        int i = a.U;
        g0c a = qoi0.a(axc.class);
        this.adapter = new sxc(txcVar, Collections.singletonList(new zxs(a.a(), 0, null, uxc.a, null, new i9a(21, pavVar, vqbVar))));
        this.closeActionId = -1;
        RecyclerView recyclerView = getBinding().b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new bxc(recyclerView.getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$0(ComplaintModalView complaintModalView, axc axcVar) {
        nxc nxcVar = complaintModalView.presenter;
        mxc mxcVar = complaintModalView.payload;
        hbp0 hbp0Var = nxcVar.A.a;
        nxcVar.B.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new ComplaintPresenter$onComplaintClicked$1(nxcVar, mxcVar, axcVar, null), 2);
        c29 c29Var = nxcVar.x;
        String str = axcVar.e;
        String str2 = axcVar.d;
        f28 f28Var = (f28) c29Var.b;
        f28Var.A((m950) ((f2b) f28Var.I).get(), new rxc(str, str2), new bb0(f28Var, 23));
        return zy11.a;
    }

    private static /* synthetic */ void getContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$0(ComplaintModalView complaintModalView, View view, hi hiVar) {
        ((f28) complaintModalView.presenter.x.b).r(new qu(9));
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ixc bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(ruh0.complaint_modal_view, parent, false);
        if (inflate != null) {
            RecyclerView recyclerView = (RecyclerView) inflate;
            return new ixc(recyclerView, recyclerView);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBinding().b.setAdapter(this.adapter);
        nxc nxcVar = this.presenter;
        nxcVar.Bg(new hxc(this));
        tje.N(nxcVar.Jg(), null, null, new ComplaintPresenter$loadData$1(nxcVar, null), 3);
        this.closeActionId = b.a(getBinding().a, ((avj0) this.resourcesProxy).h(kyh0.common_close), new e48(28, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        getBinding().b.setAdapter(null);
        if (this.closeActionId != -1) {
            RecyclerView recyclerView = getBinding().a;
            b.n(this.closeActionId, recyclerView);
            b.j(0, recyclerView);
        }
    }
}
