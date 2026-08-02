package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipImportContactsClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.jdw0;

/* compiled from: VoipContactsClickAnalytics.kt */
/* loaded from: classes11.dex */
public final class ymw0 extends wew0<b> implements jdw0.b {
    public static final a c = new a();

    /* compiled from: VoipContactsClickAnalytics.kt */
    public static final class a implements jdw0.a {
        @Override // xsna.jdw0.a
        public final boolean a(mdw0 mdw0Var) {
            return mdw0Var instanceof b;
        }
    }

    /* compiled from: VoipContactsClickAnalytics.kt */
    /* loaded from: classes7.dex */
    public interface b extends mdw0 {

        /* compiled from: VoipContactsClickAnalytics.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -380031098;
            }

            public final String toString() {
                return "ImportContactsClick";
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
        if (!(bVar instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        wew0.c(this, null, null, new MobileOfficialAppsCallsStat$TypeVoipImportContactsClick(MobileOfficialAppsCallsStat$TypeVoipImportContactsClick.EventType.IMPORT_CONTACTS_CLICK, MobileOfficialAppsCallsStat$TypeVoipImportContactsClick.Source.CALLS_SERVICES), 7);
    }
}
