package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.textwatchers;

import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.a;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.formatters.ExpirationDateFormatter;
import defpackage.b131;
import defpackage.bau0;
import defpackage.bei;
import defpackage.bvu0;
import defpackage.cso;
import defpackage.eso;
import defpackage.gso;
import defpackage.hau0;
import defpackage.jyq;
import defpackage.kxq;
import defpackage.oz21;
import defpackage.qfb1;
import defpackage.sg8;
import defpackage.uro;
import defpackage.vxh0;
import defpackage.x031;
import defpackage.x9u0;
import defpackage.z031;
import defpackage.z22;
import defpackage.z9u0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0012\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/textwatchers/ExpirationDateTextWatcher;", "Landroid/text/TextWatcher;", "Luro;", "listener", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/formatters/ExpirationDateFormatter;", "expirationDateFormatter", "<init>", "(Luro;Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/formatters/ExpirationDateFormatter;)V", "", "s", "", "start", "count", "after", "Lzy11;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "editable", "afterTextChanged", "(Landroid/text/Editable;)V", "Luro;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/formatters/ExpirationDateFormatter;", "", "changeWasAddition", "Z", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpirationDateTextWatcher implements TextWatcher {
    private boolean changeWasAddition;
    private final ExpirationDateFormatter expirationDateFormatter;
    private final uro listener;

    public /* synthetic */ ExpirationDateTextWatcher(uro uroVar, ExpirationDateFormatter expirationDateFormatter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uroVar, (i & 2) != 0 ? new ExpirationDateFormatter() : expirationDateFormatter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r5 >= 3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterTextChanged(Editable editable) {
        boolean z;
        r0 r0Var;
        Object value;
        sg8 sg8Var;
        hau0 x9u0Var;
        b131 j;
        ExpirationDateFormatter expirationDateFormatter = this.expirationDateFormatter;
        boolean z2 = this.changeWasAddition;
        expirationDateFormatter.getClass();
        ExpirationDateFormatter.a(editable, z2);
        uro uroVar = this.listener;
        String obj = editable.toString();
        a aVar = (a) uroVar;
        z22 z22Var = aVar.a;
        oz21 oz21Var = aVar.m;
        aVar.g.getClass();
        String str = obj.length() >= 2 ? obj : null;
        Integer l = str != null ? bvu0.l(10, str.substring(0, 2)) : null;
        String str2 = obj.length() >= 4 ? obj : null;
        Integer l2 = str2 != null ? bvu0.l(10, str2.substring(2)) : null;
        eso csoVar = (l == null || l2 == null) ? bei.E : new cso(l.intValue(), l2.intValue());
        oz21Var.d.getClass();
        boolean z3 = csoVar instanceof cso;
        if (z3) {
            oz21Var.e.getClass();
            if (z3) {
                cso csoVar2 = (cso) csoVar;
                int i = csoVar2.b;
                int i2 = csoVar2.a;
                z = true;
                if (i2 >= 1) {
                    if (i2 <= 12) {
                        if (i >= 22) {
                            if (i <= 72) {
                                if (i == 22) {
                                }
                                r0Var = aVar.n;
                                do {
                                    value = r0Var.getValue();
                                    sg8Var = (sg8) value;
                                    x9u0Var = (z || !sg8Var.j.equals(bau0.a)) ? sg8Var.j : sg8Var.l ? new x9u0(false) : z9u0.a;
                                    oz21Var.d.getClass();
                                    j = a.j(vxh0.finsdk_wrong_expiration_date, z);
                                    if (!(j instanceof z031)) {
                                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new kxq("expiration_date", qfb1.b(sg8Var.j)));
                                    } else if ((j instanceof x031) && z3) {
                                        ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).a(new jyq("expiration_date", "Invalid expiration date", qfb1.b(sg8Var.j)));
                                    }
                                } while (!r0Var.k(value, sg8.a(sg8Var, null, null, new gso(obj, csoVar, z3, j), 0, null, null, null, 0, null, x9u0Var, null, false, false, 7675)));
                            }
                        }
                    }
                }
            }
        }
        z = false;
        r0Var = aVar.n;
        do {
            value = r0Var.getValue();
            sg8Var = (sg8) value;
            x9u0Var = (z || !sg8Var.j.equals(bau0.a)) ? sg8Var.j : sg8Var.l ? new x9u0(false) : z9u0.a;
            oz21Var.d.getClass();
            j = a.j(vxh0.finsdk_wrong_expiration_date, z);
            if (!(j instanceof z031)) {
            }
        } while (!r0Var.k(value, sg8.a(sg8Var, null, null, new gso(obj, csoVar, z3, j), 0, null, null, null, 0, null, x9u0Var, null, false, false, 7675)));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        this.changeWasAddition = count > before;
    }

    public ExpirationDateTextWatcher(uro uroVar, ExpirationDateFormatter expirationDateFormatter) {
        this.listener = uroVar;
        this.expirationDateFormatter = expirationDateFormatter;
    }
}
