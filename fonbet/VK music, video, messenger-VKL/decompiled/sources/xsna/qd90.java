package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.card.VkCard;
import com.vk.core.view.components.picture.VkImage;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.app.catalog.CustomItem;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionOpenVkApp;
import com.vk.superapp.ext.CounterType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;

/* compiled from: PaginatedSectionAdapter.kt */
/* loaded from: classes6.dex */
public final class qd90 extends RecyclerView.Adapter<a> {
    public final rd90 c;
    public final k8r0 d;
    public final ArrayList e = new ArrayList();

    /* compiled from: PaginatedSectionAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final b l;

        public a(View view, k8r0 k8r0Var) {
            super(view);
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.paginated_page_recycler);
            b bVar = new b(k8r0Var);
            this.l = bVar;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(4, 1));
            recyclerView.setAdapter(bVar);
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new hgu(iah0.a(8)));
        }
    }

    public qd90(rd90 rd90Var, k8r0 k8r0Var) {
        this.c = rd90Var;
        this.d = k8r0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        b bVar = aVar2.l;
        bVar.e = this.c;
        List<CustomItem> list = ((y890) this.e.get(i)).b;
        int bindingAdapterPosition = aVar2.getBindingAdapterPosition();
        ArrayList arrayList = bVar.g;
        m.d a2 = androidx.recyclerview.widget.m.a(new b.C3558b(j5g.O0(arrayList), list), true);
        bVar.f = bindingAdapterPosition;
        arrayList.clear();
        arrayList.addAll(list);
        a2.b(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(tf3.b(viewGroup, R.layout.vk_item_apps_catalog_paginated_item, viewGroup, false), this.d);
    }

    /* compiled from: PaginatedSectionAdapter.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final k8r0 c;
        public final boolean d;
        public rd90 e;
        public int f;
        public final ArrayList g;

        /* compiled from: PaginatedSectionAdapter.kt */
        public static final class a extends v96<CustomItem> {
            public static final int A = iah0.a(28);
            public final boolean m;
            public final ImageView n;
            public final VkImage o;
            public final TextView p;
            public final TextView q;
            public final VkImage r;
            public final TextView s;
            public final VkImage t;
            public final VkImage u;
            public final int v;
            public final enk0 w;
            public zvx x;
            public int y;
            public int z;

            public a(ViewGroup viewGroup, k8r0 k8r0Var, boolean z) {
                super(z ? R.layout.vk_item_apps_catalog_paginated_page_item_redesign : R.layout.vk_item_apps_catalog_paginated_page_item, viewGroup);
                this.m = z;
                View view = this.itemView;
                VkCard vkCard = view instanceof VkCard ? (VkCard) view : null;
                this.n = (ImageView) view.findViewById(R.id.icon_background);
                VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.icon_container);
                this.o = vkImage;
                this.p = (TextView) this.itemView.findViewById(R.id.title);
                this.q = (TextView) this.itemView.findViewById(R.id.badge);
                VkImage vkImage2 = (VkImage) this.itemView.findViewById(R.id.new_badge);
                this.r = vkImage2;
                this.s = (TextView) this.itemView.findViewById(R.id.counter);
                VkImage vkImage3 = (VkImage) this.itemView.findViewById(R.id.dot);
                this.t = vkImage3;
                VkImage vkImage4 = (VkImage) this.itemView.findViewById(R.id.messenger_badge);
                this.u = vkImage4;
                this.v = z ? this.itemView.getResources().getDimensionPixelSize(R.dimen.vk_catalog_miniapp_item_icon_size) : A;
                this.w = new enk0(krv0.m(R.attr.vk_ui_image_placeholder, this.itemView.getContext()));
                this.y = -1;
                awt0.o(this.itemView, new w620(this, 10));
                jjc.g(this.itemView, new mu1(22, this, k8r0Var));
                if (vkCard != null) {
                    vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_content);
                }
                ifx0 ifx0Var = e370.c;
                (ifx0Var != null ? ifx0Var : null).getClass();
                zq70.E(vkImage, 3.9d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                vkImage3.setPlaceholderImage(R.drawable.vk_menu_dot_badge_bg);
                vkImage2.setPlaceholderImage(R.drawable.vk_icon_badge_new_32);
                vkImage4.setPlaceholderImage(R.drawable.vk_message_badge_24);
            }

