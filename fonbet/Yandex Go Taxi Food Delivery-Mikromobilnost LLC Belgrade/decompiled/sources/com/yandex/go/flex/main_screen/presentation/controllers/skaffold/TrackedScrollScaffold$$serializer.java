package com.yandex.go.flex.main_screen.presentation.controllers.skaffold;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ayk;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import flex.feature.divkit.scaffold.DivKitScaffoldPadding;
import flex.section.divkit.DivkitSnippet;
import flex.theme.ThemedColor;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/main_screen/presentation/controllers/skaffold/TrackedScrollScaffold.$serializer", "Luxs;", "Lcom/yandex/go/flex/main_screen/presentation/controllers/skaffold/TrackedScrollScaffold;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/main_screen/presentation/controllers/skaffold/TrackedScrollScaffold;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/main_screen/presentation/controllers/skaffold/TrackedScrollScaffold;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class TrackedScrollScaffold$$serializer implements uxs {
    public static final TrackedScrollScaffold$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TrackedScrollScaffold$$serializer trackedScrollScaffold$$serializer = new TrackedScrollScaffold$$serializer();
        INSTANCE = trackedScrollScaffold$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.flex.main_screen.presentation.controllers.skaffold.TrackedScrollScaffold", trackedScrollScaffold$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("topView", true);
        pluginGeneratedSerialDescriptor.j("topPadding", false);
        pluginGeneratedSerialDescriptor.j("bottomView", true);
        pluginGeneratedSerialDescriptor.j("bottomPadding", false);
        pluginGeneratedSerialDescriptor.j("overlayView", true);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackedScrollScaffold$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TrackedScrollScaffold.g;
        KSerializer n = qke.n((KSerializer) i3yVarArr[0].getValue());
        ayk aykVar = ayk.a;
        return new KSerializer[]{n, qke.n(aykVar), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(aykVar), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final TrackedScrollScaffold deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TrackedScrollScaffold.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        DivkitSnippet divkitSnippet = null;
        DivKitScaffoldPadding divKitScaffoldPadding = null;
        DivkitSnippet divkitSnippet2 = null;
        DivKitScaffoldPadding divKitScaffoldPadding2 = null;
        DivkitSnippet divkitSnippet3 = null;
        ThemedColor themedColor = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    divkitSnippet = (DivkitSnippet) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), divkitSnippet);
                    i |= 1;
                    break;
                case 1:
                    divKitScaffoldPadding = (DivKitScaffoldPadding) b.s(serialDescriptor, 1, ayk.a, divKitScaffoldPadding);
                    i |= 2;
                    break;
                case 2:
                    divkitSnippet2 = (DivkitSnippet) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), divkitSnippet2);
                    i |= 4;
                    break;
                case 3:
                    divKitScaffoldPadding2 = (DivKitScaffoldPadding) b.s(serialDescriptor, 3, ayk.a, divKitScaffoldPadding2);
                    i |= 8;
                    break;
                case 4:
                    divkitSnippet3 = (DivkitSnippet) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), divkitSnippet3);
                    i |= 16;
                    break;
                case 5:
                    themedColor = (ThemedColor) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), themedColor);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TrackedScrollScaffold(i, divkitSnippet, divKitScaffoldPadding, divkitSnippet2, divKitScaffoldPadding2, divkitSnippet3, themedColor);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TrackedScrollScaffold value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TrackedScrollScaffold.g;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        ayk aykVar = ayk.a;
        DivKitScaffoldPadding divKitScaffoldPadding = value.b;
        ThemedColor themedColor = value.f;
        DivkitSnippet divkitSnippet = value.e;
        DivkitSnippet divkitSnippet2 = value.c;
        b.g(serialDescriptor, 1, aykVar, divKitScaffoldPadding);
        if (b.F() || divkitSnippet2 != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), divkitSnippet2);
        }
        b.g(serialDescriptor, 3, aykVar, value.d);
        if (b.F() || divkitSnippet != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), divkitSnippet);
        }
        if (b.F() || themedColor != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), themedColor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
