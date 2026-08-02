package xsna;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.id.UserId;
import com.vk.feed.design.view.newsfeed.reply.ReplyBarPlaceholderView;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import xsna.u3g0;

/* compiled from: ReplyBarViewDelegate.kt */
/* loaded from: classes4.dex */
public final class z3g0 implements w3g0 {
    public CommentsOutherFragment b;
    public gzs<? extends Dialog> c;
    public u3g0 d;
    public u3g0.g e;
    public g420 f;

    @Override // xsna.w3g0
    public final u3g0 Bf() {
        throw null;
    }

    @Override // xsna.w3g0
    public final void Ol(afg afgVar) {
        u3g0 u3g0Var = new u3g0(null);
        m3g0 m3g0Var = new m3g0(afgVar, u3g0Var, this.f);
        afgVar.B7(m3g0Var);
        u3g0Var.c = m3g0Var;
        u3g0.g gVar = this.e;
        if (gVar != null) {
            u3g0Var.l = gVar;
        }
        xgy xgyVar = u3g0Var.k;
        if (xgyVar != null) {
            xgyVar.l = true;
        }
        this.d = u3g0Var;
    }

    @Override // xsna.w3g0
    public final void V0() {
        ReplyBarPlaceholderView replyBarPlaceholderView;
        CommentsOutherFragment commentsOutherFragment = this.b;
        if (commentsOutherFragment == null || (replyBarPlaceholderView = commentsOutherFragment.W) == null) {
            return;
        }
        bwt0.p0(replyBarPlaceholderView, true);
    }

    @Override // xsna.w3g0
    public final boolean W1() {
        u3g0 u3g0Var = this.d;
        if (u3g0Var != null) {
            return f4m.h(u3g0Var.e);
        }
        return false;
    }

    @Override // xsna.w3g0
    public final void b9(f420 f420Var) {
        CoordinatorLayout coordinatorLayout;
        g420 D0 = hd60.a().D0(f420Var);
        CommentsOutherFragment commentsOutherFragment = this.b;
        if (commentsOutherFragment == null || (coordinatorLayout = commentsOutherFragment.T) == null) {
            return;
        }
        D0.f();
        coordinatorLayout.addView(D0.d(coordinatorLayout, null));
        this.f = D0;
    }

    @Override // xsna.w3g0
    public final void c5(final int i, final LinearLayoutManager linearLayoutManager, final int i2, final int i3, final int i4) {
        u3g0 u3g0Var = this.d;
        if (u3g0Var != null) {
            gzs gzsVar = new gzs() { // from class: xsna.y3g0
                @Override // xsna.gzs
                public final Object invoke() {
                    u3g0 u3g0Var2 = z3g0.this.d;
                    int h = u3g0Var2 != null ? u3g0Var2.h() : 0;
                    int i5 = ify.a;
                    linearLayoutManager.K(i, (((i4 - (ify.e(ify.c) ? ify.d(3, null) : 0)) - i2) - h) - i3);
                    return s3q0.a;
                }
            };
            WriteBar writeBar = u3g0Var.e;
            if (writeBar != null) {
                awt0.t(writeBar, gzsVar);
            }
        }
    }

    @Override // xsna.w3g0
    public final void k0() {
        CoordinatorLayout coordinatorLayout;
        WriteBar writeBar;
        u3g0 u3g0Var = this.d;
        if (u3g0Var == null) {
            return;
        }
        WriteBar writeBar2 = u3g0Var.e;
        if (writeBar2 != null) {
            writeBar2.setVisibility(u3g0Var.o);
        }
        CommentsOutherFragment commentsOutherFragment = this.b;
        if (commentsOutherFragment == null || (coordinatorLayout = commentsOutherFragment.T) == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        coordinatorLayout.B(writeBar);
    }

    @Override // xsna.w3g0
    public final void o0() {
        ReplyBarPlaceholderView replyBarPlaceholderView;
        CommentsOutherFragment commentsOutherFragment = this.b;
        if (commentsOutherFragment == null || (replyBarPlaceholderView = commentsOutherFragment.W) == null) {
            return;
        }
        bwt0.p0(replyBarPlaceholderView, false);
    }

    @Override // xsna.w3g0
    public final void x5(Context context, UserId userId, CharSequence charSequence, LinkButton linkButton) {
        CommentsOutherFragment commentsOutherFragment = this.b;
        ReplyBarPlaceholderView replyBarPlaceholderView = commentsOutherFragment != null ? commentsOutherFragment.W : null;
        if (replyBarPlaceholderView != null) {
            replyBarPlaceholderView.setImage(R.drawable.vk_icon_illustration_donut_coin_banner_48h);
        }
        if (charSequence == null || linkButton == null) {
            if (replyBarPlaceholderView != null) {
                replyBarPlaceholderView.setText(charSequence);
                return;
            }
            return;
        }
        String str = linkButton.b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        int length2 = str.length() + length;
        spannableStringBuilder.append((CharSequence) str);
        qaz qazVar = new qaz(new x3g0(context, userId, linkButton));
        qazVar.b = true;
        spannableStringBuilder.setSpan(qazVar, length, length2, 33);
        if (replyBarPlaceholderView != null) {
            replyBarPlaceholderView.setText(spannableStringBuilder);
        }
    }

    @Override // xsna.w3g0
    public final void y2() {
        CoordinatorLayout coordinatorLayout;
        WriteBar writeBar;
        ViewGroup viewGroup;
        u3g0 u3g0Var = this.d;
        if (u3g0Var == null) {
            return;
        }
        CommentsOutherFragment commentsOutherFragment = this.b;
        if (commentsOutherFragment != null && (viewGroup = commentsOutherFragment.V) != null) {
            u3g0Var.u(viewGroup);
        }
        WriteBar writeBar2 = u3g0Var.e;
        if (writeBar2 != null) {
            bwt0.p0(writeBar2, true);
        }
        CommentsOutherFragment commentsOutherFragment2 = this.b;
        if (commentsOutherFragment2 == null || (coordinatorLayout = commentsOutherFragment2.T) == null || (writeBar = u3g0Var.e) == null) {
            return;
        }
        coordinatorLayout.B(writeBar);
    }
}
