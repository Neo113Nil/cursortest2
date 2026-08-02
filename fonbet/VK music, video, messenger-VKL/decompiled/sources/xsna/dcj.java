package xsna;

import android.app.PictureInPictureParams;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.log.L;
import com.vk.voip.VoipCallActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.tja0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dcj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dcj(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        boolean z = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) obj;
                jgq jgqVar = bVar.d().k;
                if (z && bVar.s > 0) {
                    r1 = true;
                }
                jgqVar.getClass();
                bVar.o.onNext(gdj.a(bVar.d(), null, null, null, null, null, false, new jgq(z, r1), IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
                bVar.r = z ? new ArrayList(bVar.d().a) : EmptyList.b;
                io.reactivex.rxjava3.subjects.d<s3q0> dVar = bVar.q;
                s3q0 s3q0Var = s3q0.a;
                dVar.onNext(s3q0Var);
                break;
            case 1:
                rah0 rah0Var = (rah0) obj;
                if (!rah0Var.b()) {
                    if (!rah0Var.a()) {
                        L.G("ScreenCaptureManagerImpl", "Screen capture start is called when screen capture is not available");
                        break;
                    } else {
                        sd1 sd1Var = new sd1(rah0Var, z, 2);
                        Intent intent = rah0Var.i;
                        if (intent == null || t5m.b() || Build.VERSION.SDK_INT >= 34) {
                            rah0Var.h.dispose();
                            io.reactivex.rxjava3.subjects.d<it80<Intent>> dVar2 = rah0Var.g;
                            dVar2.getClass();
                            rah0Var.h = io.reactivex.rxjava3.kotlin.c.f(2, new io.reactivex.rxjava3.internal.operators.observable.j2(dVar2).t0(1L), null, new p99(L.a, 11), new mga0(rah0Var, sd1Var));
                            rah0Var.e.onNext(s3q0.a);
                        } else {
                            com.vk.voip.ui.c.b.getClass();
                            com.vk.voip.ui.c.D0();
                            sd1Var.invoke(intent);
                        }
                        break;
                    }
                } else {
                    break;
                }
                break;
            default:
                VoipCallActivity.c cVar = ((VoipCallActivity) obj).G;
                VoipCallActivity.c cVar2 = cVar != null ? cVar : null;
                if (!cVar2.h) {
                    cVar2.b.r(cVar2.c());
                    if (z) {
                        tja0.e eVar = cVar2.k;
                        if (eVar != null) {
                            VoipCallActivity voipCallActivity = cVar2.a;
                            bpn0 bpn0Var = t5m.a;
                            String str = Build.MANUFACTURER;
                            r1 = "OnePlus".equalsIgnoreCase(str) || "huawei".equalsIgnoreCase(str) || t5m.a(voipCallActivity);
                            if (cVar2.d() && r1 && !cVar2.i) {
                                ou3 ou3Var = eVar.b;
                                List<tja0.a> list = eVar.c;
                                View view = eVar.a;
                                int i2 = ou3Var.a;
                                int i3 = ou3Var.b;
                                ou3 ou3Var2 = i2 > i3 ? new ou3((i2 * 100) - 1, i3 * 100) : new ou3(i2 * 100, (i3 * 100) - 1);
                                PictureInPictureParams b = cVar2.b(view, ou3Var, list);
                                voipCallActivity.setPictureInPictureParams(cVar2.b(view, ou3Var2, list));
                                voipCallActivity.setPictureInPictureParams(b);
                                cVar2.i = true;
                            }
                            cVar2.a(eVar.e, true, true);
                            eVar.g.invoke();
                        }
                    } else {
                        VoipCallActivity voipCallActivity2 = VoipCallActivity.this;
                        int i4 = VoipCallActivity.P;
                        voipCallActivity2.Z1();
                        voipCallActivity2.V1();
                        cVar2.a(0, false, false);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
