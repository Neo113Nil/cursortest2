package xsna;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.photos.dto.PhotosAgreeBlurRestrictionResponseDto;
import com.vk.api.generated.video.dto.VideoSaveAssistantAlbumResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.main.SignUpRouter;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.utils.VkPhoneFormatUtils;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VideoProfilePlaceholderVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchSpellcheck;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.libvideo.upload.api.VideoUpload;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.profile.user.impl.ui.g;
import com.vk.profile.user.impl.ui.h;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.qwi0;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ndg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ndg0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair<String, String> pair;
        int i = this.b;
        r4 = false;
        r4 = false;
        r4 = false;
        boolean z = false;
        String str = null;
        str = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                p870 p870Var = (p870) obj3;
                Photo photo = (Photo) obj2;
                if (((PhotosAgreeBlurRestrictionResponseDto) obj).d()) {
                    p870Var.e(130, photo);
                }
                break;
            case 1:
                bi20 bi20Var = (bi20) obj2;
                boolean f = epx.f(((CatalogBlock) obj3).i.h.getString(TtmlNode.TAG_STYLE), "large");
                UIBlockSearchSpellcheck uIBlockSearchSpellcheck = new UIBlockSearchSpellcheck(bi20Var.a, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, (CatalogSearchSpellcheckResult) obj);
                uIBlockSearchSpellcheck.z = f;
                break;
            case 2:
                ((mwi0) obj3).C(new qwi0.b(((qwi0.a) obj2).b, (SessionRoomId) obj));
                break;
            case 3:
                s6k0 s6k0Var = (s6k0) obj3;
                String str2 = (String) obj2;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                sir0 sir0Var = sir0.a;
                Context context = s6k0Var.b;
                LibverifyScreenData b = sir0.b(sir0Var, context, str2, vkAuthValidatePhoneResult);
                if (b != null) {
                    SignUpRouter signUpRouter = s6k0Var.n;
                    sir0.f(sir0Var, signUpRouter != null ? signUpRouter : null, b, null, null, 12);
                } else {
                    VerificationScreenData.Phone phone = new VerificationScreenData.Phone(str2, VkPhoneFormatUtils.a(context, str2, null, null, 28), vkAuthValidatePhoneResult.b, false, vkAuthValidatePhoneResult, false, false, false, null, null, null, null, 4072, null);
                    SignUpRouter signUpRouter2 = s6k0Var.n;
                    sir0.f(sir0Var, signUpRouter2 != null ? signUpRouter2 : null, null, phone, null, 10);
                }
                break;
            case 4:
                wf wfVar = (wf) obj;
                ((cnh) obj3).invoke();
                wfVar.setCanInteract(true);
                wfVar.c();
                wfVar.N0((String) obj2);
                break;
            case 5:
                List list = (List) obj3;
                List list2 = (List) obj2;
                tra0.a aVar = (tra0.a) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Pair pair2 = (Pair) list.get(i2);
                        tra0.a.w(aVar, (tra0) pair2.d(), ((h9x) pair2.g()).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Pair pair3 = (Pair) list2.get(i3);
                        tra0 tra0Var = (tra0) pair3.d();
                        gzs gzsVar = (gzs) pair3.g();
                        tra0.a.w(aVar, tra0Var, gzsVar != null ? ((h9x) gzsVar.invoke()).a : 0L);
                    }
                }
                break;
            case 6:
                h.a aVar2 = (h.a) obj3;
                UserProfileFragment userProfileFragment = (UserProfileFragment) obj2;
                g.a aVar3 = (g.a) obj;
                int i4 = UserProfileFragment.p0;
                ExtendedUserProfile a = aVar2.i.a();
                if (a != null && ((Boolean) userProfileFragment.n0.getValue()).booleanValue() && userProfileFragment.ko().a(a.a.c) && a.B1) {
                    z = true;
                }
                ExtendedUserProfile a2 = aVar2.i.a();
                if (a2 != null && (pair = a2.U1) != null) {
                    str = pair.i();
                }
                userProfileFragment.fo(aVar3, z, str);
                break;
            case 7:
                hii0 hii0Var = (hii0) obj3;
                kfr0 kfr0Var = (kfr0) obj2;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(((ggu0) kfr0Var.f.c).b.getString(R.string.vk_apps_common_network_error));
                }
                izs<Throwable, s3q0> izsVar = hii0Var.b;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                xgx0.a.getClass();
                xgx0.d(th);
                break;
            case 8:
                VideoProfilePlaceholderVh videoProfilePlaceholderVh = (VideoProfilePlaceholderVh) obj3;
                UserId userId = ((UIBlock) obj2).g;
                videoProfilePlaceholderVh.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (List) obj) {
                    VideoUploadEvent videoUploadEvent = (VideoUploadEvent) obj4;
                    if ((videoUploadEvent instanceof VideoUploadEvent.Start) || (videoUploadEvent instanceof VideoUploadEvent.Progress) || (videoUploadEvent instanceof VideoUploadEvent.Fail)) {
                        VideoUpload videoUpload = videoUploadEvent.b;
                        if (videoUpload.n > 0 && epx.f(userId, videoUpload.d)) {
                            arrayList.add(obj4);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    View view = videoProfilePlaceholderVh.n;
                    (view != null ? view : null).setVisibility(8);
                }
                break;
            default:
                com.vk.video.ui.discovery.minimizable.dialog.related_videos.d dVar = (com.vk.video.ui.discovery.minimizable.dialog.related_videos.d) obj3;
                myc0.h(dVar.i, null, null, new vbt0(dVar, (String) obj2, (VideoSaveAssistantAlbumResponseDto) obj, null), 3);
                break;
        }
        return s3q0.a;
    }
}
