package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.external.miniapp.net.app.ProfileItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.catalog.SectionAppItem;
import com.vk.superapp.api.dto.app.catalog.UserStack;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;
import xsna.x7a;

/* compiled from: HorizontalCellListHolder.kt */
/* loaded from: classes6.dex */
public final class zcv extends e9r0<x7a.d.c.b> {
    public static final int o = iah0.a(8);
    public static final float p = iah0.b(0.5f);
    public final RecyclerView m;
    public final b n;

    /* compiled from: HorizontalCellListHolder.kt */
    public static final class a extends RecyclerView.e0 {
        public final VkRichCell l;
        public final TextView m;
        public final VkPicture n;
        public final VkImage o;
        public final bpn0 p;
        public SectionAppItem q;

        /* compiled from: HorizontalCellListHolder.kt */
        /* renamed from: xsna.zcv$a$a, reason: collision with other inner class name */
        public static final class C4175a implements VkCell.d {
            public final Context a;
            public final Object b = msy.a(LazyThreadSafetyMode.NONE, new w8q(this, 11));

            public C4175a(Context context) {
                this.a = context;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.core.view.components.cell.VkCell.d
            public final void a(VkCell.f fVar) {
                if (fVar instanceof c) {
                    ((VkImage) this.b.getValue()).o0(((c) fVar).a, null);
                }
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // com.vk.core.view.components.cell.VkCell.d
            public final View getView() {
                return (VkImage) this.b.getValue();
            }
        }

        /* compiled from: HorizontalCellListHolder.kt */
        public static final class b implements VkCell.e {
            @Override // com.vk.core.view.components.cell.VkCell.e
            public final VkCell.d create(Context context) {
                return new C4175a(context);
            }
        }

        /* compiled from: HorizontalCellListHolder.kt */
        public static final class c implements VkCell.f {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                String str = this.a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("LeftImageParams(url="), this.a, ')');
            }
        }

        public a(View view, k8r0 k8r0Var) {
            super(view);
            VkRichCell vkRichCell = (VkRichCell) this.itemView.findViewById(R.id.cell);
            this.l = vkRichCell;
            this.m = (TextView) this.itemView.findViewById(R.id.badge);
            VkPicture vkPicture = (VkPicture) this.itemView.findViewById(R.id.dot);
            this.n = vkPicture;
            VkImage vkImage = (VkImage) this.itemView.findViewById(R.id.messenger_badge);
            this.o = vkImage;
            this.p = new bpn0(new bu0(14));
            awt0.o(view, new bje(view, 1));
            jjc.g(view, new du0(13, k8r0Var, this));
            vkRichCell.setLeftMainPictureController(new b());
            vkImage.setPlaceholderImage(R.drawable.vk_message_badge_24);
            vkPicture.setPlaceholderImage(R.drawable.vk_menu_dot_badge_bg);
            vkPicture.setRound(true);
        }
    }

