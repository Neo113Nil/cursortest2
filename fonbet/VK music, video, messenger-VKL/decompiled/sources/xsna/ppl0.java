package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StoriesAdapter.kt */
/* loaded from: classes3.dex */
public final class ppl0 extends RecyclerView.Adapter<jxl0> implements vic {
    public final FunctionReferenceImpl c;
    public final ArrayList d = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public ppl0(wzs<? super StoryEntry, ? super Boolean, s3q0> wzsVar) {
        this.c = (FunctionReferenceImpl) wzsVar;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        arrayList.clear();
        notifyItemRangeRemoved(0, size);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(jxl0 jxl0Var, int i) {
        jxl0Var.V5(this.d.get(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final jxl0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new jxl0(viewGroup, this.c);
    }
}
