package xsna;

import android.graphics.PorterDuff;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.dto.badges.BadgeImage;
import com.vk.dto.badges.BadgeItem;
import com.vk.newsfeed.common.recycler.holders.comments.CommentBadgeView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BadgeCommentViewHolder.kt */
/* loaded from: classes4.dex */
public class ry5 extends jlr {
    public static final int b0 = cn70.b(72);
    public final StringBuilder Y;
    public final CommentBadgeView Z;
    public final TextView a0;

    public ry5(int i, ViewGroup viewGroup, String str, afg afgVar, g3f0 g3f0Var) {
        super(i, viewGroup, afgVar, g3f0Var, str);
        this.Y = new StringBuilder();
        CommentBadgeView commentBadgeView = (CommentBadgeView) this.itemView.findViewById(R.id.post_badge_container);
        this.Z = commentBadgeView;
        this.a0 = (TextView) this.itemView.findViewById(R.id.sent_badge);
        this.H.setOnTouchListener(this);
        this.H.setOnClickListener(this);
        commentBadgeView.setOnClickListener(this);
        D6(this.H);
        awt0.o(commentBadgeView, new lb(this, 9));
    }

    @Override // xsna.jlr, xsna.ib6, xsna.vif0
    /* renamed from: B6 */
    public void i6(iag iagVar) {
        String g6;
        int i;
        super.i6(iagVar);
        BadgeItem G6 = iagVar.G6();
        if (G6 == null) {
            return;
        }
        String str = G6.c;
        BadgeItem.BadgeStyle badgeStyle = G6.o;
        boolean wa = iagVar.wa();
        if (wa) {
            g6 = g6(R.string.sent_badge_comment_f);
        } else {
            if (wa) {
                throw new NoWhenBranchMatchedException();
            }
            g6 = g6(R.string.sent_badge_comment_m);
        }
        this.a0.setText(g6);
        boolean M = dhr0.M();
        Integer num = M ? badgeStyle.e : badgeStyle.d;
        int intValue = num != null ? num.intValue() : 0;
        CommentBadgeView commentBadgeView = this.Z;
        sjo.b(commentBadgeView.getBackground(), intValue, PorterDuff.Mode.MULTIPLY);
        commentBadgeView.setVisibility(0);
        f4m.j(this.A);
        BadgeImage badgeImage = G6.e;
        String str2 = badgeImage.b;
        bpn0 bpn0Var = badgeImage.d;
        StringBuilder sb = new StringBuilder(str2);
        List list = (List) bpn0Var.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = b0;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() >= i) {
                arrayList.add(next);
            }
        }
        Integer num2 = (Integer) j5g.r0(new cz5(i), arrayList);
        if (num2 == null) {
            num2 = (Integer) j5g.l0((List) bpn0Var.getValue());
        }
        sb.append(DomExceptionUtils.SEPARATOR);
        sb.append(String.valueOf(num2));
        sb.append(".png");
        commentBadgeView.c.load(sb.toString());
        Integer num3 = M ? badgeStyle.c : badgeStyle.b;
        commentBadgeView.setTextColor(num3 != null ? num3.intValue() : 0);
        commentBadgeView.setText(str);
        StringBuilder sb2 = this.Y;
        sb2.setLength(0);
        sb2.append(h6(R.string.accessibility_badge_comment, str));
        sb2.append(". ");
        String str3 = G6.q;
        if (str3 == null) {
            str3 = "";
        }
        sb2.append(str3);
        commentBadgeView.setContentDescription(sb2);
    }
}
