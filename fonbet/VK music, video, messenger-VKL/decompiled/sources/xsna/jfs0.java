package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: VideoDiscoveryAdapter.kt */
/* loaded from: classes7.dex */
public final class jfs0 extends m.e<hfz> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        if ((hfzVar3 instanceof pfs0) && (hfzVar4 instanceof pfs0)) {
            return false;
        }
        return hfzVar3.equals(hfzVar4);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        return !((hfzVar3 instanceof pfs0) && (hfzVar4 instanceof pfs0)) && hfzVar3.getClass().equals(hfzVar4.getClass()) && epx.f(hfzVar3.getItemId(), hfzVar4.getItemId());
    }
}
