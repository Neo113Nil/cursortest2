package xsna;

import com.vk.dto.articles.Article;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import xsna.dz40;
import xsna.gfp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lo7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lo7(Article article, com.vk.sharing.core.a aVar, com.vk.sharing.core.view.l lVar, AttachmentInfo attachmentInfo) {
        this.b = 2;
        this.d = article;
        this.e = aVar;
        this.f = lVar;
        this.c = attachmentInfo;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                mo7.a((mtk0) this.d, (mtk0) this.e, (String) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                siy.b((gfp0.b) this.d, (dz40.c) this.e, (oiy) this.f, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                Article article = (Article) this.d;
                com.vk.sharing.core.a aVar = (com.vk.sharing.core.a) this.e;
                com.vk.sharing.core.view.l lVar = (com.vk.sharing.core.view.l) this.f;
                AttachmentInfo attachmentInfo = (AttachmentInfo) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                article.n = booleanValue;
                ActionsInfo d3 = aVar.f.d3();
                d3.h = booleanValue;
                lVar.ae(d3, attachmentInfo != null ? attachmentInfo.b : 0);
                lVar.setToggleFaveActionIsEnabled(true);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lo7(Object obj, Object obj2, Object obj3, izs izsVar, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = izsVar;
    }
}
