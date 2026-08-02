package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: ClipsBusinessUploadWarningBottomSheet.kt */
/* loaded from: classes17.dex */
public final class rkd {
    public static final String c = i5s.a(new StringBuilder("https://"), a0a.d, "/@vkclips-copyrights-description");
    public com.vk.movika.sdk.base.logic.interactor.j a;
    public g5 b;

    /* compiled from: ClipsBusinessUploadWarningBottomSheet.kt */
    public static final class a {
        public static void a(Activity activity, g5 g5Var) {
            final rkd rkdVar = new rkd();
            dw20.b bVar = new dw20.b(activity, null);
            VkPlaceholder vkPlaceholder = new VkPlaceholder(activity, null, 6);
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_info_outline_56), new b8g(krv0.m(R.attr.vk_ui_text_accent, activity)), null, 28));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(tq.h(tlo0.Companion, R.string.clips_business_upload_warning_title), new tlo0.f(R.string.clips_business_upload_warning_desc), (com.vk.core.compose.component.semantics.a) null, 10));
            vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(new tlo0.f(R.string.clips_business_upload_warning_more), new com.vk.movika.sdk.base.logic.interactor.h(rkdVar, 17), null, null, null, VkButton.Mode.Link, VkButton.Appearance.Accent, false, null, 1660), (VkPlaceholder.a.C0854a) null, 6));
            vkPlaceholder.setWithPaddings(false);
            s3q0 s3q0Var = s3q0.a;
            dw20.b bVar2 = (dw20.b) dw20.a.k0(bVar.D0(vkPlaceholder, false), activity.getString(R.string.clips_business_upload_warning_publication), new hz20() { // from class: xsna.qkd
                @Override // xsna.hz20
                public final void a(int i) {
                    g5 g5Var2 = rkd.this.b;
                    if (g5Var2 != null) {
                        g5Var2.invoke();
                    }
                }
            }, null, null, 12);
            rkdVar.b = g5Var;
            rkdVar.a = new com.vk.movika.sdk.base.logic.interactor.j(activity, 20);
            bVar2.H0(((FragmentActivity) e3m.h(activity)).getSupportFragmentManager(), null);
        }
    }
}
