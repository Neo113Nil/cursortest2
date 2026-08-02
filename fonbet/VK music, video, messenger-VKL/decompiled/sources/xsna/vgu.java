package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: GridsViewController.kt */
/* loaded from: classes4.dex */
public final class vgu {
    public final View a;
    public final RecyclerView b;
    public final p1g c;

    public vgu(n3g n3gVar, androidx.lifecycle.j jVar, ViewGroup viewGroup) {
        p1g p1gVar = new p1g();
        this.c = p1gVar;
        View b = tf3.b(viewGroup, R.layout.collage_grids, viewGroup, false);
        this.a = b;
        RecyclerView recyclerView = (RecyclerView) b.findViewById(R.id.rvGrids);
        p1gVar.submitList(c3g.a);
        p1gVar.c = new cws(n3gVar, 6);
        recyclerView.setAdapter(p1gVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.b = recyclerView;
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(n3gVar.j(), new ugu(this, null)), jVar);
    }
}
