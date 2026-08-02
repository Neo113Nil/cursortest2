package xsna;

import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;

/* compiled from: UserProfileActionButtons.kt */
/* loaded from: classes5.dex */
public final class olq0 {
    public final LinearLayout a;
    public final ptq0 b;
    public final VkButton c;
    public final VkButton d;
    public final VkButton e;
    public final VkButton f;
    public final VkButton g;
    public final ptq0 h;

    /* compiled from: UserProfileActionButtons.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserProfileAdapterItem.MainInfo.ActionButtons.State.values().length];
            try {
                iArr[UserProfileAdapterItem.MainInfo.ActionButtons.State.ADD_TO_FRIEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserProfileAdapterItem.MainInfo.ActionButtons.State.AT_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserProfileAdapterItem.MainInfo.ActionButtons.State.FRIEND_REQUEST_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOWING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserProfileAdapterItem.MainInfo.ActionButtons.State.GIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public olq0(LinearLayout linearLayout) {
        this.a = linearLayout;
        qcy<Object>[] qcyVarArr = bwt0.a;
        int dimension = (int) linearLayout.getResources().getDimension(R.dimen.profile_card_base_info_horizontal_padding);
        awt0.x(linearLayout, dimension, 0, dimension, 0, 10);
        this.b = new ptq0((VkButton) linearLayout.findViewById(R.id.action_button_primary));
        this.c = (VkButton) linearLayout.findViewById(R.id.action_button_compact_friend);
        this.d = (VkButton) linearLayout.findViewById(R.id.action_button_call);
        this.e = (VkButton) linearLayout.findViewById(R.id.action_button_message);
        this.f = (VkButton) linearLayout.findViewById(R.id.action_button_friend);
        this.g = (VkButton) linearLayout.findViewById(R.id.action_button_menu);
        this.h = new ptq0((VkButton) linearLayout.findViewById(R.id.action_button_easy_promote));
    }

    public static void a(VkButton vkButton, boolean z, gzs gzsVar) {
        bwt0.p0(vkButton, z);
        if (z) {
            bwt0.i0(vkButton, new yza(2, gzsVar));
        }
    }
}
