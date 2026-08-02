package xsna;

import android.os.Bundle;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.hint.CatalogHint;
import com.vk.catalog2.common.dto.api.section.CatalogHeaderStyle;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.section.CatalogSectionStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.api.ui.action.dragndrop.UIBlockDragDropAction;
import com.vk.catalog2.common.dto.style.CatalogTabStyle;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AbstractCatalogResponseTransformer.kt */
/* loaded from: classes16.dex */
public abstract class xc implements jda, kda {
    public final oq8 b = new oq8(new a());

    /* compiled from: AbstractCatalogResponseTransformer.kt */
    public static final /* synthetic */ class a implements ep8, g0t {
        public a() {
        }

        @Override // xsna.ep8
        public final UIBlockAction d(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
            return ((wfb0) xc.this).d(catalogButton, bi20Var, catalogExtendedData);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ep8) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(3, xc.this, xc.class, "transformCatalogButton", "transformCatalogButton(Lcom/vk/catalog2/common/dto/api/CatalogButton;Lcom/vk/catalog2/common/ui/holders/configuration/transformer/base/MetaInfo;Lcom/vk/catalog2/common/dto/api/CatalogExtendedData;)Lcom/vk/catalog2/common/dto/api/ui/action/UIBlockAction;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0109, code lost:
    
        if (r13 == null) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    @Override // xsna.jda
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<UIBlock> b(Object obj, CatalogExtendedData catalogExtendedData, boolean z, boolean z2) {
        UIBlockList a2;
        UIBlockList a3;
        CatalogExtendedData catalogExtendedData2;
        bi20 bi20Var;
        CatalogHeaderStyle.TitleGradient titleGradient;
        if (obj instanceof CatalogSection) {
            return Collections.singletonList(h((CatalogSection) obj, catalogExtendedData));
        }
        boolean z3 = obj instanceof CatalogCatalog;
        oq8 oq8Var = this.b;
        if (!z3) {
            if (!(obj instanceof CatalogBlock)) {
                if (!BuildInfo.h()) {
                    return EmptyList.b;
                }
                StringBuilder sb = new StringBuilder("Unknown type<");
                String canonicalName = obj.getClass().getCanonicalName();
                throw new IllegalArgumentException(i5s.a(sb, canonicalName != null ? canonicalName.toString() : null, "> to transform!"));
            }
            CatalogBlock catalogBlock = (CatalogBlock) obj;
            bi20 a4 = wh20.a(catalogBlock, catalogExtendedData, oq8Var);
            EmptyList emptyList = EmptyList.b;
            ?? f = ((wfb0) this).f(catalogBlock, catalogExtendedData, a4, emptyList, oq8Var);
            if (f != 0) {
                emptyList = f;
            }
            return (z2 && catalogBlock.i.b.j()) ? Collections.singletonList(bez.a(emptyList, a4)) : emptyList;
        }
        CatalogCatalog catalogCatalog = (CatalogCatalog) obj;
        List<CatalogSection> list = catalogCatalog.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((CatalogSection) it.next(), catalogExtendedData));
        }
        CatalogSection catalogSection = catalogCatalog.e;
        if (catalogSection != null) {
            UIBlock h = h(catalogSection, catalogExtendedData);
            a2 = h instanceof UIBlockList ? (UIBlockList) h : null;
        }
        Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
        a2 = UIBlockList.a.a();
        UIBlockList uIBlockList = a2;
        CatalogSection catalogSection2 = catalogCatalog.d;
        if (catalogSection2 != null) {
            UIBlock h2 = h(catalogSection2, catalogExtendedData);
            if (h2 instanceof UIBlockList) {
                bi20 g = g(catalogSection2, CatalogDataType.DATA_SYNTHETIC_SECTION, CatalogViewType.LIST, catalogExtendedData, UserId.d);
                CatalogBadge catalogBadge = catalogSection2.g;
                UIBlockBadge a5 = catalogBadge != null ? n670.a(g, catalogBadge) : null;
                CatalogHeaderStyle catalogHeaderStyle = catalogSection2.m;
                UIBlockList uIBlockList2 = (UIBlockList) h2;
                a3 = new UIBlockList(h2.b, CatalogViewType.SYNTHETIC_HEADER_SECTION, CatalogDataType.DATA_TYPE_STICKERS_BANNERS, h2.f, h2.g, h2.h, h2.Db(), h2.j, h2.m, uIBlockList2.z, uIBlockList2.y, catalogSection2.e, uIBlockList2.B, uIBlockList2.C, uIBlockList2.D, uIBlockList2.I, uIBlockList2.E, uIBlockList2.F, uIBlockList2.G, a5, uIBlockList2.J, (catalogHeaderStyle == null || (titleGradient = catalogHeaderStyle.b) == null) ? null : new CatalogTabStyle.Gradient(titleGradient.b, titleGradient.c, titleGradient.d, titleGradient.e), false, null, null, false, null, h2.p, null, null, 935329792, null);
            } else {
                a3 = null;
            }
        }
        Serializer.c<UIBlockList> cVar2 = UIBlockList.CREATOR;
        a3 = UIBlockList.a.a();
        UIBlockList uIBlockList3 = a3;
        CatalogSection Ab = catalogCatalog.Ab();
        if (Ab != null) {
            catalogExtendedData2 = catalogExtendedData;
            bi20Var = g(Ab, CatalogDataType.DATA_SYNTHETIC_SECTION, CatalogViewType.LIST, catalogExtendedData2, UserId.d);
        } else {
            catalogExtendedData2 = catalogExtendedData;
            bi20Var = null;
        }
        return Collections.singletonList(new UIBlockCatalog(uIBlockList3, uIBlockList, arrayList, catalogCatalog.f, catalogCatalog.c, null, null, catalogCatalog.h, bi20Var == null ? EmptyList.b : oq8Var.a(catalogExtendedData2, catalogCatalog.g, bi20Var), 96, null));
    }

