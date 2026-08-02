package xsna;

import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.id.StringId;
import java.util.Map;
import org.chromium.net.NetError;
import xsna.nwf;

/* compiled from: GetClusteredMarkersForStaticPreviewUseCase.kt */
/* loaded from: classes2.dex */
public final class pqt implements nwf.a {
    public final /* synthetic */ rqt a;
    public final /* synthetic */ Map<StringId, GeoStaticPreviewInput.Item> b;

    public pqt(rqt rqtVar, Map<StringId, GeoStaticPreviewInput.Item> map) {
        this.a = rqtVar;
        this.b = map;
    }

    @Override // xsna.nwf.a
    public final BoundingBox a(int i, BoundingBox boundingBox, String str) {
        GeoStaticPreviewInput.Item item = this.b.get(new StringId(str));
        if (item == null) {
            return BoundingBox.e;
        }
        String str2 = item.c;
        rqt rqtVar = this.a;
        return x7k.a(rqtVar.b, str, rqtVar.c, i, (float) item.d, (float) item.e, b(boundingBox), str2.length() > 0, false, false, str2, 1792);
    }

    @Override // xsna.nwf.a
    public final float b(BoundingBox boundingBox) {
        return ((Number) this.a.d.invoke(boundingBox)).floatValue();
    }

    @Override // xsna.nwf.a
    public final int e(int i, String str) {
        GeoStaticPreviewInput.Item item = this.b.get(new StringId(str));
        String str2 = item != null ? item.c : null;
        return (str2 == null || str2.length() == 0) ? i & NetError.ERR_SOCKET_SET_SEND_BUFFER_SIZE_ERROR : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // xsna.nwf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(int i, atx0 atx0Var, atx0 atx0Var2) {
        double d;
        double d2 = -1.7976931348623157E308d;
        Map<StringId, GeoStaticPreviewInput.Item> map = this.b;
        if (atx0Var != null) {
            GeoStaticPreviewInput.Item item = map.get(new StringId(atx0Var.a()));
            Double valueOf = item != null ? Double.valueOf(item.f) : null;
            if (valueOf != null) {
                d = valueOf.doubleValue();
                if (atx0Var2 != null) {
                    GeoStaticPreviewInput.Item item2 = map.get(new StringId(atx0Var2.a()));
                    Double valueOf2 = item2 != null ? Double.valueOf(item2.f) : null;
                    if (valueOf2 != null) {
                        d2 = valueOf2.doubleValue();
                    }
                }
                return Double.compare(d, d2);
            }
        }
        d = -1.7976931348623157E308d;
        if (atx0Var2 != null) {
        }
        return Double.compare(d, d2);
    }

    @Override // xsna.nwf.a
    public final void c() {
    }

    @Override // xsna.nwf.a
    public final void d() {
    }
}
