package xsna;

import com.vk.api.base.Document;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.LikeInfo;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.design.view.comments.VkCommentAuthorLikedView;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.privacyui.PrivacyEditFragment;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.lang.ref.WeakReference;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import org.json.JSONObject;
import ru.ok.android.webrtc.simulcast.SimulcastConfig;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;
import xsna.a0r0;
import xsna.gij;
import xsna.i2h0;
import xsna.ij20;
import xsna.ikv0;
import xsna.jrt;
import xsna.k840;
import xsna.q8z;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class irt implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ irt(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId I0;
        fh90 fh90Var = null;
        r5 = null;
        q8z.a aVar = null;
        r5 = null;
        q8z.b bVar = null;
        r5 = null;
        seq0 seq0Var = null;
        r5 = null;
        smr0 smr0Var = null;
        r5 = null;
        hik0 hik0Var = null;
        fh90Var = null;
        switch (this.b) {
            case 0:
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("response");
                ArrayList arrayList = new ArrayList();
                com.vk.dto.newsfeed.a.a(jSONObject, arrayList, new zj90(), null);
                return new jrt.a(jSONObject.optString("next_from"), arrayList);
            case 1:
                int i = kwg0.a;
                return s3q0.a;
            case 2:
                return new Result(new Result.Failure((Throwable) obj));
            case 3:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 4:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 5:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM audio_track");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 6:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 7:
                return (com.vk.ecomm.orders.impl.order.presentation.mvi.c) obj;
            case 8:
                return Boolean.valueOf(!(((q4t) obj) instanceof vuz));
            case 9:
                return ((m1b0) obj).g;
            case 10:
                return Boolean.valueOf(((l3b0) obj).b);
            case 11:
                return s3q0.a;
            case 12:
                return new VKList(k840.a.c().f((List) obj));
            case 13:
                qgi0.r((tgi0) obj, "moreButtonInQueue");
                return s3q0.a;
            case 14:
                return new DocumentAttachment((Document) obj);
            case 15:
                int[] iArr = PrivacyEditFragment.W0;
                return null;
            case 16:
                L.i((Throwable) obj);
                com.vk.core.utils.newtork.b.a.getClass();
                if (!com.vk.core.utils.newtork.b.d()) {
                    cvk.u(R.string.common_network_error, false);
                }
                return s3q0.a;
            case 17:
                qgi0.r((tgi0) obj, "community_rebooking_avatar");
                return s3q0.a;
            case 18:
                LikeInfo likeInfo = (LikeInfo) obj;
                if (likeInfo != null) {
                    return likeInfo.c.getString("firstNameDat");
                }
                return null;
            case 19:
                List list = (List) obj;
                Object obj2 = list.get(0);
                dt2 dt2Var = obj2 != null ? (dt2) obj2 : null;
                Object obj3 = list.get(2);
                int intValue = (obj3 != null ? (Integer) obj3 : null).intValue();
                Object obj4 = list.get(3);
                int intValue2 = (obj4 != null ? (Integer) obj4 : null).intValue();
                Object obj5 = list.get(4);
                String str = obj5 != null ? (String) obj5 : null;
                switch (i2h0.c.$EnumSwitchMapping$0[dt2Var.ordinal()]) {
                    case 1:
                        Object obj6 = list.get(1);
                        fh9 fh9Var = i2h0.h;
                        if (!epx.f(obj6, Boolean.FALSE) && obj6 != null) {
                            fh90Var = (fh90) ((izs) fh9Var.c).invoke(obj6);
                        }
                        return new us2.d(fh90Var, intValue, intValue2, str);
                    case 2:
                        Object obj7 = list.get(1);
                        fh9 fh9Var2 = i2h0.i;
                        if (!epx.f(obj7, Boolean.FALSE) && obj7 != null) {
                            hik0Var = (hik0) ((izs) fh9Var2.c).invoke(obj7);
                        }
                        return new us2.d(hik0Var, intValue, intValue2, str);
                    case 3:
                        Object obj8 = list.get(1);
                        fh9 fh9Var3 = i2h0.d;
                        if (!epx.f(obj8, Boolean.FALSE) && obj8 != null) {
                            smr0Var = (smr0) ((izs) fh9Var3.c).invoke(obj8);
                        }
                        return new us2.d(smr0Var, intValue, intValue2, str);
                    case 4:
                        Object obj9 = list.get(1);
                        fh9 fh9Var4 = i2h0.e;
                        if (!epx.f(obj9, Boolean.FALSE) && obj9 != null) {
                            seq0Var = (seq0) ((izs) fh9Var4.c).invoke(obj9);
                        }
                        return new us2.d(seq0Var, intValue, intValue2, str);
                    case 5:
                        Object obj10 = list.get(1);
                        fh9 fh9Var5 = i2h0.f;
                        if (!epx.f(obj10, Boolean.FALSE) && obj10 != null) {
                            bVar = (q8z.b) ((izs) fh9Var5.c).invoke(obj10);
                        }
                        return new us2.d(bVar, intValue, intValue2, str);
                    case 6:
                        Object obj11 = list.get(1);
                        fh9 fh9Var6 = i2h0.g;
                        if (!epx.f(obj11, Boolean.FALSE) && obj11 != null) {
                            aVar = (q8z.a) ((izs) fh9Var6.c).invoke(obj11);
                        }
                        return new us2.d(aVar, intValue, intValue2, str);
                    case 7:
                        Object obj12 = list.get(1);
                        return new us2.d(new wpm0(obj12 != null ? (String) obj12 : null), intValue, intValue2, str);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 20:
                ((ij20.a) obj).l(true);
                return s3q0.a;
            case 21:
                return SimulcastConfig.a((SimulcastLayerInfo) obj);
            case 22:
                throw new ConnectException();
            case 23:
                cwr0 cwr0Var = (cwr0) obj;
                VideoFile videoFile = cwr0Var.a;
                String str2 = cwr0Var.c;
                if (videoFile == null || str2 == null) {
                    return null;
                }
                Owner s = videoFile.s();
                if (s == null || (I0 = s.b) == null) {
                    I0 = videoFile.I0();
                }
                PostingCreationEntryPoint.Companion.getClass();
                return new gij.d(videoFile, cwr0Var.d, I0, PostingCreationEntryPoint.a.a(str2));
            case 24:
                return (ExtendedUserProfile) ((ptk) obj).a;
            case 25:
                int i2 = a0r0.a.$EnumSwitchMapping$0[((SubscribeStatus) obj).ordinal()];
                if (i2 == 1) {
                    cvk.u(R.string.user_following_success, false);
                } else if (i2 == 2) {
                    cvk.u(R.string.user_already_requested, false);
                }
                return s3q0.a;
            case 26:
                return (ikv0.a) obj;
            case 27:
                return Boolean.valueOf(rl3.y0(new CatalogDataType[]{CatalogDataType.DATA_TYPE_VIDEO_ALBUMS, CatalogDataType.DATA_TYPE_VIDEO_VIDEOS, CatalogDataType.DATA_TYPE_ARTIST_VIDEOS}).contains(((UIBlock) obj).Cb()));
            case 28:
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, null, null, null, null, new WeakReference(null), null, false, false, false, 8127);
            default:
                int i3 = VkCommentAuthorLikedView.d;
                throw null;
        }
    }

    public /* synthetic */ irt(Object obj, int i) {
        this.b = i;
    }
}
