package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$CallType;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipShareToUserClick;
import com.vk.voip.ui.share.link.pager_new.model.SharingReason;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdw0;

/* compiled from: VoipShareLinkPagerAnalytics.kt */
/* loaded from: classes11.dex */
public final class j1x0 extends wew0<b> implements jdw0.b {
    public static final a c = new a();

    /* compiled from: VoipShareLinkPagerAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipShareLinkPagerAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipShareLinkPagerAnalytics.kt */
        public static final class a implements b {
            public final boolean a;

            public a(boolean z) {
                this.a = z;
            }

            public final boolean b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("CallAnyway(isContact="), this.a, ')');
            }
        }

        /* compiled from: VoipShareLinkPagerAnalytics.kt */
        /* renamed from: xsna.j1x0$b$b, reason: collision with other inner class name */
        public static final class C3092b implements b {
            public final SharingReason a;

            public C3092b(SharingReason sharingReason) {
                this.a = sharingReason;
            }

            public final SharingReason b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3092b) && this.a == ((C3092b) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "LinkCopy(reason=" + this.a + ')';
            }
        }

        /* compiled from: VoipShareLinkPagerAnalytics.kt */
        public static final class c implements b {
            public final SharingReason a;

            public c(SharingReason sharingReason) {
                this.a = sharingReason;
            }

            public final SharingReason b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Opened(reason=" + this.a + ')';
            }
        }

        /* compiled from: VoipShareLinkPagerAnalytics.kt */
        public static final class d implements b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 364929551;
            }

            public final String toString() {
                return "SendChat";
            }
        }

        /* compiled from: VoipShareLinkPagerAnalytics.kt */
        public static final class e implements b {
            public final SharingReason a;

            public e(SharingReason sharingReason) {
                this.a = sharingReason;
            }

            public final SharingReason b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "System(reason=" + this.a + ')';
            }
        }
    }

    /* compiled from: VoipShareLinkPagerAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SharingReason.values().length];
            try {
                iArr[SharingReason.PrivacyAndExpiration.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SharingReason.Privacy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SharingReason.Expiration.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.Source e(SharingReason sharingReason) {
        int i = c.$EnumSwitchMapping$0[sharingReason.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.Source.GENERAL_SHARE;
        }
        if (i == 2) {
            return MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.Source.DISABLE_CALLS;
        }
        if (i == 3) {
            return MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.Source.LONG_AGO;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.jdw0.b
    public final boolean a(mdw0 mdw0Var) {
        if (!(mdw0Var instanceof b)) {
            return false;
        }
        b((b) mdw0Var);
        return true;
    }

    @Override // xsna.kdw0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void b(b bVar) {
        MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.EventType eventType;
        MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.Source e;
        boolean z = bVar instanceof b.d;
        if (z) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.EventType.SHARE_LINK_CHAT;
        } else if (bVar instanceof b.C3092b) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.EventType.SHARE_LINK_COPY;
        } else if (bVar instanceof b.c) {
            eventType = MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.EventType.SHARE_LINK_OPEN;
        } else {
            if (!(bVar instanceof b.e)) {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                wew0.c(this, null, null, new MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick(MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.EventType.OUTGOING_CALL_CLICK, MobileOfficialAppsCallsStat$TypeVoipOutgoingCallClick.Source.CALLS_SERVICES_LONG_AGO, ((b.a) bVar).b() ? MobileOfficialAppsCallsStat$CallType.CONTACT : MobileOfficialAppsCallsStat$CallType.USER), 7);
                return;
            }
            eventType = MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.EventType.SHARE_LINK_MODAL;
        }
        if (z) {
            e = MobileOfficialAppsCallsStat$TypeVoipShareToUserClick.Source.DISABLE_CALLS;
        } else if (bVar instanceof b.C3092b) {
            e = e(((b.C3092b) bVar).b());
        } else if (bVar instanceof b.c) {
            e = e(((b.c) bVar).b());
        } else {
            if (!(bVar instanceof b.e)) {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            e = e(((b.e) bVar).b());
        }
        wew0.c(this, null, null, new MobileOfficialAppsCallsStat$TypeVoipShareToUserClick(eventType, e), 7);
    }
}
