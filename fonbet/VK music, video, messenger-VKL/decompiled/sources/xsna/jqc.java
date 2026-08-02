package xsna;

import android.app.Activity;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.dto.masks.Mask;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ite;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jqc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jqc(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Activity activity = (Activity) this.c;
                Mask mask = (Mask) this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                e520 e520Var = (e520) obj2;
                if (e520Var.equals(nqc.b)) {
                    g620.f().i(activity, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS), MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_MASK, mask, (r23 & 16) != 0 ? null : null, null, null, (r23 & 128) != 0 ? null : null, (r23 & 256) != 0 ? 0 : 0, (r23 & 512) != 0 ? null : null);
                } else if (e520Var.equals(nqc.a)) {
                    ClipsRouter.j(g620.f().a(), activity, new ClipGridParams.Data.CameraMask(mask, 0L), false, null, null, 60);
                }
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((wse) this.c).g((ite.a.C3080a) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((yed0) this.c).m((lfd0) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bjd0.b((String) this.c, (String) this.d, (gzs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                xmd0.a((fnd0) this.c, (ml1) this.d, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jqc(Activity activity, Mask mask, Ref$ObjectRef ref$ObjectRef) {
        this.b = 0;
        this.c = activity;
        this.d = mask;
        this.e = ref$ObjectRef;
    }
}
