package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.k9d0;

/* compiled from: ActionFeedback.kt */
/* loaded from: classes7.dex */
public final class r00 extends kw<k9d0.b> {
    public final Integer e;
    public bpn0 f;

    public r00(Integer num, gzs<s3q0> gzsVar) {
        super(null, gzsVar);
        this.e = num;
    }

    @Override // xsna.wu, xsna.ku
    public final View e(Context context) {
        this.f = new bpn0(new q00(context, 0));
        return new VKImageView(context, null, 6, 0);
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        k9d0.b bVar = (k9d0.b) obj;
        VKImageView vKImageView = (VKImageView) view;
        bwt0.p0(vKImageView, bVar.a);
        vKImageView.setContentDescription(vKImageView.getContext().getString(R.string.voip_accessibility_reactions_title));
        k9d0.a aVar = bVar.b;
        boolean f = epx.f(aVar, k9d0.a.C3171a.a);
        int i = R.drawable.voip_primary_button_normal;
        if (f) {
            vKImageView.setBackgroundResource(R.drawable.voip_primary_button_normal);
            bpn0 bpn0Var = this.f;
            vKImageView.setColorFilter(((Number) (bpn0Var != null ? bpn0Var : null).getValue()).intValue());
            vKImageView.setImageResource(R.drawable.vk_icon_hand_heart_filled_28);
            int b = cn70.b(16);
            vKImageView.setPadding(b, b, b, b);
            return;
        }
        if (epx.f(aVar, k9d0.a.c.a)) {
            vKImageView.setBackgroundResource(R.drawable.bg_voip_primary_reactions_button_activated);
            bpn0 bpn0Var2 = this.f;
            vKImageView.setColorFilter(((Number) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).intValue());
            int b2 = cn70.b(16);
            vKImageView.setPadding(b2, b2, b2, b2);
            vKImageView.setImageResource(R.drawable.ic_hand_raised_28);
            return;
        }
        if (!(aVar instanceof k9d0.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int b3 = cn70.b(12);
        vKImageView.setPadding(b3, b3, b3, b3);
        k9d0.a.b bVar2 = (k9d0.a.b) aVar;
        if (bVar2.a) {
            i = R.drawable.bg_voip_primary_reactions_button_activated;
        }
        vKImageView.setBackgroundResource(i);
        vKImageView.clearColorFilter();
        ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_32DP;
        Image Gb = bVar2.b.b.Gb(imageScreenSize.h());
        if (Gb != null) {
            vKImageView.O0(Gb.d, imageScreenSize);
        } else {
            vKImageView.setImageResource(R.drawable.vk_icon_hand_heart_filled_28);
        }
    }

    @Override // xsna.wu
    public final int j() {
        Integer num = this.e;
        return num != null ? num.intValue() : super.j();
    }

    @Override // xsna.wu
    public final int k() {
        return R.drawable.vk_icon_hand_heart_filled_28;
    }

    @Override // xsna.wu
    /* renamed from: o */
    public final VKImageView e(Context context) {
        this.f = new bpn0(new q00(context, 0));
        return new VKImageView(context, null, 6, 0);
    }
}
