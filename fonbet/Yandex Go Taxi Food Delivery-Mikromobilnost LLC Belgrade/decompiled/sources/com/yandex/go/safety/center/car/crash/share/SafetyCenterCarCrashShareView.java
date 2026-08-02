package com.yandex.go.safety.center.car.crash.share;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.car.crash.share.SafetyCenterCarCrashShareView;
import com.yandex.go.safety.center.j;
import defpackage.g18;
import defpackage.hxj0;
import defpackage.kk5;
import defpackage.mrg0;
import defpackage.nac;
import defpackage.pav;
import defpackage.ppl0;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.swe0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse0;
import defpackage.wpl0;
import defpackage.yiz0;
import defpackage.ypl0;
import defpackage.zpl0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B-\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/safety/center/car/crash/share/SafetyCenterCarCrashShareView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lwpl0;", "Lzpl0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/safety/center/car/crash/share/a;", "presenter", "Lyiz0;", "styleDelegate", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lcom/yandex/go/safety/center/car/crash/share/a;Lyiz0;Lpav;)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lypl0;", "model", "render", "(Lypl0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lwpl0;", "Lcom/yandex/go/safety/center/car/crash/share/a;", "Lyiz0;", "Lpav;", "Lru/yandex/taxi/design/ListTitleComponent;", "title", "Lru/yandex/taxi/design/ListTitleComponent;", "Lru/yandex/taxi/design/ListTextComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "bottomButton", "Lru/yandex/taxi/design/ButtonComponent;", "topButton", "Lg18;", "imageCancellable", "Lg18;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterCarCrashShareView extends SlideableBindingModalView<wpl0> implements zpl0 {
    private final ButtonComponent bottomButton;
    private final ListTextComponent description;
    private g18 imageCancellable;
    private final pav imageLoader;
    private final a presenter;
    private final yiz0 styleDelegate;
    private final ListTitleComponent title;
    private final ButtonComponent topButton;

    public SafetyCenterCarCrashShareView(Context context, a aVar, yiz0 yiz0Var, pav pavVar) {
        super(context);
        this.presenter = aVar;
        this.styleDelegate = yiz0Var;
        this.imageLoader = pavVar;
        this.title = getBinding().e;
        this.description = getBinding().d;
        this.bottomButton = getBinding().c;
        this.topButton = getBinding().f;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new hxj0(15, aVar));
        ViewGroup bottomSheet = getBottomSheet();
        float r = tje.r(mrg0.go_design_s_space, getContext());
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.m(bottomSheet, r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(SafetyCenterCarCrashShareView safetyCenterCarCrashShareView) {
        a aVar = safetyCenterCarCrashShareView.presenter;
        j jVar = aVar.A;
        List f = jVar.f();
        ArrayList arrayList = new ArrayList(tcc.n(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(((swe0) it.next()).b);
        }
        ShareRequestParam n = jVar.n(aVar.H, ShareRequestParam.NotificationType.CONTACT_REQUEST, arrayList);
        jVar.o(n);
        aVar.D.a(n);
        ppl0 ppl0Var = aVar.C.a;
        ppl0Var.a.a("SafetyCenter.CarCrash.SendSmsTapped", tse0.o(ppl0Var), 1, new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$1(SafetyCenterCarCrashShareView safetyCenterCarCrashShareView) {
        a aVar = safetyCenterCarCrashShareView.presenter;
        ((kk5) aVar.z.b).r(new qu(9));
        ppl0 ppl0Var = aVar.C.a;
        ppl0Var.a.a("SafetyCenter.CarCrash.NotNowTapped", tse0.o(ppl0Var), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Bg(this);
        this.title.setTitleTypeface(this.styleDelegate.a(getContext()));
        ListTitleComponent listTitleComponent = this.title;
        this.styleDelegate.getClass();
        listTitleComponent.setTitleTextSizePx((int) tje.b0(getContext(), 24.0f));
        TextView title = this.title.title();
        this.styleDelegate.getClass();
        title.setLineHeight((int) tje.b0(getContext(), 27.0f));
        this.description.setTextPaddings(tje.u(16, getContext()), 0, tje.u(16, getContext()), tje.u(16, getContext()));
        final int i = 0;
        this.topButton.setDebounceClickListener(new Runnable(this) { // from class: dql0
            public final /* synthetic */ SafetyCenterCarCrashShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                SafetyCenterCarCrashShareView safetyCenterCarCrashShareView = this.b;
                switch (i2) {
                    case 0:
                        SafetyCenterCarCrashShareView.onAttachedToWindow$lambda$0(safetyCenterCarCrashShareView);
                        break;
                    default:
                        SafetyCenterCarCrashShareView.onAttachedToWindow$lambda$1(safetyCenterCarCrashShareView);
                        break;
                }
            }
        });
        final int i2 = 1;
        this.bottomButton.setDebounceClickListener(new Runnable(this) { // from class: dql0
            public final /* synthetic */ SafetyCenterCarCrashShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                SafetyCenterCarCrashShareView safetyCenterCarCrashShareView = this.b;
                switch (i22) {
                    case 0:
                        SafetyCenterCarCrashShareView.onAttachedToWindow$lambda$0(safetyCenterCarCrashShareView);
                        break;
                    default:
                        SafetyCenterCarCrashShareView.onAttachedToWindow$lambda$1(safetyCenterCarCrashShareView);
                        break;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.imageCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // defpackage.zpl0
    public void render(ypl0 model) {
        this.title.setTitle(model.a);
        this.description.setText(model.b);
        this.topButton.setText(model.c);
        this.bottomButton.setText(model.d);
        String str = model.e;
        if (str != null) {
            g18 g18Var = this.imageCancellable;
            if (g18Var != null) {
                g18Var.cancel();
            }
            this.imageCancellable = ((nac) this.imageLoader.a(getBinding().b)).c(str);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public wpl0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        return wpl0.o(inflater, parent);
    }
}
