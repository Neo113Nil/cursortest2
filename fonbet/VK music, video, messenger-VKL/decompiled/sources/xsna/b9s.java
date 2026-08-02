package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: FormatsViewController.kt */
/* loaded from: classes4.dex */
public final class b9s {
    public final View a;
    public final u0g b;

    public b9s(n3g n3gVar, androidx.lifecycle.j jVar, ViewGroup viewGroup) {
        u0g u0gVar = new u0g();
        this.b = u0gVar;
        View b = tf3.b(viewGroup, R.layout.collage_formats, viewGroup, false);
        this.a = b;
        RecyclerView recyclerView = (RecyclerView) b.findViewById(R.id.rvFormats);
        u0gVar.submitList(a3g.a);
        u0gVar.c = new lwh(n3gVar, 11);
        recyclerView.setAdapter(u0gVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(n3gVar.j(), new a9s(this, null)), jVar);
    }
}
