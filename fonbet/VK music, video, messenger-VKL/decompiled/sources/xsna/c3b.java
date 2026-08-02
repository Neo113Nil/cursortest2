package xsna;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.clips.design.view.nps.internal.stars.CatalogStarsFeedbackView;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestion;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestionLayout;
import com.vk.clips.internal.nps.api.model.InternalNpsQuestions;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.internal.nps.impl.view.NpsFeatureModel;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.video.VideoAlbum;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistActionItem;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;
import com.vk.log.L;
import com.vk.superapp.ui.views.horizontalscroll.WidthSpreaderLayoutManager;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.OkOwnCameraController;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import xsna.aex;
import xsna.d3b;
import xsna.el3;
import xsna.gm50;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class c3b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c3b(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryEntry b;
        com.vk.video.ui.share.api.b bVar;
        int i;
        int i2 = 4;
        int i3 = 0;
        switch (this.b) {
            case 0:
                d3b d3bVar = (d3b) this.c;
                Context context = (Context) this.d;
                String str = (String) this.e;
                int i4 = d3b.a.$EnumSwitchMapping$0[((LinkAction) obj).ordinal()];
                if (i4 == 2) {
                    fvr.l(context, str);
                    edw.i(R.string.vkim_copy_to_clipboard_done, context);
                } else if (i4 == 4) {
                    d3bVar.d.e(context, str);
                }
                return s3q0.a;
            case 1:
                kjx kjxVar = (kjx) this.c;
                u7a u7aVar = (u7a) this.d;
                CatalogStarsFeedbackView catalogStarsFeedbackView = (CatalogStarsFeedbackView) this.e;
                NpsFeatureModel npsFeatureModel = (NpsFeatureModel) obj;
                yzt0<QuestionsTexts> yzt0Var = u7aVar.b;
                eo6 eo6Var = new eo6(kjxVar, catalogStarsFeedbackView, npsFeatureModel, i2);
                View view = kjxVar.c;
                gm50.a.a(kjxVar, yzt0Var, eo6Var);
                InternalNpsQuestions internalNpsQuestions = npsFeatureModel.d;
                InternalNpsQuestion internalNpsQuestion = internalNpsQuestions.d.get(internalNpsQuestions.c);
                InternalNpsQuestionLayout internalNpsQuestionLayout = internalNpsQuestion != null ? internalNpsQuestion.d : null;
                if (internalNpsQuestionLayout != null) {
                    ((VkText) view.findViewById(R.id.not_interesting)).setText(internalNpsQuestionLayout.d);
                    ((VkText) view.findViewById(R.id.interesting)).setText(internalNpsQuestionLayout.c);
                }
                return s3q0.a;
            case 2:
                MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) this.c;
                UIBlockMusicTrack uIBlockMusicTrack = (UIBlockMusicTrack) this.d;
                AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = (AudioFromMusicCatalogInfo) this.e;
                MusicClipsSelectorCatalogRootVh.a aVar = MusicClipsSelectorCatalogRootVh.J;
                musicClipsSelectorCatalogRootVh.q(((View) obj).getId(), uIBlockMusicTrack, audioFromMusicCatalogInfo);
                return s3q0.a;
            case 3:
                fqw0 fqw0Var = (fqw0) this.c;
                dhw0 dhw0Var = (dhw0) this.d;
                CallId callId = (CallId) this.e;
                Conversation conversation = (Conversation) obj;
                OKVoipEngine.b.getClass();
                wrj wrjVar = OKVoipEngine.E;
                if (!epx.f(wrjVar.getConversation(), conversation)) {
                    StringBuilder sb = new StringBuilder("\n                                    startCall: callPrepared, conversation mismatch. Our current is ");
                    Conversation conversation2 = wrjVar.getConversation();
                    sb.append(conversation2 != null ? conversation2.getConversationId() : null);
                    sb.append("\n                                    prepared by sdk is ");
                    sb.append(conversation.getConversationId());
                    sb.append("\n                                ");
                    L.l("OKVoipEngine", sb.toString());
                    conversation.release();
                    return s3q0.a;
                }
                ParticipantCollection participants = conversation.getParticipants();
                el3 el3Var = new el3(0);
                Iterator<ConversationParticipant> it = participants.iterator();
                while (it.hasNext()) {
                    el3Var.add(mnh0.E(it.next().getExternalId()));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                el3.a aVar2 = new el3.a();
                while (aVar2.hasNext()) {
                    linkedHashSet.add(((CallMemberId) aVar2.next()).b);
                }
                OKVoipEngine.B = ehw0.a(zqk0.a(fqw0Var.a, linkedHashSet, false, 4194175));
                wsw wswVar = OKVoipEngine.k.c;
                OKVoipEngine oKVoipEngine = OKVoipEngine.b;
                wswVar.m(oKVoipEngine, String.valueOf(fqw0Var.a.b), dhw0Var, callId, fqw0Var.d);
                OkOwnCameraController okOwnCameraController = OKVoipEngine.y;
                Application application = OKVoipEngine.w;
                okOwnCameraController.a(application != null ? application : null);
                oKVoipEngine.O(conversation);
                return s3q0.a;
            case 4:
                gzs gzsVar = (gzs) this.c;
                r2a0 r2a0Var = (r2a0) this.e;
                Context context2 = (Context) this.d;
                aex.a aVar3 = (aex.a) gzsVar.invoke();
                if (aVar3 != null && (b = aVar3.b()) != null) {
                    r2a0Var.a.d(context2, b);
                }
                return s3q0.a;
            case 5:
                VideoPlaylistBottomSheetRedesign videoPlaylistBottomSheetRedesign = (VideoPlaylistBottomSheetRedesign) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                gzs gzsVar2 = (gzs) this.e;
                VideoPlaylistBottomSheetRedesign.a aVar4 = videoPlaylistBottomSheetRedesign.a;
                izs<VideoPlaylistBottomSheetRedesign.Action, s3q0> izsVar = aVar4.c;
                VideoAlbum videoAlbum = aVar4.a;
                switch (VideoPlaylistBottomSheetRedesign.b.$EnumSwitchMapping$0[((VideoPlaylistActionItem) obj).ordinal()]) {
                    case 1:
                        if (izsVar != null) {
                            izsVar.invoke(VideoPlaylistBottomSheetRedesign.Action.ShowAuthor);
                        }
                        bpn0 bpn0Var = xwk.b;
                        ((o0r0) (bpn0Var != null ? bpn0Var : null).getValue()).m(fragmentActivity, videoAlbum.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                        break;
                    case 2:
                    case 3:
                        if (izsVar != null) {
                            izsVar.invoke(VideoPlaylistBottomSheetRedesign.Action.Share);
                        }
                        if (!BuildInfo.q()) {
                            bpn0 bpn0Var2 = o25.a;
                            if (bpn0Var2 == null) {
                                bpn0Var2 = null;
                            }
                            if (!((b25) bpn0Var2.getValue()).b()) {
                                bpn0 bpn0Var3 = nr4.m;
                                ((kbj0) (bpn0Var3 != null ? bpn0Var3 : null).getValue()).y(fragmentActivity, videoAlbum.Eb());
                                break;
                            } else {
                                bpn0 bpn0Var4 = nr4.m;
                                kbj0.c((kbj0) (bpn0Var4 != null ? bpn0Var4 : null).getValue(), fragmentActivity, videoAlbum.Eb(), false, null, null, false, 120);
                                break;
                            }
                        } else {
                            bpn0 bpn0Var5 = nr4.m;
                            ((kbj0) (bpn0Var5 != null ? bpn0Var5 : null).getValue()).s(fragmentActivity, videoAlbum, false);
                            break;
                        }
                    case 4:
                    case 5:
                        if (izsVar != null) {
                            izsVar.invoke(VideoPlaylistBottomSheetRedesign.Action.CopyLink);
                        }
                        Object systemService = fragmentActivity.getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        if (clipboardManager != null) {
                            String Eb = videoAlbum.Eb();
                            VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK_WITH_APP;
                            videoFeatures.getClass();
                            if (com.vk.toggle.b.A.a(videoFeatures) && (bVar = aVar4.e) != null) {
                                Eb = bVar.c(Eb);
                            }
                            clipboardManager.setPrimaryClip(ClipData.newPlainText(Eb, Eb));
                            cvk.u(R.string.link_copied, false);
                            break;
                        }
                        break;
                    case 6:
                        aVar4.b.invoke(fragmentActivity);
                        break;
                    case 7:
                        bpn0 bpn0Var6 = fxc0.a;
                        g7s0 g7s0Var = (g7s0) (bpn0Var6 != null ? bpn0Var6 : null).getValue();
                        int i5 = g7s0.G7;
                        g7s0Var.g(fragmentActivity, videoAlbum, true);
                        break;
                    case 8:
                        bpn0 bpn0Var7 = fxc0.a;
                        ((g7s0) (bpn0Var7 != null ? bpn0Var7 : null).getValue()).h(fragmentActivity, videoAlbum);
                        break;
                    case 9:
                        bpn0 bpn0Var8 = fxc0.a;
                        ((g7s0) (bpn0Var8 != null ? bpn0Var8 : null).getValue()).i0(fragmentActivity, videoAlbum.c, videoAlbum.b);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                gzsVar2.invoke();
                return s3q0.a;
            case 6:
                azl azlVar = (azl) this.c;
                wh50 wh50Var = (wh50) this.d;
                wh50 wh50Var2 = (wh50) this.e;
                q9x q9xVar = (q9x) obj;
                if (((Boolean) wh50Var.getValue()).booleanValue() && (i = (int) (q9xVar.a >> 32)) > 0) {
                    wh50Var2.setValue(new pco(azlVar.j1(i)));
                }
                return s3q0.a;
            default:
                WidthSpreaderLayoutManager widthSpreaderLayoutManager = (WidthSpreaderLayoutManager) this.c;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.d;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.e;
                View view2 = (View) obj;
                widthSpreaderLayoutManager.getClass();
                int measuredWidth = view2.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
                }
                int rightDecorationWidth = widthSpreaderLayoutManager.getRightDecorationWidth(view2) + widthSpreaderLayoutManager.getLeftDecorationWidth(view2);
                ref$IntRef.element = lr.a(measuredWidth, rightDecorationWidth, i3, ref$IntRef.element);
                ref$IntRef2.element = rightDecorationWidth + i3 + ref$IntRef2.element;
                return s3q0.a;
        }
    }

    public /* synthetic */ c3b(gzs gzsVar, r2a0 r2a0Var, Context context) {
        this.b = 4;
        this.c = gzsVar;
        this.e = r2a0Var;
        this.d = context;
    }
}
