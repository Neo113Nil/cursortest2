package xsna;

import android.content.Context;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.ecosystem.dto.EcosystemSendOtpResponseDto;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.api.generated.friends.dto.FriendsGetListsResponseDto;
import com.vk.attachpicker.fragment.gallery.FastScroller;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.privacy.ListFriends;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.design.view.newsfeed.avatar_stack.AvatarAnimatedStack;
import com.vk.file_picker.external.e;
import com.vk.im.engine.models.groups.ManagedGroup;
import com.vk.log.L;
import com.vk.music.player.LoopMode;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.reefton.Reef;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.SearchDatabaseState;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.voip.ui.sessionrooms.f;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.h0g0;
import xsna.kya;
import xsna.ozo;
import xsna.riv;
import xsna.tj50;
import xsna.tlo0;
import xsna.wwi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class j5n implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ j5n(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        int i;
        switch (this.b) {
            case 0:
                return new i5g(((DiscoverMediaBlock) obj).j);
            case 1:
                kya.a aVar = (kya.a) obj;
                return new ozo.a(aVar.a, aVar.b);
            case 2:
                return new e.a(((tj50.a) obj).a(neq.b, ao8.d));
            case 3:
                int i2 = FastScroller.v;
                return ((ViewPropertyAnimator) obj).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L);
            case 4:
                AvatarAnimatedStack avatarAnimatedStack = new AvatarAnimatedStack((Context) obj, null, 6);
                tlo0.Companion.getClass();
                avatarAnimatedStack.setText(new tlo0.h("Нравится Ивану и ещё 5 людям плюс очень длинный текст, чтобы не помещался в одну строку"));
                avatarAnimatedStack.a("https://vk.ru/reaction/3-reactions-0?c_uniq_tag=c0390bed2f5fe4bef86e18a800618094e818e47ec5210c33d15d298e27829c5e", e43.l("https://sun9-56.userapi.com/s/v1/ig2/cqW3O-sLWt9GB7fe8QspKJrGQGL_xgqZpw3bGkXTBgIxC8TBMVV7oggz7M4Ui7YnnQKiHTHMuamC3cONaMu_POMV.jpg?quality=95&as=32x24,48x36,72x54,108x81,160x120,240x180,360x270,480x360,540x405,640x480,720x540,800x600&from=bu&u=KCYXtnqDaHJ8JdBSHVrMQK4qMANCAxnpn7IXNr7YYYY&cs=800x0", "https://sun9-11.userapi.com/s/v1/ig2/8ASAJV_87mlTav5DoI-KU1OkK-2oZxOtJ062kVx7F3JElLG8Jj6M1TxCp5W9wlQngPZ9eU2Qfsc2rpxECzJU4jMD.jpg?quality=95&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720,1080x1080&from=bu&u=piXpizO0HgNnhrf-R793MglftMbsHbMgi3HSaAXZ7j0&cs=1080x0"));
                return avatarAnimatedStack;
            case 5:
                return i2s.u(t2s.a((t2s) obj, null, false, null, null, false, null, null, false, 0, 495));
            case 6:
                List<FriendsFriendsListDto> d = ((FriendsGetListsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (FriendsFriendsListDto friendsFriendsListDto : d) {
                    arrayList.add(new ListFriends(friendsFriendsListDto.getId(), friendsFriendsListDto.d()));
                }
                return arrayList;
            case 7:
                return ((hbt) obj).g;
            case 8:
                return s3q0.a;
            case 9:
                Photo photo = ((PhotoAttachment) obj).l;
                photo.l = false;
                return photo;
            case 10:
                File file = (File) obj;
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                    try {
                        obj2 = riv.b.a.a(objectInputStream);
                        objectInputStream.close();
                    } finally {
                    }
                } catch (Exception e) {
                    L.j(e, "HttpCacheStatistics");
                    com.vk.metrics.eventtracking.b.a.a(e);
                    obj2 = EmptyList.b;
                }
                Object obj3 = obj2;
                try {
                    file.delete();
                } catch (Exception e2) {
                    L.j(e2, "HttpCacheStatistics");
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
                return obj3;
            case 11:
                return Long.valueOf(((ManagedGroup) obj).a.d);
            case 12:
                return bn00.a((EcosystemSendOtpResponseDto) obj);
            case 13:
                AuthResult authResult = (AuthResult) obj;
                q55 q55Var = q55.a;
                q55.d(authResult);
                return authResult;
            case 14:
                return Boolean.valueOf(epx.f(((n8b0) obj).a.c, o25.a().c()));
            case 15:
                return j5g.O0((List) obj);
            case 16:
                return ((id50) obj).b;
            case 17:
                return fpf0.a(((com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.a) obj).getClass());
            case 18:
                return Boolean.valueOf(((FragmentImpl) obj).Mn());
            case 19:
                qgi0.r((tgi0) obj, "people_search_filters_city_select");
                return s3q0.a;
            case 20:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                ur60 ur60Var = ((uvc0) obj).b;
                sq60 sq60Var = ur60Var.b;
                return new nwc0(sq60Var, ur60Var.e, ur60Var.f, ur60Var.g, sq60Var.a.isEmpty() && !ur60Var.g && !ur60Var.f && ur60Var.e == ListLoadingState.IDLE);
            case 21:
                AtomicInteger atomicInteger = Reef.i;
                Reef.a.a((Throwable) obj);
                return s3q0.a;
            case 22:
                int i3 = h0g0.a.$EnumSwitchMapping$0[((LoopMode) obj).ordinal()];
                if (i3 == 1) {
                    i = R.raw.repeat_default_to_dot_outline_24;
                } else if (i3 == 2) {
                    i = R.raw.repeat_dot_to_1_outline_24;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.raw.repeat_1_to_default_outline_24;
                }
                return Integer.valueOf(i);
            case 23:
                return ((SearchDatabaseState) ((mph0) obj)).f;
            case 24:
                return s3q0.a;
            case 25:
                wwi0.c cVar = ((wwi0) obj).b;
                return cVar instanceof wwi0.c.C3962c ? xwi0.a((wwi0.c.C3962c) cVar) : f.a.C2082a.a;
            case 26:
                qgi0.r((tgi0) obj, "memories_banner_close");
                return s3q0.a;
            case 27:
                return Boolean.valueOf(!drm0.N(((QueueParams) obj).d));
            case 28:
                return "VK_PAY_CHECKOUT_VKPAY_TOKEN_IV/" + ((UserId) obj).b;
            default:
                return Integer.valueOf(((xxq0) obj).c);
        }
    }

    public /* synthetic */ j5n(i2s i2sVar) {
        this.b = 5;
    }
}
