package xsna;

import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.api.NotificationsPermission;
import kotlin.NoWhenBranchMatchedException;
import xsna.oap;

/* compiled from: SearchAuthorSubscriptionDelegate.kt */
/* loaded from: classes16.dex */
public final class enh0 {
    public final q3a a;
    public final mcc0 b;
    public final com.vk.catalog2.common.ui.mvp.holder.search.d c;
    public final NotificationsPermission d;
    public final b25 e;
    public final com.vk.catalog2.common.ui.holders.c f;
    public a g;
    public io.reactivex.rxjava3.disposables.c h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchAuthorSubscriptionDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NotSubscribed;
        public static final a Subscribed;

        static {
            a aVar = new a("NotSubscribed", 0);
            NotSubscribed = aVar;
            a aVar2 = new a("Subscribed", 1);
            Subscribed = aVar2;
            a[] aVarArr = {aVar, aVar2};
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

    /* compiled from: SearchAuthorSubscriptionDelegate.kt */
    public static final class b {
        static {
            int[] iArr = VkButton.W;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: SearchAuthorSubscriptionDelegate.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Subscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NotSubscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public enh0(q3a q3aVar, mcc0 mcc0Var, com.vk.catalog2.common.ui.mvp.holder.search.d dVar, NotificationsPermission notificationsPermission, b25 b25Var) {
        this.a = q3aVar;
        this.b = mcc0Var;
        this.c = dVar;
        this.d = notificationsPermission;
        this.e = b25Var;
        this.f = new com.vk.catalog2.common.ui.holders.c(q3aVar, mcc0Var, dVar);
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

    public final void c(UserId userId, CatalogProfileLocalState.FollowSource followSource) {
        this.a.b(new buz(12, new amp(27), new yi1(this, userId, followSource, 6)), false);
    }
}
