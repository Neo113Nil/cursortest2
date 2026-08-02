package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: BannersTapsHandler.kt */
/* loaded from: classes16.dex */
public final class v36 implements ud40 {
    public final w950 a;

    /* compiled from: BannersTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SNIPPETS_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SMALL_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SMALL_SLIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public v36(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        ActionOpenUrl actionOpenUrl;
        String str = uIBlock.b;
        int i = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        w950 w950Var = this.a;
        if (i == 1) {
            w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            w950Var.M(str, null);
            return;
        }
        if (i == 2 || i == 3) {
            UIBlockActionTextButton uIBlockActionTextButton = obj instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) obj : null;
            if ((uIBlockActionTextButton != null ? uIBlockActionTextButton.d : null) == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
                w950Var.d(str);
                return;
            }
            w950Var.M(str, null);
            w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
            UIBlockAction uIBlockAction = uIBlockPlaceholder != null ? uIBlockPlaceholder.F : null;
            UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockAction instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlockAction : null;
            String str2 = (uIBlockActionOpenUrl == null || (actionOpenUrl = uIBlockActionOpenUrl.A) == null) ? null : actionOpenUrl.c;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            w950.p(w950Var, null, MobileOfficialAppsCoreNavStat$EventScreen.DIALOG_MODAL, str2, 1);
        }
    }
}
