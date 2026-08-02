package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem$ChangeBackground$Background;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VoipParticipantsItemChangeBackgroundDelegate.kt */
/* loaded from: classes7.dex */
public final class fuw0 {
    public static final fuw0 a = new fuw0();

    /* compiled from: VoipParticipantsItemChangeBackgroundDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CallSettingsItem$ChangeBackground$Background.values().length];
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.TOP_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.BOTTOM_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallSettingsItem$ChangeBackground$Background.DEFAULT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a(View view, CallSettingsItem$ChangeBackground$Background callSettingsItem$ChangeBackground$Background) {
        int i = a.$EnumSwitchMapping$0[callSettingsItem$ChangeBackground$Background.ordinal()];
        if (i == 1) {
            Drawable a2 = m33.a(R.drawable.voip_bg_corner_top12, view.getContext());
            dhr0.a.getClass();
            view.setBackground(new baf0(a2, e3m.f(R.attr.vk_ui_background_contrast_themed, dhr0.s())));
        } else if (i == 2) {
            view.setBackgroundResource(0);
            dhr0.a.getClass();
            view.setBackgroundColor(e3m.f(R.attr.vk_ui_background_contrast_themed, dhr0.s()));
        } else if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            view.setBackgroundResource(0);
        } else {
            Drawable a3 = m33.a(R.drawable.voip_bg_corner_bottom12, view.getContext());
            dhr0.a.getClass();
            view.setBackground(new baf0(a3, e3m.f(R.attr.vk_ui_background_contrast_themed, dhr0.s())));
        }
    }
}
