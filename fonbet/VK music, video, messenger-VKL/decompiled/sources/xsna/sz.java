package xsna;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.articles.ArticleFragment;
import com.vk.bridges.ImageViewer;
import com.vk.channels.api.Channel;
import com.vk.clips.entrypoints.ui.ClipsEntryPointDraftsFragment;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.tool.view.viewer.feed.wrapper.fragment.FragmentContainerFrameLayout;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.common.links.LaunchContext;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.stories.entities.StoryImSharingData;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.libvideo.autoplay.a;
import com.vk.log.L;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.newsfeed.posting.additional_settings.presentation.base.fragment.AdditionalSettingsFragment;
import com.vk.photos.root.albums.presentation.c;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.app.AppLifecycleEvent;
import com.vk.superapp.api.internal.requests.app.AddActionSuggestion;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c11;
import xsna.ca9;
import xsna.ks0;
import xsna.o2j;
import xsna.pwh;
import xsna.r2c;
import xsna.syc;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class sz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v139, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [com.vk.im.ui.components.contacts.a$a] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        q8e Bo;
        q8e Bo2;
        q8e Bo3;
        com.vk.libvideo.autoplay.a config;
        a.InterfaceC1207a interfaceC1207a;
        int size;
        int size2;
        int i;
        int i2 = this.b;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) obj2;
                aVar.f = (AddActionSuggestion) obj;
                aVar.g(AppLifecycleEvent.ON_START, null);
                return s3q0.a;
            case 1:
                AdditionalSettingsFragment additionalSettingsFragment = (AdditionalSettingsFragment) obj2;
                ks0 ks0Var = (ks0) obj;
                qcy<Object>[] qcyVarArr = AdditionalSettingsFragment.U;
                if (ks0Var instanceof ks0.b) {
                    maz.c(xwk.d().e(), additionalSettingsFragment.requireContext(), ((String) additionalSettingsFragment.S.getValue()) + ((ks0.b) ks0Var).a, new LaunchContext(false, false, false, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.POSTING_SETTINGS), null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108855), null, null, 24);
                } else if (ks0Var instanceof ks0.a) {
                    AdditionalSettingsState additionalSettingsState = ((ks0.a) ks0Var).a;
                    if (additionalSettingsState instanceof AdditionalSettingsState.Data) {
                        Intent intent = new Intent();
                        AdditionalSettingsState.Data data = (AdditionalSettingsState.Data) additionalSettingsState;
                        intent.putExtras(yfb.b(new Pair("ADDITIONAL_SETTINGS_CONFIGURATION_KEY", data.g), new Pair("IS_COMMENT_CHANGE_AVAILABLE", Boolean.valueOf(data.e))));
                        additionalSettingsFragment.Mf(11, intent);
                    } else {
                        additionalSettingsFragment.finish();
                    }
                } else if (ks0Var instanceof ks0.g) {
                    additionalSettingsFragment.fo(R.string.additional_settings_advertising_removed, R.drawable.vk_icon_loudspeaker_slash_outline_28, R.attr.vk_ui_icon_negative);
                } else if (ks0Var instanceof ks0.f) {
                    additionalSettingsFragment.fo(R.string.additional_settings_advertising_not_allowed, R.drawable.vk_icon_error_circle_outline_28, R.attr.vk_ui_icon_negative);
                } else if (ks0Var instanceof ks0.e) {
                    additionalSettingsFragment.fo(R.string.additional_settings_no_sign_with_coauthors, R.drawable.vk_icon_signature_outline_28, R.attr.vk_ui_icon_accent_themed);
                } else if (ks0Var instanceof ks0.d) {
                    additionalSettingsFragment.fo(R.string.additional_settings_sign_can_be_enabled_only_by_author, R.drawable.vk_icon_error_circle_outline_28, R.attr.vk_ui_icon_accent_themed);
                } else {
                    if (!(ks0Var instanceof ks0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ks0.c cVar = (ks0.c) ks0Var;
                    hf8.a(new Intent("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS").putExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS_CONFIG", cVar.a).putExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_ADDITIONAL_SETTINGS_COMMENT_CHANGE", cVar.b).putExtra("com.vk.newsfeed.posting.BROADCAST_POSTING_SCREEN_UNIQUE_ID", cVar.c));
                }
                return s3q0.a;
            case 2:
                ((com.vk.clips.sdk.shared.item.ads.d) obj2).d.getClass();
                return new c11.b(((tj50.a) obj).a(new kz0(i3), ao8.d));
            case 3:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((com.vk.photos.root.albums.presentation.b) obj2).T(new c.g.a(th));
                return s3q0.a;
            case 4:
                int i4 = ArticleFragment.E0;
                ((ArticleFragment) obj2).R2((PollAttachment) obj);
                return s3q0.a;
            case 5:
                lyd.a.a("AudioExtractionEditorController", (Throwable) obj);
                aqw.m(R.string.vk_error, ((on4) obj2).a);
                return s3q0.a;
            case 6:
                Object obj3 = ((cj6) obj2).o;
                ((km90) (obj3 != null ? obj3 : null)).H1();
                return s3q0.a;
            case 7:
                m99 m99Var = (m99) obj2;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, set, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -131073, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 8:
                StoryImSharingData storyImSharingData = (StoryImSharingData) obj2;
                ArrayList o = e43.o((mat0) obj);
                StoryImSharingData.VideoMsg videoMsg = storyImSharingData instanceof StoryImSharingData.VideoMsg ? (StoryImSharingData.VideoMsg) storyImSharingData : null;
                return new tam0(null, o, false, null, null, false, false, null, null, null, null, null, false, null, null, null, false, videoMsg != null ? videoMsg.f : null, storyImSharingData.d(), 131064);
            case 9:
                ((com.vk.channels.impl.channel_screen.footer.d) obj2).k.onNext(((Channel) obj).t);
                return s3q0.a;
            case 10:
                gza gzaVar = (gza) obj2;
                int intValue = ((Integer) obj).intValue();
                ImageViewer.c<AttachForMediaViewer> cVar2 = gzaVar.e;
                if (cVar2 != null) {
                    cVar2.a(true);
                }
                gzaVar.b().k.f(MsgIdType.CNV_ID, intValue, true, "scrollToMsg");
                return s3q0.a;
            case 11:
                ((ikv0) obj).a();
                ((i9b) obj2).i();
                return s3q0.a;
            case 12:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new cg1(5, (ymb) obj2, (DialogExt) obj));
                return s3q0.a;
            case 13:
                ((vsb) obj2).a.c();
                return s3q0.a;
            case 14:
                ((q5c) obj2).b.a(new r2c.p((String) obj));
                return s3q0.a;
            case 15:
                ((a8c) obj2).getClass();
                a8c.f((tr90) obj);
                return s3q0.a;
            case 16:
                ((ClassifiedsCatalogSimpleRootVh) obj2).n0();
                return s3q0.a;
            case 17:
                ((w6d) obj2).e.a(l5d.b);
                return s3q0.a;
            case 18:
                c9d c9dVar = (c9d) obj2;
                c9dVar.v(new ec(c9dVar, 26));
                return s3q0.a;
            case 19:
                zld zldVar = ((cmd) obj2).C;
                if (zldVar != null) {
                    zldVar.a();
                }
                return s3q0.a;
            case 20:
                ((ClipsEntryPointDraftsFragment) obj2).U = (List) obj;
                return s3q0.a;
            case 21:
                ((o3e) obj2).l.invoke(a.e.b);
                return s3q0.a;
            case 22:
                ((p3h) obj2).invoke();
                return s3q0.a;
            case 23:
                ShortVideoMyTargetMapperTracker shortVideoMyTargetMapperTracker = (ShortVideoMyTargetMapperTracker) obj2;
                Throwable th2 = (Throwable) obj;
                com.vk.metrics.eventtracking.b.a.a(th2);
                if (shortVideoMyTargetMapperTracker != null) {
                    shortVideoMyTargetMapperTracker.a(ShortVideoMyTargetMapperTracker.MyTargetType.CAROUSEL, th2);
                }
                return s3q0.a;
            case 24:
                p2f p2fVar = (p2f) obj2;
                int intValue2 = ((Integer) obj).intValue();
                z3o0 z3o0Var = p2fVar.d;
                int i5 = z3o0Var.d;
                z3o0Var.d = intValue2;
                if (i5 != intValue2 && p2fVar.a.getScrollState() == 0) {
                    i1e i1eVar = p2fVar.b;
                    i1eVar.f(false);
                    i1eVar.e();
                }
                return s3q0.a;
            case 25:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj2;
                qtf qtfVar = (qtf) obj;
                xuf xufVar = clipsWrapperFragment.G0;
                if (xufVar != null) {
                    syc sycVar = (syc) clipsWrapperFragment.r0.getValue();
                    tqf tqfVar = qtfVar.a;
                    int i6 = tqfVar.a;
                    hfz hfzVar = tqfVar.c;
                    View view = clipsWrapperFragment.getView();
                    ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                    FragmentContainerFrameLayout r = xufVar.r();
                    ClipFeedListFragment lo = clipsWrapperFragment.lo();
                    sycVar.getClass();
                    if ((hfzVar instanceof FeedItem.d) && lo != null) {
                        ((dzc) lo.l1.getValue()).f = true;
                        FeedItem.d dVar = (FeedItem.d) hfzVar;
                        sycVar.h = dVar;
                        if (viewGroup != null && (Bo3 = lo.Bo()) != null) {
                            SdkVideoFile k = dVar.k();
                            ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType = ClipFeedTooltip$ClipFeedTooltipType.FAST_FORWARD_ONBOARDING;
                            if (lo.Ue(k, clipFeedTooltip$ClipFeedTooltipType).a) {
                                lo.X6(dVar.k(), clipFeedTooltip$ClipFeedTooltipType, null);
                                yg5 R = d370.R(dVar.j());
                                sycVar.e(viewGroup, Bo3, new syc.a.c((R == null || (config = R.getConfig()) == null || (interfaceC1207a = config.l) == null) ? 0L : interfaceC1207a.getSessionId()));
                                sycVar.i = true;
                            }
                        }
                        if (r != null && (Bo2 = lo.Bo()) != null) {
                            if (i6 != 0) {
                                sycVar.b.a(ClipFeedTooltip$ClipFeedTooltipType.SCROLL_ONBOARDING);
                            } else {
                                SdkVideoFile k2 = dVar.k();
                                ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType2 = ClipFeedTooltip$ClipFeedTooltipType.SCROLL_ONBOARDING;
                                if (lo.Ue(k2, clipFeedTooltip$ClipFeedTooltipType2).a) {
                                    lo.X6(dVar.k(), clipFeedTooltip$ClipFeedTooltipType2, null);
                                    sycVar.e(r, Bo2, syc.a.f.c);
                                    sycVar.i = true;
                                }
                            }
                        }
                        if (!sycVar.c && !sycVar.i && r != null && (Bo = lo.Bo()) != null) {
                            SdkVideoFile k3 = dVar.k();
                            ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType3 = ClipFeedTooltip$ClipFeedTooltipType.AUTHOR_SWIPE_ONBOARDING;
                            if (lo.Ue(k3, clipFeedTooltip$ClipFeedTooltipType3).a) {
                                lo.X6(dVar.k(), clipFeedTooltip$ClipFeedTooltipType3, null);
                                sycVar.e(r, Bo, syc.a.C3705a.c);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 26:
                ((d4h) obj2).i.invoke((CommunityProfileAction) obj);
                return s3q0.a;
            case 27:
                jwh jwhVar = (jwh) obj2;
                mzp0 mzp0Var = jwhVar.h;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                jwhVar.T(pwh.c.b);
                return s3q0.a;
            case 28:
                L.g("Rooms were not created", (Throwable) obj);
                ((a2j) obj2).T(o2j.i.b);
                return s3q0.a;
            default:
                com.vk.im.ui.components.contacts.a aVar2 = (com.vk.im.ui.components.contacts.a) obj2;
                ?? r1 = aVar2.b1().r;
                if (aVar2.d1() && aVar2.b1().d().k.a) {
                    size2 = aVar2.b1().t;
                    i = aVar2.b1().s;
                } else {
                    if (!aVar2.d1() || !aVar2.b1().d().k.b) {
                        size = r1.size();
                        aVar2.m.k(size, r1);
                        return s3q0.a;
                    }
                    size2 = r1.size();
                    i = aVar2.b1().s;
                }
                size = size2 + i;
                aVar2.m.k(size, r1);
                return s3q0.a;
        }
    }
}
