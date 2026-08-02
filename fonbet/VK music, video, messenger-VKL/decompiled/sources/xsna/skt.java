package xsna;

import com.vk.geo.impl.model.Coordinate;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;

/* compiled from: GeoFragment.kt */
/* loaded from: classes2.dex */
public final class skt implements izs<Coordinate, s3q0> {
    public final /* synthetic */ GeoFragment b;

    public skt(GeoFragment geoFragment) {
        this.b = geoFragment;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Coordinate coordinate) {
        long j = coordinate.j();
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"on new userlocation " + ((Object) Coordinate.i(j))});
        }
        try {
        } catch (Throwable th) {
            L.i(th);
        }
        if (!Coordinate.g(j)) {
            throw new IllegalStateException("user location is invalid");
        }
        GeoFragment geoFragment = this.b;
        qcy<Object>[] qcyVarArr = GeoFragment.c0;
        yv50 fo = geoFragment.fo();
        fo.getClass();
        if (Coordinate.g(j)) {
            fo.x = j;
            if (fo.v == 0) {
                aw50 x = fo.x(fo.y(j));
                if (x != null) {
                    fo.v = x;
                }
            } else {
                fo.F(j);
            }
        }
        return s3q0.a;
    }
}
