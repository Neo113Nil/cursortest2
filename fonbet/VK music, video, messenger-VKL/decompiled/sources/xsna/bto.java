package xsna;

import com.vk.dzenarticle.impl.ui.entity.items.ArticleTextItem;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bto implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bto(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        us2 us2Var;
        androidx.compose.runtime.a aVar;
        switch (this.b) {
            case 0:
                vp3 vp3Var = (vp3) this.c;
                ArticleTextItem articleTextItem = (ArticleTextItem) this.d;
                cto ctoVar = (cto) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                aVar2.K(-215585973);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-215585973, intValue, -1, "com.vk.dzenarticle.impl.ui.store.DzenArticleViewStateMapper.createArticleTextViewItem.<anonymous> (DzenArticleViewStateMapper.kt:179)");
                }
                us2.b bVar = new us2.b();
                if (vp3Var == null) {
                    aVar2.K(531463990);
                    aVar2.j();
                    us2Var = null;
                } else {
                    aVar2.K(-675592661);
                    us2Var = (us2) vp3Var.b.invoke(aVar2, 0);
                    aVar2.j();
                }
                if (us2Var != null) {
                    bVar.h(us2Var);
                }
                StringBuilder sb = bVar.b;
                int length = sb.length();
                if (articleTextItem.k) {
                    bVar.g("• ");
                }
                bVar.g(articleTextItem.c);
                int length2 = sb.length();
                if (articleTextItem.i != null) {
                    aVar2.K(531751764);
                    aVar = aVar2;
                    ctoVar.c(bVar, articleTextItem.i, length, length2, false, aVar, 8, 8);
                    aVar.j();
                } else {
                    aVar = aVar2;
                    if (articleTextItem.f || articleTextItem.e || articleTextItem.g || articleTextItem.h || articleTextItem.d != null) {
                        aVar.K(531933331);
                        ctoVar.d(bVar, articleTextItem, length, length2, aVar, 8);
                    } else {
                        aVar.K(523352066);
                    }
                    aVar.j();
                }
                us2 n = bVar.n();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar.j();
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((qwo) this.c).m((fwo) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            default:
                ((Integer) obj2).getClass();
                j1p.a((EditStorefrontAlbumError) this.c, (gzs) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bto(vp3 vp3Var, ArticleTextItem articleTextItem, cto ctoVar) {
        this.b = 0;
        this.c = vp3Var;
        this.d = articleTextItem;
        this.e = ctoVar;
    }
}
