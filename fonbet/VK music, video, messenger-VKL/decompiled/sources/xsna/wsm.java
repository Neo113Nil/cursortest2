package xsna;

import com.vk.instantjobs.InstantJob;
import xsna.u6x;

/* compiled from: DialogsListInfoBarHideJob.kt */
/* loaded from: classes.dex */
public final class wsm extends u4w {
    public final String c;
    public final String d;

    /* compiled from: DialogsListInfoBarHideJob.kt */
    public static final class a implements s7x<wsm> {
        @Override // xsna.s7x
        public final wsm a(ny90 ny90Var) {
            return new wsm(ny90Var.f("bar_name"), ny90Var.f("source"));
        }

        @Override // xsna.s7x
        public final void b(wsm wsmVar, ny90 ny90Var) {
            wsm wsmVar2 = wsmVar;
            ny90Var.o("bar_name", wsmVar2.c);
            ny90Var.o("source", wsmVar2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "ImDialogsListInfoBarHideJob";
        }
    }

    public wsm(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.u4w
    public final void J(w2w w2wVar) {
        if (wlb0.o(w2wVar, this.c)) {
            w2wVar.S0().B(this, true);
        }
    }

    @Override // xsna.u4w
    public final void K(w2w w2wVar, Throwable th) {
        if (wlb0.o(w2wVar, this.c)) {
            w2wVar.S0().B(this, true);
        }
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        usm usmVar = new usm(w2wVar.getContext(), this.c, this.d);
        usmVar.n = true;
        if (wlb0.p(w2wVar, ((xsm) bz2.c(usmVar, "ChannelSetNotificationsModeApiCmd")).a())) {
            w2wVar.S0().B(this, false);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsm)) {
            return false;
        }
        wsm wsmVar = (wsm) obj;
        return epx.f(this.c, wsmVar.c) && epx.f(this.d, wsmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
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
        return "im-dialogs-list-info-bar-hide";
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "DialogsListInfoBarHideJob";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsListInfoBarHideJob(barName=");
        sb.append(this.c);
        sb.append(", source=");
        return ho8.a(sb, this.d, ')');
    }
}
