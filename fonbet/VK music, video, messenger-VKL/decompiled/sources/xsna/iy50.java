package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NavigationEventBuilder.kt */
/* loaded from: classes5.dex */
public final class iy50 extends vk6<SchemeStat$TypeNavgo> {
    public a h;
    public a i;
    public SchemeStat$TypeNavgo.Cause j;
    public SchemeStat$TypeNavgo k;

    /* compiled from: NavigationEventBuilder.kt */
    public static final class a {
        public final MobileOfficialAppsCoreNavStat$EventScreen a;
        public final SchemeStat$EventItem b;
        public final ArrayList<x8h0> c;

        public /* synthetic */ a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
            this(mobileOfficialAppsCoreNavStat$EventScreen, null, null);
        }

        public final MobileOfficialAppsCoreNavStat$EventScreen a() {
            return this.a;
        }

        public final ArrayList<x8h0> b() {
            return this.c;
        }

        public final SchemeStat$EventItem c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SchemeStat$EventItem schemeStat$EventItem = this.b;
            int hashCode2 = (hashCode + (schemeStat$EventItem == null ? 0 : schemeStat$EventItem.hashCode())) * 31;
            ArrayList<x8h0> arrayList = this.c;
            return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ScreenInfo(screen=");
            sb.append(this.a);
            sb.append(", screenItem=");
            sb.append(this.b);
            sb.append(", screenInfo=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }

        public a(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$EventItem schemeStat$EventItem, ArrayList<x8h0> arrayList) {
            this.a = mobileOfficialAppsCoreNavStat$EventScreen;
            this.b = schemeStat$EventItem;
            this.c = arrayList;
        }
    }

    public iy50(int i) {
        this(qsk0.a);
    }

    public static List F(a aVar) {
        SchemeStat$NavigationScreenInfoItem a2;
        ArrayList<x8h0> arrayList = aVar.c;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<x8h0> arrayList2 = aVar.c;
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            for (x8h0 x8h0Var : arrayList2) {
                SchemeStat$NavigationScreenInfoItem.b bVar = x8h0Var instanceof SchemeStat$NavigationScreenInfoItem.b ? (SchemeStat$NavigationScreenInfoItem.b) x8h0Var : null;
                if (bVar != null) {
                    a2 = SchemeStat$NavigationScreenInfoItem.a.a(bVar);
                } else {
                    if (BuildInfo.h()) {
                        throw new IllegalArgumentException("incorrect screen info type " + x8h0Var + '!');
                    }
                    a2 = null;
                }
                arrayList3.add(a2);
            }
            List V = j5g.V(arrayList3);
            if (!V.isEmpty()) {
                return V;
            }
        }
        return null;
    }

    public final void A() {
        J(SchemeStat$TypeNavgo.Subtype.APP_START);
    }

    public final void B() {
        J(SchemeStat$TypeNavgo.Subtype.LINK);
    }

    public final void C() {
        J(SchemeStat$TypeNavgo.Subtype.PUSH);
    }

    public final void D() {
        J(SchemeStat$TypeNavgo.Subtype.SYSTEM);
    }

    public final void E(a aVar) {
        this.i = aVar;
    }

    public final void G() {
        this.j = SchemeStat$TypeNavgo.Cause.TAB_BAR;
    }

    public final void H(SchemeStat$TypeNavgo.Cause cause) {
        this.j = cause;
    }

    public final void I(long j) {
        this.e = Long.valueOf(j);
    }

    public final void J(SchemeStat$TypeNavgo.Subtype subtype) {
        Object obj;
        Object obj2;
        if (this.k != null) {
            throw new IllegalArgumentException("event is already initialized!");
        }
        SchemeStat$TypeNavgo.Cause cause = this.j;
        String str = new String();
        a aVar = this.h;
        SchemeStat$EventItem schemeStat$EventItem = aVar.b;
        List F = F(aVar);
        a aVar2 = this.i;
        SchemeStat$EventItem schemeStat$EventItem2 = aVar2.b;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = aVar2.a;
        List F2 = F(aVar2);
        ArrayList<x8h0> arrayList = this.h.c;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (((x8h0) obj2) instanceof SchemeStat$TypeNavgo.b) {
                        break;
                    }
                }
            }
            obj = (x8h0) obj2;
        } else {
            obj = null;
        }
        this.k = SchemeStat$TypeNavgo.a.a(subtype, mobileOfficialAppsCoreNavStat$EventScreen, str, cause, schemeStat$EventItem, F, schemeStat$EventItem2, F2, obj instanceof SchemeStat$TypeNavgo.b ? (SchemeStat$TypeNavgo.b) obj : null);
    }

    public final void K(a aVar) {
        this.h = aVar;
    }

    @Override // xsna.vk6, xsna.cd6
    /* renamed from: u */
    public final gsd0 p() {
        SchemeStat$TypeNavgo schemeStat$TypeNavgo = (SchemeStat$TypeNavgo) r(this.k);
        if (schemeStat$TypeNavgo == null) {
            return null;
        }
        return new gsd0(this.h.a, schemeStat$TypeNavgo, false);
    }

    public final void v() {
        J(SchemeStat$TypeNavgo.Subtype.AWAY);
    }

    public final void w() {
        J(SchemeStat$TypeNavgo.Subtype.APP_CLOSE);
        this.d = true;
    }

    public final void x() {
        J(SchemeStat$TypeNavgo.Subtype.HIDE);
        this.d = true;
    }

    public final void y(boolean z) {
        J(z ? SchemeStat$TypeNavgo.Subtype.GO : SchemeStat$TypeNavgo.Subtype.BACK);
    }

    public final void z() {
        J(SchemeStat$TypeNavgo.Subtype.SHOW);
    }

    public iy50(irk0 irk0Var) {
        super(irk0Var);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
        this.h = new a(mobileOfficialAppsCoreNavStat$EventScreen, null, null);
        this.i = new a(mobileOfficialAppsCoreNavStat$EventScreen, null, null);
    }
}
