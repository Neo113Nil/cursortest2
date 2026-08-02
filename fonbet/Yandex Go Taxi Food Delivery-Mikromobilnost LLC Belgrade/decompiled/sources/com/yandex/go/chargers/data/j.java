package com.yandex.go.chargers.data;

import defpackage.bvf0;
import defpackage.h2a;
import defpackage.l8x;
import defpackage.tje;
import defpackage.tse;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class j {
    public final tse a;
    public final r0 b = bvf0.c(kotlin.collections.b.f());
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public j(tse tseVar) {
        this.a = tseVar;
    }

    public final void a(String str) {
        r0 r0Var;
        Object value;
        Map map;
        h2a h2aVar;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            map = (Map) value;
            h2aVar = (h2a) map.get(str);
            if (h2aVar == null) {
                h2aVar = new h2a(0);
            }
        } while (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(str, h2a.a(h2aVar, true, null, 2)))));
    }

    public final void b(String str) {
        r0 r0Var;
        Object value;
        l8x l8xVar = (l8x) this.c.remove(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, kotlin.collections.b.j(str, (Map) value)));
    }

    public final void c(String str) {
        r0 r0Var;
        Object value;
        Map map;
        h2a h2aVar;
        l8x l8xVar = (l8x) this.c.remove(str);
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        do {
            r0Var = this.b;
            value = r0Var.getValue();
            map = (Map) value;
            h2aVar = (h2a) map.get(str);
            int i = 0;
            if (h2aVar == null) {
                h2aVar = new h2a(i);
            }
        } while (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(str, h2a.a(h2aVar, false, 0L, 1)))));
    }

    public final void d(int i, String str) {
        Object value;
        Map map;
        h2a h2aVar;
        if (i > 0) {
            r0 r0Var = this.b;
            h2a h2aVar2 = (h2a) ((Map) r0Var.getValue()).get(str);
            if (h2aVar2 != null ? h2aVar2.a : true) {
                do {
                    value = r0Var.getValue();
                    map = (Map) value;
                    h2aVar = (h2a) map.get(str);
                    int i2 = 0;
                    if (h2aVar == null) {
                        h2aVar = new h2a(i2);
                    }
                } while (!r0Var.k(value, kotlin.collections.b.o(map, new Pair(str, h2a.a(h2aVar, false, null, 2)))));
                ConcurrentHashMap concurrentHashMap = this.c;
                l8x l8xVar = (l8x) concurrentHashMap.remove(str);
                if (l8xVar != null) {
                    l8xVar.a(null);
                }
                concurrentHashMap.put(str, tje.N(this.a, null, null, new ChargersFreeCheckTimerStateRepository$startIfNeeded$1(i, this, str, null), 3));
            }
        }
    }
}
