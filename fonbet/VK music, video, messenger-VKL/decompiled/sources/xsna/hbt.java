package xsna;

import com.vk.games.model.GamesHeaderSectionInfo;
import com.vk.games.presentation.catalog.model.ListNextState;
import java.util.List;

/* compiled from: GamesCatalogDetailState.kt */
/* loaded from: classes17.dex */
public final class hbt implements km50 {
    public final boolean b;
    public final kbt c;
    public final ListNextState d;
    public final boolean e;
    public final int f;
    public final String g;
    public final GamesHeaderSectionInfo h;
    public final List<ebt> i;

    public hbt() {
        this(0);
    }

    public static hbt a(hbt hbtVar, boolean z, kbt kbtVar, ListNextState listNextState, boolean z2, int i, String str, GamesHeaderSectionInfo gamesHeaderSectionInfo, List list, int i2) {
        if ((i2 & 1) != 0) {
            z = hbtVar.b;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            kbtVar = hbtVar.c;
        }
        kbt kbtVar2 = kbtVar;
        if ((i2 & 4) != 0) {
            listNextState = hbtVar.d;
        }
        ListNextState listNextState2 = listNextState;
        if ((i2 & 8) != 0) {
            z2 = hbtVar.e;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = hbtVar.f;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str = hbtVar.g;
        }
        String str2 = str;
        GamesHeaderSectionInfo gamesHeaderSectionInfo2 = (i2 & 64) != 0 ? hbtVar.h : gamesHeaderSectionInfo;
        List list2 = (i2 & 128) != 0 ? hbtVar.i : list;
        hbtVar.getClass();
        return new hbt(z3, kbtVar2, listNextState2, z4, i3, str2, gamesHeaderSectionInfo2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbt)) {
            return false;
        }
        hbt hbtVar = (hbt) obj;
        return this.b == hbtVar.b && epx.f(this.c, hbtVar.c) && this.d == hbtVar.d && this.e == hbtVar.e && this.f == hbtVar.f && epx.f(this.g, hbtVar.g) && epx.f(this.h, hbtVar.h) && epx.f(this.i, hbtVar.i);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        kbt kbtVar = this.c;
        int hashCode2 = (hashCode + (kbtVar == null ? 0 : kbtVar.hashCode())) * 31;
        ListNextState listNextState = this.d;
        int a = shy.a(this.f, qoy.b((hashCode2 + (listNextState == null ? 0 : listNextState.hashCode())) * 31, 31, this.e), 31);
        String str = this.g;
        int hashCode3 = (a + (str == null ? 0 : str.hashCode())) * 31;
        GamesHeaderSectionInfo gamesHeaderSectionInfo = this.h;
        int hashCode4 = (hashCode3 + (gamesHeaderSectionInfo == null ? 0 : gamesHeaderSectionInfo.hashCode())) * 31;
        List<ebt> list = this.i;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogDetailState(isLoading=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", nextState=");
        sb.append(this.d);
        sb.append(", hasNext=");
        sb.append(this.e);
        sb.append(", currentPage=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", headerContent=");
        sb.append(this.h);
        sb.append(", items=");
        return ms9.a(')', sb, this.i);
    }

    public /* synthetic */ hbt(int i) {
        this(true, null, null, true, 0, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hbt(boolean z, kbt kbtVar, ListNextState listNextState, boolean z2, int i, String str, GamesHeaderSectionInfo gamesHeaderSectionInfo, List<? extends ebt> list) {
        this.b = z;
        this.c = kbtVar;
        this.d = listNextState;
        this.e = z2;
        this.f = i;
        this.g = str;
        this.h = gamesHeaderSectionInfo;
        this.i = list;
    }
}
