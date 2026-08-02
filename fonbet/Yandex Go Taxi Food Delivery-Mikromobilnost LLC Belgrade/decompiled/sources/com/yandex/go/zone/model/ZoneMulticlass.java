package com.yandex.go.zone.model;

import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.zone.dto.response.Selector;
import com.yandex.go.zone.dto.response.ZoneMulticlassDetails;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/zone/model/ZoneMulticlass;", "", "Companion", "$serializer", "com/yandex/go/zone/model/i", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ZoneMulticlass {
    public static final i Companion = new i();
    public final String a;
    public final boolean b;
    public final ZoneMulticlassDetails c;
    public final String d;
    public final SelectionRules e;
    public final Selector f;
    public final Boolean g;

    public /* synthetic */ ZoneMulticlass(int i, String str, boolean z, ZoneMulticlassDetails zoneMulticlassDetails, String str2, SelectionRules selectionRules, Selector selector, Boolean bool) {
        this.a = (i & 1) == 0 ? "multiclass" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = new ZoneMulticlassDetails(0);
        } else {
            this.c = zoneMulticlassDetails;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = new SelectionRules(0);
        } else {
            this.e = selectionRules;
        }
        if ((i & 32) == 0) {
            this.f = new Selector(0);
        } else {
            this.f = selector;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
    }

    public ZoneMulticlass() {
        ZoneMulticlassDetails zoneMulticlassDetails = new ZoneMulticlassDetails(0);
        SelectionRules selectionRules = new SelectionRules(0);
        Selector selector = new Selector(0);
        this.a = "multiclass";
        this.b = false;
        this.c = zoneMulticlassDetails;
        this.d = "";
        this.e = selectionRules;
        this.f = selector;
        this.g = null;
    }
}
