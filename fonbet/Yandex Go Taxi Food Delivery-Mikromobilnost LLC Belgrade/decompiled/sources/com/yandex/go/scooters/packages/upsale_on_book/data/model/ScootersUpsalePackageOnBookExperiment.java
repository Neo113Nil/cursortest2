package com.yandex.go.scooters.packages.upsale_on_book.data.model;

import defpackage.czo0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/packages/upsale_on_book/data/model/ScootersUpsalePackageOnBookExperiment;", "Lw96;", "Companion", "com/yandex/go/scooters/packages/upsale_on_book/data/model/a", "$serializer", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScootersUpsalePackageOnBookExperiment extends w96 {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new czo0(7))};
    public static final ScootersUpsalePackageOnBookExperiment f = new ScootersUpsalePackageOnBookExperiment(0);
    public final boolean b;
    public final String c;
    public final List d;

    public /* synthetic */ ScootersUpsalePackageOnBookExperiment(String str, List list, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public ScootersUpsalePackageOnBookExperiment(int i) {
        this.b = false;
        this.c = "";
        this.d = EmptyList.a;
    }

    public ScootersUpsalePackageOnBookExperiment() {
        this(0);
    }
}
