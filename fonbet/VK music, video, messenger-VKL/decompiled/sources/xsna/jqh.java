package xsna;

import com.vk.core.compose.component.group.footer.GroupFooter;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jqh implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jqh(GroupFooter groupFooter, q630 q630Var, int i, int i2) {
        this.b = 6;
        this.e = groupFooter;
        this.c = q630Var;
        this.d = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                pqh.b((wqh) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                izs izsVar = (izs) this.c;
                q630 q630Var = (q630) this.e;
                ((Integer) obj2).getClass();
                a5q.a(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, izsVar, q630Var);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((GroupHeader$Right.b.C0747b) this.e).a((com.vk.core.compose.component.group.header.b) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.ecomm.design.compose.gallery.a.e((ProductGalleryItem.a.b) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.b.b((com.vk.catalog.mvi.block.video.impl.movies.detail.ratings.a) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                x8u0.b((b78.a) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                fxu0.a((GroupFooter) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1), this.d);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jqh(GroupHeader$Right.b.C0747b c0747b, com.vk.core.compose.component.group.header.b bVar, int i) {
        this.b = 2;
        this.e = c0747b;
        this.c = bVar;
        this.d = i;
    }

    public /* synthetic */ jqh(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.d = i;
    }

    public /* synthetic */ jqh(izs izsVar, q630 q630Var, int i) {
        this.b = 1;
        this.c = izsVar;
        this.e = q630Var;
        this.d = i;
    }
}
