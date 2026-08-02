package com.yandex.go.scooters.misc.message.attention;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.scooters.misc.message.attention.ScootersAttentionMessageModalView;
import defpackage.cma1;
import defpackage.j6m0;
import defpackage.k7x0;
import defpackage.m7h0;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.w7n0;
import defpackage.wjh0;
import defpackage.zy11;
import defpackage.zym0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/yandex/go/scooters/misc/message/attention/ScootersAttentionMessageModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lw7n0;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lzym0;", "params", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Lzym0;)V", "", "iconTag", "Lzy11;", "renderIcon", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lw7n0;", "onAttachedToWindow", "()V", "Lpav;", "Lk7x0;", "Lzym0;", "getParams", "()Lzym0;", "azm0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAttentionMessageModalView extends SlideableBindingModalView<w7n0> {
    public static final int $stable = 8;
    private final pav imageLoader;
    private final zym0 params;
    private final k7x0 tagUrlFormatter;

    public ScootersAttentionMessageModalView(Context context, pav pavVar, k7x0 k7x0Var, zym0 zym0Var) {
        super(context);
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        this.params = zym0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$0(ScootersAttentionMessageModalView scootersAttentionMessageModalView) {
        scootersAttentionMessageModalView.params.d.invoke();
    }

    private final void renderIcon(String iconTag) {
        if (iconTag == null) {
            getBinding().b.setVisibility(8);
            return;
        }
        String a = ((m7x0) this.tagUrlFormatter).a(iconTag);
        nac nacVar = (nac) this.imageLoader.a(getBinding().b);
        nacVar.i = new j6m0(15, this);
        nacVar.c(a);
        getBinding().b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderIcon$lambda$0(ScootersAttentionMessageModalView scootersAttentionMessageModalView) {
        scootersAttentionMessageModalView.getBinding().b.setVisibility(8);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public w7n0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(wjh0.scooters_common_message_modal_view, parent, false);
        int i = m7h0.icon;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = m7h0.message;
            ListTextComponent listTextComponent = (ListTextComponent) cma1.O(i, inflate);
            if (listTextComponent != null) {
                i = m7h0.primary_button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    return new w7n0((GoLinearLayout) inflate, imageView, listTextComponent, buttonComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final zym0 getParams() {
        return this.params;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int i = 0;
        qdb1.b(this, new Runnable(this) { // from class: yym0
            public final /* synthetic */ ScootersAttentionMessageModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ScootersAttentionMessageModalView scootersAttentionMessageModalView = this.b;
                switch (i2) {
                    case 0:
                        scootersAttentionMessageModalView.onBackPressed();
                        break;
                    default:
                        ScootersAttentionMessageModalView.onAttachedToWindow$lambda$0(scootersAttentionMessageModalView);
                        break;
                }
            }
        });
        renderIcon(this.params.c);
        getBinding().c.setText(this.params.a);
        getBinding().d.setText(this.params.b);
        final int i2 = 1;
        getBinding().d.setDebounceClickListener(new Runnable(this) { // from class: yym0
            public final /* synthetic */ ScootersAttentionMessageModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ScootersAttentionMessageModalView scootersAttentionMessageModalView = this.b;
                switch (i22) {
                    case 0:
                        scootersAttentionMessageModalView.onBackPressed();
                        break;
                    default:
                        ScootersAttentionMessageModalView.onAttachedToWindow$lambda$0(scootersAttentionMessageModalView);
                        break;
                }
            }
        });
    }
}
