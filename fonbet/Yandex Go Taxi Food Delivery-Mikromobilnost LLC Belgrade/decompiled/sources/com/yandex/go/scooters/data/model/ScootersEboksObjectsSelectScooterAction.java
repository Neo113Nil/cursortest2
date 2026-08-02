package com.yandex.go.scooters.data.model;

import defpackage.gin;
import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersEboksObjectsSelectScooterAction;", "Lgin;", "Companion", "$serializer", "com/yandex/go/scooters/data/model/s", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersEboksObjectsSelectScooterAction implements gin {
    public static final s Companion = new s();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ ScootersEboksObjectsSelectScooterAction(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ScootersEboksObjectsSelectScooterAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = "find_and_select_scooter";
        } else {
            this.d = str4;
        }
    }

    public ScootersEboksObjectsSelectScooterAction(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = "find_and_select_scooter";
    }
}
