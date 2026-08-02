package xsna;

import com.vk.im.ui.components.contacts.vc.ContactsViews;
import java.util.List;
import java.util.Set;

/* compiled from: ContactsModel.kt */
/* loaded from: classes2.dex */
public final class gdj {
    public final List<qtd0> a;
    public final Set<ContactsViews> b;
    public final boolean c;
    public final com.vk.im.engine.models.c d;
    public final sbj e;
    public final String f;
    public final List<qtd0> g;
    public final Throwable h;
    public final boolean i;
    public final boolean j;
    public final jgq k;

    /* JADX WARN: Multi-variable type inference failed */
    public gdj(List<? extends qtd0> list, Set<? extends ContactsViews> set, boolean z, com.vk.im.engine.models.c cVar, sbj sbjVar, String str, List<? extends qtd0> list2, Throwable th, boolean z2, boolean z3, jgq jgqVar) {
        this.a = list;
        this.b = set;
        this.c = z;
        this.d = cVar;
        this.e = sbjVar;
        this.f = str;
        this.g = list2;
        this.h = th;
        this.i = z2;
        this.j = z3;
        this.k = jgqVar;
    }

    public static gdj a(gdj gdjVar, List list, sbj sbjVar, String str, List list2, Throwable th, boolean z, jgq jgqVar, int i) {
        if ((i & 1) != 0) {
            list = gdjVar.a;
        }
        List list3 = list;
        Set<ContactsViews> set = gdjVar.b;
        boolean z2 = gdjVar.c;
        com.vk.im.engine.models.c cVar = gdjVar.d;
        sbj sbjVar2 = (i & 16) != 0 ? gdjVar.e : sbjVar;
        String str2 = (i & 32) != 0 ? gdjVar.f : str;
        List list4 = (i & 64) != 0 ? gdjVar.g : list2;
        Throwable th2 = (i & 128) != 0 ? gdjVar.h : th;
        boolean z3 = (i & 256) != 0 ? gdjVar.i : z;
        boolean z4 = (i & 512) != 0 ? gdjVar.j : false;
        jgq jgqVar2 = (i & 1024) != 0 ? gdjVar.k : jgqVar;
        gdjVar.getClass();
        return new gdj(list3, set, z2, cVar, sbjVar2, str2, list4, th2, z3, z4, jgqVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdj)) {
            return false;
        }
        gdj gdjVar = (gdj) obj;
        return epx.f(this.a, gdjVar.a) && epx.f(this.b, gdjVar.b) && this.c == gdjVar.c && epx.f(this.d, gdjVar.d) && epx.f(this.e, gdjVar.e) && epx.f(this.f, gdjVar.f) && epx.f(this.g, gdjVar.g) && epx.f(this.h, gdjVar.h) && this.i == gdjVar.i && this.j == gdjVar.j && epx.f(this.k, gdjVar.k);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + qoy.b(fw3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        String str = this.f;
        int a = fw3.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        Throwable th = this.h;
        return this.k.hashCode() + qoy.b(qoy.b((a + (th != null ? th.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "ContactsState(profiles=" + this.a + ", allowedViews=" + this.b + ", forceContactNameForUsers=" + this.c + ", experiments=" + this.d + ", listState=" + this.e + ", filter=" + this.f + ", profilesFiltered=" + this.g + ", error=" + this.h + ", loading=" + this.i + ", shouldNotifyAboutContactsImport=" + this.j + ", extraSettings=" + this.k + ')';
    }
}
