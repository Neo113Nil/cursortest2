package com.yandex.go.wallet.divkit;

import defpackage.c231;
import defpackage.c941;
import defpackage.dzg0;
import defpackage.g6u;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final h3y a;
    public final h3y b;
    public final tt2 c;
    public final c941 d;

    public a(h3y h3yVar, h3y h3yVar2, tt2 tt2Var, c941 c941Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = tt2Var;
        this.d = c941Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        if (defpackage.tje.k0(r3, r5, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        WalletUiVariableHandler$init$1 walletUiVariableHandler$init$1;
        int i;
        int i2;
        if (continuationImpl instanceof WalletUiVariableHandler$init$1) {
            walletUiVariableHandler$init$1 = (WalletUiVariableHandler$init$1) continuationImpl;
            int i3 = walletUiVariableHandler$init$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                walletUiVariableHandler$init$1.label = i3 - Integer.MIN_VALUE;
                Object obj = walletUiVariableHandler$init$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walletUiVariableHandler$init$1.label;
                tt2 tt2Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = this.d.a ? dzg0.chevron_up : dzg0.ic_arrow_left;
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    WalletUiVariableHandler$init$variable$1 walletUiVariableHandler$init$variable$1 = new WalletUiVariableHandler$init$variable$1(this, i2, null);
                    walletUiVariableHandler$init$1.I$0 = i2;
                    walletUiVariableHandler$init$1.label = 1;
                    obj = tje.k0(sjhVar, walletUiVariableHandler$init$variable$1, walletUiVariableHandler$init$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    i2 = walletUiVariableHandler$init$1.I$0;
                    kotlin.b.b(obj);
                }
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                g6u g6uVar = o400.a;
                WalletUiVariableHandler$init$2 walletUiVariableHandler$init$2 = new WalletUiVariableHandler$init$2(this, (c231) obj, null);
                walletUiVariableHandler$init$1.L$0 = null;
                walletUiVariableHandler$init$1.I$0 = i2;
                walletUiVariableHandler$init$1.label = 2;
            }
        }
        walletUiVariableHandler$init$1 = new WalletUiVariableHandler$init$1(this, continuationImpl);
        Object obj2 = walletUiVariableHandler$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walletUiVariableHandler$init$1.label;
        tt2 tt2Var2 = this.c;
        if (i != 0) {
        }
        tt2Var2.getClass();
        sjh sjhVar22 = uyj.a;
        g6u g6uVar2 = o400.a;
        WalletUiVariableHandler$init$2 walletUiVariableHandler$init$22 = new WalletUiVariableHandler$init$2(this, (c231) obj2, null);
        walletUiVariableHandler$init$1.L$0 = null;
        walletUiVariableHandler$init$1.I$0 = i2;
        walletUiVariableHandler$init$1.label = 2;
    }
}
