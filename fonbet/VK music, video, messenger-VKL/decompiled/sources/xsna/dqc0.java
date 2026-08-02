package xsna;

import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vkontakte.android.R;
import xsna.cqc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dqc0(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) this.d).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_available_only_friends);
                bwt0.p0(modalSettingsPrivacyOption, this.c);
                return modalSettingsPrivacyOption;
            default:
                pim0 pim0Var = (pim0) this.d;
                pim0Var.C = this.c;
                pim0Var.a.invalidate();
                return s3q0.a;
        }
    }
}
