package xsna;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.vas.design.view.VKStickerPackView;
import com.vkontakte.android.R;

/* compiled from: StickersStylesAdapter.kt */
/* loaded from: classes6.dex */
public final class edl0 extends sxm {
    public final boolean i;
    public final PackStylesListHolder.a j;

    /* compiled from: StickersStylesAdapter.kt */
    public interface a {
        void a(qai0 qai0Var);
    }

    /* compiled from: StickersStylesAdapter.kt */
    public static final class b extends zr6 {
        public final a m;
        public final boolean n;
        public final VKStickerPackView o;
        public final TextView p;
        public final TextView q;
        public final TextView r;
        public final TextView s;
        public final CheckBox t;
        public final ImageView u;

        public b(PackStylesListHolder.a aVar, ViewGroup viewGroup, boolean z) {
            super(R.layout.stickerpack_style_item, viewGroup);
            this.m = aVar;
            this.n = z;
            this.o = (VKStickerPackView) this.itemView.findViewById(R.id.pack_image);
            this.p = (TextView) this.itemView.findViewById(R.id.badge);
            this.q = (TextView) this.itemView.findViewById(R.id.pack_title);
            this.r = (TextView) this.itemView.findViewById(R.id.pack_subtitle);
            this.s = (TextView) this.itemView.findViewById(R.id.pack_subsubtitle);
            this.t = (CheckBox) this.itemView.findViewById(R.id.pack_checkbox);
            this.u = (ImageView) this.itemView.findViewById(R.id.pack_image_selection_border);
        }

        @Override // xsna.zr6
        /* renamed from: i6, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final void h6(z690 z690Var) {
            qai0 qai0Var = z690Var.b;
            StickerStockItem stickerStockItem = qai0Var.a;
            StickerStockItem stickerStockItem2 = qai0Var.a;
            dgr0.a(this.o, stickerStockItem);
            TextView textView = this.q;
            boolean z = this.n;
            if (!z || qai0Var.c) {
                textView.setText(stickerStockItem2.d);
            } else {
                SpannableStringBuilder append = new SpannableStringBuilder(stickerStockItem2.d).append((CharSequence) "  ");
                Drawable a = m33.a(R.drawable.sticker_not_viewed_badge, this.itemView.getContext());
                if (a != null) {
                    a.setBounds(0, 0, a.getIntrinsicWidth() * 2, a.getIntrinsicHeight());
                }
                append.setSpan(a != null ? new dqa(a) : null, append.length() - 1, append.length(), 33);
                textView.setText(append);
            }
            p5l0.a(this.p, stickerStockItem.E);
            p5l0.c(this.r, this.s, stickerStockItem, z);
            boolean z2 = qai0Var.b;
            this.t.setChecked(z2);
            bwt0.p0(this.u, z2);
            jjc.g(this.itemView, new k22(23, this, z690Var));
        }
    }

    /* compiled from: StickersStylesAdapter.kt */
    public static final class c extends zr6 {
    }

    public edl0(boolean z, PackStylesListHolder.a aVar) {
        this.i = z;
        this.j = aVar;
        x0(z690.class, new svk0(this, 2));
        x0(ctm0.class, new d4r(29));
    }
}
