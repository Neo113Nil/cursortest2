package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.clips.playlists.ui.picker.a;
import com.vk.common.links.LaunchContext;
import xsna.tba0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wad implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wad(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                xad xadVar = (xad) this.c;
                com.vk.movika.sdk.base.observable.q qVar = (com.vk.movika.sdk.base.observable.q) this.d;
                vnd0 vnd0Var = xadVar.u;
                if (vnd0Var != null) {
                    qVar.invoke(vnd0Var);
                    break;
                }
                break;
            case 1:
                ((wpe) this.c).l.invoke(new a.c.C0632a(((g0d) this.d).c));
                break;
            case 2:
                UIBlockLink uIBlockLink = (UIBlockLink) this.c;
                View view2 = (View) this.d;
                CatalogLink catalogLink = uIBlockLink.y;
                maz e = xwk.d().e();
                Context context = view2.getContext();
                String str = catalogLink.e;
                LaunchContext.a aVar = new LaunchContext.a();
                aVar.d = uIBlockLink.f;
                maz.c(e, context, str, aVar.a(), null, null, 24);
                break;
            case 3:
                ((izs) this.c).invoke(((tba0.b) ((bca0) this.d).m).a);
                break;
            default:
                j3n0 j3n0Var = (j3n0) this.c;
                k3n0 k3n0Var = (k3n0) this.d;
                j3n0Var.q = true;
                k3n0Var.a(view.getContext());
                j3n0Var.d();
                break;
        }
    }
}
