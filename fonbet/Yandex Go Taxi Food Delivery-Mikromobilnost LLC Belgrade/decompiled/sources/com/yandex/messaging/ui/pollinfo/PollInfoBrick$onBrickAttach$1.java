package com.yandex.messaging.ui.pollinfo;

import defpackage.c6w;
import defpackage.d6w;
import defpackage.ewh0;
import defpackage.j73;
import defpackage.lhs;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class PollInfoBrick$onBrickAttach$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        lhs lhsVar = (lhs) obj;
        c cVar = (c) this.receiver;
        a aVar = cVar.y;
        aVar.getClass();
        d6w F = j73.F(lhsVar.c);
        ArrayList arrayList = new ArrayList(tcc.n(F, 10));
        c6w it = F.iterator();
        while (it.c) {
            arrayList.add(lhsVar.a(it.nextInt()));
        }
        aVar.z = lhsVar.a;
        aVar.notifyItemChanged(0);
        ArrayList arrayList2 = aVar.A;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        aVar.notifyDataSetChanged();
        int i = lhsVar.d.voteCount;
        cVar.b.z.setText(cVar.a.getResources().getQuantityString(ewh0.messenger_poll_answers_count, i, Integer.valueOf(i)));
        return zy11.a;
    }
}
