package com.yandex.pulse.mvi;

import com.yandex.pulse.mvi.utils.WeakHandler;
import defpackage.ms5;
import defpackage.pc20;
import defpackage.uyz0;
import defpackage.v941;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
class TotalScoreCalculator implements pc20 {
    public final HashMap A;
    public final WeakHandler B;
    public final double C;
    public boolean D;
    public final ms5 a;
    public final uyz0 b;
    public final HashMap c;
    private final v941 mHandlerCallback;
    public final HashSet w;
    public final HashSet x;
    public final HashSet y;
    public final HashSet z;

    public TotalScoreCalculator(ms5 ms5Var, uyz0 uyz0Var, Map map, Set set, long j) {
        v941 v941Var = new v941() { // from class: com.yandex.pulse.mvi.b
            @Override // defpackage.v941
            public final void a() {
                TotalScoreCalculator totalScoreCalculator = TotalScoreCalculator.this;
                totalScoreCalculator.z.clear();
                totalScoreCalculator.b();
            }
        };
        this.mHandlerCallback = v941Var;
        this.B = new WeakHandler(v941Var);
        this.a = ms5Var;
        this.C = 1.0d;
        this.b = uyz0Var;
        this.c = new HashMap(map.size());
        this.w = new HashSet(map.size());
        this.x = new HashSet(set.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Double d = (Double) entry.getValue();
            if (d.doubleValue() > 0.0d) {
                this.c.put(str, d);
                this.w.add(str);
                if (set.contains(str)) {
                    this.x.add(str);
                }
            }
        }
        this.w.removeAll(set);
        this.A = new HashMap(this.c.size());
        this.y = new HashSet(this.w);
        this.z = new HashSet(this.x);
        this.B.sendEmptyMessageDelayed(0, j);
    }

    @Override // defpackage.pc20
    public final void a(double d, String str) {
        if (this.D || !this.c.containsKey(str) || d < 0.0d) {
            return;
        }
        this.A.put(str, Double.valueOf(d));
        this.y.remove(str);
        this.z.remove(str);
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b() {
        char c;
        char c2;
        if (!this.D && this.y.size() <= 0) {
            boolean isEmpty = this.z.isEmpty();
            HashMap hashMap = this.c;
            HashMap hashMap2 = this.A;
            if (isEmpty || hashMap2.size() >= hashMap.size()) {
                double d = 0.0d;
                double d2 = 0.0d;
                for (Map.Entry entry : hashMap2.entrySet()) {
                    double doubleValue = ((Double) hashMap.get(entry.getKey())).doubleValue();
                    if (doubleValue > 0.0d) {
                        d += ((Double) entry.getValue()).doubleValue() * doubleValue;
                        d2 += doubleValue;
                    }
                }
                ms5 ms5Var = this.a;
                uyz0 uyz0Var = this.b;
                if (d2 <= 0.0d) {
                    Map map = Collections.EMPTY_MAP;
                    uyz0Var.g(-1.0d, map);
                    String str = ms5Var.b;
                    switch (str.hashCode()) {
                        case 103501:
                            if (str.equals("hot")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3059428:
                            if (str.equals("cold")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3641989:
                            if (str.equals("warm")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            uyz0Var.j(-1.0d, map);
                            break;
                        case 1:
                            uyz0Var.l(-1.0d, map);
                            break;
                        case 2:
                            uyz0Var.h(-1.0d, map);
                            break;
                    }
                } else {
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
                    double d3 = d / d2;
                    String str2 = ms5Var.b;
                    switch (str2.hashCode()) {
                        case 103501:
                            if (str2.equals("hot")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3059428:
                            if (str2.equals("cold")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3641989:
                            if (str2.equals("warm")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            uyz0Var.j(d3, unmodifiableMap);
                            break;
                        case 1:
                            uyz0Var.l(d3, unmodifiableMap);
                            uyz0Var.g(d3, unmodifiableMap);
                            break;
                        case 2:
                            uyz0Var.h(d3, unmodifiableMap);
                            double d4 = this.C;
                            if (d4 > 0.0d) {
                                uyz0Var.g(Math.min(Math.max(0.0d, (d3 * d4) + 0.0d), 100.0d), unmodifiableMap);
                                break;
                            }
                            break;
                    }
                }
                this.D = true;
                this.B.removeMessages(0);
            }
        }
    }

    @Override // defpackage.pc20
    public final void p() {
        this.z.clear();
        b();
    }

    @Override // defpackage.pc20
    public final void reset() {
        this.A.clear();
        HashSet hashSet = this.y;
        hashSet.clear();
        hashSet.addAll(this.w);
        HashSet hashSet2 = this.z;
        hashSet2.clear();
        hashSet2.addAll(this.x);
        this.D = false;
    }
}
