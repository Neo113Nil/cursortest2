package xsna;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.search.params.api.SearchParams;
import com.vk.stories.StorySettingsActivity;
import com.vk.storycamera.picker.feature.f;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.d5c0;
import xsna.idh0;
import xsna.ksh0;
import xsna.lgw0;
import xsna.moq0;
import xsna.owm;
import xsna.qr60;
import xsna.wih0;
import xsna.x9m0;
import xsna.xn50;
import xsna.ywo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class xka0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xka0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ala0 ala0Var = (ala0) obj2;
                fgg0 fgg0Var = ala0Var.b;
                wow wowVar = new wow(fgg0Var);
                ((rry) obj).a(fgg0Var.size(), null, new xhj(wowVar, 1), new jai(-1117249557, new bla0(wowVar, ala0Var), true));
                return s3q0.a;
            case 1:
                ((mor) obj2).invoke();
                return s3q0.a;
            case 2:
                q8c0 q8c0Var = (q8c0) obj;
                ((l6c0) obj2).c(new d5c0.a(zp60.a));
                return new j5c0(new qr60.a.g(q8c0Var.a, q8c0Var.b, null, true, false, null, null, 96));
            case 3:
                MusicTrack musicTrack = (MusicTrack) obj;
                z84 z84Var = ((scc0) obj2).f;
                if (z84Var != null && z84Var.h0(musicTrack)) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
            case 4:
                z9d0 z9d0Var = (z9d0) obj2;
                return new yad0(z9d0Var.i, z9d0Var.j, z9d0Var.k, z9d0Var.l, (ViewGroup) obj);
            case 5:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachVideoMsg) && ((AttachVideoMsg) attach).getId() == ((long) ((b1g0) obj2).b.o0()));
            case 6:
                ((zak0) ((sjg0) obj2).r).setValue((String) obj);
                return s3q0.a;
            case 7:
                ((l1w0) obj2).a((Throwable) obj);
                return s3q0.a;
            case 8:
                tgi0 tgi0Var = (tgi0) obj;
                if (!((idh0.a) obj2).e) {
                    qgi0.a(tgi0Var);
                }
                return s3q0.a;
            case 9:
                ((zak0) ((c1h) obj2).d).setValue(new q9x(((q9x) obj).a));
                return s3q0.a;
            case 10:
                ksh0.b bVar = (ksh0.b) obj;
                SearchParams searchParams = bVar.c;
                return Boolean.valueOf(((!((csh0) obj2).d.d.i && bVar.b.b.length() <= 0) || searchParams == null || searchParams.I()) ? false : true);
            case 11:
                xtw xtwVar = (xtw) obj;
                return (Boolean) ((j21) obj2).invoke(Integer.valueOf(xtwVar.a), xtwVar.b);
            case 12:
                List<wih0> list = ((tnj0) obj2).c.invoke((ShortVideoGetRecomResponseDto) obj).a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof wih0.a) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SdkVideoFile sdkVideoFile = ((wih0.a) it.next()).a;
                    SdkClipVideoFile sdkClipVideoFile = sdkVideoFile instanceof SdkClipVideoFile ? (SdkClipVideoFile) sdkVideoFile : null;
                    if (sdkClipVideoFile != null) {
                        arrayList2.add(sdkClipVideoFile);
                    }
                }
                return arrayList2;
            case 13:
                ((l7l0) obj2).b.b();
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 14:
                ((com.vk.storycamera.picker.feature.a) obj2).k.b(new f.a(((Integer) obj).intValue()));
                return s3q0.a;
            case 15:
                ((p9m0) obj2).T(new x9m0.c((List) obj));
                return s3q0.a;
            case 16:
                int i2 = StorySettingsActivity.P;
                ((StorySettingsActivity) obj2).X1();
                return s3q0.a;
            case 17:
                View view = (View) obj;
                SizeSeekBarView sizeSeekBarView = ((ffo0) obj2).u;
                (sizeSeekBarView != null ? sizeSeekBarView : null).setSystemGestureExclusionRects(Collections.singletonList(new Rect(0, 0, view.getWidth(), view.getHeight())));
                return s3q0.a;
            case 18:
                ((wh50) obj2).setValue((String) obj);
                return s3q0.a;
            case 19:
                j7q0 j7q0Var = (j7q0) obj2;
                int id = ((View) obj).getId();
                if (id == R.id.subscribe_button) {
                    z6q0 z6q0Var = j7q0Var.x;
                    if (z6q0Var != null) {
                        z6q0Var.N0(j7q0Var.getContext());
                    }
                } else if (id == R.id.notification_button) {
                    z6q0 z6q0Var2 = j7q0Var.x;
                    if (z6q0Var2 != null) {
                        z6q0Var2.I1();
                    }
                } else {
                    j7q0Var.getClass();
                }
                return s3q0.a;
            case 20:
                fpq0 fpq0Var = (fpq0) obj2;
                if (fpq0Var.l.H()) {
                    fpq0Var.C(new UserProfileAction.s.b.c(new moq0.a.c("profile_widget")));
                }
                return s3q0.a;
            case 21:
                iui iuiVar = (iui) obj;
                iuiVar.a = new xf4(12, iuiVar.a(new smf0(((fxq0) obj2).d, new rr60())), iuiVar.a(new bxq0()));
                return s3q0.a;
            case 22:
                ((tdr0) obj2).b.getView().jk();
                return s3q0.a;
            case 23:
                return VideoEditTimelineView.Y4((VideoEditTimelineView) obj2, (ywo0.a) obj);
            case 24:
                VideoAlbum videoAlbum = (VideoAlbum) obj2;
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if ((!(uIBlock instanceof UIBlockVideoAlbum) || ((UIBlockVideoAlbum) uIBlock).Pb().getId() != videoAlbum.getId()) && !(uIBlock instanceof UIBlockTitleSubtitleAvatar) && !(uIBlock instanceof UIBlockPlaceholder) && !(uIBlock instanceof UIBlockSearchEntityVideoPlaylist)) {
                        }
                        return Boolean.valueOf(r2);
                        break;
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 25:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj2;
                VideoAdvertisementsRepository.a aVar = (VideoAdvertisementsRepository.a) obj;
                if ((aVar instanceof VideoAdvertisementsRepository.a.C1194a) && ((VideoAdvertisementsRepository.a.C1194a) aVar).a) {
                    gVar.S0();
                }
                return s3q0.a;
            case 26:
                uxt0 uxt0Var = (uxt0) obj2;
                return new mjz(((ViewGroup) obj).getContext(), uxt0Var.d, uxt0Var.e, new dyz0(uxt0Var.j, uxt0Var.k), uxt0Var.a);
            case 27:
                ((q9u0) obj2).O(owm.a.b);
                return s3q0.a;
            case 28:
                w25 w25Var = (w25) obj;
                Bundle arguments = ((cju0) obj2).getArguments();
                String string = arguments != null ? arguments.getString(CommonConstant.KEY_ACCESS_TOKEN) : null;
                if (string == null) {
                    return w25Var;
                }
                UserId userId = UserId.d;
                UtilityTokens.CREATOR.getClass();
                return new w25(0, 0L, UtilityTokens.c, userId, string, null);
            default:
                ngw0 ngw0Var = (ngw0) obj2;
                int i3 = ngw0.n1;
                lgw0.b bVar2 = lgw0.b.b;
                ngw0Var.getClass();
                xn50.a.c(ngw0Var, bVar2);
                return s3q0.a;
        }
    }
}
