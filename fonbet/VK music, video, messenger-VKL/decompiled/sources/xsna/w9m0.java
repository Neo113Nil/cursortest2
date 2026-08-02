package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StoryPrivacyListItem.kt */
/* loaded from: classes16.dex */
public abstract class w9m0 implements hfz {

    /* compiled from: StoryPrivacyListItem.kt */
    public static final class a extends w9m0 {
        public final StoryPrivacyType b;
        public final boolean c;
        public final boolean d;
        public final List<ayv0> e;
        public final a9m0 f;
        public final a9m0 g;
        public final a9m0 h;
        public final boolean i;
        public final int j;

        public a() {
            throw null;
        }

        public a(StoryPrivacyType storyPrivacyType, boolean z, boolean z2, List list, a9m0 a9m0Var, a9m0 a9m0Var2, a9m0 a9m0Var3, int i, int i2) {
            z = (i2 & 2) != 0 ? false : z;
            z2 = (i2 & 4) != 0 ? false : z2;
            list = (i2 & 8) != 0 ? EmptyList.b : list;
            a9m0Var = (i2 & 16) != 0 ? null : a9m0Var;
            a9m0Var3 = (i2 & 64) != 0 ? null : a9m0Var3;
            boolean z3 = (i2 & 128) == 0;
            i = (i2 & 256) != 0 ? 0 : i;
            this.b = storyPrivacyType;
            this.c = z;
            this.d = z2;
            this.e = list;
            this.f = a9m0Var;
            this.g = a9m0Var2;
            this.h = a9m0Var3;
            this.i = z3;
            this.j = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            int a = fw3.a(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
            a9m0 a9m0Var = this.f;
            int hashCode = (a + (a9m0Var == null ? 0 : a9m0Var.hashCode())) * 31;
            a9m0 a9m0Var2 = this.g;
            int hashCode2 = (hashCode + (a9m0Var2 == null ? 0 : a9m0Var2.hashCode())) * 31;
            a9m0 a9m0Var3 = this.h;
            return Integer.hashCode(this.j) + qoy.b((hashCode2 + (a9m0Var3 != null ? a9m0Var3.hashCode() : 0)) * 31, 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(type=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", isClosedAccount=");
            sb.append(this.d);
            sb.append(", friendsAvatars=");
            sb.append(this.e);
            sb.append(", selectFriendsAction=");
            sb.append(this.f);
            sb.append(", selectPrivacyAction=");
            sb.append(this.g);
            sb.append(", clickLabelAction=");
            sb.append(this.h);
            sb.append(", isDisabled=");
            sb.append(this.i);
            sb.append(", totalFriends=");
            return vu5.b(sb, this.j, ')');
        }
    }

    /* compiled from: StoryPrivacyListItem.kt */
    public static final class b extends w9m0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.story_privacy_selector_title);
        }

        public final String toString() {
            return "Text(textId=2131964375)";
        }
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
