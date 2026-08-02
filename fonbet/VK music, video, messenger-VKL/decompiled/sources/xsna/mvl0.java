package xsna;

import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.base.VkPaginationList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.im.engine.models.account.AccountInfo;
import com.vk.libvideo.design.view.progress.VideoProgressView;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.video.profile.presentation.views.VideoNewProfileToolbarV2;
import com.vk.video.ui.discovery.minimizable.adfree.VideoAdFreeButton;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vk.voip.ui.history.friends.ui.a;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;
import com.vk.voip.ui.scheduled.creation.ui.fragment.VoipEditTimeScheduledCallFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.a7f0;
import xsna.bsm;
import xsna.f6x0;
import xsna.gm50;
import xsna.hdw0;
import xsna.pfm0;
import xsna.tlo0;
import xsna.xcw0;
import xsna.zhw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mvl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mvl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List<ProfileFriendItem> list;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((ikv0) obj).a();
                ((qvl0) obj2).a();
                break;
            case 1:
                pfm0.a aVar = ((pfm0) obj2).D;
                if (aVar != null) {
                    aVar.c();
                }
                break;
            case 2:
                ((mcj0) obj2).invoke((Throwable) obj);
                break;
            case 3:
                ((l9n) obj2).invoke((BadgeInfo) obj);
                break;
            case 4:
                cmo0 cmo0Var = (cmo0) obj2;
                int intValue = ((Integer) obj).intValue();
                imo0 imo0Var = cmo0Var.f;
                imo0Var.g = intValue;
                imo0Var.j = null;
                cmo0Var.f();
                break;
            case 5:
                mlq0 mlq0Var = (mlq0) obj2;
                ArrayList arrayList = ((ywd0) obj).a;
                c3j0 c3j0Var = mlq0Var.b;
                VkPaginationList<ProfileFriendItem> vkPaginationList = mlq0Var.i;
                if (vkPaginationList != null && (list = vkPaginationList.b) != null && (!list.isEmpty())) {
                    r1 = true;
                }
                if (!r1 && !arrayList.isEmpty()) {
                    c3j0Var.Q(PostingVisibilityMode.BEST_FRIENDS);
                } else if (r1 && arrayList.isEmpty()) {
                    c3j0Var.Q(PostingVisibilityMode.ALL);
                }
                mlq0Var.i = new VkPaginationList<>(new ArrayList(arrayList), arrayList.size(), false, 0, 8, null);
                break;
            case 6:
                AccountInfo accountInfo = (AccountInfo) obj2;
                break;
            case 7:
                ((sqr0) obj2).l.r();
                break;
            case 8:
                bsm.j jVar = ((avr0) obj2).o;
                if (jVar != null) {
                    jVar.g();
                }
                break;
            case 9:
                VideoAdFreeButton videoAdFreeButton = (VideoAdFreeButton) obj2;
                ryr0 ryr0Var = videoAdFreeButton.b;
                if (ryr0Var != null) {
                    ryr0Var.onClose();
                }
                LinearLayout linearLayout = videoAdFreeButton.c;
                if (linearLayout != null) {
                    d3m.e(linearLayout, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                break;
            case 10:
                gzs gzsVar = (gzs) obj2;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            case 11:
                int i2 = VideoNewProfileToolbarV2.m;
                ((yei0) obj2).invoke();
                break;
            case 12:
                int i3 = VideoOfflineFragment.f1;
                ((ikv0) obj).a();
                ((VideoOfflineFragment) obj2).R0.invoke();
                break;
            case 13:
                tdu tduVar = (tdu) obj;
                tduVar.f(true);
                tduVar.b(((r1t0) obj2).f ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 14:
                gzs<s3q0> gzsVar2 = ((VideoProgressView) obj2).d;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                break;
            case 15:
                dbs0 dbs0Var = (dbs0) obj;
                ebs0 ebs0Var = ((VideoView) obj2).s;
                if (ebs0Var != null) {
                    ebs0Var.bk(dbs0Var);
                }
                break;
            case 16:
                CounterMode counterMode = (CounterMode) obj2;
                tdu tduVar2 = (tdu) obj;
                tduVar2.X(com.vk.core.compose.component.defaults.f.f);
                tduVar2.f(counterMode != CounterMode.Tertiary);
                break;
            case 17:
                cdw0 cdw0Var = (cdw0) obj2;
                hdw0.a aVar2 = (hdw0.a) obj;
                int i4 = cdw0.o1;
                if (aVar2 instanceof hdw0.a.c) {
                    hdw0.a.c cVar = (hdw0.a.c) aVar2;
                    hdw0.a.C2987a c2987a = cVar.a;
                    VkInputSelect vkInputSelect = cdw0Var.m1;
                    if (vkInputSelect == null) {
                        vkInputSelect = null;
                    }
                    if (!String.valueOf(vkInputSelect.getText()).equals(c2987a.a)) {
                        VkInputSelect vkInputSelect2 = cdw0Var.m1;
                        if (vkInputSelect2 == null) {
                            vkInputSelect2 = null;
                        }
                        vkInputSelect2.setText(c2987a.a);
                    }
                    VkInputSelect vkInputSelect3 = cdw0Var.m1;
                    if (vkInputSelect3 == null) {
                        vkInputSelect3 = null;
                    }
                    vkInputSelect3.setHint(tlo0.b.a(c2987a.b, cdw0Var.requireContext()));
                    ProgressBar progressBar = cdw0Var.k1;
                    if (progressBar == null) {
                        progressBar = null;
                    }
                    bwt0.p0(progressBar, cVar.b);
                    boolean z = c2987a.d instanceof hdw0.a.C2987a.AbstractC2988a.b;
                    VkFormField vkFormField = cdw0Var.l1;
                    if (vkFormField == null) {
                        vkFormField = null;
                    }
                    vkFormField.setError(z);
                    if (z) {
                        VkFormField vkFormField2 = cdw0Var.l1;
                        (vkFormField2 != null ? vkFormField2 : null).setError(cdw0Var.getString(R.string.voip_change_name_validation_error_text));
                    } else {
                        VkFormField vkFormField3 = cdw0Var.l1;
                        (vkFormField3 != null ? vkFormField3 : null).setCaption(cdw0Var.getString(R.string.voip_change_name_block_description, c2987a.c));
                    }
                }
                break;
            case 18:
                zhw0 zhw0Var = (zhw0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    zhw0Var.b0(true);
                } else {
                    a7f0.a.f(zhw0Var, io.reactivex.rxjava3.core.x.B(zhw0Var.Y(false), zhw0Var.j.b(), new qca0(new zhw0.e(2, zhw0Var, zhw0.class, "patchContactsList", "patchContactsList(Lcom/vk/voip/ui/calls/presentation/feature/VoipCallServiceFeature$ContactsWithHints;Lcom/vk/voip/ui/calls/presentation/feature/handler/VoipCallServiceBannerHandler$Banner;)Lcom/vk/voip/ui/calls/presentation/model/state/VoipCallServicePatch;", 0), 17)), new ubt0(zhw0Var, 5), new gfv0(zhw0Var, 4), 1);
                }
                break;
            case 19:
                ((mjw0) obj2).setControlsAreHidden(((Boolean) obj).booleanValue());
                break;
            case 20:
                VoipEditTimeScheduledCallFragment voipEditTimeScheduledCallFragment = (VoipEditTimeScheduledCallFragment) obj2;
                int i5 = VoipEditTimeScheduledCallFragment.X;
                gm50.a.a(voipEditTimeScheduledCallFragment, ((VoipScheduleCallViewState.a) obj).a, new VoipEditTimeScheduledCallFragment.b(1, voipEditTimeScheduledCallFragment, VoipEditTimeScheduledCallFragment.class, "handleState", "handleState(Lcom/vk/voip/ui/scheduled/creation/ui/VoipScheduleCallViewState$ScreenState;)V", 0));
                break;
            case 21:
                ((VoipHistoryFriendsFragment) obj2).Q.a(a.c.a);
                break;
            case 22:
                ((nrw0) obj2).q(xcw0.f0.a);
                break;
            case 23:
                int i6 = y5x0.l1;
                ((f6x0) obj2).n.onNext(f6x0.b.EMPTY);
                break;
            default:
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                tkx0 tkx0Var = (tkx0) ((xkx0) obj2).a;
                if (tkx0Var != null) {
                    tkx0Var.wa(vKApiExecutionException.t(), null, null);
                }
                break;
        }
        return s3q0.a;
    }
}
