package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.vmoji.character.model.ImageListModel;
import com.vk.vmoji.character.model.VmojiPrice;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import java.util.WeakHashMap;

/* compiled from: VmojiCharacterBuyContainer.kt */
/* loaded from: classes7.dex */
public final class f6w0 {
    public final ViewGroup a;
    public final a b;
    public final VKImageView c;
    public final TextView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final DecelerateInterpolator j;

    /* compiled from: VmojiCharacterBuyContainer.kt */
    public interface a {
        void a();

        void b(VmojiProductModel vmojiProductModel);

        void c(VmojiProductModel vmojiProductModel);
    }

    /* compiled from: VmojiCharacterBuyContainer.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ f6w0 c;

        public b(boolean z, f6w0 f6w0Var) {
            this.b = z;
            this.c = f6w0Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            bwt0.p0(this.c.a, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.b) {
                bwt0.p0(this.c.a, true);
            }
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class c implements View.OnLayoutChangeListener {
        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            f6w0 f6w0Var = f6w0.this;
            ViewGroup viewGroup = f6w0Var.a;
            viewGroup.setTranslationY(viewGroup.getTranslationY() + f6w0Var.a.getMeasuredHeight());
            bwt0.p0(f6w0Var.a, false);
        }
    }

    public f6w0(ViewGroup viewGroup, a aVar) {
        this.a = viewGroup;
        this.b = aVar;
        VKImageView vKImageView = (VKImageView) viewGroup.findViewById(R.id.icon);
        this.c = vKImageView;
        this.d = (TextView) viewGroup.findViewById(R.id.badge);
        this.e = (ImageView) viewGroup.findViewById(R.id.state);
        this.f = (TextView) viewGroup.findViewById(R.id.buy_item_title);
        this.g = (TextView) viewGroup.findViewById(R.id.buy_item_description);
        this.h = (TextView) viewGroup.findViewById(R.id.buy_item_button);
        this.i = viewGroup.findViewById(R.id.try_on_item_button);
        this.j = new DecelerateInterpolator(2.0f);
        vKImageView.setPaintFilterBitmap(true);
        jjc.g(viewGroup, new whg0(this, 29));
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (!viewGroup.isLaidOut()) {
            viewGroup.addOnLayoutChangeListener(new c());
        } else {
            viewGroup.setTranslationY(viewGroup.getTranslationY() + viewGroup.getMeasuredHeight());
            bwt0.p0(viewGroup, false);
        }
    }

    public final void a(boolean z) {
        ViewGroup viewGroup = this.a;
        int height = viewGroup.getHeight();
        if (z) {
            height = 0;
        }
        viewGroup.animate().translationY(height).setDuration(300L).setInterpolator(this.j).setListener(new b(z, this)).start();
    }

    public final void b(VmojiProductModel vmojiProductModel) {
        p8w0.e(this.e, vmojiProductModel.f);
        p8w0.b(this.d, vmojiProductModel.g);
        this.c.load(ImageListModel.Ab(vmojiProductModel.e, cn70.b(72)));
        this.f.setText(vmojiProductModel.c);
        this.g.setText(vmojiProductModel.d);
        VmojiPrice vmojiPrice = vmojiProductModel.h;
        TextView textView = this.h;
        p8w0.d(textView, vmojiPrice);
        jjc.g(textView, new c1o0(9, this, vmojiProductModel));
        boolean z = vmojiProductModel.j != null;
        View view = this.i;
        bwt0.p0(view, z);
        jjc.g(view, new isb0(14, this, vmojiProductModel));
        a(true);
    }
}
