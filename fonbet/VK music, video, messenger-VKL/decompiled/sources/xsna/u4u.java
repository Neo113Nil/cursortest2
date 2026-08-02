package xsna;

import android.app.Application;
import android.telephony.TelephonyManager;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetPaymentLinkResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetSettingsResponseDto;
import com.vk.api.generated.stickers.dto.StickersSettingsDto;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.b;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.msg_search.domain.model.a;
import com.vk.profile.community.members.impl.domain.User;
import com.vk.video.polls.ui.questions.open.PollOpenView;
import java.util.List;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import xsna.bfx;
import xsna.cdu;
import xsna.ij20;
import xsna.qrx;
import xsna.tj50;
import xsna.v7h0;
import xsna.v9i0;
import xsna.ycu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class u4u implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ u4u(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                return Boolean.valueOf(((b.C0946b) ((com.vk.ecomm.market.good.b) obj)).a);
            case 1:
                cdu cduVar = (cdu) obj;
                cdu.a aVar = cduVar.d;
                cdu.a aVar2 = cduVar.f;
                rho rhoVar = cduVar.e;
                return new ycu.b(new ycu.a(aVar, aVar2, rhoVar.b), rhoVar);
            case 2:
                return Boolean.valueOf(((it80) obj).a());
            case 3:
                Pair pair = (Pair) obj;
                return new k7w((m5w) pair.i(), (ProfilesInfo) pair.j());
            case 4:
                sxp sxpVar = (sxp) obj;
                return Boolean.valueOf((sxpVar instanceof usl0) || (sxpVar instanceof yb80));
            case 5:
                VideoLargeListState videoLargeListState = (VideoLargeListState) obj;
                return VideoLargeListState.a(videoLargeListState, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, videoLargeListState.A + 1, 33554431);
            case 6:
                return new bfx.a.C2607a((Throwable) obj);
            case 7:
                tj50.a aVar3 = (tj50.a) obj;
                pe1 pe1Var = new pe1(29);
                ao8 ao8Var = ao8.d;
                return new qrx.b(aVar3.a(pe1Var, ao8Var), aVar3.a(new h2w(i), ao8Var), aVar3.a(new nj(26), ao8Var), aVar3.a(new viu(3), ao8Var), aVar3.a(new per(6), ao8Var), aVar3.a(new kpr(2), ao8Var));
            case 8:
                return s3q0.a;
            case 9:
                return CatalogSectionState.a((CatalogSectionState) obj, null, false, false, null, null, false, null, null, null, null, 8159);
            case 10:
                return ((User) obj).b;
            case 11:
                ((ij20.a) obj).l(true);
                return s3q0.a;
            case 12:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) vn20.k).setValue(bool);
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 14:
                return ((a.b.C1153a) obj).a.a;
            case 15:
                return t850.a((u850) obj);
            case 16:
                qgi0.r((tgi0) obj, "AudioTrackSelection");
                return s3q0.a;
            case 17:
                List list = (List) obj;
                return new jks(null, list, true ^ list.isEmpty());
            case 18:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 19:
                return s3q0.a;
            case 20:
                return ((CommunitySubscriptionsGetPaymentLinkResponseDto) obj).d();
            case 21:
                qgi0.r((tgi0) obj, "MusicPickerPlaylistsEntryPointImage");
                return s3q0.a;
            case 22:
                qgi0.r((tgi0) obj, "PostingSettingsRemovePollDialogCancelButton");
                return s3q0.a;
            case 23:
                int i2 = PollOpenView.e;
                return ((pno0) obj).d().toString();
            case 24:
                StickersSettingsDto d = ((StickersGetSettingsResponseDto) obj).d();
                if (d != null) {
                    return d.d();
                }
                return null;
            case 25:
                qof0 qof0Var = (qof0) obj;
                Application application = qof0Var.a;
                enf0 enf0Var = qof0.I;
                if (enf0Var == null) {
                    enf0Var = (enf0) qof0.J.invoke(qof0Var);
                    qof0.I = enf0Var;
                }
                return new dof0(application, enf0Var, (TelephonyManager) qof0Var.a.getSystemService("phone"), qof0Var.d(), qof0Var.b(), qof0Var.e());
            case 26:
                return v7h0.c.a;
            case 27:
                return Boolean.valueOf(((it80) obj).a());
            case 28:
                return ((v9i0.c) obj).b;
            default:
                dcy dcyVar = (dcy) obj;
                KSerializer q = s1v.q(dcyVar);
                if (q != null) {
                    return q;
                }
                if (rta0.c(dcyVar)) {
                    return new tub0(dcyVar);
                }
                return null;
        }
    }
}
