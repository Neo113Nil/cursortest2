package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.data.model.ChargersStationDto;
import defpackage.ak9;
import defpackage.gsq0;
import defpackage.i3y;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountStationsResponseDto;", "", "Companion", "ChargersDiscountStationItem", "$serializer", "com/yandex/go/chargers/discounts/data/models/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersDiscountStationsResponseDto {
    public static final e Companion = new e();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ak9(24))};
    public final FormattedText a;
    public final List b;

    public /* synthetic */ ChargersDiscountStationsResponseDto(int i, FormattedText formattedText, List list) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public ChargersDiscountStationsResponseDto() {
        this.a = FormattedText.c;
        this.b = EmptyList.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountStationsResponseDto$ChargersDiscountStationItem;", "", "Companion", "$serializer", "com/yandex/go/chargers/discounts/data/models/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersDiscountStationItem {
        public static final d Companion = new d();
        public final ChargersStationDto a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;

        public /* synthetic */ ChargersDiscountStationItem(int i, ChargersStationDto chargersStationDto, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            this.a = (i & 1) == 0 ? null : chargersStationDto;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = FormattedText.c;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = FormattedText.c;
            } else {
                this.d = formattedText3;
            }
        }

        public ChargersDiscountStationItem() {
            FormattedText formattedText = FormattedText.c;
            this.a = null;
            this.b = formattedText;
            this.c = formattedText;
            this.d = formattedText;
        }
    }
}
