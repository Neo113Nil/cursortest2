package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ContactsPromoView.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class scj extends FunctionReferenceImpl implements izs<View, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(View view) {
        equ0 equ0Var = equ0.this;
        Context context = equ0Var.m;
        if (context == null) {
            context = null;
        }
        Activity h = e3m.h(context);
        if (h != null) {
            rcj rcjVar = (rcj) equ0Var.p.getValue();
            com.vk.core.tips.b bVar = rcjVar.c;
            if (bVar != null) {
                bVar.b(false);
            }
            rcjVar.c = null;
            equ0Var.j.getClass();
            szv.a(k9u0.a, h, null, new m5o0(equ0Var, 13), null, null, 26);
        }
        return s3q0.a;
    }
}
