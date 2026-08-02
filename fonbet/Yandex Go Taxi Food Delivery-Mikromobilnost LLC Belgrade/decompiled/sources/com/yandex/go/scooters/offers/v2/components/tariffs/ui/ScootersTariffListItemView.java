package com.yandex.go.scooters.offers.v2.components.tariffs.ui;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.e5p0;
import defpackage.l5p0;
import defpackage.tls;
import defpackage.wls;
import defpackage.zo31;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0001\u0019B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H&¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J#\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00028\u00008\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0018R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/ScootersTariffListItemView;", "Lzo31;", CA20Status.STATUS_CERTIFICATE_V, "Le5p0;", "T", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "viewBindingInflater", "<init>", "(Landroid/content/Context;Lwls;)V", Constants.KEY_DATA, "Lzy11;", "bindData", "(Le5p0;)V", "bindPrice", "bindSelection", "Lkotlin/Function1;", "Lj5p0;", "action", "setOnClickAction", "(Ltls;)V", "Ll5p0;", "task", "submitTask", "(Ll5p0;)V", "binding", "Lzo31;", "getBinding", "()Lzo31;", "clickAction", "Ltls;", "getClickAction", "()Ltls;", "setClickAction", "taskPostingAction", "getTaskPostingAction", "setTaskPostingAction", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ScootersTariffListItemView<V extends zo31, T extends e5p0> extends MotionLayout {
    public static final int $stable = 8;
    private final V binding;
    private tls clickAction;
    private tls taskPostingAction;

    public ScootersTariffListItemView(Context context, wls wlsVar) {
        super(context);
        this.binding = (V) wlsVar.invoke(LayoutInflater.from(context), this);
    }

    public abstract void bindData(T data);

    public abstract void bindPrice(T data);

    public void bindSelection(T data) {
    }

    public final V getBinding() {
        return this.binding;
    }

    public final tls getClickAction() {
        return this.clickAction;
    }

    public final tls getTaskPostingAction() {
        return this.taskPostingAction;
    }

    public final void setClickAction(tls tlsVar) {
        this.clickAction = tlsVar;
    }

    public void setOnClickAction(tls action) {
        this.clickAction = action;
    }

    public final void setTaskPostingAction(tls tlsVar) {
        this.taskPostingAction = tlsVar;
    }

    public final void submitTask(l5p0 task) {
        tls tlsVar = this.taskPostingAction;
        if (tlsVar != null) {
            tlsVar.invoke(task);
        }
    }
}
