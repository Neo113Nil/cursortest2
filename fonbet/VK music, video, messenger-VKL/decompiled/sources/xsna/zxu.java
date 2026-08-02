package xsna;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.posting.avatar.PostingAvatarViewContainer;
import com.vk.sharing.api.dto.Target;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: HeaderPostingViewRedesign.kt */
/* loaded from: classes4.dex */
public final class zxu implements txu {
    public final boolean b;
    public PostingAvatarViewContainer c;
    public TextView d;
    public AppCompatImageView e;
    public TextView f;
    public LinearLayout g;
    public dw20 h;
    public final bpn0 i = new bpn0(new l9(11));
    public sxu j;
    public final ArrayList k;
    public final ArrayList l;
    public boolean m;
    public boolean n;
    public boolean o;
    public Target p;

    public zxu(boolean z) {
        this.b = z;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.l = arrayList;
    }

    @Override // xsna.txu
    public final void Ph(boolean z, boolean z2) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setAlpha(z ? 1.0f : 0.5f);
        TextView textView2 = this.d;
        (textView2 != null ? textView2 : null).setEnabled(z);
    }

    @Override // xsna.txu
    public final List<Target> Q2() {
        return this.l;
    }

    @Override // xsna.txu
    public final boolean Rd() {
        return false;
    }

    @Override // xsna.txu
    public final void S5(boolean z, boolean z2) {
        this.n = z;
        this.o = z2;
        if (z) {
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            textView.setText(R.string.post_send_to_suggested);
        }
    }

    @Override // xsna.txu
    public final void Tc(boolean z, boolean z2) {
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, z && this.b && !this.n);
    }

    @Override // xsna.txu
    public final void Vb(boolean z) {
        if (this.m || this.n) {
            return;
        }
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        Context context = textView.getContext();
        TextView textView2 = this.d;
        (textView2 != null ? textView2 : null).setText(z ? context.getString(R.string.post_put_in_queue) : context.getString(R.string.newsfeed_newpost_create));
    }

    @Override // xsna.txu
    public final void ak() {
        this.m = true;
        PostingAvatarViewContainer postingAvatarViewContainer = this.c;
        if (postingAvatarViewContainer == null) {
            postingAvatarViewContainer = null;
        }
        bwt0.p0(postingAvatarViewContainer, false);
        if (this.n && this.o) {
            TextView textView = this.d;
            (textView != null ? textView : null).setText(R.string.newsfeed_newpost_create);
        } else {
            TextView textView2 = this.d;
            (textView2 != null ? textView2 : null).setText(R.string.posting_settings_source_save);
        }
    }

    public final void b() {
        if (this.b) {
            LinearLayout linearLayout = this.g;
            if (linearLayout == null) {
                linearLayout = null;
            }
            if (linearLayout.getChildCount() > 1) {
                LinearLayout linearLayout2 = this.g;
                LinearLayout linearLayout3 = linearLayout2 == null ? null : linearLayout2;
                if (linearLayout2 == null) {
                    linearLayout2 = null;
                }
                linearLayout3.removeViews(1, linearLayout2.getChildCount() - 1);
            }
            ArrayList arrayList = this.k;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Target target = (Target) it.next();
                target.g = epx.f(target, this.p);
                LinearLayout linearLayout4 = this.g;
                if (linearLayout4 == null) {
                    linearLayout4 = null;
                }
                ddc0 ddc0Var = new ddc0(linearLayout4, new yxu(this));
                ddc0Var.V5(target);
                arrayList2.add(ddc0Var.itemView);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next();
                LinearLayout linearLayout5 = this.g;
                if (linearLayout5 == null) {
                    linearLayout5 = null;
                }
                linearLayout5.addView(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    @Override // xsna.txu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ce(Target target, boolean z) {
        String str;
        int i;
        TextView textView;
        TextView textView2;
        this.p = target;
        b();
        PostingAvatarViewContainer postingAvatarViewContainer = this.c;
        PostingAvatarViewContainer postingAvatarViewContainer2 = postingAvatarViewContainer == null ? null : postingAvatarViewContainer;
        if (postingAvatarViewContainer == null) {
            postingAvatarViewContainer = null;
        }
        postingAvatarViewContainer2.q(target, dhr0.w(R.drawable.user_placeholder, postingAvatarViewContainer.getContext()));
        PostingAvatarViewContainer postingAvatarViewContainer3 = this.c;
        if (postingAvatarViewContainer3 == null) {
            postingAvatarViewContainer3 = null;
        }
        StringBuilder sb = new StringBuilder();
        PostingAvatarViewContainer postingAvatarViewContainer4 = this.c;
        if (postingAvatarViewContainer4 == null) {
            postingAvatarViewContainer4 = null;
        }
        sb.append(postingAvatarViewContainer4.getContext().getString(R.string.post_author_title));
        sb.append(' ');
        sb.append(target.d);
        postingAvatarViewContainer3.setContentDescription(sb.toString());
        if (z) {
            PostingAvatarViewContainer postingAvatarViewContainer5 = this.c;
            if (postingAvatarViewContainer5 == null) {
                postingAvatarViewContainer5 = null;
            }
            str = postingAvatarViewContainer5.getContext().getString(R.string.post_from_own_name);
        } else {
            str = target.d;
        }
        if (!this.m) {
            TextView textView3 = this.f;
            if (textView3 == null) {
                textView3 = null;
            }
            if (textView3.isEnabled()) {
                i = R.color.vk_azure_300;
                textView = this.f;
                if (textView == null) {
                    textView = null;
                }
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.i.getValue();
                spannableStringBuilder.clear();
                textView2 = this.f;
                if (textView2 == null) {
                    textView2 = null;
                }
                spannableStringBuilder.append((CharSequence) textView2.getContext().getString(R.string.post_from));
                if (!z) {
                    ylw ylwVar = new ylw(R.drawable.vk_icon_users_12);
                    ylwVar.d(i);
                    ylwVar.c = 1;
                    TextView textView4 = this.f;
                    if (textView4 == null) {
                        textView4 = null;
                    }
                    spannableStringBuilder.append((CharSequence) ylwVar.b(textView4.getContext()));
                }
                spannableStringBuilder.append((CharSequence) (" " + str));
                TextView textView5 = this.f;
                spannableStringBuilder.setSpan(new ForegroundColorSpan((textView5 != null ? textView5 : null).getContext().getColor(i)), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
            }
        }
        i = R.color.vk_steel_gray_400;
        textView = this.f;
        if (textView == null) {
        }
        SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) this.i.getValue();
        spannableStringBuilder2.clear();
        textView2 = this.f;
        if (textView2 == null) {
        }
        spannableStringBuilder2.append((CharSequence) textView2.getContext().getString(R.string.post_from));
        if (!z) {
        }
        spannableStringBuilder2.append((CharSequence) (" " + str));
        TextView textView52 = this.f;
        spannableStringBuilder2.setSpan(new ForegroundColorSpan((textView52 != null ? textView52 : null).getContext().getColor(i)), spannableStringBuilder2.length() - str.length(), spannableStringBuilder2.length(), 33);
        textView.setText(spannableStringBuilder2);
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        this.c = (PostingAvatarViewContainer) view.findViewById(R.id.author_avatar_image);
        TextView textView = (TextView) view.findViewById(R.id.btn_done);
        this.d = textView;
        textView.setText(view.getContext().getString(R.string.newsfeed_newpost_create));
        this.e = (AppCompatImageView) view.findViewById(R.id.btn_close);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_author);
        this.f = textView2;
        boolean z = this.b;
        bwt0.p0(textView2, z);
        if (z) {
            TextView textView3 = this.f;
            if (textView3 == null) {
                textView3 = null;
            }
            this.g = (LinearLayout) LayoutInflater.from(textView3.getContext()).inflate(R.layout.dialog_authors_selection, (ViewGroup) null);
        }
        TextView textView4 = this.f;
        if (textView4 == null) {
            textView4 = null;
        }
        bwt0.i0(textView4, new cvh(this, 15));
        TextView textView5 = this.d;
        if (textView5 == null) {
            textView5 = null;
        }
        bwt0.i0(textView5, new bhh(this, 24));
        AppCompatImageView appCompatImageView = this.e;
        bwt0.i0(appCompatImageView != null ? appCompatImageView : null, new qqe(this, 26));
        sxu sxuVar = this.j;
        if (sxuVar != null) {
            sxuVar.onStart();
        }
    }

    @Override // xsna.txu
    public final RecyclerPaginatedView hi() {
        return null;
    }

    @Override // xsna.txu
    public final void nj(Target target) {
        this.k.add(target);
        b();
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
        sxu sxuVar = this.j;
        if (sxuVar != null) {
            sxuVar.onStop();
        }
    }

    @Override // xsna.dc6
    public final void setPresenter(cc6 cc6Var) {
        this.j = (sxu) cc6Var;
    }

    @Override // xsna.txu
    public final void xg() {
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setEnabled(false);
    }

    @Override // xsna.txu
    public final void Ed() {
    }

    @Override // xsna.txu
    public final void H6() {
    }

    @Override // xsna.txu
    public final void P8() {
    }

    @Override // xsna.txu
    public final void x7() {
    }

    @Override // xsna.txu
    public final void ed(boolean z, boolean z2) {
    }
}
