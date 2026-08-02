package com.yandex.go.flex.common.api.actions;

import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction.$serializer", "Luxs;", "Lcom/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/common/api/actions/TaxiExpectedDestinationAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class TaxiExpectedDestinationAction$$serializer implements uxs {
    public static final TaxiExpectedDestinationAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiExpectedDestinationAction$$serializer taxiExpectedDestinationAction$$serializer = new TaxiExpectedDestinationAction$$serializer();
        INSTANCE = taxiExpectedDestinationAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction", taxiExpectedDestinationAction$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("shortcut_info", false);
        pluginGeneratedSerialDescriptor.j("prefetch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiExpectedDestinationAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TaxiExpectedDestinationAction.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{GeoPoint$$serializer.INSTANCE, auu0Var, auu0Var, qke.n(TaxiExpectedDestinationAction$ShortcutInfo$$serializer.INSTANCE), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final TaxiExpectedDestinationAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiExpectedDestinationAction.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        GeoPoint geoPoint = null;
        String str = null;
        String str2 = null;
        TaxiExpectedDestinationAction.ShortcutInfo shortcutInfo = null;
        TaxiExpectedDestinationAction.Prefetch prefetch = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                geoPoint = (GeoPoint) b.A(serialDescriptor, 0, GeoPoint$$serializer.INSTANCE, geoPoint);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                shortcutInfo = (TaxiExpectedDestinationAction.ShortcutInfo) b.s(serialDescriptor, 3, TaxiExpectedDestinationAction$ShortcutInfo$$serializer.INSTANCE, shortcutInfo);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                prefetch = (TaxiExpectedDestinationAction.Prefetch) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), prefetch);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new TaxiExpectedDestinationAction(i, geoPoint, str, str2, shortcutInfo, prefetch);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiExpectedDestinationAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiExpectedDestinationAction.f;
        if (b.F() || !jl40.l(value.a, new GeoPoint(0))) {
            b.e(serialDescriptor, 0, GeoPoint$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        TaxiExpectedDestinationAction$ShortcutInfo$$serializer taxiExpectedDestinationAction$ShortcutInfo$$serializer = TaxiExpectedDestinationAction$ShortcutInfo$$serializer.INSTANCE;
        TaxiExpectedDestinationAction.ShortcutInfo shortcutInfo = value.d;
        TaxiExpectedDestinationAction.Prefetch prefetch = value.e;
        b.g(serialDescriptor, 3, taxiExpectedDestinationAction$ShortcutInfo$$serializer, shortcutInfo);
        if (b.F() || prefetch != TaxiExpectedDestinationAction.Prefetch.None) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), prefetch);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
