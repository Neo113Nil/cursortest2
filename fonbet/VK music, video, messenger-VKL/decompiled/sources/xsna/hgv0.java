package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.user.WebUserShortInfo;

/* compiled from: VkRestoreSearchAdapter.kt */
/* loaded from: classes5.dex */
public final class hgv0 extends zoj0<WebUserShortInfo, mgv0> {
    public final o99 e;

    public hgv0(o99 o99Var) {
        this.e = o99Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        mgv0 mgv0Var = (mgv0) e0Var;
        WebUserShortInfo webUserShortInfo = (WebUserShortInfo) this.c.c(i);
        TextView textView = mgv0Var.m;
        mgv0Var.q = webUserShortInfo;
        mgv0Var.l.setText(webUserShortInfo.d());
        String str = webUserShortInfo.i;
        if (str == null || str.length() == 0) {
            f4m.j(textView);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        WebImageSize e = webUserShortInfo.h.e(mgv0Var.o);
        mgv0Var.n.f(e != null ? e.b : null, mgv0Var.p);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new mgv0(viewGroup, this.e);
    }
}
