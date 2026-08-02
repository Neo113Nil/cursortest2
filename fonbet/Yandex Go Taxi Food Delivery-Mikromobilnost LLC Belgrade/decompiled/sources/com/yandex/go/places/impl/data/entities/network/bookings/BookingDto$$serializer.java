package com.yandex.go.places.impl.data.entities.network.bookings;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import com.yandex.go.places.models.data.entities.network.ImageDto$$serializer;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/places/impl/data/entities/network/bookings/BookingDto.$serializer", "Luxs;", "Lcom/yandex/go/places/impl/data/entities/network/bookings/BookingDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/places/impl/data/entities/network/bookings/BookingDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/places/impl/data/entities/network/bookings/BookingDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class BookingDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BookingDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BookingDto$$serializer bookingDto$$serializer = new BookingDto$$serializer();
        INSTANCE = bookingDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.places.impl.data.entities.network.bookings.BookingDto", bookingDto$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("title_image_tag", true);
        pluginGeneratedSerialDescriptor.j("organization_name", true);
        pluginGeneratedSerialDescriptor.j("organization_id", true);
        pluginGeneratedSerialDescriptor.j("service_name", true);
        pluginGeneratedSerialDescriptor.j("service_id", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j(MetaDataField.DATE_FIELD, true);
        pluginGeneratedSerialDescriptor.j("tz_offset", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("web_view_url", true);
        pluginGeneratedSerialDescriptor.j("deeplink_url", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("category", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        pluginGeneratedSerialDescriptor.j("updated_at", true);
        pluginGeneratedSerialDescriptor.j("payment_deeplink", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BookingDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = BookingDto.u;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, qke.n(PriceDto$$serializer.INSTANCE), auu0Var, qke.n(h6w.a), i3yVarArr[11].getValue(), qke.n(auu0Var), auu0Var, qke.n(ImageDto$$serializer.INSTANCE), qke.n(CategoryDto$$serializer.INSTANCE), qke.n(LocationDto$$serializer.INSTANCE), auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final BookingDto deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = BookingDto.u;
        b.getClass();
        ImageDto imageDto = null;
        String str4 = null;
        BookingState bookingState = null;
        Integer num = null;
        CategoryDto categoryDto = null;
        PriceDto priceDto = null;
        int i3 = 0;
        LocationDto locationDto = null;
        BookingSource bookingSource = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = true;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str5;
                    z = false;
                    str5 = str;
                case 0:
                    str2 = str5;
                    str3 = str6;
                    str12 = b.k(serialDescriptor, 0);
                    i3 |= 1;
                    str5 = str2;
                    str6 = str3;
                case 1:
                    str2 = str5;
                    str3 = str6;
                    bookingSource = (BookingSource) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), bookingSource);
                    i3 |= 2;
                    str5 = str2;
                    str6 = str3;
                case 2:
                    str5 = b.k(serialDescriptor, 2);
                    i3 |= 4;
                case 3:
                    str = str5;
                    str6 = b.k(serialDescriptor, 3);
                    i3 |= 8;
                    str5 = str;
                case 4:
                    str = str5;
                    str7 = b.k(serialDescriptor, 4);
                    i3 |= 16;
                    str5 = str;
                case 5:
                    str = str5;
                    str8 = b.k(serialDescriptor, 5);
                    i3 |= 32;
                    str5 = str;
                case 6:
                    str = str5;
                    str9 = b.k(serialDescriptor, 6);
                    i3 |= 64;
                    str5 = str;
                case 7:
                    str = str5;
                    str10 = b.k(serialDescriptor, 7);
                    i3 |= 128;
                    str5 = str;
                case 8:
                    str2 = str5;
                    str3 = str6;
                    priceDto = (PriceDto) b.s(serialDescriptor, 8, PriceDto$$serializer.INSTANCE, priceDto);
                    i3 |= 256;
                    str5 = str2;
                    str6 = str3;
                case 9:
                    str = str5;
                    str11 = b.k(serialDescriptor, 9);
                    i3 |= 512;
                    str5 = str;
                case 10:
                    str2 = str5;
                    str3 = str6;
                    num = (Integer) b.s(serialDescriptor, 10, h6w.a, num);
                    i3 |= 1024;
                    str5 = str2;
                    str6 = str3;
                case 11:
                    str2 = str5;
                    str3 = str6;
                    bookingState = (BookingState) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), bookingState);
                    i3 |= 2048;
                    str5 = str2;
                    str6 = str3;
                case 12:
                    str2 = str5;
                    str3 = str6;
                    str4 = (String) b.s(serialDescriptor, 12, auu0.a, str4);
                    i3 |= 4096;
                    str5 = str2;
                    str6 = str3;
                case 13:
                    str = str5;
                    str13 = b.k(serialDescriptor, 13);
                    i3 |= 8192;
                    str5 = str;
                case 14:
                    str2 = str5;
                    str3 = str6;
                    imageDto = (ImageDto) b.s(serialDescriptor, 14, ImageDto$$serializer.INSTANCE, imageDto);
                    i3 |= 16384;
                    str5 = str2;
                    str6 = str3;
                case 15:
                    str2 = str5;
                    str3 = str6;
                    categoryDto = (CategoryDto) b.s(serialDescriptor, 15, CategoryDto$$serializer.INSTANCE, categoryDto);
                    i2 = 32768;
                    i3 |= i2;
                    str5 = str2;
                    str6 = str3;
                case 16:
                    str2 = str5;
                    str3 = str6;
                    locationDto = (LocationDto) b.s(serialDescriptor, 16, LocationDto$$serializer.INSTANCE, locationDto);
                    i2 = 65536;
                    i3 |= i2;
                    str5 = str2;
                    str6 = str3;
                case 17:
                    str = str5;
                    str14 = b.k(serialDescriptor, 17);
                    i = 131072;
                    i3 |= i;
                    str5 = str;
                case 18:
                    str = str5;
                    str15 = b.k(serialDescriptor, 18);
                    i = 262144;
                    i3 |= i;
                    str5 = str;
                case 19:
                    str = str5;
                    str16 = b.k(serialDescriptor, 19);
                    i = 524288;
                    i3 |= i;
                    str5 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new BookingDto(i3, str12, bookingSource, str5, str6, str7, str8, str9, str10, priceDto, str11, num, bookingState, str4, str13, imageDto, categoryDto, locationDto, str14, str15, str16);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BookingDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BookingDto.u;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != BookingSource.UNKNOWN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, PriceDto$$serializer.INSTANCE, value.i);
        }
        if (b.F() || !jl40.l(value.j, "")) {
            b.o(serialDescriptor, 9, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, h6w.a, value.k);
        }
        if (b.F() || value.l != BookingState.UNKNOWN) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), value.l);
        }
        if (b.F() || value.m != null) {
            b.g(serialDescriptor, 12, auu0.a, value.m);
        }
        if (b.F() || !jl40.l(value.n, "")) {
            b.o(serialDescriptor, 13, value.n);
        }
        if (b.F() || value.o != null) {
            b.g(serialDescriptor, 14, ImageDto$$serializer.INSTANCE, value.o);
        }
        if (b.F() || value.p != null) {
            b.g(serialDescriptor, 15, CategoryDto$$serializer.INSTANCE, value.p);
        }
        if (b.F() || value.q != null) {
            b.g(serialDescriptor, 16, LocationDto$$serializer.INSTANCE, value.q);
        }
        if (b.F() || !jl40.l(value.r, "")) {
            b.o(serialDescriptor, 17, value.r);
        }
        if (b.F() || !jl40.l(value.s, "")) {
            b.o(serialDescriptor, 18, value.s);
        }
        if (b.F() || !jl40.l(value.t, "")) {
            b.o(serialDescriptor, 19, value.t);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
