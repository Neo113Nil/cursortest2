package xsna;

import android.content.Context;
import com.vk.catalog2.common.dto.api.CatalogButton;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.news.CatalogNewsEntry;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FeedCatalogResponseTransformerPlugin.kt */
/* loaded from: classes16.dex */
public class mxq implements kda {
    public final dha b;
    public final Context c;
    public final com.vk.newsfeed.common.util.j d = new com.vk.newsfeed.common.util.j();

    /* compiled from: FeedCatalogResponseTransformerPlugin.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogDataType.values().length];
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_WALL_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogDataType.DATA_TYPE_SEARCH_NEWSFEED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mxq(dha dhaVar, Context context) {
        this.b = dhaVar;
        this.c = context;
    }

    @Override // xsna.r1i0
    public final gzs c(CatalogBlock catalogBlock, List list, ArrayList arrayList, bi20 bi20Var) {
        return null;
    }

    @Override // xsna.ep8
    public final UIBlockAction d(CatalogButton catalogButton, bi20 bi20Var, CatalogExtendedData catalogExtendedData) {
        return null;
    }

    @Override // xsna.xe7
    public final List f(CatalogBlock catalogBlock, CatalogExtendedData catalogExtendedData, bi20 bi20Var, List list, oq8 oq8Var) {
        int i = a.$EnumSwitchMapping$0[catalogBlock.c.ordinal()];
        if (i == 1 || i == 2) {
            return rli0.A(rli0.p(rli0.k(new i5g(catalogBlock.Gb(catalogExtendedData)), CatalogNewsEntry.class), new defpackage.m(16, this, bi20Var)));
        }
        return null;
    }
}
