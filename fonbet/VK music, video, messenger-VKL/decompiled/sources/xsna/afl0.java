package xsna;

import android.os.Bundle;
import com.vk.confirmaccount.impl.VkConfirmUserByServiceActivity;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.models.videotracker.ResizeAction;
import com.vk.libvideo.screen.VideoFragment;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import com.vk.storycamera.screen.StoryCameraActivity;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import one.video.transform.TransformController;
import xsna.b78;
import xsna.dpt0;
import xsna.sx40;
import xsna.te20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class afl0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ afl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        rlt0 m0;
        int i = this.b;
        r2 = false;
        r2 = false;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = StoryCameraActivity.G;
                break;
            case 2:
                StoriesViewPager storiesViewPager = ((com.vk.story.viewer.impl.presentation.stories.b) obj).O;
                for (int i3 = 0; i3 < storiesViewPager.getChildCount(); i3++) {
                    if (storiesViewPager.getChildAt(i3) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i3)).setAudioMuted(true);
                    }
                }
                break;
            case 3:
                ((pwm0) obj).b.invoke(new c.d(5, null, Boolean.FALSE, null));
                break;
            case 4:
                i5n0 i5n0Var = ((r4n0) obj).f;
                break;
            case 5:
                break;
            case 6:
                te20.b bVar = (te20.b) obj;
                c400 c400Var = new c400();
                ProfilesSimpleInfo profilesSimpleInfo = bVar.j;
                c400Var.a.putAll(profilesSimpleInfo.b);
                c400Var.e.putAll(profilesSimpleInfo.c);
                List<bsj> list = bVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (bsj bsjVar : list) {
                    Long valueOf = Long.valueOf(bsjVar.a());
                    Object obj2 = linkedHashMap.get(valueOf);
                    Object obj3 = obj2;
                    if (obj2 == null) {
                        obj3 = obj2;
                        if (!linkedHashMap.containsKey(valueOf)) {
                            obj3 = new HashMap();
                        }
                    }
                    HashMap hashMap = (HashMap) obj3;
                    for (Msg msg : bsjVar.c) {
                        hashMap.put(Integer.valueOf(msg.d), msg);
                    }
                    linkedHashMap.put(valueOf, hashMap);
                }
                c400Var.h.putAll(linkedHashMap);
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    com.vk.im.engine.models.dialogs.a aVar = ((bsj) it.next()).a;
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.vk.im.engine.models.dialogs.a aVar2 = (com.vk.im.engine.models.dialogs.a) it2.next();
                    c400Var.d.put(Long.valueOf(aVar2.a), aVar2);
                }
                break;
            case 7:
                ((fuv0) obj).show();
                break;
            case 8:
                ynq0 ynq0Var = (ynq0) obj;
                fpq0 fpq0Var = ynq0Var.h;
                break;
            case 9:
                ((kfr0) obj).c.m(JsApiMethodType.RECOMMEND_APP, VkAppsErrors.Client.USER_DENIED, null, null);
                break;
            case 10:
                ((jpr0) obj).b();
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                int i4 = VideoFragment.c0;
                break;
            case 14:
                break;
            case 15:
                com.vk.video.ui.discovery.minimizable.m mVar = (com.vk.video.ui.discovery.minimizable.m) obj;
                if (!mVar.r && !mVar.x && mVar.v) {
                    z = true;
                }
                break;
            case 16:
                ((cys0) obj).b0.invoke(a.b.b);
                break;
            case 17:
                break;
            case 18:
                hat0 hat0Var = (hat0) obj;
                hat0Var.g.Qc("video_quality_new");
                hat0Var.b = null;
                break;
            case 19:
                fxc0.B().d(((mbt0) obj).b);
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                dpt0.a aVar3 = (dpt0.a) obj;
                List<? extends hfz> list2 = aVar3.i.h;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (obj4 instanceof fpt0) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((fpt0) next).c) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((fpt0) it4.next()).b);
                }
                if (arrayList4.isEmpty()) {
                    cvk.u(R.string.video_urls_notification, false);
                } else {
                    aVar3.e.invoke(arrayList4);
                    aVar3.h.hide();
                }
                break;
            case 23:
                VideoView videoView = (VideoView) obj;
                ebs0 ebs0Var = videoView.s;
                if (ebs0Var != null) {
                    ebs0Var.bk(new det0(videoView.getViewBinding().c.getTransformController().e == TransformController.ScaleType.CROP));
                }
                ResizeAction resizeAction = ResizeAction.BUTTON;
                videoView.l0();
                yg5 yg5Var = videoView.I;
                TransformController.ScaleType videoScaleType = (yg5Var == null || !yg5Var.P0()) ? videoView.getViewBinding().c.getTransformController().e : videoView.getVideoScaleType();
                TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
                TransformController.ScaleType scaleType2 = videoScaleType == scaleType ? TransformController.ScaleType.FIT : scaleType;
                videoView.setVideoScaleType(scaleType2);
                videoView.getViewBinding().c.i(scaleType2, true);
                videoView.j0(scaleType2);
                yg5 yg5Var2 = videoView.I;
                if (yg5Var2 != null && (m0 = yg5Var2.m0()) != null) {
                    Bundle b = m0.b("resize", scaleType2 == scaleType ? "widen" : "narrow");
                    b.putString("resize_action", resizeAction.toString().toLowerCase());
                    m0.h(b);
                }
                break;
            case 24:
                ((b78.g) obj).a().invoke(new sx40.m0(true, PlayerContext.MINI));
                break;
            case 25:
                break;
            case 26:
                int i5 = VkConfirmUserByServiceActivity.m;
                break;
            case 27:
                break;
            case 28:
                gzs<s3q0> gzsVar = ((mjw0) obj).e1;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                ((hmj0) obj).invoke(null);
                break;
        }
        return s3q0.a;
    }
}
