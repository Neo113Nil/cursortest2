package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog2.common.dto.api.CatalogText;
import com.vk.catalog2.common.dto.ui.UIBlockArticle;
import com.vk.catalog2.common.dto.ui.UIBlockText;
import com.vk.dto.articles.Article;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gg10 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ bi20 c;

    public /* synthetic */ gg10(bi20 bi20Var, int i) {
        this.b = i;
        this.c = bi20Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Article article = (Article) obj;
                bi20 bi20Var = this.c;
                return new UIBlockArticle(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, article);
            default:
                CatalogText catalogText = (CatalogText) obj;
                bi20 bi20Var2 = this.c;
                return new UIBlockText(bi20Var2.a, bi20Var2.d, bi20Var2.c, bi20Var2.k, bi20Var2.e, bi20Var2.j, bi20Var2.m, bi20Var2.o, bi20Var2.p.getString(TtmlNode.TAG_STYLE), catalogText.b, catalogText.c, catalogText.d, catalogText.e);
        }
    }
}
