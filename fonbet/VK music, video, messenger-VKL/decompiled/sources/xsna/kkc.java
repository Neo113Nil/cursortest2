package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.holders.MusicKidsCatalogVh;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.clickable.ClickablePackSticker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class kkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kkc(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickablePackSticker clickablePackSticker = (ClickablePackSticker) this.d;
                UserId userId = (UserId) this.e;
                qkcVar.m(clickablePackSticker);
                zal0 a = g2v.d().a();
                Context h = e3m.h(view.getContext());
                if (h == null) {
                    h = view.getContext();
                }
                a.t(h, clickablePackSticker.f, userId, clickablePackSticker.g, "STORY_VIEWER");
                break;
            case 1:
                Context context = (Context) this.c;
                Intent intent = (Intent) this.d;
                dw20 dw20Var = (dw20) this.e;
                context.startActivity(intent);
                dw20Var.dismiss();
                break;
            default:
                UIBlockLink uIBlockLink = (UIBlockLink) this.c;
                MusicKidsCatalogVh musicKidsCatalogVh = (MusicKidsCatalogVh) this.d;
                View view2 = (View) this.e;
                CatalogLink catalogLink = uIBlockLink.y;
                if (catalogLink != null) {
                    maz.c(((qdz) musicKidsCatalogVh.d.getValue()).e(), view2.getContext(), catalogLink.e, LaunchContext.A, null, null, 24);
                    break;
                }
                break;
        }
    }
}
