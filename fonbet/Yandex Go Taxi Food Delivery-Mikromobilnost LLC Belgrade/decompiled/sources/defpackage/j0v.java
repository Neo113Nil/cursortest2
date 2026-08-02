package defpackage;

import android.graphics.Path;
import androidx.compose.ui.layout.o;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.c;
import com.ybsdk.feature.stories.internal.screens.verticalstories.b;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes3.dex */
public final /* synthetic */ class j0v implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ j0v(int i, int i2, yur yurVar) {
        this.a = 0;
        this.b = i;
        this.c = i2;
        this.w = yurVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 initSmsChallenger$lambda$2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.w;
        switch (i) {
            case 0:
                yur yurVar = (yur) obj2;
                rur rurVar = (rur) obj;
                if (i3 == i2 - 1) {
                    rurVar.f(yurVar);
                    rurVar.d(yurVar);
                }
                return zy11Var;
            case 1:
                jb2 jb2Var = (jb2) obj2;
                cc90 cc90Var = (cc90) obj;
                gb2 gb2Var = cc90Var.a;
                int d = cc90Var.d(i3);
                int d2 = cc90Var.d(i2);
                CharSequence charSequence = gb2Var.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    StringBuilder s = b64.s(d, d2, "start(", ") or end(", ") is out of range [0..");
                    s.append(charSequence.length());
                    s.append("], or start > end!");
                    jxv.a(s.toString());
                }
                Path path = new Path();
                zqy0 zqy0Var = gb2Var.d;
                zqy0Var.f.getSelectionPath(d, d2, path);
                int i4 = zqy0Var.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                jb2 jb2Var2 = new jb2(path);
                jb2Var2.r((_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(cc90Var.f)) | (Float.floatToRawIntBits(0.0f) << 32));
                jb2Var.d(jb2Var2);
                return zy11Var;
            case 2:
                c cVar = (c) obj2;
                fbm0 fbm0Var = (fbm0) obj;
                lam0 lam0Var = fbm0Var.d;
                if (lam0Var == null) {
                    c.l0(cVar, "Hasn`t state, but shelf position changed", null);
                    return fbm0Var;
                }
                ArrayList arrayList = new ArrayList(lam0Var.e);
                Collections.swap(arrayList, i3, i2);
                kam0 kam0Var = (kam0) a.S(i2, arrayList);
                cVar.L = new qbm0(i3, i2, kam0Var != null ? kam0Var.a : null);
                return fbm0.a(fbm0Var, null, lam0.a(lam0Var, arrayList), null, 23);
            case 3:
                initSmsChallenger$lambda$2 = SbpChallengerFragment.initSmsChallenger$lambda$2((SbpChallengerFragment) obj2, i3, i2, (tfm0) obj);
                return initSmsChallenger$lambda$2;
            case 4:
                o.a aVar = (o.a) obj;
                for (o oVar : (ArrayList) obj2) {
                    o.a.o(aVar, oVar, (i3 - oVar.a) / 2, i2 - oVar.b);
                }
                return zy11Var;
            case 5:
                long j = ((z5w) ((ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_entry_point.slime.c) obj2).g.getValue()).a;
                return new z5w((i3 << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & i2));
            default:
                return b.a((b) obj, null, this.b, this.c, ((b) ((com.ybsdk.feature.stories.internal.screens.verticalstories.c) obj2).X()).b, 0, null, 49);
        }
    }

    public /* synthetic */ j0v(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.w = obj;
        this.b = i;
        this.c = i2;
    }
}
