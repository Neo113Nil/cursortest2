package xsna;

import android.content.Context;
import com.yandex.div.internal.widget.tabs.TabTitlesLayoutView;
import java.util.List;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vpn implements TabTitlesLayoutView.OnScrollChangedListener, ub9.c, weq {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vpn(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        ((ugw) this.b).u.a(new mj1(aVar, 25), xo9.t());
        throw null;
    }

    @Override // xsna.weq
    public boolean c(String str, List list) {
        vul vulVar;
        pq50 pq50Var = (pq50) this.b;
        jr50 jr50Var = (jr50) this.c;
        if (!list.contains("vk") && !list.contains("lead_form") && !list.contains("vk_miniapp")) {
            return false;
        }
        gd60 a = hd60.a();
        Context context = pq50Var.itemView.getContext();
        wjz0 content = jr50Var.d().getContent();
        a.I0(context, (content == null || (vulVar = content.c) == null) ? null : (String) vulVar.c, str, list, pq50Var.getAbsoluteAdapterPosition());
        return true;
    }
}
