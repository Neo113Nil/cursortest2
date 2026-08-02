package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.hpb0;

/* compiled from: DefaultPollEditorRequestStrategy.kt */
/* loaded from: classes17.dex */
public final class rkl implements epb0 {
    @Override // xsna.epb0
    public final boolean a() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    @Override // xsna.epb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final rsg0<PollAttachment> b(grb0 grb0Var) {
        long j;
        Long l;
        Poll poll;
        PollAttachment pollAttachment = grb0Var.n;
        long j2 = grb0Var.a;
        if (j2 > 0) {
            j = Long.valueOf((System.currentTimeMillis() / 1000) + j2);
        } else {
            j = grb0Var.b;
            if (j == null) {
                if (((pollAttachment == null || (poll = pollAttachment.f) == null) ? 0L : poll.k) <= 0) {
                    l = null;
                    int i = grb0Var.j;
                    int i2 = grb0Var.i;
                    if (pollAttachment == null) {
                        Poll poll2 = pollAttachment.f;
                        UserId userId = poll2.c;
                        int i3 = poll2.b;
                        String str = grb0Var.c;
                        hpb0.a aVar = grb0Var.o;
                        return new bub0(userId, i3, str, aVar != null ? aVar.a : null, aVar != null ? aVar.c : null, aVar != null ? aVar.b : null, grb0Var.f, grb0Var.g, poll2.j, Integer.valueOf(i2), Integer.valueOf(i), grb0Var.l, grb0Var.k, l, grb0Var.m);
                    }
                    String str2 = grb0Var.c;
                    ArrayList arrayList = grb0Var.d;
                    ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((hpb0.d) it.next()).a);
                    }
                    return new ztb0(str2, arrayList2, grb0Var.e, grb0Var.f, grb0Var.g, grb0Var.h, Integer.valueOf(i2), Integer.valueOf(i), l, grb0Var.k, grb0Var.l, grb0Var.m);
                }
                j = 0L;
            }
        }
        l = j;
        int i4 = grb0Var.j;
        int i22 = grb0Var.i;
        if (pollAttachment == null) {
        }
    }
}
