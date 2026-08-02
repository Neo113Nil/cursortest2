package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.e3m;

/* compiled from: DetailsInfoItem.kt */
/* loaded from: classes5.dex */
public final class p4m extends we6 {
    public String g;
    public lhq0 h;
    public int j;
    public final int m;
    public final int n;
    public final qe3 i = new qe3(18);
    public int k = R.attr.vk_ui_text_subhead;
    public final int l = R.attr.vk_ui_icon_secondary;

    /* compiled from: DetailsInfoItem.kt */
    public static class a extends vif0<p4m> implements UsableRecyclerView.j {
        public final AppCompatTextView n;
        public final ImageView o;

        public a(ViewGroup viewGroup, int i) {
            super(viewGroup, i, 0);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.text);
            appCompatTextView.setEmojiCompatEnabled(false);
            this.n = appCompatTextView;
            this.o = (ImageView) this.itemView.findViewById(R.id.icon);
            Context context = this.itemView.getContext();
            e3m.a aVar = e3m.a;
            appCompatTextView.setHighlightColor(l8g.g(context.getColor(R.color.vk_blue_400), 40));
        }

        @Override // xsna.vif0
        public final void i6(p4m p4mVar) {
            Drawable drawable;
            p4m p4mVar2 = p4mVar;
            p4mVar2.i.getClass();
            s3q0 s3q0Var = s3q0.a;
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(p4mVar2.g);
            AppCompatTextView appCompatTextView = this.n;
            appCompatTextView.setText(i);
            int i2 = p4mVar2.k;
            if (i2 != 0) {
                jno0.c(appCompatTextView, i2);
            }
            appCompatTextView.setTextIsSelectable(false);
            if (p4mVar2.j != 0) {
                Context context = this.itemView.getContext();
                int i3 = p4mVar2.j;
                e3m.a aVar = e3m.a;
                drawable = m33.a(i3, context);
            } else {
                drawable = null;
            }
            ImageView imageView = this.o;
            if (drawable != null) {
                int i4 = p4mVar2.l;
                if (i4 > 0) {
                    omw.b(imageView, i4);
                } else {
                    imageView.clearColorFilter();
                }
                imageView.setVisibility(0);
                imageView.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
            int i5 = p4mVar2.n;
            if (i5 > 0) {
                appCompatTextView.setMaxLines(i5);
            } else {
                appCompatTextView.setMaxLines(Integer.MAX_VALUE);
            }
            if (p4mVar2.h != null) {
                bwt0.i0(this.itemView, new ekh(p4mVar2, this));
                this.itemView.setBackgroundResource(R.drawable.highlight);
            } else {
                this.itemView.setBackground(null);
                this.itemView.setOnClickListener(null);
            }
            this.itemView.setClickable(p4mVar2.h != null);
            this.itemView.setLongClickable(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.j
        public final boolean isEnabled() {
            return ((p4m) this.m).h != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            lhq0 lhq0Var = ((p4m) this.m).h;
            if (lhq0Var != null) {
                lhq0Var.onClick(this.itemView);
            }
        }
    }

    public p4m() {
        UserId.b bVar = UserId.c;
        this.m = R.layout.item_details_info;
        this.n = -1;
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        return new a(viewGroup, this.m);
    }

    @Override // xsna.we6
    public final int h() {
        return -1001;
    }
}
