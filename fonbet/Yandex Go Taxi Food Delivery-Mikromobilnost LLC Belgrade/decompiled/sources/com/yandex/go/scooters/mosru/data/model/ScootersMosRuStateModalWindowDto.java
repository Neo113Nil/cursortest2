package com.yandex.go.scooters.mosru.data.model;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto;", "", "Companion", "ScootersMosRuStateActionItemDto", "$serializer", "com/yandex/go/scooters/mosru/data/model/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuStateModalWindowDto {
    public static final g Companion = new g();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final ScootersMosRuStateActionItemDto f;
    public final ScootersMosRuStateActionItemDto g;

    public /* synthetic */ ScootersMosRuStateModalWindowDto(int i, String str, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, String str2, ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto, ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
            this.d = formattedText3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = new ScootersMosRuStateActionItemDto(0);
        } else {
            this.f = scootersMosRuStateActionItemDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = scootersMosRuStateActionItemDto2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto;", "", "Companion", "ScootersMosRuStateActionItemActionDto", "$serializer", "com/yandex/go/scooters/mosru/data/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ScootersMosRuStateActionItemDto {
        public static final h Companion = new h();
        public final FormattedText a;
        public final FormattedText b;
        public final ScootersMosRuStateActionItemActionDto c;

        public /* synthetic */ ScootersMosRuStateActionItemDto(int i, FormattedText formattedText, FormattedText formattedText2, ScootersMosRuStateActionItemActionDto scootersMosRuStateActionItemActionDto) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = new ScootersMosRuStateActionItemActionDto(0);
            } else {
                this.c = scootersMosRuStateActionItemActionDto;
            }
        }

        public ScootersMosRuStateActionItemDto() {
            this(0);
        }

        public ScootersMosRuStateActionItemDto(int i) {
            FormattedText formattedText = FormattedText.c;
            ScootersMosRuStateActionItemActionDto scootersMosRuStateActionItemActionDto = new ScootersMosRuStateActionItemActionDto(0);
            this.a = formattedText;
            this.b = null;
            this.c = scootersMosRuStateActionItemActionDto;
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuStateModalWindowDto$ScootersMosRuStateActionItemDto$ScootersMosRuStateActionItemActionDto;", "", "Companion", "$serializer", "com/yandex/go/scooters/mosru/data/model/i", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class ScootersMosRuStateActionItemActionDto {
            public static final i Companion = new i();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ ScootersMosRuStateActionItemActionDto(int i, String str, String str2, String str3, String str4) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = str4;
                }
            }

            public ScootersMosRuStateActionItemActionDto(int i) {
                this.a = "";
                this.b = null;
                this.c = null;
                this.d = null;
            }

            public ScootersMosRuStateActionItemActionDto() {
                this(0);
            }
        }
    }

    public ScootersMosRuStateModalWindowDto() {
        FormattedText formattedText = FormattedText.c;
        ScootersMosRuStateActionItemDto scootersMosRuStateActionItemDto = new ScootersMosRuStateActionItemDto(0);
        this.a = null;
        this.b = formattedText;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = scootersMosRuStateActionItemDto;
        this.g = null;
    }
}
