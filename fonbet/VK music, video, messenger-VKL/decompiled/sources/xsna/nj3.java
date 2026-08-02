package xsna;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.content.design.view.photo.archive.ArchiveSkeletonView;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.c;
import com.vk.photos.root.archive.presentation.view.ArchiveRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.dga0;
import xsna.gm50;

/* compiled from: ArchiveView.kt */
/* loaded from: classes4.dex */
public final class nj3 implements gm50 {
    public final kdg0 b;
    public final eha0 c;
    public final q1 d;
    public final Context e;
    public final f5z f;
    public final ArchiveSkeletonView g;
    public final ArchiveRecyclerPaginatedView h;
    public final PhotoFlowToolbarView i;
    public final TextView j;
    public final jfi0<f9a0, y7a0> k;
    public final mj3 l;
    public final n7a0 m;
    public final com.vk.lists.c n;

    public nj3(View view, ki3 ki3Var, kdg0 kdg0Var, eha0 eha0Var, f5z f5zVar, q1 q1Var) {
        this.b = kdg0Var;
        this.c = eha0Var;
        this.d = q1Var;
        this.e = view.getContext();
        this.f = f5zVar;
        this.g = (ArchiveSkeletonView) view.findViewById(R.id.skeleton);
        ArchiveRecyclerPaginatedView archiveRecyclerPaginatedView = (ArchiveRecyclerPaginatedView) view.findViewById(R.id.rpv_photo_flow);
        this.h = archiveRecyclerPaginatedView;
        PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) view.findViewById(R.id.toolbar);
        this.i = photoFlowToolbarView;
        this.j = (TextView) view.findViewById(R.id.archive_description);
        jfi0<f9a0, y7a0> jfi0Var = new jfi0<>(archiveRecyclerPaginatedView.getRecyclerView(), f5zVar, new r7(this, 5), new fb(this, 3));
        this.k = jfi0Var;
        mj3 mj3Var = new mj3(this);
        this.l = mj3Var;
        n7a0 n7a0Var = new n7a0(mj3Var, eha0Var);
        this.m = n7a0Var;
        photoFlowToolbarView.Q4(R.drawable.vk_icon_arrow_left_outline_28, R.string.accessibility_back);
        photoFlowToolbarView.P4(new z7(this, 4));
        photoFlowToolbarView.setTitle(R.string.photo_archive_title);
        photoFlowToolbarView.setTitleClickListener(new v20(this, 3));
        c();
        archiveRecyclerPaginatedView.getRecyclerView().addOnItemTouchListener(jfi0Var);
        archiveRecyclerPaginatedView.setAdapter(n7a0Var);
        archiveRecyclerPaginatedView.getRecyclerView().setOverScrollMode(2);
        this.n = com.vk.lists.f.a(new c.h(ki3Var), archiveRecyclerPaginatedView);
        f5zVar.getLifecycle().addObserver(new lj3(this));
        photoFlowToolbarView.setMenuClickListener(new b8(this, 3));
    }

    public final void a() {
        ArchiveRecyclerPaginatedView archiveRecyclerPaginatedView = this.h;
        int itemDecorationCount = archiveRecyclerPaginatedView.getRecyclerView().getItemDecorationCount();
        while (true) {
            itemDecorationCount--;
            if (-1 >= itemDecorationCount) {
                c();
                return;
            }
            archiveRecyclerPaginatedView.getRecyclerView().removeItemDecorationAt(itemDecorationCount);
        }
    }

    public final void b(oj3 oj3Var) {
        gm50.a.b(this, oj3Var.a, new gb(1, this, new Ref$BooleanRef()));
    }

    public final void c() {
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        ArchiveRecyclerPaginatedView archiveRecyclerPaginatedView = this.h;
        archiveRecyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, archiveRecyclerPaginatedView);
        dVar.f = 1;
        Context context = archiveRecyclerPaginatedView.getContext();
        HashSet hashSet = iah0.a;
        dVar.c((fnj.c(context) || iah0.s(context)) ? 3 : 6);
        dVar.a();
        archiveRecyclerPaginatedView.setSwipeRefreshEnabled(true);
        RecyclerView recyclerView = archiveRecyclerPaginatedView.getRecyclerView();
        Context context2 = archiveRecyclerPaginatedView.getContext();
        recyclerView.addItemDecoration(new jgu((fnj.c(context2) || iah0.s(context2)) ? 3 : 6, cn70.b(2), false, 0));
        RecyclerView recyclerView2 = archiveRecyclerPaginatedView.getRecyclerView();
        Context context3 = archiveRecyclerPaginatedView.getContext();
        recyclerView2.addItemDecoration(new dga0((fnj.c(context3) || iah0.s(context3)) ? 3 : 6, new dga0.b()));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.f;
    }
}
