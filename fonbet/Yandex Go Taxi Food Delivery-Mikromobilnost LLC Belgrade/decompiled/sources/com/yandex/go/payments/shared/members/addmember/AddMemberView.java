package com.yandex.go.payments.shared.members.addmember;

import android.content.Context;
import defpackage.c230;
import defpackage.e230;
import defpackage.lq31;
import defpackage.luh0;
import defpackage.rf0;
import defpackage.x42;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ToolbarModalView;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J'\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006\""}, d2 = {"Lcom/yandex/go/payments/shared/members/addmember/AddMemberView;", "Lru/yandex/taxi/widget/ToolbarModalView;", "Landroid/content/Context;", "context", "Ljava/lang/Runnable;", "onBack", "Lx42;", "paramsProvider", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;Lx42;)V", "Le230;", "insetsType", "()Le230;", "", "getContentLayoutRes", "()I", "Lzy11;", "onTouchOutside", "()V", "onBackPressed", "onDismissManually", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lrf0;", "addMemberPageTexts", "setToolbarTitle", "(Lrf0;)V", "Ljava/lang/Runnable;", "Lx42;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddMemberView extends ToolbarModalView {
    public static final int $stable = 8;
    private final Runnable onBack;
    private final x42 paramsProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public AddMemberView(Context context, Runnable runnable, x42 x42Var) {
        super(context, null, 2, 0 == true ? 1 : 0);
        this.onBack = runnable;
        this.paramsProvider = x42Var;
        getToolbar().setOnNavigationClickListener(runnable);
        setFocusableInTouchMode(true);
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView
    public int getContentLayoutRes() {
        return luh0.shared_payments_add_member;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        return this.paramsProvider.getEventAnalyticsParams(eventType);
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView, ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.onBack.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onDismissManually() {
        super.onDismissManually();
        this.onBack.run();
    }

    @Override // ru.yandex.taxi.widget.ToolbarModalView, ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        this.onBack.run();
    }

    public final void setToolbarTitle(rf0 addMemberPageTexts) {
        getToolbar().setTitle(addMemberPageTexts.a);
    }
}
