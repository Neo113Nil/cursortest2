package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public class lex extends f8 {
    public final /* synthetic */ int g;
    public final Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lex(sbx sbxVar, tls tlsVar, int i) {
        super(sbxVar, tlsVar);
        this.g = i;
        switch (i) {
            case 1:
                super(sbxVar, tlsVar);
                this.h = new ArrayList();
                break;
            default:
                this.h = new LinkedHashMap();
                break;
        }
    }

    @Override // defpackage.f8, defpackage.x150
    public String X(SerialDescriptor serialDescriptor, int i) {
        switch (this.g) {
            case 1:
                return String.valueOf(i);
            default:
                return super.X(serialDescriptor, i);
        }
    }

    @Override // defpackage.f8
    public b Y() {
        switch (this.g) {
            case 0:
                return new c((LinkedHashMap) this.h);
            default:
                return new a((ArrayList) this.h);
        }
    }

    @Override // defpackage.f8
    public void Z(String str, b bVar) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((LinkedHashMap) obj).put(str, bVar);
                break;
            default:
                ((ArrayList) obj).add(Integer.parseInt(str), bVar);
                break;
        }
    }

    @Override // defpackage.o7x0, defpackage.yjd
    public void g(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        switch (this.g) {
            case 0:
                if (obj != null || this.d.f) {
                    super.g(serialDescriptor, i, kSerializer, obj);
                    break;
                }
                break;
            default:
                super.g(serialDescriptor, i, kSerializer, obj);
                break;
        }
    }
}
