package com.yandex.go.clarify_address;

import defpackage.jst;
import defpackage.jtq0;
import defpackage.kr0;
import defpackage.mr0;
import defpackage.ny61;
import defpackage.qv10;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements kr0 {
    public final mr0 a;
    public final c b;
    public final jtq0 c;

    public a(mr0 mr0Var, c cVar, jtq0 jtq0Var) {
        this.a = mr0Var;
        this.b = cVar;
        this.c = jtq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AddressClarificationInteractorImpl$getConfirmationDelayMin$1 addressClarificationInteractorImpl$getConfirmationDelayMin$1;
        int i;
        Integer num;
        Integer num2;
        if (continuationImpl instanceof AddressClarificationInteractorImpl$getConfirmationDelayMin$1) {
            addressClarificationInteractorImpl$getConfirmationDelayMin$1 = (AddressClarificationInteractorImpl$getConfirmationDelayMin$1) continuationImpl;
            int i2 = addressClarificationInteractorImpl$getConfirmationDelayMin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressClarificationInteractorImpl$getConfirmationDelayMin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = addressClarificationInteractorImpl$getConfirmationDelayMin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressClarificationInteractorImpl$getConfirmationDelayMin$1.label;
                c cVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    addressClarificationInteractorImpl$getConfirmationDelayMin$1.label = 1;
                    obj = cVar.c(addressClarificationInteractorImpl$getConfirmationDelayMin$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        num2 = (Integer) addressClarificationInteractorImpl$getConfirmationDelayMin$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return num2;
                    }
                    kotlin.b.b(obj);
                }
                num = (Integer) obj;
                if (num != null) {
                    int intValue = num.intValue();
                    addressClarificationInteractorImpl$getConfirmationDelayMin$1.L$0 = num;
                    addressClarificationInteractorImpl$getConfirmationDelayMin$1.I$0 = intValue;
                    addressClarificationInteractorImpl$getConfirmationDelayMin$1.label = 2;
                    Object b = cVar.b(addressClarificationInteractorImpl$getConfirmationDelayMin$1);
                    if (b != coroutineSingletons) {
                        obj = b;
                        num2 = num;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        addressClarificationInteractorImpl$getConfirmationDelayMin$1 = new AddressClarificationInteractorImpl$getConfirmationDelayMin$1(this, continuationImpl);
        Object obj2 = addressClarificationInteractorImpl$getConfirmationDelayMin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressClarificationInteractorImpl$getConfirmationDelayMin$1.label;
        c cVar2 = this.b;
        if (i != 0) {
        }
        num = (Integer) obj2;
        if (num != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AddressClarificationInteractorImpl$isAddressClarified$1 addressClarificationInteractorImpl$isAddressClarified$1;
        Object obj;
        int i;
        long j;
        if (continuationImpl instanceof AddressClarificationInteractorImpl$isAddressClarified$1) {
            addressClarificationInteractorImpl$isAddressClarified$1 = (AddressClarificationInteractorImpl$isAddressClarified$1) continuationImpl;
            int i2 = addressClarificationInteractorImpl$isAddressClarified$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressClarificationInteractorImpl$isAddressClarified$1.label = i2 - Integer.MIN_VALUE;
                obj = addressClarificationInteractorImpl$isAddressClarified$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressClarificationInteractorImpl$isAddressClarified$1.label;
                mr0 mr0Var = this.a;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long j2 = mr0Var.a;
                    addressClarificationInteractorImpl$isAddressClarified$1.J$0 = j2;
                    addressClarificationInteractorImpl$isAddressClarified$1.label = 1;
                    obj = a(addressClarificationInteractorImpl$isAddressClarified$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    j = j2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = addressClarificationInteractorImpl$isAddressClarified$1.J$0;
                    kotlin.b.b(obj);
                }
                if (((Integer) obj) != null) {
                    return mr0Var.c.getValue();
                }
                if (this.c.d() - TimeUnit.MINUTES.toMillis(r8.intValue()) > j) {
                    z = false;
                    c(false, AddressClarificationReason.AddressNotClarified);
                }
                jst.e.getClass();
                return Boolean.valueOf(z);
            }
        }
        addressClarificationInteractorImpl$isAddressClarified$1 = new AddressClarificationInteractorImpl$isAddressClarified$1(this, continuationImpl);
        obj = addressClarificationInteractorImpl$isAddressClarified$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressClarificationInteractorImpl$isAddressClarified$1.label;
        mr0 mr0Var2 = this.a;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((Integer) obj) != null) {
        }
    }

    public final void c(boolean z, AddressClarificationReason addressClarificationReason) {
        jst.e.getClass();
        mr0 mr0Var = this.a;
        qv10.B(z, mr0Var.c, null);
        mr0Var.b = addressClarificationReason;
        mr0Var.a = z ? this.c.d() : 0L;
    }
}
