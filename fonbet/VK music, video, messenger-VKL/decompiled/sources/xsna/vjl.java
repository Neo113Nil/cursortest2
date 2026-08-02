package xsna;

import com.vk.im.ui.views.msg.bubble.MsgBubblePart;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BubbleDrawableProvider.kt */
/* loaded from: classes2.dex */
public final class vjl implements kl8 {
    public static final vjl b = new vjl();

    /* compiled from: BubbleDrawableProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgBubblePart.values().length];
            try {
                iArr[MsgBubblePart.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgBubblePart.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgBubblePart.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgBubblePart.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.kl8
    public final int b(MsgBubblePart msgBubblePart) {
        int i = a.$EnumSwitchMapping$0[msgBubblePart.ordinal()];
        if (i == 1) {
            return R.attr.vkim_msg_out_def_full;
        }
        if (i == 2) {
            return R.attr.vkim_msg_out_def_top;
        }
        if (i == 3) {
            return R.attr.vkim_msg_out_def_mid;
        }
        if (i == 4) {
            return R.attr.vkim_msg_out_def_bottom;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "DefaultOutgoingBubbleDrawableProvider";
    }
}
