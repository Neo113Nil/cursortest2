package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.on00;

/* loaded from: classes8.dex */
public final class F3 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J3 fromModel(E3 e3) {
        J3 j3 = new J3();
        j3.a = a(e3.a);
        int size = e3.b.size();
        G3[] g3Arr = new G3[size];
        for (int i = 0; i < size; i++) {
            g3Arr[i] = a((D3) e3.b.get(i));
        }
        j3.b = g3Arr;
        return j3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E3 toModel(J3 j3) {
        G3 g3 = j3.a;
        if (g3 == null) {
            g3 = new G3();
        }
        D3 a = a(g3);
        G3[] g3Arr = j3.b;
        ArrayList arrayList = new ArrayList(g3Arr.length);
        for (G3 g32 : g3Arr) {
            arrayList.add(a(g32));
        }
        return new E3(a, arrayList);
    }

    public static G3 a(D3 d3) {
        I3 i3;
        G3 g3 = new G3();
        Map map = d3.a;
        int i = 0;
        if (map != null) {
            i3 = new I3();
            int size = map.size();
            H3[] h3Arr = new H3[size];
            for (int i2 = 0; i2 < size; i2++) {
                h3Arr[i2] = new H3();
            }
            i3.a = h3Arr;
            int i4 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                H3 h3 = i3.a[i4];
                h3.a = str;
                h3.b = str2;
                i4++;
            }
        } else {
            i3 = null;
        }
        g3.a = i3;
        int ordinal = d3.b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                i = 1;
            }
        }
        g3.b = i;
        return g3;
    }

    public static D3 a(G3 g3) {
        LinkedHashMap linkedHashMap;
        EnumC4801e8 enumC4801e8;
        I3 i3 = g3.a;
        if (i3 != null) {
            H3[] h3Arr = i3.a;
            int e = on00.e(h3Arr.length);
            if (e < 16) {
                e = 16;
            }
            linkedHashMap = new LinkedHashMap(e);
            for (H3 h3 : h3Arr) {
                Pair pair = new Pair(h3.a, h3.b);
                linkedHashMap.put(pair.i(), pair.j());
            }
        } else {
            linkedHashMap = null;
        }
        int i = g3.b;
        if (i == 0) {
            enumC4801e8 = EnumC4801e8.b;
        } else if (i == 1) {
            enumC4801e8 = EnumC4801e8.c;
        } else if (i == 2) {
            enumC4801e8 = EnumC4801e8.d;
        } else if (i != 3) {
            enumC4801e8 = EnumC4801e8.b;
        } else {
            enumC4801e8 = EnumC4801e8.e;
        }
        return new D3(linkedHashMap, enumC4801e8);
    }
}
