package com.yandex.payment.sdk.flex.impl.customview.views.cardinput.textwatchers;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.ek8;
import defpackage.g8e;
import defpackage.kir;
import defpackage.lof;
import defpackage.nh8;
import defpackage.nz21;
import defpackage.oof;
import defpackage.rg8;
import defpackage.syh0;
import defpackage.w031;
import defpackage.xnf;
import defpackage.y031;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/textwatchers/CvvTextWatcher;", "Landroid/text/TextWatcher;", "Lxnf;", "listener", "<init>", "(Lxnf;)V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "Lxnf;", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvvTextWatcher implements TextWatcher {
    private final xnf listener;

    public CvvTextWatcher(xnf xnfVar) {
        this.listener = xnfVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object value;
        rg8 rg8Var;
        boolean z;
        boolean z2;
        xnf xnfVar = this.listener;
        String obj = editable.toString();
        nh8 nh8Var = (nh8) xnfVar;
        nh8Var.h.a(new kir("card_data_form-input", g8e.z("type", "cvn")));
        r0 r0Var = nh8Var.i;
        do {
            value = r0Var.getValue();
            rg8Var = (rg8) value;
            String str = rg8Var.b.a;
            nz21 nz21Var = nh8Var.d;
            oof oofVar = nz21Var.f;
            ek8 ek8Var = nz21Var.a.a(str).b;
            oofVar.getClass();
            if (ek8Var.c == obj.length()) {
                z = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
        } while (!r0Var.k(value, rg8.a(rg8Var, null, null, null, new lof(obj, (rg8Var.d.b || z) ? z2 : false, z ? y031.a : new w031(syh0.finsdk_wrong_cvv)), 0, 0, 55)));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
