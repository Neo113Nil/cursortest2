package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import xsna.k9d0;

/* compiled from: ActionRaiseHand.kt */
/* loaded from: classes7.dex */
public final class k40 extends vu<k9d0.d> {
    public final Integer e;

    public k40(Integer num, gzs<s3q0> gzsVar) {
        super(null, gzsVar);
        this.e = num;
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        k9d0.d dVar = (k9d0.d) obj;
        ImageView imageView = (ImageView) view;
        boolean z = dVar.a;
        bwt0.p0(imageView, z);
        boolean z2 = dVar.b;
        imageView.setActivated(z2);
        if (z) {
            imageView.setContentDescription(imageView.getContext().getString(z2 ? R.string.voip_call_actions_hand_lower : R.string.voip_call_actions_hand_raise));
        }
    }

    @Override // xsna.wu
    public final int j() {
        Integer num = this.e;
        return num != null ? num.intValue() : R.drawable.bg_voip_reactions_hand_button;
    }

    @Override // xsna.wu
    public final int k() {
        return R.drawable.ic_hand_raised_28;
    }

    @Override // xsna.wu
    public final int m() {
        return R.color.vk_white;
    }
}
