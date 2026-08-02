package xsna;

import com.vk.donut.video.model.domain.video.DonutVideoModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.donut.VideoDonut;
import com.vk.dto.common.donut.chip.VideoDonutChip;
import com.vk.dto.common.donut.popup.VideoDonutAction;
import com.vk.dto.common.donut.popup.VideoDonutPopup;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoToDonutVideoExtension.kt */
/* loaded from: classes18.dex */
public final class nkt0 {

    /* compiled from: VideoToDonutVideoExtension.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoDonutPopup.Illustration.values().length];
            try {
                iArr[VideoDonutPopup.Illustration.ILLUSTRATION_DONUT_LOGO_CONFETTI_120H.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoDonutPopup.Illustration.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoDonutAction.ActionType.values().length];
            try {
                iArr2[VideoDonutAction.ActionType.HIGHER_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoDonutAction.ActionType.EDIT_PRIVACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoDonutAction.ActionType.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoDonutAction.ActionType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final DonutVideoModel a(VideoFile videoFile) {
        DonutVideoModel.Popup popup;
        RestrictionButton restrictionButton;
        String str;
        String str2;
        DonutVideoModel.Popup.Illustration illustration;
        DonutVideoModel.Popup.PopupAction popupAction;
        DonutVideoModel.Popup.PopupAction.ActionType actionType;
        VideoDonut U3 = videoFile.U3();
        DonutVideoModel.Restriction restriction = null;
        if (U3 == null) {
            return null;
        }
        String a1 = videoFile.a1();
        boolean z = U3.b;
        Integer valueOf = Integer.valueOf(U3.c);
        VideoDonutPopup videoDonutPopup = U3.e;
        if (videoDonutPopup != null) {
            int i = a.$EnumSwitchMapping$0[videoDonutPopup.b.ordinal()];
            if (i == 1) {
                illustration = DonutVideoModel.Popup.Illustration.ILLUSTRATION_DONUT_LOGO_CONFETTI_120H;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                illustration = DonutVideoModel.Popup.Illustration.UNKNOWN;
            }
            String str3 = videoDonutPopup.c;
            String str4 = videoDonutPopup.d;
            VideoDonutAction videoDonutAction = videoDonutPopup.e;
            if (videoDonutAction != null) {
                String str5 = videoDonutAction.b;
                int i2 = a.$EnumSwitchMapping$1[videoDonutAction.c.ordinal()];
                if (i2 == 1) {
                    actionType = DonutVideoModel.Popup.PopupAction.ActionType.HIGHER_LEVEL;
                } else if (i2 == 2) {
                    actionType = DonutVideoModel.Popup.PopupAction.ActionType.EDIT_PRIVACY;
                } else if (i2 == 3) {
                    actionType = DonutVideoModel.Popup.PopupAction.ActionType.CLOSE;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    actionType = DonutVideoModel.Popup.PopupAction.ActionType.UNKNOWN;
                }
                popupAction = new DonutVideoModel.Popup.PopupAction(str5, actionType, videoDonutAction.d);
            } else {
                popupAction = null;
            }
            popup = new DonutVideoModel.Popup(illustration, str3, str4, popupAction);
        } else {
            popup = null;
        }
        VideoDonutChip videoDonutChip = U3.d;
        DonutVideoModel.Chip chip = new DonutVideoModel.Chip(videoDonutChip.b, videoDonutChip.c);
        VideoRestriction O = videoFile.O();
        if (O != null && e5o.b(O) && (restrictionButton = O.e) != null && (str = restrictionButton.d) != null && (str2 = restrictionButton.c) != null) {
            restriction = new DonutVideoModel.Restriction(str2, str);
        }
        return new DonutVideoModel(a1, z, valueOf, popup, chip, restriction);
    }
}
