package xsna;

import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Keys;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionProfileVideoButton;
import com.vk.dto.common.id.UserId;

/* compiled from: VideoButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class j7s0 {
    public static final UIBlockActionProfileVideoButton a(bi20 bi20Var, CatalogViewType catalogViewType, UserId userId, String str, String str2) {
        return new UIBlockActionProfileVideoButton(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, catalogViewType, bi20Var.c, bi20Var.k, userId, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7680), str2, str, bi20Var.p.getString(CatalogCustomAttributes$Keys.STYLE.h()));
    }
}
