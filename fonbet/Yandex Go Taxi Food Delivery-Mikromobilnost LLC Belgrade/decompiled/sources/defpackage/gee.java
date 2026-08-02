package defpackage;

import android.util.Base64;
import com.yandex.quark.js.serializer.JsDataSerializationStrategy;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class gee implements KSerializer {
    public final /* synthetic */ int a = 1;
    public final asq0 b;
    public final Object c;

    public gee(KSerializer kSerializer) {
        this.c = qke.n(kSerializer);
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (evu0.J("ContainerSerializer")) {
            ny61.g("Blank serial names are prohibited");
            throw null;
        }
        h0c h0cVar = new h0c("ContainerSerializer");
        h0cVar.a(Constants.KEY_DATA, ((KSerializer) this.c).getDescriptor(), (r3 & 8) == 0);
        this.b = new asq0("ContainerSerializer", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        nng u;
        int i = this.a;
        Object obj = this.c;
        asq0 asq0Var = this.b;
        nng nngVar = null;
        switch (i) {
            case 0:
                sjd b = decoder.b(asq0Var);
                Object obj2 = null;
                while (true) {
                    int v = b.v(asq0Var);
                    if (v == -1) {
                        aee aeeVar = new aee(obj2);
                        b.c(asq0Var);
                        return aeeVar;
                    }
                    if (v != 0) {
                        yci0.m(oyr.i(v, "Unknown index "));
                        return null;
                    }
                    obj2 = b.A(asq0Var, 0, (KSerializer) obj, null);
                }
            default:
                sjd b2 = decoder.b(asq0Var);
                String str = null;
                String str2 = null;
                while (true) {
                    int v2 = b2.v(asq0Var);
                    if (v2 != -1) {
                        if (v2 == 0) {
                            str = b2.k(asq0Var, 0);
                        } else if (v2 == 1) {
                            str2 = b2.k(asq0Var, 1);
                        } else {
                            yci0.m(oyr.i(v2, "Unexpected index: "));
                        }
                    } else if (str == null) {
                        ny61.g("Missing required field 'type'");
                    } else if (str2 != null) {
                        if (str.equals("protobuf")) {
                            try {
                                u = vvb1.u(1, null, Base64.decode(str2, 0));
                            } catch (IllegalArgumentException e) {
                                throw new SerializationException(g8e.o("Failed to decode protobuf from base64: ", e.getMessage()), e);
                            }
                        } else if (str.equals("json")) {
                            int i2 = max.a[((JsDataSerializationStrategy) obj).ordinal()];
                            if (i2 == 1) {
                                u = vvb1.u(2, str2, null);
                            } else if (i2 != 2) {
                                w511.b();
                            } else {
                                yci0.m("proto representation is required but actual json");
                            }
                        } else {
                            yci0.m(oyr.p("Unknown type: ", str, ". Expected 'protobuf' or 'json'"));
                        }
                        nngVar = u;
                        b2.c(asq0Var);
                    } else {
                        ny61.g("Missing required field 'value'");
                    }
                }
                return nngVar;
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        asq0 asq0Var = this.b;
        switch (i) {
            case 0:
                yjd b = encoder.b(asq0Var);
                b.e(asq0Var, 0, (KSerializer) obj2, ((aee) obj).a);
                b.c(asq0Var);
                break;
            default:
                png pngVar = (png) obj;
                yjd b2 = encoder.b(asq0Var);
                int i2 = max.a[((JsDataSerializationStrategy) obj2).ordinal()];
                if (i2 == 1) {
                    String a = pngVar.a();
                    if (a == null) {
                        yci0.m("jsonRepresentation is required but is null");
                        break;
                    } else {
                        b2.o(asq0Var, 0, "json");
                        b2.o(asq0Var, 1, a);
                    }
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    byte[] b3 = pngVar.b();
                    if (b3 == null) {
                        yci0.m("binaryRepresentation is required but is null");
                        break;
                    } else {
                        String encodeToString = Base64.encodeToString(b3, 0);
                        b2.o(asq0Var, 0, "protobuf");
                        b2.o(asq0Var, 1, encodeToString);
                    }
                }
                b2.c(asq0Var);
                break;
        }
    }

    public gee(JsDataSerializationStrategy jsDataSerializationStrategy) {
        this.c = jsDataSerializationStrategy;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (!evu0.J("JsData")) {
            h0c h0cVar = new h0c("JsData");
            o2f0 o2f0Var = auu0.b;
            h0cVar.a("type", o2f0Var, false);
            h0cVar.a("value", o2f0Var, false);
            this.b = new asq0("JsData", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
            return;
        }
        ny61.g("Blank serial names are prohibited");
        throw null;
    }
}
