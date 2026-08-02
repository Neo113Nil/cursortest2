package xsna;

import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkCellSkeleton;
import com.vk.core.view.components.cell.f;
import com.vk.core.view.components.group.footer.VkGroupFooter;
import com.vkontakte.android.R;
import xsna.o960;
import xsna.tlo0;

/* compiled from: WidgetSettingAdapter.kt */
/* loaded from: classes6.dex */
public final class rnx0 extends gf6<zif0> {
    public final hox0 e;

    /* compiled from: WidgetSettingAdapter.kt */
    public static final class a extends hf6<o960> {
        public final VkGroupFooter m;
        public final View n;

        public a(View view) {
            super(view);
            this.m = (VkGroupFooter) view.findViewById(R.id.group_footer);
            this.n = view.findViewById(R.id.separator_v2);
        }

        @Override // xsna.hf6
        public final void W5(o960 o960Var) {
            o960 o960Var2 = o960Var;
            if (o960Var2 instanceof o960.b) {
                VkGroupFooter.a.C0839a c0839a = new VkGroupFooter.a.C0839a(oq.d(tlo0.Companion, brm0.y(((o960.b) o960Var2).a, "\n", " ")));
                VkGroupFooter vkGroupFooter = this.m;
                vkGroupFooter.setContent(c0839a);
                f4m.t(cn70.b(20), vkGroupFooter);
                f4m.t(cn70.b(80), this.n);
            }
        }
    }

    /* compiled from: WidgetSettingAdapter.kt */
    public static final class b extends hf6<o960> {
        @Override // xsna.hf6
        public final /* bridge */ /* synthetic */ void W5(o960 o960Var) {
        }
    }

    /* compiled from: WidgetSettingAdapter.kt */
    public static final class c extends hf6<tnx0> implements View.OnClickListener {
        public static final /* synthetic */ int o = 0;
        public final zc80 m;
        public final VkCell n;

        public c(View view, hox0 hox0Var) {
            super(view);
            this.m = hox0Var;
            VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.cell);
            this.n = vkCell;
            vkCell.setOnClickListener(this);
        }

        @Override // xsna.hf6
        public final void W5(tnx0 tnx0Var) {
            VkCell.Middle.d dVar;
            qnx0 c = tnx0Var.c();
            boolean z = c.f;
            boolean z2 = !c.g;
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            VkCell.Middle.e eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, c.c), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
            String str = c.d;
            if (drm0.N(str)) {
                dVar = null;
            } else {
                dVar = new VkCell.Middle.d(new tlo0.h(str), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
            }
            VkCell.Middle.b a = VkCell.Middle.a.a(aVar, eVar, dVar, null, 12);
            VkCell vkCell = this.n;
            vkCell.setMiddle(a);
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.f(new snx0(0, this, c.class, "onCheckedChanged", "onCheckedChanged()V", 0), z, z2), null, null, null, 30));
            vkCell.setEnabled(z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a6() {
            VkCell vkCell = this.n;
            VkCell.Right.d right = vkCell.getRight();
            VkCell.Right.a.f fVar = (VkCell.Right.a.f) (right != null ? right.a : null);
            Object obj = this.l;
            this.m.Zc((tnx0) (obj != null ? obj : null), !fVar.a);
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.f(new snx0(0, this, c.class, "onCheckedChanged", "onCheckedChanged()V", 0), !fVar.a, fVar.c), null, null, null, 30));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a6();
        }
    }

    public rnx0(hox0 hox0Var) {
        super((hg6) new com.vk.lists.a(unx0.a), false);
        this.e = hox0Var;
    }

    @Override // xsna.gf6
    public final hf6 K0(int i, View view) {
        o960.a.a.getClass();
        if (i != R.layout.item_widget_setting_skeleton) {
            if (i == R.layout.vk_item_widget_settings_title) {
                return new a(view);
            }
            if (i == R.layout.new_item_widget_settings) {
                return new c(view, this.e);
            }
            throw new IllegalArgumentException(lhg.a(i, "Unsupported view type: "));
        }
        b bVar = new b(view);
        VkCellSkeleton vkCellSkeleton = (VkCellSkeleton) view.findViewById(R.id.cell_skeleton);
        f.b bVar2 = com.vk.core.view.components.cell.f.Companion;
        int b2 = cn70.b(120);
        bVar2.getClass();
        vkCellSkeleton.setMiddle(new com.vk.core.view.components.cell.e(f.b.a(b2), f.b.a(cn70.b(200)), 12));
        return bVar;
    }
}
