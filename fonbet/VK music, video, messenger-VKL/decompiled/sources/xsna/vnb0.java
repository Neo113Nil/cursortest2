package xsna;

import android.app.Dialog;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.video.dto.VideoSetNotificationsStatusStatusDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.search.ui.SearchLocationPermissionsController;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.impl.presentation.stories.util.StoryQuestionMessageDialog;
import com.vk.superapp.bridges.dto.tapandpay.VkTokenizationNetworkName;
import com.vk.video.ui.discovery.minimizable.n;
import com.vkontakte.android.attachments.StoryAttachment;
import java.util.Collections;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import xsna.srw0;
import xsna.wqs0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vnb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vnb0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 4;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj;
                ((wh50) obj2).setValue(str);
                ((izs) obj3).invoke(str);
                return s3q0.a;
            case 1:
                SearchLocationPermissionsController.a.b((String) obj3, false, false, false);
                ((gzs) obj2).invoke();
                return s3q0.a;
            case 2:
                StoryQuestionMessageDialog storyQuestionMessageDialog = (StoryQuestionMessageDialog) obj3;
                int i3 = StoryQuestionMessageDialog.W;
                String obj4 = drm0.p0(String.valueOf(((VkInputSelect) obj2).getText())).toString();
                if (obj4.length() != 0) {
                    StringBuilder b = ho8.b(obj4, "\n\n🗣 ");
                    StoryQuestionEntry storyQuestionEntry = storyQuestionMessageDialog.U;
                    if (storyQuestionEntry == null) {
                        storyQuestionEntry = null;
                    }
                    b.append(storyQuestionEntry.d);
                    String sb = b.toString();
                    iul0 a = qxi.a();
                    StoryQuestionEntry storyQuestionEntry2 = storyQuestionMessageDialog.U;
                    if (storyQuestionEntry2 == null) {
                        storyQuestionEntry2 = null;
                    }
                    UserId userId = storyQuestionEntry2.c;
                    StoryEntry storyEntry = storyQuestionMessageDialog.T;
                    if (storyEntry == null) {
                        storyEntry = null;
                    }
                    a.j(storyQuestionMessageDialog, userId, sb, Collections.singletonList(new StoryAttachment(storyEntry, null, 2, null)));
                    ai9 ai9Var = storyQuestionMessageDialog.V;
                    if (ai9Var != null) {
                        ai9Var.invoke();
                    }
                }
                Dialog dialog = storyQuestionMessageDialog.s;
                if (dialog != null) {
                    dialog.dismiss();
                }
                return s3q0.a;
            case 3:
                Peer peer = (Peer) obj3;
                fyn0 fyn0Var = (fyn0) obj2;
                com.vk.im.engine.models.dialogs.Dialog dialog2 = (com.vk.im.engine.models.dialogs.Dialog) ((wpp) obj).c.get(Long.valueOf(peer.b));
                return dialog2 != null ? io.reactivex.rxjava3.core.x.k(dialog2) : fyn0Var.j.C(fyn0Var, new tqm(peer, Source.NETWORK)).q(asu0.a.c()).l(new x310(new alj0(peer, 10), 12));
            case 4:
                gzs gzsVar = (gzs) obj2;
                jdo0 jdo0Var = (jdo0) obj;
                ((gzs) obj3).invoke();
                if (gzsVar != null ? ((Boolean) gzsVar.invoke()).booleanValue() : true) {
                    jdo0Var.close();
                }
                return s3q0.a;
            case 5:
                ((fy0) obj3).invoke();
                ((utj) obj).b();
                ((bdr0) obj2).c = null;
                return s3q0.a;
            case 6:
                ((izs) obj3).invoke(new wqs0.l.d((BlockId.CompositeId) obj2, (VideoTextureView) obj));
                return s3q0.a;
            case 7:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj3;
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, (com.vk.video.ui.discovery.minimizable.q) obj2, Boolean.TRUE, null, 4)));
                return s3q0.a;
            case 8:
                VideoSetNotificationsStatusStatusDto videoSetNotificationsStatusStatusDto = (VideoSetNotificationsStatusStatusDto) obj3;
                UserId userId2 = (UserId) obj2;
                if (((BaseOkResponseDto) obj) == BaseOkResponseDto.OK) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                return io.reactivex.rxjava3.core.a.k(new IllegalStateException("Failure to set notifications status = " + videoSetNotificationsStatusStatusDto + " for user = " + userId2));
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                a3x0.p(((srw0) obj3).a, MobileOfficialAppsCallsStat$TypeVoipCallItem.CallEventType.ALL_MICS_DISABLED, ((srw0.b.C3687b) obj2).a, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL, com.vk.voip.ui.c.b.s0(), null, bool, 1073479538);
                return s3q0.a;
            default:
                final y2o0 y2o0Var = (y2o0) obj3;
                final VkTokenizationNetworkName vkTokenizationNetworkName = (VkTokenizationNetworkName) obj2;
                final String str2 = (String) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.qax0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4;
                        int i5 = zbv0.$EnumSwitchMapping$0[vkTokenizationNetworkName.ordinal()];
                        if (i5 == 1) {
                            i4 = 3;
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i4 = 4;
                        }
                        y2o0 y2o0Var2 = y2o0.this;
                        return dv90.a(y2o0Var2.a.getTokenStatus(y2o0Var2.asGoogleApiClient(), i4, str2), w65.g);
                    }
                }).U(new i630(new r45(str2, i2), 25));
        }
    }
}
