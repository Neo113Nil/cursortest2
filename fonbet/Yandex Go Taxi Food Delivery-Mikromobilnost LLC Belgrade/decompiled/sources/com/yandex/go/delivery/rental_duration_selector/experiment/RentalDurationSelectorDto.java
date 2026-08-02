package com.yandex.go.delivery.rental_duration_selector.experiment;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/delivery/rental_duration_selector/experiment/RentalDurationSelectorDto;", "", "Companion", "$serializer", "com/yandex/go/delivery/rental_duration_selector/experiment/i", "rental_duration_selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RentalDurationSelectorDto {
    public static final i Companion = new i();
    public final HeaderDto a;
    public final CounterDto b;
    public final BulletListDto c;
    public final ButtonsDto d;

    public /* synthetic */ RentalDurationSelectorDto(int i, HeaderDto headerDto, CounterDto counterDto, BulletListDto bulletListDto, ButtonsDto buttonsDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = headerDto;
        }
        if ((i & 2) == 0) {
            this.b = new CounterDto(0);
        } else {
            this.b = counterDto;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bulletListDto;
        }
        if ((i & 8) == 0) {
            this.d = new ButtonsDto(0);
        } else {
            this.d = buttonsDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RentalDurationSelectorDto)) {
            return false;
        }
        RentalDurationSelectorDto rentalDurationSelectorDto = (RentalDurationSelectorDto) obj;
        return jl40.l(this.a, rentalDurationSelectorDto.a) && jl40.l(this.b, rentalDurationSelectorDto.b) && jl40.l(this.c, rentalDurationSelectorDto.c) && jl40.l(this.d, rentalDurationSelectorDto.d);
    }

    public final int hashCode() {
        HeaderDto headerDto = this.a;
        int b = unr0.b((headerDto == null ? 0 : headerDto.hashCode()) * 31, 31, this.b.a);
        BulletListDto bulletListDto = this.c;
        return this.d.hashCode() + ((b + (bulletListDto != null ? bulletListDto.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RentalDurationSelectorDto(header=" + this.a + ", counter=" + this.b + ", bulletList=" + this.c + ", buttons=" + this.d + Extension.C_BRAKE;
    }

    public RentalDurationSelectorDto() {
        this(0);
    }

    public RentalDurationSelectorDto(int i) {
        CounterDto counterDto = new CounterDto(0);
        ButtonsDto buttonsDto = new ButtonsDto(0);
        this.a = null;
        this.b = counterDto;
        this.c = null;
        this.d = buttonsDto;
    }
}
