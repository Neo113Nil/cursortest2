package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.holders.MusicKidsCollectionVh;
import com.vk.common.links.LaunchContext;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nz00 implements View.OnClickListener {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nz00(UIBlockLink uIBlockLink, MusicKidsCollectionVh musicKidsCollectionVh, View view) {
        this.c = uIBlockLink;
        this.d = musicKidsCollectionVh;
        this.e = view;
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                Context context = (Context) this.c;
                String str = (String) this.d;
                dw20 dw20Var = (dw20) this.e;
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
                dw20Var.dismiss();
                ikv0.a aVar = new ikv0.a(context);
                aVar.u = new ikv0.d(context.getString(R.string.phone_copied), (String) null, (ikv0.d.a) null, 6);
                aVar.e = 4000L;
                aVar.n();
                break;
            default:
                UIBlockLink uIBlockLink = (UIBlockLink) this.c;
                MusicKidsCollectionVh musicKidsCollectionVh = (MusicKidsCollectionVh) this.d;
                View view2 = (View) this.e;
                CatalogLink catalogLink = uIBlockLink.y;
                if (catalogLink != null) {
                    LaunchContext.a aVar2 = new LaunchContext.a();
                    aVar2.e = uIBlockLink.p.h();
                    aVar2.d = uIBlockLink.f;
                    maz.c(((qdz) musicKidsCollectionVh.c.getValue()).e(), view2.getContext(), catalogLink.e, aVar2.a(), null, null, 24);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ nz00(oz00 oz00Var, Context context, String str, dw20 dw20Var) {
        this.c = context;
        this.d = str;
        this.e = dw20Var;
    }
}
