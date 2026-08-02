package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebCatalogBanner;
import com.vk.superapp.api.dto.app.AppsSection;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AppItemsAdapter.kt */
/* loaded from: classes6.dex */
public final class t53 extends RecyclerView.Adapter<r53<?>> implements vic, jjv0 {
    public static final int f;
    public static final int h;
    public static final float j;
    public final boolean c;
    public final ehn0 d;
    public final ArrayList e = new ArrayList();
    public static final int g = iah0.a(4);
    public static final int i = iah0.a(8);
    public static final int k = iah0.a(0.5f);

    /* compiled from: AppItemsAdapter.kt */
    public final class a extends r53<s80> {
        public final C3719a m;

        /* compiled from: AppItemsAdapter.kt */
        /* renamed from: xsna.t53$a$a, reason: collision with other inner class name */
        public final class C3719a extends RecyclerView.Adapter<b> {
            public List<tdx0> c = EmptyList.b;

            public C3719a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemCount() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final void onBindViewHolder(b bVar, int i) {
                bVar.V5(this.c.get(i));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new b(a.this, viewGroup);
            }
        }

        /* compiled from: AppItemsAdapter.kt */
        public final class b extends r53<tdx0> {
            public final VKImageController<View> m;

            public b(a aVar, ViewGroup viewGroup) {
                super(R.layout.vk_item_apps_activity, viewGroup);
                FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.icon);
                jjc.g(this.itemView, new defpackage.y(2, this, t53.this));
                ifx0 ifx0Var = e370.c;
                VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
                this.m = create;
                frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
            }

            @Override // xsna.r53
            public final void W5(tdx0 tdx0Var) {
                throw null;
            }
        }

