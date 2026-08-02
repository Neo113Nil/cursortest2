package com.lightside.slab;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import defpackage.dqs0;
import defpackage.ins0;
import defpackage.jns0;
import defpackage.ny61;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00022\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0017\u001a\u00020\u000e2\"\u0010\u0016\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR4\u0010\u0017\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010!\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/lightside/slab/SlotView;", "Landroid/view/View;", "Ldqs0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/os/Parcelable;", ClidProvider.STATE, "Lzy11;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lins0;", "slab", "insert", "(Lins0;)Ldqs0;", "Lkotlin/Function3;", "listener", "onInsertListener", "(Lzls;)V", "", "value", "isUsed", "Z", "()Z", "Lzls;", "getView", "()Landroid/view/View;", "view", "slab_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SlotView extends View implements dqs0 {
    private boolean isUsed;
    private zls onInsertListener;

    public /* synthetic */ SlotView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public View getView() {
        if (getIsUsed()) {
            ny61.r("Check failed.");
            return null;
        }
        if (getParent() != null) {
            return this;
        }
        ny61.r("Required value was null.");
        return null;
    }

    @Override // defpackage.dqs0
    public dqs0 insert(ins0 slab) {
        if (getIsUsed()) {
            ny61.r("Check failed.");
            return null;
        }
        if (getParent() == null) {
            ny61.r("Required value was null.");
            return null;
        }
        View k = slab.k(this);
        this.isUsed = true;
        jns0 jns0Var = new jns0(slab, k);
        zls zlsVar = this.onInsertListener;
        if (zlsVar != null) {
            zlsVar.invoke(slab, k, jns0Var);
        }
        this.onInsertListener = null;
        return jns0Var;
    }

    @Override // defpackage.dqs0
    /* renamed from: isUsed, reason: from getter */
    public boolean getIsUsed() {
        return this.isUsed;
    }

    @Override // defpackage.dqs0
    public void onInsertListener(zls listener) {
        if (getIsUsed()) {
            ny61.r("Check failed.");
        } else {
            this.onInsertListener = listener;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(AbsSavedState.EMPTY_STATE);
    }

    public SlotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SlotView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SlotView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public SlotView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        setWillNotDraw(true);
    }
}
