package com.yandex.div.core.view2.errors;

import com.yandex.div.data.VariableMutationException;
import defpackage.c231;
import defpackage.unr0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* synthetic */ class VariableMonitorView$variablesAdapter$1 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        String str2 = (String) obj3;
        d dVar = (d) this.receiver;
        c231 c231Var = (c231) dVar.b.get(new Pair((String) obj2, str));
        if (!String.valueOf(c231Var != null ? c231Var.d() : null).equals(str2) && c231Var != null) {
            try {
                c231Var.g(str2);
            } catch (Exception unused) {
                dVar.a.invoke(new VariableMutationException(2, null, unr0.p("Unable to set '", str2, "' value to variable '", str, "'.")));
            }
        }
        return zy11.a;
    }
}
