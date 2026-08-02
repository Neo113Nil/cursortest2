package com.yandex.messaging.ui.joinlink;

import defpackage.cqy;
import defpackage.m9x;
import defpackage.n9x;
import defpackage.ny61;
import defpackage.rza;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, n9x n9xVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        JoinLinkViewModel$special$$inlined$map$1$2$1 joinLinkViewModel$special$$inlined$map$1$2$1;
        int i;
        m9x m9xVar;
        if (continuation instanceof JoinLinkViewModel$special$$inlined$map$1$2$1) {
            joinLinkViewModel$special$$inlined$map$1$2$1 = (JoinLinkViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = joinLinkViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                joinLinkViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = joinLinkViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = joinLinkViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    String str = (String) obj;
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    for (int i3 = 0; i3 < str.length(); i3++) {
                        char charAt = str.charAt(i3);
                        if (!rza.b(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    if (!cqy.c(sb2)) {
                        if (sb2.length() > 0) {
                            for (int i4 = 0; i4 < sb2.length(); i4++) {
                                if (!Character.isDigit(sb2.charAt(i4))) {
                                    break;
                                }
                            }
                        }
                        m9xVar = new m9x(str, z);
                        joinLinkViewModel$special$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(m9xVar, joinLinkViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    z = true;
                    m9xVar = new m9x(str, z);
                    joinLinkViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(m9xVar, joinLinkViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        joinLinkViewModel$special$$inlined$map$1$2$1 = new JoinLinkViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = joinLinkViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = joinLinkViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
