package xsna;

import androidx.recyclerview.widget.m;
import xsna.ji8;

/* compiled from: BroadcastDiffCallback.kt */
/* loaded from: classes7.dex */
public final class we8 extends m.e<ji8.a> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(ji8.a aVar, ji8.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(ji8.a aVar, ji8.a aVar2) {
        return epx.f(aVar.a, aVar2.a);
    }
}
