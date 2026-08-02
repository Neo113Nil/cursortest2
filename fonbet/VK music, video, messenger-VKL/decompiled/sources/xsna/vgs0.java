package xsna;

import android.text.Layout;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.libvideo.upload.api.VideoUploadEvent;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vk.voip.ui.calls.presentation.feature.handler.VoipCallServiceBannerHandler;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import com.vk.voip.ui.members.VoipDataProvider;
import com.vk.voip.ui.scheduled.creation.ui.settings.VoipScheduledCallSettingsFragment;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dd9;
import xsna.gm50;
import xsna.hmo0;
import xsna.jox0;
import xsna.myw0;
import xsna.owm;
import xsna.p7w0;
import xsna.pxw0;
import xsna.spw0;
import xsna.v59;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vgs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vgs0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        if (r7.equals(com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT) == false) goto L65;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ix5[] ix5VarArr;
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        ix5 ix5Var = null;
        ix5Var = null;
        ix5Var = null;
        char c = 1;
        switch (this.b) {
            case 0:
                ((com.vk.video.ui.discovery.minimizable.related_videos.k) this.c).l(h.b.a);
                return s3q0.a;
            case 1:
                qis0 qis0Var = (qis0) this.c;
                lyd.a.b((Throwable) obj);
                aqw.m(R.string.filters_processing_error, qis0Var.h.getContext());
                qis0Var.d();
                return s3q0.a;
            case 2:
                iyr0 iyr0Var = (iyr0) this.c;
                UIBlockList uIBlockList = (UIBlockList) obj;
                if (dks0.b(uIBlockList, iyr0Var.b)) {
                    List<VideoUploadEvent> list = iyr0Var.a;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (VideoUploadEvent videoUploadEvent : list) {
                            if (!(videoUploadEvent instanceof VideoUploadEvent.Cancel) && !(videoUploadEvent instanceof VideoUploadEvent.Delete)) {
                                if (!(videoUploadEvent instanceof VideoUploadEvent.Done) && !(videoUploadEvent instanceof VideoUploadEvent.Fail) && !(videoUploadEvent instanceof VideoUploadEvent.Progress) && !(videoUploadEvent instanceof VideoUploadEvent.Removed) && !(videoUploadEvent instanceof VideoUploadEvent.Start)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                    }
                    if (!uIBlockList.y.isEmpty()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.c;
                int i2 = VideoProfileFragmentOld.p0;
                xn50.a.c(videoProfileFragmentOld, new a.j0(true));
                ((ikv0) obj).a();
                return s3q0.a;
            case 4:
                gi5 gi5Var = (gi5) this.c;
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, gi5Var.a, null, null, gi5Var, null, null, false, false, false, 8155);
            case 5:
                ((q9u0) this.c).O(owm.e.b);
                return s3q0.a;
            case 6:
                ((wh50) this.c).setValue((ljo0) obj);
                return s3q0.a;
            case 7:
                m6w0 m6w0Var = (m6w0) this.c;
                p7w0.c.b bVar = (p7w0.c.b) obj;
                m6w0Var.i = bVar.b.b;
                m6w0Var.T(bVar);
                return s3q0.a;
            case 8:
                a8w0 a8w0Var = (a8w0) this.c;
                a8w0Var.getClass();
                unm0 unm0Var = new unm0((List) obj);
                u440 u440Var = a8w0Var.a;
                u440Var.v2(unm0Var);
                ShareVmojiStoryParams shareVmojiStoryParams = a8w0Var.b;
                String str = shareVmojiStoryParams.d;
                if (str != null && str.length() != 0) {
                    hmo0.e eVar = hmo0.d;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    String a = imo0.a(alignment);
                    switch (a.hashCode()) {
                        case -1364013995:
                            if (a.equals(TtmlNode.CENTER)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3317767:
                            break;
                        case 108511772:
                            if (a.equals(TtmlNode.RIGHT)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                            break;
                        case 2:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        default:
                            alignment = null;
                            break;
                    }
                    imo0 imo0Var = (eVar == null || alignment == null) ? null : new imo0(eVar, -1, alignment);
                    cco0 cco0Var = new cco0();
                    if (eVar != null && (ix5VarArr = eVar.a) != null) {
                        int length = ix5VarArr.length;
                        while (true) {
                            if (i < length) {
                                ix5 ix5Var2 = ix5VarArr[i];
                                if (ix5Var2.getId() == cco0Var.getId()) {
                                    ix5Var = ix5Var2;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    if (ix5Var != null) {
                        cco0Var.b(imo0Var);
                    }
                    if (eVar != null) {
                        eVar.d = imo0Var.b(eVar);
                        eVar.b(imo0Var);
                    }
                    u440Var.R7(new xlo0(iah0.f().widthPixels, shareVmojiStoryParams.d, imo0Var), new zwq(unm0Var, 3));
                }
                return s3q0.a;
            case 9:
                return new k9w0((ViewGroup) obj, (b8w0) this.c);
            case 10:
                ((VoipCallServiceBannerHandler) this.c).b.invoke(VoipCallServiceBannerHandler.b.a.a);
                return s3q0.a;
            case 11:
                gzs<s3q0> gzsVar = ((mjw0) this.c).c1;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 12:
                VoipDataProvider voipDataProvider = (VoipDataProvider) this.c;
                dd9.a.f fVar = (dd9.a.f) ((dd9.a) obj);
                synchronized (voipDataProvider) {
                    try {
                        if (epx.f(voipDataProvider.a.b(), fVar.b)) {
                            whr0 whr0Var = voipDataProvider.n.get(fVar.c);
                            whr0 a2 = whr0Var != null ? whr0.a(whr0Var, fVar.d, 196607) : null;
                            if (a2 != null) {
                                voipDataProvider.n.put(fVar.c, a2);
                                voipDataProvider.j.onNext(a2);
                                GroupCallViewModel.b.getClass();
                                GroupCallViewModel.l(a2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3q0.a;
            case 13:
                ((kpw0) this.c).T((spw0.b.C3686b) obj);
                return s3q0.a;
            case 14:
                VoipMainMenuActionsFragment voipMainMenuActionsFragment = (VoipMainMenuActionsFragment) this.c;
                v59 v59Var = (v59) obj;
                if (v59Var instanceof v59.b) {
                    voipMainMenuActionsFragment.T = voipMainMenuActionsFragment.U.v().g.a0(asu0.a.d()).subscribe(new dh40(new hfm0(voipMainMenuActionsFragment, 24), 27));
                } else if (v59Var instanceof v59.a) {
                    io.reactivex.rxjava3.disposables.c cVar = voipMainMenuActionsFragment.T;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    voipMainMenuActionsFragment.T = null;
                } else {
                    int i3 = VoipMainMenuActionsFragment.V;
                }
                return s3q0.a;
            case 15:
                ((jww0) this.c).l.a(pxw0.n.a);
                return s3q0.a;
            case 16:
                VoipScheduledCallSettingsFragment voipScheduledCallSettingsFragment = (VoipScheduledCallSettingsFragment) this.c;
                int i4 = VoipScheduledCallSettingsFragment.T;
                gm50.a.a(voipScheduledCallSettingsFragment, ((myw0.a) obj).a, new aiw0(voipScheduledCallSettingsFragment, 4));
                return s3q0.a;
            case 17:
                gox0 gox0Var = (gox0) this.c;
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    gox0Var.T(new jox0.a.C3135a(list2));
                }
                return s3q0.a;
            default:
                com.vk.writebar.a aVar = ((com.vk.writebar.g) this.c).o;
                (aVar != null ? aVar : null).e(true);
                return s3q0.a;
        }
    }

    public /* synthetic */ vgs0(dks0 dks0Var, iyr0 iyr0Var) {
        this.b = 2;
        this.c = iyr0Var;
    }
}
