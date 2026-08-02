package com.yandex.go.yb.main_menu.data;

import defpackage.iw51;
import defpackage.jw51;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.sv51;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public e(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1 ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1) {
            ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1 = (YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1) continuation;
            int i2 = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    nw51 nw51Var = (nw51) pair.getFirst();
                    boolean booleanValue = ((Boolean) pair.getSecond()).booleanValue();
                    i iVar = this.b;
                    iVar.getClass();
                    vprVar = this.a;
                    if (!booleanValue || ((!(nw51Var instanceof jw51) || ((jw51) nw51Var).c.isEmpty()) && !(nw51Var instanceof iw51))) {
                        obj2 = sv51.e;
                    } else {
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$0 = null;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$1 = null;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$2 = null;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$3 = null;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$4 = vprVar;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$5 = null;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$6 = null;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.Z$0 = booleanValue;
                        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label = 1;
                        obj2 = i.a(iVar, ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1);
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$0 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$1 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$2 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$3 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$4 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$5 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$6 = null;
                ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label = 2;
            }
        }
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1 = new YbWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$0 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$1 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$2 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$3 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$4 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$5 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.L$6 = null;
        ybWalletMenuItemRepositoryImpl$observeBankStaFlow$$inlined$map$2$2$1.label = 2;
    }
}
