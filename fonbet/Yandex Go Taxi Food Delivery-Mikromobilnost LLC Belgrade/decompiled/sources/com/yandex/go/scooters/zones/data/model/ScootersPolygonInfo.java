package com.yandex.go.scooters.zones.data.model;

import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonInfo;", "", "Companion", "PolygonInfoItem", "PolygonInfoLegendItem", "$serializer", "com/yandex/go/scooters/zones/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPolygonInfo {
    public static final a Companion = new a();
    public static final i3y[] g = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(13)), null, null};
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final List d;
    public final PolygonInfoLegendItem e;
    public final FormattedText f;

    public /* synthetic */ ScootersPolygonInfo(int i, String str, FormattedText formattedText, FormattedText formattedText2, List list, PolygonInfoLegendItem polygonInfoLegendItem, FormattedText formattedText3) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = polygonInfoLegendItem;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonInfo$PolygonInfoItem;", "", "Companion", "$serializer", "com/yandex/go/scooters/zones/data/model/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PolygonInfoItem {
        public static final b Companion = new b();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ PolygonInfoItem(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
        }

        public PolygonInfoItem() {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonInfo$PolygonInfoLegendItem;", "", "Companion", "$serializer", "com/yandex/go/scooters/zones/data/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PolygonInfoLegendItem {
        public static final c Companion = new c();
        public final FormattedText a;
        public final FormattedText b;

        public /* synthetic */ PolygonInfoLegendItem(int i, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
        }

        public PolygonInfoLegendItem() {
            this.a = FormattedText.c;
            this.b = null;
        }
    }

    public ScootersPolygonInfo() {
        this(0);
    }

    public ScootersPolygonInfo(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = formattedText;
    }
}
