package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: ChannelsListAdapter.kt */
/* loaded from: classes16.dex */
public final class cgb extends wx3 {

    /* compiled from: ChannelsListAdapter.kt */
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
            return hfzVar2;
        }
    }
}
