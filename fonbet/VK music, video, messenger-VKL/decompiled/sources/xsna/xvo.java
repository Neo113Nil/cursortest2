package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: EasyPromoteErrorBottomSheet.kt */
/* loaded from: classes17.dex */
public final class xvo {
    public ozf a;

    /* compiled from: EasyPromoteErrorBottomSheet.kt */
    public static final class a {
        public static void a(Activity activity, String str, String str2) {
            xvo xvoVar = new xvo();
            dw20.b bVar = new dw20.b(activity, null);
            VkPlaceholder vkPlaceholder = new VkPlaceholder(activity, null, 6);
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_info_outline_56), new b8g(krv0.m(R.attr.vk_ui_icon_accent, vkPlaceholder.getContext())), null, 28));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(oq.d(tlo0.Companion, str), new tlo0.h(str2), (com.vk.core.compose.component.semantics.a) null, 10));
            tlo0.f fVar = new tlo0.f(R.string.clips_easy_promote_error_btn_text);
            VkButton.Mode mode = VkButton.Mode.Primary;
            vkPlaceholder.setBottom(new VkPlaceholder.a(new VkPlaceholder.a.C0854a(fVar, new qzg(xvoVar, 11), null, null, VkButton.Size.Large, mode, VkButton.Appearance.Accent, true, null, 1084), (VkPlaceholder.a.C0854a) null, 6));
            vkPlaceholder.setWithPaddings(false);
            s3q0 s3q0Var = s3q0.a;
            xvoVar.a = new ozf(((dw20.b) bVar.D0(vkPlaceholder, false)).H0(((FragmentActivity) activity).getSupportFragmentManager(), null), 22);
        }
    }
}
