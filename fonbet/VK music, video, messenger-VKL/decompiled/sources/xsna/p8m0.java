package xsna;

import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.hpb0;

/* compiled from: StoryPollEditorRequestStrategy.kt */
/* loaded from: classes17.dex */
public final class p8m0 implements epb0 {
    @Override // xsna.epb0
    public final boolean a() {
        return true;
    }

    @Override // xsna.epb0
    public final rsg0<PollAttachment> b(grb0 grb0Var) {
        Long l;
        long j = grb0Var.a;
        if (j > 0) {
            l = Long.valueOf((System.currentTimeMillis() / 1000) + j);
        } else {
            l = grb0Var.b;
            if (l == null) {
                l = null;
            }
        }
        Long l2 = l;
        String str = grb0Var.c;
        ArrayList arrayList = grb0Var.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((hpb0.d) it.next()).a);
        }
        return new ztb0(str, arrayList2, grb0Var.e, grb0Var.f, grb0Var.g, grb0Var.h, Integer.valueOf(grb0Var.i), Integer.valueOf(grb0Var.j), l2, grb0Var.k, grb0Var.l, grb0Var.m);
    }
}
