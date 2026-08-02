package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: MsgSearchState.kt */
/* loaded from: classes2.dex */
public final class hy30 {
    public final ArrayList a;
    public LinkedHashMap b;
    public ProfilesSimpleInfo c;
    public String d;
    public final Long e;
    public boolean f;
    public boolean g;
    public SearchMode h;
    public Source i;
    public eu90 j;
    public mib k;
    public List<dcf0> l;
    public Set<Long> m;
    public final LinkedHashMap n;
    public final LinkedHashMap o;
    public List<Dialog> p;
    public List<Dialog> q;

    public hy30() {
        this(null, null, null, false, false, null, null, null, null, 16383);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void a(SearchMode searchMode) {
        this.a.clear();
        this.b.clear();
        Iterator it = this.c.g.entrySet().iterator();
        while (it.hasNext()) {
            ((Map) ((Map.Entry) it.next()).getValue()).clear();
        }
        this.n.clear();
        this.h = searchMode;
        this.d = "";
        this.k = new mib(0);
    }

    public hy30(String str, Long l, String str2, boolean z, boolean z2, SearchMode searchMode, Source source, eu90 eu90Var, mib mibVar, int i) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        str = (i & 8) != 0 ? "" : str;
        l = (i & 16) != 0 ? null : l;
        z = (i & 64) != 0 ? true : z;
        z2 = (i & 128) != 0 ? true : z2;
        searchMode = (i & 256) != 0 ? SearchMode.PEERS : searchMode;
        source = (i & 512) != 0 ? Source.NETWORK : source;
        eu90Var = (i & 1024) != 0 ? new eu90(0) : eu90Var;
        mibVar = (i & 2048) != 0 ? new mib(0) : mibVar;
        EmptySet emptySet = EmptySet.b;
        this.a = arrayList;
        this.b = linkedHashMap;
        this.c = profilesSimpleInfo;
        this.d = str;
        this.e = l;
        this.f = z;
        this.g = z2;
        this.h = searchMode;
        this.i = source;
        this.j = eu90Var;
        this.k = mibVar;
        this.l = null;
        this.m = emptySet;
        this.n = new LinkedHashMap();
        this.o = new LinkedHashMap();
        EmptyList emptyList = EmptyList.b;
        this.p = emptyList;
        this.q = emptyList;
    }
}
