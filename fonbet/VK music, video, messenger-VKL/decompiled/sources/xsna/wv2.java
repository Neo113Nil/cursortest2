package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.database.dto.DatabaseGetUniversitiesResponseDto;
import com.vk.api.generated.database.dto.DatabaseUniversityDto;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentEntry;
import com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.LinkVKBidFragment;
import com.vk.log.L;
import com.vk.newsfeed.common.util.k;
import com.vk.push.common.Logger;
import com.vk.push.pushsdk.VkpnsPushConfig;
import com.vk.search.params.api.domain.model.education.University;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ew2;
import xsna.xn50;

/* compiled from: AntispamBottomSheet.kt */
/* loaded from: classes14.dex */
public final /* synthetic */ class wv2 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wv2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String string;
        yok0 yok0Var;
        int i = 0;
        switch (this.b) {
            case 0:
                ew2 ew2Var = (ew2) obj;
                vv2 vv2Var = (vv2) this.receiver;
                int i2 = vv2.j1;
                vv2Var.getClass();
                if (epx.f(ew2Var, ew2.a.a)) {
                    vv2Var.hide();
                } else {
                    if (!(ew2Var instanceof ew2.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Bundle arguments = vv2Var.getArguments();
                    string = arguments != null ? arguments.getString("spam_actions_request_key") : null;
                    if (string != null) {
                        FragmentManager parentFragmentManager = vv2Var.getParentFragmentManager();
                        Bundle a = yfb.a();
                        a.putParcelableArrayList("selected_actions", p4g.q(((ew2.b) ew2Var).a));
                        s3q0 s3q0Var = s3q0.a;
                        parentFragmentManager.k0(a, string);
                    }
                    vv2Var.hide();
                }
                return s3q0.a;
            case 1:
                gh8 gh8Var = (gh8) obj;
                eh8 eh8Var = (eh8) this.receiver;
                synchronized (eh8Var) {
                    if (eh8Var.d) {
                        eh8Var.c.b(gh8Var);
                    }
                }
                return s3q0.a;
            case 2:
                ((neh) this.receiver).getClass();
                return neh.c((List) obj);
            case 3:
                Throwable th = (Throwable) obj;
                xam xamVar = (xam) this.receiver;
                f9w f9wVar = xam.y;
                xamVar.getClass();
                xam.y.a(th);
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    zamVar.b();
                }
                if (xamVar.u != null) {
                    zk70.e(th);
                }
                return s3q0.a;
            case 4:
                Throwable th2 = (Throwable) obj;
                mem memVar = (mem) this.receiver;
                memVar.b1();
                if (memVar.s != null) {
                    zk70.e(th2);
                }
                return s3q0.a;
            case 5:
                u1c0 u1c0Var = (u1c0) obj;
                mqp mqpVar = (mqp) this.receiver;
                Object obj2 = mqp.S;
                if (!mqpVar.j() || mqpVar.G) {
                    String str = com.vk.newsfeed.common.util.k.a;
                    kqp kqpVar = new kqp(mqpVar, i);
                    k.a a2 = k.b.a(u1c0Var);
                    if (a2 != null) {
                        com.vk.newsfeed.common.util.k.o(a2, kqpVar);
                    }
                } else {
                    FragmentEntry Kn = mqpVar.d.Kn();
                    string = Kn != null ? Kn.d : null;
                    if (string != null) {
                        String str2 = com.vk.newsfeed.common.util.k.a;
                        com.vk.newsfeed.common.util.k.a(string, u1c0Var);
                    }
                }
                return s3q0.a;
            case 6:
                kbz kbzVar = (kbz) obj;
                LinkVKBidFragment linkVKBidFragment = (LinkVKBidFragment) this.receiver;
                qcy<Object>[] qcyVarArr = LinkVKBidFragment.S;
                if (kbzVar instanceof ibz) {
                    linkVKBidFragment.kn().onBackPressed();
                } else {
                    if (!(kbzVar instanceof jbz)) {
                        linkVKBidFragment.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    maz.c((maz) linkVKBidFragment.R.getValue(), linkVKBidFragment.requireContext(), ((jbz) kbzVar).a, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 7:
                ((bo90) this.receiver).T((no90) obj);
                return s3q0.a;
            case 8:
                cs90.f((cs90) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 9:
                Throwable th3 = (Throwable) obj;
                oug0 oug0Var = (oug0) this.receiver;
                oug0 oug0Var2 = oug0.a;
                oug0Var.getClass();
                if (!sv1.t(th3)) {
                    o2l.a.getClass();
                    if (o2l.b("__dbg_rx_crash", false)) {
                        com.vk.metrics.eventtracking.b.a.q(th3);
                    } else {
                        com.vk.metrics.eventtracking.b.a.a(th3);
                    }
                }
                return s3q0.a;
            case 10:
                ecp0 ecp0Var = (ecp0) this.receiver;
                qcy<Object>[] qcyVarArr2 = ecp0.y;
                ecp0Var.g(null, null, (Throwable) obj);
                return s3q0.a;
            case 11:
                DatabaseGetUniversitiesResponseDto databaseGetUniversitiesResponseDto = (DatabaseGetUniversitiesResponseDto) obj;
                ((h4q0) this.receiver).getClass();
                int count = databaseGetUniversitiesResponseDto.getCount();
                List<DatabaseUniversityDto> d = databaseGetUniversitiesResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (DatabaseUniversityDto databaseUniversityDto : d) {
                    Integer d2 = databaseUniversityDto.d();
                    int intValue = d2 != null ? d2.intValue() : -1;
                    String title = databaseUniversityDto.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    arrayList.add(new University(drm0.p0(title).toString(), intValue));
                }
                return new jwk(count, arrayList);
            case 12:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) this.receiver;
                videoRelatedVideosFragment.getClass();
                xn50.a.c(videoRelatedVideosFragment, (com.vk.video.ui.discovery.minimizable.dialog.related_videos.b) obj);
                return s3q0.a;
            case 13:
                spj<? super s3q0> spjVar = (spj) obj;
                e5w0 e5w0Var = (e5w0) this.receiver;
                Logger.DefaultImpls.info$default(e5w0Var.a, "on start push service", null, 2, null);
                nhe0 nhe0Var = (nhe0) e5w0Var.h.getValue();
                if (nhe0Var.r == null || ((yok0Var = nhe0Var.r) != null && !yok0Var.isActive())) {
                    Logger.DefaultImpls.info$default(nhe0Var.o, "start deliver", null, 2, null);
                    nhe0Var.r = myc0.h(nhe0Var.b, null, null, new khe0(nhe0Var, null), 3);
                }
                ((pqk0) e5w0Var.j.getValue()).b();
                w5h0 w5h0Var = (w5h0) e5w0Var.r.getValue();
                VkpnsPushConfig vkpnsPushConfig = qxi.b;
                if (vkpnsPushConfig == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                VkpnsPushConfig.BackgroundWorkMode backgroundWorkMode = vkpnsPushConfig.f;
                VkpnsPushConfig vkpnsPushConfig2 = qxi.b;
                if (vkpnsPushConfig2 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Object a3 = w5h0Var.a(backgroundWorkMode, vkpnsPushConfig2.g, spjVar);
                return a3 == CoroutineSingletons.COROUTINE_SUSPENDED ? a3 : s3q0.a;
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv2(Object obj, int i) {
        super(1, obj, neh.class, "mapPhotosToHeaderUrls", "mapPhotosToHeaderUrls(Ljava/util/List;)Ljava/util/List;", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, xam.class, "onInvokeCallbackError", "onInvokeCallbackError(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
                super(1, obj, mem.class, "onUpdateAllByCacheError", "onUpdateAllByCacheError(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
            case 6:
            case 7:
            case 13:
            default:
                break;
            case 8:
                super(1, obj, cs90.class, "handleCheckTransactionStatusFailed", "handleCheckTransactionStatusFailed(Ljava/lang/Throwable;)V", 0);
                break;
            case 9:
                super(1, obj, oug0.class, "logOrFailForDebug", "logOrFailForDebug(Ljava/lang/Throwable;)V", 0);
                break;
            case 10:
                super(1, obj, ecp0.class, "handleSubscriptionFailure", "handleSubscriptionFailure(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, h4q0.class, "mapResponseToItems", "mapResponseToItems(Lcom/vk/api/generated/database/dto/DatabaseGetUniversitiesResponseDto;)Lcom/vk/search/params/impl/domain/model/database/DatabaseItems;", 0);
                break;
            case 12:
                super(1, obj, VideoRelatedVideosFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                break;
            case 14:
                super(1, obj, L.class, ru.ok.android.utils.Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv2(e5w0 e5w0Var) {
        super(1, e5w0Var, e5w0.class, "onStartPushService", "onStartPushService(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.b = 13;
    }
}
