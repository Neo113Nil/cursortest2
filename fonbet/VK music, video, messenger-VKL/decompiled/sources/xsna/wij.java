package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.camera.settings.ModalPrivacySettingsErrorView;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.content.privacy.api.VideoPrivacySettingType;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.tzp0;

/* compiled from: ContentPrivacyInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class wij implements uij {
    @Override // xsna.uij
    public final void a(Context context, PrivacySetting privacySetting, nt10 nt10Var) {
        new k6t0(context, VideoPrivacySettingType.VideoComments.b, privacySetting, null, nt10Var, null, null).m1();
    }

    @Override // xsna.uij
    public final void b(Context context, PrivacySetting privacySetting, UserId userId, DonutLevel donutLevel, w910 w910Var, v95 v95Var) {
        d(context, privacySetting, userId, donutLevel, w910Var, v95Var);
    }

    @Override // xsna.uij
    public final void c(l7s l7sVar, String str, PrivacySetting privacySetting, ito0 ito0Var, ew3 ew3Var) {
        new doz(l7sVar, str, privacySetting, ito0Var, ew3Var, new tzp0.c.a(new vij(), false)).m1();
    }

    @Override // xsna.uij
    public final void d(Context context, PrivacySetting privacySetting, UserId userId, DonutLevel donutLevel, izs izsVar, wzs wzsVar) {
        new k6t0(context, VideoPrivacySettingType.VideoWatch.b, privacySetting, userId, izsVar, wzsVar, donutLevel).m1();
    }

    @Override // xsna.uij
    public final void e(l7s l7sVar, boolean z, klu kluVar, g1j g1jVar, pw pwVar) {
        boz bozVar = new boz(l7sVar, kluVar, g1jVar, pwVar, new tzp0.c.a(new vij(), false), z);
        l7s l7sVar2 = bozVar.e;
        if (l7sVar2 != null) {
            bozVar.u0(l7sVar2.getThemeResId());
            bozVar.l(e3m.f(R.attr.vk_ui_background_content, l7sVar2));
        }
        View inflate = LayoutInflater.from(l7sVar2).inflate(R.layout.layout_live_group_privacy, (ViewGroup) null, false);
        qxm0.r(inflate);
        VkGroupHeader vkGroupHeader = (VkGroupHeader) inflate.findViewById(R.id.privacy_live_group_settings_title);
        vkGroupHeader.setSize(VkGroupHeader.Size.Small);
        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.privcay_live_group_who_will_see_title), null, null, null, 0, 510));
        ModalSettingsPrivacyOption modalSettingsPrivacyOption = (ModalSettingsPrivacyOption) inflate.findViewById(R.id.privacy_settings_group_who_can_all_option);
        modalSettingsPrivacyOption.setTag(mt1.b);
        ModalSettingsPrivacyOption modalSettingsPrivacyOption2 = (ModalSettingsPrivacyOption) inflate.findViewById(R.id.privacy_settings_group_who_can_members_option);
        modalSettingsPrivacyOption2.setTag(z120.b);
        ModalSettingsPrivacyOption modalSettingsPrivacyOption3 = (ModalSettingsPrivacyOption) inflate.findViewById(R.id.privacy_settings_group_who_can_admins_option);
        modalSettingsPrivacyOption3.setTag(q5p.b);
        List<ModalSettingsPrivacyOption> l = e43.l(modalSettingsPrivacyOption, modalSettingsPrivacyOption2, modalSettingsPrivacyOption3);
        Iterator it = l.iterator();
        while (it.hasNext()) {
            ((ModalSettingsPrivacyOption) it.next()).setCheckVisible(false);
        }
        bozVar.k = l;
        if (bozVar.i) {
            f4m.j(modalSettingsPrivacyOption);
        }
        bozVar.T0(bozVar.f);
        List<ModalSettingsPrivacyOption> list = bozVar.k;
        for (ModalSettingsPrivacyOption modalSettingsPrivacyOption4 : list != null ? list : null) {
            bwt0.i0(modalSettingsPrivacyOption4, new defpackage.s(21, bozVar, modalSettingsPrivacyOption4));
        }
        bozVar.l = inflate.findViewById(R.id.privacy_loader);
        bozVar.m = (ModalPrivacySettingsErrorView) inflate.findViewById(R.id.privacy_bottomsheet_loading_error);
        bwt0.i0(inflate.findViewById(R.id.privacy_settings_group_save), new cws(bozVar, 16));
        bozVar.D0(inflate, false);
        bozVar.s(enj.e(R.drawable.vk_icon_arrow_left_outline_28, R.attr.vk_ui_icon_accent, bozVar.c));
        bozVar.t();
        bozVar.c(new jgj(inflate, 0, 0, 46));
        bozVar.v0(R.string.privacy_bottomsheet_title);
        bozVar.a0(new myh(bozVar, 28));
        bozVar.n = bozVar.I0(bozVar.j);
        View view = bozVar.l;
        if (view != null) {
            f4m.j(view);
        }
        ModalPrivacySettingsErrorView modalPrivacySettingsErrorView = bozVar.m;
        if (modalPrivacySettingsErrorView != null) {
            f4m.j(modalPrivacySettingsErrorView);
        }
    }
}
