package com.yandex.delivery.utils.storage.impl;

import com.yandex.delivery.mapper.model.policies.ShowPolicy$LimitedCount$Lifetime;
import defpackage.g6s0;
import defpackage.h6s0;
import defpackage.i6s0;
import defpackage.l8s0;
import defpackage.m8s0;
import defpackage.ny61;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes11.dex */
public final class c {
    public final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r4 == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m8s0 m8s0Var, ContinuationImpl continuationImpl) {
        Object a;
        boolean z = m8s0Var instanceof l8s0;
        zy11 zy11Var = zy11.a;
        if (z) {
            l8s0 l8s0Var = (l8s0) m8s0Var;
            String str = l8s0Var.a;
            ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime = l8s0Var.c;
            b bVar = this.a;
            bVar.getClass();
            int i = h6s0.a[showPolicy$LimitedCount$Lifetime.ordinal()];
            if (i == 1) {
                a aVar = bVar.a;
                a = androidx.datastore.preferences.core.b.a(g6s0.a(a.b, aVar.a), new ShowCountPersistentDataStore$incrementShowCount$2(aVar, str, null), continuationImpl);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (a != coroutineSingletons) {
                    a = zy11Var;
                }
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                i6s0 i6s0Var = bVar.b;
                Integer num = (Integer) i6s0Var.a.get(str);
                i6s0Var.a.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
            a = zy11Var;
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
        } else if (m8s0Var != null) {
            w511.b();
            return null;
        }
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0088, code lost:
    
        if (((java.lang.Number) r9).intValue() >= ((defpackage.l8s0) r8).b) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(m8s0 m8s0Var, ContinuationImpl continuationImpl) {
        ShowPolicyInteractor$shouldShow$1 showPolicyInteractor$shouldShow$1;
        int i;
        if (continuationImpl instanceof ShowPolicyInteractor$shouldShow$1) {
            showPolicyInteractor$shouldShow$1 = (ShowPolicyInteractor$shouldShow$1) continuationImpl;
            int i2 = showPolicyInteractor$shouldShow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showPolicyInteractor$shouldShow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = showPolicyInteractor$shouldShow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showPolicyInteractor$shouldShow$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(m8s0Var instanceof l8s0)) {
                        if (m8s0Var != null) {
                            w511.b();
                            return null;
                        }
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    l8s0 l8s0Var = (l8s0) m8s0Var;
                    String str = l8s0Var.a;
                    ShowPolicy$LimitedCount$Lifetime showPolicy$LimitedCount$Lifetime = l8s0Var.c;
                    showPolicyInteractor$shouldShow$1.L$0 = m8s0Var;
                    showPolicyInteractor$shouldShow$1.label = 1;
                    b bVar = this.a;
                    bVar.getClass();
                    int i3 = h6s0.a[showPolicy$LimitedCount$Lifetime.ordinal()];
                    if (i3 == 1) {
                        obj = bVar.a.a(str, showPolicyInteractor$shouldShow$1);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        Integer num = (Integer) bVar.b.a.get(str);
                        obj = new Integer(num != null ? num.intValue() : 0);
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m8s0Var = (m8s0) showPolicyInteractor$shouldShow$1.L$0;
                    kotlin.b.b(obj);
                }
            }
        }
        showPolicyInteractor$shouldShow$1 = new ShowPolicyInteractor$shouldShow$1(this, continuationImpl);
        Object obj2 = showPolicyInteractor$shouldShow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showPolicyInteractor$shouldShow$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
    }
}
