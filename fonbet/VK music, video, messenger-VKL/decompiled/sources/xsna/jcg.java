package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.Attachment;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.network.eventhub.api.di.EventHubComponent;
import com.vk.network.eventhub.impl.di.EventHubApiComponent;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.details.impl.name_history.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.xey;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class jcg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jcg(FragmentImpl fragmentImpl, vlp0 vlp0Var) {
        this.b = 19;
        this.c = fragmentImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 26;
        Object obj = this.c;
        switch (i) {
            case 0:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                afg Co = ((CommentThreadFragment) obj).Co();
                if (Co != null) {
                    mdg mdgVar = (mdg) Co;
                    if (mdgVar.O != null) {
                        mdgVar.e.L7();
                    }
                }
                break;
            case 1:
                break;
            case 2:
                c1h c1hVar = (c1h) obj;
                q9x q9xVar = (q9x) ((zak0) c1hVar.e).getValue();
                int i3 = q9xVar != null ? (int) (q9xVar.a & 4294967295L) : 0;
                q9x q9xVar2 = (q9x) ((zak0) c1hVar.i).getValue();
                int i4 = q9xVar2 != null ? (int) (q9xVar2.a & 4294967295L) : 0;
                ljo0 ljo0Var = (ljo0) ((zak0) c1hVar.j).getValue();
                int b = (ljo0Var != null ? ((int) (ljo0Var.c & 4294967295L)) - ((int) ljo0Var.b.b(0)) : 0) + i3;
                float c = (((((q9x) ((zak0) c1hVar.h).getValue()) != null ? (int) (r0.a & 4294967295L) : 0) + b) + i4) - cn70.c(20);
                if (c < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    c = 0.0f;
                }
                break;
            case 3:
                CommunityNameHistoryFragment communityNameHistoryFragment = (CommunityNameHistoryFragment) obj;
                int i5 = CommunityNameHistoryFragment.S;
                a.C1555a c1555a = a.C1555a.b;
                communityNameHistoryFragment.getClass();
                xn50.a.c(communityNameHistoryFragment, c1555a);
                break;
            case 4:
                vvh vvhVar = (vvh) obj;
                s530 pa = ((ModerationComponent) ((k7m) m7m.f(vvhVar)).mo408a(fpf0.a(ModerationComponent.class))).pa();
                FragmentImpl fragmentImpl = vvhVar.c;
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                q5i q5iVar = (q5i) obj;
                cr4 cr4Var = q5iVar.E;
                Attachment attachment = q5iVar.D;
                AudioAttachment audioAttachment = attachment instanceof AudioAttachment ? (AudioAttachment) attachment : null;
                if (audioAttachment != null) {
                    MusicTrack musicTrack = audioAttachment.f;
                    if (cr4Var.c().i(musicTrack) || musicTrack.l) {
                        q5iVar.Y6().a(itg0.l(hg1.l(q5iVar.Y6().b(musicTrack, audioAttachment.h), q5iVar.itemView.getContext(), 62).i(new h60(o5i.b, 18))));
                    } else if (cr4Var.c().i0(musicTrack)) {
                        q5iVar.Y6().a(itg0.l(hg1.l(q5iVar.Y6().l(musicTrack), q5iVar.itemView.getContext(), 62).i(new ov2(p5i.b, 12))));
                    }
                }
                break;
            case 8:
                mc90 mc90Var = (mc90) obj;
                break;
            case 9:
                int i6 = CustomisableBottomSheetFragment.S;
                break;
            case 10:
                efm efmVar = ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj).e;
                if (efmVar != null) {
                    efmVar.p();
                }
                break;
            case 11:
                mo60 mo60Var = ((a3n) obj).a;
                break;
            case 12:
                ((k5n) obj).o0.e();
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                EventHubApiComponent eventHubApiComponent = (EventHubApiComponent) obj;
                EventHubComponent eventHubComponent = eventHubApiComponent.a;
                qzp c9 = eventHubComponent.c9();
                wzp A5 = eventHubComponent.A5();
                nwy nwyVar = eventHubApiComponent.c;
                qcy<Object> qcyVar = EventHubApiComponent.e[0];
                bv90 bv90Var = (bv90) nwyVar.c();
                hzp hzpVar = eventHubApiComponent.b;
                break;
            case 17:
                break;
            case 18:
                f6s f6sVar = (f6s) obj;
                q6s j7 = f6sVar.j7();
                if (j7 != null) {
                    f6sVar.p7(j7, new k4(6, f6sVar, j7)).invoke();
                }
                break;
            case 19:
                FragmentImpl fragmentImpl2 = (FragmentImpl) obj;
                fragmentImpl2.x = false;
                if (fragmentImpl2.isVisible()) {
                    fragmentImpl2.Vn();
                }
                break;
            case 20:
                vvs vvsVar = (vvs) obj;
                int i7 = vvs.C;
                break;
            case 21:
                break;
            case 22:
                ((g8u) obj).n.a();
                break;
            case 23:
                int i8 = GroupedNotificationsFragment.f0;
                break;
            case 24:
                m5v m5vVar = (m5v) obj;
                m5vVar.q.b(NarrativePublishEventType.DELETE_NARRATIVE, m5vVar.p, m5vVar.q6());
                m5vVar.n.l2(m5vVar.q6().b);
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                mbx mbxVar = (mbx) obj;
                int i9 = ify.a;
                mbxVar.c(R.attr.vk_ui_icon_negative, R.drawable.vk_icon_error_circle_outline_24, R.string.err_internal, ify.e(ify.c) ? iah0.a(16) + ify.d(3, null) : iah0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE), mbxVar.a.getView());
                break;
            case 28:
                ((xey) obj).G(xey.e.b);
                break;
            default:
                j210 j210Var = (j210) obj;
                h210 h210Var = j210Var.n;
                if (h210Var != null) {
                    j210Var.l.f(h210Var.b);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jcg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
