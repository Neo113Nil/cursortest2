package com.yandex.go.profile.domain.divkit.variables;

import defpackage.bms;
import defpackage.evu0;
import defpackage.kj;
import defpackage.mm;
import defpackage.n150;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class AccountVariableHandler$init$1 extends AdaptedFunctionReference implements bms {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r0 == null) goto L32;
     */
    @Override // defpackage.bms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String obj5;
        String str;
        String str2 = (String) obj2;
        kj kjVar = (kj) obj3;
        a aVar = (a) this.receiver;
        aVar.getClass();
        String str3 = ((n150) obj).a;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = kjVar != null ? kjVar.e : null;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = kjVar != null ? kjVar.b : null;
        String str6 = str5 != null ? str5 : "";
        if (evu0.J(str3)) {
            str3 = !evu0.J(str4) ? str4 : str6;
        }
        String obj6 = evu0.k0(str3).toString();
        if (kjVar != null && (str = kjVar.g) != null) {
            obj5 = evu0.J(str) ? null : str;
        }
        obj5 = evu0.k0(str2).toString();
        return new mm(((ru.yandex.taxi.am.g) aVar.d.get()).f(), obj6, obj5);
    }
}
