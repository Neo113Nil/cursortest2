package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;

/* compiled from: CommunityInternalMenuTracker.kt */
/* loaded from: classes5.dex */
public final class t5h {
    public final UserId a;

    /* compiled from: CommunityInternalMenuTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.values().length];
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.LONG_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.COPY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.SHARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.VIEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.EDIT_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.DELETE_ITEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.ADD_NEW_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.EDIT_ORDER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.HIDE_MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.UNHIDE_APP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.HIDE_APP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CommunityProfileAction.CommunityInternalMenuAction.CommunityMenuActionType.OPEN_MENU.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public t5h(UserId userId) {
        this.a = userId;
    }
}
