package com.yandex.go.scooters.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.s3n0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersOnboardingAgreement;", "", "Companion", "$serializer", "com/yandex/go/scooters/data/model/v", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersOnboardingAgreement {
    public static final v Companion = new v();
    public static final i3y[] i;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final CompleteRules e;
    public final List f;
    public final List g;
    public final RootAcceptItem h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new s3n0(27)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new s3n0(28)), kotlin.a.b(lazyThreadSafetyMode, new s3n0(29)), null};
    }

    public /* synthetic */ ScootersOnboardingAgreement(int i2, String str, List list, String str2, String str3, CompleteRules completeRules, List list2, List list3, RootAcceptItem rootAcceptItem) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = completeRules;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = rootAcceptItem;
        }
    }

    public ScootersOnboardingAgreement() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }
}
