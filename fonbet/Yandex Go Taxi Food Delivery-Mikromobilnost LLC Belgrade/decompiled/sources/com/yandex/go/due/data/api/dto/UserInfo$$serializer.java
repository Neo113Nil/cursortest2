package com.yandex.go.due.data.api.dto;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due/data/api/dto/UserInfo.$serializer", "Luxs;", "Lcom/yandex/go/due/data/api/dto/UserInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due/data/api/dto/UserInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due/data/api/dto/UserInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class UserInfo$$serializer implements uxs {
    public static final UserInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UserInfo$$serializer userInfo$$serializer = new UserInfo$$serializer();
        INSTANCE = userInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due.data.api.dto.UserInfo", userInfo$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("unavailable_time_items", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("unavailable_time_buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private UserInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = UserInfo.e;
        ScheduledOrderButtons$$serializer scheduledOrderButtons$$serializer = ScheduledOrderButtons$$serializer.INSTANCE;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), scheduledOrderButtons$$serializer, scheduledOrderButtons$$serializer};
    }

    @Override // defpackage.myi
    public final UserInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = UserInfo.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        ScheduledOrderButtons scheduledOrderButtons = null;
        ScheduledOrderButtons scheduledOrderButtons2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                scheduledOrderButtons = (ScheduledOrderButtons) b.A(serialDescriptor, 2, ScheduledOrderButtons$$serializer.INSTANCE, scheduledOrderButtons);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                scheduledOrderButtons2 = (ScheduledOrderButtons) b.A(serialDescriptor, 3, ScheduledOrderButtons$$serializer.INSTANCE, scheduledOrderButtons2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new UserInfo(i, list, list2, scheduledOrderButtons, scheduledOrderButtons2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, UserInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = UserInfo.e;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        boolean F2 = b.F();
        ScheduledOrderButtons scheduledOrderButtons = ScheduledOrderButtons.c;
        if (!F2) {
            ScheduledOrderButtons scheduledOrderButtons2 = value.c;
            ScheduledOrderButtons.Companion.getClass();
        }
        b.e(serialDescriptor, 2, ScheduledOrderButtons$$serializer.INSTANCE, value.c);
        if (!b.F()) {
            ScheduledOrderButtons scheduledOrderButtons3 = value.d;
            ScheduledOrderButtons.Companion.getClass();
        }
        b.e(serialDescriptor, 3, ScheduledOrderButtons$$serializer.INSTANCE, value.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
