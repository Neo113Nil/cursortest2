package xsna;

import com.vk.dto.photo.PhotoAlbum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.q8a0;
import xsna.u8a0;
import xsna.y8a0;

/* compiled from: PhotoFlowSettingsReducer.kt */
/* loaded from: classes4.dex */
public final class w8a0 extends dm50<a9a0, u8a0, y8a0> {
    public final boolean d;

    public w8a0(boolean z) {
        super(new y8a0(null, y8a0.a.b.a, null, jgp.b));
        this.d = z;
    }

    @Override // xsna.dm50
    public final y8a0 c(y8a0 y8a0Var, u8a0 u8a0Var) {
        Collection collection;
        y8a0 y8a0Var2 = y8a0Var;
        u8a0 u8a0Var2 = u8a0Var;
        Collection<q8a0.a> collection2 = y8a0Var2.b;
        if (u8a0Var2 instanceof u8a0.a) {
            u8a0.a aVar = (u8a0.a) u8a0Var2;
            y8a0.a.C4085a c4085a = new y8a0.a.C4085a(aVar.b);
            return (aVar.c || (collection = collection2) == null || collection.isEmpty()) ? y8a0.a(y8a0Var2, null, c4085a, null, null, 13) : y8a0.a(y8a0Var2, null, null, c4085a, null, 11);
        }
        if (u8a0Var2 instanceof u8a0.c) {
            Collection collection3 = collection2;
            return (collection3 == null || collection3.isEmpty()) ? y8a0.a(y8a0Var2, null, y8a0.a.b.a, null, null, 9) : y8a0.a(y8a0Var2, null, null, y8a0.a.b.a, null, 9);
        }
        if (u8a0Var2 instanceof u8a0.b) {
            if (collection2 == null) {
                collection2 = EmptyList.b;
            }
            return y8a0.a(y8a0Var2, j5g.u0(((u8a0.b) u8a0Var2).b, collection2), null, null, null, 8);
        }
        if (u8a0Var2 instanceof u8a0.d) {
            return y8a0.a(y8a0Var2, ((u8a0.d) u8a0Var2).b, null, null, null, 12);
        }
        if (!(u8a0Var2 instanceof u8a0.e)) {
            throw new NoWhenBranchMatchedException();
        }
        u8a0.e eVar = (u8a0.e) u8a0Var2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y8a0Var2.e);
        linkedHashMap.put(Integer.valueOf(eVar.b.a().b), Boolean.valueOf(eVar.c));
        ArrayList arrayList = null;
        if (collection2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (q8a0.a aVar2 : collection2) {
                Boolean bool = (Boolean) linkedHashMap.get(Integer.valueOf(aVar2.a().b));
                PhotoAlbum a = (bool == null || Boolean.valueOf(aVar2.a().w).equals(bool)) ? null : aVar2.a();
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap.remove(Integer.valueOf(((PhotoAlbum) it.next()).b));
            }
        }
        return y8a0.a(y8a0Var2, null, null, null, linkedHashMap, 7);
    }

    @Override // xsna.dm50
    public final a9a0 d() {
        return new a9a0(e(new m360(this, 5)), e(new com(25)));
    }

    @Override // xsna.dm50
    public final void h(y8a0 y8a0Var, a9a0 a9a0Var) {
        y8a0 y8a0Var2 = y8a0Var;
        a9a0 a9a0Var2 = a9a0Var;
        if (epx.f(y8a0Var2.c, y8a0.a.b.a)) {
            f(a9a0Var2.b, y8a0Var2);
        } else {
            f(a9a0Var2.a, y8a0Var2);
        }
    }
}
