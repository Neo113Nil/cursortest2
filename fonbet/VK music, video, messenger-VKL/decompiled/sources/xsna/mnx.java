package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.EmptyBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.InternalUniWidget;
import com.vkontakte.android.R;
import xsna.g4q0;
import xsna.j3q0;
import xsna.w1w0;

/* compiled from: InternalUniConstructor.kt */
/* loaded from: classes6.dex */
public final class mnx extends j3q0<InternalUniWidget> {
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public View k;
    public TextView l;

    public mnx(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [xsna.j3q0, xsna.mnx] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        int i;
        int i2;
        mnx mnxVar;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(R.id.vk_uni_widget_internal);
        constraintLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout2);
        b(constraintLayout2);
        Object obj = this.b;
        BaseBlock baseBlock = ((InternalUniWidget) (obj != null ? obj : null)).s;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        j3q0.b t = t(baseBlock, ((InternalUniWidget) obj2).w, context, constraintLayout2);
        this.j = t.a;
        androidx.constraintlayout.widget.b a = pq.a(constraintLayout2);
        View view = this.j;
        if (view == null) {
            view = null;
        }
        a.n(view.getId(), 0);
        View view2 = this.j;
        if (view2 == null) {
            view2 = null;
        }
        a.k(view2.getId(), 4, 0, 4);
        a.b(constraintLayout2);
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = null;
        }
        BaseBlock baseBlock2 = ((InternalUniWidget) obj3).t;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        if (baseBlock2 instanceof TextBlock) {
            TextView textView = new TextView(constraintLayout2.getContext());
            textView.setId(R.id.vk_uni_widget_internal_text);
            textView.setIncludeFontPadding(false);
            textView.setMaxLines(3);
            this.l = textView;
            constraintLayout2.addView(textView);
            TextBlock textBlock = (TextBlock) baseBlock2;
            SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
            if (superappTextStylesBridge == null) {
                superappTextStylesBridge = null;
            }
            i(textView, textBlock, superappTextStylesBridge.g());
            bVar.i(constraintLayout2);
            bVar.p(textView.getId(), 0);
            i = 3;
            i2 = 13;
            bVar.l(textView.getId(), 3, R.id.vk_uni_widget_header_title, 4, iah0.a(1));
            bVar.k(textView.getId(), 6, R.id.vk_uni_widget_header_title, 6);
            bVar.k(textView.getId(), 7, R.id.vk_uni_widget_header_title, 7);
            bVar.l(textView.getId(), 4, 0, 4, iah0.a(12));
        } else {
            i = 3;
            i2 = 13;
            bVar.i(constraintLayout2);
            bVar.l(R.id.vk_uni_widget_header_title, 4, 0, 4, iah0.a(13));
        }
        bVar.l(R.id.vk_uni_widget_header_title, 3, 0, 3, iah0.a(i2));
        bVar.b(constraintLayout2);
        TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.vk_uni_widget_header_title);
        if (textView2 != null) {
            Object obj4 = this.b;
            if (obj4 == null) {
                obj4 = null;
            }
            TextBlock.Style style = ((InternalUniWidget) obj4).v.b;
            SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
            if (superappTextStylesBridge2 == null) {
                superappTextStylesBridge2 = null;
            }
            j3q0.a.a(textView2, style, superappTextStylesBridge2.f(), this.h.c);
            textView2.setSingleLine(false);
            textView2.setMaxLines(i);
        }
        Object obj5 = this.b;
        if (obj5 == null) {
            obj5 = null;
        }
        if (epx.f(((InternalUniWidget) obj5).u, EmptyBlock.b)) {
            mnxVar = this;
            constraintLayout = constraintLayout2;
        } else {
            Object obj6 = this.b;
            BaseBlock baseBlock3 = ((InternalUniWidget) (obj6 != null ? obj6 : null)).u;
            Object obj7 = obj6;
            if (obj6 == null) {
                obj7 = null;
            }
            int i3 = i;
            constraintLayout = constraintLayout2;
            View s = s(baseBlock3, context, constraintLayout, ((InternalUniWidget) obj7).r.g.d, true);
            mnxVar = this;
            mnxVar.k = s;
            View view3 = mnxVar.l;
            if (view3 == null && (view3 = mnxVar.j) == null) {
                view3 = null;
            }
            androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
            a2.h(view3.getId(), 4);
            a2.k(s.getId(), i3, view3.getId(), 4);
            a2.b(constraintLayout);
        }
        View view4 = mnxVar.j;
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
