package xsna;

import android.view.View;
import com.vk.ecomm.catalog.impl.catalog.root.AnimSearchQueryButtonWrapperVH;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vkontakte.android.R;

/* compiled from: ClassifiedsCatalogAppBarButtonsHolder.kt */
/* loaded from: classes18.dex */
public final class xfc {
    public final ClassifiedsCatalogRootVh.a a;
    public final qt00 b;
    public final qt00 c;
    public final s190 d;

    public xfc(AnimSearchQueryButtonWrapperVH animSearchQueryButtonWrapperVH, ClassifiedsCatalogRootVh.a aVar) {
        this.a = aVar;
        View view = animSearchQueryButtonWrapperVH.e;
        this.b = new qt00(R.drawable.vk_icon_bookmark_outline_28, R.string.classifieds_catalog_menu_bookmarks, view == null ? null : view, new g20(this, 22));
        View view2 = animSearchQueryButtonWrapperVH.c;
        this.c = new qt00(R.drawable.vk_icon_shopping_cart_outline_28, R.string.classifieds_carts, view2 == null ? null : view2, new jm0(this, 11));
        View view3 = animSearchQueryButtonWrapperVH.d;
        this.d = new s190(view3 != null ? view3 : null, new sa(this, 23));
    }
}
