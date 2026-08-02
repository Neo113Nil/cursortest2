package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.k9d0;

/* compiled from: ActionCamSwitch.kt */
/* loaded from: classes7.dex */
public final class sy extends vu<k9d0.c> {
    public final Integer e;

    public sy(Integer num, gzs<s3q0> gzsVar) {
        super(null, gzsVar);
        this.e = num;
    }

    @Override // xsna.ku
    public final void d(View view) {
        ImageView imageView = (ImageView) view;
        super.d(imageView);
        float rotation = imageView.getRotation() + 180;
        View[] viewArr = {imageView};
        ArrayList arrayList = new ArrayList();
        Iterator it = rl3.I(viewArr).iterator();
        while (it.hasNext()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat((View) it.next(), "rotation", rotation);
            ofFloat.setDuration(500L);
            arrayList.add(ofFloat);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    @Override // xsna.ku
    public final void g(View view, Object obj) {
        bwt0.p0((ImageView) view, ((k9d0.c) obj).b);
    }

    @Override // xsna.wu
    public final int j() {
        Integer num = this.e;
        return num != null ? num.intValue() : super.j();
    }

    @Override // xsna.wu
    public final int k() {
        return R.drawable.vk_icon_switch_outline_28;
    }

    @Override // xsna.wu, xsna.ku
    /* renamed from: p */
    public final void h(ImageView imageView) {
        super.h(imageView);
        imageView.setId(R.id.btn_primary_switch_cam);
        imageView.setContentDescription(imageView.getContext().getString(R.string.voip_accessibility_switch_camera));
    }
}
