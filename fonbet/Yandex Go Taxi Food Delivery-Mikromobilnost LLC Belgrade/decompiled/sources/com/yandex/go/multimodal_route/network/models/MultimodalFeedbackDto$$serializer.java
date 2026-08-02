package com.yandex.go.multimodal_route.network.models;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/multimodal_route/network/models/MultimodalFeedbackDto.$serializer", "Luxs;", "Lcom/yandex/go/multimodal_route/network/models/MultimodalFeedbackDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/multimodal_route/network/models/MultimodalFeedbackDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/multimodal_route/network/models/MultimodalFeedbackDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MultimodalFeedbackDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MultimodalFeedbackDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MultimodalFeedbackDto$$serializer multimodalFeedbackDto$$serializer = new MultimodalFeedbackDto$$serializer();
        INSTANCE = multimodalFeedbackDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.multimodal_route.network.models.MultimodalFeedbackDto", multimodalFeedbackDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("rating_selector", true);
        pluginGeneratedSerialDescriptor.j("comment_field", true);
        pluginGeneratedSerialDescriptor.j("done_button", true);
        pluginGeneratedSerialDescriptor.j("route_uris", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MultimodalFeedbackDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MultimodalFeedbackDto.h;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, RatingSelectorDto$$serializer.INSTANCE, CommentFieldDto$$serializer.INSTANCE, DoneButtonDto$$serializer.INSTANCE, i3yVarArr[5].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final MultimodalFeedbackDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MultimodalFeedbackDto.h;
        b.getClass();
        MultimodalFeedbackDto multimodalFeedbackDto = null;
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        RatingSelectorDto ratingSelectorDto = null;
        CommentFieldDto commentFieldDto = null;
        DoneButtonDto doneButtonDto = null;
        List list = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    ratingSelectorDto = (RatingSelectorDto) b.A(serialDescriptor, 2, RatingSelectorDto$$serializer.INSTANCE, ratingSelectorDto);
                    i |= 4;
                    break;
                case 3:
                    commentFieldDto = (CommentFieldDto) b.A(serialDescriptor, 3, CommentFieldDto$$serializer.INSTANCE, commentFieldDto);
                    i |= 8;
                    break;
                case 4:
                    doneButtonDto = (DoneButtonDto) b.A(serialDescriptor, 4, DoneButtonDto$$serializer.INSTANCE, doneButtonDto);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    str = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    ny61.c(v);
                    return multimodalFeedbackDto;
            }
            multimodalFeedbackDto = null;
        }
        b.c(serialDescriptor);
        return new MultimodalFeedbackDto(i, formattedText, formattedText2, ratingSelectorDto, commentFieldDto, doneButtonDto, list, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.multimodal_route.network.models.RatingSelectorDto.e) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.multimodal_route.network.models.CommentFieldDto.g) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.multimodal_route.network.models.DoneButtonDto.d) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, MultimodalFeedbackDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MultimodalFeedbackDto.h;
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (!b.F()) {
            RatingSelectorDto ratingSelectorDto = value.c;
            RatingSelectorDto.Companion.getClass();
        }
        b.e(serialDescriptor, 2, RatingSelectorDto$$serializer.INSTANCE, value.c);
        if (!b.F()) {
            CommentFieldDto commentFieldDto = value.d;
            CommentFieldDto.Companion.getClass();
        }
        b.e(serialDescriptor, 3, CommentFieldDto$$serializer.INSTANCE, value.d);
        if (!b.F()) {
            DoneButtonDto doneButtonDto = value.e;
            DoneButtonDto.Companion.getClass();
        }
        b.e(serialDescriptor, 4, DoneButtonDto$$serializer.INSTANCE, value.e);
        if (b.F() || !jl40.l(value.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
