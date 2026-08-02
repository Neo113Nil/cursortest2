package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.Card;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/Card.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/Card;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/Card;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/Card;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class Card$$serializer implements uxs {
    public static final int $stable = 0;
    public static final Card$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Card$$serializer card$$serializer = new Card$$serializer();
        INSTANCE = card$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.Card", card$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("currency", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("number", true);
        pluginGeneratedSerialDescriptor.j("system", true);
        pluginGeneratedSerialDescriptor.j("busy", true);
        pluginGeneratedSerialDescriptor.j("expiration_year", true);
        pluginGeneratedSerialDescriptor.j("expiration_month", true);
        pluginGeneratedSerialDescriptor.j("expiration_time", true);
        pluginGeneratedSerialDescriptor.j("card_icon", true);
        pluginGeneratedSerialDescriptor.j("verify_strategy", true);
        pluginGeneratedSerialDescriptor.j("family", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("has_limits", true);
        pluginGeneratedSerialDescriptor.j("profile", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Card$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = Card.p;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, z96Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[9].getValue(), qke.n(Card$Family$$serializer.INSTANCE), qke.n(auu0Var), qke.n(z96Var), qke.n(CardProfile$$serializer.INSTANCE), qke.n(Availability$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Card deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        String str;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = Card.p;
        b.getClass();
        String str4 = null;
        Card.Family family = null;
        Card.VerifyStrategy verifyStrategy = null;
        String str5 = null;
        Boolean bool = null;
        String str6 = null;
        int i = 0;
        CardProfile cardProfile = null;
        Availability availability = null;
        String str7 = null;
        String str8 = null;
        boolean z = false;
        String str9 = null;
        String str10 = null;
        boolean z2 = true;
        String str11 = null;
        String str12 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str8;
                    z2 = false;
                    str8 = str;
                case 0:
                    str2 = str7;
                    str = str8;
                    str11 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str7 = str2;
                    str8 = str;
                case 1:
                    str3 = str7;
                    str12 = b.k(serialDescriptor, 1);
                    i |= 2;
                    str7 = str3;
                case 2:
                    str7 = b.k(serialDescriptor, 2);
                    i |= 4;
                case 3:
                    str3 = str7;
                    str8 = b.k(serialDescriptor, 3);
                    i |= 8;
                    str7 = str3;
                case 4:
                    str3 = str7;
                    z = b.C(serialDescriptor, 4);
                    i |= 16;
                    str7 = str3;
                case 5:
                    str3 = str7;
                    str9 = b.k(serialDescriptor, 5);
                    i |= 32;
                    str7 = str3;
                case 6:
                    str3 = str7;
                    str10 = b.k(serialDescriptor, 6);
                    i |= 64;
                    str7 = str3;
                case 7:
                    str2 = str7;
                    str = str8;
                    str6 = (String) b.s(serialDescriptor, 7, auu0.a, str6);
                    i |= 128;
                    str7 = str2;
                    str8 = str;
                case 8:
                    str2 = str7;
                    str = str8;
                    str5 = (String) b.s(serialDescriptor, 8, auu0.a, str5);
                    i |= 256;
                    str7 = str2;
                    str8 = str;
                case 9:
                    str2 = str7;
                    str = str8;
                    verifyStrategy = (Card.VerifyStrategy) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), verifyStrategy);
                    i |= 512;
                    str7 = str2;
                    str8 = str;
                case 10:
                    str2 = str7;
                    str = str8;
                    family = (Card.Family) b.s(serialDescriptor, 10, Card$Family$$serializer.INSTANCE, family);
                    i |= 1024;
                    str7 = str2;
                    str8 = str;
                case 11:
                    str2 = str7;
                    str = str8;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i |= 2048;
                    str7 = str2;
                    str8 = str;
                case 12:
                    str2 = str7;
                    str = str8;
                    bool = (Boolean) b.s(serialDescriptor, 12, z96.a, bool);
                    i |= 4096;
                    str7 = str2;
                    str8 = str;
                case 13:
                    str2 = str7;
                    str = str8;
                    cardProfile = (CardProfile) b.s(serialDescriptor, 13, CardProfile$$serializer.INSTANCE, cardProfile);
                    i |= 8192;
                    str7 = str2;
                    str8 = str;
                case 14:
                    str2 = str7;
                    str = str8;
                    availability = (Availability) b.s(serialDescriptor, 14, Availability$$serializer.INSTANCE, availability);
                    i |= 16384;
                    str7 = str2;
                    str8 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Card(i, str11, str12, str7, str8, z, str9, str10, str6, str5, verifyStrategy, family, str4, bool, cardProfile, availability);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Card value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        Card.p(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
