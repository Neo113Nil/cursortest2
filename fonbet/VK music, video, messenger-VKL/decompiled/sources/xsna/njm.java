package xsna;

import com.vk.instantjobs.InstantJob;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ij20;
import xsna.u6x;

/* compiled from: DialogReorderJob.kt */
/* loaded from: classes.dex */
public final class njm extends u4w {
    public final ArrayList c;
    public final long d;

    /* compiled from: DialogReorderJob.kt */
    public static final class a implements s7x<njm> {
        @Override // xsna.s7x
        public final njm a(ny90 ny90Var) {
            List c0 = drm0.c0(ny90Var.f("dialog_ids"), new String[]{StringUtils.COMMA}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(Long.parseLong((String) it.next())));
            }
            return new njm(arrayList, ny90Var.e("start_delay_ms"));
        }

        @Override // xsna.s7x
        public final void b(njm njmVar, ny90 ny90Var) {
            njm njmVar2 = njmVar;
            ny90Var.o("dialog_ids", j5g.g0(njmVar2.c, StringUtils.COMMA, null, null, 0, null, 62));
            ny90Var.n("start_delay_ms", njmVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "DialogReorderJob";
        }
    }

    public njm(ArrayList arrayList, long j) {
        this.c = arrayList;
        this.d = j;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        ij20.a aVar2 = new ij20.a();
        aVar2.d = bz2.m();
        aVar2.c = "messages.reorderPinnedConversations";
        aVar2.b("peer_ids", j5g.g0(this.c, StringUtils.COMMA, null, null, 0, null, 62));
        aVar2.i = true;
        bz2.h(new ij20(aVar2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njm)) {
            return false;
        }
        njm njmVar = (njm) obj;
        return epx.f(this.c, njmVar.c) && this.d == njmVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String q() {
        return "im-dialog-pin-unpin";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long r() {
        return this.d;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogReorderJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogReorderJob(dialogIds=");
        sb.append(this.c);
        sb.append(", startDelayMs=");
        return vu5.a(')', this.d, sb);
    }
}
