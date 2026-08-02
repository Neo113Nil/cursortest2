package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.superapp.bridges.SuperappUiDesignBridge;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ButtonBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.PlaceholderUniWidget;
import com.vkontakte.android.R;
import xsna.g4q0;
import xsna.j3q0;
import xsna.w1w0;

/* compiled from: PlaceholderUniConstructor.kt */
/* loaded from: classes6.dex */
public final class ssa0 extends j3q0<PlaceholderUniWidget> {
    public static final int n = iah0.a(16);
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public TextView k;
    public View l;
    public View m;

    public ssa0(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [xsna.j3q0, xsna.ssa0] */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.view.View, android.widget.TextView] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        Space space;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_placeholder);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        BaseBlock baseBlock = ((PlaceholderUniWidget) (obj != null ? obj : null)).s.b;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        j3q0.b t = t(baseBlock, ((PlaceholderUniWidget) obj2).s.f, context, constraintLayout);
        this.j = t.a;
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = null;
        }
        TextBlock textBlock = ((PlaceholderUniWidget) obj3).s.c;
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(R.id.vk_uni_widget_placeholder_text);
        textView.setMaxLines(3);
        SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
        if (superappTextStylesBridge == null) {
            superappTextStylesBridge = null;
        }
        i(textView, textBlock, superappTextStylesBridge.f());
        textView.setGravity(1);
        float f = 1;
        textView.setPadding(0, iah0.a(f), 0, iah0.a(f));
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.b(textView, SuperappUiDesignBridge.FontFamily.REGULAR);
        constraintLayout.addView(textView);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(constraintLayout);
        bVar.p(textView.getId(), 0);
        int id = textView.getId();
        View view = this.j;
        if (view == null) {
            view = null;
        }
        int id2 = view.getId();
        int i = n;
        bVar.l(id, 3, id2, 4, i);
        bVar.l(textView.getId(), 6, 0, 6, i);
        bVar.l(textView.getId(), 7, 0, 7, i);
        bVar.b(constraintLayout);
        float f2 = 4;
        awt0.b(iah0.a(f2), textView);
        awt0.a(iah0.a(f2), textView);
        this.k = textView;
        Object obj4 = this.b;
        if (obj4 == null) {
            obj4 = null;
        }
        BaseBlock baseBlock2 = ((PlaceholderUniWidget) obj4).s.d;
        if (baseBlock2 instanceof ButtonBlock) {
            ?? textView2 = new TextView(constraintLayout.getContext());
            textView2.setId(R.id.vk_uni_widget_placeholder_btn);
            textView2.setSingleLine();
            f(textView2, (ButtonBlock) baseBlock2);
            space = textView2;
        } else {
            Space space2 = new Space(constraintLayout.getContext());
            space2.setId(View.generateViewId());
            space = space2;
        }
        constraintLayout.addView(space);
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        bVar2.i(constraintLayout);
        int id3 = space.getId();
        TextView textView3 = this.k;
        if (textView3 == null) {
            textView3 = null;
        }
        bVar2.l(id3, 3, textView3.getId(), 4, i);
        bVar2.k(space.getId(), 6, 0, 6);
        bVar2.k(space.getId(), 7, 0, 7);
        bVar2.b(constraintLayout);
        awt0.b(iah0.a(f2), space);
        awt0.a(iah0.a(f2), space);
        this.l = space;
        Object obj5 = this.b;
        BaseBlock baseBlock3 = ((PlaceholderUniWidget) (obj5 != null ? obj5 : null)).s.e;
        Object obj6 = obj5;
        if (obj5 == null) {
            obj6 = null;
        }
        this.m = s(baseBlock3, context, constraintLayout, ((PlaceholderUniWidget) obj6).r.d.d, true);
        androidx.constraintlayout.widget.b a = pq.a(constraintLayout);
        View view2 = this.m;
        if (view2 == null) {
            view2 = null;
        }
        int id4 = view2.getId();
        View view3 = this.l;
        if (view3 == null) {
            view3 = null;
        }
        a.l(id4, 3, view3.getId(), 4, i);
        a.b(constraintLayout);
        View view4 = this.j;
        return new cpx0(constraintLayout, view4 == null ? null : view4, t.b, t.c, null);
    }

    @Override // xsna.j3q0
    public final u7n0 o() {
        return this.i;
    }

    @Override // xsna.j3q0
    public final g4q0.a r() {
        return this.h;
    }
}
