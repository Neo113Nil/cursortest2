package xsna;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsState.kt */
/* loaded from: classes4.dex */
public final class y8a0 implements km50 {
    public final List<q8a0.a> b;
    public final a c;
    public final a d;
    public final Map<Integer, Boolean> e;

    /* compiled from: PhotoFlowSettingsState.kt */
    public static abstract class a {

        /* compiled from: PhotoFlowSettingsState.kt */
        /* renamed from: xsna.y8a0$a$a, reason: collision with other inner class name */
        public static final class C4085a extends a {
            public final Throwable a;

            public C4085a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: PhotoFlowSettingsState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y8a0(List<? extends q8a0.a> list, a aVar, a aVar2, Map<Integer, Boolean> map) {
        this.b = list;
        this.c = aVar;
        this.d = aVar2;
        this.e = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y8a0 a(y8a0 y8a0Var, List list, a aVar, a aVar2, LinkedHashMap linkedHashMap, int i) {
        if ((i & 1) != 0) {
            list = y8a0Var.b;
        }
        if ((i & 2) != 0) {
            aVar = y8a0Var.c;
        }
        if ((i & 4) != 0) {
            aVar2 = y8a0Var.d;
        }
        Map map = linkedHashMap;
        if ((i & 8) != 0) {
            map = y8a0Var.e;
        }
        y8a0Var.getClass();
        return new y8a0(list, aVar, aVar2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8a0)) {
            return false;
        }
        y8a0 y8a0Var = (y8a0) obj;
        return epx.f(this.b, y8a0Var.b) && epx.f(this.c, y8a0Var.c) && epx.f(this.d, y8a0Var.d) && epx.f(this.e, y8a0Var.e);
    }

    public final int hashCode() {
        List<q8a0.a> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        return this.e.hashCode() + ((hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoFlowSettingsState(albums=");
        sb.append(this.b);
        sb.append(", firstPageLoadingState=");
        sb.append(this.c);
        sb.append(", nextPageLoadingState=");
        sb.append(this.d);
        sb.append(", updatedAlbums=");
        return cjl0.a(sb, this.e, ')');
    }
}
