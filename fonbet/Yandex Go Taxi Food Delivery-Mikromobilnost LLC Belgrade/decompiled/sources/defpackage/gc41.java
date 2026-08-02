package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.yandex.quark.capability.CapabilityListener;
import java.io.IOException;
import ru.yandex.alice.protos.endpoint.platform.utils.TAnyCapabilityHolder;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

/* loaded from: classes2.dex */
public final class gc41 implements CapabilityListener {
    public final /* synthetic */ ProtoAdapter a;
    public final /* synthetic */ gcx b;
    public final /* synthetic */ TCapability.ECapabilityType c;
    public final /* synthetic */ loe d;
    public final /* synthetic */ loe e;
    public final /* synthetic */ u28 f;

    public gc41(ProtoAdapter protoAdapter, gcx gcxVar, TCapability.ECapabilityType eCapabilityType, loe loeVar, loe loeVar2, u28 u28Var) {
        this.a = protoAdapter;
        this.b = gcxVar;
        this.c = eCapabilityType;
        this.d = loeVar;
        this.e = loeVar2;
        this.f = u28Var;
    }

    @Override // com.yandex.quark.capability.CapabilityListener
    public final void onEvent(png pngVar) {
    }

    @Override // com.yandex.quark.capability.CapabilityListener
    public final void onStateChanged(png pngVar) {
        syj0 a;
        syj0 jyj0Var;
        Object obj;
        Object obj2;
        syj0 jyj0Var2;
        ProtoAdapter protoAdapter = this.a;
        ProtoAdapter<TAnyCapabilityHolder> protoAdapter2 = TAnyCapabilityHolder.ADAPTER;
        byte[] b = pngVar.b();
        if (b != null) {
            a = jaa1.a(protoAdapter2, b).a(dog.a);
        } else {
            String a2 = pngVar.a();
            a = a2 != null ? ((t830) this.b).a(TAnyCapabilityHolder.class, a2).a(eog.a) : new jyj0(yng.b);
        }
        if (a instanceof lyj0) {
            TAnyCapabilityHolder tAnyCapabilityHolder = (TAnyCapabilityHolder) ((lyj0) a).a;
            TCapability.ECapabilityType capabilityType = tAnyCapabilityHolder.getCapabilityType();
            TCapability.ECapabilityType eCapabilityType = this.c;
            if (capabilityType != eCapabilityType) {
                jyj0Var = new jyj0(new w28("Invalid capability type! Expected " + eCapabilityType + ", but actual " + tAnyCapabilityHolder.getCapabilityType()));
            } else {
                try {
                    jyj0Var2 = new lyj0(protoAdapter.decode(tAnyCapabilityHolder.getRawCapability()));
                } catch (IOException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to decode ByteString to proto";
                    }
                    jyj0Var2 = new jyj0(new puf0(message, e));
                }
                if (jyj0Var2 instanceof lyj0) {
                    jyj0Var = jyj0Var2;
                } else {
                    if (!(jyj0Var2 instanceof jyj0)) {
                        w511.b();
                        return;
                    }
                    jyj0Var = new jyj0(new v28(((puf0) ((jyj0) jyj0Var2).a).a));
                }
            }
        } else {
            if (!(a instanceof jyj0)) {
                w511.b();
                return;
            }
            jyj0Var = new jyj0(new v28(((zng) ((jyj0) a).a).a));
        }
        lyj0 lyj0Var = jyj0Var instanceof lyj0 ? (lyj0) jyj0Var : null;
        if (lyj0Var != null && (obj2 = lyj0Var.a) != null) {
            this.d.invoke(obj2);
        }
        jyj0 jyj0Var3 = jyj0Var instanceof jyj0 ? (jyj0) jyj0Var : null;
        if (jyj0Var3 == null || (obj = jyj0Var3.a) == null) {
            return;
        }
        this.e.invoke("Failed to decode capability '" + this.f.a() + "': " + ((x28) obj).a);
    }
}
