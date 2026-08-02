package com.ybsdk.nfc;

import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import com.ybsdk.feature.nfc.api.models.NfcPaymentMethod;
import defpackage.ny61;
import defpackage.p860;
import defpackage.qa60;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ p860 b;

    public a(vpr vprVar, p860 p860Var) {
        this.a = vprVar;
        this.b = p860Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        if (r10.emit(r11, r4) != r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1 nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        p860 p860Var = this.b;
        qa60 qa60Var = p860Var.b;
        if (continuation instanceof NfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1) {
            nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1 = (NfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1) continuation;
            int i2 = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    p860Var.a.getClass();
                    qa60Var.getClass();
                    qa60Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        NfcProductTypeDto a = p860.a(p860Var, (NfcPaymentMethod) it.next());
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    vprVar = this.a;
                    nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$0 = vprVar;
                    nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$1 = arrayList2;
                    nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.Z$0 = false;
                    nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.Z$1 = false;
                    nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.Z$2 = false;
                    nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label = 1;
                    qa60Var.getClass();
                    if (coroutineSingletons != null) {
                        z = false;
                        z2 = false;
                        z3 = false;
                        arrayList = arrayList2;
                        obj2 = null;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        b.b(obj2);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z4 = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.Z$2;
                boolean z5 = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.Z$1;
                boolean z6 = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.Z$0;
                ?? r8 = (List) nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$1;
                vprVar = (vpr) nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$0;
                b.b(obj2);
                z = z4;
                z2 = z5;
                z3 = z6;
                arrayList = r8;
                NfcPaymentMethod nfcPaymentMethod = (NfcPaymentMethod) obj2;
                NfcInfoDto nfcInfoDto = new NfcInfoDto(z, z2, z3, arrayList, nfcPaymentMethod == null ? p860.a(p860Var, nfcPaymentMethod) : null);
                nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$0 = null;
                nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$1 = null;
                nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label = 2;
            }
        }
        nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1 = new NfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1(this, continuation);
        Object obj22 = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        NfcPaymentMethod nfcPaymentMethod2 = (NfcPaymentMethod) obj22;
        NfcInfoDto nfcInfoDto2 = new NfcInfoDto(z, z2, z3, arrayList, nfcPaymentMethod2 == null ? p860.a(p860Var, nfcPaymentMethod2) : null);
        nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$0 = null;
        nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.L$1 = null;
        nfcInfoDtoProviderImpl$getNfcInfoDto$$inlined$map$1$2$1.label = 2;
    }
}
