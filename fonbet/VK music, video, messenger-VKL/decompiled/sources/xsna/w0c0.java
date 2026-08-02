package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.comments.CommentsOrder;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import xsna.xfg;

/* compiled from: PostCommentsOrderDropdownHolder.kt */
/* loaded from: classes4.dex */
public final class w0c0 extends qi6<NewsEntry> implements View.OnClickListener {
    public final TextView C;
    public yfg D;
    public final xfg E;
    public final bpn0 F;
    public final a G;

    /* compiled from: PostCommentsOrderDropdownHolder.kt */
    public static final class a implements xfg.a {
        public a() {
        }

        @Override // xsna.xfg.a
        public final void a(CommentsOrder.Item item) {
            String str = item.b;
            w0c0 w0c0Var = w0c0.this;
            yfg yfgVar = w0c0Var.D;
            if (yfgVar == null) {
                return;
            }
            if (!epx.f(str, yfgVar.c)) {
                yfgVar.e.invoke(str, yfgVar);
            }
            ((VkContextMenu) w0c0Var.F.getValue()).b();
        }
    }

    public w0c0(ViewGroup viewGroup) {
        super(R.layout.post_comments_order_dropdown, viewGroup);
        TextView textView = (TextView) this.itemView.findViewById(R.id.menu);
        this.C = textView;
        this.E = new xfg();
        this.F = new bpn0(new com.vk.movika.sdk.base.ui.m(16, this, viewGroup));
        this.G = new a();
        textView.setOnClickListener(this);
        com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(15.0f), 4);
    }

    @Override // xsna.qi6
    public final void E6(NewsEntry newsEntry) {
        Object obj;
        yfg yfgVar = this.D;
        if (yfgVar == null) {
            return;
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
        TextView textView = this.C;
        textView.setText(str);
        bwt0.p0(textView, yfgVar.b > 1 && !yfgVar.d.isEmpty());
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.D = obj instanceof yfg ? (yfg) obj : null;
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        yfg yfgVar;
        if (jjc.b() || !epx.f(view, this.C) || (yfgVar = this.D) == null) {
            return;
        }
        xfg xfgVar = this.E;
        xfgVar.getClass();
        xfgVar.e = new WeakReference<>(yfgVar);
        xfgVar.setItems(yfgVar.d);
        xfgVar.f = this.G;
        ((VkContextMenu) this.F.getValue()).g();
    }
}
