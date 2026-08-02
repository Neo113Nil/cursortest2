package xsna;

import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;
import java.util.List;
import xsna.q8z;
import xsna.us2;

/* compiled from: SubscribersSlotImplContent.kt */
/* loaded from: classes5.dex */
public final class ixm0 {

    /* compiled from: SubscribersSlotImplContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AuthorHeaderConfig.Author.AuthorType.values().length];
            try {
                iArr[AuthorHeaderConfig.Author.AuthorType.Profile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthorHeaderConfig.Author.AuthorType.Community.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AuthorHeaderConfig.Viewer.RelationToAuthor.values().length];
            try {
                iArr2[AuthorHeaderConfig.Viewer.RelationToAuthor.Friend.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AuthorHeaderConfig.Viewer.RelationToAuthor.Blacklisted.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AuthorHeaderConfig.Viewer.RelationToAuthor.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AuthorHeaderConfig.Viewer.RelationToAuthor.IncomingRequest.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final us2 a(int i, int i2, androidx.compose.runtime.a aVar, izs izsVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2105336733, i2, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.friendsLabel (SubscribersSlotImplContent.kt:357)");
        }
        us2 h = h(d370.F(R.plurals.author_header_subscribers_friends_count, i, new Object[]{xpm0.b(i)}, aVar, (i2 << 3) & 112), AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.Friends, izsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return h;
    }

    public static final us2 b(List list, androidx.compose.runtime.a aVar) {
        int i = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1373046951, 0, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.joinDot (SubscribersSlotImplContent.kt:330)");
        }
        String str = " " + d370.N(R.string.author_header_dot_separator, 0, aVar) + ' ';
        us2.b bVar = new us2.b();
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            us2 us2Var = (us2) obj;
            if (i > 0) {
                bVar.g(str);
            }
            bVar.h(us2Var);
            i = i2;
        }
        us2 n = bVar.n();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return n;
    }

    public static final us2 c(int i, int i2, androidx.compose.runtime.a aVar, izs izsVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1198710649, i2, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.mutualLabelProfile (SubscribersSlotImplContent.kt:381)");
        }
        us2 h = h(d370.F(R.plurals.author_header_subscribers_profile_mutual_friends, i, new Object[]{xpm0.b(i)}, aVar, (i2 << 3) & 112), AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.SharedFriends, izsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return h;
    }

    public static final us2 d(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-786315609, i2, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.relationStatusLabel (SubscribersSlotImplContent.kt:346)");
        }
        us2 g = g(d370.N(i, i2 & 14, aVar), "SubscribersSlotRelationStatus", gzsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return g;
    }

    public static final us2 e(int i, izs<? super AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            izsVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1095137895, i2, -1, "com.vk.profile.design.compose.header.info.subscribers.impl.bydefault.subscribersLabel (SubscribersSlotImplContent.kt:369)");
        }
        us2 h = h(d370.F(R.plurals.author_header_subscribers_subscribers_count, i, new Object[]{xpm0.b(i)}, aVar, (i2 << 3) & 112), AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget.Subscribers, izsVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return h;
    }

    public static final List f(List list) {
        return rli0.A(rli0.y(rli0.j(new ulp0(new i5g(new wow(list)), new fo20(28)), new hxm0(0)), 3));
    }

    public static final us2 g(String str, String str2, final gzs<s3q0> gzsVar) {
        us2.b bVar = new us2.b();
        pdo0 pdo0Var = pdo0.b;
        int l = bVar.l(new q8z.a(str2, new tjo0(new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0Var, null, 61439), (hik0) null, new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, pdo0Var, null, 61439), 6), new i9z() { // from class: xsna.gxm0
            @Override // xsna.i9z
            public final void a(q8z q8zVar) {
                gzs.this.invoke();
            }
        }));
        try {
            bVar.g(str);
            s3q0 s3q0Var = s3q0.a;
            bVar.k(l);
            return bVar.n();
        } catch (Throwable th) {
            bVar.k(l);
            throw th;
        }
    }

    public static final us2 h(String str, AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget filledAudienceClickTarget, izs<? super AuthorHeaderEvent.Info.SubscribersClick.FilledAudienceClickTarget, s3q0> izsVar) {
        if (izsVar == null) {
            return new us2(str);
        }
        return g(str, "SubscribersSlotTarget:" + filledAudienceClickTarget.name(), new j3(26, izsVar, filledAudienceClickTarget));
    }
}
