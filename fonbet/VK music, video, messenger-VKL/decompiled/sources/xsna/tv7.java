package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.irt0;
import xsna.wv7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class tv7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tv7(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj3;
                wow wowVar = new wow(list);
                int i2 = 3;
                ((nvy) obj).e(list.size(), new wv7.b(new fj1(i2), wowVar), new wv7.c(new vr0(i2), wowVar), new jai(802480018, new wv7.d(wowVar, (String) obj2, (izs) obj4), true));
                break;
            case 1:
                izs izsVar = (izs) obj4;
                l5c l5cVar = (l5c) obj2;
                k8s k8sVar = (k8s) obj;
                Iterator<T> it = ((x1x) obj3).d.iterator();
                while (it.hasNext()) {
                    k8sVar.a(new t5c((u1x) it.next(), izsVar, l5cVar));
                }
                break;
            case 2:
                break;
            case 3:
                Context context = (Context) obj3;
                String str = (String) obj2;
                yp80 yp80Var = (yp80) obj4;
                zal0 a = g2v.d().a();
                EmptyList emptyList = EmptyList.b;
                if (str == null) {
                    str = "link";
                }
                a.v(context, null, str, emptyList);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                break;
            case 4:
                VideoFile videoFile = (VideoFile) obj3;
                wzs wzsVar = (wzs) obj2;
                Context context2 = (Context) obj4;
                videoFile.Xa(true);
                if (wzsVar != null) {
                    wzsVar.invoke(videoFile, null);
                }
                VideoFileOld copy = videoFile.copy();
                copy.A0 = SystemClock.elapsedRealtime();
                wjs0.a(new fyr0(copy));
                wjs0.a(new cwr0(copy, null, 30));
                if (bps0.a != null) {
                    long j = videoFile.I0().b;
                    Integer valueOf = Integer.valueOf(videoFile.o0());
                    r2u0 r2u0Var = dst0.b;
                    qg90<UserId, Integer> qg90Var = new qg90<>(new UserId(j), valueOf);
                    r2u0Var.getClass();
                    bpn0 bpn0Var = irt0.d;
                    CachedVideoViewedSegments a2 = irt0.b.a().a(qg90Var);
                    if (a2 != null) {
                        a2.Xa(true);
                    }
                }
                cvk.w(context2.getString(R.string.video_added, videoFile.getTitle()), false);
                break;
            default:
                izs izsVar2 = (izs) obj4;
                wh50 wh50Var = (wh50) obj2;
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj3).setValue(tho0Var);
                String str2 = (String) wh50Var.getValue();
                us2 us2Var = tho0Var.a;
                boolean f = epx.f(str2, us2Var.c);
                String str3 = us2Var.c;
                wh50Var.setValue(str3);
                if (!f) {
                    izsVar2.invoke(str3);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ tv7(izs izsVar, wh50 wh50Var, wh50 wh50Var2) {
        this.b = 5;
        this.c = izsVar;
        this.d = wh50Var;
        this.e = wh50Var2;
    }

    public /* synthetic */ tv7(x1x x1xVar, izs izsVar, l5c l5cVar) {
        this.b = 1;
        this.d = x1xVar;
        this.c = izsVar;
        this.e = l5cVar;
    }
}
