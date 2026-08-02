package xsna;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.gm50;

/* compiled from: StoryTemplatesView.kt */
/* loaded from: classes6.dex */
public final class wjm0 implements gm50 {
    public final View b;
    public final StoryTemplateFragment c;
    public final f5z d;
    public final RecyclerView e;
    public final View f;
    public final View g;
    public final wim0 h;
    public final Object i;
    public final Object j;

    public wjm0(View view, StoryTemplateFragment storyTemplateFragment, f5z f5zVar) {
        this.b = view;
        this.c = storyTemplateFragment;
        this.d = f5zVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_template);
        this.e = recyclerView;
        this.f = view.findViewById(R.id.error_view_template);
        View findViewById = view.findViewById(R.id.reload_page);
        this.g = findViewById;
        wim0 wim0Var = new wim0(bwt0.u(view.getContext()), storyTemplateFragment);
        this.h = wim0Var;
        p1d0 p1d0Var = new p1d0(this, 18);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, p1d0Var);
        this.i = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new uh80(7));
        this.j = a2;
        bwt0.u(recyclerView.getContext());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(((Number) a.getValue()).intValue());
        gridLayoutManager.x = new vjm0(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration((kgu) a2.getValue());
        recyclerView.setAdapter(wim0Var);
        bwt0.i0(findViewById, new mdk0(this, 1));
    }

    public final void a(sjm0 sjm0Var) {
        gm50.a.b(this, sjm0Var.a, new sxl0(this, 3));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.d;
    }
}