    /* compiled from: HorizontalCellListHolder.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final k8r0 c;
        public final ArrayList d = new ArrayList();

        public b(k8r0 k8r0Var) {
            this.c = k8r0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            qgv0 qgv0Var;
            tgv0.a aVar2;
            a aVar3 = aVar;
            SectionAppItem sectionAppItem = (SectionAppItem) this.d.get(i);
            aVar3.q = sectionAppItem;
            VkRichCell vkRichCell = aVar3.l;
            VkCell.Left.a aVar4 = VkCell.Left.Companion;
            WebApiApplication webApiApplication = sectionAppItem.b;
            vkRichCell.setLeft(VkCell.Left.a.a(aVar4, new VkCell.Left.Main.d(new a.c(webApiApplication.d.a(278).b), VkCell.Left.Main.Size.Medium)));
            tlo0.h d = oq.d(tlo0.Companion, webApiApplication.c);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, (ngv0) null, 1, 6);
            UserStack userStack = sectionAppItem.g;
            if (userStack == null) {
                String str = webApiApplication.h;
                if (str == null) {
                    str = "";
                }
                qgv0Var = new qgv0(new tlo0.h(str), (ngv0.a) null, (ngv0.a) null, 1, 6);
            } else {
                qgv0Var = null;
            }
            if (userStack != null) {
                qzq0 qzq0Var = (qzq0) aVar3.p.getValue();
                List<ProfileItem> list = userStack.c;
                int i2 = qzq0.a;
                qzq0Var.getClass();
                aVar2 = new tgv0.a(qzq0.a(i2, list), 3, new tlo0.h(userStack.b), null, null, 120);
            } else {
                aVar2 = null;
            }
            vkRichCell.setMiddle(ahn.v(vgv0Var, null, qgv0Var, null, aVar2, null, null, 490));
            BadgeInfo badgeInfo = sectionAppItem.e;
            VkImage vkImage = aVar3.o;
            VkPicture vkPicture = aVar3.n;
            TextView textView = aVar3.m;
            String str2 = badgeInfo != null ? badgeInfo.b : null;
            int i3 = badgeInfo != null ? badgeInfo.e : 0;
            boolean z = badgeInfo != null ? badgeInfo.c : false;
            boolean z2 = badgeInfo != null ? badgeInfo.d : false;
            boolean z3 = badgeInfo != null ? badgeInfo.g : false;
            if (i3 > 0) {
                f4m.j(textView);
                f4m.j(vkPicture);
                f4m.j(vkImage);
                vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.d(i3, VkCounter.CounterAppearance.Appearance.AccentRed, 4), null, null, null, 30));
                return;
            }
            if (z2) {
                f4m.j(textView);
                vkRichCell.setRight((VkCell.Right.d) null);
                f4m.j(vkImage);
                vkPicture.setVisibility(0);
                return;
            }
            if (str2 != null && !drm0.N(str2)) {
                vkRichCell.setRight((VkCell.Right.d) null);
                f4m.j(vkPicture);
                f4m.j(vkImage);
                textView.setVisibility(0);
                textView.setText(str2);
                textView.setBackground(krv0.e(R.drawable.vk_app_catalog_bg_red, textView.getContext()));
                return;
            }
            if (z) {
                vkRichCell.setRight((VkCell.Right.d) null);
                f4m.j(vkPicture);
                f4m.j(vkImage);
                textView.setVisibility(0);
                textView.setText(R.string.vk_super_app_new_label);
                textView.setBackground(krv0.e(R.drawable.vk_app_catalog_bg_blue, textView.getContext()));
                return;
            }
            if (z3) {
                vkRichCell.setRight((VkCell.Right.d) null);
                f4m.j(vkPicture);
                f4m.j(textView);
                vkImage.setVisibility(0);
                return;
            }
            f4m.j(textView);
            vkRichCell.setRight((VkCell.Right.d) null);
            f4m.j(vkPicture);
            f4m.j(vkImage);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(tf3.b(viewGroup, R.layout.vk_item_apps_catalog_horizontal_cell_list_item, viewGroup, false), this.c);
        }
    }

    public zcv(ViewGroup viewGroup, u8r0 u8r0Var) {
        super(R.layout.vk_item_apps_catalog_recycler, viewGroup);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.horizontal_cell_apps_recycler);
        this.m = recyclerView;
        b bVar = new b(u8r0Var);
        this.n = bVar;
        int a2 = e3m.a(R.dimen.vk_app_catalog_horizontal_grid_horizontal_padding, recyclerView.getContext());
        awt0.x(recyclerView, a2, 0, a2, o, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2, 0));
        recyclerView.setAdapter(bVar);
    }

    @Override // xsna.v96
    public final void W5(Object obj) {
        List<SectionAppItem> list = ((x7a.d.c.b) obj).f;
        if (list.size() == 1) {
            RecyclerView recyclerView = this.m;
            recyclerView.getContext();
            recyclerView.setLayoutManager(new GridLayoutManager(1, 0));
        }
        b bVar = this.n;
        ArrayList arrayList = bVar.d;
        m.d a2 = androidx.recyclerview.widget.m.a(new p1i0(arrayList, list), true);
        arrayList.clear();
        arrayList.addAll(list);
        a2.b(bVar);
    }
}
