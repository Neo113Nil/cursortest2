package xsna;

import android.app.Activity;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.model.id.StringId;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.bex0;
import xsna.zk3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgq implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hgq(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        lj30 lj30Var;
        int i = this.b;
        int i2 = 0;
        r1 = false;
        r1 = false;
        boolean z = false;
        lj30 lj30Var2 = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return new uar(jar.a((jar) obj3, null, ((igq) obj2).a, 23), (qi80) obj);
            case 1:
                p7y p7yVar = (p7y) obj2;
                x6y x6yVar = p7yVar.a;
                String str = (String) obj;
                if (c57.c((Activity) obj3).a(255) == 0) {
                    boolean e = p7yVar.e(str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", e);
                    bex0.a.b(x6yVar, JsApiMethodType.SECURE_TOKEN_SET, jSONObject, null, 12);
                } else {
                    x6yVar.A(JsApiMethodType.SECURE_TOKEN_SET, VkAppsErrors.Client.i(VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, 7));
                }
                return s3q0.a;
            case 2:
                String str2 = (String) obj3;
                jo00 jo00Var = (jo00) obj2;
                yv50 yv50Var = (yv50) obj;
                StringBuilder sb = new StringBuilder("updateMarkers: feature.selectedMarker=");
                sb.append((Object) (str2 == null ? "null" : StringId.a(str2)));
                sb.append(", operations=");
                sb.append(jo00Var);
                sb.append(", visibleStyles=");
                Iterator it = ((zk3.e) yv50Var.u.values()).iterator();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    ttw ttwVar = (ttw) it;
                    if (!ttwVar.hasNext()) {
                        StringBuilder a = odj.a(i2, i3, "dots=", ", avatars=", ", categories=");
                        a.append(i4);
                        a.append(", highligtsCount=");
                        a.append(i5);
                        sb.append(a.toString());
                        return sb.toString();
                    }
                    int i6 = ((VisibleStyle) ttwVar.next()).b;
                    if (VisibleStyle.D(i6)) {
                        i5++;
                    } else if (VisibleStyle.p(i6)) {
                        i2++;
                    } else if (VisibleStyle.l(i6)) {
                        i4++;
                    } else if (VisibleStyle.C(i6)) {
                        i3++;
                    }
                }
            case 3:
                yg20 yg20Var = (yg20) obj3;
                Peer peer = (Peer) obj2;
                gkx0 gkx0Var = (gkx0) obj;
                int intValue = ((Number) yg20Var.b.invoke()).intValue();
                List<lj30> invoke = yg20Var.c.invoke(peer, gkx0Var, Direction.AFTER, 2);
                if (invoke.isEmpty()) {
                    lj30Var = null;
                } else {
                    lj30 lj30Var3 = (lj30) j5g.Y(invoke);
                    if (lj30Var3.h.equals(gkx0Var)) {
                        lj30Var = (lj30) j5g.b0(1, invoke);
                        lj30Var2 = lj30Var3;
                    } else {
                        lj30Var = (lj30) j5g.b0(0, invoke);
                    }
                }
                if (lj30Var2 == null ? !(lj30Var == null ? yg20Var.d(intValue, peer) : !lj30Var.i && lj30Var.l == intValue) : !(!lj30Var2.j && lj30Var2.l == intValue)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                azl azlVar = (azl) obj2;
                long q = kuo0.q((qw1) obj3);
                float I0 = azlVar.I0(rco.a(q));
                float I02 = azlVar.I0(rco.b(q));
                return Boolean.valueOf(((zhf0) ((wh50) obj).getValue()).a((Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L)));
            default:
                int i7 = VideoDialog.P0;
                ((VideoGrowthComponent) obj2).Z7().d(((h0w0) obj).d().f);
                ((VideoDialog) obj3).O0.b();
                return s3q0.a;
        }
    }
}
