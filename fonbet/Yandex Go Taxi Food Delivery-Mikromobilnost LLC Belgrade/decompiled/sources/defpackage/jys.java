package defpackage;

import flex.animation.player.interpolator.InterpolationType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes4.dex */
public final class jys extends y8 {
    public final KSerializer a;
    public final SerialDescriptor b;

    public jys() {
        KSerializer serializer = iys.Companion.serializer();
        this.a = serializer;
        this.b = serializer.getDescriptor();
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        if (!(bVar instanceof c)) {
            ny61.g("Failed requirement.");
            return null;
        }
        sbxVar.getClass();
        iys iysVar = (iys) sbxVar.a(iys.Companion.serializer(), bVar);
        String str = iysVar.a;
        long c = m810.c(iysVar.b * 1000.0d);
        Double d = iysVar.c;
        long c2 = d != null ? m810.c(d.doubleValue() * 1000.0d) : 0L;
        InterpolationType interpolationType = iysVar.d;
        if (interpolationType == null) {
            interpolationType = InterpolationType.Linear;
        }
        return new cys(str, c, c2, interpolationType, iysVar.e, iysVar.f, iysVar.g);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }
}
