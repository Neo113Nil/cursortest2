package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.holders.MusicKidsAgeCategoryVh;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class s1h implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s1h(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ynh ynhVar = (ynh) this.c;
                ynhVar.f().a((Context) this.d, ((ExtendedUserProfile.Link) this.e).b);
                break;
            default:
                UIBlockLink uIBlockLink = (UIBlockLink) this.c;
                MusicKidsAgeCategoryVh musicKidsAgeCategoryVh = (MusicKidsAgeCategoryVh) this.d;
                View view2 = (View) this.e;
                CatalogLink catalogLink = uIBlockLink.y;
                if (catalogLink != null) {
                    maz.c(((qdz) musicKidsAgeCategoryVh.b.getValue()).e(), view2.getContext(), catalogLink.e, LaunchContext.A, null, null, 24);
                    break;
                }
                break;
        }
    }
}
