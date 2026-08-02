package xsna;

import android.view.View;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class rz7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rz7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                vz7.c((o.a) this.c, this.d, (yw90) this.e, (View) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, I);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.community.design.compose.onboarding.a.b((mzg) this.c, (zzg) this.d, (gzs) this.e, (gzs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                lrq0 lrq0Var = (lrq0) this.c;
                lg90 lg90Var = (lg90) this.d;
                String str = (String) this.e;
                gzs gzsVar = (gzs) this.f;
                q630 q630Var = (q630) this.g;
                ((Integer) obj2).getClass();
                lrq0Var.f(ne7.I(24585), (androidx.compose.runtime.a) obj, str, gzsVar, q630Var, lg90Var);
                break;
            default:
                izs izsVar = (izs) this.g;
                gzs gzsVar2 = (gzs) this.c;
                kzv0 kzv0Var = (kzv0) this.d;
                UserId userId = (UserId) this.e;
                VideoFile videoFile = (VideoFile) this.f;
                Throwable th = (Throwable) obj2;
                if (th == null) {
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                    bti btiVar = kzv0Var.e;
                    btiVar.getClass();
                    if (!fkq0.c(userId)) {
                        userId = o25.a().c();
                    }
                    boolean f = epx.f(videoFile.I0(), userId);
                    if (videoFile.t0() && f) {
                        ((HashSet) btiVar.a).add(Integer.valueOf(videoFile.o0()));
                    }
                } else if (izsVar != null) {
                    izsVar.invoke(th);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rz7(izs izsVar, gzs gzsVar, kzv0 kzv0Var, UserId userId, VideoFile videoFile) {
        this.b = 3;
        this.g = izsVar;
        this.c = gzsVar;
        this.d = kzv0Var;
        this.e = userId;
        this.f = videoFile;
    }
}
