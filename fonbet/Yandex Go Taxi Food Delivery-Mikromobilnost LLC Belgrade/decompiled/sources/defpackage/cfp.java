package defpackage;

import com.yandex.go.address.models.FavoriteAddressesBannerItem;
import com.yandex.go.address.models.FavoriteAddressesBannerItem$$serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class cfp implements uxs {
    public static final cfp a;
    private static final SerialDescriptor descriptor;

    static {
        cfp cfpVar = new cfp();
        a = cfpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.FavoriteAddressesResponse", cfpVar, 5);
        pluginGeneratedSerialDescriptor.j("userplaces", true);
        pluginGeneratedSerialDescriptor.j("banner", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("create_address_info", true);
        pluginGeneratedSerialDescriptor.j("address_top_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{efp.f[0].getValue(), qke.n(FavoriteAddressesBannerItem$$serializer.INSTANCE), auu0.a, c5f.a, c81.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = efp.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        FavoriteAddressesBannerItem favoriteAddressesBannerItem = null;
        String str = null;
        e5f e5fVar = null;
        e81 e81Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                favoriteAddressesBannerItem = (FavoriteAddressesBannerItem) b.s(serialDescriptor, 1, FavoriteAddressesBannerItem$$serializer.INSTANCE, favoriteAddressesBannerItem);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                e5fVar = (e5f) b.A(serialDescriptor, 3, c5f.a, e5fVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                e81Var = (e81) b.A(serialDescriptor, 4, c81.a, e81Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new efp(i, list, favoriteAddressesBannerItem, str, e5fVar, e81Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.e5f.e) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        efp efpVar = (efp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = efp.f;
        if (b.F() || !jl40.l(efpVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), efpVar.a);
        }
        if (b.F() || efpVar.b != null) {
            b.g(serialDescriptor, 1, FavoriteAddressesBannerItem$$serializer.INSTANCE, efpVar.b);
        }
        if (b.F() || !jl40.l(efpVar.c, "")) {
            b.o(serialDescriptor, 2, efpVar.c);
        }
        if (!b.F()) {
            e5f e5fVar = efpVar.d;
            e5f.Companion.getClass();
        }
        b.e(serialDescriptor, 3, c5f.a, efpVar.d);
        if (b.F() || !jl40.l(efpVar.e, new e81(0))) {
            b.e(serialDescriptor, 4, c81.a, efpVar.e);
        }
        b.c(serialDescriptor);
    }
}
