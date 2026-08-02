package xsna;

import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: SearchProfileSubscriptionDelegate.kt */
/* loaded from: classes16.dex */
public final class qxh0 {
    public final q3a a;
    public final mcc0 b;
    public final com.vk.catalog2.common.ui.mvp.holder.search.b c;
    public final b25 d;
    public a e;
    public io.reactivex.rxjava3.disposables.c f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchProfileSubscriptionDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Loading;
        public static final a NotSubscribed;
        public static final a RecentlySubscribed;
        public static final a Subscribed;

        static {
            a aVar = new a("NotSubscribed", 0);
            NotSubscribed = aVar;
            a aVar2 = new a("RecentlySubscribed", 1);
            RecentlySubscribed = aVar2;
            a aVar3 = new a("Subscribed", 2);
            Subscribed = aVar3;
            a aVar4 = new a("Loading", 3);
            Loading = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: SearchProfileSubscriptionDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.NotSubscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.RecentlySubscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Subscribed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.Loading.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qxh0(q3a q3aVar, mcc0 mcc0Var, com.vk.catalog2.common.ui.mvp.holder.search.b bVar, b25 b25Var) {
        this.a = q3aVar;
        this.b = mcc0Var;
        this.c = bVar;
        this.d = b25Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static UserId a(oap oapVar, boolean z) {
        if (oapVar instanceof oap.b) {
            UserId userId = ((Group) ((oap.b) oapVar).a).c;
            return z ? fkq0.e(userId) : userId;
        }
        if (oapVar instanceof oap.a) {
            return ((UserProfile) ((oap.a) oapVar).a).c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(oap oapVar) {
        if (oapVar instanceof oap.b) {
            Group group = (Group) ((oap.b) oapVar).a;
            return group.j || group.C == 4;
        }
        if (oapVar instanceof oap.a) {
            return ((UserProfile) ((oap.a) oapVar).a).M();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void c(oap<? extends UserProfile, ? extends Group> oapVar, CatalogProfileLocalState.FollowSource followSource, String str) {
        boolean b2 = b(oapVar);
        UserId a2 = a(oapVar, false);
        d(a2, CatalogProfileLocalState.FollowSource.InternalPending);
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c subscribe = o0r0.i(xwk.e(), a(oapVar, true), b2, null, false, str, 100).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new b2u(new d220(14), 1), new m1r(new com.vk.video.ui.discovery.minimizable.related_videos.j(this, a2, followSource, 10), 26));
        this.b.a(subscribe);
        this.f = subscribe;
    }

    public final void d(UserId userId, CatalogProfileLocalState.FollowSource followSource) {
        this.a.b(new buz(12, new av70(13), new an7(this, userId, followSource, 7)), false);
    }
}
