package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import java.util.ArrayList;
import xsna.chs;
import xsna.ej90;
import xsna.gfp0;
import xsna.q630;
import xsna.xa60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class le0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ le0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                chs chsVar = (chs) this.c;
                gfp0.b.a aVar = (gfp0.b.a) this.d;
                izs izsVar = (izs) this.e;
                lg90 lg90Var = (lg90) this.f;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                float f = pe0.a;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2055324692, intValue, -1, "com.vk.music.stickyplayer.presentation.components.AdCover.<anonymous>.<anonymous>.<anonymous> (AdCover.kt:55)");
                    }
                    boolean z = chsVar instanceof chs.b;
                    q630.a aVar3 = q630.a.a;
                    if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                        aVar2.K(-1123983196);
                        nsa0.a(f, 54, aVar2, txj0.d(aVar3, 1.0f));
                        aVar2.j();
                    } else {
                        aVar2.K(-1123721308);
                        q630 d = rte0.d(txj0.d(aVar3, 1.0f), vog0.b(f));
                        float f2 = 1;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a = aqw.a(f2, ylu0Var.getImage().a);
                        q630 b = r18.b(a.a, a.b, d, vog0.b(f));
                        boolean z2 = aVar.c;
                        boolean J = aVar2.J(izsVar);
                        Object x = aVar2.x();
                        if (J || x == a.C0011a.a) {
                            x = new me0(izsVar, 0);
                            aVar2.R(x);
                        }
                        vjw.a(lg90Var, null, xa4.J(b, z2, (gzs) x), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar2, 56, 120);
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                xa60.a aVar4 = (xa60.a) this.c;
                ej90.b bVar = (ej90.b) this.d;
                ej90.c cVar = (ej90.c) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                Integer num = (Integer) obj;
                cbg cbgVar = (cbg) obj2;
                iag iagVar = cbgVar.a;
                NewsComment newsComment = iagVar instanceof NewsComment ? (NewsComment) iagVar : null;
                boolean z3 = false;
                if (newsComment != null) {
                    if (newsComment.i == aVar4.c && t960.b(newsComment, bVar, cVar)) {
                        z3 = true;
                    }
                    iag iagVar2 = cbgVar.b;
                    NewsComment newsComment2 = iagVar2 instanceof NewsComment ? (NewsComment) iagVar2 : null;
                    if (newsComment2 != null && newsComment2.i == aVar4.c && t960.b(newsComment2, bVar, cVar)) {
                        z3 = true;
                    }
                }
                if (z3) {
                    arrayList.add(num);
                }
                break;
            default:
                ((ewj0) this.c).v((ydl0) this.d, (String) ((uh0) this.e).b, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (BannerAdUiData) this.f);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ le0(t960 t960Var, xa60.a aVar, ej90.b bVar, ej90.c cVar, ArrayList arrayList) {
        this.b = 1;
        this.c = aVar;
        this.d = bVar;
        this.e = cVar;
        this.f = arrayList;
    }
}
