package com.ybsdk.feature.transfer.version2.internal.screens.phone;

import defpackage.in01;
import defpackage.ny61;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.u8j0;
import defpackage.vpr;
import defpackage.ym01;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1 transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        List list;
        if (continuation instanceof TransferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = (TransferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                ym01 ym01Var = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    in01 in01Var = (in01) obj;
                    this.b.getClass();
                    u8j0 u8j0Var = in01Var.c;
                    u8j0 u8j0Var2 = in01Var.b;
                    if (u8j0Var == null) {
                        JSONArray jSONArray = new JSONArray();
                        if (u8j0Var2 instanceof s8j0) {
                            jSONArray.put("allow_contacts");
                        }
                        if (in01Var.g.a() != null) {
                            jSONArray.put("clipboard");
                        }
                        if (in01Var.h.a() != null) {
                            jSONArray.put("myself");
                        }
                        boolean z = u8j0Var2 instanceof r8j0;
                        if (z) {
                            jSONArray.put("contact_list");
                        }
                        String jSONArray2 = jSONArray.toString();
                        r8j0 r8j0Var = z ? (r8j0) u8j0Var2 : null;
                        ym01Var = new ym01(jSONArray2, (r8j0Var == null || (list = (List) r8j0Var.a) == null) ? 0 : list.size());
                    }
                    if (ym01Var != null) {
                        transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(ym01Var, transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1 = new TransferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPhoneInputViewModel$2$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        ym01 ym01Var2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
