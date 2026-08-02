package xsna;

import com.vk.core.view.components.button.VkButton;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserProfilePrimaryActionButton.kt */
/* loaded from: classes5.dex */
public final class ptq0 {
    public final VkButton a;
    public a b = a.PRIMARY;
    public final Object c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserProfilePrimaryActionButton.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PRIMARY;
        public static final a SECONDARY;

        static {
            a aVar = new a("PRIMARY", 0);
            PRIMARY = aVar;
            a aVar2 = new a("SECONDARY", 1);
            SECONDARY = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: UserProfilePrimaryActionButton.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserProfileAdapterItem.MainInfo.ActionButtons.State.values().length];
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.AT_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.ADD_TO_FRIEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.REPLY_TO_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.YOUR_FOLLOWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.FRIEND_REQUEST_SENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.FRIEND_REQUEST_SENT_PRIVATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOW.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOWING.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.PUBLISH.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.CALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.MORE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.PROMOTE.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.GIFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ptq0(VkButton vkButton) {
        this.a = vkButton;
        int y = bwt0.y(R.dimen.profile_button_vertical_padding, vkButton);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new vqe0(8));
        awt0.x(vkButton, 0, y, 0, y, 5);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(UserProfileAdapterItem.MainInfo.ActionButtons.a aVar, slq0 slq0Var) {
        a aVar2;
        VkButton.Mode mode;
        UserProfileAdapterItem.MainInfo.ActionButtons.State state = aVar.a;
        boolean z = state != UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE;
        VkButton vkButton = this.a;
        bwt0.p0(vkButton, z);
        if (bwt0.K(vkButton)) {
            int[] iArr = b.$EnumSwitchMapping$1;
            int i = iArr[state.ordinal()];
            ?? r5 = this.c;
            switch (i) {
                case 1:
                case 3:
                case 4:
                case 8:
                    aVar2 = a.PRIMARY;
                    break;
                case 2:
                case 6:
                case 7:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    aVar2 = a.SECONDARY;
                    break;
                case 5:
                    if (!((Boolean) r5.getValue()).booleanValue()) {
                        aVar2 = a.SECONDARY;
                        break;
                    } else {
                        aVar2 = a.PRIMARY;
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            this.b = aVar2;
            int i2 = iArr[state.ordinal()];
            int i3 = R.string.user_profile_reply_to_request_2;
            switch (i2) {
                case 1:
                    i3 = R.string.user_profile_message;
                    break;
                case 2:
                    i3 = R.string.user_profile_at_friends;
                    break;
                case 3:
                    i3 = R.string.user_profile_add_to_friends;
                    break;
                case 4:
                    if (!((Boolean) r5.getValue()).booleanValue()) {
                        i3 = R.string.user_profile_reply_to_request;
                        break;
                    }
                    break;
                case 5:
                    if (!((Boolean) r5.getValue()).booleanValue()) {
                        if (!aVar.b) {
                            i3 = R.string.user_profile_follow_you_m;
                            break;
                        } else {
                            i3 = R.string.user_profile_follow_you_f;
                            break;
                        }
                    }
                    break;
                case 6:
                case 7:
                    i3 = R.string.user_profile_request_sent;
                    break;
                case 8:
                    i3 = R.string.user_profile_follow;
                    break;
                case 9:
                    i3 = R.string.user_profile_following;
                    break;
                case 10:
                    i3 = R.string.user_profile_publish;
                    break;
                case 11:
                    i3 = R.string.user_profile_call;
                    break;
                case 12:
                case 15:
                    i3 = -1;
                    break;
                case 13:
                    i3 = R.string.ads_easy_promote_user;
                    break;
                case 14:
                    i3 = R.string.user_profile_gift;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Integer num = null;
            if (!((Boolean) r5.getValue()).booleanValue()) {
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_user_add_outline_20);
                Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_check_20);
                switch (iArr[state.ordinal()]) {
                    case 1:
                        num = Integer.valueOf(R.drawable.vk_icon_message_outline_20);
                        break;
                    case 2:
                        num = Integer.valueOf(R.drawable.vk_icon_user_check_outline_20);
                        break;
                    case 3:
                    case 4:
                        num = valueOf;
                        break;
                    case 5:
                    case 12:
                    case 15:
                        break;
                    case 6:
                    case 7:
                    case 9:
                        num = valueOf2;
                        break;
                    case 8:
                        num = Integer.valueOf(R.drawable.vk_icon_add_square_outline_20);
                        break;
                    case 10:
                        num = Integer.valueOf(R.drawable.vk_icon_add_circle_outline_20);
                        break;
                    case 11:
                        num = Integer.valueOf(R.drawable.vk_icon_phone_outline_20);
                        break;
                    case 13:
                        num = Integer.valueOf(R.drawable.vk_icon_advertising_outline_20);
                        break;
                    case 14:
                        num = Integer.valueOf(R.drawable.vk_icon_gift_outline_20);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            vkButton.setText(i3);
            vkButton.a5(true, num);
            vkButton.setIconSize(Integer.valueOf(iah0.a(20)));
            int i4 = b.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i4 == 1) {
                mode = VkButton.Mode.Primary;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                mode = VkButton.Mode.Secondary;
            }
            vkButton.setMode(mode);
            bwt0.i0(vkButton, new w95(state, this, slq0Var, 10));
        }
    }
}
