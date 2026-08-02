package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment;

/* loaded from: classes5.dex */
public final /* synthetic */ class fip implements uxs {
    public static final fip a;
    private static final SerialDescriptor descriptor;

    static {
        fip fipVar = new fip();
        a = fipVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.experiment.FavoritesCreateRegularAddressExperiment", fipVar, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FavoritesCreateRegularAddressExperiment.h;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), w7sVar, w7sVar, qke.n(auu0.a), i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FavoritesCreateRegularAddressExperiment.h;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        List list = null;
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
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FavoritesCreateRegularAddressExperiment(i, z2, map, formattedText, formattedText2, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FavoritesCreateRegularAddressExperiment favoritesCreateRegularAddressExperiment = (FavoritesCreateRegularAddressExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FavoritesCreateRegularAddressExperiment.h;
        if (b.F() || favoritesCreateRegularAddressExperiment.b) {
            b.n(serialDescriptor, 0, favoritesCreateRegularAddressExperiment.b);
        }
        if (b.F() || !jl40.l(favoritesCreateRegularAddressExperiment.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), favoritesCreateRegularAddressExperiment.c);
        }
        if (b.F() || !jl40.l(favoritesCreateRegularAddressExperiment.d, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, favoritesCreateRegularAddressExperiment.d);
        }
        if (b.F() || !jl40.l(favoritesCreateRegularAddressExperiment.e, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, favoritesCreateRegularAddressExperiment.e);
        }
        if (b.F() || favoritesCreateRegularAddressExperiment.f != null) {
            b.g(serialDescriptor, 4, auu0.a, favoritesCreateRegularAddressExperiment.f);
        }
        if (b.F() || !jl40.l(favoritesCreateRegularAddressExperiment.g, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), favoritesCreateRegularAddressExperiment.g);
        }
        b.c(serialDescriptor);
    }
}