    public final bi20 g(CatalogSection catalogSection, CatalogDataType catalogDataType, CatalogViewType catalogViewType, CatalogExtendedData catalogExtendedData, UserId userId) {
        String str = catalogSection.b;
        bi20 bi20Var = new bi20(str, str, catalogDataType, catalogViewType, userId, catalogSection.d, "", null, null, catalogSection.h, str, EmptyList.b, EmptySet.b, catalogSection.e, Bundle.EMPTY, null, null, null, catalogSection.f, null, null, null, false, 32899072);
        List<CatalogButton> list = catalogSection.j;
        oq8 oq8Var = this.b;
        Pair<List<UIBlockAction>, Set<UIBlockDragDropAction>> a2 = hu.a(oq8Var.a(catalogExtendedData, list, bi20Var));
        List<UIBlockAction> d = a2.d();
        Set<UIBlockDragDropAction> g = a2.g();
        CatalogHint catalogHint = catalogSection.k;
        return bi20.a(bi20Var, null, null, d, g, catalogHint != null ? fo50.K(bi20Var, catalogHint, catalogExtendedData, oq8Var) : null, null, 33531903);
    }

    public UIBlock h(CatalogSection catalogSection, CatalogExtendedData catalogExtendedData) {
        CatalogHeaderStyle.TitleGradient titleGradient;
        CatalogSectionStyle catalogSectionStyle = catalogSection.l;
        ArrayList arrayList = new ArrayList();
        for (CatalogBlock catalogBlock : catalogSection.i) {
            oq8 oq8Var = this.b;
            wfb0 wfb0Var = (wfb0) this;
            List f = wfb0Var.f(catalogBlock, catalogExtendedData, wh20.a(catalogBlock, catalogExtendedData, oq8Var), catalogSection.i, oq8Var);
            if (f == null) {
                f = EmptyList.b;
            }
            gzs c = wfb0Var.c(catalogBlock, f, arrayList, wh20.a(catalogBlock, catalogExtendedData, oq8Var));
            if (c != null) {
                c.invoke();
            }
        }
        bi20 g = g(catalogSection, CatalogDataType.DATA_SYNTHETIC_SECTION, CatalogViewType.LIST, catalogExtendedData, UserId.d);
        CatalogBadge catalogBadge = catalogSection.g;
        CatalogTabStyle.Gradient gradient = null;
        UIBlockBadge a2 = catalogBadge != null ? n670.a(g, catalogBadge) : null;
        List<UIBlockAction> list = g.l;
        boolean z = catalogSectionStyle != null ? catalogSectionStyle.b : false;
        CatalogHeaderStyle catalogHeaderStyle = catalogSection.m;
        if (catalogHeaderStyle != null && (titleGradient = catalogHeaderStyle.b) != null) {
            gradient = new CatalogTabStyle.Gradient(titleGradient.b, titleGradient.c, titleGradient.d, titleGradient.e);
        }
        return bez.b(g, arrayList, list, a2, null, null, null, z, gradient, catalogSectionStyle != null ? catalogSectionStyle.c : false, null, 294896);
    }
}
