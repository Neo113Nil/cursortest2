package xsna;

import android.os.Bundle;
import android.view.MotionEvent;
import com.google.gson.Gson;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.api.generated.combo.dto.ComboAvailableOfferResponseDto;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.stories.StorySettingsActivity;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.voip.ui.watchmovie.selectsource.dialog.ui.VoipActiveVideoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.bgp0;
import xsna.lyr0;
import xsna.xzw0;
import xsna.y0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class f6m0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f6m0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        p3t p3tVar = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj2;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) obj;
                int i2 = StoryMediaPickerFragment.d0;
                p3t go = storyMediaPickerFragment.go();
                if (go != null) {
                    k15.u(go, (s3t) storyMediaPickerFragment.b0.getValue());
                    p3tVar = go;
                }
                if (p3tVar != null) {
                    p3tVar.Q7(mediaStoreEntry);
                }
                return s3q0.a;
            case 1:
                int i3 = StorySettingsActivity.P;
                ((StorySettingsActivity) obj2).X1();
                return s3q0.a;
            case 2:
                maz.c(xwk.d().e(), ((zim0) obj2).b.getContext(), (String) obj, LaunchContext.A, null, null, 24);
                return s3q0.a;
            case 3:
                ((k8) obj2).invoke((String) obj);
                return s3q0.a;
            case 4:
                ((cnh) obj2).invoke();
                return s3q0.a;
            case 5:
                lf30 lf30Var = ((hcp0) obj2).v;
                if (lf30Var != null) {
                    lf30Var.a();
                }
                return s3q0.a;
            case 6:
                ComboAvailableOfferResponseDto comboAvailableOfferResponseDto = (ComboAvailableOfferResponseDto) obj;
                ((xfp0) obj2).T(new bgp0.d(comboAvailableOfferResponseDto.d(), comboAvailableOfferResponseDto.getUrl()));
                return s3q0.a;
            case 7:
                UserId userId = (UserId) obj2;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM ugc_packs WHERE ownerId = ?");
                try {
                    Gson gson = psj.a;
                    V0.bindLong(1, userId.b);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 8:
                Throwable th2 = (Throwable) obj;
                ((rkq0) obj2).getClass();
                L.i(th2);
                h03.b(th2);
                return s3q0.a;
            case 9:
                u5p0 u5p0Var = ((gpq0) obj2).d;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                return s3q0.a;
            case 10:
                tuq0 tuq0Var = (tuq0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    tuq0Var.j.a(new y0r0.b(tuq0Var.a.a()));
                }
                return s3q0.a;
            case 11:
                return (VideoAutoPlay.e) obj2;
            case 12:
                lyr0.a aVar = (lyr0.a) obj;
                return ((aVar instanceof lyr0.a.C3311a) && ((lyr0.a.C3311a) aVar).a) ? ((d5s0) obj2).a().U(new aad0(new xim0(aVar, 7), 11)) : io.reactivex.rxjava3.core.q.T(aVar);
            case 13:
                VideoFile videoFile = (VideoFile) obj2;
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    Iterator<T> it = Sb.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            UIBlock uIBlock = (UIBlock) it.next();
                            if ((uIBlock instanceof UIBlockVideo) && epx.f(((UIBlockVideo) uIBlock).A().a1(), videoFile.a1())) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                int i4 = VideoNewProfileHeaderViewV2.y;
                ((etv0) obj).b(false);
                ((ofc0) obj2).invoke();
                return s3q0.a;
            case 15:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj2;
                int i5 = VideoOfflineFragment.f1;
                List<czs0> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (czs0 czs0Var : list) {
                    videoOfflineFragment.requireContext();
                    arrayList.add(dzs0.a(czs0Var, videoOfflineFragment.I0.f()));
                }
                return arrayList;
            case 16:
                return ((tet0) obj2).getResources().getString(((ecr) obj).a());
            case 17:
                uut0 uut0Var = (uut0) obj2;
                k5t k5tVar = uut0Var.j;
                k5tVar.getClass();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    k5tVar.b.put((wc1) entry.getKey(), (md90) entry.getValue());
                }
                uut0Var.a.a(uut0Var.j);
                return s3q0.a;
            case 18:
                w25 w25Var = (w25) obj;
                Bundle arguments = ((com.vk.superapp.browser.internal.ui.changephone.a) obj2).getArguments();
                String string = arguments != null ? arguments.getString(CommonConstant.KEY_ACCESS_TOKEN) : null;
                if (string == null) {
                    return w25Var;
                }
                UserId userId2 = UserId.d;
                UtilityTokens.CREATOR.getClass();
                return new w25(0, 0L, UtilityTokens.c, userId2, string, null);
            case 19:
                ((xtu0) obj2).b.invoke();
                return s3q0.a;
            case 20:
                l7k0 l7k0Var = (l7k0) obj2;
                int actionMasked = ((MotionEvent) obj).getActionMasked();
                if (actionMasked == 0) {
                    Object obj3 = flv0.a;
                    flv0.f(l7k0Var.b);
                } else if (actionMasked == 1 || actionMasked == 3) {
                    Object obj4 = flv0.a;
                    flv0.g(l7k0Var.b);
                }
                return s3q0.a;
            case 21:
                s0x0<? super xzw0.a> s0x0Var = ((VoipActiveVideoView) obj2).z;
                if (s0x0Var != null) {
                    s0x0Var.c(xzw0.a.a);
                }
                return s3q0.a;
            default:
                int i6 = c2x0.o1;
                ((c2x0) obj2).dismiss();
                return s3q0.a;
        }
    }
}
