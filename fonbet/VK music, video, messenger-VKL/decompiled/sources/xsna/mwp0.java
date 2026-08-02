package xsna;

import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionClearRecent;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionShowFilters;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;

/* compiled from: UIBlockHeader.kt */
/* loaded from: classes16.dex */
public final class mwp0 {
    public final UIBlockBadge a;
    public final UIBlockActionShowFilters b;
    public final UIBlockActionOpenSection c;
    public final UIBlockActionSwitchSection d;
    public final UIBlockActionOpenSearchTab e;
    public final UIBlockActionClearRecent f;
    public final UIBlockActionOpenScreen g;
    public final UIBlockActionOpenUrl h;
    public final UIBlockHideBlockButton i;
    public final UIBlockAction j;

    public mwp0(UIBlockBadge uIBlockBadge, UIBlockActionShowFilters uIBlockActionShowFilters, UIBlockActionOpenSection uIBlockActionOpenSection, UIBlockActionSwitchSection uIBlockActionSwitchSection, UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab, UIBlockActionClearRecent uIBlockActionClearRecent, UIBlockActionOpenScreen uIBlockActionOpenScreen, UIBlockActionOpenUrl uIBlockActionOpenUrl, UIBlockHideBlockButton uIBlockHideBlockButton, UIBlockAction uIBlockAction) {
        this.a = uIBlockBadge;
        this.b = uIBlockActionShowFilters;
        this.c = uIBlockActionOpenSection;
        this.d = uIBlockActionSwitchSection;
        this.e = uIBlockActionOpenSearchTab;
        this.f = uIBlockActionClearRecent;
        this.g = uIBlockActionOpenScreen;
        this.h = uIBlockActionOpenUrl;
        this.i = uIBlockHideBlockButton;
        this.j = uIBlockAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwp0)) {
            return false;
        }
        mwp0 mwp0Var = (mwp0) obj;
        return epx.f(this.a, mwp0Var.a) && epx.f(this.b, mwp0Var.b) && epx.f(this.c, mwp0Var.c) && epx.f(this.d, mwp0Var.d) && epx.f(this.e, mwp0Var.e) && epx.f(this.f, mwp0Var.f) && epx.f(this.g, mwp0Var.g) && epx.f(this.h, mwp0Var.h) && epx.f(this.i, mwp0Var.i) && epx.f(this.j, mwp0Var.j);
    }

    public final int hashCode() {
        UIBlockBadge uIBlockBadge = this.a;
        int hashCode = (uIBlockBadge == null ? 0 : uIBlockBadge.hashCode()) * 31;
        UIBlockActionShowFilters uIBlockActionShowFilters = this.b;
        int hashCode2 = (hashCode + (uIBlockActionShowFilters == null ? 0 : uIBlockActionShowFilters.hashCode())) * 31;
        UIBlockActionOpenSection uIBlockActionOpenSection = this.c;
        int hashCode3 = (hashCode2 + (uIBlockActionOpenSection == null ? 0 : uIBlockActionOpenSection.hashCode())) * 31;
        UIBlockActionSwitchSection uIBlockActionSwitchSection = this.d;
        int hashCode4 = (hashCode3 + (uIBlockActionSwitchSection == null ? 0 : uIBlockActionSwitchSection.hashCode())) * 31;
        UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = this.e;
        int hashCode5 = (hashCode4 + (uIBlockActionOpenSearchTab == null ? 0 : uIBlockActionOpenSearchTab.hashCode())) * 31;
        UIBlockActionClearRecent uIBlockActionClearRecent = this.f;
        int hashCode6 = (hashCode5 + (uIBlockActionClearRecent == null ? 0 : uIBlockActionClearRecent.hashCode())) * 31;
        UIBlockActionOpenScreen uIBlockActionOpenScreen = this.g;
        int hashCode7 = (hashCode6 + (uIBlockActionOpenScreen == null ? 0 : uIBlockActionOpenScreen.hashCode())) * 31;
        UIBlockActionOpenUrl uIBlockActionOpenUrl = this.h;
        int hashCode8 = (hashCode7 + (uIBlockActionOpenUrl == null ? 0 : uIBlockActionOpenUrl.hashCode())) * 31;
        UIBlockHideBlockButton uIBlockHideBlockButton = this.i;
        int hashCode9 = (hashCode8 + (uIBlockHideBlockButton == null ? 0 : uIBlockHideBlockButton.hashCode())) * 31;
        UIBlockAction uIBlockAction = this.j;
        return hashCode9 + (uIBlockAction != null ? uIBlockAction.hashCode() : 0);
    }

    public final String toString() {
        return "UIBlockHeaderBlocks(badgeBlock=" + this.a + ", buttonShowFilters=" + this.b + ", buttonShowAll=" + this.c + ", buttonSwitchSection=" + this.d + ", buttonOpenSearchTab=" + this.e + ", buttonClearRecent=" + this.f + ", buttonOpenScreen=" + this.g + ", buttonOpenUrl=" + this.h + ", buttonHideBlock=" + this.i + ", blockButton=" + this.j + ')';
    }
}
