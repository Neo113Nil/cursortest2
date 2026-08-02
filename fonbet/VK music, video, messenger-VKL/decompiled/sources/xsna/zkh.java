package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGetFriendsInvitationListResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.editor.filters.correction.model.FilterType;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.bfz;
import xsna.bmt;
import xsna.dmt;
import xsna.f6u;
import xsna.j0j;
import xsna.nls;
import xsna.uhu;
import xsna.uns;
import xsna.ykh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class zkh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zkh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        int i = 3;
        int i2 = 2;
        switch (this.b) {
            case 0:
                ykh.b bVar = (ykh.b) this.c;
                bVar.n.invoke(((f5u) bVar.m).b);
                return s3q0.a;
            case 1:
                fyh fyhVar = (fyh) this.c;
                return new r3j((ViewGroup) obj, cn70.b(16), new z0h(fyhVar, i2), new drg(fyhVar, i));
            case 2:
                VkTopBar vkTopBar = (VkTopBar) this.c;
                qgi0.r((tgi0) obj, "CommunityScheduledClipsGridViewToolbarTitle");
                vkTopBar.setContentDescription(vkTopBar.getContext().getString(R.string.community_scheduled_clips_grid_title));
                return s3q0.a;
            case 3:
                ((s0j) this.c).C(new j0j.j((SessionRoomId) obj));
                return s3q0.a;
            case 4:
                return (Map) ((FunctionReferenceImpl) this.c).invoke(j5g.O0((Collection) obj));
            case 5:
                scl sclVar = (scl) this.c;
                sclVar.f = 0;
                sclVar.i.r(true);
                return s3q0.a;
            case 6:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.c).e;
                if (efmVar != null) {
                    efmVar.z();
                }
                return s3q0.a;
            case 7:
                ghm ghmVar = (ghm) this.c;
                hpm e = ((xgl0) obj).b().e();
                long j = ghmVar.c;
                com.vk.im.engine.models.dialogs.b c = e.c(j);
                if ((c != null ? c.z : null) == null) {
                    return s3q0.a;
                }
                if (ghmVar.e) {
                    e.W(-1, j);
                }
                e.f0(j, Collections.singletonList(ghmVar.d));
                return s3q0.a;
            case 8:
                Collection<com.vk.im.engine.models.dialogs.b> collection = (Collection) this.c;
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement("\n            UPDATE dialogs SET\n                msg_request_status = ?,\n                msg_request_status_pending = ?,\n                msg_request_status_desired = ?,\n                write_permission = ?,\n                write_restricted_till = ?\n                WHERE id = ?\n                ");
                try {
                    for (com.vk.im.engine.models.dialogs.b bVar2 : collection) {
                        MsgRequestStatus msgRequestStatus = bVar2.I;
                        WritePermission writePermission = bVar2.q;
                        int j2 = msgRequestStatus != null ? msgRequestStatus.j() : bVar2.F.j();
                        compileStatement.bindLong(1, r8.j());
                        MsgRequestStatus msgRequestStatus2 = bVar2.I;
                        rdi.k(compileStatement, 2, msgRequestStatus2 != null ? Integer.valueOf(msgRequestStatus2.j()) : null);
                        compileStatement.bindLong(3, j2);
                        compileStatement.bindLong(4, writePermission.a.i());
                        compileStatement.bindLong(5, writePermission.b);
                        compileStatement.bindLong(6, bVar2.b);
                        compileStatement.executeUpdateDelete();
                    }
                    s3q0 s3q0Var = s3q0.a;
                    compileStatement.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(compileStatement, th);
                        throw th2;
                    }
                }
            case 9:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                ((SwipeDrawableRefreshLayout) this.c).setProgressDrawableFactory((d2e0) obj);
                return s3q0.a;
            case 10:
                return u1o.a((u1o) this.c, (VkImage) obj);
            case 11:
                View view = (View) this.c;
                if (!((Boolean) obj).booleanValue()) {
                    view.performClick();
                }
                return s3q0.a;
            case 12:
                c9q c9qVar = (c9q) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) c9qVar.d).setValue(bool);
                return s3q0.a;
            case 13:
                y7z y7zVar = (y7z) this.c;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                oio.x1(ggjVar, y7zVar, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 8, 62);
                return s3q0.a;
            case 14:
                FilterType filterType = (FilterType) this.c;
                int i3 = FiltersRecyclerView.j;
                return Boolean.valueOf(((tcr) obj).a == filterType);
            case 15:
                b1s b1sVar = (b1s) this.c;
                sxp sxpVar = (sxp) obj;
                b1sVar.getClass();
                if (sxpVar instanceof p680) {
                    if (((p680) sxpVar).c) {
                        b1sVar.d(l580.b);
                    }
                } else if (sxpVar instanceof a1s) {
                    b1sVar.d((a1s) sxpVar);
                }
                return s3q0.a;
            case 16:
                ((gls) this.c).j.b(new nls.a((Throwable) obj));
                return s3q0.a;
            case 17:
                ((xms) this.c).j.b(uns.a.c.a);
                return s3q0.a;
            case 18:
                bmt bmtVar = (bmt) this.c;
                bmt.a aVar = (bmt.a) obj;
                GeoLocation geoLocation = aVar.a.c;
                if (geoLocation == null || (str = geoLocation.i) == null) {
                    str = bmtVar.f.a;
                }
                bmtVar.e(new dmt.a(str, geoLocation != null ? geoLocation.n : null));
                return aVar;
            case 19:
                ((k6u) this.c).k.b(new f6u.b((Throwable) obj));
                return s3q0.a;
            case 20:
                return ((GridListVh) this.c).i.c(((Integer) obj).intValue());
            case 21:
                uhu.a aVar2 = ((aiu) this.c).q;
                if (aVar2 != null) {
                    uhu uhuVar = aVar2.a;
                    uhuVar.Z0();
                    tax.f(uhuVar.i, uhuVar.k);
                }
                return s3q0.a;
            case 22:
                Photo photo = (Photo) this.c;
                Photo photo2 = (Photo) obj;
                return Boolean.valueOf(epx.f(photo2.e, photo.e) && photo2.c == photo.c);
            case 23:
                m5v m5vVar = (m5v) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "title");
                qgi0.h(tgi0Var, m5vVar.q6().d);
                return s3q0.a;
            case 24:
                ((Cnew) this.c).invoke();
                return s3q0.a;
            case 25:
                khx khxVar = (khx) this.c;
                tny tnyVar = (tny) obj;
                if (tnyVar.e()) {
                    ((vak0) khxVar.b).g(Float.intBitsToFloat((int) (tnyVar.k(0L) >> 32)));
                }
                ((wak0) khxVar.a).C((int) (tnyVar.a() >> 32));
                return s3q0.a;
            case 26:
                ((cq3) this.c).invoke((GroupsGetFriendsInvitationListResponseDto) obj);
                return s3q0.a;
            case 27:
                dfz dfzVar = (dfz) this.c;
                bfz.a aVar3 = (bfz.a) obj;
                if (epx.f(aVar3, bfz.a.b.a)) {
                    return Optional.of(aVar3);
                }
                if (!(aVar3 instanceof bfz.a.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                bfz.a aVar4 = dfzVar.c;
                bfz.a.h hVar = (bfz.a.h) aVar3;
                return aVar4 instanceof bfz.a.h ? hVar.a >= ((bfz.a.h) aVar4).a ? Optional.of(hVar) : Optional.empty() : Optional.of(hVar);
            case 28:
                a500 a500Var = (a500) this.c;
                a400 a400Var = (a400) obj;
                a500Var.y = 0;
                a500Var.x = a400Var;
                a500Var.e.b(a400Var.a());
                a500Var.l(ImBgSyncState.CONNECTED);
                StringBuilder sb = new StringBuilder("Stop Sse pts = ");
                a400 a400Var2 = a500Var.x;
                sb.append(a500.e(a400Var2 != null ? a400Var2 : null));
                sb.append(" time= ");
                sb.append(System.currentTimeMillis());
                a500Var.c(sb.toString());
                return s3q0.a;
            default:
                int i4 = MarketItemReviewsFragment.w0;
                ((MarketItemReviewsFragment) this.c).fo((k7p0) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zkh(izs izsVar) {
        this.b = 4;
        this.c = (FunctionReferenceImpl) izsVar;
    }
}
