package com.yandex.mobile.drive.view;

import android.view.View;
import defpackage.a7b;
import defpackage.e2c;
import defpackage.mwi0;
import defpackage.sls;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00042\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/drive/view/ViewClicks;", "T", "Le2c;", "Landroid/view/View$OnClickListener;", "Lmwi0;", "Landroid/view/View;", "view", "", "debounce", "Lkotlin/Function0;", "itemProvider", "<init>", "(Landroid/view/View;ZLsls;)V", "v", "Lzy11;", "onClick", "(Landroid/view/View;)V", "Lkotlin/Function1;", "listener", "setListener", "(Ltls;)Lmwi0;", "remove", "()V", "Landroid/view/View;", "Z", "Lsls;", "Ltls;", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
final class ViewClicks<T> implements e2c, View.OnClickListener, mwi0 {
    private final boolean debounce;
    private final sls itemProvider;
    private tls listener;
    private final View view;

    public ViewClicks(View view, boolean z, sls slsVar) {
        this.view = view;
        this.debounce = z;
        this.itemProvider = slsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Object invoke;
        tls tlsVar = this.listener;
        if (tlsVar == null || (invoke = this.itemProvider.invoke()) == null) {
            return;
        }
        tlsVar.invoke(invoke);
    }

    @Override // defpackage.mwi0
    public void remove() {
        this.view.setClickable(false);
        this.listener = null;
    }

    @Override // defpackage.e2c
    public mwi0 setListener(tls listener) {
        this.view.setOnClickListener(listener == null ? null : this);
        if (listener == null) {
            remove();
        }
        if (this.debounce) {
            listener = listener != null ? new a7b(23, new Ref$LongRef(), listener) : null;
        }
        this.listener = listener;
        return this;
    }
}
