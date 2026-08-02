package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class p53 extends mcc {
    public final /* synthetic */ int b;
    public final ysy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p53(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.b = i;
        switch (i) {
            case 1:
                super(kSerializer);
                this.c = new s43(kSerializer.getDescriptor(), 2);
                break;
            default:
                this.c = new s43(kSerializer.getDescriptor(), 1);
                break;
        }
    }

    @Override // defpackage.a7
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.a7
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    @Override // defpackage.a7
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                return new ArrayList((Collection) null);
            default:
                return new LinkedHashSet((Collection) null);
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        switch (this.b) {
        }
        return (s43) this.c;
    }

    @Override // defpackage.a7
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    @Override // defpackage.jcc
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
