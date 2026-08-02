package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.donut.design.view.badge.LargeOneTimeDonutBadge;
import com.vk.donut.design.view.badge.SmallOneTimeDonutBadge;
import com.vk.dto.badges.BadgeDonutInfo;
import com.vk.dto.badges.BadgeItem;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BadgeDonutCommentViewHolder.kt */
/* loaded from: classes4.dex */
public class xy5 extends jlr {
    public final StringBuilder Y;
    public final Object Z;
    public final Object a0;
    public final TextView b0;

    public xy5(int i, ViewGroup viewGroup, String str, afg afgVar, g3f0 g3f0Var) {
        super(i, viewGroup, afgVar, g3f0Var, str);
        this.Y = new StringBuilder();
        defpackage.g gVar = new defpackage.g(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, gVar);
        this.Z = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new defpackage.h(this, 4));
        this.a0 = a2;
        this.b0 = (TextView) this.itemView.findViewById(R.id.sent_badge);
        this.H.setOnTouchListener(this);
        this.H.setOnClickListener(this);
        D6(this.H);
        ((SmallOneTimeDonutBadge) a.getValue()).setOnClickListener(this);
        ((LargeOneTimeDonutBadge) a2.getValue()).setOnClickListener(this);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.jlr, xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public void i6(iag iagVar) {
        String g6;
        super.i6(iagVar);
        BadgeItem G6 = iagVar.G6();
        if (G6 == null) {
            return;
        }
        String str = G6.c;
        BadgeDonutInfo Q9 = iagVar.Q9();
        if (Q9 == null) {
            return;
        }
        String str2 = Q9.b;
        String str3 = Q9.d;
        ?? r5 = this.a0;
        ?? r6 = this.Z;
        TextView textView = this.A;
        if (str3 != null && !drm0.N(str3)) {
            if (str2 != null) {
                str = str2;
            }
            String sb = G6(Q9, G6).toString();
            bwt0.p0((SmallOneTimeDonutBadge) r6.getValue(), true);
            bwt0.p0((LargeOneTimeDonutBadge) r5.getValue(), false);
            bwt0.p0(textView, true);
            textView.setText(str3);
            ((SmallOneTimeDonutBadge) r6.getValue()).setAmount(str);
            ((SmallOneTimeDonutBadge) r6.getValue()).setContentDescription(sb);
            return;
        }
        if (str2 != null) {
            str = str2;
        }
        String sb2 = G6(Q9, G6).toString();
        boolean wa = iagVar.wa();
        TextView textView2 = this.b0;
        bwt0.p0(textView2, true);
        bwt0.p0((SmallOneTimeDonutBadge) r6.getValue(), false);
        bwt0.p0((LargeOneTimeDonutBadge) r5.getValue(), true);
        bwt0.p0(textView, false);
        ((LargeOneTimeDonutBadge) r5.getValue()).setAmount(str);
        ((LargeOneTimeDonutBadge) r5.getValue()).setContentDescription(sb2);
        if (wa) {
            g6 = g6(R.string.sent_donut_badge_comment_f);
        } else {
            if (wa) {
                throw new NoWhenBranchMatchedException();
            }
            g6 = g6(R.string.sent_donut_badge_comment_m);
        }
        textView2.setText(g6);
    }

    public final StringBuilder G6(BadgeDonutInfo badgeDonutInfo, BadgeItem badgeItem) {
        StringBuilder sb = this.Y;
        sb.setLength(0);
        sb.append(h6(R.string.accessibility_badge_comment, badgeItem.c));
        sb.append(". ");
        sb.append(badgeDonutInfo.b);
        sb.append(". ");
        String str = badgeItem.q;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb;
    }
}
