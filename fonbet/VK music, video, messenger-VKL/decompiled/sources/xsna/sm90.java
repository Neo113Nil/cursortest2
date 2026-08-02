package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PastAsrItemDateViewHolder.kt */
/* loaded from: classes7.dex */
public final class sm90 extends vfz<kn90> {
    public final Object l;

    public sm90(ViewGroup viewGroup) {
        super(R.layout.voip_past_asr_date_item, viewGroup);
        this.l = msy.a(LazyThreadSafetyMode.NONE, new g880(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    public final void W5(kn90 kn90Var) {
        ((TextView) this.l.getValue()).setText(kn90Var.b);
    }
}
