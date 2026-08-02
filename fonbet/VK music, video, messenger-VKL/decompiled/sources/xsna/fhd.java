package xsna;

import androidx.recyclerview.widget.m;
import com.vk.camera.clips.impl.authors.selector.list.delegate.ClipsAuthorSelectorAuthorDelegate;

/* compiled from: ClipsAuthorSelectorAdapter.kt */
/* loaded from: classes14.dex */
public final class fhd extends wx3 {
    public static final a j = new a();

    /* compiled from: ClipsAuthorSelectorAdapter.kt */
    public static final class a extends m.e<hfz> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
            return hfzVar.equals(hfzVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
            return epx.f(hfzVar.getItemId(), hfzVar2.getItemId());
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
            ghd ghdVar;
            ghd ghdVar2;
            hfz hfzVar3 = hfzVar;
            hfz hfzVar4 = hfzVar2;
            hhd hhdVar = hfzVar3 instanceof hhd ? (hhd) hfzVar3 : null;
            if (hhdVar != null && (ghdVar = hhdVar.b) != null) {
                hhd hhdVar2 = hfzVar4 instanceof hhd ? (hhd) hfzVar4 : null;
                if (hhdVar2 != null && (ghdVar2 = hhdVar2.b) != null && ghdVar.b != ghdVar2.b) {
                    return ClipsAuthorSelectorAuthorDelegate.Payload.SELECTION_CHANGED;
                }
            }
            return null;
        }
    }
}
