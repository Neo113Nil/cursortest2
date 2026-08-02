package com.yandex.go.settings.push_settings;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.settings.push_settings.PushSettingsModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a230;
import defpackage.b15;
import defpackage.b6g;
import defpackage.g3g0;
import defpackage.i5m;
import defpackage.iw8;
import defpackage.jde0;
import defpackage.jpf0;
import defpackage.mqg0;
import defpackage.n3w;
import defpackage.pav;
import defpackage.q5z;
import defpackage.rp31;
import defpackage.sls;
import defpackage.tt2;
import defpackage.veh0;
import defpackage.vm80;
import defpackage.vnb1;
import defpackage.w550;
import defpackage.xvf0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;
import ru.yandex.taxi.settings.presentation.settings.PushSettingsView;
import ru.yandex.taxi.settings.presentation.settings.a;
import ru.yandex.taxi.widget.ModalView;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001$B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001e\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/yandex/go/settings/push_settings/PushSettingsModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lg3g0;", "pushSettingsComponentFactory", "Lru/yandex/taxi/settings/model/PushSettingsOpenReason;", "pushSettingsOpenReason", "<init>", "(Landroid/content/Context;Lg3g0;Lru/yandex/taxi/settings/model/PushSettingsOpenReason;)V", "La230;", "insetsType", "()La230;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Ljava/lang/Runnable;", "onBackPressedListener", "Lzy11;", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lru/yandex/taxi/settings/model/PushSettingsOpenReason;", "Ljava/lang/Runnable;", "Lru/yandex/taxi/settings/presentation/settings/PushSettingsView;", "content", "Lru/yandex/taxi/settings/presentation/settings/PushSettingsView;", "t3g0", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushSettingsModalView extends ModalView {
    public static final int $stable = 8;
    private final PushSettingsView content;
    private Runnable onBackPressedListener;
    private final PushSettingsOpenReason pushSettingsOpenReason;

    public PushSettingsModalView(Context context, g3g0 g3g0Var, PushSettingsOpenReason pushSettingsOpenReason) {
        super(context);
        this.pushSettingsOpenReason = pushSettingsOpenReason;
        w550 w550Var = new w550() { // from class: s3g0
            @Override // defpackage.w550
            public final void a() {
                PushSettingsModalView.content$lambda$0(PushSettingsModalView.this);
            }
        };
        Activity p = c.p(this);
        Activity activity = p == null ? (Activity) context : p;
        b6g b6gVar = ((b6g) g3g0Var.b.getValue()).b;
        pushSettingsOpenReason.getClass();
        b15 b15Var = new b15(b6gVar.m, b6gVar.g, b6gVar.l, new vm80(b6gVar.m, i5m.b(new jpf0((xvf0) new jde0(b6gVar.n, 11), (xvf0) n3w.a(pushSettingsOpenReason), 1)), 27), b6gVar.h, b6gVar.k, b6gVar.o, n3w.a(w550Var), 2);
        iw8 iw8Var = b6gVar.a;
        Context context2 = (Context) iw8Var.f;
        q5z.h(context2);
        pav pavVar = (pav) iw8Var.h;
        q5z.h(pavVar);
        tt2 tt2Var = (tt2) iw8Var.b;
        q5z.h(tt2Var);
        PushSettingsView pushSettingsView = new PushSettingsView(context2, pavVar, tt2Var, activity, (a) b15Var.get());
        this.content = pushSettingsView;
        addView(pushSettingsView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void content$lambda$0(PushSettingsModalView pushSettingsModalView) {
        Runnable runnable = pushSettingsModalView.onBackPressedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(PushSettingsModalView pushSettingsModalView) {
        PushSettingsView pushSettingsView = pushSettingsModalView.content;
        int i = veh0.toolbar;
        WeakHashMap weakHashMap = b.a;
        return (View) rp31.d(pushSettingsView, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$1(PushSettingsModalView pushSettingsModalView) {
        PushSettingsView pushSettingsView = pushSettingsModalView.content;
        int i = veh0.settings_recycler;
        WeakHashMap weakHashMap = b.a;
        return (View) rp31.d(pushSettingsView, i);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        vnb1.b(this, startAction, endAction, false, NavigationDirection.BACKWARD);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        vnb1.b(this, onAnimateShowStartAction, onAnimateShowEndAction, true, NavigationDirection.FORWARD);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public a230 insetsType() {
        final int i = 0;
        final int i2 = 1;
        return new a230(3, new sls(this) { // from class: r3g0
            public final /* synthetic */ PushSettingsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View insetsType$lambda$0;
                View insetsType$lambda$1;
                int i3 = i;
                PushSettingsModalView pushSettingsModalView = this.b;
                switch (i3) {
                    case 0:
                        insetsType$lambda$0 = PushSettingsModalView.insetsType$lambda$0(pushSettingsModalView);
                        return insetsType$lambda$0;
                    default:
                        insetsType$lambda$1 = PushSettingsModalView.insetsType$lambda$1(pushSettingsModalView);
                        return insetsType$lambda$1;
                }
            }
        }, new sls(this) { // from class: r3g0
            public final /* synthetic */ PushSettingsModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                View insetsType$lambda$0;
                View insetsType$lambda$1;
                int i3 = i2;
                PushSettingsModalView pushSettingsModalView = this.b;
                switch (i3) {
                    case 0:
                        insetsType$lambda$0 = PushSettingsModalView.insetsType$lambda$0(pushSettingsModalView);
                        return insetsType$lambda$0;
                    default:
                        insetsType$lambda$1 = PushSettingsModalView.insetsType$lambda$1(pushSettingsModalView);
                        return insetsType$lambda$1;
                }
            }
        });
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        super.setOnBackPressedListener(onBackPressedListener);
        this.onBackPressedListener = onBackPressedListener;
    }
}
