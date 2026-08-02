package defpackage;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class ix extends y8 {
    public final SerialDescriptor a = mx.Companion.serializer().getDescriptor();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        mx mxVar = (mx) sbxVar.a(mx.Companion.serializer(), bVar);
        String str = mxVar.a;
        Map map = mxVar.b;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        return new hx(map, str, mxVar.c);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