        public a(ViewGroup viewGroup) {
            super(R.layout.vk_item_apps_activities_list, viewGroup);
            C3719a c3719a = new C3719a();
            this.m = c3719a;
            RecyclerView recyclerView = (RecyclerView) this.itemView;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(3, 1));
            recyclerView.setAdapter(c3719a);
        }

        @Override // xsna.r53
        public final void W5(s80 s80Var) {
            C3719a c3719a = this.m;
            c3719a.c = null;
            c3719a.notifyDataSetChanged();
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public class b extends r53<q53> {
        public final TextView m;
        public final TextView n;
        public final TextView o;
        public final VKImageController<View> p;

        public b() {
            throw null;
        }

        public b(t53 t53Var, ViewGroup viewGroup) {
            super(R.layout.vk_item_app, viewGroup);
            FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.icon);
            this.m = (TextView) this.itemView.findViewById(R.id.title);
            this.n = (TextView) this.itemView.findViewById(R.id.subtitle);
            this.o = (TextView) this.itemView.findViewById(R.id.counter);
            View view = this.itemView;
            t5 t5Var = new t5(this, 4);
            int i = t53.f;
            jjc.g(view, new s53(0, t5Var, t53Var));
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
            this.p = create;
            frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
        }

        @Override // xsna.r53
        public final void W5(q53 q53Var) {
            q53 q53Var2 = q53Var;
            if (q53Var2 == null) {
                return;
            }
            WebApiApplication webApiApplication = q53Var2.b;
            String str = webApiApplication.c;
            String str2 = webApiApplication.n;
            String str3 = webApiApplication.h;
            this.m.setText(str);
            TextView textView = this.n;
            if (str3 == null || str3.length() == 0) {
                f4m.j(textView);
            } else {
                textView.setVisibility(0);
                textView.setText(str3);
            }
            TextView textView2 = this.o;
            if (str2 != null && str2.length() != 0) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setText(str2);
                }
            } else if (textView2 != null) {
                f4m.j(textView2);
            }
            this.p.f(webApiApplication.d.a(278).b, new VKImageController.b(10.0f, null, false, R.drawable.vk_default_placeholder_10, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65518));
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public abstract class c<T> extends r53<T> {
        public final RecyclerView m;

        /* compiled from: AppItemsAdapter.kt */
        public abstract class a<VH extends r53<WebApiApplication>> extends RecyclerView.Adapter<VH> {
            public List<WebApiApplication> c;

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemCount() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
                ((r53) e0Var).V5(this.c.get(i));
            }
        }

        public c(ViewGroup viewGroup) {
            super(R.layout.vk_item_apps_carousel, viewGroup);
            RecyclerView recyclerView = (RecyclerView) this.itemView;
            this.m = recyclerView;
            recyclerView.setHasFixedSize(true);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.addItemDecoration(new u53());
            int i = t53.f;
            recyclerView.setPadding(i, t53.g, i, t53.h);
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public final class d extends c<ju9> {
        public final b n;

        /* compiled from: AppItemsAdapter.kt */
        public class a extends r53<WebApiApplication> {
            public final TextView m;
            public final TextView n;
            public final VKImageController<View> o;

            public a(d dVar, ViewGroup viewGroup) {
                super(R.layout.vk_item_carousel_banner_app, viewGroup);
                VKReplacerView vKReplacerView = (VKReplacerView) this.itemView.findViewById(R.id.icon);
                this.m = (TextView) this.itemView.findViewById(R.id.title);
                this.n = (TextView) this.itemView.findViewById(R.id.description);
                t53 t53Var = t53.this;
                View view = this.itemView;
                j1 j1Var = new j1(this, 4);
                int i = t53.f;
                jjc.g(view, new s53(0, j1Var, t53Var));
                ifx0 ifx0Var = e370.c;
                VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
                this.o = create;
                vKReplacerView.a(((com.vk.core.ui.image.c) create).getView());
            }

            @Override // xsna.r53
            public final void W5(WebApiApplication webApiApplication) {
                WebApiApplication webApiApplication2 = webApiApplication;
                this.o.f(webApiApplication2.d.a(278).b, new VKImageController.b(10.0f, null, false, R.drawable.vk_default_placeholder_10, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65518));
                String str = webApiApplication2.c;
                TextView textView = this.m;
                textView.setText(str);
                WebCatalogBanner webCatalogBanner = webApiApplication2.G;
                if (webCatalogBanner != null) {
                    int i = webCatalogBanner.b;
                    String str2 = webCatalogBanner.e;
                    textView.setTextColor(webCatalogBanner.c);
                    boolean N = drm0.N(str2);
                    TextView textView2 = this.n;
                    if (N) {
                        f4m.j(textView2);
                    } else {
                        textView2.setText(str2);
                        textView2.setTextColor(webCatalogBanner.d);
                        textView2.setVisibility(0);
                    }
                    String str3 = webCatalogBanner.f;
                    if (str3 == null) {
                        a6(i);
                        return;
                    }
                    Context context = this.itemView.getContext();
                    ifx0 ifx0Var = e370.c;
                    if (ifx0Var == null) {
                        ifx0Var = null;
                    }
                    sa30.c(ifx0Var.d().a(this.itemView.getMeasuredWidth(), this.itemView.getMeasuredHeight(), str3)).subscribe(new f40(new v53(0, this, context), 1), new bw(new w53(this, i, 0), 5));
                }
            }

            public final void a6(int i) {
                View view = this.itemView;
                view.setBackground(vjo.a(view.getContext(), i, 0, t53.k, t53.j, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 428));
            }
        }

        /* compiled from: AppItemsAdapter.kt */
        public static final class b extends c<ju9>.a<a> {
            public b() {
                this.c = EmptyList.b;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new a(d.this, viewGroup);
            }
        }

        public d(ViewGroup viewGroup) {
            super(viewGroup);
            b bVar = new b();
            this.n = bVar;
            this.m.setAdapter(bVar);
        }

        @Override // xsna.r53
        public final void W5(Object obj) {
            List<WebApiApplication> list = ((ju9) obj).b;
            b bVar = this.n;
            bVar.c = list;
            bVar.notifyDataSetChanged();
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public final class e extends r53<wu9> {
        public final a m;

        /* compiled from: AppItemsAdapter.kt */
        public final class a extends RecyclerView.Adapter<b> {
            public List<WebApiApplication> c = EmptyList.b;

            public a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemCount() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final void onBindViewHolder(b bVar, int i) {
                bVar.V5(this.c.get(i));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new b(e.this, viewGroup);
            }
        }

        /* compiled from: AppItemsAdapter.kt */
        public final class b extends r53<WebApiApplication> {
            public final TextView m;
            public final VKImageController<View> n;

            public b(e eVar, ViewGroup viewGroup) {
                super(R.layout.vk_menu_fragment_apps_item_app, viewGroup);
                FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.icon);
                this.m = (TextView) this.itemView.findViewById(R.id.title);
                t53 t53Var = t53.this;
                View view = this.itemView;
                hd hdVar = new hd(this, 3);
                int i = t53.f;
                jjc.g(view, new s53(0, hdVar, t53Var));
                ifx0 ifx0Var = e370.c;
                VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
                this.n = create;
                frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
            }

            @Override // xsna.r53
            public final void W5(WebApiApplication webApiApplication) {
                WebApiApplication webApiApplication2 = webApiApplication;
                this.n.f(webApiApplication2.d.a(278).b, new VKImageController.b(14.0f, null, false, R.drawable.vk_default_placeholder_10, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65518));
                this.m.setText(webApiApplication2.c);
            }
        }

        public e(ViewGroup viewGroup) {
            super(R.layout.vk_item_apps_carousel, viewGroup);
            a aVar = new a();
            this.m = aVar;
            RecyclerView recyclerView = (RecyclerView) this.itemView;
            recyclerView.setHasFixedSize(true);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.setAdapter(aVar);
        }

        @Override // xsna.r53
        public final void W5(wu9 wu9Var) {
            List<WebApiApplication> list = wu9Var.b;
            a aVar = this.m;
            aVar.c = list;
            aVar.notifyDataSetChanged();
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public final class f extends r53<lxu> implements View.OnClickListener {
        public final TextView m;
        public final ImageView n;
        public final TextView o;

        /* compiled from: AppItemsAdapter.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(View view) {
                ((f) this.receiver).onClick(view);
                return s3q0.a;
            }
        }

        /* compiled from: AppItemsAdapter.kt */
        public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<View, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(View view) {
                ((f) this.receiver).onClick(view);
                return s3q0.a;
            }
        }

        /* compiled from: AppItemsAdapter.kt */
        public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<View, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(View view) {
                ((f) this.receiver).onClick(view);
                return s3q0.a;
            }
        }

        public f(ViewGroup viewGroup) {
            super(R.layout.vk_apps_fragment_header_item, viewGroup);
            TextView textView = (TextView) this.itemView.findViewById(R.id.button);
            this.m = textView;
            ImageView imageView = (ImageView) this.itemView.findViewById(R.id.clear_button);
            this.n = imageView;
            this.o = (TextView) this.itemView.findViewById(R.id.title);
            jjc.g(this.itemView, new a(1, this, f.class, "onClick", "onClick(Landroid/view/View;)V", 0));
            jjc.g(textView, new b(1, this, f.class, "onClick", "onClick(Landroid/view/View;)V", 0));
            jjc.g(imageView, new c(1, this, f.class, "onClick", "onClick(Landroid/view/View;)V", 0));
        }

        @Override // xsna.r53
        public final void W5(lxu lxuVar) {
            AppsSection appsSection = lxuVar.b;
            this.o.setText(appsSection.d);
            boolean f = epx.f(appsSection.b, "recent");
            ImageView imageView = this.n;
            TextView textView = this.m;
            if (f) {
                f4m.j(textView);
                imageView.setVisibility(0);
            } else if (appsSection.d()) {
                textView.setVisibility(0);
                f4m.j(imageView);
            } else {
                f4m.j(textView);
                f4m.j(imageView);
            }
            this.itemView.setClickable(textView.getVisibility() == 0);
            enj.a(imageView.getDrawable(), R.id.layer_icon, e3m.f(R.attr.vk_ui_icon_medium, this.itemView.getContext()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ehn0 ehn0Var = t53.this.d;
            lxu lxuVar = (lxu) this.l;
            if (lxuVar == null) {
                return;
            }
            AppsSection appsSection = lxuVar.b;
            if (appsSection.b.equals("recent")) {
                ehn0Var.e();
            } else if (appsSection.d()) {
                ehn0Var.f(appsSection.b, appsSection.d);
            }
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public final class g extends r53<eez> {
        public final a m;
        public final LinearLayoutManager n;
        public final int o;

        /* compiled from: AppItemsAdapter.kt */
        public final class a extends RecyclerView.Adapter<b> {
            public List<WebApiApplication> c = EmptyList.b;

            public a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final int getItemCount() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final void onBindViewHolder(b bVar, int i) {
                bVar.V5(this.c.get(i));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
                return new b(g.this, viewGroup);
            }
        }

        /* compiled from: AppItemsAdapter.kt */
        public final class b extends r53<WebApiApplication> {
            public final TextView m;
            public final TextView n;
            public final TextView o;
            public final VKImageController<View> p;

            public b(g gVar, ViewGroup viewGroup) {
                super(R.layout.vk_menu_fragment_apps_list_item_app, viewGroup);
                FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.app_image);
                this.m = (TextView) this.itemView.findViewById(R.id.app_title);
                this.n = (TextView) this.itemView.findViewById(R.id.app_subtitle);
                this.o = (TextView) this.itemView.findViewById(R.id.counter);
                t53 t53Var = t53.this;
                View view = this.itemView;
                com.vk.movika.sdk.base.ui.f fVar = new com.vk.movika.sdk.base.ui.f(this, 4);
                int i = t53.f;
                jjc.g(view, new s53(0, fVar, t53Var));
                ifx0 ifx0Var = e370.c;
                VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
                this.p = create;
                frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
            }

            @Override // xsna.r53
            public final void W5(WebApiApplication webApiApplication) {
                WebApiApplication webApiApplication2 = webApiApplication;
                this.p.f(webApiApplication2.d.a(278).b, new VKImageController.b(10.0f, null, false, R.drawable.vk_default_placeholder_10, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65518));
                this.m.setText(webApiApplication2.c);
                this.n.setText(webApiApplication2.h);
                String str = webApiApplication2.n;
                TextView textView = this.o;
                if (str == null || str.length() == 0) {
                    f4m.j(textView);
                } else {
                    textView.setVisibility(0);
                    textView.setText(str);
                }
            }
        }

        public g(ViewGroup viewGroup) {
            super(R.layout.vk_item_apps_list_carousel, viewGroup);
            LinearLayoutManager gridLayoutManager;
            a aVar = new a();
            this.m = aVar;
            this.o = 3;
            if (t53.this.c) {
                viewGroup.getContext();
                gridLayoutManager = new LinearLayoutManager(1, false);
            } else {
                viewGroup.getContext();
                gridLayoutManager = new GridLayoutManager(3, 0);
            }
            this.n = gridLayoutManager;
            RecyclerView recyclerView = (RecyclerView) this.itemView;
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(gridLayoutManager);
            recyclerView.setAdapter(aVar);
        }

        @Override // xsna.r53
        public final void W5(eez eezVar) {
            List<WebApiApplication> list = eezVar.b;
            a aVar = this.m;
            aVar.c = list;
            aVar.notifyDataSetChanged();
            LinearLayoutManager linearLayoutManager = this.n;
            if (linearLayoutManager instanceof GridLayoutManager) {
                ((GridLayoutManager) linearLayoutManager).setSpanCount(Math.min(list.size(), this.o));
            }
        }
    }

    /* compiled from: AppItemsAdapter.kt */
    public static final class h extends m.b {
        public final List<d56> b;
        public final List<d56> c;

        public h(ArrayList arrayList, List list) {
            this.b = arrayList;
            this.c = list;
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areContentsTheSame(int i, int i2) {
            d56 d56Var = this.b.get(i);
            d56 d56Var2 = this.c.get(i2);
            return d56Var.c() == d56Var2.c() && d56Var.a == d56Var2.a && d56Var.a(d56Var2);
        }

        @Override // androidx.recyclerview.widget.m.b
        public final boolean areItemsTheSame(int i, int i2) {
            d56 d56Var = this.b.get(i);
            d56 d56Var2 = this.c.get(i2);
            return d56Var.c() == d56Var2.c() && d56Var.b(d56Var2);
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

    static {
        float f2 = 16;
        f = iah0.a(f2);
        h = iah0.a(f2);
        j = iah0.a(r0);
    }

    public t53(boolean z, ehn0 ehn0Var) {
        this.c = z;
        this.d = ehn0Var;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.e.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i2) {
        return ((d56) this.e.get(i2)).c();
    }

    @Override // xsna.jjv0
    @SuppressLint({"WrongConstant"})
    public final int n1(int i2) {
        ArrayList arrayList = this.e;
        if (i2 < arrayList.size() && i2 >= 0) {
            d56 d56Var = (d56) arrayList.get(i2);
            boolean z = i2 > 0 && (arrayList.get(i2 + (-1)) instanceof ju9);
            if ((d56Var instanceof lxu) && !z && i2 != 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(r53<?> r53Var, int i2) {
        r53<?> r53Var2 = r53Var;
        boolean z = r53Var2 instanceof f;
        ArrayList arrayList = this.e;
        if (z) {
            ((f) r53Var2).V5((lxu) arrayList.get(i2));
            return;
        }
        if (r53Var2 instanceof e) {
            ((e) r53Var2).V5((wu9) arrayList.get(i2));
            return;
        }
        if (r53Var2 instanceof d) {
            ((d) r53Var2).V5((ju9) arrayList.get(i2));
            return;
        }
        if (r53Var2 instanceof g) {
            ((g) r53Var2).V5((eez) arrayList.get(i2));
        } else if (r53Var2 instanceof a) {
            ((a) r53Var2).V5((s80) arrayList.get(i2));
        } else if (r53Var2 instanceof b) {
            ((b) r53Var2).V5((q53) arrayList.get(i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final r53<?> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            return new f(viewGroup);
        }
        if (i2 == 1) {
            return new b(this, viewGroup);
        }
        if (i2 == 2) {
            return new e(viewGroup);
        }
        if (i2 == 3) {
            return new d(viewGroup);
        }
        if (i2 == 4) {
            return new g(viewGroup);
        }
        if (i2 == 5) {
            return new a(viewGroup);
        }
        throw new IllegalArgumentException("Unsupported item viewType");
    }

    @Override // xsna.jjv0
    public final int t(int i2) {
        ArrayList arrayList = this.e;
        boolean z = false;
        if (i2 >= arrayList.size() || i2 < 0) {
            return 0;
        }
        d56 d56Var = (d56) arrayList.get(i2);
        if (i2 > 0 && (arrayList.get(i2 - 1) instanceof q53)) {
            z = true;
        }
        return iah0.a(((d56Var instanceof lxu) && z) ? 7 : 4);
    }
}
