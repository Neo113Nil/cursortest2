package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.views.ToolButton;
import com.vkontakte.android.R;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: BorderViewController.kt */
/* loaded from: classes4.dex */
public final class e28 {
    public final View a;
    public final View b;
    public final View c;
    public final View d;
    public final TextView e;
    public final c4i0 f;
    public final TextView g;
    public final c4i0 h;
    public final ToolButton i;
    public final ToolButton j;
    public final ToolButton k;
    public final RecyclerView l;
    public final k0g m;

    public e28(n3g n3gVar, androidx.lifecycle.j jVar, c5p c5pVar, ViewGroup viewGroup) {
        k0g k0gVar = new k0g(R.layout.item_editor_collage_color);
        this.m = k0gVar;
        View b = tf3.b(viewGroup, R.layout.collage_border, viewGroup, false);
        this.a = b;
        this.b = b.findViewById(R.id.borderGroup);
        this.e = (TextView) b.findViewById(R.id.tvBorderValue);
        c4i0 c4i0Var = (c4i0) b.findViewById(R.id.borderSeekbar);
        this.f = c4i0Var;
        View findViewById = b.findViewById(R.id.cornerGroup);
        findViewById.setVisibility(8);
        this.c = findViewById;
        this.g = (TextView) b.findViewById(R.id.tvCornerValue);
        c4i0 c4i0Var2 = (c4i0) b.findViewById(R.id.cornerSeekbar);
        this.h = c4i0Var2;
        c4i0Var.setOnSeekBarChangeListener(new c28(n3gVar, this, c5pVar));
        c4i0Var2.setOnSeekBarChangeListener(new d28(n3gVar, this, c5pVar));
        View findViewById2 = b.findViewById(R.id.colorGroup);
        findViewById2.setVisibility(8);
        this.d = findViewById2;
        RecyclerView recyclerView = (RecyclerView) b.findViewById(R.id.rvColors);
        k0gVar.submitList(h0g.a);
        k0gVar.d = new lb(n3gVar, 14);
        recyclerView.setAdapter(k0gVar);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.l = recyclerView;
        ToolButton toolButton = (ToolButton) b.findViewById(R.id.btnBorderWidth);
        toolButton.setSelected(true);
        this.i = toolButton;
        ToolButton toolButton2 = (ToolButton) b.findViewById(R.id.btnCornerRadius);
        this.j = toolButton2;
        ToolButton toolButton3 = (ToolButton) b.findViewById(R.id.btnBorderColor);
        this.k = toolButton3;
        toolButton.setOnClick(new hn0(3, this, c5pVar));
        toolButton2.setOnClick(new lh(2, this, c5pVar));
        toolButton3.setOnClick(new defpackage.c(6, this, c5pVar));
        rsr.s(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(n3gVar.j(), new b28(this, null)), jVar);
        a((com.vk.photo.editor.ivm.collage.c) ((b8f0) n3gVar.j()).b.getValue());
    }

    public final void a(com.vk.photo.editor.ivm.collage.c cVar) {
        this.e.setText(String.valueOf(an10.b(cVar.e)));
        this.f.a(cVar.e, true);
        float f = cVar.g;
        this.g.setText(String.valueOf(an10.b(f)));
        this.h.a(f, true);
    }
}
