package xsna;

import android.content.res.ColorStateList;
import android.widget.Button;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.BannerButton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BannerButtonHelper.kt */
/* loaded from: classes2.dex */
public final class l16 {

    /* compiled from: BannerButtonHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerButton.TextColorStyle.values().length];
            try {
                iArr[BannerButton.TextColorStyle.PRIMARY_REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerButton.TextColorStyle.PRIMARY_DESTRUCTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BannerButton.TextColorStyle.SECONDARY_REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BannerButton.TextColorStyle.SECONDARY_DESTRUCTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(Button button, int i, BubbleColors bubbleColors, BannerButton.TextColorStyle textColorStyle, String str, BannerButton.a aVar, Peer peer, pk30 pk30Var) {
        int i2 = bubbleColors.b;
        bwt0.p0(button, true);
        button.setBackgroundResource(i);
        int i3 = a.$EnumSwitchMapping$0[textColorStyle.ordinal()];
        if (i3 == 1) {
            button.getBackground().setTintList(ColorStateList.valueOf(i2));
            i2 = krv0.l(R.attr.vk_ui_text_contrast_themed);
        } else if (i3 == 2) {
            i2 = krv0.l(R.attr.vk_ui_text_contrast_themed);
        } else if (i3 != 3) {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = krv0.l(R.attr.vk_ui_text_negative);
        }
        button.setTextColor(i2);
        if (str != null) {
            button.setText(str);
        }
        bwt0.i0(button, new z14(peer, aVar, pk30Var, 2));
    }

    public static void b(Button button, int i, BubbleColors bubbleColors, BannerButton.TextColorStyle textColorStyle, String str, BannerButton.a aVar, pk30 pk30Var) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a(button, i, bubbleColors, textColorStyle, str, aVar, Peer.Unknown.e, pk30Var);
    }
}
