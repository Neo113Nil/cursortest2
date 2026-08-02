package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.recomSettings.dto.RecomSettingsSubRecomThemeDto;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.sharing.api.dto.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.f9f0;
import xsna.h6x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ubj0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ubj0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.b) {
            case 0:
                f9f0.a aVar = (f9f0.a) obj;
                ProfilesSimpleInfo Ob = aVar.b.Ob();
                List<Dialog> list = aVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Dialog) obj2).Gb()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Dialog dialog = (Dialog) it.next();
                    arrayList2.add(new Target(dialog, Ob, c4g0.t(dialog.hc())));
                }
                return p4g.q(arrayList2);
            case 1:
                return s3q0.a;
            case 2:
                return Float.valueOf(((View) obj).getX());
            case 3:
                nov novVar = (nov) obj;
                if ((novVar instanceof grt0) && !((grt0) novVar).u) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                return (List) obj;
            case 5:
                qgo0 qgo0Var = (qgo0) obj;
                Integer c = qgo0Var.c();
                if (c == null) {
                    return null;
                }
                int intValue = c.intValue();
                long j = qgo0Var.f;
                int i = qko0.c;
                return new ivl(0, intValue - ((int) (j & 4294967295L)));
            case 6:
                return k9q0.s((RecomSettingsSubRecomThemeDto) obj);
            case 7:
                return new sq2(((pco) obj).b);
            case 8:
                q5j q5jVar = (q5j) obj;
                m6j m6jVar = q5jVar.d;
                s5j s5jVar = q5jVar.c;
                jor0.a(m6jVar, s5jVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jor0.a(q5jVar.f, s5jVar.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                jcv.b(q5jVar.e, s5jVar.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6);
                return s3q0.a;
            case 9:
                return String.valueOf(((jvu0) obj).a);
            case 10:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                VmojiPromoInSuggestsRepositoryImpl.b(false);
                return s3q0.a;
            case 11:
                return h6x0.c.a;
            default:
                return ((JSONObject) obj).getJSONObject("response");
        }
    }

    public /* synthetic */ ubj0(Object obj, int i) {
        this.b = i;
    }
}
