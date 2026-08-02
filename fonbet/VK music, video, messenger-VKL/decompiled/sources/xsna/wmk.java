package xsna;

import android.view.ViewGroup;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vk.voip.ui.calls.presentation.base.view.components.VoipBanner;
import com.vkontakte.android.R;

/* compiled from: CustomContactBannerDelegate.kt */
/* loaded from: classes7.dex */
public final class wmk extends p1u0<a8j> {
    public final VoipCallServiceFragment.b a;

    /* compiled from: CustomContactBannerDelegate.kt */
    public static final class a extends vfz<a8j> {
        public final VoipBanner l;
        public final b m;

        public a(VoipBanner voipBanner, VoipCallServiceFragment.b bVar) {
            super(voipBanner);
            this.l = voipBanner;
            this.m = bVar;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(a8j a8jVar) {
            qzg qzgVar = new qzg(this, 7);
            VoipBanner voipBanner = this.l;
            voipBanner.setCloseClickListener(qzgVar);
            voipBanner.setImportClickListener(new ozf(this, 14));
        }
    }

    /* compiled from: CustomContactBannerDelegate.kt */
    public interface b {
        void o();

        void p();
    }

    public wmk(VoipCallServiceFragment.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends a8j> b(ViewGroup viewGroup) {
        VoipBanner voipBanner = new VoipBanner(viewGroup.getContext(), null, 6);
        voipBanner.setId(R.id.voip_vkapp_calls_banner);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = e3m.a(R.dimen.vk_ui_spacing_size2_xl, voipBanner.getContext());
        marginLayoutParams.rightMargin = e3m.a(R.dimen.vk_ui_spacing_size2_xl, voipBanner.getContext());
        voipBanner.setLayoutParams(marginLayoutParams);
        return new a(voipBanner, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof a8j;
    }
}
