package com.yandex.go.chargers.order.data.model;

import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import defpackage.gsq0;
import defpackage.w3a;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersMultiOrderHeaderDto;", "", "Companion", PlusPayUiKitInflaterFactory.NAME_BUTTON, "ChargersLabelDto", "$serializer", "com/yandex/go/chargers/order/data/model/m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersMultiOrderHeaderDto {
    public static final m0 Companion = new m0();
    public final FormattedText a;
    public final Button b;
    public final ChargersLabelDto c;

    public /* synthetic */ ChargersMultiOrderHeaderDto(int i, FormattedText formattedText, Button button, ChargersLabelDto chargersLabelDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = button;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chargersLabelDto;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersMultiOrderHeaderDto$ChargersLabelDto;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/l0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class ChargersLabelDto {
        public static final l0 Companion = new l0();
        public final FormattedText a;
        public final String b;

        public /* synthetic */ ChargersLabelDto(int i, String str, FormattedText formattedText) {
            this.a = (i & 1) == 0 ? null : formattedText;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final FormattedText getA() {
            return this.a;
        }

        public ChargersLabelDto() {
            this.a = null;
            this.b = "";
        }
    }

    public ChargersMultiOrderHeaderDto() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/order/data/model/ChargersMultiOrderHeaderDto$Button;", "", "Companion", "$serializer", "com/yandex/go/chargers/order/data/model/k0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class Button {
        public static final k0 Companion = new k0();
        public final FormattedText a;
        public final Boolean b;
        public final String c;
        public final w3a d;

        public /* synthetic */ Button(int i, FormattedText formattedText, Boolean bool, String str, w3a w3aVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = formattedText;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = w3aVar;
            }
        }

        /* renamed from: a, reason: from getter */
        public final w3a getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final FormattedText getA() {
            return this.a;
        }

        /* renamed from: d, reason: from getter */
        public final Boolean getB() {
            return this.b;
        }

        public Button() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }
}
