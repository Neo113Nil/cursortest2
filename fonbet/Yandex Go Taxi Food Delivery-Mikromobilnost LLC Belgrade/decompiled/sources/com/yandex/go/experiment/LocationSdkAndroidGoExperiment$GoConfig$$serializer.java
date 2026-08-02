package com.yandex.go.experiment;

import com.yandex.go.experiment.LocationSdkAndroidGoExperiment;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/experiment/LocationSdkAndroidGoExperiment.GoConfig.$serializer", "Luxs;", "Lcom/yandex/go/experiment/LocationSdkAndroidGoExperiment$GoConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/experiment/LocationSdkAndroidGoExperiment$GoConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/experiment/LocationSdkAndroidGoExperiment$GoConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class LocationSdkAndroidGoExperiment$GoConfig$$serializer implements uxs {
    public static final LocationSdkAndroidGoExperiment$GoConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LocationSdkAndroidGoExperiment$GoConfig$$serializer locationSdkAndroidGoExperiment$GoConfig$$serializer = new LocationSdkAndroidGoExperiment$GoConfig$$serializer();
        INSTANCE = locationSdkAndroidGoExperiment$GoConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.experiment.LocationSdkAndroidGoExperiment.GoConfig", locationSdkAndroidGoExperiment$GoConfig$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("use_when_there_is_at_least_one_location", true);
        pluginGeneratedSerialDescriptor.j("use_as_location_provider", true);
        pluginGeneratedSerialDescriptor.j("add_in_persuggest_last_locations_from_sdk_for_polling", true);
        pluginGeneratedSerialDescriptor.j("use_fallback_other_provider", true);
        pluginGeneratedSerialDescriptor.j("add_in_persuggest_last_locations_from_sdk", true);
        pluginGeneratedSerialDescriptor.j("add_in_persuggest_verified_location_tags", true);
        pluginGeneratedSerialDescriptor.j("add_in_persuggest_last_locations_type_suffix", true);
        pluginGeneratedSerialDescriptor.j("add_known_coordinate_in_coord_providers", true);
        pluginGeneratedSerialDescriptor.j("provide_all_locations_in_coord_providers", true);
        pluginGeneratedSerialDescriptor.j("last_location_timeout_ms", true);
        pluginGeneratedSerialDescriptor.j("last_location_timeout_sources", true);
        pluginGeneratedSerialDescriptor.j("await_last_known_locations_fetched", true);
        pluginGeneratedSerialDescriptor.j("use_current_location_as_fast_path", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LocationSdkAndroidGoExperiment$GoConfig$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = LocationSdkAndroidGoExperiment.GoConfig.n;
        KSerializer n = qke.n(pnz.a);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[10].getValue());
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, n, n2, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final LocationSdkAndroidGoExperiment.GoConfig deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = LocationSdkAndroidGoExperiment.GoConfig.n;
        b.getClass();
        Set set = null;
        boolean z = true;
        Long l = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z6 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z7 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z8 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z9 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z10 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    l = (Long) b.s(serialDescriptor, 9, pnz.a, l);
                    i |= 512;
                    break;
                case 10:
                    set = (Set) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), set);
                    i |= 1024;
                    break;
                case 11:
                    z11 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    z12 = b.C(serialDescriptor, 12);
                    i |= 4096;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new LocationSdkAndroidGoExperiment.GoConfig(i, z2, z3, z4, z5, z6, z7, z8, z9, z10, l, set, z11, z12);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LocationSdkAndroidGoExperiment.GoConfig value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = LocationSdkAndroidGoExperiment.GoConfig.n;
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i) {
            b.n(serialDescriptor, 8, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, pnz.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        }
        if (b.F() || value.l) {
            b.n(serialDescriptor, 11, value.l);
        }
        if (b.F() || value.m) {
            b.n(serialDescriptor, 12, value.m);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
