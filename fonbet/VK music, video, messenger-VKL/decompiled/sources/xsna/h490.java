package xsna;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.PhotoStripView;
import com.vk.core.view.links.LinkedTextView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.grishka.appkit.views.UsableRecyclerView;

/* compiled from: OverviewInfoItem.kt */
/* loaded from: classes5.dex */
public final class h490 extends we6 {
    public final b g;
    public final CharSequence h;
    public final int i;
    public final int j;
    public final int k;
    public final kgb l;
    public final ld m;
    public final int n;
    public final ArrayList<String> o;
    public final int p;
    public final int q;

    /* compiled from: OverviewInfoItem.kt */
    public static class a extends vif0<h490> implements UsableRecyclerView.j {
        public final TextView n;
        public final VKImageView o;
        public final PhotoStripView p;
        public final ImageView q;
        public final u01 r;

        public a(int i, ViewGroup viewGroup) {
            super(viewGroup, i, 0);
            TextView textView = (TextView) this.itemView.findViewById(R.id.text);
            this.n = textView;
            this.o = (VKImageView) this.itemView.findViewById(R.id.icon);
            PhotoStripView photoStripView = (PhotoStripView) this.itemView.findViewById(R.id.photos);
            this.p = photoStripView;
            this.q = (ImageView) this.itemView.findViewById(R.id.image_after_text);
            new Rect();
            this.r = new u01(this, 9);
            if (photoStripView != null) {
                photoStripView.setOverlapOffset(0.8f);
            }
            if (photoStripView != null) {
                WeakHashMap weakHashMap = j6r0.a;
                photoStripView.setPadding(iah0.a(2.0f));
            }
            if (textView instanceof LinkedTextView) {
                ((LinkedTextView) textView).setHighlightColor(dhr0.t.c(R.attr.vk_legacy_accent));
            }
        }

        @Override // xsna.vif0
        public final void i6(h490 h490Var) {
            h490 h490Var2 = h490Var;
            ArrayList<String> arrayList = h490Var2.o;
            int i = h490Var2.k;
            int i2 = h490Var2.i;
            boolean z = h490Var2.l != null;
            ld ldVar = h490Var2.m;
            if (ldVar != null) {
                ldVar.invoke();
            }
            if (z) {
                this.itemView.setOnClickListener(this.r);
            } else {
                this.itemView.setOnClickListener(null);
            }
            this.itemView.setClickable(z);
            this.itemView.setEnabled(z);
            int c = i2 != 0 ? i2 : dhr0.t.c(h490Var2.q);
            TextView textView = this.n;
            textView.setTextColor(c);
            textView.setText(h490Var2.h);
            ImageView imageView = this.q;
            if (i != 0) {
                baf0 baf0Var = i2 != 0 ? new baf0(dhr0.t.a(i), i2) : dhr0.t.b(i, R.attr.vk_legacy_icon_tertiary);
                if (imageView != null) {
                    imageView.setImageDrawable(baf0Var);
                }
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            } else if (imageView != null) {
                imageView.setVisibility(8);
            }
            b bVar = h490Var2.g;
            ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_24DP;
            bVar.getClass();
            VKImageView vKImageView = this.o;
            vKImageView.getBackend().t();
            vKImageView.clearColorFilter();
            vKImageView.O0(bVar.a, imageScreenSize);
            int size = arrayList.size();
            PhotoStripView photoStripView = this.p;
            if (size == 0) {
                if (photoStripView != null) {
                    photoStripView.setVisibility(8);
                }
            } else {
                if (photoStripView != null) {
                    photoStripView.setVisibility(0);
                }
                if (photoStripView != null) {
                    photoStripView.l(-1, arrayList);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.j
        public final boolean isEnabled() {
            ((h490) this.m).getClass();
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // me.grishka.appkit.views.UsableRecyclerView.e
        public final void onClick() {
            ((h490) this.m).getClass();
        }
    }

    /* compiled from: OverviewInfoItem.kt */
    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }
    }

    public h490() {
        throw null;
    }

    public h490(b bVar, CharSequence charSequence, int i, int i2, kgb kgbVar, ld ldVar) {
        this.g = bVar;
        this.h = charSequence;
        this.i = i;
        this.j = i2;
        this.k = R.drawable.vk_icon_chevron_16;
        this.l = kgbVar;
        this.m = ldVar;
        this.n = -26;
        ArrayList<String> arrayList = new ArrayList<>();
        this.o = arrayList;
        this.p = arrayList.size();
        this.q = R.attr.vk_legacy_text_subhead;
    }

    @Override // xsna.we6
    public final vif0<h490> a(ViewGroup viewGroup) {
        return new a(this.j, viewGroup);
    }

    @Override // xsna.we6
    public final int e() {
        return this.p;
    }

    @Override // xsna.we6
    public final String f(int i) {
        return this.o.get(i);
    }

    @Override // xsna.we6
    public final int h() {
        return this.n;
    }
}
