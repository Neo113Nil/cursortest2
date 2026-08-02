package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.c;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraMode;
import com.vk.dto.user.UserProfile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Triple;
import xsna.gnd;
import xsna.q630;
import xsna.yqx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bc1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bc1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Triple triple;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.d((c.b) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                nk1.c((qow) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                gnd.a aVar = (gnd.a) obj4;
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1637486138, intValue, -1, "com.vk.clips.coauthors.selector.ui.ClipsCoauthorsSelectorContentView.ThemedContent.<anonymous>.<anonymous> (ClipsCoauthorsSelectorContentView.kt:69)");
                    }
                    qqz.f(aVar, izsVar, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj4;
                gsh gshVar = (gsh) obj3;
                dic0 dic0Var = (dic0) obj2;
                com.vk.storycamera.builder.a aVar3 = new com.vk.storycamera.builder.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, (MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint) obj);
                aVar3.E0 = true;
                if (dic0Var == null) {
                    UserProfile userProfile = extendedCommunityProfile.a;
                    triple = new Triple(userProfile.c, userProfile.e, userProfile.h);
                } else {
                    triple = new Triple(dic0Var.a, dic0Var.b, dic0Var.c);
                }
                aVar3.q((UserId) triple.d(), (String) triple.g(), (String) triple.h());
                if (!((zof) gshVar.c.C.getValue()).c()) {
                    aVar3.h = Collections.singletonList(StoryCameraMode.CLIPS);
                }
                aVar3.C(gshVar.b);
                g2h g2hVar = new g2h(bwd0.i(extendedCommunityProfile));
                g2hVar.b = "posting";
                g2hVar.d = "story";
                g2hVar.a();
                break;
            case 4:
                ((Integer) obj2).getClass();
                dou.a((umu) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ut00.b((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 6:
                nk40 nk40Var = (nk40) obj4;
                UIBlockList uIBlockList = (UIBlockList) obj;
                nk40Var.getClass();
                edi.y(uIBlockList, new com.vk.movika.sdk.base.ui.s0(19, (List) obj3, nk40Var), new gky(10));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((hrd0) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                kdh0 kdh0Var = (kdh0) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1755150180, intValue2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.screen.Root.<anonymous>.<anonymous> (Root.kt:59)");
                    }
                    p48 l = kdh0Var.l();
                    if (l != null) {
                        aVar4.K(747248900);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                        }
                        WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                        te2 te2Var = yqx0.a.c(aVar4).e;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        f48.a(l, izsVar2, tci.y(q630.a.a, te2Var), aVar4, 0);
                    } else {
                        aVar4.K(744666910);
                    }
                    aVar4.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bc1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
