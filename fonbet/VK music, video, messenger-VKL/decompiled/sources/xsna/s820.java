package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.ContextUser;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: MenuView.kt */
/* loaded from: classes6.dex */
public final class s820 {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public final TextView e;
    public boolean f;
    public boolean g;
    public i5 h;
    public s2l0 i;
    public ContextUser j;
    public ViewPropertyAnimator k;
    public final AccelerateDecelerateInterpolator l = new AccelerateDecelerateInterpolator();
    public f600 m;
    public irc0 n;
    public boolean o;
    public final int p;
    public n1l0 q;

    /* compiled from: View.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ View b;
        public final /* synthetic */ s820 c;
        public final /* synthetic */ Ref$IntRef d;

        public a(View view, s820 s820Var, Ref$IntRef ref$IntRef) {
            this.b = view;
            this.c = s820Var;
            this.d = ref$IntRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            s820 s820Var = this.c;
            s820Var.k = s820Var.a().translationY(s820Var.a.getHeight() + this.d.element).withEndAction(s820Var.new b());
        }
    }

    /* compiled from: MenuView.kt */
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s820.this.g = false;
        }
    }

    public s820(LinearLayout linearLayout, TextView textView, TextView textView2, View view, TextView textView3, TextView textView4) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = view;
        this.e = textView3;
        jjc.g(textView, new xgv(this, 11));
        jjc.g(textView2, new f0z(this, 8));
        jjc.g(view, new jjx(this, 7));
        if (textView4 != null) {
            jjc.g(textView4, new r820(this, 0));
        }
        View[] d = awt0.d(linearLayout);
        ArrayList arrayList = new ArrayList();
        for (View view2 : d) {
            if (view2 instanceof TextView) {
                arrayList.add(view2);
            }
        }
        this.p = arrayList.size();
        b(false);
    }

    public final ViewPropertyAnimator a() {
        return this.a.animate().setInterpolator(this.l).setDuration(200L).setUpdateListener(new ho6(this, 3));
    }

    public final void b(boolean z) {
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (this.g) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            if (this.c.getVisibility() == 8) {
                ref$IntRef.element = iah0.a(48) + ref$IntRef.element;
            }
            float f = this.p;
            LinearLayout linearLayout = this.a;
            float height = f * linearLayout.getHeight();
            if (height > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.k = a().translationY(height + ref$IntRef.element).withEndAction(new sd(this, 8));
            } else {
                qj80.a(linearLayout, new a(linearLayout, this, ref$IntRef));
            }
            this.f = z;
        }
    }

    public final boolean c(n1l0 n1l0Var) {
        if (!(n1l0Var instanceof StickerItem)) {
            return false;
        }
        s2l0 s2l0Var = this.i;
        if (s2l0Var == null || !s2l0Var.c((StickerItem) n1l0Var)) {
            StickerItem stickerItem = (StickerItem) n1l0Var;
            s2l0 s2l0Var2 = this.i;
            if (s2l0Var2 == null || !s2l0Var2.b(stickerItem) || this.j == null) {
                return false;
            }
        }
        return true;
    }

    public final void d(StickerItem stickerItem) {
        if (!c(stickerItem)) {
            this.o = true;
            return;
        }
        f(stickerItem);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.k = a().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).withEndAction(new o63(this, 7));
        if (!this.f) {
            vvr0.c();
        }
        this.f = true;
        this.o = false;
    }

    public final void e() {
        this.b.setVisibility(0);
        f4m.j(this.c);
        f4m.j(this.d);
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.k = a().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).withEndAction(new qo4(this, 6));
        if (!this.f) {
            vvr0.c();
        }
        this.f = true;
        this.o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(StickerItem stickerItem) {
        boolean z;
        boolean z2;
        s2l0 s2l0Var = this.i;
        View view = this.d;
        int i = 0;
        if (s2l0Var == null || !s2l0Var.b(stickerItem) || this.j == null) {
            f4m.j(view);
        } else {
            view.setVisibility(0);
            ContextUser contextUser = this.j;
            if (contextUser != null) {
                int i2 = stickerItem.b;
                Collection<Integer> collection = contextUser.e;
                if (collection != null) {
                    t6g0 t6g0Var = t6g0.b;
                    StickerStockItem H = t6g0.d().H(i2);
                    if (H != null && H.A) {
                        z2 = !collection.contains(Integer.valueOf(H.b));
                        if (z2) {
                            z = true;
                            TextView textView = this.e;
                            if (z) {
                                f4m.j(textView);
                            } else {
                                Context context = this.a.getContext();
                                ContextUser contextUser2 = this.j;
                                textView.setText(context.getString(R.string.stickers_user_already_has, contextUser2 != null ? contextUser2.c : null));
                                textView.setVisibility(0);
                            }
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            z = false;
            TextView textView2 = this.e;
            if (z) {
            }
        }
        s2l0 s2l0Var2 = this.i;
        this.b.setVisibility(s2l0Var2 != null && s2l0Var2.c(stickerItem) ? 0 : 8);
        s2l0 s2l0Var3 = this.i;
        boolean z3 = s2l0Var3 != null && s2l0Var3.a(stickerItem);
        s2l0 s2l0Var4 = this.i;
        boolean z4 = s2l0Var4 != null && s2l0Var4.c(stickerItem);
        TextView textView3 = this.c;
        if (z3) {
            textView3.setText(R.string.stickers_remove_from_favorites);
        } else {
            textView3.setText(R.string.stickers_add_to_favorites);
        }
        if (!z4 && !z3) {
            i = 8;
        }
        textView3.setVisibility(i);
    }
}
