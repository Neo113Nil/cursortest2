package defpackage;

import android.view.View;
import com.squareup.moshi.Moshi;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.common.data.network.adapters.RawJsonStringAdapter;
import com.ybsdk.feature.divkit.internal.dto.DivKitCollapsingToolbarLayoutCustomPropsDto;
import com.ybsdk.feature.divkit.internal.dto.DivKitCollapsingToolbarLayoutCustomPropsDtoJsonAdapter;
import com.ybsdk.feature.divkit.internal.ui.YbDivKitCustomBlockTypes;
import com.ybsdk.feature.divkit.internal.ui.collapsingtoolbar.DivKitCollapsingToolbarLayoutView;
import java.util.List;
import kotlin.collections.a;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mlk implements qr51 {
    public final boolean a;
    public final DivKitCollapsingToolbarLayoutCustomPropsDtoJsonAdapter b = new DivKitCollapsingToolbarLayoutCustomPropsDtoJsonAdapter(new Moshi.Builder().add(RawJsonStringAdapter.a).build());
    public final YbDivKitCustomBlockTypes c = YbDivKitCustomBlockTypes.COLLAPSING_TOOLBAR_LAYOUT_TYPE;

    public mlk(boolean z) {
        this.a = z;
    }

    @Override // defpackage.qr51
    public final View a(clk clkVar, Div2View div2View, b bVar) {
        DivKitCollapsingToolbarLayoutView divKitCollapsingToolbarLayoutView = new DivKitCollapsingToolbarLayoutView(div2View.getContext(), null, 0, this.a, 6, null);
        nlk customContainerChildFactory$div_release = div2View.getCustomContainerChildFactory$div_release();
        List list = clkVar.q;
        if (list != null) {
            m3k m3kVar = (m3k) a.S(0, list);
            if (m3kVar != null) {
                divKitCollapsingToolbarLayoutView.setToolbarChild(nlk.b(customContainerChildFactory$div_release, m3kVar, bVar, div2View));
            }
            m3k m3kVar2 = (m3k) a.S(1, list);
            if (m3kVar2 != null) {
                divKitCollapsingToolbarLayoutView.setContentChild(nlk.b(customContainerChildFactory$div_release, m3kVar2, bVar, div2View));
            }
        }
        return divKitCollapsingToolbarLayoutView;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    @Override // defpackage.qr51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, clk clkVar, Div2View div2View, b bVar) {
        DivKitCollapsingToolbarLayoutCustomPropsDto fromJson;
        View toolbarChildView;
        View view2;
        Div2View div2View2;
        b bVar2;
        if (!(view instanceof DivKitCollapsingToolbarLayoutView)) {
            return;
        }
        JSONObject jSONObject = clkVar.i;
        if (jSONObject != null) {
            try {
                fromJson = this.b.fromJson(jSONObject.toString());
            } catch (Exception e) {
                x4c.g(oyr.p("Failed to parse DivKit customProps in \"", clkVar.j, "\""), e, null, null, 12);
            }
            if (fromJson != null) {
                return;
            }
            DivKitCollapsingToolbarLayoutView divKitCollapsingToolbarLayoutView = (DivKitCollapsingToolbarLayoutView) view;
            int toolbarCollapsedHeightDp = fromJson.getToolbarCollapsedHeightDp();
            Boolean isAnchored = fromJson.isAnchored();
            boolean booleanValue = isAnchored != null ? isAnchored.booleanValue() : true;
            Boolean isToolbarScrollEnabled = fromJson.isToolbarScrollEnabled();
            boolean booleanValue2 = isToolbarScrollEnabled != null ? isToolbarScrollEnabled.booleanValue() : true;
            Float parallaxMultiplier = fromJson.getParallaxMultiplier();
            divKitCollapsingToolbarLayoutView.render(new lxk(toolbarCollapsedHeightDp, parallaxMultiplier != null ? y6i0.c(parallaxMultiplier.floatValue(), 0.0f, 1.0f) : 0.5f, booleanValue, booleanValue2), div2View);
            nlk customContainerChildFactory$div_release = div2View.getCustomContainerChildFactory$div_release();
            List list = clkVar.q;
            if (list == null) {
                return;
            }
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                m3k m3kVar = (m3k) obj;
                if (i == 0) {
                    toolbarChildView = divKitCollapsingToolbarLayoutView.getToolbarChildView();
                } else if (i != 1) {
                    view2 = null;
                    if (view2 != null) {
                        div2View2 = div2View;
                        bVar2 = bVar;
                    } else {
                        rvo expressionResolver = div2View.getExpressionResolver();
                        customContainerChildFactory$div_release.getClass();
                        div2View2 = div2View;
                        bVar2 = bVar;
                        nlk.a(view2, i, m3kVar, bVar2, div2View2, expressionResolver);
                    }
                    i = i2;
                    bVar = bVar2;
                    div2View = div2View2;
                } else {
                    toolbarChildView = divKitCollapsingToolbarLayoutView.getContentChildView();
                }
                view2 = toolbarChildView;
                if (view2 != null) {
                }
                i = i2;
                bVar = bVar2;
                div2View = div2View2;
            }
            return;
        }
        fromJson = null;
        if (fromJson != null) {
        }
    }

    @Override // defpackage.qr51
    public final YbDivKitCustomBlockTypes getCustomType() {
        return this.c;
    }

    @Override // defpackage.qr51
    public final boolean isCustomTypeSupported(String str) {
        return xz91.b(this, str);
    }

    @Override // defpackage.qr51
    public final void release() {
    }
}
