package xsna;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.photoviewer.PhotoViewer;
import com.vk.profile.user.impl.ui.ModalUserProfileFragment;
import com.vk.sharing.core.view.InterceptingBottomSheetBehavior;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import ru.ok.android.webrtc.videotracks.ParticipantsAgnosticRemoteVideoTracks;
import xsna.mxy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class tnf implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tnf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 8;
        Object obj = this.c;
        switch (i) {
            case 0:
                com.vk.clips.editor.templates.impl.player.a.this.w();
                break;
            case 1:
                ((o7j) obj).accept(new erx0(EmptyList.b));
                break;
            case 2:
                ImContactsListFragment imContactsListFragment = (ImContactsListFragment) obj;
                qcy<Object>[] qcyVarArr = ImContactsListFragment.k0;
                if (imContactsListFragment.getView() != null) {
                    imContactsListFragment.io().b1();
                    AppBarLayout.d dVar = (AppBarLayout.d) imContactsListFragment.ho().getLayoutParams();
                    imContactsListFragment.e0 = dVar.a;
                    dVar.a = 0;
                    break;
                }
                break;
            case 3:
                x750 x750Var = ((InterceptingBottomSheetBehavior) obj).l0;
                if (x750Var != null) {
                    x750Var.invoke();
                    break;
                }
                break;
            case 4:
                ((yv50) obj).t();
                break;
            case 5:
                ModalUserProfileFragment modalUserProfileFragment = (ModalUserProfileFragment) obj;
                ModalBottomSheetBehavior<View> modalBottomSheetBehavior = modalUserProfileFragment.z0;
                if (modalBottomSheetBehavior != null) {
                    modalBottomSheetBehavior.O(4);
                }
                ModalUserProfileFragment.b bVar = new ModalUserProfileFragment.b(modalUserProfileFragment);
                modalUserProfileFragment.y0 = bVar;
                ModalBottomSheetBehavior<View> modalBottomSheetBehavior2 = modalUserProfileFragment.z0;
                if (modalBottomSheetBehavior2 != null) {
                    modalBottomSheetBehavior2.u = bVar;
                    break;
                }
                break;
            case 6:
                ((ParticipantsAgnosticRemoteVideoTracks) obj).a();
                break;
            case 7:
                ((PhotoViewer) obj).l();
                break;
            case 8:
                VkBottomSheetBehavior<FrameLayout> vkBottomSheetBehavior = ((PostingAttachActivity) obj).Q;
                if (vkBottomSheetBehavior != null) {
                    vkBottomSheetBehavior.J(3);
                    break;
                }
                break;
            case 9:
                RecyclerPaginatedView recyclerPaginatedView = ((afi0) obj).j;
                if (recyclerPaginatedView != null) {
                    recyclerPaginatedView.setVisibility(8);
                    break;
                }
                break;
            case 10:
                jtl0 jtl0Var = (jtl0) obj;
                m9n m9nVar = m9n.b;
                hg1.i(((bsl0) m9n.e.getValue()).c(false).m(io.reactivex.rxjava3.android.schedulers.a.b()), new defpackage.c(15, jtl0Var.itemView.getContext(), new stg0(jtl0Var, i2)));
                anm0.E((anm0) jtl0Var.v.getValue(), StoryViewAction.DISCOVER_HIDE, jtl0Var.q, MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER, null, null, 56);
                break;
            case 11:
                com.vk.story.viewer.impl.presentation.stories.b bVar2 = (com.vk.story.viewer.impl.presentation.stories.b) obj;
                qo6 currentStoryView = bVar2.getCurrentStoryView();
                if (currentStoryView instanceof dan) {
                    bVar2.H.e(0, 0, currentStoryView);
                    break;
                }
                break;
            case 12:
                ((gzs) obj).invoke();
                break;
            case 13:
                rxo0 rxo0Var = (rxo0) obj;
                rxo0Var.a.play(rxo0Var.c[2], 1.0f, 1.0f, 0, 0, 1.0f);
                break;
            case 14:
                VideoView videoView = (VideoView) obj;
                VideoView.b bVar3 = videoView.v;
                if (bVar3 != null) {
                    bVar3.a(false);
                }
                d3m.e(videoView.getViewBinding().o, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                videoView.p0 = null;
                break;
            case 15:
                mxy0.a aVar = (mxy0.a) obj;
                aVar.e = null;
                if (aVar.d == 0) {
                    aVar.d = 1;
                    aVar.a.run();
                    break;
                }
                break;
            case 16:
                ((yads.kb0) obj).d();
                break;
            default:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    gu8.c(null, "WebFormVKBridgeParser: can't parse CopyText post message");
                    break;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("status_bar_style")) {
                            jSONObject.optString("status_bar_style");
                        }
                        String optString = jSONObject.optString("action_bar_color");
                        if (!TextUtils.isEmpty(optString)) {
                            Color.parseColor(optString);
                        }
                        String optString2 = jSONObject.optString("navigation_bar_color");
                        if (!TextUtils.isEmpty(optString2)) {
                            Color.parseColor(optString2);
                            break;
                        }
                    } catch (Throwable th) {
                        eb3.a(null, new StringBuilder("WebFormVKBridgeParser: can't parse SetViewSettings post message: "), th);
                    }
                }
                break;
        }
    }

    public /* synthetic */ tnf(waz0 waz0Var, String str) {
        this.b = 17;
        this.c = str;
    }
}
