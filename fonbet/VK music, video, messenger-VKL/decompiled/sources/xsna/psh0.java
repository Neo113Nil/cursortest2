package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.feature.news.model.UIBlockFeed;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Digest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: SearchFeedCatalogResponseTransformerPlugin.kt */
/* loaded from: classes16.dex */
public final class psh0 extends mxq {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0064  */
    @Override // xsna.u1i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UIBlock e(CatalogSection catalogSection, UIBlock uIBlock, CatalogExtendedData catalogExtendedData) {
        ArrayList<UIBlock> arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        u1c0 u1c0Var;
        ArrayList<UIBlock> arrayList2;
        boolean z5 = uIBlock instanceof UIBlockList;
        UIBlockList uIBlockList = z5 ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null || (arrayList = uIBlockList.y) == null) {
            return uIBlock;
        }
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            UIBlock uIBlock2 = (UIBlock) obj;
            UIBlockList uIBlockList2 = z5 ? (UIBlockList) uIBlock : null;
            UIBlock uIBlock3 = (uIBlockList2 == null || (arrayList2 = uIBlockList2.y) == null) ? null : (UIBlock) j5g.b0(i - 1, arrayList2);
            if (uIBlock3 instanceof UIBlockFeed) {
                u1c0 u1c0Var2 = ((UIBlockFeed) uIBlock3).y;
                if (!(u1c0Var2.a instanceof Digest) && !(u1c0Var2.b instanceof Digest)) {
                    z = true;
                    z2 = uIBlock2 instanceof UIBlockFeed;
                    UIBlockFeed uIBlockFeed = !z2 ? (UIBlockFeed) uIBlock2 : null;
                    Integer valueOf = (uIBlockFeed != null || (u1c0Var = uIBlockFeed.y) == null) ? null : Integer.valueOf(u1c0Var.d);
                    if (z2) {
                        u1c0 u1c0Var3 = ((UIBlockFeed) uIBlock2).y;
                        if (!(u1c0Var3.a instanceof Digest) && !(u1c0Var3.b instanceof Digest)) {
                            z3 = true;
                            boolean z6 = !(z || z3) || (!z && z3);
                            if (z && z3) {
                                if (((valueOf == null ? valueOf.intValue() : 0) & 2) > 0) {
                                    z4 = true;
                                    g5g.y((i == 0 && (z6 || z4)) ? e43.l(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a(UUID.randomUUID().toString(), uIBlock2.c, CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND, CatalogDataType.DATA_TYPE_NONE, "", UserId.d, EmptyList.b, EmptySet.b, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), null, 2, null), uIBlock2) : Collections.singletonList(uIBlock2), arrayList3);
                                    i = i2;
                                }
                            }
                            z4 = false;
                            g5g.y((i == 0 && (z6 || z4)) ? e43.l(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a(UUID.randomUUID().toString(), uIBlock2.c, CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND, CatalogDataType.DATA_TYPE_NONE, "", UserId.d, EmptyList.b, EmptySet.b, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), null, 2, null), uIBlock2) : Collections.singletonList(uIBlock2), arrayList3);
                            i = i2;
                        }
                    }
                    z3 = false;
                    if (z) {
                    }
                    if (z) {
                        if (((valueOf == null ? valueOf.intValue() : 0) & 2) > 0) {
                        }
                    }
                    z4 = false;
                    g5g.y((i == 0 && (z6 || z4)) ? e43.l(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a(UUID.randomUUID().toString(), uIBlock2.c, CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND, CatalogDataType.DATA_TYPE_NONE, "", UserId.d, EmptyList.b, EmptySet.b, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), null, 2, null), uIBlock2) : Collections.singletonList(uIBlock2), arrayList3);
                    i = i2;
                }
            }
            z = false;
            z2 = uIBlock2 instanceof UIBlockFeed;
            if (!z2) {
            }
            if (uIBlockFeed != null) {
            }
            if (z2) {
            }
            z3 = false;
            if (z) {
            }
            if (z) {
            }
            z4 = false;
            g5g.y((i == 0 && (z6 || z4)) ? e43.l(new UIBlockSeparator(new com.vk.catalog2.common.dto.api.ui.a(UUID.randomUUID().toString(), uIBlock2.c, CatalogViewType.SYNTHETIC_SEPARATOR_ISLAND, CatalogDataType.DATA_TYPE_NONE, "", UserId.d, EmptyList.b, EmptySet.b, (UIBlockHint) null, (CatalogViewStyle) null, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7936), null, 2, null), uIBlock2) : Collections.singletonList(uIBlock2), arrayList3);
            i = i2;
        }
        return new UIBlockList((UIBlockList) uIBlock, arrayList3);
    }
}
