package com.yandex.go.scooters.zones.data.model;

import defpackage.gsq0;
import defpackage.h5o0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend;", "", "Companion", "PolygonLegendInfoItem", "$serializer", "com/yandex/go/scooters/zones/data/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPolygonLegend {
    public static final e Companion = new e();
    public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new h5o0(14)), null};
    public final FormattedText a;
    public final FormattedText b;
    public final List c;
    public final FormattedText d;

    public /* synthetic */ ScootersPolygonLegend(int i, List list, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend$PolygonLegendInfoItem;", "", "Companion", "IconStyle", "$serializer", "com/yandex/go/scooters/zones/data/model/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PolygonLegendInfoItem {
        public static final f Companion = new f();
        public final IconStyle a;
        public final FormattedText b;

        public /* synthetic */ PolygonLegendInfoItem(int i, IconStyle iconStyle, FormattedText formattedText) {
            if (1 != (i & 1)) {
                qje.Z(i, 1, ScootersPolygonLegend$PolygonLegendInfoItem$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = iconStyle;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle;", "", "Companion", "FillParams", "$serializer", "com/yandex/go/scooters/zones/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class IconStyle {
            public static final g Companion = new g();
            public final String a;
            public final String b;
            public final Integer c;
            public final Float d;
            public final FillParams e;

            public /* synthetic */ IconStyle(int i, String str, String str2, Integer num, Float f, FillParams fillParams) {
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
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = num;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = f;
                }
                if ((i & 16) == 0) {
                    this.e = new FillParams(0);
                } else {
                    this.e = fillParams;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/zones/data/model/ScootersPolygonLegend$PolygonLegendInfoItem$IconStyle$FillParams;", "", "Companion", "$serializer", "com/yandex/go/scooters/zones/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
            @gsq0
            public static final class FillParams {
                public static final h Companion = new h();
                public final String a;
                public final Integer b;

                public /* synthetic */ FillParams(int i, Integer num, String str) {
                    this.a = (i & 1) == 0 ? "" : str;
                    if ((i & 2) == 0) {
                        this.b = null;
                    } else {
                        this.b = num;
                    }
                }

                public FillParams(int i) {
                    this.a = "";
                    this.b = null;
                }

                public FillParams() {
                    this(0);
                }
            }

            public IconStyle() {
                FillParams fillParams = new FillParams(0);
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = fillParams;
            }
        }
    }

    public ScootersPolygonLegend() {
        this(0);
    }

    public ScootersPolygonLegend(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = null;
        this.c = null;
        this.d = formattedText;
    }
}
