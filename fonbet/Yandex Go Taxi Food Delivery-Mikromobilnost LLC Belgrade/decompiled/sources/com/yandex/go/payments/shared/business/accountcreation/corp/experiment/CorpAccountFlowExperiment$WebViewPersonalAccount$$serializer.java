package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment.WebViewPersonalAccount.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$WebViewPersonalAccount;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$WebViewPersonalAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$WebViewPersonalAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class CorpAccountFlowExperiment$WebViewPersonalAccount$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CorpAccountFlowExperiment$WebViewPersonalAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CorpAccountFlowExperiment$WebViewPersonalAccount$$serializer corpAccountFlowExperiment$WebViewPersonalAccount$$serializer = new CorpAccountFlowExperiment$WebViewPersonalAccount$$serializer();
        INSTANCE = corpAccountFlowExperiment$WebViewPersonalAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment.WebViewPersonalAccount", corpAccountFlowExperiment$WebViewPersonalAccount$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("is_show_close_button", true);
        pluginGeneratedSerialDescriptor.j("is_show_splash_logo", true);
        pluginGeneratedSerialDescriptor.j("fullscreen_screen_tag", true);
        pluginGeneratedSerialDescriptor.j("user_agent_tag", true);
        pluginGeneratedSerialDescriptor.j("enable_open_in_external_browser_android", true);
        pluginGeneratedSerialDescriptor.j("location_host_white_list", true);
        pluginGeneratedSerialDescriptor.j("utm_source_point_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CorpAccountFlowExperiment$WebViewPersonalAccount$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CorpAccountFlowExperiment.WebViewPersonalAccount.i;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, z96Var, z96Var, auu0Var, CorpAccountFlowExperiment$UserAgentTag$$serializer.INSTANCE, z96Var, i3yVarArr[6].getValue(), auu0Var};
    }

    @Override // defpackage.myi
    public final CorpAccountFlowExperiment.WebViewPersonalAccount deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CorpAccountFlowExperiment.WebViewPersonalAccount.i;
        b.getClass();
        CorpAccountFlowExperiment.WebViewPersonalAccount webViewPersonalAccount = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str = null;
        String str2 = null;
        CorpAccountFlowExperiment.UserAgentTag userAgentTag = null;
        List list = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z3 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    userAgentTag = (CorpAccountFlowExperiment.UserAgentTag) b.A(serialDescriptor, 4, CorpAccountFlowExperiment$UserAgentTag$$serializer.INSTANCE, userAgentTag);
                    i |= 16;
                    break;
                case 5:
                    z4 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    str3 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return webViewPersonalAccount;
            }
            webViewPersonalAccount = null;
        }
        b.c(serialDescriptor);
        return new CorpAccountFlowExperiment.WebViewPersonalAccount(i, str, z2, z3, str2, userAgentTag, z4, list, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CorpAccountFlowExperiment.WebViewPersonalAccount value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CorpAccountFlowExperiment.WebViewPersonalAccount.i;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, new CorpAccountFlowExperiment.UserAgentTag(0))) {
            b.e(serialDescriptor, 4, CorpAccountFlowExperiment$UserAgentTag$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, EmptyList.a)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
