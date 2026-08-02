package com.yandex.div.core.state;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.yandex.div.core.expression.local.ChildPathUnitCache;
import com.yandex.div2.a;
import com.yandex.div2.j3;
import com.yandex.div2.ma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.g5g;
import xsna.go9;
import xsna.gpn;
import xsna.gzs;
import xsna.i9x;
import xsna.ikn;
import xsna.j5g;
import xsna.q2z;
import xsna.swe0;
import xsna.zcl;

/* compiled from: DivStatePath.kt */
/* loaded from: classes7.dex */
public final class DivStatePath {
    public static final Companion Companion = new Companion(null);
    private final boolean containsOnlyStates;
    private final Lazy fullPath$delegate;
    private final List<String> path;
    private final List<Pair<String, String>> states;
    private final Lazy statesString$delegate;
    private final long topLevelStateId;

    /* compiled from: DivStatePath.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int alphabeticalComparator$lambda$2(DivStatePath divStatePath, DivStatePath divStatePath2) {
            String divId;
            String divId2;
            String stateId;
            String stateId2;
            if (divStatePath.getTopLevelStateId() != divStatePath2.getTopLevelStateId()) {
                return (int) (divStatePath.getTopLevelStateId() - divStatePath2.getTopLevelStateId());
            }
            int min = Math.min(divStatePath.states.size(), divStatePath2.states.size());
            for (int i = 0; i < min; i++) {
                Pair pair = (Pair) divStatePath.states.get(i);
                Pair pair2 = (Pair) divStatePath2.states.get(i);
                divId = DivStatePathKt.getDivId(pair);
                divId2 = DivStatePathKt.getDivId(pair2);
                int compareTo = divId.compareTo(divId2);
                if (compareTo != 0) {
                    return compareTo;
                }
                stateId = DivStatePathKt.getStateId(pair);
                stateId2 = DivStatePathKt.getStateId(pair2);
                int compareTo2 = stateId.compareTo(stateId2);
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            return divStatePath.states.size() - divStatePath2.states.size();
        }

        private final List<String> extractStates(List<String> list, List<Pair<String, String>> list2, boolean z) {
            Iterator<T> it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                i = DivStatePath.Companion.findState(list, (Pair) it.next(), i);
            }
            if (z) {
                i++;
            }
            return list.subList(0, i);
        }

        private final List<Pair<String, String>> findSharedPairs(DivStatePath divStatePath, DivStatePath divStatePath2) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : divStatePath.states) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) j5g.b0(i, divStatePath2.states);
                if (pair2 == null || !epx.f(pair, pair2)) {
                    break;
                }
                arrayList.add(pair);
                i = i2;
            }
            return arrayList;
        }

        private final int findState(List<String> list, Pair<String, String> pair, int i) {
            String divId;
            String stateId;
            int size = list.size() - 1;
            while (i < size) {
                String str = list.get(i);
                divId = DivStatePathKt.getDivId(pair);
                if (epx.f(str, divId)) {
                    int i2 = i + 1;
                    String str2 = list.get(i2);
                    stateId = DivStatePathKt.getStateId(pair);
                    if (epx.f(str2, stateId)) {
                        return i2;
                    }
                }
                i++;
            }
            return list.size();
        }

        public final Comparator<DivStatePath> alphabeticalComparator$div_release() {
            return new gpn(0);
        }

        public final DivStatePath fromRootDiv$div_release(long j, a aVar) {
            String valueOf = String.valueOf(j);
            String id = DivPathUtils.INSTANCE.getId(aVar);
            if (id == null) {
                id = ChildPathUnitCache.INSTANCE.getValue$div_release(0);
            }
            return new DivStatePath(j, EmptyList.b, e43.l(valueOf, id), false, 8, null);
        }

        public final DivStatePath fromState(long j) {
            return new DivStatePath(j, new ArrayList(), null, false, 12, null);
        }

        public final DivStatePath fromState$div_release(j3.b bVar) {
            return fromRootDiv$div_release(bVar.b, bVar.a);
        }

        public final DivStatePath lowestCommonAncestor$div_release(DivStatePath divStatePath, DivStatePath divStatePath2) {
            if (divStatePath.getTopLevelStateId() != divStatePath2.getTopLevelStateId()) {
                return null;
            }
            List<Pair<String, String>> findSharedPairs = findSharedPairs(divStatePath, divStatePath2);
            long topLevelStateId = divStatePath.getTopLevelStateId();
            boolean z = true;
            List<String> extractStates = extractStates(divStatePath.getPath$div_release(), findSharedPairs, true);
            if (!divStatePath.getContainsOnlyStates$div_release() && !divStatePath2.getContainsOnlyStates$div_release()) {
                z = false;
            }
            return new DivStatePath(topLevelStateId, findSharedPairs, extractStates, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DivStatePath parse(String str) throws PathFormatException {
            ArrayList arrayList = new ArrayList();
            List c0 = drm0.c0(str, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6);
            try {
                long parseLong = Long.parseLong((String) c0.get(0));
                int i = 2;
                if (c0.size() % 2 != 1) {
                    throw new PathFormatException(go9.b("Must be even number of states in path: ", str), null, i, 0 == true ? 1 : 0);
                }
                i9x p = swe0.p(2, swe0.q(1, c0.size()));
                int i2 = p.b;
                int i3 = p.c;
                int i4 = p.d;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    while (true) {
                        arrayList.add(new Pair(c0.get(i2), c0.get(i2 + 1)));
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                return new DivStatePath(parseLong, arrayList, c0, true);
            } catch (NumberFormatException e) {
                throw new PathFormatException(go9.b("Top level id must be number: ", str), e);
            }
        }

        private Companion() {
        }
    }

    public DivStatePath(long j, List<Pair<String, String>> list, List<String> list2, boolean z) {
        this.topLevelStateId = j;
        this.states = list;
        this.path = list2;
        this.containsOnlyStates = z;
        this.fullPath$delegate = new bpn0(new gzs<String>() { // from class: com.yandex.div.core.state.DivStatePath$fullPath$2
            {
                super(0);
            }

            @Override // xsna.gzs
            public final String invoke() {
                return j5g.g0(DivStatePath.this.getPath$div_release(), DomExceptionUtils.SEPARATOR, null, null, 0, null, 62);
            }
        });
        this.statesString$delegate = new bpn0(new gzs<String>() { // from class: com.yandex.div.core.state.DivStatePath$statesString$2
            {
                super(0);
            }

            @Override // xsna.gzs
            public final String invoke() {
                String divId;
                String stateId;
                if (DivStatePath.this.states.isEmpty()) {
                    return String.valueOf(DivStatePath.this.getTopLevelStateId());
                }
                StringBuilder sb = new StringBuilder();
                sb.append(DivStatePath.this.getTopLevelStateId());
                sb.append('/');
                List<Pair> list3 = DivStatePath.this.states;
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list3) {
                    divId = DivStatePathKt.getDivId(pair);
                    stateId = DivStatePathKt.getStateId(pair);
                    g5g.y(e43.l(divId, stateId), arrayList);
                }
                sb.append(j5g.g0(arrayList, DomExceptionUtils.SEPARATOR, null, null, 0, null, 62));
                return sb.toString();
            }
        });
    }

    private final List<String> createFullPath(String str) {
        ArrayList arrayList = new ArrayList(this.path.size() + 1);
        arrayList.addAll(this.path);
        arrayList.add(str);
        return arrayList;
    }

    public static final DivStatePath parse(String str) throws PathFormatException {
        return Companion.parse(str);
    }

    public final DivStatePath append$div_release(String str, ma.a aVar, String str2) {
        String str3;
        a aVar2;
        ikn b;
        String id;
        ArrayList arrayList = new ArrayList(this.states.size() + 1);
        arrayList.addAll(this.states);
        if (aVar == null || (str3 = aVar.d) == null) {
            str3 = str2;
        }
        q2z.a(str, str3, arrayList);
        if (aVar != null && (aVar2 = aVar.c) != null && (b = aVar2.b()) != null && (id = b.getId()) != null) {
            str2 = id;
        } else if (aVar != null) {
            str2 = aVar.d;
        }
        return new DivStatePath(this.topLevelStateId, arrayList, createFullPath(str2), false, 8, null);
    }

    public final DivStatePath appendDiv(String str) {
        return new DivStatePath(this.topLevelStateId, this.states, createFullPath(str), false, 8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivStatePath)) {
            return false;
        }
        DivStatePath divStatePath = (DivStatePath) obj;
        return this.topLevelStateId == divStatePath.topLevelStateId && epx.f(this.states, divStatePath.states) && epx.f(this.path, divStatePath.path) && this.containsOnlyStates == divStatePath.containsOnlyStates;
    }

    public final boolean getContainsOnlyStates$div_release() {
        return this.containsOnlyStates;
    }

    public final String getFullPath$div_release() {
        return (String) this.fullPath$delegate.getValue();
    }

    public final String getLastDivId$div_release() {
        return (String) j5g.i0(this.path);
    }

    public final String getLastStateId() {
        String stateId;
        if (this.states.isEmpty()) {
            return null;
        }
        stateId = DivStatePathKt.getStateId((Pair) j5g.i0(this.states));
        return stateId;
    }

    public final List<String> getPath$div_release() {
        return this.path;
    }

    public final String getPathToLastState() {
        String divId;
        if (this.states.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new DivStatePath(this.topLevelStateId, this.states.subList(0, r4.size() - 1), this.path, false, 8, null).getStatesString$div_release());
        sb.append('/');
        divId = DivStatePathKt.getDivId((Pair) j5g.i0(this.states));
        sb.append(divId);
        return sb.toString();
    }

    public final List<Pair<String, String>> getStates() {
        return this.states;
    }

    public final String getStatesString$div_release() {
        return (String) this.statesString$delegate.getValue();
    }

    public final long getTopLevelStateId() {
        return this.topLevelStateId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = fw3.a(fw3.a(Long.hashCode(this.topLevelStateId) * 31, 31, this.states), 31, this.path);
        boolean z = this.containsOnlyStates;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final boolean isAncestorOf(DivStatePath divStatePath) {
        String divId;
        String divId2;
        String stateId;
        String stateId2;
        if (this.topLevelStateId != divStatePath.topLevelStateId || this.states.size() >= divStatePath.states.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : this.states) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Pair pair = (Pair) obj;
            Pair<String, String> pair2 = divStatePath.states.get(i);
            divId = DivStatePathKt.getDivId(pair);
            divId2 = DivStatePathKt.getDivId(pair2);
            if (epx.f(divId, divId2)) {
                stateId = DivStatePathKt.getStateId(pair);
                stateId2 = DivStatePathKt.getStateId(pair2);
                if (epx.f(stateId, stateId2)) {
                    i = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isRootPath() {
        return this.states.isEmpty();
    }

    public final DivStatePath parentState() {
        int i;
        int i2;
        String divId;
        String divId2;
        if (isRootPath()) {
            return this;
        }
        ArrayList arrayList = new ArrayList(this.states);
        Pair pair = (Pair) arrayList.remove(e43.h(arrayList));
        List<String> list = this.path;
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (true) {
            i = -1;
            if (!listIterator.hasPrevious()) {
                i2 = -1;
                break;
            }
            String previous = listIterator.previous();
            divId2 = DivStatePathKt.getDivId(pair);
            if (epx.f(previous, divId2)) {
                i2 = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            List<String> list2 = this.path;
            ListIterator<String> listIterator2 = list2.listIterator(list2.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    break;
                }
                String previous2 = listIterator2.previous();
                String m0 = drm0.m0('#', previous2, previous2);
                divId = DivStatePathKt.getDivId(pair);
                if (m0.equals(divId)) {
                    i = listIterator2.nextIndex();
                    break;
                }
            }
        } else {
            i = valueOf.intValue();
        }
        return new DivStatePath(this.topLevelStateId, arrayList, this.path.subList(0, i + 1), false, 8, null);
    }

    public String toString() {
        return getFullPath$div_release();
    }

    public DivStatePath(long j, List list, List list2, boolean z, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? EmptyList.b : list, (i & 4) != 0 ? Collections.singletonList(String.valueOf(j)) : list2, (i & 8) != 0 ? false : z);
    }
}
