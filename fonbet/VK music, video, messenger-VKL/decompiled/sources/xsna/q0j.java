package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: ConfigureRoomParticipantsDiffUtilCallback.kt */
/* loaded from: classes7.dex */
public final class q0j extends m.e<hfz> {
    public final tx3 a = wx3.i;

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
        return ((Boolean) this.a.invoke(hfzVar, hfzVar2)).booleanValue();
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        return hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        if (!(hfzVar3 instanceof x0j) || !(hfzVar4 instanceof x0j)) {
            return null;
        }
        x0j x0jVar = (x0j) hfzVar4;
        if (epx.f(((x0j) hfzVar3).d.a, x0jVar.d.a)) {
            return new y0j(x0jVar);
        }
        return null;
    }
}
