package xsna;

import androidx.recyclerview.widget.m;
import xsna.jmm;

/* compiled from: ImItemListAdapter.kt */
/* loaded from: classes2.dex */
public final class o5w extends wx3 {

    /* compiled from: ImItemListAdapter.kt */
    public static final class a extends m.e<hfz> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            return hfzVar.equals(hfzVar2);
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
            return ((hfzVar3 instanceof zfm) && (hfzVar4 instanceof zfm)) ? jmm.b.d.a((zfm) hfzVar3, (zfm) hfzVar4) : hfzVar4;
        }
    }
}
