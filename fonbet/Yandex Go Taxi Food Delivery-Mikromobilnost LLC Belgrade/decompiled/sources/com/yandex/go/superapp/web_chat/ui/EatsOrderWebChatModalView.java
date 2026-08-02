package com.yandex.go.superapp.web_chat.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import defpackage.aj7;
import defpackage.bcs;
import defpackage.bxl;
import defpackage.cma1;
import defpackage.dm41;
import defpackage.evu0;
import defpackage.g8h0;
import defpackage.jqr;
import defpackage.mth;
import defpackage.ny61;
import defpackage.qfn;
import defpackage.qkh0;
import defpackage.uhm;
import defpackage.wbn;
import defpackage.wpy0;
import defpackage.xbn;
import defpackage.y130;
import defpackage.y2b;
import defpackage.ybn;
import defpackage.zbn;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB\u0019\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/yandex/go/superapp/web_chat/ui/EatsOrderWebChatModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwbn;", "Lbcs;", "Landroid/content/Context;", "context", "Lzbn;", "presenter", "<init>", "(Landroid/content/Context;Lzbn;)V", "Ly130;", "insetsType", "()Ly130;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwbn;", "fragmentContainer", "()Landroid/view/ViewGroup;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lzbn;", "qfn", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsOrderWebChatModalView extends SlideableBindingModalView<wbn> implements bcs {
    private final zbn presenter;

    public EatsOrderWebChatModalView(Context context, zbn zbnVar) {
        super(context);
        this.presenter = zbnVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(EatsOrderWebChatModalView eatsOrderWebChatModalView) {
        return eatsOrderWebChatModalView.getBinding().c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$onPhoneCallClick(zbn zbnVar) {
        wpy0 wpy0Var = zbnVar.x;
        ybn ybnVar = zbnVar.z;
        String str = ybnVar.c;
        dm41 dm41Var = (dm41) wpy0Var.b;
        dm41Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put(Constants.KEY_SERVICE, str);
        }
        dm41Var.a.a("WebViewChat.PhoneCall", hashMap, 1, new HashMap());
        ((aj7) zbnVar.y).b(ybnVar.b, true);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wbn bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(qkh0.eats_chat_modal_view, parent, false);
        int i = g8h0.chat_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) cma1.O(i, inflate);
        if (fragmentContainerView != null) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) inflate;
            int i2 = g8h0.chat_header;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
            if (listItemComponent != null) {
                return new wbn(linearLayoutCompat, fragmentContainerView, linearLayoutCompat, listItemComponent);
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.bcs
    public ViewGroup fragmentContainer() {
        return getBinding().b;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(0, new bxl(22, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zbn zbnVar = this.presenter;
        zbnVar.Bg(new qfn(this));
        xbn xbnVar = (xbn) zbnVar.Dg();
        ybn ybnVar = zbnVar.z;
        xbnVar.render(new y2b(ybnVar.a, ybnVar.d, !evu0.J(ybnVar.b)));
        e.H(zbnVar.Jg(), new jqr(e.t(new mth(zbnVar.A.a(), 4)), new EatsChatPresenter$attachView$1(zbnVar, null), 3));
        getBinding().d.setLeadContainerClickListener(new uhm(9, this));
        getBinding().d.setTrailContainerClickListener(new uhm(10, this.presenter));
        setOnTouchOutsideListener(null);
        setDismissOnTouchOutside(false);
        TextView title = getBinding().d.title();
        title.requestFocus();
        title.setIncludeFontPadding(false);
        getBinding().d.subtitle().setIncludeFontPadding(false);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
