package xsna;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommunityCoverPagerViewHolder.kt */
/* loaded from: classes5.dex */
public final class jyg extends RecyclerView.e0 {
    public final b8h l;
    public r8h m;
    public c8h n;
    public final wzs<Integer, Float, s3q0> o;
    public final gzs<s3q0> p;
    public com.vk.profile.community.impl.ui.cover.redesign.delegate.a q;
    public com.vk.profile.community.impl.ui.cover.redesign.delegate.b r;
    public gwh<?, ?> s;

    public jyg(b8h b8hVar, r8h r8hVar, c8h c8hVar, z8h z8hVar, k3b k3bVar) {
        super(b8hVar);
        this.l = b8hVar;
        this.m = r8hVar;
        this.n = c8hVar;
        this.o = z8hVar;
        this.p = k3bVar;
        jjc.g(b8hVar, new i50(this, 19));
    }

    public final void V5(gwh<?, ?> gwhVar, r8h r8hVar, c8h c8hVar) {
        r8h r8hVar2;
        c8h c8hVar2;
        this.s = gwhVar;
        b8h b8hVar = this.l;
        b8hVar.setContentDescription(b8hVar.getContext().getString(R.string.community_live_cover_accessibility, Integer.valueOf(r8hVar.i + 1)));
        if (!(gwhVar instanceof sjw)) {
            if (!(gwhVar instanceof pqs0)) {
                throw new NoWhenBranchMatchedException();
            }
            pqs0 pqs0Var = (pqs0) gwhVar;
            com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar = this.q;
            if (aVar != null) {
                aVar.g(true);
            }
            this.q = null;
            com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar = this.r;
            if (bVar == null || !bVar.e.a.equals(pqs0Var.a)) {
                if (bVar != null) {
                    bVar.f(true);
                }
                com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar2 = new com.vk.profile.community.impl.ui.cover.redesign.delegate.b(b8hVar, this.o);
                bVar2.e = pqs0Var;
                bVar2.f = c8hVar;
                bVar2.g = r8hVar;
                y4i d = bVar2.d();
                bVar2.h = d;
                d.d();
                this.r = bVar2;
            }
            com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar3 = this.r;
            if (bVar3 != null) {
                bVar3.e = pqs0Var;
                bVar3.g = r8hVar;
                bVar3.g();
                bVar3.f = c8hVar;
                bVar3.g();
                if (pqs0Var.b.a) {
                    bVar3.e();
                    return;
                } else {
                    bVar3.C(true);
                    return;
                }
            }
            return;
        }
        sjw sjwVar = (sjw) gwhVar;
        com.vk.profile.community.impl.ui.cover.redesign.delegate.b bVar4 = this.r;
        if (bVar4 != null) {
            bVar4.f(true);
        }
        this.r = null;
        com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar2 = this.q;
        if (aVar2 == null || !aVar2.e.a.equals(sjwVar.a)) {
            if (aVar2 != null) {
                aVar2.g(true);
            }
            wzs<Integer, Float, s3q0> wzsVar = this.o;
            b8h b8hVar2 = this.l;
            r8hVar2 = r8hVar;
            c8hVar2 = c8hVar;
            com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar3 = new com.vk.profile.community.impl.ui.cover.redesign.delegate.a(b8hVar2, sjwVar, r8hVar2, c8hVar2, wzsVar);
            b8hVar2.getVideoTextureView().setVisibility(8);
            b8hVar2.getForegroundImageView().setVisibility(8);
            ValueAnimator valueAnimator = aVar3.i;
            Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
            Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
            b8hVar2.a(f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (aVar3.k) {
                aVar3.d(b8hVar2);
            }
            b8hVar2.setOnRetry(new ld(aVar3, 27));
            aVar3.f();
            this.q = aVar3;
        } else {
            r8hVar2 = r8hVar;
            c8hVar2 = c8hVar;
        }
        com.vk.profile.community.impl.ui.cover.redesign.delegate.a aVar4 = this.q;
        if (aVar4 != null) {
            aVar4.e = sjwVar;
            aVar4.f = r8hVar2;
            aVar4.g = c8hVar2;
            if (sjwVar.b.a) {
                aVar4.e();
            } else {
                aVar4.C(true);
            }
        }
    }

    public final void W5(Float f) {
        q8h q8hVar;
        if (f == null) {
            return;
        }
        gwh<?, ?> gwhVar = this.s;
        if (gwhVar instanceof sjw) {
            q8hVar = this.q;
        } else if (gwhVar instanceof pqs0) {
            q8hVar = this.r;
        } else {
            if (gwhVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            q8hVar = null;
        }
        if (q8hVar != null) {
            q8hVar.a(f);
        }
    }
}
