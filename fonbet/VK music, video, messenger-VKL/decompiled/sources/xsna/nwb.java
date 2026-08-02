package xsna;

import com.vk.im.ui.components.chat_profile.ChatProfileListItem;
import java.util.ArrayList;
import java.util.List;
import xsna.p6p;

/* compiled from: ChatProfileAdapterItem.kt */
/* loaded from: classes2.dex */
public abstract class nwb implements a7i {

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class a extends nwb {
        public final ChatProfileListItem.a b;

        public a(ChatProfileListItem.a aVar) {
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.a);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "AchievementItems(data=" + this.b + ')';
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!a.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            a aVar = (a) a7iVar;
            ChatProfileListItem.a aVar2 = this.b;
            int i = aVar2.a;
            ChatProfileListItem.a aVar3 = aVar.b;
            if (i != aVar3.a || !epx.f(aVar2.h, aVar3.h)) {
                return false;
            }
            boolean z = aVar2.e;
            ChatProfileListItem.a aVar4 = aVar.b;
            return z == aVar4.e && aVar2.g == aVar4.g;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class b extends nwb {
        public final ChatProfileListItem b;

        public b(ChatProfileListItem chatProfileListItem) {
            this.b = chatProfileListItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.a);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CellItem(data=" + this.b + ')';
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!b.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            b bVar = (b) a7iVar;
            ChatProfileListItem chatProfileListItem = this.b;
            int i = chatProfileListItem.a;
            ChatProfileListItem chatProfileListItem2 = bVar.b;
            ChatProfileListItem chatProfileListItem3 = bVar.b;
            return i == chatProfileListItem2.a && epx.f(chatProfileListItem.b, chatProfileListItem2.b) && chatProfileListItem.e == chatProfileListItem3.e && epx.f(chatProfileListItem.d, chatProfileListItem3.d) && chatProfileListItem.c == chatProfileListItem3.c && chatProfileListItem.d() == chatProfileListItem3.d() && chatProfileListItem.f == chatProfileListItem3.f;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class c extends nwb {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // xsna.nwb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return Integer.MIN_VALUE;
        }

        public final int hashCode() {
            return -1544996597;
        }

        public final String toString() {
            return "Divider";
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            return a7iVar == this;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class d extends e {
        @Override // xsna.nwb.g
        public final boolean a() {
            return false;
        }

        @Override // xsna.nwb.g
        public final boolean c() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(hashCode());
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(qoy.b(Boolean.hashCode(false) * 31, 31, false), 31, false);
        }

        public final String toString() {
            return "EduInviteItem(showInviteButton=false, showAllOrganizationsButton=false, isStartSection=false, isEndSection=false)";
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!d.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            ((d) a7iVar).getClass();
            return true;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static abstract class e extends nwb implements g, b7i {
        @Override // xsna.b7i
        public final boolean b(b7i b7iVar) {
            return b7iVar instanceof e;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class f extends e {
        public final p6p.a b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(p6p.a aVar, boolean z, boolean z2, boolean z3, boolean z4) {
            this.b = aVar;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        @Override // xsna.nwb.g
        public final boolean a() {
            return this.e;
        }

        @Override // xsna.nwb.g
        public final boolean c() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e && this.f == fVar.f;
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.hashCode());
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EduRoleItem(data=");
            sb.append(this.b);
            sb.append(", showAsNoOrganization=");
            sb.append(this.c);
            sb.append(", showChevron=");
            sb.append(this.d);
            sb.append(", isStartSection=");
            sb.append(this.e);
            sb.append(", isEndSection=");
            return defpackage.q0.a(sb, this.f, ')');
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!f.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            f fVar = (f) a7iVar;
            return epx.f(this.b, fVar.b) && this.c == fVar.c;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public interface g {
        boolean a();

        boolean c();
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class h extends nwb implements g {
        public final ChatProfileListItem.c b;
        public final String c;
        public final boolean d = true;
        public final boolean e = true;

        public h(ChatProfileListItem.c cVar, String str) {
            this.b = cVar;
            this.c = str;
        }

        @Override // xsna.nwb.g
        public final boolean a() {
            return this.d;
        }

        @Override // xsna.nwb.g
        public final boolean c() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e;
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.a);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return Boolean.hashCode(this.e) + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemWithDescription(data=");
            sb.append(this.b);
            sb.append(", description=");
            sb.append(this.c);
            sb.append(", isStartSection=");
            sb.append(this.d);
            sb.append(", isEndSection=");
            return defpackage.q0.a(sb, this.e, ')');
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!h.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            h hVar = (h) a7iVar;
            ChatProfileListItem.c cVar = this.b;
            int i = cVar.a;
            ChatProfileListItem.c cVar2 = hVar.b;
            ChatProfileListItem.c cVar3 = hVar.b;
            return i == cVar2.a && epx.f(cVar.b, cVar2.b) && cVar.e == cVar3.e && epx.f(cVar.d, cVar3.d) && cVar.c == cVar3.c && cVar.k == cVar3.k && cVar.f == cVar3.f;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class i extends nwb {
        public final int b;
        public final int c;

        public i(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.b == iVar.b && this.c == iVar.c;
        }

        @Override // xsna.nwb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483646;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LabelItem(textRes=");
            sb.append(this.b);
            sb.append(", iconDrawableRes=");
            return vu5.b(sb, this.c, ')');
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!i.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            i iVar = (i) a7iVar;
            return this.b == iVar.b && this.c == iVar.c;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class j extends nwb implements g {
        public final ChatProfileListItem.d b;
        public final boolean c = true;
        public final boolean d = true;

        public j(ChatProfileListItem.d dVar) {
            this.b = dVar;
        }

        @Override // xsna.nwb.g
        public final boolean a() {
            return this.c;
        }

        @Override // xsna.nwb.g
        public final boolean c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && this.c == jVar.c && this.d == jVar.d;
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.a);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultilineItem(data=");
            sb.append(this.b);
            sb.append(", isStartSection=");
            sb.append(this.c);
            sb.append(", isEndSection=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!j.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            j jVar = (j) a7iVar;
            ChatProfileListItem.d dVar = this.b;
            int i = dVar.a;
            ChatProfileListItem.d dVar2 = jVar.b;
            ChatProfileListItem.d dVar3 = jVar.b;
            return i == dVar2.a && epx.f(dVar.b, dVar2.b) && dVar.e == dVar3.e && epx.f(dVar.d, dVar3.d) && dVar.c == dVar3.c && dVar.g == dVar3.g && dVar.f == dVar3.f;
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class k extends nwb implements g {
        public final qxb b;
        public final boolean c;
        public final boolean d;

        public k(qxb qxbVar, boolean z, boolean z2) {
            this.b = qxbVar;
            this.c = z;
            this.d = z2;
        }

        @Override // xsna.nwb.g
        public final boolean a() {
            return this.c;
        }

        @Override // xsna.nwb.g
        public final boolean c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d;
        }

        @Override // xsna.nwb, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b.getId());
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SimpleItem(data=");
            sb.append(this.b);
            sb.append(", isStartSection=");
            sb.append(this.c);
            sb.append(", isEndSection=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            if (this == a7iVar) {
                return true;
            }
            if (!k.class.equals(a7iVar != null ? a7iVar.getClass() : null)) {
                return false;
            }
            k kVar = (k) a7iVar;
            qxb qxbVar = this.b;
            int id = qxbVar.getId();
            qxb qxbVar2 = kVar.b;
            qxb qxbVar3 = kVar.b;
            return id == qxbVar2.getId() && epx.f(qxbVar.f(), qxbVar3.f()) && qxbVar.c() == qxbVar3.c() && epx.f(qxbVar.a(), qxbVar3.a()) && qxbVar.b() == qxbVar3.b() && qxbVar.d() == qxbVar3.d() && qxbVar.e() == qxbVar3.e();
        }
    }

    /* compiled from: ChatProfileAdapterItem.kt */
    public static final class l extends nwb {
        public final List<sxb> b;
        public final ArrayList c;

        public l(ArrayList arrayList, List list) {
            this.b = list;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return epx.f(this.b, lVar.b) && epx.f(this.c, lVar.c);
        }

        @Override // xsna.nwb, xsna.hfz
        public final /* bridge */ /* synthetic */ Number getItemId() {
            return -2147483647;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabsItem(tabsItems=");
            sb.append(this.b);
            sb.append(", tabsStatScreens=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }

        @Override // xsna.a7i
        public final boolean za(a7i a7iVar) {
            return (a7iVar instanceof l) && epx.f(((l) a7iVar).b, this.b);
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
