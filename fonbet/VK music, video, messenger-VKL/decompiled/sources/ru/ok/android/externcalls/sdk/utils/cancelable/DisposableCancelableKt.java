package ru.ok.android.externcalls.sdk.utils.cancelable;

import io.reactivex.rxjava3.disposables.c;
import xsna.qs6;

/* compiled from: DisposableCancelable.kt */
/* loaded from: classes9.dex */
public final class DisposableCancelableKt {
    public static final Cancelable toCancelable(c cVar) {
        return new qs6(cVar, 10);
    }
}
