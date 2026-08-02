package xsna;

import com.vk.api.generated.base.dto.BaseLinkButtonActionCallDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionMarketWriteDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionPerformActionWithUrlDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionPerformActionsDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionShareOptionsDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionTargetDto;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionCloseWebApp;
import com.vk.dto.common.actions.ActionEmpty;
import com.vk.dto.common.actions.ActionEnableTopNews;
import com.vk.dto.common.actions.ActionOpenAdvUrl;
import com.vk.dto.common.actions.ActionOpenInternalVkUi;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.actions.ActionOpenVkApp;
import com.vk.dto.common.actions.ActionPerformActionWithUrl;
import com.vk.dto.common.actions.ActionPerformClick;
import com.vk.dto.common.actions.ActionPhoneCall;
import com.vk.dto.common.actions.ActionSendMarketMessage;
import com.vk.dto.common.actions.ActionShareUrl;

/* compiled from: BaseLinkButtonActionToAction.kt */
/* loaded from: classes3.dex */
public final class wf6 {

    /* compiled from: BaseLinkButtonActionToAction.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BaseLinkButtonActionTypeDto.values().length];
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.HELP_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_VKAPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_GAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.OPEN_INTERNAL_VKUI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.GROUPS_ADVERTISEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.ENABLE_TOP_NEWSFEED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CALL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.MARKET_WRITE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SPECIALS_PERFORM_ACTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.SHARE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.CLOSE_WEB_APP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BaseLinkButtonActionTypeDto.PERFORM_ACTION_WITH_URL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BaseOwnerButtonActionTargetDto.values().length];
            try {
                iArr2[BaseOwnerButtonActionTargetDto.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[BaseOwnerButtonActionTargetDto.INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[BaseOwnerButtonActionTargetDto.AUTHORIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static ActionOpenUrl.Target a(BaseLinkButtonActionDto baseLinkButtonActionDto) {
        BaseOwnerButtonActionTargetDto B = baseLinkButtonActionDto.B();
        int i = B == null ? -1 : a.$EnumSwitchMapping$1[B.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? ActionOpenUrl.Target.f30default : ActionOpenUrl.Target.authorize : ActionOpenUrl.Target.f88internal : ActionOpenUrl.Target.external;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Action b(BaseLinkButtonActionDto baseLinkButtonActionDto) {
        ActionPerformActionWithUrl.PerformActionWithUrl performActionWithUrl = null;
        switch (a.$EnumSwitchMapping$0[baseLinkButtonActionDto.C().ordinal()]) {
            case 1:
                ActionOpenUrl.Target a2 = a(baseLinkButtonActionDto);
                String url = baseLinkButtonActionDto.getUrl();
                return new ActionOpenUrl(url != null ? url : "", a2);
            case 2:
                return null;
            case 3:
            case 4:
                String url2 = baseLinkButtonActionDto.getUrl();
                String str = url2 == null ? "" : url2;
                BaseOwnerButtonActionTargetDto B = baseLinkButtonActionDto.B();
                return new ActionOpenVkApp(B != null ? B.i() : null, 0L, str, null);
            case 5:
                String url3 = baseLinkButtonActionDto.getUrl();
                if (url3 != null && url3.length() != 0) {
                    return new ActionOpenInternalVkUi(url3);
                }
                return null;
            case 6:
                String url4 = baseLinkButtonActionDto.getUrl();
                if (url4 != null && url4.length() != 0 && baseLinkButtonActionDto.B() != null) {
                    return new ActionOpenAdvUrl(url4, a(baseLinkButtonActionDto));
                }
                return null;
            case 7:
                return new ActionEnableTopNews();
            case 8:
                BaseLinkButtonActionCallDto f = baseLinkButtonActionDto.f();
                if (f != null) {
                    return new ActionPhoneCall(f.d());
                }
                return null;
            case 9:
                BaseLinkButtonActionMarketWriteDto l = baseLinkButtonActionDto.l();
                if (l != null) {
                    return new ActionSendMarketMessage(l.d().b, l.getMessage());
                }
                return null;
            case 10:
                String j = baseLinkButtonActionDto.j();
                if (j != null) {
                    return new ActionPerformClick(j);
                }
                return null;
            case 11:
                String url5 = baseLinkButtonActionDto.getUrl();
                if (url5 != null) {
                    BaseLinkButtonActionShareOptionsDto p = baseLinkButtonActionDto.p();
                    boolean z = false;
                    if (p != null && p.d()) {
                        z = true;
                    }
                    return new ActionShareUrl(url5, z);
                }
                return null;
            case 12:
                return new ActionCloseWebApp();
            case 13:
                String url6 = baseLinkButtonActionDto.getUrl();
                String str2 = url6 != null ? url6 : "";
                BaseLinkButtonActionPerformActionWithUrlDto o = baseLinkButtonActionDto.o();
                if (o != null) {
                    BaseLinkButtonActionPerformActionsDto d = o.d();
                    performActionWithUrl = new ActionPerformActionWithUrl.PerformActionWithUrl(d != null ? d.i() : null);
                }
                return new ActionPerformActionWithUrl(str2, performActionWithUrl);
            default:
                return new ActionEmpty();
        }
    }
}
