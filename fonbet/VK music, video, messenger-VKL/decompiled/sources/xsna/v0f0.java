package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reactions.api.chips.ReactionChipStyle;
import java.util.List;

/* compiled from: ReactionChipsContainerView.kt */
/* loaded from: classes2.dex */
public abstract class v0f0 extends RecyclerView {

    /* compiled from: ReactionChipsContainerView.kt */
    public static final class a {
        public final aux0 a;
        public final Msg b;
        public final ReactionChipStyle c;
        public final int d;
        public final List<Integer> e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public a(aux0 aux0Var, Msg msg, ReactionChipStyle reactionChipStyle, int i, List<Integer> list, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = aux0Var;
            this.b = msg;
            this.c = reactionChipStyle;
            this.d = i;
            this.e = list;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.i) + qoy.b(qoy.b(qoy.b(fw3.a(shy.a(this.d, (this.c.hashCode() + pn.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemsData(reactions=");
            sb.append(this.a);
            sb.append(", msg=");
            sb.append(this.b);
            sb.append(", style=");
            sb.append(this.c);
            sb.append(", colorAccent=");
            sb.append(this.d);
            sb.append(", msgsWithUnreadReactions=");
            sb.append(this.e);
            sb.append(", isOutgoingWithoutBubble=");
            sb.append(this.f);
            sb.append(", withAnimation=");
            sb.append(this.g);
            sb.append(", inlineTime=");
            sb.append(this.h);
            sb.append(", isPaidReactionAvailable=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    public abstract void a(boolean z, wzs<? super Integer, ? super Boolean, s3q0> wzsVar, izs<? super Integer, s3q0> izsVar);

    public abstract void setIsIncognito(boolean z);

    public abstract void setItems(a aVar);

    public abstract void setProfiles(ProfilesSimpleInfo profilesSimpleInfo);

    public abstract void setTimeBgColor(int i);

    public abstract void setTimeTextColor(int i);
}
