package xsna;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.views.horizontalscroll.DefaultWidthSpreaderLayoutManager;
import com.vk.superapp.ui.widgets.SuperAppShowcaseScrollWidget;
import com.vk.superapp.ui.widgets.subscribe_tile.SubIcon;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: SuperAppWidgetShowcaseScrollInGridHolder.kt */
/* loaded from: classes6.dex */
public final class udn0 extends ucn0<vdn0> implements w160 {
    public final u7n0 p;
    public final c q;
    public final RecyclerView r;
    public final RecyclerView s;

    /* compiled from: SuperAppWidgetShowcaseScrollInGridHolder.kt */
    public static final class a extends ucn0<b> implements lhp0 {
        public final View p;
        public final wzs<WebAction, Integer, s3q0> q;
        public final boolean r;
        public final VkImage s;
        public final VkAvatar t;
        public final TextView u;

        public a(View view, com.vk.movika.tools.controls.seekbar.l lVar, boolean z) {
            super(view, null);
            this.p = view;
            this.q = lVar;
            this.r = z;
            VkImage vkImage = (VkImage) view.findViewById(R.id.icon);
            this.s = vkImage;
            VkAvatar vkAvatar = (VkAvatar) view.findViewById(R.id.avatar);
            this.t = vkAvatar;
            this.u = (TextView) view.findViewById(R.id.app_title);
            awt0.v(vkImage, !z);
            awt0.v(vkAvatar, z);
        }

        @Override // xsna.hf6
        public final void W5(zif0 zif0Var) {
            WebImageSize f;
            b bVar = (b) zif0Var;
            SuperAppShowcaseScrollWidget.Payload.ScrollItem scrollItem = bVar.a;
            this.u.setText(scrollItem.c);
            mz80 mz80Var = new mz80(16, bVar, this);
            View view = this.p;
            bwt0.i0(view, mz80Var);
            boolean z = this.r && epx.f(scrollItem.g, SubIcon.VideoLive.b);
            boolean z2 = scrollItem.f == SuperAppShowcaseScrollWidget.Payload.ScrollItem.ImageStyle.CIRCLE;
            Integer valueOf = z ? null : z2 ? Integer.valueOf(R.drawable.vk_scroll_in_grid_circle_background) : Integer.valueOf(R.drawable.vk_scroll_in_grid_rectangle_background);
            WebImage webImage = scrollItem.d;
            String str = (webImage == null || (f = webImage.f(cn70.b(48))) == null) ? null : f.b;
            VkAvatar vkAvatar = this.t;
            vkAvatar.S0();
            zjt<p0v0> zjtVar = this.s;
            if (!z) {
                g6(zjtVar, valueOf, z2);
                zjtVar.o0(str, null);
                awt0.u(zjtVar, true);
                awt0.u(vkAvatar, false);
                f4m.y(cn70.b(8), view);
                return;
            }
            g6(vkAvatar, valueOf, z2);
            vkAvatar.W0(new ndu0(), true);
            vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.b(null, true, null, null, 27));
            vkAvatar.o0(str, null);
            awt0.u(zjtVar, false);
            awt0.u(vkAvatar, true);
            f4m.y(cn70.b(6), view);
        }

        public final void g6(zjt<p0v0> zjtVar, Integer num, boolean z) {
            zjtVar.setBackground(num != null ? this.itemView.getContext().getDrawable(num.intValue()) : null);
            zjtVar.setCornerRadius(cn70.a() * 13.0f);
            zjtVar.setPlaceholderImage(z ? R.drawable.vk_circle_placeholder : R.drawable.vk_default_placeholder_13);
            zjtVar.setRound(z);
        }
    }

    /* compiled from: SuperAppWidgetShowcaseScrollInGridHolder.kt */
    public static final class b extends zif0 {
        public final SuperAppShowcaseScrollWidget.Payload.ScrollItem a;

        public b(SuperAppShowcaseScrollWidget.Payload.ScrollItem scrollItem) {
            this.a = scrollItem;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.vk_super_app_widget_scroll_in_grid_item;
        }
    }

    /* compiled from: SuperAppWidgetShowcaseScrollInGridHolder.kt */
    public static final class c extends gf6<b> {
        public final com.vk.movika.tools.controls.seekbar.l e;
        public final Object f;

        /* compiled from: SuperAppWidgetShowcaseScrollInGridHolder.kt */
        public final class a extends m.b {
            public final List<b> b;
            public final ArrayList c;

            public a(ListDataSet.ArrayListImpl arrayListImpl, ArrayList arrayList) {
                this.b = arrayListImpl;
                this.c = arrayList;
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areContentsTheSame(int i, int i2) {
                return epx.f(this.b.get(i), this.c.get(i2));
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areItemsTheSame(int i, int i2) {
                return epx.f(this.b.get(i).a.b, ((b) this.c.get(i2)).a.b);
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getNewListSize() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getOldListSize() {
                return this.b.size();
            }
        }

        public c(com.vk.movika.tools.controls.seekbar.l lVar) {
            super((com.vk.lists.a) null, 3);
            this.e = lVar;
            this.f = msy.a(LazyThreadSafetyMode.NONE, new e1m0(2));
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.gf6
        public final hf6 K0(int i, View view) {
            return new a(view, this.e, ((Boolean) this.f.getValue()).booleanValue());
        }
    }

    public udn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        c cVar = new c(new com.vk.movika.tools.controls.seekbar.l(this, 14));
        this.q = cVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.rv_apps);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new DefaultWidthSpreaderLayoutManager(0, false));
        recyclerView.setAdapter(cVar);
        awt0.g(recyclerView);
        this.r = recyclerView;
        this.s = recyclerView;
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        vdn0 vdn0Var = (vdn0) zif0Var;
        SuperAppShowcaseScrollWidget.Payload payload = vdn0Var.e.o;
        this.itemView.setOutlineProvider(new t0w0(6, cn70.a() * 12.0f, false, false));
        View view = this.itemView;
        VkCard vkCard = view instanceof VkCard ? (VkCard) view : null;
        if (vkCard == null) {
            return;
        }
        vkCard.setElevation(cn70.a() * 0.7f);
        vkCard.setCardRadius(cn70.a() * 12.0f);
        vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_modal);
        vkCard.setBorderColorAttr(R.attr.vk_ui_separator_secondary);
        vkCard.setDrawBorder(true);
        bwt0.i0(this.itemView, new rr3(payload, this, vdn0Var, 6));
        List<SuperAppShowcaseScrollWidget.Payload.ScrollItem> list = payload.c;
        if (list != null) {
            List<SuperAppShowcaseScrollWidget.Payload.ScrollItem> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new b((SuperAppShowcaseScrollWidget.Payload.ScrollItem) it.next()));
            }
            RecyclerView recyclerView = this.r;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            Parcelable onSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            c cVar = this.q;
            ListDataSet.ArrayListImpl<T> arrayListImpl = ((ListDataSet) cVar.c).d;
            m.d a2 = androidx.recyclerview.widget.m.a(new c.a(arrayListImpl, new ArrayList(arrayList)), true);
            arrayListImpl.clear();
            arrayListImpl.addAll(arrayList);
            a2.b(cVar);
            RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.onRestoreInstanceState(onSaveInstanceState);
            }
        }
    }

    @Override // xsna.w160
    public final RecyclerView v4() {
        return this.s;
    }
}
