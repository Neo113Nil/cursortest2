package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsBannerDto;
import com.vk.api.generated.groups.dto.GroupsGetBannerResponseDto;
import com.vk.api.generated.messages.dto.MessagesSendResponseDto;
import com.vk.cameraui.ShutterStates;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.clips.design.view.component.activities.like.ClipsBubbleAvatarView;
import com.vk.clips.uploader.api.model.ClipUploadJob;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.music.Playlist;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.newsfeed.common.prefetch.ClipsPrefetchHelper;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.bridge.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.bg7;
import xsna.ded;
import xsna.fif;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh6 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ wh6(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.spg] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        fif.a aVar;
        fif.a dVar;
        switch (this.b) {
            case 0:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 1:
                return io.reactivex.rxjava3.core.x.i(new bg7.a(xqm0.g("\n                                    Current time - lastLaunch > expiresIn\n                                    successDeleteAll = " + ((Boolean) obj) + "\n                                ")));
            case 2:
                int i = BonusCatalogFragment.f0;
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                float f = CameraUIView.w1;
                return Boolean.valueOf(((ShutterStates) obj).h());
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                ChatFragment.d dVar2 = ChatFragment.w1;
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 7:
                View view = (View) obj;
                return Boolean.valueOf((view instanceof lfe) || (view instanceof ClipsBubbleAvatarView));
            case 8:
                CatalogViewType catalogViewType = ((CatalogBlock) obj).i.b;
                return Boolean.valueOf(catalogViewType == CatalogViewType.SEPARATOR || catalogViewType == CatalogViewType.SEPARATOR_COMPACT);
            case 9:
                return new ClipsPrefetchHelper.a.C1367a((Throwable) obj);
            case 10:
                return new f1f((ViewGroup) obj);
            case 11:
                List<Pair> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (Pair pair : list) {
                    ClipUploadJob clipUploadJob = (ClipUploadJob) pair.d();
                    ded dedVar = (ded) pair.g();
                    int i2 = clipUploadJob.b;
                    if (dedVar instanceof ded.i) {
                        aVar = fif.a.g.a;
                    } else if (dedVar instanceof ded.f) {
                        dVar = new fif.a.d(((ded.f) dedVar).a);
                        arrayList2.add(new fif(i2, dVar, clipUploadJob.d, clipUploadJob.e, clipUploadJob.g));
                    } else if ((dedVar instanceof ded.c) || (dedVar instanceof ded.d) || (dedVar instanceof ded.a)) {
                        aVar = fif.a.b.a;
                    } else if (dedVar instanceof ded.h) {
                        aVar = fif.a.f.a;
                    } else if (dedVar instanceof ded.b) {
                        aVar = fif.a.C2875a.a;
                    } else if (dedVar instanceof ded.e) {
                        aVar = fif.a.c.a;
                    } else {
                        if (!epx.f(dedVar, ded.g.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = fif.a.e.a;
                    }
                    dVar = aVar;
                    arrayList2.add(new fif(i2, dVar, clipUploadJob.d, clipUploadJob.e, clipUploadJob.g));
                }
                return arrayList2;
            case 12:
                qgi0.r((tgi0) obj, "ClipBackButton");
                return s3q0.a;
            case 13:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(-1, 1, 1), new k9x(-50, 50, 1))));
            case 14:
                return new b.a((StickerStockItem) obj, GiftData.d);
            case 15:
                return Float.valueOf(((aar0) obj).b / 5.0f);
            case 16:
                return new wvg((ViewGroup) obj);
            case 17:
                return new y9h((ViewGroup) obj);
            case 18:
                GroupsBannerDto d = ((GroupsGetBannerResponseDto) obj).d();
                String spgVar = d != null ? new spg(d.getTitle(), d.getDescription(), d.i(), Boolean.valueOf(d.f()), d.j(), d.d().getUrl(), d.k(), d.l().isEmpty() ? null : d.l().get(0).getUrl(), d.g(), d.o(), d.n()) : null;
                it80.b.getClass();
                return new it80(spgVar);
            case 19:
                return s3q0.a;
            case 20:
                return (ckj) obj;
            case 21:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_user_profile, (Context) obj);
            case 22:
                zk70.e((Throwable) obj);
                return s3q0.a;
            case 23:
                return DraftsListState.a((DraftsListState) obj, null, DraftsListState.LoadingState.IDLE, 0, false, false, 59);
            case 24:
                AvatarAnimatedStack avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                tlo0.Companion.getClass();
                avatarAnimatedStack.setText(new tlo0.h("Нравится Ивану и ещё 5 людям"));
                avatarAnimatedStack.a("https://vk.ru/reaction/3-reactions-0?c_uniq_tag=c0390bed2f5fe4bef86e18a800618094e818e47ec5210c33d15d298e27829c5e", e43.l("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0", ""));
                return avatarAnimatedStack;
            case 25:
                List list2 = (List) obj;
                return new jks(null, list2, true ^ list2.isEmpty());
            case 26:
                return ((JSONObject) obj).getJSONObject("response");
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                Integer e = ((MessagesSendResponseDto) obj).e();
                if (e != null && e.intValue() == 1) {
                    r3 = true;
                }
                return Boolean.valueOf(r3);
            default:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return ((xmt) obj).c.b;
        }
    }

    public /* synthetic */ wh6(fef fefVar) {
        this.b = 11;
    }
}
