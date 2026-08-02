package com.yandex.go.scooters.data.model;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersOnboardingExperiment;", "Ln96;", "Lc6z;", "Companion", "Promotions", "com/yandex/go/scooters/data/model/w", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersOnboardingExperiment extends n96 implements c6z {
    public static final w Companion = new w();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(0)), null, null, null, null};
    public static final ScootersOnboardingExperiment i = new ScootersOnboardingExperiment(0);
    public final boolean b;
    public final Map c;
    public final ScootersOnboardingAgreement d;
    public final String e;
    public final Promotions f;
    public final Boolean g;

    public /* synthetic */ ScootersOnboardingExperiment(int i2, boolean z, Map map, ScootersOnboardingAgreement scootersOnboardingAgreement, String str, Promotions promotions, Boolean bool) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = null;
        } else {
            this.d = scootersOnboardingAgreement;
        }
        if ((i2 & 8) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i2 & 16) == 0) {
            this.f = null;
        } else {
            this.f = promotions;
        }
        if ((i2 & 32) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersOnboardingExperiment$Promotions;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/x", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes13.dex */
    public static final class Promotions {
        public static final x Companion = new x();
        public final String a;
        public final String b;

        public /* synthetic */ Promotions(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public Promotions() {
            this.a = null;
            this.b = null;
        }
    }

    public ScootersOnboardingExperiment() {
        this(0);
    }

    public ScootersOnboardingExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
