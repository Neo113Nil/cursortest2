package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSearchSuggestion;
import com.vk.dto.music.SearchSuggestion;

/* compiled from: SearchSuggestionTapsHandler.kt */
/* loaded from: classes16.dex */
public final class hzh0 implements ud40 {
    public final w950 a;
    public final gzs<String> b;

    /* compiled from: SearchSuggestionTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hzh0(w950 w950Var, gzs<String> gzsVar) {
        this.a = w950Var;
        this.b = gzsVar;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        SearchSuggestion searchSuggestion;
        UIBlockSearchSuggestion uIBlockSearchSuggestion = uIBlock instanceof UIBlockSearchSuggestion ? (UIBlockSearchSuggestion) uIBlock : null;
        if (uIBlockSearchSuggestion == null || (searchSuggestion = uIBlockSearchSuggestion.y) == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        if (i == 1 || i == 2) {
            boolean f = epx.f(uIBlock.b, "local_block_id");
            gzs<String> gzsVar = this.b;
            w950 w950Var = this.a;
            if (f) {
                String invoke = gzsVar.invoke();
                w950Var.r(invoke != null ? invoke : "");
            } else if (brm0.B(searchSuggestion.k, "search", false)) {
                String invoke2 = gzsVar.invoke();
                w950Var.D(invoke2 != null ? invoke2 : "", false);
            } else {
                String invoke3 = gzsVar.invoke();
                w950Var.D(invoke3 != null ? invoke3 : "", true);
            }
        }
    }
}
