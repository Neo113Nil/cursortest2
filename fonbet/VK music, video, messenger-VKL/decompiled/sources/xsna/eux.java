package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.egh0;

/* compiled from: ItemCenterPositionReporter.kt */
/* loaded from: classes7.dex */
public final class eux implements egh0.a {
    public final mcd a;
    public final awx b;
    public final cmc0 c;

    public eux(mcd mcdVar, awx awxVar, cmc0 cmc0Var) {
        this.a = mcdVar;
        this.b = awxVar;
        this.c = cmc0Var;
    }

    @Override // xsna.egh0.a
    public final void a(int i) {
        int intValue = ((Number) this.a.invoke()).intValue() - 1;
        awx awxVar = this.b;
        int i2 = awxVar.b;
        int i3 = awxVar.a;
        int abs = Math.abs(i - (((i3 / 2) + ((intValue * i3) + i2)) - (awxVar.c / 2)));
        double rint = Math.rint(abs / i3);
        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1 - (abs / i3));
        if (0.99f <= max && max <= 1.0f) {
            max = 1.0f;
        }
        int i4 = (int) rint;
        k0l0 k0l0Var = (k0l0) this.c.c;
        if (i4 == 0) {
            k0l0Var.l.invoke(Integer.valueOf(k0l0Var.getBindingAdapterPosition()), Boolean.FALSE);
            k0l0Var.h6(max, iah0.b(4.0f), k0l0Var.itemView.getContext().getColor(R.color.vk_white), k0l0Var.itemView.getContext().getColor(R.color.vk_white_alpha20));
        } else if (i4 != 1) {
            k0l0Var.h6(max, iah0.b(3.0f), k0l0Var.itemView.getContext().getColor(R.color.vk_white_alpha40), k0l0Var.itemView.getContext().getColor(R.color.vk_clear));
        } else {
            k0l0Var.h6(max, iah0.b(3.0f), k0l0Var.itemView.getContext().getColor(R.color.vk_white_alpha60), k0l0Var.itemView.getContext().getColor(R.color.vk_clear));
        }
    }
}
