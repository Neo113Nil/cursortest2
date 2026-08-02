package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class eh40 implements uxs {
    public static final eh40 a;
    private static final SerialDescriptor descriptor;

    static {
        eh40 eh40Var = new eh40();
        a = eh40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainSchedulerResponse", eh40Var, 7);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("date_buttons_bar", true);
        pluginGeneratedSerialDescriptor.j("date_selector", true);
        pluginGeneratedSerialDescriptor.j("stations", true);
        pluginGeneratedSerialDescriptor.j("filters", true);
        pluginGeneratedSerialDescriptor.j("schedule", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{gef.a, qke.n(w7s.a), tg40.a, le40.a, lh40.a, nf40.a, zf40.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ief iefVar = null;
        FormattedText formattedText = null;
        vg40 vg40Var = null;
        ne40 ne40Var = null;
        nh40 nh40Var = null;
        pf40 pf40Var = null;
        bg40 bg40Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iefVar = (ief) b.A(serialDescriptor, 0, gef.a, iefVar);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    vg40Var = (vg40) b.A(serialDescriptor, 2, tg40.a, vg40Var);
                    i |= 4;
                    break;
                case 3:
                    ne40Var = (ne40) b.A(serialDescriptor, 3, le40.a, ne40Var);
                    i |= 8;
                    break;
                case 4:
                    nh40Var = (nh40) b.A(serialDescriptor, 4, lh40.a, nh40Var);
                    i |= 16;
                    break;
                case 5:
                    pf40Var = (pf40) b.A(serialDescriptor, 5, nf40.a, pf40Var);
                    i |= 32;
                    break;
                case 6:
                    bg40Var = (bg40) b.A(serialDescriptor, 6, zf40.a, bg40Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new gh40(i, iefVar, formattedText, vg40Var, ne40Var, nh40Var, pf40Var, bg40Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.vg40.e) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.ne40.f) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.nh40.c) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.pf40.d) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.bg40.c) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        gh40 gh40Var = (gh40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(gh40Var.a, ief.e)) {
            b.e(serialDescriptor, 0, gef.a, gh40Var.a);
        }
        if (b.F() || gh40Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, gh40Var.b);
        }
        if (!b.F()) {
            vg40 vg40Var = gh40Var.c;
            vg40.Companion.getClass();
        }
        b.e(serialDescriptor, 2, tg40.a, gh40Var.c);
        if (!b.F()) {
            ne40 ne40Var = gh40Var.d;
            ne40.Companion.getClass();
        }
        b.e(serialDescriptor, 3, le40.a, gh40Var.d);
        if (!b.F()) {
            nh40 nh40Var = gh40Var.e;
            nh40.Companion.getClass();
        }
        b.e(serialDescriptor, 4, lh40.a, gh40Var.e);
        if (!b.F()) {
            pf40 pf40Var = gh40Var.f;
            pf40.Companion.getClass();
        }
        b.e(serialDescriptor, 5, nf40.a, gh40Var.f);
        if (!b.F()) {
            bg40 bg40Var = gh40Var.g;
            bg40.Companion.getClass();
        }
        b.e(serialDescriptor, 6, zf40.a, gh40Var.g);
        b.c(serialDescriptor);
    }
}
