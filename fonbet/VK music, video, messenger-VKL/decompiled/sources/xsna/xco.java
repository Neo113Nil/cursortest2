package xsna;

import androidx.recyclerview.widget.m;

/* compiled from: DraftAdapter.kt */
/* loaded from: classes16.dex */
public final class xco {
    public static final a a = new a();

    /* compiled from: DraftAdapter.kt */
    public static final class a extends m.e<ido> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(ido idoVar, ido idoVar2) {
            return idoVar.equals(idoVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(ido idoVar, ido idoVar2) {
            return epx.f(idoVar.a, idoVar2.a);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final /* bridge */ /* synthetic */ Object getChangePayload(ido idoVar, ido idoVar2) {
            return s3q0.a;
        }
    }
}
