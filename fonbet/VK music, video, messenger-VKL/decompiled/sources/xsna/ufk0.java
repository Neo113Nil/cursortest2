package xsna;

import com.vkontakte.android.R;

/* compiled from: DelegateUtils.kt */
/* loaded from: classes15.dex */
public final class ufk0 extends wq70<Integer> {
    public final /* synthetic */ qfk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufk0(qfk0 qfk0Var) {
        super(0);
        this.b = qfk0Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Integer num, Integer num2) {
        int intValue = num2.intValue();
        num.intValue();
        qfk0 qfk0Var = this.b;
        if (intValue == 0) {
            qfk0Var.j.setContentDescription(qfk0Var.a.getContext().getString(R.string.vk_sound_captcha_new_refresh_content_description));
            qfk0Var.j.setText(qfk0Var.a.getContext().getString(R.string.vk_captcha_refresh));
        } else {
            qfk0Var.j.setContentDescription(qfk0Var.a.getContext().getString(R.string.vk_sound_captcha_new_refresh_in_content_description, Integer.valueOf(intValue)));
            qfk0Var.j.setText(qfk0Var.a.getContext().getString(R.string.vk_captcha_refresh_in, Integer.valueOf(intValue)));
        }
    }

    @Override // xsna.wq70
    public final boolean beforeChange(qcy<?> qcyVar, Integer num, Integer num2) {
        return !epx.f(num, num2);
    }
}
