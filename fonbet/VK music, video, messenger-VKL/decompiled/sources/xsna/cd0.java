package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.util.Collections;

/* compiled from: AdBlockDelegate.kt */
/* loaded from: classes2.dex */
public final class cd0 extends p1u0<AboutVideoItem.a> {
    public final egs0 a;
    public final izs<AboutVideoItem.a, s3q0> b;

    /* compiled from: AdBlockDelegate.kt */
    public final class a extends qf6 {
        public final FrameLayout l;
        public final ConstraintLayout m;
        public final TextView n;
        public final TextView o;
        public final TextView p;
        public final ImageView q;
        public final View r;
        public final Guideline s;
        public final ImageView t;
        public zu50 u;
        public final C2658a v;

        /* compiled from: AdBlockDelegate.kt */
        /* renamed from: xsna.cd0$a$a, reason: collision with other inner class name */
        public final class C2658a implements lv50 {
            public final IconAdView b;
            public final MediaAdView c;

            public C2658a() {
                this.b = new IconAdView(a.this.itemView.getContext(), null);
                this.c = new MediaAdView(a.this.itemView.getContext());
            }

            @Override // xsna.lv50
            public final View c() {
                return this.b;
            }

            @Override // xsna.lv50
            public final ViewGroup d() {
                return a.this.m;
            }

            @Override // xsna.lv50
            public final View e() {
                return null;
            }

            @Override // xsna.lv50
            public final View f() {
                return this.b;
            }

            @Override // xsna.lv50
            public final View g() {
                return this.b;
            }

            @Override // xsna.lv50
            public final View getDescriptionView() {
                return a.this.o;
            }

            @Override // xsna.lv50
            public final IconAdView getIconView() {
                return this.b;
            }

            @Override // xsna.lv50
            public final View getTitleView() {
                return a.this.n;
            }

            @Override // xsna.lv50
            public final View h() {
                return this.b;
            }

            @Override // xsna.lv50
            public final View i() {
                return a.this.n;
            }

            @Override // xsna.lv50
            public final s4e0 j0() {
                return null;
            }

            @Override // xsna.lv50
            public final MediaAdView o() {
                return this.c;
            }
        }

        public a(ViewGroup viewGroup, egs0 egs0Var) {
            super(viewGroup, R.layout.video_ad_banner, egs0Var);
            this.l = (FrameLayout) this.itemView.findViewById(R.id.root);
            this.m = (ConstraintLayout) this.itemView.findViewById(R.id.container);
            this.n = (TextView) this.itemView.findViewById(R.id.title);
            this.o = (TextView) this.itemView.findViewById(R.id.subtitle);
            this.p = (TextView) this.itemView.findViewById(R.id.label);
            this.q = (ImageView) this.itemView.findViewById(R.id.media_view);
            this.r = this.itemView.findViewById(R.id.choices_button);
            this.s = (Guideline) this.itemView.findViewById(R.id.guideline_disclaimer);
            this.t = (ImageView) this.itemView.findViewById(R.id.disclaimer);
            this.v = new C2658a();
        }

        @Override // xsna.vfz
        public final void W5(hfz hfzVar) {
            float f;
            AboutVideoItem.a aVar = (AboutVideoItem.a) hfzVar;
            zu50 zu50Var = aVar.c;
            this.u = zu50Var;
            cw50 cw50Var = aVar.b;
            String str = cw50Var.g;
            TextView textView = this.n;
            textView.setText(str);
            this.o.setText(cw50Var.i);
            this.p.setText(j5g.g0(rl3.I(new String[]{cw50Var.o, cw50Var.l}), " ", null, null, 0, null, 62));
            kiw kiwVar = cw50Var.v;
            Integer num = null;
            this.q.setImageBitmap(kiwVar != null ? kiwVar.a() : null);
            zu50Var.r = 5;
            l0n l0nVar = cw50Var.k;
            Integer valueOf = l0nVar != null ? Integer.valueOf(l0nVar.a) : null;
            if ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) {
                f = 0.1f;
            } else if ((valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 11)) {
                f = 0.2f;
            } else {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (valueOf != null) {
                    valueOf.intValue();
                }
            }
            Guideline guideline = this.s;
            ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                bVar.c = 1.0f - f;
                guideline.setLayoutParams(bVar);
            }
            if ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) {
                num = Integer.valueOf(R.drawable.vk_icon_illustration_contraindications_26h);
            } else if (valueOf != null && valueOf.intValue() == 9) {
                num = Integer.valueOf(R.drawable.vk_icon_illustration_bud);
            } else if (valueOf != null && valueOf.intValue() == 11) {
                num = Integer.valueOf(R.drawable.vk_icon_illustration_credits_79h);
            }
            if (num != null) {
                this.t.setImageResource(num.intValue());
            }
            zu50Var.h(this.v, Collections.singletonList(this.l));
            this.r.setOnClickListener(new bd0(aVar, 0));
            boolean z = num != null;
            textView.setMaxLines(z ? 1 : 2);
            qj80.a(textView, new dd0(textView, this, z));
            izs<AboutVideoItem.a, s3q0> izsVar = cd0.this.b;
            if (izsVar != null) {
                izsVar.invoke(aVar);
            }
        }

        @Override // xsna.vfz
        public final void a6() {
            zu50 zu50Var = this.u;
            if (zu50Var != null) {
                zu50Var.a();
            }
        }

        @Override // xsna.vfz
        public final void g6() {
            zu50 zu50Var = this.u;
            if (zu50Var != null) {
                zu50Var.a();
            }
            this.q.setImageDrawable(null);
        }
    }

    public cd0() {
        this(null, null);
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.a> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.a;
    }

    public cd0(egs0 egs0Var, izs izsVar) {
        this.a = egs0Var;
        this.b = izsVar;
    }
}
