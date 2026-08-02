package xsna;

import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.search.integration.followers.impl.presentation.SearchFollowersCatalogRootVh;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.stat.scheme.MobileOfficialAppsEcommStat$TypeBannerView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.subscription.api.SubscribeStatus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hfr;
import xsna.hzp0;
import xsna.itx;
import xsna.wdk0;

/* compiled from: ClipsDelegate.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class kpd extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpd(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2 = null;
        switch (this.b) {
            case 0:
                ((vkd) this.receiver).a((MobileOfficialAppsClipsStat$TypeClipDraft) obj);
                return s3q0.a;
            case 1:
                ((d3h) this.receiver).getClass();
                new hzp0.q(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), new MobileOfficialAppsEcommStat$TypeBannerView(MobileOfficialAppsEcommStat$TypeBannerView.Type.SHOW_BANNER, ((CatchUpBanner) obj).j)).a();
                return s3q0.a;
            case 2:
                com.vk.profile.community.impl.ui.profile.f.a((com.vk.profile.community.impl.ui.profile.f) this.receiver, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 3:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) this.receiver;
                qcy<Object>[] qcyVarArr = com.vk.im.ui.components.contacts.a.d0;
                aVar.g1((Throwable) obj);
                return s3q0.a;
            case 4:
                ((Boolean) obj).booleanValue();
                dfm dfmVar = ((afm) this.receiver).z;
                if (dfmVar != null) {
                    dfmVar.l();
                }
                return s3q0.a;
            case 5:
                hpm.i((hpm) this.receiver, (com.vk.im.engine.models.dialogs.b) obj);
                return s3q0.a;
            case 6:
                com.vk.photos.ui.editalbum.domain.c.U((com.vk.photos.ui.editalbum.domain.c) this.receiver, (Throwable) obj);
                return s3q0.a;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                u440 u440Var = (u440) this.receiver;
                u440Var.x0.put(fkq0.e(u440Var.k.e), bool);
                return s3q0.a;
            case 8:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 9:
                kym0 kym0Var = (kym0) obj;
                SearchFollowersCatalogRootVh searchFollowersCatalogRootVh = (SearchFollowersCatalogRootVh) this.receiver;
                hfr.a aVar2 = new hfr.a(rli0.j(new i5g(searchFollowersCatalogRootVh.v.mo78O0()), uza0.d));
                while (true) {
                    if (aVar2.hasNext()) {
                        Object next = aVar2.next();
                        if (epx.f(((UIBlockProfile) next).A.c, kym0Var.b)) {
                            obj2 = next;
                        }
                    }
                }
                UIBlockProfile uIBlockProfile = (UIBlockProfile) obj2;
                if (uIBlockProfile != null) {
                    SubscribeStatus.a aVar3 = SubscribeStatus.Companion;
                    SubscribeStatus subscribeStatus = kym0Var.a;
                    aVar3.getClass();
                    int d = SubscribeStatus.a.d(subscribeStatus);
                    int i = 2;
                    if (d == 2) {
                        i = 0;
                    } else if (d == 3) {
                        i = 1;
                    }
                    uIBlockProfile.E = i;
                    searchFollowersCatalogRootVh.m.b.e.b(new t8f0(new xx0(8), false), false);
                }
                return s3q0.a;
            default:
                wdk0 wdk0Var = (wdk0) obj;
                odk0 odk0Var = (odk0) this.receiver;
                odk0Var.getClass();
                if (wdk0Var instanceof wdk0.b) {
                    wdk0.b bVar = (wdk0.b) wdk0Var;
                    Iterator it = ((ArrayList) odk0Var.tn().y0()).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next2 = it.next();
                            itx itxVar = (itx) next2;
                            if ((itxVar instanceof itx.a) && epx.f(((itx.a) itxVar).a, bVar.a)) {
                                obj2 = next2;
                            }
                        }
                    }
                    itx itxVar2 = (itx) obj2;
                    if (itxVar2 != null) {
                        odk0Var.tn().F0(itxVar2, itxVar2);
                    }
                } else {
                    if (!(wdk0Var instanceof wdk0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h03.b(((wdk0.a) wdk0Var).a);
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpd(Object obj, int i) {
        super(1, obj, d3h.class, "handlePartnerBannerViewed", "handlePartnerBannerViewed(Lcom/vk/dto/profile/CatchUpBanner;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, com.vk.profile.community.impl.ui.profile.f.class, "updateLegoLiveCoverBottomNavigationVisibility", "updateLegoLiveCoverBottomNavigationVisibility(Z)V", 0);
                break;
            case 4:
                super(1, obj, afm.class, "onClearDialogSuccess", "onClearDialogSuccess(Z)V", 0);
                break;
            case 8:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
