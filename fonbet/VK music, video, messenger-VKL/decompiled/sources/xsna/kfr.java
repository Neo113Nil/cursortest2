package xsna;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImageSimple;

/* compiled from: FiltersAdapter.kt */
/* loaded from: classes18.dex */
public final class kfr extends zoj0<tcr, cdr> {
    public final r9k e;
    public final fgh f;

    public kfr(r9k r9kVar, fgh fghVar) {
        this.e = r9kVar;
        this.f = fghVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        cdr cdrVar = (cdr) e0Var;
        tcr tcrVar = (tcr) this.c.c(i);
        VkImageSimple vkImageSimple = cdrVar.m;
        vkImageSimple.setContentDescription(tcrVar.c);
        Bitmap bitmap = tcrVar.b;
        if (!epx.f(cdrVar.q, bitmap)) {
            cdrVar.q = bitmap;
            vkImageSimple.setImageBitmap(bitmap);
        }
        float f = tcrVar.f;
        if (cdrVar.r != f) {
            cdrVar.r = f;
            cdrVar.n.setText(String.valueOf((int) Math.floor(f * 100)));
        }
        boolean z = tcrVar.e;
        if (cdrVar.s != z) {
            cdrVar.s = z;
            if (z) {
                d3m.c(cdrVar.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                d3m.c(cdrVar.n, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                d3m.e(cdrVar.o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                d3m.e(cdrVar.n, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new cdr(viewGroup, this.e);
    }
}
