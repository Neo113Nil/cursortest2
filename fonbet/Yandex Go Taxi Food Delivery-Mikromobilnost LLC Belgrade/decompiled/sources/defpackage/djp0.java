package defpackage;

import flex.feature.sections.action.ScrollPositionSurrogate;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes4.dex */
public final class djp0 extends y8 {
    public static final djp0 a = new djp0();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        cjp0 cjp0Var = (cjp0) sbxVar.a(cjp0.Companion.serializer(), bVar);
        ScrollPositionSurrogate scrollPositionSurrogate = cjp0Var.b;
        if (scrollPositionSurrogate == null) {
            scrollPositionSurrogate = cjp0Var.c;
        }
        if (scrollPositionSurrogate != null) {
            return new yip0(cjp0Var.a, scrollPositionSurrogate, cjp0Var.d, cjp0Var.e);
        }
        yci0.m("Field 'scrollPosition' is required, but it was missing");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return cjp0.Companion.serializer().getDescriptor();
    }
}