            @Override // xsna.v96
            public final void W5(CustomItem customItem) {
                CustomItem customItem2 = customItem;
                View view = this.itemView;
                String str = customItem2.h;
                view.setContentDescription(str);
                ImageView imageView = this.n;
                if (imageView != null) {
                    imageView.setBackground(a6(customItem2.e));
                }
                g6(customItem2.i);
                TextView textView = this.p;
                textView.setText(str);
                textView.setTextColor(b6(customItem2.g));
                dz5.h(customItem2.k, CounterType.WITH_PLUS, this.s, this.t, this.q, this.r, null, this.u, 32);
            }

            /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
            public final enk0 a6(List list) {
                int m = krv0.m(R.attr.vk_ui_background_tertiary, this.itemView.getContext());
                float[] fArr = m3r0.a;
                n8g.h(m, fArr);
                double d = fArr[2];
                int l = n8g.l(m, (int) (255 * (d > 0.75d ? 0.12d : d > 0.25d ? 0.08d : 0.04d)));
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    gfx0 gfx0Var = e370.b;
                    if (gfx0Var == null) {
                        gfx0Var = null;
                    }
                    gfx0Var.getClass();
                    ?? M = dhr0.M();
                    l = ((Number) ((M < 0 || M >= list.size()) ? Integer.valueOf(l) : list.get(M == true ? 1 : 0))).intValue();
                }
                return new enk0(l);
            }

            /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
            public final int b6(List<Integer> list) {
                int m = krv0.m(R.attr.vk_ui_text_primary, this.itemView.getContext());
                List<Integer> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    return m;
                }
                gfx0 gfx0Var = e370.b;
                if (gfx0Var == null) {
                    gfx0Var = null;
                }
                gfx0Var.getClass();
                ?? M = dhr0.M();
                return ((M < 0 || M >= list.size()) ? Integer.valueOf(m) : list.get(M == true ? 1 : 0)).intValue();
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void g6(WebImage webImage) {
                String str;
                Drawable drawable;
                Drawable drawable2;
                String str2;
                boolean z = this.m;
                enk0 enk0Var = this.w;
                int i = this.v;
                VkImage vkImage = this.o;
                if (!z) {
                    WebImageSize f = webImage.f(i);
                    if (f == null || (str = f.b) == null) {
                        vkImage.setPlaceholderImage(enk0Var);
                        return;
                    } else {
                        vkImage.o0(str, null);
                        return;
                    }
                }
                WebAction webAction = getItem().j;
                WebActionOpenVkApp webActionOpenVkApp = webAction instanceof WebActionOpenVkApp ? (WebActionOpenVkApp) webAction : null;
                Long valueOf = webActionOpenVkApp != null ? Long.valueOf(webActionOpenVkApp.d) : null;
                String str3 = getItem().c;
                if (valueOf != null) {
                    long longValue = valueOf.longValue();
                    Context context = this.itemView.getContext();
                    try {
                        Integer num = (Integer) g7a.a.get(Long.valueOf(longValue));
                        drawable = m33.a(num != null ? num.intValue() : 0, context);
                    } catch (Exception unused) {
                    }
                    if (str3 != null) {
                        Context context2 = this.itemView.getContext();
                        try {
                            Integer num2 = (Integer) g7a.b.get(str3);
                            drawable2 = m33.a(num2 != null ? num2.intValue() : 0, context2);
                        } catch (Exception unused2) {
                        }
                        if (drawable != null) {
                            vkImage.setPlaceholderImage(drawable);
                            return;
                        }
                        if (drawable2 != null) {
                            vkImage.setPlaceholderImage(drawable2);
                            return;
                        }
                        WebImageSize f2 = webImage.f(i);
                        if (f2 == null || (str2 = f2.b) == null) {
                            vkImage.setPlaceholderImage(enk0Var);
                            return;
                        } else {
                            vkImage.o0(str2, null);
                            return;
                        }
                    }
                    drawable2 = null;
                    if (drawable != null) {
                    }
                }
                drawable = null;
                if (str3 != null) {
                }
                drawable2 = null;
                if (drawable != null) {
                }
            }
        }

        /* compiled from: PaginatedSectionAdapter.kt */
        /* renamed from: xsna.qd90$b$b, reason: collision with other inner class name */
        public static final class C3558b extends m.b {
            public final List<CustomItem> b;
            public final List<CustomItem> c;

            public C3558b(List<CustomItem> list, List<CustomItem> list2) {
                this.b = list;
                this.c = list2;
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areContentsTheSame(int i, int i2) {
                return epx.f(this.b.get(i), this.c.get(i2));
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areItemsTheSame(int i, int i2) {
                return epx.f(this.b.get(i).b, this.c.get(i2).b);
            }

            @Override // androidx.recyclerview.widget.m.b
            public final Object getChangePayload(int i, int i2) {
                CustomItem customItem = this.b.get(i);
                CustomItem customItem2 = this.c.get(i2);
                int i3 = a.A;
                List<Integer> list = customItem2.g;
                String str = customItem2.h;
                List<Integer> list2 = customItem2.d;
                WebImage webImage = customItem2.i;
                List<Integer> list3 = customItem2.e;
                ArrayList arrayList = new ArrayList();
                BadgeInfo badgeInfo = customItem.k;
                BadgeInfo badgeInfo2 = customItem2.k;
                if (!epx.f(badgeInfo, badgeInfo2)) {
                    arrayList.add(new Pair(".badge_info", badgeInfo2));
                }
                if (!epx.f(customItem.e, list3)) {
                    arrayList.add(new Pair(".bg_color", j5g.N0(list3)));
                }
                if (!epx.f(customItem.i, webImage)) {
                    arrayList.add(new Pair(".icon", webImage));
                }
                if (!epx.f(customItem.d, list2)) {
                    arrayList.add(new Pair(".icon_color", list2 != null ? j5g.N0(list2) : null));
                }
                if (!epx.f(customItem.h, str)) {
                    q2z.a(".title", str, arrayList);
                }
                if (!epx.f(customItem.g, list)) {
                    arrayList.add(new Pair(".title_color", list != null ? j5g.N0(list) : null));
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                return yfb.b((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
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

        public b(k8r0 k8r0Var) {
            pq3 a2;
            this.c = k8r0Var;
            dex0 dex0Var = e370.s;
            boolean z = false;
            if (dex0Var != null && (a2 = dex0Var.a()) != null && a2.g()) {
                z = true;
            }
            this.d = z;
            this.f = -1;
            this.g = new ArrayList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.g.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            rd90 rd90Var = this.e;
            if (rd90Var == null) {
                rd90Var = null;
            }
            aVar2.x = rd90Var;
            aVar2.y = this.f;
            ArrayList arrayList = this.g;
            aVar2.z = arrayList.size();
            aVar2.V5(arrayList.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(viewGroup, this.c, this.d);
        }

        /* JADX WARN: Type inference failed for: r13v1, types: [T, java.lang.Object] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i, List list) {
            a aVar2 = aVar;
            if (list.isEmpty()) {
                super.onBindViewHolder(aVar2, i, list);
                return;
            }
            Bundle bundle = (Bundle) list.get(0);
            TextView textView = aVar2.p;
            if (bundle.containsKey(".badge_info")) {
                dz5.h((BadgeInfo) bundle.getParcelable(".badge_info"), CounterType.WITH_PLUS, aVar2.s, aVar2.t, aVar2.q, aVar2.r, null, aVar2.u, 32);
            }
            if (bundle.containsKey(".bg_color")) {
                int[] intArray = bundle.getIntArray(".bg_color");
                List<Integer> s0 = intArray != null ? rl3.s0(intArray) : null;
                ImageView imageView = aVar2.n;
                if (imageView != null) {
                    imageView.setBackground(aVar2.a6(s0));
                }
            }
            if (bundle.containsKey(".icon") || bundle.containsKey(".icon_color")) {
                WebImage webImage = (WebImage) bundle.getParcelable(".icon");
                if (webImage == null) {
                    webImage = aVar2.getItem().i;
                }
                int[] intArray2 = bundle.getIntArray(".icon_color");
                if (intArray2 == null || rl3.s0(intArray2) == null) {
                    List<Integer> list2 = aVar2.getItem().d;
                }
                aVar2.g6(webImage);
            }
            if (bundle.containsKey(".title")) {
                textView.setText(bundle.getString(".title"));
            }
            if (bundle.containsKey(".title_color")) {
                int[] intArray3 = bundle.getIntArray(".title_color");
                textView.setTextColor(aVar2.b6(intArray3 != null ? rl3.s0(intArray3) : null));
            }
            aVar2.l = this.g.get(i);
        }
    }
}
