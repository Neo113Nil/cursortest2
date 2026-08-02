package xsna;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.imageloader.view.VKImageView;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;

/* compiled from: GroupSuggestionHolder.kt */
/* loaded from: classes17.dex */
public final class qmu extends vif0<GroupSuggestion> implements View.OnClickListener {
    public final String n;
    public final ProfileFragmentProviderComponent o;
    public final VKImageView p;
    public final TextView q;
    public final ImageView r;
    public final TextView s;
    public final ImageView t;
    public Group u;
    public ViewPropertyAnimator v;
    public final yn2 w;

    public qmu(ViewGroup viewGroup, String str, ProfileFragmentProviderComponent profileFragmentProviderComponent) {
        super(viewGroup, R.layout.group_suggestion_item, 0);
        this.n = str;
        this.o = profileFragmentProviderComponent;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.icon);
        this.p = vKImageView;
        this.q = (TextView) this.itemView.findViewById(R.id.title);
        this.r = (ImageView) this.itemView.findViewById(R.id.icon_meta);
        this.s = (TextView) this.itemView.findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.subscribe_action);
        this.t = imageView;
        this.w = new yn2(this, 6);
        RoundingParams roundingParams = vKImageView.getHierarchy().c;
        if (roundingParams != null) {
            roundingParams.i = true;
        }
        bwt0.i0(imageView, new kdn(this, 11));
    }

    @Override // xsna.vif0
    public final void i6(GroupSuggestion groupSuggestion) {
        GroupSuggestion groupSuggestion2 = groupSuggestion;
        Group group = groupSuggestion2 != null ? groupSuggestion2.b : null;
        Group group2 = this.u;
        boolean f = epx.f(group2 != null ? group2.c : null, group != null ? group.c : null);
        ImageView imageView = this.t;
        if (!f) {
            imageView.removeCallbacks(this.w);
            ViewPropertyAnimator viewPropertyAnimator = this.v;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.v = null;
            this.u = null;
        }
        if (group == null) {
            return;
        }
        this.q.setText(group.d);
        this.s.setText(groupSuggestion2.c);
        this.p.load(group.e);
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        VerifyInfoHelper.k(this.r, false, groupSuggestion2.b.y, false, false, 56);
        imageView.setContentDescription(g6(xa4.w(group)));
        this.itemView.setOnClickListener(this);
        if (!xa4.B(group.C)) {
            imageView.setImageResource(R.drawable.vk_icon_add_square_outline_28);
            omw.b(imageView, R.attr.vk_ui_icon_accent);
            imageView.setAlpha(1.0f);
            imageView.setVisibility(0);
            return;
        }
        if (this.u == null) {
            imageView.setVisibility(4);
            return;
        }
        imageView.setImageResource(R.drawable.vk_icon_done_outline_28);
        omw.b(imageView, R.attr.vk_ui_icon_secondary);
        imageView.setAlpha(1.0f);
        imageView.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        GroupSuggestion groupSuggestion;
        if (view == null || (context = view.getContext()) == null || (groupSuggestion = (GroupSuggestion) this.m) == null) {
            return;
        }
        UserId e = fkq0.e(groupSuggestion.b.c);
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        this.o.ye(e, null).G(this.n).K(groupSuggestion.e).k(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public final void q6(Group group, boolean z) {
        this.t.postDelayed(this.w, 5000L);
        this.u = group;
        int i = group.C;
        int i2 = group.m;
        int i3 = group.s;
        int i4 = z ? 1 : 2;
        if (i2 != 0 && i != 5 && i3 <= 0) {
            i4 = 4;
        }
        group.C = i4;
        o6();
        UserId userId = group.c;
        boolean z2 = !z;
        GroupSuggestion groupSuggestion = (GroupSuggestion) this.m;
        com.vkontakte.android.data.b.d().L(new yh1(new pcg(rsg0.y0(new j0y(userId, z2, this.n, groupSuggestion != null ? groupSuggestion.e : null, (FullSourceJoinApi) null, 40), null, null, 3), 29), 19), false).subscribe(new x8(new nmu(group, i4), 24), new amt(new omu(i, group, this), 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public final void s6(Group group, AdminLeaveAction adminLeaveAction) {
        int i = group.C;
        group.C = 0;
        o6();
        UserId userId = group.c;
        GroupSuggestion groupSuggestion = (GroupSuggestion) this.m;
        rsg0.y0(new hqu(userId, this.n, groupSuggestion != null ? groupSuggestion.e : null, adminLeaveAction, 16), null, null, 3).subscribe(new defpackage.p(new u4e(group, 28), 29), new pmu(new x28(i, group, this), 0));
    }

    /* compiled from: GroupSuggestionHolder.kt */
    public static final class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            qmu qmuVar = qmu.this;
            qmuVar.v = null;
            qmuVar.t.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
