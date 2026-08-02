package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.textwatchers;

import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.a;
import defpackage.b131;
import defpackage.fk8;
import defpackage.hau0;
import defpackage.jyq;
import defpackage.kxq;
import defpackage.mof;
import defpackage.oz21;
import defpackage.pof;
import defpackage.qfb1;
import defpackage.qk8;
import defpackage.sg8;
import defpackage.vxh0;
import defpackage.x031;
import defpackage.ynf;
import defpackage.z031;
import defpackage.z22;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/textwatchers/CvvTextWatcher;", "Landroid/text/TextWatcher;", "Lynf;", "listener", "<init>", "(Lynf;)V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "Lynf;", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvvTextWatcher implements TextWatcher {
    private final ynf listener;

    public CvvTextWatcher(ynf ynfVar) {
        this.listener = ynfVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        Object value;
        sg8 sg8Var;
        boolean z;
        b131 j;
        ynf ynfVar = this.listener;
        String obj = editable.toString();
        a aVar = (a) ynfVar;
        z22 z22Var = aVar.a;
        r0 r0Var = aVar.n;
        do {
            value = r0Var.getValue();
            sg8Var = (sg8) value;
            qk8 qk8Var = sg8Var.a;
            hau0 hau0Var = sg8Var.j;
            String str = qk8Var.a;
            oz21 oz21Var = aVar.m;
            pof pofVar = oz21Var.f;
            fk8 fk8Var = oz21Var.a.a(str).b;
            pofVar.getClass();
            boolean z2 = fk8Var.c == obj.length();
            z = sg8Var.b.b || z2;
            j = a.j(vxh0.finsdk_wrong_cvv, z2);
            if (j instanceof z031) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new kxq("cvv", qfb1.b(hau0Var)));
            } else if ((j instanceof x031) && z) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new jyq("cvv", "Invalid CVV", qfb1.b(hau0Var)));
            }
        } while (!r0Var.k(value, sg8.a(sg8Var, null, new mof(obj, z, j), null, 0, null, null, null, 0, null, null, null, false, false, 8189)));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
