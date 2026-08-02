package xsna;

import com.vk.friends.groupinvite.impl.models.InviteFriendsTabIndex;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asx;
import xsna.tlo0;

/* compiled from: InviteFriendsTab.kt */
/* loaded from: classes14.dex */
public final class yrx {
    public final tlo0.f a;
    public final int b;
    public final asx c;

    /* compiled from: InviteFriendsTab.kt */
    public static final class a {

        /* compiled from: InviteFriendsTab.kt */
        /* renamed from: xsna.yrx$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4135a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InviteFriendsTabIndex.values().length];
                try {
                    iArr[InviteFriendsTabIndex.NOT_INVITED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InviteFriendsTabIndex.SELECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InviteFriendsTabIndex.INVITED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static yrx a(InviteFriendsTabIndex inviteFriendsTabIndex) {
            int i = C4135a.$EnumSwitchMapping$0[inviteFriendsTabIndex.ordinal()];
            asx.b bVar = asx.b.a;
            if (i == 1) {
                return new yrx(tq.h(tlo0.Companion, R.string.invite_friends_tab_not_invited), 0, bVar);
            }
            if (i == 2) {
                return new yrx(tq.h(tlo0.Companion, R.string.invite_friends_tab_selected), 0, bVar);
            }
            if (i == 3) {
                return new yrx(tq.h(tlo0.Companion, R.string.invite_friends_tab_invited), 0, bVar);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public yrx(tlo0.f fVar, int i, asx asxVar) {
        this.a = fVar;
        this.b = i;
        this.c = asxVar;
    }

    public static yrx a(yrx yrxVar, int i, asx asxVar, int i2) {
        tlo0.f fVar = yrxVar.a;
        if ((i2 & 2) != 0) {
            i = yrxVar.b;
        }
        if ((i2 & 4) != 0) {
            asxVar = yrxVar.c;
        }
        return new yrx(fVar, i, asxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrx)) {
            return false;
        }
        yrx yrxVar = (yrx) obj;
        return this.a.equals(yrxVar.a) && this.b == yrxVar.b && epx.f(this.c, yrxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "InviteFriendsTab(name=" + this.a + ", count=" + this.b + ", state=" + this.c + ')';
    }
}
