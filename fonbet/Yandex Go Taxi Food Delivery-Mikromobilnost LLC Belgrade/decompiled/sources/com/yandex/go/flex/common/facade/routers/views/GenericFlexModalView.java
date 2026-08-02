package com.yandex.go.flex.common.facade.routers.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.yandex.go.flex.common.api.actions.CloseAction;
import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import com.yandex.go.flex.common.facade.b;
import defpackage.h00;
import defpackage.kr;
import defpackage.m99;
import defpackage.mnj;
import defpackage.rhr;
import defpackage.rkr;
import defpackage.xhr;
import defpackage.xxn;
import defpackage.zo31;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/flex/common/facade/routers/views/GenericFlexModalView;", "Lzo31;", "T", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrkr;", "Lh00;", "Landroid/content/Context;", "context", "Lrhr;", "flexConfig", "Lxhr;", "flexController", "<init>", "(Landroid/content/Context;Lrhr;Lxhr;)V", "", "screenName", "()Ljava/lang/String;", "", "canHandleScreenTracking", "()Z", "Lkr;", "action", "Lzy11;", "dispatchAction", "(Lkr;)V", "handleAction", "(Lkr;)Z", "Lrhr;", "Lxhr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class GenericFlexModalView<T extends zo31> extends SlideableBindingModalView<T> implements rkr, h00 {
    private final rhr flexConfig;
    private final xhr flexController;

    public GenericFlexModalView(Context context, rhr rhrVar, xhr xhrVar) {
        super(context, true);
        this.flexConfig = rhrVar;
        this.flexController = xhrVar;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return this.flexConfig.e();
    }

    public abstract /* synthetic */ void changeBackPressedState(boolean z);

    @Override // defpackage.h00
    public void dispatchAction(kr action) {
        ((b) this.flexController).a.k(action);
    }

    @Override // defpackage.rkr
    public boolean handleAction(kr action) {
        if (((Boolean) this.flexConfig.b().invoke(action)).booleanValue()) {
            return true;
        }
        if (action instanceof mnj) {
            changeBackPressedState(false);
            return true;
        }
        if (action instanceof xxn) {
            changeBackPressedState(true);
            return true;
        }
        if (action instanceof CloseAction) {
            onBackPressed();
            return true;
        }
        if (action instanceof CloseFlexScreenAction) {
            dismiss();
            return true;
        }
        if (!(action instanceof m99)) {
            return false;
        }
        m99 m99Var = (m99) action;
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{getBottomSheet().getBackground(), m99Var.a});
        getBottomSheet().setBackground(transitionDrawable);
        transitionDrawable.startTransition(m99Var.b);
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        String c = this.flexConfig.c();
        return c == null ? super.getModalScreenName() : c;
    }
}
