package xsna;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.im.ImageList;
import com.vk.im.design.view.CoauthorsNamesView;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import xsna.ru30;

/* compiled from: MsgPartWallPostOwnerHolder.kt */
/* loaded from: classes2.dex */
public final class qu30 extends hr30<AttachWall, ru30> implements w8i {
    public View d;
    public ImAvatarView e;
    public ImageView f;
    public TextView g;
    public CoauthorsNamesView h;
    public TextView i;
    public ImageView j;
    public ImageView k;
    public pk30 l;
    public ru30 m;
    public final v5t n = new v5t(R.layout.vkim_msg_part_wall_post_owner);
    public final Object o = msy.a(LazyThreadSafetyMode.NONE, new b010(this, 5));
    public final io.reactivex.rxjava3.disposables.b p = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: MsgPartHolderDelegate.kt */
    public static final class a implements izs<View, s3q0> {
        public a() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            qu30 qu30Var = qu30.this;
            pk30 pk30Var = qu30Var.l;
            ru30 ru30Var = qu30Var.m;
            Msg msg = ru30Var != null ? ru30Var.j : null;
            Attach attach = ru30Var != null ? ru30Var.l : null;
            if (pk30Var != null && msg != null && attach != null) {
                pk30Var.R(attach, msg, ru30Var != null ? ru30Var.k : null);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.r;
        int i2 = bubbleColors.g;
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i2);
        CoauthorsNamesView coauthorsNamesView = this.h;
        if (coauthorsNamesView == null) {
            coauthorsNamesView = null;
        }
        coauthorsNamesView.setTextColor(i2);
        coauthorsNamesView.setIconColor(i);
        ImageView imageView = this.k;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageTintList(ColorStateList.valueOf(i));
        ru30 ru30Var = this.m;
        if (ru30Var == null || !ru30Var.i) {
            TextView textView2 = this.i;
            (textView2 != null ? textView2 : null).setTextColor(bubbleColors.i);
            return;
        }
        TextView textView3 = this.i;
        if (textView3 == null) {
            textView3 = null;
        }
        ?? r0 = this.d;
        textView3.setTextColor(l8g.f(0.6f, dhr0.Y(R.attr.vk_ui_icon_contrast, (r0 != 0 ? r0 : null).getContext())));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.hr30
    public final void p(ru30 ru30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        int Y;
        ru30 ru30Var2 = ru30Var;
        this.l = pk30Var;
        this.m = ru30Var2;
        Collection<ru30.a> collection = ru30Var2.b;
        if (collection.size() == 0) {
            ImAvatarView imAvatarView = this.e;
            if (imAvatarView == null) {
                imAvatarView = null;
            }
            bwt0.d0(imAvatarView, true);
            ImageView imageView = this.f;
            if (imageView == null) {
                imageView = null;
            }
            bwt0.d0(imageView, true);
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            bwt0.d0(textView, true);
            CoauthorsNamesView coauthorsNamesView = this.h;
            if (coauthorsNamesView == null) {
                coauthorsNamesView = null;
            }
            bwt0.d0(coauthorsNamesView, true);
            ImageView imageView2 = this.k;
            if (imageView2 == null) {
                imageView2 = null;
            }
            bwt0.d0(imageView2, true);
        } else if (collection.size() == 1) {
            ru30.a aVar = (ru30.a) j5g.X(collection);
            ImAvatarView imAvatarView2 = this.e;
            if (imAvatarView2 == null) {
                imAvatarView2 = null;
            }
            imAvatarView2.s1(aVar.a);
            TextView textView2 = this.g;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(aVar.b);
            ImageView imageView3 = this.k;
            if (imageView3 == null) {
                imageView3 = null;
            }
            imageView3.setVisibility(aVar.a.q9().b ? 0 : 8);
            ImAvatarView imAvatarView3 = this.e;
            if (imAvatarView3 == null) {
                imAvatarView3 = null;
            }
            imAvatarView3.setVisibility(0);
            ImageView imageView4 = this.f;
            if (imageView4 == null) {
                imageView4 = null;
            }
            imageView4.setVisibility(8);
            TextView textView3 = this.g;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(0);
            CoauthorsNamesView coauthorsNamesView2 = this.h;
            if (coauthorsNamesView2 == null) {
                coauthorsNamesView2 = null;
            }
            coauthorsNamesView2.setVisibility(8);
        } else {
            Collection<ru30.a> collection2 = collection;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                ImageList C8 = ((ru30.a) it.next()).a.C8();
                ImageView imageView5 = this.f;
                if (imageView5 == null) {
                    imageView5 = null;
                }
                String Hb = C8.Hb(imageView5.getLayoutParams().width);
                if (Hb != null) {
                    arrayList.add(Hb);
                }
            }
            jnd jndVar = (jnd) this.o.getValue();
            ImageView imageView6 = this.f;
            if (imageView6 == null) {
                imageView6 = null;
            }
            this.p.b(io.reactivex.rxjava3.kotlin.c.f(3, jndVar.a(Integer.valueOf(imageView6.getLayoutParams().width), arrayList), null, null, new c2u(this, 17)));
            CoauthorsNamesView coauthorsNamesView3 = this.h;
            if (coauthorsNamesView3 == null) {
                coauthorsNamesView3 = null;
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
            for (ru30.a aVar2 : collection2) {
                arrayList2.add(new CoauthorsNamesView.a(aVar2.b, aVar2.a.q9().b));
            }
            coauthorsNamesView3.setAuthorList(arrayList2);
            ImageView imageView7 = this.k;
            if (imageView7 == null) {
                imageView7 = null;
            }
            imageView7.setVisibility(8);
            ImAvatarView imAvatarView4 = this.e;
            if (imAvatarView4 == null) {
                imAvatarView4 = null;
            }
            imAvatarView4.setVisibility(8);
            ImageView imageView8 = this.f;
            if (imageView8 == null) {
                imageView8 = null;
            }
            imageView8.setVisibility(0);
            TextView textView4 = this.g;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setVisibility(8);
            CoauthorsNamesView coauthorsNamesView4 = this.h;
            if (coauthorsNamesView4 == null) {
                coauthorsNamesView4 = null;
            }
            coauthorsNamesView4.setVisibility(0);
        }
        if (ru30Var2.i) {
            View view = this.d;
            if (view == null) {
                view = null;
            }
            Y = l8g.f(0.6f, dhr0.Y(R.attr.vk_ui_icon_contrast, view.getContext()));
        } else {
            View view2 = this.d;
            if (view2 == null) {
                view2 = null;
            }
            Y = dhr0.Y(R.attr.vk_ui_icon_tertiary_alpha, view2.getContext());
        }
        ImageView imageView9 = this.j;
        if (imageView9 == null) {
            imageView9 = null;
        }
        imageView9.setImageTintList(ColorStateList.valueOf(Y));
        boolean z = ru30Var2.h;
        boolean z2 = !z;
        TextView textView5 = this.i;
        if (textView5 == null) {
            textView5 = null;
        }
        awt0.v(textView5, z2);
        if (z) {
            return;
        }
        TextView textView6 = this.i;
        (textView6 == null ? null : textView6).setText(pvo0.k((int) ru30Var2.e, (textView6 != null ? textView6 : null).getContext().getResources(), false));
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.n.c(layoutInflater, viewGroup);
        this.d = c;
        if (c == null) {
            c = null;
        }
        this.e = (ImAvatarView) c.findViewById(R.id.avatar);
        View view = this.d;
        if (view == null) {
            view = null;
        }
        this.f = (ImageView) view.findViewById(R.id.coauthors_avatar);
        View view2 = this.d;
        if (view2 == null) {
            view2 = null;
        }
        this.g = (TextView) view2.findViewById(R.id.title);
        View view3 = this.d;
        if (view3 == null) {
            view3 = null;
        }
        this.h = (CoauthorsNamesView) view3.findViewById(R.id.coauthors_names);
        View view4 = this.d;
        if (view4 == null) {
            view4 = null;
        }
        this.i = (TextView) view4.findViewById(R.id.subtitle);
        View view5 = this.d;
        if (view5 == null) {
            view5 = null;
        }
        this.j = (ImageView) view5.findViewById(R.id.repost_icon);
        View view6 = this.d;
        if (view6 == null) {
            view6 = null;
        }
        this.k = (ImageView) view6.findViewById(R.id.verified_icon);
        View view7 = this.d;
        if (view7 == null) {
            view7 = null;
        }
        jjc.g(view7, new a());
        View view8 = this.d;
        if (view8 == null) {
            return null;
        }
        return view8;
    }

    @Override // xsna.hr30
    public final void r() {
        this.l = null;
        this.m = null;
        this.p.e();
    }
}
