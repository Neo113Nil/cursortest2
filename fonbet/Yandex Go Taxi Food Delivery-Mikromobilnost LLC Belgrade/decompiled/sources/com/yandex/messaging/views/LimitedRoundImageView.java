package com.yandex.messaging.views;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.e170;
import defpackage.j4b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/messaging/views/LimitedRoundImageView;", "Lcom/yandex/messaging/views/RoundImageView;", "Lj4b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "cleanup", "()V", "value", "maxSize", CA20Status.STATUS_USER_I, "getMaxSize", "()I", "setMaxSize", "(I)V", "Le170;", "onViewLimitedCallback", "Le170;", "getOnViewLimitedCallback", "()Le170;", "setOnViewLimitedCallback", "(Le170;)V", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public class LimitedRoundImageView extends RoundImageView implements j4b {
    public static final int $stable = 8;
    private int maxSize;
    private e170 onViewLimitedCallback;

    public /* synthetic */ LimitedRoundImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void cleanup() {
        setOnViewLimitedCallback(null);
        setMaxSize(0);
        setImageDrawable(null);
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public final e170 getOnViewLimitedCallback() {
        return this.onViewLimitedCallback;
    }

    @Override // defpackage.j4b
    public void setMaxSize(int i) {
        this.maxSize = i;
        e170 e170Var = this.onViewLimitedCallback;
        if (e170Var != null) {
            e170Var.d(i);
        }
    }

    public final void setOnViewLimitedCallback(e170 e170Var) {
        e170 e170Var2;
        this.onViewLimitedCallback = e170Var;
        if (getMaxSize() <= 0 || (e170Var2 = this.onViewLimitedCallback) == null) {
            return;
        }
        e170Var2.d(getMaxSize());
    }

    public LimitedRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LimitedRoundImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LimitedRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
