package com.yandex.go.morphlex.network;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam;", "", "Companion", "Point", "$serializer", "com/yandex/go/morphlex/network/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MorphlexScenarioContextParam {
    public static final a Companion = new a();
    public final Point a;
    public final Point b;
    public final Point c;
    public final Boolean d;
    public final String e;
    public final String f;

    public /* synthetic */ MorphlexScenarioContextParam(int i, Point point, Point point2, Point point3, Boolean bool, String str, String str2) {
        if (63 != (i & 63)) {
            qje.Z(i, 63, MorphlexScenarioContextParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = point;
        this.b = point2;
        this.c = point3;
        this.d = bool;
        this.e = str;
        this.f = str2;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/morphlex/network/MorphlexScenarioContextParam$Point;", "", "Companion", "$serializer", "com/yandex/go/morphlex/network/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Point {
        public static final b Companion = new b();
        public final double a;
        public final double b;

        public /* synthetic */ Point(double d, double d2, int i) {
            if (3 != (i & 3)) {
                qje.Z(i, 3, MorphlexScenarioContextParam$Point$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = d;
            this.b = d2;
        }

        public Point(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    public MorphlexScenarioContextParam(Point point, Point point2, Point point3, Boolean bool, String str) {
        this.a = point;
        this.b = point2;
        this.c = point3;
        this.d = bool;
        this.e = null;
        this.f = str;
    }
}
