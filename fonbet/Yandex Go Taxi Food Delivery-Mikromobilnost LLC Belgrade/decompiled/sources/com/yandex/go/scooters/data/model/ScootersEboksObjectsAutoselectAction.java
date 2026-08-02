package com.yandex.go.scooters.data.model;

import defpackage.gin;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/data/model/ScootersEboksObjectsAutoselectAction;", "Lgin;", "Companion", "$serializer", "com/yandex/go/scooters/data/model/r", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersEboksObjectsAutoselectAction implements gin {
    public static final r Companion = new r();
    public final String a;

    public /* synthetic */ ScootersEboksObjectsAutoselectAction(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "autoselect";
        } else {
            this.a = str;
        }
    }

    public ScootersEboksObjectsAutoselectAction(int i) {
        this.a = "autoselect";
    }

    public ScootersEboksObjectsAutoselectAction() {
        this(0);
    }
}
