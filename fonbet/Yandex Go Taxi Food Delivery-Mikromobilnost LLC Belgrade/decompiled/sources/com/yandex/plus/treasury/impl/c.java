package com.yandex.plus.treasury.impl;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.yb.domain.r;
import com.ybsdk.api.YBSdk;
import defpackage.ag51;
import defpackage.bg51;
import defpackage.cg51;
import defpackage.dg51;
import defpackage.eg51;
import defpackage.fu91;
import defpackage.g92;
import defpackage.gqd0;
import defpackage.hqd0;
import defpackage.ig51;
import defpackage.iqd0;
import defpackage.kqd0;
import defpackage.ng51;
import defpackage.ny61;
import defpackage.pg51;
import defpackage.qt51;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.vh51;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c implements kqd0 {
    public final YBSdk a;
    public final com.yandex.go.plus.yb.integration.a b;
    public final g92 c = new g92(6, new rol0(new PlusYbSdkTreasuryAdapter$eventsFlow$1(this, null)));

    public c(YBSdk yBSdk, com.yandex.go.plus.yb.integration.a aVar) {
        this.a = yBSdk;
        this.b = aVar;
    }

    @Override // defpackage.kqd0
    public final Object a(String str) {
        r rVar = this.b.a;
        try {
            vh51 resolveUri = this.a.resolveUri(Uri.parse(str));
            if (resolveUri == null) {
                throw new IllegalArgumentException("Intent is not resolved!");
            }
            FragmentActivity fragmentActivity = ((qt51) rVar.a.b).a;
            kotlin.b.b(fragmentActivity);
            Object obj = rVar.b.get();
            kotlin.b.b(obj);
            fu91.g(((ng51) YBSdk.createSdkComponent(new pg51(new a(fragmentActivity, this)))).a(), fragmentActivity, resolveUri).b((ViewGroup) obj, null);
            return zy11.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kqd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        PlusYbSdkTreasuryAdapter$getShortcut$1 plusYbSdkTreasuryAdapter$getShortcut$1;
        int i;
        eg51 eg51Var;
        if (continuationImpl instanceof PlusYbSdkTreasuryAdapter$getShortcut$1) {
            plusYbSdkTreasuryAdapter$getShortcut$1 = (PlusYbSdkTreasuryAdapter$getShortcut$1) continuationImpl;
            int i2 = plusYbSdkTreasuryAdapter$getShortcut$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusYbSdkTreasuryAdapter$getShortcut$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusYbSdkTreasuryAdapter$getShortcut$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusYbSdkTreasuryAdapter$getShortcut$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ag51 ag51Var = new ag51(new ig51(str));
                    plusYbSdkTreasuryAdapter$getShortcut$1.L$0 = null;
                    plusYbSdkTreasuryAdapter$getShortcut$1.L$1 = null;
                    plusYbSdkTreasuryAdapter$getShortcut$1.label = 1;
                    obj = this.a.getPlusShortcutData(ag51Var, plusYbSdkTreasuryAdapter$getShortcut$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                eg51Var = (eg51) obj;
                if (eg51Var instanceof cg51) {
                    if (eg51Var instanceof dg51) {
                        dg51 dg51Var = (dg51) eg51Var;
                        return new iqd0(dg51Var.a().a(), dg51Var.b());
                    }
                    w511.b();
                    return null;
                }
                List<bg51> a = ((cg51) eg51Var).a();
                ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                for (bg51 bg51Var : a) {
                    arrayList.add(new gqd0(bg51Var.a(), bg51Var.b()));
                }
                return new hqd0(arrayList);
            }
        }
        plusYbSdkTreasuryAdapter$getShortcut$1 = new PlusYbSdkTreasuryAdapter$getShortcut$1(this, continuationImpl);
        Object obj2 = plusYbSdkTreasuryAdapter$getShortcut$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusYbSdkTreasuryAdapter$getShortcut$1.label;
        if (i != 0) {
        }
        eg51Var = (eg51) obj2;
        if (eg51Var instanceof cg51) {
        }
    }

    @Override // defpackage.kqd0
    public final tpr c() {
        return this.c;
    }
}
