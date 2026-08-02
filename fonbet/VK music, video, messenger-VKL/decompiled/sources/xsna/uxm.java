package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: StoryStatisticsStickersAdapter.kt */
/* loaded from: classes6.dex */
public final class uxm extends m.e<hfz> {
    public final gbl0 a = new gbl0();
    public final rbl0 b = new rbl0();

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        if ((hfzVar3 instanceof ual0) && (hfzVar4 instanceof ual0)) {
            this.a.getClass();
            return gbl0.a((ual0) hfzVar3, (ual0) hfzVar4);
        }
        if (((hfzVar3 instanceof zem0) && (hfzVar4 instanceof zem0)) || !(hfzVar3 instanceof val0) || !(hfzVar4 instanceof val0)) {
            return false;
        }
        this.b.getClass();
        return rbl0.a((val0) hfzVar3, (val0) hfzVar4);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        if ((hfzVar3 instanceof ual0) && (hfzVar4 instanceof ual0)) {
            this.a.getClass();
            return ((ual0) hfzVar3).b.b == ((ual0) hfzVar4).b.b;
        }
        if ((!(hfzVar3 instanceof zem0) || !(hfzVar4 instanceof zem0)) && (hfzVar3 instanceof val0) && (hfzVar4 instanceof val0)) {
            this.b.getClass();
            if (((val0) hfzVar3).b.b == ((val0) hfzVar4).b.b) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        if ((hfzVar3 instanceof ual0) && (hfzVar4 instanceof ual0)) {
            this.a.getClass();
            return gbl0.c((ual0) hfzVar3, (ual0) hfzVar4);
        }
        if (((hfzVar3 instanceof zem0) && (hfzVar4 instanceof zem0)) || !(hfzVar3 instanceof val0) || !(hfzVar4 instanceof val0)) {
            return null;
        }
        this.b.getClass();
        return rbl0.e((val0) hfzVar3, (val0) hfzVar4);
    }
}
