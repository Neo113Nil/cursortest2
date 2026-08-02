package defpackage;

import defpackage.d8i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class e8i implements uxs {
    public static final e8i a;
    private static final SerialDescriptor descriptor;

    static {
        e8i e8iVar = new e8i();
        a = e8iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.logistics.experiments.explicitcomment.DeliveryExplicitCommentCourierExperiment.CommentViewCourier", e8iVar, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("text_input_hint", true);
        pluginGeneratedSerialDescriptor.j("button_ok_title", true);
        pluginGeneratedSerialDescriptor.j("button_dismiss_title", true);
        pluginGeneratedSerialDescriptor.j("comment_max_length", true);
        pluginGeneratedSerialDescriptor.j("photo_attachments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, n, h8i.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        d8i.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                case 6:
                    cVar = (d8i.c) b.A(serialDescriptor, 6, h8i.a, cVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new d8i.b(i, str, str2, str3, str4, str5, num, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (defpackage.jl40.l(r0, d8i.c.d) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        d8i.b bVar = (d8i.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        f8i f8iVar = d8i.b.Companion;
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, "")) {
            b.o(serialDescriptor, 1, bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, "")) {
            b.o(serialDescriptor, 2, bVar.c);
        }
        if (b.F() || !jl40.l(bVar.d, "")) {
            b.o(serialDescriptor, 3, bVar.d);
        }
        if (b.F() || !jl40.l(bVar.e, "")) {
            b.o(serialDescriptor, 4, bVar.e);
        }
        if (b.F() || bVar.f != null) {
            b.g(serialDescriptor, 5, h6w.a, bVar.f);
        }
        if (!b.F()) {
            d8i.c cVar = bVar.g;
            d8i.c.Companion.getClass();
        }
        b.e(serialDescriptor, 6, h8i.a, bVar.g);
        b.c(serialDescriptor);
    }
}
