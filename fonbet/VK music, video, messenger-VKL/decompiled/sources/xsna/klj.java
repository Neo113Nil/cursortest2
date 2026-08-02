package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.text.NumberFormat;

/* compiled from: ContentTitlePhotosInfoItem.kt */
/* loaded from: classes5.dex */
public final class klj extends we6 {
    public final CharSequence g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final Runnable k;
    public final String l;
    public final int m;

    /* compiled from: ContentTitlePhotosInfoItem.kt */
    public static final class a extends vif0<klj> implements View.OnClickListener {
        public final TextView n;
        public final View o;
        public final TextView p;
        public final TextView q;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.photos_content_title_item, 0);
            this.n = (TextView) this.itemView.findViewById(R.id.text);
            this.o = this.itemView.findViewById(R.id.text_frame);
            this.p = (TextView) this.itemView.findViewById(R.id.count);
            TextView textView = (TextView) this.itemView.findViewById(R.id.button);
            this.q = textView;
            textView.setOnClickListener(this);
        }

        @Override // xsna.vif0
        public final void i6(klj kljVar) {
            klj kljVar2 = kljVar;
            boolean z = kljVar2.i;
            this.n.setText(kljVar2.g);
            String format = NumberFormat.getInstance().format(Integer.valueOf(kljVar2.h));
            TextView textView = this.p;
            textView.setText(format);
            if (kljVar2.k != null) {
                this.o.setOnClickListener(this);
            }
            int i = z ? 0 : 8;
            TextView textView2 = this.q;
            textView2.setVisibility(i);
            if (z) {
                textView2.setText(kljVar2.l);
            }
            if (kljVar2.j) {
                textView.setBackground(m33.a(R.drawable.bg_photo_tags_counter, this.itemView.getContext()));
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(iah0.a(8));
                textView.setTextColor(-1);
            } else {
                textView.setBackground(null);
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(iah0.a(2));
                jno0.c(textView, R.attr.vk_legacy_text_secondary);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view == this.o) {
                Runnable runnable = ((klj) this.m).k;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            if (view == this.q) {
                ((klj) this.m).getClass();
                Runnable runnable2 = ((klj) this.m).k;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }
    }

    public /* synthetic */ klj(String str, int i, boolean z, Runnable runnable, int i2) {
        this((CharSequence) str, i, z, false, (i2 & 16) != 0 ? null : runnable);
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int e() {
        return 0;
    }

    @Override // xsna.we6
    public final String f(int i) {
        return null;
    }

    @Override // xsna.we6
    public final int h() {
        return this.m;
    }

    public klj(CharSequence charSequence, int i, boolean z, boolean z2, Runnable runnable) {
        this.g = charSequence;
        this.h = i;
        this.i = z;
        this.j = z2;
        this.k = runnable;
        this.l = y8g0.e(R.string.show_all);
        this.m = -25;
    }
}
