package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PastAsrItemDividerViewHolder.kt */
/* loaded from: classes7.dex */
public final class tm90 extends vfz<ln90> {
    public final Object l;

    public tm90(ViewGroup viewGroup) {
        super(R.layout.voip_past_asr_divider_item, viewGroup);
        this.l = msy.a(LazyThreadSafetyMode.NONE, new cr20(this, 17));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(ln90 ln90Var) {
        bwt0.f0((View) this.l.getValue(), 0, ln90Var.b, 0, 0, 5);
    }
}
