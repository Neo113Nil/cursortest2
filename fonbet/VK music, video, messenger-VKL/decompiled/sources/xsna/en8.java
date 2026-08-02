package xsna;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.InterfaceC4413l1;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetOptions;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.g8d;

/* compiled from: BugReport.kt */
/* loaded from: classes17.dex */
public final class en8 extends ckd {
    public final zof b;
    public final ljt0 c;

    public en8(sua suaVar, zof zofVar, ljt0 ljt0Var) {
        super(ClipsBottomSheetOptions.BUGREPORT.ordinal());
        this.b = zofVar;
        this.c = ljt0Var;
    }

    @Override // xsna.ckd
    public final yu20 a(Activity activity, ikd ikdVar) {
        g8d.a aVar;
        if ((BuildInfo.h() || this.b.Y()) && ikdVar.a.k1() == 0 && (aVar = ikdVar.f) != null && aVar.b()) {
            return new ModalActionSheetListItem(this.a, ModalActionSheetListItem.Appearance.Negative, activity.getString(R.string.clips_tech_bugreport_action), null, null, R.drawable.vk_icon_bug_outline_28, ModalActionSheetListItem.IconSize.Large, false, false, InterfaceC4413l1.a.b.h);
        }
        return null;
    }

    @Override // xsna.ckd
    public final void b(Activity activity, ikd ikdVar, nkd nkdVar) {
        SdkVideoFile sdkVideoFile = ikdVar.a;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.clips_feed_bugreport_dialog, (ViewGroup) null);
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.edit_text);
        dw20.b q = ((dw20.b) new dw20.b(activity, null).p(false).r()).q(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) activity.getString(R.string.clips_tech_bugreport_title));
        FontFamily fontFamily = FontFamily.MEDIUM;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 16.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(16.0f);
        }
        Font.Companion.getClass();
        nik0.a(spannableStringBuilder, Font.a.a(fontFamily, f).k(activity), 0, spannableStringBuilder.length());
        dw20.b bVar = (dw20.b) q.w0(spannableStringBuilder);
        bVar.g();
        bVar.d.D = inflate;
        dw20.b K0 = bVar.T(R.string.clips_tech_bugreport_cancel, new com.vk.movika.sdk.base.ui.g0(7)).h0(R.string.clips_tech_bugreport_send, new na5(this, activity, sdkVideoFile, vkInputSelect, 1)).K0(21);
        dhr0.a.getClass();
        K0.u0(dhr0.u().c).I0("tech_bug_report");
    }
}
