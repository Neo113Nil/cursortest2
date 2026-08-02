package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ClipsTemplateEditorCropperItemsViewPagerAdapter.kt */
/* loaded from: classes16.dex */
public final class y6f extends RecyclerView.Adapter<RecyclerView.e0> {
    public final z6f c;
    public List<u6f> d = EmptyList.b;

    public y6f(z6f z6fVar) {
        this.c = z6fVar;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.d.get(i).c.a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        r6f r6fVar;
        f6f a;
        u6f u6fVar = this.d.get(i);
        x6f x6fVar = e0Var instanceof x6f ? (x6f) e0Var : null;
        if (x6fVar != null) {
            se9 se9Var = x6fVar.l.b;
            w6f w6fVar = (w6f) se9Var.a;
            n7f n7fVar = u6fVar.c;
            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = n7fVar.c;
            if (clipsTemplateEditorVideoItem != null) {
                boolean z = clipsTemplateEditorVideoItem.k;
                String str = clipsTemplateEditorVideoItem.b;
                se9Var.c = u6fVar;
                float f = clipsTemplateEditorVideoItem.f / clipsTemplateEditorVideoItem.e;
                float f2 = u6fVar.e + f;
                float f3 = (f + f2) / 2;
                boolean z2 = !epx.f((String) se9Var.e, str);
                boolean z3 = (clipsTemplateEditorVideoItem.h || z) ? false : true;
                u6f u6fVar2 = (u6f) se9Var.c;
                w6fVar.d(str, z3, (u6fVar2 != null ? u6fVar2 : null).e, z2);
                if (z3) {
                    w6fVar.c(f, f3, f2);
                } else {
                    w6fVar.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f);
                }
                w6fVar.setFragmentDuration(n7fVar.b.d());
                se9Var.e = str;
                w6fVar.setTimeLineListener(se9Var);
                if (!z || (r6fVar = (r6f) se9Var.d) == null || (a = r6fVar.a()) == null) {
                    return;
                }
                a.a();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        w6f w6fVar = new w6f(viewGroup.getContext());
        w6fVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        f4m.m(17, w6fVar);
        w6fVar.setProvider(this.c);
        return new x6f(w6fVar);
    }
}
