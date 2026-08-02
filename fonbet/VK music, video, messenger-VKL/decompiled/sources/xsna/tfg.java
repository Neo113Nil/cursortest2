package xsna;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.comments.CommentsOrder;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import xsna.xfg;

/* compiled from: CommentsOrderDropdownHolder.kt */
/* loaded from: classes4.dex */
public final class tfg extends qi6<NewsEntry> implements View.OnClickListener {
    public final TextView C;
    public final TextView D;
    public yfg E;
    public final xfg F;
    public final bpn0 G;
    public final a H;

    /* compiled from: CommentsOrderDropdownHolder.kt */
    public static final class a implements xfg.a {
        public a() {
        }

        @Override // xsna.xfg.a
        public final void a(CommentsOrder.Item item) {
            String str = item.b;
            tfg tfgVar = tfg.this;
            yfg yfgVar = tfgVar.E;
            if (yfgVar == null) {
                return;
            }
            if (!epx.f(str, yfgVar.c)) {
                yfgVar.e.invoke(str, yfgVar);
            }
            ((VkContextMenu) tfgVar.G.getValue()).b();
        }
    }

    public tfg(ViewGroup viewGroup) {
        super(R.layout.comments_order_dropdown, viewGroup);
        this.C = (TextView) this.itemView.findViewById(R.id.amount);
        TextView textView = (TextView) this.itemView.findViewById(R.id.menu);
        this.D = textView;
        this.F = new xfg();
        this.G = new bpn0(new sfg(this, 0));
        this.H = new a();
        textView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Object obj;
        int i;
        yfg yfgVar = this.E;
        if (yfgVar == null) {
            return;
        }
        s1c0 s1c0Var = this.x;
        boolean z = false;
        TextView textView = this.C;
        if (s1c0Var == null || !s1c0Var.d || (i = yfgVar.a) <= 0) {
            int i2 = yfgVar.a;
            if (i2 > 0) {
                textView.setText(textView.getResources().getQuantityString(R.plurals.comments, yfgVar.a, uqm0.o(i2)));
                Resources resources = textView.getResources();
                int i3 = yfgVar.a;
                textView.setContentDescription(resources.getQuantityString(R.plurals.accessibility_comments_count, i3, Integer.valueOf(i3)));
                bwt0.p0(textView, true);
            } else {
                bwt0.p0(textView, false);
            }
        } else {
            String o = uqm0.o(i);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.itemView.getContext().getString(R.string.clip_comments_header, o));
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) iah0.y(13), false), drm0.H(spannableStringBuilder) - o.length(), spannableStringBuilder.length(), 18);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_icon_tertiary, this.itemView.getContext())), drm0.H(spannableStringBuilder) - o.length(), spannableStringBuilder.length(), 18);
            textView.setAllCaps(false);
            f4m.y(iah0.a(15), textView);
            f4m.v(iah0.a(9), textView);
            textView.setTextSize(2, 16.0f);
            textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, this.itemView.getContext()));
            textView.setText(spannableStringBuilder);
            textView.setContentDescription(spannableStringBuilder);
            bwt0.p0(textView, true);
        }
        Iterator<T> it = yfgVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(yfgVar.c, ((CommentsOrder.Item) obj).b)) {
                    break;
                }
            }
        }
        CommentsOrder.Item item = (CommentsOrder.Item) obj;
        String str = item != null ? item.c : null;
        TextView textView2 = this.D;
        textView2.setText(str);
        if (yfgVar.b > 1 && !yfgVar.d.isEmpty()) {
            z = true;
        }
        bwt0.p0(textView2, z);
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.E = obj instanceof yfg ? (yfg) obj : null;
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yfg yfgVar;
        if (jjc.b() || !epx.f(view, this.D) || (yfgVar = this.E) == null) {
            return;
        }
        xfg xfgVar = this.F;
        xfgVar.getClass();
        xfgVar.e = new WeakReference<>(yfgVar);
        xfgVar.setItems(yfgVar.d);
        xfgVar.f = this.H;
        ((VkContextMenu) this.G.getValue()).g();
    }
}
