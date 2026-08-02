package xsna;

import android.content.Context;
import com.vk.fave.entities.FaveCategory;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.fragments.FavesFragment;

/* compiled from: FaveRouterImpl.kt */
/* loaded from: classes18.dex */
public final class wrq implements vrq {
    @Override // xsna.vrq
    public final void a(Context context) {
        FavesFragment.a aVar = new FavesFragment.a();
        aVar.y(FaveCategory.PRODUCT, FaveSource.MENU);
        aVar.k(context);
    }
}
