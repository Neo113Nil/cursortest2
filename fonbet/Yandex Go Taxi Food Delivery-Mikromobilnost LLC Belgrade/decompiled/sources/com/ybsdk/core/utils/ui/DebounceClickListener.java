package com.ybsdk.core.utils.ui;

import android.os.SystemClock;
import android.view.View;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/core/utils/ui/DebounceClickListener;", "Landroid/view/View$OnClickListener;", "", "minimumIntervalMillis", "Lkotlin/Function0;", "Lzy11;", "listener", "<init>", "(JLsls;)V", "Landroid/view/View;", "clickedView", "onClick", "(Landroid/view/View;)V", "J", "Lsls;", "lastClickTimestamp", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebounceClickListener implements View.OnClickListener {
    private long lastClickTimestamp;
    private final sls listener;
    private final long minimumIntervalMillis;

    public /* synthetic */ DebounceClickListener(long j, sls slsVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 300L : j, slsVar);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View clickedView) {
        long j = this.lastClickTimestamp;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - j >= this.minimumIntervalMillis) {
            this.lastClickTimestamp = uptimeMillis;
            this.listener.invoke();
        }
    }

    public DebounceClickListener(long j, sls slsVar) {
        this.minimumIntervalMillis = j;
        this.listener = slsVar;
    }
}
