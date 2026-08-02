package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.impl.graffiti.domain.model.BrushType;
import com.vk.photo.editor.markup.view.DrawingView;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.photo.editor.markup.view.tools.PipetteView;
import com.vk.photo.editor.markup.view.tools.SizeCircleView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.y8g;

/* compiled from: GraffitiDrawingView.kt */
/* loaded from: classes15.dex */
public final class jcu implements gm50, z860, BrushesPanel.a, SizeSeekBarView.a, PipetteView.a {
    public final SizeSeekBarView A;
    public final PipetteView B;
    public final ccu C;
    public final View b;
    public final f5z c;
    public final p8 d;
    public final ArrayList e;
    public final jf10 f;
    public final of10 g;
    public final ConcatAdapter h;
    public final View i;
    public final View j;
    public final View k;
    public final ImageView l;
    public final TextView m;
    public final View n;
    public final View o;
    public final ColorButton p;
    public final PipetteButton q;
    public final RecyclerView r;
    public final View s;
    public final BrushesPanel t;
    public final View u;
    public final View v;
    public final View w;
    public final View x;
    public final DrawingView y;
    public final SizeCircleView z;

    public jcu(View view, f5z f5zVar, p8 p8Var) {
        this.b = view;
        this.c = f5zVar;
        this.d = p8Var;
        List<Integer> list = url.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new y8g.c(((Number) it.next()).intValue()));
        }
        this.e = arrayList;
        jf10 jf10Var = new jf10();
        this.f = jf10Var;
        of10 of10Var = new of10();
        this.g = of10Var;
        this.h = new ConcatAdapter(of10Var, jf10Var);
        this.i = this.b.findViewById(R.id.fl_drawing_container);
        this.j = this.b.findViewById(R.id.fl_user_container);
        View findViewById = this.b.findViewById(R.id.ll_user_container_inner);
        this.k = findViewById;
        this.l = (ImageView) findViewById.findViewById(R.id.iv_avatar);
        this.m = (TextView) findViewById.findViewById(R.id.tv_username);
        this.n = this.b.findViewById(R.id.layout_color_container);
        this.o = this.b.findViewById(R.id.layout_brush_container);
        this.p = (ColorButton) this.b.findViewById(R.id.color_button);
        this.q = (PipetteButton) this.b.findViewById(R.id.pipette_button);
        this.r = (RecyclerView) this.b.findViewById(R.id.colors_list);
        this.s = this.b.findViewById(R.id.closed_brush_panel_button);
        this.t = (BrushesPanel) this.b.findViewById(R.id.brush_panel);
        this.u = this.b.findViewById(R.id.button_draw_apply);
        this.v = this.b.findViewById(R.id.button_draw_cancel);
        this.w = this.b.findViewById(R.id.button_draw_redo);
        this.x = this.b.findViewById(R.id.button_draw_undo);
        DrawingView drawingView = (DrawingView) this.b.findViewById(R.id.drawing_view);
        this.y = drawingView;
        this.z = (SizeCircleView) this.b.findViewById(R.id.brush_size_circle_view);
        this.A = (SizeSeekBarView) this.b.findViewById(R.id.brush_size_seek_bar);
        this.B = (PipetteView) this.b.findViewById(R.id.pipette_view);
        this.C = new ccu(drawingView);
    }

    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void A(int i) {
        pbu pbuVar = new pbu(i, true);
        p8 p8Var = this.d;
        p8Var.invoke(pbuVar);
        p8Var.invoke(ubu.b);
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void F() {
        fyt0.h(this.z);
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void a() {
        this.z.setVisibility(0);
    }

    @Override // com.vk.photo.editor.markup.view.tools.BrushesPanel.a
    public final void c(BrushesPanel.BrushType brushType) {
        BrushType brushType2;
        int i = fl8.$EnumSwitchMapping$1[brushType.ordinal()];
        if (i == 1) {
            brushType2 = BrushType.Pen;
        } else if (i == 2) {
            brushType2 = BrushType.Arrow;
        } else if (i == 3) {
            brushType2 = BrushType.Marker;
        } else if (i == 4) {
            brushType2 = BrushType.Glow;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            brushType2 = BrushType.Eraser;
        }
        this.d.invoke(new obu(brushType2));
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.c;
    }

    @Override // com.vk.photo.editor.markup.view.tools.SizeSeekBarView.a
    public final void h(float f) {
        this.d.invoke(new qbu(f));
    }

    @Override // xsna.z860
    public final void onFinish() {
        this.d.invoke(new rbu(this.y.d()));
    }

    @Override // com.vk.photo.editor.markup.view.tools.PipetteView.a
    public final void v(int i) {
        this.d.invoke(new pbu(i, true));
    }

    @Override // xsna.z860
    public final void d(MotionEvent motionEvent) {
    }
}
