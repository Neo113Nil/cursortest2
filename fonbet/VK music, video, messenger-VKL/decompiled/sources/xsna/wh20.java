package xsna;

import android.os.Bundle;
import com.vk.api.generated.catalog.dto.CatalogBlockMetaDto;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.Meta;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.layout.CatalogLayout;
import com.vk.catalog2.common.dto.api.layout.TopTitle;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.dto.common.id.UserId;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: MetaBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class wh20 {
    public static final bi20 a(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, nq8 nq8Var) {
        CatalogBlockMetaDto.ContextDto contextDto;
        String str = catalogBlock.b;
        String str2 = catalogBlock.e;
        CatalogDataType catalogDataType = catalogBlock.c;
        CatalogLayout catalogLayout = catalogBlock.i;
        CatalogViewType catalogViewType = catalogLayout.b;
        UserId userId = catalogLayout.c;
        String str3 = catalogLayout.d;
        String str4 = catalogLayout.e;
        TopTitle topTitle = catalogLayout.f;
        String str5 = catalogLayout.j;
        List<String> list = catalogBlock.l;
        String str6 = catalogBlock.d;
        EmptyList emptyList = EmptyList.b;
        EmptySet emptySet = EmptySet.b;
        String str7 = catalogBlock.f;
        Bundle bundle = catalogLayout.h;
        Meta meta = catalogBlock.p;
        String str8 = meta != null ? meta.e : null;
        CatalogOnboardingInfo catalogOnboardingInfo = meta != null ? meta.f : null;
        ShowAllInfo showAllInfo = meta != null ? meta.g : null;
        String str9 = meta != null ? meta.j : null;
        CatalogLaunchOrigin.a aVar = CatalogLaunchOrigin.Companion;
        String i = (meta == null || (contextDto = meta.i) == null) ? null : contextDto.i();
        if (i == null) {
            i = "";
        }
        aVar.getClass();
        CatalogLaunchOrigin catalogLaunchOrigin = CatalogLaunchOrigin.KIDS_SECTION;
        if (!i.equals(catalogLaunchOrigin.h())) {
            catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
        }
        bi20 bi20Var = new bi20(str, str2, catalogDataType, catalogViewType, userId, str3, str4, topTitle, str5, list, str6, emptyList, emptySet, str7, bundle, str8, catalogOnboardingInfo, showAllInfo, null, catalogLaunchOrigin, str9, null, false, 27262976);
        Pair<List<UIBlockAction>, Set<UIBlockDragDropAction>> a = hu.a(nq8Var.a(catalogExtendedData, catalogBlock.j, bi20Var));
        List<UIBlockAction> d = a.d();
        Set<UIBlockDragDropAction> g = a.g();
        CatalogHint Cb = catalogExtendedData.Cb(catalogBlock.n);
        return bi20.a(bi20Var, null, null, d, g, Cb != null ? new UIBlockHint(str, catalogViewType, catalogDataType, str6, userId, list, emptySet, Cb.b, Cb.c, Cb.d, Cb.e, Cb.f, nq8Var.a(catalogExtendedData, Cb.g, bi20Var), Cb.h) : null, null, 33531903);
    }
}
