package com.yandex.go.safety.center.share;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;
import com.yandex.go.safety.center.j;
import com.yandex.go.safety.center.share.SafetyCenterPromoShareView;
import defpackage.aul0;
import defpackage.i7h0;
import defpackage.jtl0;
import defpackage.ktl0;
import defpackage.kyh0;
import defpackage.q5z;
import defpackage.qu;
import defpackage.rp31;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.vjr0;
import defpackage.x4e;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/safety/center/share/SafetyCenterPromoShareView;", "Lcom/yandex/go/safety/center/base/BaseSafetyCenterView;", "Ljtl0;", "Landroid/content/Context;", "context", "Lktl0;", "presenter", "Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;", "experiment", "<init>", "(Landroid/content/Context;Lktl0;Lcom/yandex/go/safety/center/experiment/SafetyCenterExperiment;)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lktl0;", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "toolbar", "Lru/yandex/taxi/design/FloatingTitleToolbarComponent;", "Lru/yandex/taxi/design/ListTextComponent;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Lru/yandex/taxi/design/ListTextComponent;", "Lru/yandex/taxi/design/ButtonComponent;", "laterButton", "Lru/yandex/taxi/design/ButtonComponent;", "addButton", "", "getCardContentViewLayoutRes", "()I", "cardContentViewLayoutRes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterPromoShareView extends BaseSafetyCenterView implements jtl0 {
    private final ButtonComponent addButton;
    private final ListTextComponent description;
    private final ButtonComponent laterButton;
    private final ktl0 presenter;
    private final FloatingTitleToolbarComponent toolbar;

    public SafetyCenterPromoShareView(Context context, ktl0 ktl0Var, SafetyCenterExperiment safetyCenterExperiment) {
        super(context, ktl0Var);
        this.presenter = ktl0Var;
        int i = i7h0.safety_center_toolbar;
        WeakHashMap weakHashMap = b.a;
        FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) ((View) rp31.d(this, i));
        this.toolbar = floatingTitleToolbarComponent;
        ListTextComponent listTextComponent = (ListTextComponent) ((View) rp31.d(this, i7h0.safety_center_description));
        this.description = listTextComponent;
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, i7h0.safety_center_after));
        this.laterButton = buttonComponent;
        ButtonComponent buttonComponent2 = (ButtonComponent) ((View) rp31.d(this, i7h0.safety_center_add));
        this.addButton = buttonComponent2;
        floatingTitleToolbarComponent.setTitle(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_PROMO_TITLE));
        listTextComponent.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_PROMO_DESCRIPTION));
        buttonComponent.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_PROMO_LATER_LINK_TITLE));
        buttonComponent2.setText(safetyCenterExperiment.a(SafetyCenterExperiment.L10nKey.SHARE_SCREEN_PROMO_ADD_LINK_TITLE));
        final int i2 = 0;
        floatingTitleToolbarComponent.setOnBackClickListener(new Runnable(this) { // from class: mtl0
            public final /* synthetic */ SafetyCenterPromoShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                SafetyCenterPromoShareView safetyCenterPromoShareView = this.b;
                switch (i3) {
                    case 0:
                        SafetyCenterPromoShareView._init_$lambda$0(safetyCenterPromoShareView);
                        break;
                    case 1:
                        SafetyCenterPromoShareView._init_$lambda$1(safetyCenterPromoShareView);
                        break;
                    default:
                        SafetyCenterPromoShareView._init_$lambda$2(safetyCenterPromoShareView);
                        break;
                }
            }
        });
        final int i3 = 1;
        buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: mtl0
            public final /* synthetic */ SafetyCenterPromoShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                SafetyCenterPromoShareView safetyCenterPromoShareView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterPromoShareView._init_$lambda$0(safetyCenterPromoShareView);
                        break;
                    case 1:
                        SafetyCenterPromoShareView._init_$lambda$1(safetyCenterPromoShareView);
                        break;
                    default:
                        SafetyCenterPromoShareView._init_$lambda$2(safetyCenterPromoShareView);
                        break;
                }
            }
        });
        final int i4 = 2;
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: mtl0
            public final /* synthetic */ SafetyCenterPromoShareView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i4;
                SafetyCenterPromoShareView safetyCenterPromoShareView = this.b;
                switch (i32) {
                    case 0:
                        SafetyCenterPromoShareView._init_$lambda$0(safetyCenterPromoShareView);
                        break;
                    case 1:
                        SafetyCenterPromoShareView._init_$lambda$1(safetyCenterPromoShareView);
                        break;
                    default:
                        SafetyCenterPromoShareView._init_$lambda$2(safetyCenterPromoShareView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SafetyCenterPromoShareView safetyCenterPromoShareView) {
        safetyCenterPromoShareView.presenter.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SafetyCenterPromoShareView safetyCenterPromoShareView) {
        ktl0 ktl0Var = safetyCenterPromoShareView.presenter;
        tje.N(ktl0Var.Jg(), null, null, new SafetyCenterPromoSharePresenter$onAddClick$1(ktl0Var, null), 3);
        x4e.B(ktl0Var.y.a.a, "SafetyCenter.SharePromo.AddTapped", new HashMap(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(SafetyCenterPromoShareView safetyCenterPromoShareView) {
        ktl0 ktl0Var = safetyCenterPromoShareView.presenter;
        ((aul0) ktl0Var.A.b).r(new qu(9));
        j jVar = ktl0Var.x;
        String e = jVar.e();
        if (e != null) {
            vjr0 vjr0Var = jVar.h;
            int i = kyh0.bottom_sheet_share_route;
            Activity activity = vjr0Var.a;
            q5z.c0(e, activity.getString(i), activity, 0);
        }
        x4e.B(ktl0Var.y.a.a, "SafetyCenter.SharePromo.LaterTapped", new HashMap(), 1);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        int i = i7h0.root;
        WeakHashMap weakHashMap = b.a;
        return (View) rp31.d(this, i);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return tjh0.safety_center_share_promo_view;
    }
}
