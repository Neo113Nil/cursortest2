package xsna;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.ui.reviewbody.ReviewBodyView;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.bhg0;
import xsna.rxh;

/* compiled from: CommunityReviewItemViewHolder.kt */
/* loaded from: classes18.dex */
public final class wxh extends vfz<qxh> {
    public final a0i<zzh> l;
    public qxh m;
    public final ConstraintLayout n;
    public final ReviewHeaderView o;
    public final ReviewBodyView p;
    public final VKCircleImageView q;
    public ObjectAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public wxh(ViewGroup viewGroup, int i, RecyclerView.u uVar, a0i<? super zzh> a0iVar, boolean z) {
        super(e0n.a(R.layout.community_review_item, viewGroup, z));
        this.l = a0iVar;
        this.n = (ConstraintLayout) this.itemView.findViewById(R.id.review_cl);
        ReviewHeaderView reviewHeaderView = (ReviewHeaderView) this.itemView.findViewById(R.id.review_header);
        this.o = reviewHeaderView;
        ReviewBodyView reviewBodyView = (ReviewBodyView) this.itemView.findViewById(R.id.review_body);
        this.p = reviewBodyView;
        VKCircleImageView vKCircleImageView = (VKCircleImageView) this.itemView.findViewById(R.id.photo);
        this.q = vKCircleImageView;
        View view = this.itemView;
        view.addOnAttachStateChangeListener(new a(view, this));
        View view2 = this.itemView;
        view2.setPadding(view2.getPaddingStart() + i, this.itemView.getPaddingTop(), this.itemView.getPaddingEnd() + i, this.itemView.getPaddingBottom());
        eig0<bhg0> eig0Var = new eig0() { // from class: xsna.uxh
            @Override // xsna.eig0
            public final void a(Object obj) {
                zzh zzhVar;
                bhg0 bhg0Var = (bhg0) obj;
                wxh wxhVar = wxh.this;
                qxh qxhVar = wxhVar.m;
                if (qxhVar != null) {
                    UserId userId = qxhVar.c;
                    int i2 = qxhVar.b;
                    if (bhg0Var instanceof bhg0.b) {
                        zzhVar = new rxh.d(((bhg0.b) bhg0Var).a, i2);
                    } else if (bhg0Var instanceof bhg0.g) {
                        zzhVar = new rxh.a(i2);
                    } else {
                        rxh.j jVar = null;
                        if (bhg0Var instanceof bhg0.i) {
                            if (userId != null && fkq0.c(userId)) {
                                jVar = new rxh.j(userId);
                            }
                        } else if (bhg0Var instanceof bhg0.f) {
                            zzhVar = new rxh.h(i2, userId);
                        } else if (bhg0Var instanceof bhg0.d) {
                            zzhVar = new rxh.i(qxhVar);
                        } else if (bhg0Var instanceof bhg0.e) {
                            zzhVar = rxh.f.a;
                        }
                        zzhVar = jVar;
                    }
                    if (zzhVar != null) {
                        wxhVar.l.c(zzhVar);
                    }
                }
            }
        };
        bwt0.i0(this.itemView, new dkg(this, 6));
        bwt0.i0(vKCircleImageView, new vs(this, 29));
        reviewHeaderView.j = eig0Var;
        ReviewBodyView.a(reviewBodyView, eig0Var, uVar);
        vKCircleImageView.y0(iah0.a(0.5f), dhr0.t.c(R.attr.vk_ui_image_border_alpha));
    }

    @Override // xsna.vfz
    public final void W5(qxh qxhVar) {
        String str;
        qxh qxhVar2 = qxhVar;
        this.m = qxhVar2;
        e0n.b(this.itemView, qxhVar2.l);
        ObjectAnimator objectAnimator = this.r;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.r;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        this.r = null;
        this.o.setData(qxhVar2.g);
        ugg0 ugg0Var = qxhVar2.h;
        int size = ugg0Var.a.size();
        if (size == 1) {
            str = b6().getString(R.string.community_reviews_photo_accessibility);
        } else {
            str = size + " " + b6().getString(R.string.community_reviews_photo_accessibility);
        }
        this.p.b(ugg0Var, str);
        this.q.o0(qxhVar2.f, null);
        this.n.setContentDescription(b6().getString(R.string.community_review_item_number_accessibility, Integer.valueOf(getBindingAdapterPosition() - 1), Integer.valueOf(qxhVar2.i)) + " " + ugg0Var.b.a);
        if (qxhVar2.m) {
            bwt0.j(this.itemView, new com.vk.movika.sdk.base.logic.interactor.p(this, 25));
        } else {
            this.itemView.setBackgroundColor(0);
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ wxh c;

        public a(View view, wxh wxhVar) {
            this.b = view;
            this.c = wxhVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            wxh wxhVar = this.c;
            ObjectAnimator objectAnimator = wxhVar.r;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = wxhVar.r;
            if (objectAnimator2 != null) {
                objectAnimator2.removeAllListeners();
            }
            wxhVar.r = null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
