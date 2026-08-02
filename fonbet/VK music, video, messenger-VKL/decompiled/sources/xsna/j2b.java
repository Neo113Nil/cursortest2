package xsna;

import com.vk.channelrestrictions.WarningReason;
import com.vk.dto.common.id.UserId;
import com.vk.video.profile.analytics.ContentWarningModalClick;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import java.util.LinkedHashMap;
import xsna.k2b;
import xsna.pwh;
import xsna.w1g0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j2b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j2b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return (k2b.a) ((l7r0) obj3).d((ij20) obj2, (k2b.b) obj);
            case 1:
                ((tyf) obj3).a.a(new r4d((UserId) obj2, new mre((e5) obj, 3)));
                return s3q0.a;
            case 2:
                jwh jwhVar = (jwh) obj3;
                vwh vwhVar = (vwh) obj2;
                int i2 = ((w1g0.n.b) ((w1g0.n) obj)).b;
                k4g0 k4g0Var = vwhVar.i.get(Integer.valueOf(i2));
                if (k4g0Var != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(vwhVar.i);
                    linkedHashMap.put(Integer.valueOf(i2), k4g0.a(k4g0Var, false, false, 3967));
                    jwhVar.T(new pwh.l(linkedHashMap));
                }
                return s3q0.a;
            case 3:
                mo60 mo60Var = (mo60) obj3;
                bq60 bq60Var = (bq60) obj;
                ?? r9 = mo60Var.i;
                return new wo60((fo60) obj2, bq60Var, (la60) mo60Var.Q.getValue(), mo60Var.m, r9, new bpn0(new cvs(mo60Var, 27)));
            default:
                int i3 = VideoProfileFragmentOld.p0;
                m7t0.a((WarningReason) obj3, ((UserId) obj2).b, ContentWarningModalClick.Leave);
                ((VideoProfileFragmentOld) obj).finish();
                return s3q0.a;
        }
    }

    public /* synthetic */ j2b(m7t0 m7t0Var, WarningReason warningReason, UserId userId, VideoProfileFragmentOld videoProfileFragmentOld) {
        this.b = 4;
        this.c = warningReason;
        this.d = userId;
        this.e = videoProfileFragmentOld;
    }
}
