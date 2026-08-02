package com.yandex.go.taxi.intercity.dashboard.impl.presentation.comment_suggests;

import defpackage.nbw;
import defpackage.obw;
import defpackage.qbw;
import defpackage.tls;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* synthetic */ class IntercityDashboardCommentSuggestsModalView$itemAdapter$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        nbw nbwVar = (nbw) obj;
        qbw qbwVar = (qbw) this.receiver;
        qbwVar.getClass();
        boolean z = nbwVar.c;
        String str = nbwVar.a;
        LinkedHashSet linkedHashSet = qbwVar.A;
        if (z) {
            linkedHashSet.remove(str);
        } else {
            linkedHashSet.add(str);
        }
        ((obw) qbwVar.Dg()).render(qbwVar.Kg());
        return zy11.a;
    }
}
