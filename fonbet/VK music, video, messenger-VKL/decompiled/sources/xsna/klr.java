package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: FirstLevelVideoCommentViewHolder.kt */
/* loaded from: classes4.dex */
public class klr extends pq6 implements w8i {
    public final String X;
    public boolean Y;
    public final bpn0 Z;
    public final Object a0;

    public klr(int i, ViewGroup viewGroup, String str, afg afgVar, g3f0 g3f0Var) {
        super(i, viewGroup, afgVar, g3f0Var);
        this.X = str;
        this.Z = new bpn0(new sfg(this, 19));
        this.a0 = msy.a(LazyThreadSafetyMode.NONE, new m2j(this, 11));
    }

    public static s3q0 Q6(klr klrVar, View view, Throwable th) {
        L.i(th);
        super.onClick(view);
        return s3q0.a;
    }

    @Override // xsna.ib6
    /* renamed from: B6 */
    public void i6(iag iagVar) {
        super.i6(iagVar);
        this.Y = iagVar.r3();
        qag qagVar = this.q;
        View view = qagVar.getView();
        if (this.Y) {
            view.setContentDescription(b6().getString(R.string.accessibility_post_story_at_avatar));
        }
        qagVar.R(this.Y, AvatarBorderType.CIRCLE);
    }

    @Override // xsna.ib6, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() != R.id.poster_photo || !this.Y) {
            super.onClick(view);
            return;
        }
        Activity h = e3m.h(this.itemView.getContext());
        if (h == null) {
            super.onClick(view);
        } else {
            ((otl0) this.Z.getValue()).g(((iag) this.m).getUid()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new pm1(new gd5(this, h, view, 6), 21), new p41(new wd3(14, this, view), 22));
        }
    }
}
