package com.yandex.payment.sdk.flex.impl.customview.views.cardinput.textwatchers;

import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.formatters.ExpirationDateFormatter;
import defpackage.aau0;
import defpackage.bso;
import defpackage.bvu0;
import defpackage.dso;
import defpackage.fau0;
import defpackage.fso;
import defpackage.g8e;
import defpackage.kir;
import defpackage.l76;
import defpackage.nh8;
import defpackage.nz21;
import defpackage.rg8;
import defpackage.syh0;
import defpackage.tro;
import defpackage.w031;
import defpackage.y031;
import defpackage.y9u0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/textwatchers/ExpirationDateTextWatcher;", "Landroid/text/TextWatcher;", "Ltro;", "listener", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/formatters/ExpirationDateFormatter;", "expirationDateFormatter", "<init>", "(Ltro;Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/formatters/ExpirationDateFormatter;)V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "Ltro;", "Lcom/yandex/payment/sdk/flex/impl/customview/views/cardinput/formatters/ExpirationDateFormatter;", "", "changeWasAddition", "Z", "flex-impl-18-1-0_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExpirationDateTextWatcher implements TextWatcher {
    private boolean changeWasAddition;
    private final ExpirationDateFormatter expirationDateFormatter;
    private final tro listener;

    public /* synthetic */ ExpirationDateTextWatcher(tro troVar, ExpirationDateFormatter expirationDateFormatter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(troVar, (i & 2) != 0 ? new ExpirationDateFormatter() : expirationDateFormatter);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object value;
        rg8 rg8Var;
        fau0 fau0Var;
        ExpirationDateFormatter expirationDateFormatter = this.expirationDateFormatter;
        boolean z = this.changeWasAddition;
        expirationDateFormatter.getClass();
        ExpirationDateFormatter.a(editable, z);
        tro troVar = this.listener;
        String obj = editable.toString();
        nh8 nh8Var = (nh8) troVar;
        nz21 nz21Var = nh8Var.d;
        nh8Var.h.a(new kir("card_data_form-input", g8e.z("type", "expiration_date")));
        nh8Var.g.getClass();
        String str = obj.length() >= 2 ? obj : null;
        boolean z2 = false;
        Integer l = str != null ? bvu0.l(10, str.substring(0, 2)) : null;
        String str2 = obj.length() >= 4 ? obj : null;
        Integer l2 = str2 != null ? bvu0.l(10, str2.substring(2)) : null;
        dso bsoVar = (l == null || l2 == null) ? l76.D : new bso(l.intValue(), l2.intValue());
        nz21Var.d.getClass();
        boolean z3 = bsoVar instanceof bso;
        if (z3) {
            nz21Var.e.getClass();
            if (z3) {
                bso bsoVar2 = (bso) bsoVar;
                int i = bsoVar2.b;
                int i2 = bsoVar2.a;
                if (i2 >= 1 && i2 <= 12 && i >= 22 && i <= 72 && (i != 22 || i2 >= 3)) {
                    z2 = true;
                }
            }
        }
        r0 r0Var = nh8Var.i;
        do {
            value = r0Var.getValue();
            rg8Var = (rg8) value;
            fau0Var = (z2 && rg8Var.a.equals(aau0.a)) ? y9u0.a : rg8Var.a;
            nz21Var.d.getClass();
        } while (!r0Var.k(value, rg8.a(rg8Var, fau0Var, null, new fso(obj, bsoVar, z3, z2 ? y031.a : new w031(syh0.finsdk_wrong_expiration_date)), null, 0, 0, 58)));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.changeWasAddition = count > before;
    }

    public ExpirationDateTextWatcher(tro troVar, ExpirationDateFormatter expirationDateFormatter) {
        this.listener = troVar;
        this.expirationDateFormatter = expirationDateFormatter;
    }
}
