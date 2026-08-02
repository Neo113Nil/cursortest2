package xsna;

import android.net.Uri;
import com.ironsource.C4504q2;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.hints.HintCategories;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.voip.ui.actions.feature.VoipActionsFeatureState;
import java.util.List;
import xsna.b8q0;
import xsna.ij20;
import xsna.kx00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ept implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ept(int i) {
        this.b = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        int i = 9;
        boolean z = true;
        z = true;
        int i2 = 0;
        switch (this.b) {
            case 0:
                break;
            case 1:
                ((ij20.a) obj).l(true);
                break;
            case 2:
                HintCategories.Companion.getClass();
                list = HintCategories.DEFAULT$1;
                ho hoVar = new ho("account.getHelpHints", i2);
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    hoVar.G(HintCategories.PARAM_NAME, list);
                }
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                Object[] objArr = (Object[]) obj;
                VoipActionsFeatureState.s sVar = (VoipActionsFeatureState.s) objArr[0];
                VoipActionsFeatureState.v vVar = (VoipActionsFeatureState.v) objArr[1];
                VoipActionsFeatureState.r rVar = (VoipActionsFeatureState.r) objArr[2];
                VoipActionsFeatureState.e eVar = (VoipActionsFeatureState.e) objArr[3];
                VoipActionsFeatureState.w wVar = (VoipActionsFeatureState.w) objArr[4];
                VoipActionsFeatureState.k kVar = (VoipActionsFeatureState.k) objArr[5];
                VoipActionsFeatureState.b bVar = (VoipActionsFeatureState.b) objArr[6];
                VoipActionsFeatureState.n nVar = (VoipActionsFeatureState.n) objArr[7];
                VoipActionsFeatureState.o oVar = (VoipActionsFeatureState.o) objArr[8];
                VoipActionsFeatureState.m mVar = (VoipActionsFeatureState.m) objArr[9];
                VoipActionsFeatureState.l lVar = (VoipActionsFeatureState.l) objArr[10];
                VoipActionsFeatureState.UserType userType = (VoipActionsFeatureState.UserType) objArr[11];
                VoipActionsFeatureState.i iVar = (VoipActionsFeatureState.i) objArr[12];
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.s0.l.getClass();
                break;
            case 6:
                kx00.a aVar = (kx00.a) ((kx00) obj);
                boolean z2 = aVar.g;
                boolean z3 = aVar.f;
                break;
            case 7:
                break;
            case 8:
                b8q0.a aVar2 = (b8q0.a) obj;
                f620 f620Var = f620.b;
                String str = aVar2.a;
                switch (str.hashCode()) {
                    case -1854767153:
                        if (str.equals("support")) {
                            g620.z(aVar2.b);
                            break;
                        }
                        break;
                    case -1310683856:
                        if (str.equals("friends_recommendations")) {
                            g620.q(aVar2.b);
                            break;
                        }
                        break;
                    case -1237460524:
                        if (str.equals("groups")) {
                            g620.t(aVar2.b);
                            break;
                        }
                        break;
                    case -1176175449:
                        if (str.equals("menu_clips_badge")) {
                            g620.n(aVar2.b);
                            break;
                        }
                        break;
                    case -989034367:
                        if (str.equals("photos")) {
                            g620.x(aVar2.b);
                            break;
                        }
                        break;
                    case -985910611:
                        if (str.equals("menu_discover_badge")) {
                            g620.o(aVar2.b);
                            break;
                        }
                        break;
                    case -957166211:
                        if (str.equals("friends_unread_badge")) {
                            g620.s(aVar2.b);
                            break;
                        }
                        break;
                    case -816678056:
                        if (str.equals("videos")) {
                            g620.i = Math.max(0, Math.max(0, aVar2.b));
                            break;
                        }
                        break;
                    case -702298208:
                        if (str.equals("menu_superapp_friends_badge")) {
                            g620.y(aVar2.b);
                            break;
                        }
                        break;
                    case -688205752:
                        if (str.equals("market_orders")) {
                            g620.u(aVar2.b);
                            break;
                        }
                        break;
                    case -637054625:
                        if (str.equals("memories")) {
                            g620.v(aVar2.b);
                            break;
                        }
                        break;
                    case -600094315:
                        if (str.equals("friends")) {
                            g620.r(aVar2.b);
                            break;
                        }
                        break;
                    case -596382686:
                        if (str.equals("app_requests")) {
                            g620.m(aVar2.b);
                            break;
                        }
                        break;
                    case 94425557:
                        if (str.equals("calls")) {
                            f620.e(aVar2.b);
                            break;
                        }
                        break;
                    case 97205513:
                        if (str.equals("faves")) {
                            g620.p(aVar2.b);
                            break;
                        }
                        break;
                    case 98120385:
                        if (str.equals("games")) {
                            g620.l(aVar2.b);
                            break;
                        }
                        break;
                    case 112273875:
                        if (str.equals("vkpay")) {
                            g620.A(aVar2.b);
                            break;
                        }
                        break;
                    case 182085445:
                        if (str.equals("friends_suggestions")) {
                            Math.max(0, aVar2.b);
                            break;
                        }
                        break;
                    case 1174368524:
                        if (str.equals("notifications_clips")) {
                            g620.k(aVar2.b);
                            break;
                        }
                        break;
                    case 1191820900:
                        if (str.equals("notifications_video")) {
                            g620.B(aVar2.b);
                            break;
                        }
                        break;
                    case 1272354024:
                        if (str.equals(C4504q2.x)) {
                            g620.w(aVar2.b);
                            break;
                        }
                        break;
                }
                hf8.b("com.vkontakte.android.COUNTERS_UPDATED");
                break;
            case 9:
                break;
            case 10:
                ((vak0) co20.p).g(((Float) obj).floatValue());
                break;
            case 11:
                Throwable th = (Throwable) obj;
                if (!sv1.t(th)) {
                    com.vk.metrics.eventtracking.b.a.q(th);
                }
                break;
            case 12:
                qgi0.r((tgi0) obj, "MusicPickerPlaylistTitle");
                break;
            case 13:
                ((Integer) obj).intValue();
                break;
            case 14:
                bn40.c((Throwable) obj, new Object[0]);
                break;
            case 15:
                break;
            case 16:
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                Integer num = (Integer) obj;
                if (num == null || num.intValue() != 1) {
                    break;
                } else {
                    break;
                }
            case 20:
                break;
            case 21:
                Uri uri = (Uri) obj;
                if (!epx.f(uri.getScheme(), "http") && !epx.f(uri.getScheme(), HttpRequest.DEFAULT_SCHEME)) {
                    z = false;
                }
                break;
            case 22:
                qgi0.r((tgi0) obj, "product_card_restriction_info_block_title");
                break;
            case 23:
                break;
            case 24:
                ((Integer) obj).intValue();
                break;
            case 25:
                break;
            case 26:
                int i3 = SearchDocumentsListFragment.h0;
                break;
            case 27:
                break;
            case 28:
                L.i((Throwable) obj);
                break;
            default:
                qgi0.r((tgi0) obj, "upload_cell_right_switch");
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ept(Object obj, int i) {
        this.b = i;
    }
}
