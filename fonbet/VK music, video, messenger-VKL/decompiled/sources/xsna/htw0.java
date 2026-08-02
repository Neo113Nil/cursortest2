package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdw0;

/* compiled from: VoipOpenDialogClickAnalytics.kt */
/* loaded from: classes11.dex */
public final class htw0 extends wew0<b> implements jdw0.b {
    public static final a c = new a();

    /* compiled from: VoipOpenDialogClickAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipOpenDialogClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipOpenDialogClickAnalytics.kt */
        public interface a extends b {

            /* compiled from: VoipOpenDialogClickAnalytics.kt */
            /* renamed from: xsna.htw0$b$a$a, reason: collision with other inner class name */
            public static final class C3020a implements a {
                public static final C3020a a = new C3020a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3020a);
                }

                public final int hashCode() {
                    return -458115431;
                }

                public final String toString() {
                    return "Call";
                }
            }
        }

        /* compiled from: VoipOpenDialogClickAnalytics.kt */
        /* renamed from: xsna.htw0$b$b, reason: collision with other inner class name */
        public interface InterfaceC3021b extends b {

            /* compiled from: VoipOpenDialogClickAnalytics.kt */
            /* renamed from: xsna.htw0$b$b$a */
            public static final class a implements InterfaceC3021b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -726179323;
                }

                public final String toString() {
                    return "Call";
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
        if (bVar instanceof b.InterfaceC3021b) {
            if (!(((b.InterfaceC3021b) bVar) instanceof b.InterfaceC3021b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            wew0.c(this, null, null, new MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick(MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.EventType.CALL_OTHER_CLICK, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.Source.PROFILE, null, 4, null), 7);
            return;
        }
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(((b.a) bVar) instanceof b.a.C3020a)) {
            throw new NoWhenBranchMatchedException();
        }
        wew0.c(this, MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS, null, new MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick(MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.EventType.CALL_OTHER_CLICK, MobileOfficialAppsCallsStat$TypeVoipMoreMenuClick.Source.FRIENDS_LIST, null, 4, null), 6);
    }
}
