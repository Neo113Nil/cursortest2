package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FirstLevelCommentViewHolder.kt */
/* loaded from: classes4.dex */
public class jlr extends ib6 implements w8i {
    public final String U;
    public boolean V;
    public final bpn0 W;
    public final Object X;

    public jlr(int i, ViewGroup viewGroup, tdg tdgVar, g3f0 g3f0Var, String str) {
        super(i, viewGroup, tdgVar, g3f0Var);
        this.U = str;
        this.W = new bpn0(new q5f(this, 21));
        this.X = msy.a(LazyThreadSafetyMode.NONE, new enh(this, 15));
    }

    public static s3q0 F6(jlr jlrVar, View view, Throwable th) {
        L.i(th);
        super.onClick(view);
        return s3q0.a;
    }

    @Override // xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public void i6(iag iagVar) {
        super.i6(iagVar);
        this.V = iagVar.r3();
        qag qagVar = this.q;
        View view = qagVar.getView();
        if (this.V) {
            view.setContentDescription(b6().getString(R.string.accessibility_post_story_at_avatar));
        }
        qagVar.R(this.V, AvatarBorderType.CIRCLE);
    }

    @Override // xsna.ib6, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() != R.id.poster_photo || !this.V) {
            super.onClick(view);
            return;
        }
        Activity h = e3m.h(this.itemView.getContext());
        if (h == null) {
            super.onClick(view);
        } else {
            ((otl0) this.W.getValue()).g(((iag) this.m).getUid()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f40(new eo3(this, h, view, 6), 20), new bw(new h1(12, this, view), 26));
        }
    }
}
