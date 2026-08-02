package defpackage;

import com.yandex.plus.log.api.LogPriority;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes2.dex */
public final class hcp implements KSerializer {
    public final pgz a;
    public final asq0 b = d6z.g("FamilyWebMessage", new SerialDescriptor[0]);

    public hcp(pgz pgzVar) {
        this.a = pgzVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            c m = qcx.m(ncxVar.t());
            b bVar = (b) m.get("payload");
            b bVar2 = (b) m.get("type");
            String a = bVar2 != null ? qcx.n(bVar2).a() : null;
            if (a != null) {
                int hashCode = a.hashCode();
                pgz pgzVar = this.a;
                switch (hashCode) {
                    case 77848963:
                        if (a.equals("READY")) {
                            return ccp.a;
                        }
                        break;
                    case 1186731358:
                        if (a.equals("READY_FOR_MESSAGES")) {
                            return dcp.a;
                        }
                        break;
                    case 1259672361:
                        if (a.equals("OPEN_NATIVE_SHARING") && bVar != null) {
                            c m2 = qcx.m(bVar);
                            b bVar3 = (b) m2.get("title");
                            String a2 = bVar3 != null ? qcx.n(bVar3).a() : null;
                            b bVar4 = (b) m2.get("text");
                            String a3 = bVar4 != null ? qcx.n(bVar4).a() : null;
                            b bVar5 = (b) m2.get("mimeType");
                            String a4 = bVar5 != null ? qcx.n(bVar5).a() : null;
                            if (a3 != null && !evu0.J(a3) && a4 != null && !evu0.J(a4)) {
                                return new bcp(a2, a3, a4);
                            }
                            LogPriority logPriority = LogPriority.DEBUG;
                            if (pgzVar.e(logPriority)) {
                                pgzVar.a(logPriority, "FamilyWebMessageDeserializer", "Expected text and mimeType to be not blank and not null for native sharing message");
                                return null;
                            }
                        }
                        break;
                    case 1629401836:
                        if (a.equals("SEND_METRICS") && bVar != null) {
                            c m3 = qcx.m(bVar);
                            b bVar6 = (b) m3.get("EventName");
                            String a5 = bVar6 != null ? qcx.n(bVar6).a() : null;
                            b bVar7 = (b) m3.get("EventValue");
                            String a6 = bVar7 != null ? qcx.n(bVar7).a() : null;
                            if (a5 != null && !evu0.J(a5) && a6 != null && !evu0.J(a6)) {
                                return new ecp(a5, a6);
                            }
                            LogPriority logPriority2 = LogPriority.DEBUG;
                            if (pgzVar.e(logPriority2)) {
                                pgzVar.a(logPriority2, "FamilyWebMessageDeserializer", "Expected eventName and eventValue to be not blank and not null for send metrics message");
                                return null;
                            }
                        }
                        break;
                }
            }
        }
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new UnsupportedOperationException("FamilyWebMessageDeserializer does not support serialization");
    }
}
