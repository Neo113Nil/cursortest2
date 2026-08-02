package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoryReactionsRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class jbm0 implements hbm0 {
    public final Context a;
    public volatile ArrayList c;
    public final Object b = new Object();
    public final List<a> d = e43.l(new a(0, R.drawable.reaction_0, R.raw.reaction_0, R.raw.main_reaction_0, "like_from_reactions_menu"), new a(2, R.drawable.reaction_2, R.raw.reaction_2, R.raw.main_reaction_2, "fire"), new a(6, R.drawable.reaction_6, R.raw.reaction_6, R.raw.main_reaction_6, "thumbs_up"), new a(1, R.drawable.reaction_1, R.raw.reaction_1, R.raw.main_reaction_1, "face_with_tears_of_happiness"), new a(3, R.drawable.reaction_3, R.raw.reaction_3, R.raw.main_reaction_3, "smiling_face_with_heart_eyes"), new a(5, R.drawable.reaction_5, R.raw.reaction_5, R.raw.main_reaction_5, "folded_hands"));

    /* compiled from: StoryReactionsRepositoryImpl.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final String e;

        public a(int i, int i2, int i3, int i4, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ReactionConfig(id=");
            sb.append(this.a);
            sb.append(", drawableRes=");
            sb.append(this.b);
            sb.append(", reactionRawRes=");
            sb.append(this.c);
            sb.append(", mainReactionRawRes=");
            sb.append(this.d);
            sb.append(", analyticsDescription=");
            return ho8.a(sb, this.e, ')');
        }
    }

    public jbm0(Context context) {
        this.a = context;
    }

    @Override // xsna.hbm0
    public final io.reactivex.rxjava3.core.x<List<zam0>> getAll() {
        ArrayList arrayList = this.c;
        return arrayList != null ? io.reactivex.rxjava3.core.x.k(arrayList) : new io.reactivex.rxjava3.internal.operators.single.v(new ibm0(this, 0)).q(asu0.a.c());
    }
}
