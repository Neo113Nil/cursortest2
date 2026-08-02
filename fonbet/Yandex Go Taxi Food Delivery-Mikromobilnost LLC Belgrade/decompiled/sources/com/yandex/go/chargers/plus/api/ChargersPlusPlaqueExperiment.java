package com.yandex.go.chargers.plus.api;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import defpackage.y99;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/plus/api/ChargersPlusPlaqueExperiment;", "Lw96;", "Lc6z;", "Companion", "CompositePaymentNotification", "com/yandex/go/chargers/plus/api/a", "$serializer", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersPlusPlaqueExperiment extends w96 implements c6z {
    public static final a Companion = new a();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new y99(8)), null};
    public static final ChargersPlusPlaqueExperiment f = new ChargersPlusPlaqueExperiment(0);
    public final boolean b;
    public final Map c;
    public final CompositePaymentNotification d;

    public /* synthetic */ ChargersPlusPlaqueExperiment(int i, boolean z, Map map, CompositePaymentNotification compositePaymentNotification) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = compositePaymentNotification;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/plus/api/ChargersPlusPlaqueExperiment$CompositePaymentNotification;", "", "Companion", "$serializer", "com/yandex/go/chargers/plus/api/b", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class CompositePaymentNotification {
        public static final b Companion = new b();
        public final String a;
        public final String b;

        public /* synthetic */ CompositePaymentNotification(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public CompositePaymentNotification() {
            this.a = "";
            this.b = null;
        }
    }

    public ChargersPlusPlaqueExperiment() {
        this(0);
    }

    public ChargersPlusPlaqueExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = null;
    }
}
