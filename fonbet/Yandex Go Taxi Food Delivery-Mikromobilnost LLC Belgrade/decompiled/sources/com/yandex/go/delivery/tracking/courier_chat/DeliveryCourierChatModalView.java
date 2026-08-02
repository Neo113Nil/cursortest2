package com.yandex.go.delivery.tracking.courier_chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import defpackage.a2h0;
import defpackage.amh;
import defpackage.bcs;
import defpackage.bth0;
import defpackage.ce0;
import defpackage.cih0;
import defpackage.cma1;
import defpackage.e230;
import defpackage.j0g;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pj;
import defpackage.qu;
import defpackage.t2i;
import defpackage.u2i;
import defpackage.uxh;
import defpackage.w2i;
import defpackage.w511;
import defpackage.x2i;
import defpackage.y130;
import defpackage.y2i;
import defpackage.z2i;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001!B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0018\u0010\"\u001a\u00060!R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/go/delivery/tracking/courier_chat/DeliveryCourierChatModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lu2i;", "Lbcs;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Lz2i;", "presenter", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lz2i;Lpav;Lk7x0;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lu2i;", "fragmentContainer", "()Landroid/view/ViewGroup;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "dismiss", "Lz2i;", "Lpav;", "Lk7x0;", "Lt2i;", "mvpView", "Lt2i;", "tracking"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryCourierChatModalView extends SlideableBindingModalView<u2i> implements bcs {
    private final pav imageLoader;
    private final t2i mvpView;
    private final z2i presenter;
    private final k7x0 tagUrlFormatter;

    public DeliveryCourierChatModalView(FragmentActivity fragmentActivity, z2i z2iVar, pav pavVar, k7x0 k7x0Var) {
        super(fragmentActivity);
        this.presenter = z2iVar;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.mvpView = new t2i(this);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    public static final /* synthetic */ u2i access$getBinding(DeliveryCourierChatModalView deliveryCourierChatModalView) {
        return deliveryCourierChatModalView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(DeliveryCourierChatModalView deliveryCourierChatModalView) {
        return deliveryCourierChatModalView.getBinding().c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(DeliveryCourierChatModalView deliveryCourierChatModalView) {
        deliveryCourierChatModalView.presenter.z.a.r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public u2i bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(bth0.delivery_courier_chat_modal_view, parent, false);
        int i = cih0.chat_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) cma1.O(i, inflate);
        if (fragmentContainerView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i2 = cih0.courier_chat_header;
            ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i2, inflate);
            if (toolbarComponent != null) {
                return new u2i(linearLayout, fragmentContainerView, linearLayout, toolbarComponent);
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        FragmentContainerView fragmentContainerView = getBinding().b;
        fragmentContainerView.post(new ce0(fragmentContainerView, 15));
    }

    @Override // defpackage.bcs
    public ViewGroup fragmentContainer() {
        return getBinding().b;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(0, new amh(12, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2i z2iVar = this.presenter;
        t2i t2iVar = this.mvpView;
        z2iVar.Bg(t2iVar);
        DeliveryCourierChatModalView deliveryCourierChatModalView = t2iVar.a;
        j0g j0gVar = z2iVar.y;
        Map Kg = z2iVar.Kg();
        pj pjVar = (pj) j0gVar.a;
        Object obj = Kg.get("bot_id");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = Kg.get("chat_id");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = Kg.get("delivery_metrics");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = Kg.get("order_id");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        HashMap hashMap = new HashMap();
        if (str3 != null) {
            hashMap.put("delivery_metrics", str3);
        }
        if (str != null) {
            hashMap.put("bot_id", str);
        }
        if (str2 != null) {
            hashMap.put("chat_id", str2);
        }
        if (str4 != null) {
            hashMap.put("order_id", str4);
        }
        pjVar.a.a("Delivery.OpenChat", hashMap, 1, new HashMap());
        y2i y2iVar = z2iVar.x;
        if (y2iVar instanceof x2i) {
            x2i x2iVar = (x2i) y2iVar;
            String str5 = x2iVar.b;
            String str6 = x2iVar.c;
            String str7 = x2iVar.d;
            access$getBinding(deliveryCourierChatModalView).d.setVisibility(0);
            ToolbarComponent toolbarComponent = access$getBinding(deliveryCourierChatModalView).d;
            toolbarComponent.setTitle(str5);
            toolbarComponent.setSubtitle(str6);
            if (str7 != null) {
                nac nacVar = (nac) deliveryCourierChatModalView.imageLoader.a(toolbarComponent.getLeadImageView());
                nacVar.i = new DeliveryCourierChatModalView$MvpViewImpl$showHeader$1$1$1(0, toolbarComponent, ToolbarComponent.class, "clearLeadView", "clearLeadView()V", 0);
                nacVar.c(((m7x0) deliveryCourierChatModalView.tagUrlFormatter).a(str7));
            } else {
                toolbarComponent.setLeadImage(a2h0.ic_courier_chat_header);
            }
        } else {
            if (!(y2iVar instanceof w2i)) {
                w511.b();
                return;
            }
            access$getBinding(deliveryCourierChatModalView).d.setVisibility(8);
        }
        getBinding().d.setOnCloseClickListener(new uxh(4, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
