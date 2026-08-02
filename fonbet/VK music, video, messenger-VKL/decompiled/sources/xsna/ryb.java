package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import xsna.azb;
import xsna.yyb;

/* compiled from: ChatSettingsAdapter.kt */
/* loaded from: classes2.dex */
public final class ryb extends sxm {
    public final azb.a i;
    public Dialog j = new Dialog();
    public ProfilesInfo k = new ProfilesInfo();
    public String l;

    public ryb(azb.a aVar) {
        this.i = aVar;
        x0(yyb.b.class, new mz(this, 23));
        x0(yyb.g.class, new w8(this, 18));
        x0(yyb.h.class, new e5(this, 21));
        x0(yyb.c.class, new com.vk.movika.sdk.base.observable.w(this, 20));
        x0(yyb.e.class, new pz(this, 13));
        x0(yyb.f.class, new ec(this, 23));
        setHasStableIds(true);
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: F0 */
    public final void onViewDetachedFromWindow(vfz<hfz> vfzVar) {
        if (vfzVar.getClass().equals(nrr0.class)) {
            mhy.d(vfzVar.itemView.findFocus());
        }
    }
}
