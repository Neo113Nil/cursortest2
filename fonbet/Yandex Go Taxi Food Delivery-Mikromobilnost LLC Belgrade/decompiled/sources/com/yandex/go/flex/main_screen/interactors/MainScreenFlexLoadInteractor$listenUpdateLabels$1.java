package com.yandex.go.flex.main_screen.interactors;

import defpackage.b5q0;
import defpackage.d5r;
import defpackage.zls;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class MainScreenFlexLoadInteractor$listenUpdateLabels$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Set set = (Set) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        d5r d5rVar = (d5r) this.receiver;
        if (!booleanValue) {
            d5rVar.getClass();
            return set;
        }
        Set set2 = d5rVar.a.a;
        HashSet hashSet = new HashSet();
        for (Object obj4 : set) {
            b5q0 b5q0Var = (b5q0) obj4;
            if (b5q0Var.c || set2.contains(b5q0Var.a)) {
                hashSet.add(obj4);
            }
        }
        return hashSet;
    }
}
