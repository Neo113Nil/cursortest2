package com.yandex.go.vault.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a230;
import defpackage.c1o;
import defpackage.e230;
import defpackage.i3m;
import defpackage.idy;
import defpackage.llh0;
import defpackage.ny61;
import defpackage.pey;
import defpackage.u1y;
import defpackage.vir;
import defpackage.vng;
import defpackage.wir;
import defpackage.ywl;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0018\u0010#\u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/yandex/go/vault/ui/FlexFullscreenPopupModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lu1y;", "Landroid/content/Context;", "context", "Lflex/engine/a;", "engine", "Li3m;", "noOpDocumentTracker", "Lvir;", "configuration", "<init>", "(Landroid/content/Context;Lflex/engine/a;Li3m;Lvir;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "hasCustomBackground", "()Z", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lu1y;", "Le230;", "insetsType", "()Le230;", "Lflex/engine/a;", "Lvir;", "Lwir;", "tracker", "Lwir;", "Lidy;", "lifecycleAwareController", "Lidy;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FlexFullscreenPopupModalView extends SlideableBindingModalView<u1y> {
    private final vir configuration;
    private final flex.engine.a engine;
    private final idy lifecycleAwareController;
    private final wir tracker;

    public FlexFullscreenPopupModalView(Context context, flex.engine.a aVar, i3m i3mVar, vir virVar) {
        super(context);
        this.engine = aVar;
        this.configuration = virVar;
        this.tracker = new wir(i3mVar);
        idy idyVar = new idy();
        idyVar.a();
        this.lifecycleAwareController = idyVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        ywl ywlVar = virVar.c;
        if (ywlVar != null) {
            aVar.B(ywlVar, virVar.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(FlexFullscreenPopupModalView flexFullscreenPopupModalView) {
        return flexFullscreenPopupModalView;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return this.configuration.e.intValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public u1y bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(llh0.layout_popup_fullscreen_flex_container, parent, false);
        parent.addView(inflate);
        if (inflate != null) {
            return new u1y((GoFrameLayout) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new a230(11, new c1o(26, this), null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.lifecycleAwareController.d();
        vng.E(this, this.lifecycleAwareController);
        this.engine.c(this.tracker);
        pey o = vng.o(getBinding().a);
        if (o != null) {
            this.engine.g(getBinding().a, o);
        }
        getCardContentView().setBackground(this.configuration.b);
        getBottomSheet().setBackground(new ColorDrawable(0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.engine.j();
        this.engine.x(this.tracker);
        this.engine.i();
        this.lifecycleAwareController.b();
        super.onDetachedFromWindow();
    }
}
