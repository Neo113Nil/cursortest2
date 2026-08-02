package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$CallType;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.voip.ui.prodstat.analytics.base.common.VoipCallTypeAnalytics;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdw0;

/* compiled from: VoipOpenMenuClickAnalytics.kt */
/* loaded from: classes11.dex */
public final class itw0 extends wew0<b> implements jdw0.b {
    public static final a c = new a();

    /* compiled from: VoipOpenMenuClickAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipOpenMenuClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipOpenMenuClickAnalytics.kt */
        public interface a extends b {

            /* compiled from: VoipOpenMenuClickAnalytics.kt */
            /* renamed from: xsna.itw0$b$a$a, reason: collision with other inner class name */
            public static final class C3081a implements a {
            }

            /* compiled from: VoipOpenMenuClickAnalytics.kt */
            /* renamed from: xsna.itw0$b$a$b, reason: collision with other inner class name */
            public static final class C3082b implements a {
                public static final C3082b a = new C3082b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3082b);
                }

                public final int hashCode() {
                    return 1102103409;
                }

                public final String toString() {
                    return "ToolbarCall";
                }
            }

            /* compiled from: VoipOpenMenuClickAnalytics.kt */
            public static final class c implements a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1102414952;
                }

                public final String toString() {
                    return "ToolbarMore";
                }
            }

            /* compiled from: VoipOpenMenuClickAnalytics.kt */
            public static final class d implements a {
                public final VoipCallTypeAnalytics a;

                public d(VoipCallTypeAnalytics voipCallTypeAnalytics) {
                    this.a = voipCallTypeAnalytics;
                }

                public final VoipCallTypeAnalytics b() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && this.a == ((d) obj).a;
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "UserListMore(callType=" + this.a + ')';
                }
            }
        }
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
        SchemeStat$TypeClick.b mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b.a aVar = (b.a) bVar;
        if (aVar instanceof b.a.C3082b) {
            mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick(MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.EventType.CALLS_SERVICES_CLICK, MobileOfficialAppsCallsStat$TypeVoipCallsServicesClick.Source.CALLS_SERVICES);
        } else if (aVar instanceof b.a.c) {
            mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick(MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.EventType.CALL_MORE_CLICK, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.Source.CALLS_SERVICES, MobileOfficialAppsCallsStat$CallType.GROUP);
        } else if (aVar instanceof b.a.d) {
            mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick(MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.EventType.CALL_OTHER_CLICK, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.Source.CALLS_SERVICES, gjw0.a(((b.a.d) aVar).b()));
        } else {
            if (!(aVar instanceof b.a.C3081a)) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick = new MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick(MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.EventType.CALL_OTHER_CLICK, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.Source.HISTORY_FRIENDS_LIST_SERVICES, gjw0.a(null));
        }
        wew0.c(this, null, null, mobileOfficialAppsCallsStat$TypeVoipMoreMenuClick, 7);
    }
}
