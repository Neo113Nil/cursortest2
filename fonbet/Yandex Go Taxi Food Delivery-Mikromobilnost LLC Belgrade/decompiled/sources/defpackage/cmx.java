package defpackage;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.k;

/* loaded from: classes11.dex */
public final class cmx extends k implements yt10 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cmx(int i) {
        super(r1);
        dmx dmxVar;
        dmxVar = dmx.DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0031a
    public final /* bridge */ /* synthetic */ Object clone() {
        return a();
    }

    public final void g(gmx gmxVar) {
        e();
        dmx.y((dmx) this.b, gmxVar);
    }

    @Override // defpackage.yt10
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return this.a;
    }

    public final void h() {
        e();
        dmx.x((dmx) this.b);
    }
}
