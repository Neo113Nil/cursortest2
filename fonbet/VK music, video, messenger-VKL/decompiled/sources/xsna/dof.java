package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.util.Size;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.vk.catalog2.common.ui.mvp.holder.container.GridListVh;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.b;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.feed.design.view.newsfeed.reactionstack.FeedReactionsStack;
import com.vk.friends.impl.friends.presentation.fragment.FriendsSelectionFragment;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.im.engine.di.lifecycle.ImEngineLifecycleScopedComponentImpl;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.log.L;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.network.eventhub.impl.EventHubServiceClient;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.data.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.grishka.appkit.views.UsableRecyclerView;
import one.video.exo.codecs.DecoderSupportInfo;
import one.video.gl.GLESUtils;
import xsna.ikv0;
import xsna.qvq;
import xsna.ugl;
import xsna.v1j;
import xsna.woi0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dof implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dof(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int headerBiddingTokenCounter;
        FragmentActivity activity;
        Activity h;
        Window window;
        Object obj;
        DecoderSupportInfo.a aVar;
        boolean isSoftwareOnly;
        boolean isHardwareAccelerated;
        DecoderSupportInfo.CodecType codecType;
        r3 = false;
        boolean z = false;
        switch (this.b) {
            case 0:
                return ((ClipsViewerComponentImpl) this.c).m.p();
            case 1:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.c;
                w8e w8eVar = clipsWrapperFragment.q0;
                nwy nwyVar = clipsWrapperFragment.io().V;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[34];
                return new syc(w8eVar, (bd80) nwyVar.c(), ((Boolean) clipsWrapperFragment.po().q.getValue()).booleanValue());
            case 2:
                ClipsWrapperInputArguments clipsWrapperInputArguments = (ClipsWrapperInputArguments) this.c;
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a = clipsWrapperInputArguments.a();
                aVar2.getClass();
                return Boolean.valueOf(a != null ? a.getBoolean("ClipsWrapperFragment.disable_owner_swipe", false) : false);
            case 3:
                CommentThreadFragment commentThreadFragment = (CommentThreadFragment) this.c;
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                commentThreadFragment.finish();
                return s3q0.a;
            case 4:
                headerBiddingTokenCounter = ((SessionRepository) this.c).getHeaderBiddingTokenCounter();
                return Integer.valueOf(headerBiddingTokenCounter);
            case 5:
                jtg jtgVar = (jtg) this.c;
                jtgVar.g.a(4, false);
                gd60 a2 = hd60.a();
                Context requireContext = jtgVar.a.requireContext();
                CatchUpBanner catchUpBanner = jtgVar.b;
                a2.C(requireContext, catchUpBanner.c, null, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : null);
                b.d a3 = io.reactivex.rxjava3.processors.b.a("catch_up_link_action", "action", "click");
                a3.b(catchUpBanner.j, "track_code");
                a3.e();
                return Boolean.FALSE;
            case 6:
                c1h c1hVar = (c1h) this.c;
                q9x q9xVar = (q9x) ((zak0) c1hVar.h).getValue();
                int i = q9xVar != null ? (int) (q9xVar.a & 4294967295L) : 0;
                return Float.valueOf(((Number) c1hVar.n.getValue()).floatValue() * (-((((ljo0) ((zak0) c1hVar.j).getValue()) != null ? ((int) (4294967295L & r6.c)) - ((int) r6.b.b(0)) : 0) + i)));
            case 7:
                ((d3h) ((m3h) this.c).c.invoke()).i(null);
                return s3q0.a;
            case 8:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                int i2 = CommunityReviewsFragment.o0;
                c.u.f fVar = c.u.f.b;
                communityReviewsFragment.getClass();
                xn50.a.c(communityReviewsFragment, fVar);
                return s3q0.a;
            case 9:
                ((CommunityStaticCover.a.c) this.c).a.invoke();
                return s3q0.a;
            case 10:
                ((y89) this.c).invoke(new CommunityProfileAction.e.i.a(false));
                return s3q0.a;
            case 11:
                return (TextView) ((s5i) this.c).a.findViewById(R.id.nativeads_advertising_text);
            case 12:
                L.A(i5s.a(new StringBuilder("Standalone room "), ((v1j.j) this.c).b, " was created"));
                return s3q0.a;
            case 13:
                com.vk.profile.questions.impl.b bVar = (com.vk.profile.questions.impl.b) this.c;
                bVar.p1 = true;
                SchemeStat$TypeQuestionItem.Type type = SchemeStat$TypeQuestionItem.Type.SEND_QUESTION;
                t9k t9kVar = bVar.i1;
                if (t9kVar != null && t9kVar.g) {
                    z = true;
                }
                bVar.bo(type, Boolean.valueOf(z));
                bVar.dismiss();
                ContextWrapper ao = bVar.ao();
                if (ao != null && (activity = bVar.getActivity()) != null && (h = e3m.h(activity)) != null) {
                    ExtendedUserProfile extendedUserProfile = bVar.g1;
                    if (extendedUserProfile == null) {
                        extendedUserProfile = null;
                    }
                    String str = extendedUserProfile.d;
                    t9k t9kVar2 = bVar.i1;
                    String string = (t9kVar2 == null || !t9kVar2.g) ? h.getString(R.string.create_question_asked_to, str) : h.getString(R.string.create_question_asked_anonymus_to, str);
                    ikv0.a aVar3 = new ikv0.a(ao);
                    aVar3.u = new ikv0.d(string, (String) null, (ikv0.d.a) (false ? 1 : 0), 6);
                    aVar3.t = new ikv0.c.C3058c(R.drawable.vk_icon_animated_check_circle_on_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) (false ? 1 : 0), 12);
                    NavigationDelegateActivity navigationDelegateActivity = h instanceof NavigationDelegateActivity ? (NavigationDelegateActivity) h : null;
                    Object z2 = navigationDelegateActivity != null ? navigationDelegateActivity.Y().z() : null;
                    Dialog dialog = z2 instanceof Dialog ? (Dialog) z2 : null;
                    if (dialog == null || (window = dialog.getWindow()) == null) {
                        Window window2 = navigationDelegateActivity != null ? navigationDelegateActivity.getWindow() : null;
                        window = window2 == null ? h.getWindow() : window2;
                    }
                    i0q0.d(300L, new b0(3, aVar3, window));
                }
                return s3q0.a;
            case 14:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) this.c;
                b.C0739b c0739b = com.vk.core.compose.component.datetime.h.a;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
                simpleDateFormat.setLenient(false);
                return dateTimePickerState.d(simpleDateFormat, com.vk.core.compose.component.datetime.h.c);
            case 15:
                String str2 = ((DecoderSupportInfo) this.c).a;
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                ArrayList arrayList2 = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    if (!mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                break;
                            }
                            if (brm0.w(supportedTypes[i3], str2, true)) {
                                arrayList2.add(mediaCodecInfo);
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) it.next();
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType(str2);
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    ArrayList arrayList4 = new ArrayList(codecProfileLevelArr.length);
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        arrayList4.add(new DecoderSupportInfo.b(codecProfileLevel.profile, codecProfileLevel.level));
                    }
                    Integer upper = capabilitiesForType.getVideoCapabilities().getSupportedHeights().getUpper();
                    DecoderSupportInfo.CodecFormat.a aVar4 = DecoderSupportInfo.CodecFormat.Companion;
                    String name = mediaCodecInfo2.getName();
                    aVar4.getClass();
                    Iterator it2 = DecoderSupportInfo.CodecFormat.h().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            for (String str3 : ((DecoderSupportInfo.CodecFormat) obj).i()) {
                                if (!drm0.D(name, str3, true)) {
                                }
                            }
                        } else {
                            obj = null;
                        }
                    }
                    DecoderSupportInfo.CodecFormat codecFormat = (DecoderSupportInfo.CodecFormat) obj;
                    if (codecFormat == null) {
                        codecFormat = DecoderSupportInfo.CodecFormat.UNKNOWN;
                    }
                    DecoderSupportInfo.CodecFormat codecFormat2 = codecFormat;
                    if (Build.VERSION.SDK_INT >= 29) {
                        String name2 = mediaCodecInfo2.getName();
                        isSoftwareOnly = mediaCodecInfo2.isSoftwareOnly();
                        if (isSoftwareOnly) {
                            codecType = DecoderSupportInfo.CodecType.SW;
                        } else {
                            isHardwareAccelerated = mediaCodecInfo2.isHardwareAccelerated();
                            codecType = isHardwareAccelerated ? DecoderSupportInfo.CodecType.HW : DecoderSupportInfo.CodecType.UNKNOWN;
                        }
                        aVar = new DecoderSupportInfo.a(name2, codecType, codecFormat2, upper.intValue(), arrayList4);
                    } else {
                        aVar = new DecoderSupportInfo.a(mediaCodecInfo2.getName(), DecoderSupportInfo.CodecType.UNKNOWN, codecFormat2, upper.intValue(), arrayList4);
                    }
                    arrayList3.add(aVar);
                }
                return arrayList3;
            case 16:
                ugl.b bVar2 = ((ugl) this.c).s;
                if (bVar2 != null) {
                    return bVar2.a;
                }
                return null;
            case 17:
                return (VkText) ((u1o) this.c).findViewById(R.id.donut_post_video_duration);
            case 18:
                qop qopVar = (qop) this.c;
                ((tdk) qopVar.C.getValue()).a();
                o200 o200Var = (o200) qopVar.a;
                if (o200Var != null) {
                    o200Var.X2();
                }
                return s3q0.a;
            case 19:
                for (UsableRecyclerView.j jVar : (List) this.c) {
                    FeedGoodsPhotoHolder feedGoodsPhotoHolder = jVar instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) jVar : null;
                    if (feedGoodsPhotoHolder != null) {
                        feedGoodsPhotoHolder.n1();
                    }
                }
                return s3q0.a;
            case 20:
                xzp xzpVar = ((EventHubServiceClient) this.c).c;
                if (xzpVar != null) {
                    xzpVar.d(woi0.c.a);
                }
                return s3q0.a;
            case 21:
                ((n4r) this.c).c.invoke(qvq.j.c.b);
                return s3q0.a;
            case 22:
                com.vk.newsfeed.common.recycler.holders.a aVar5 = (com.vk.newsfeed.common.recycler.holders.a) this.c;
                FeedReactionsStack feedReactionsStack = aVar5.L;
                if (feedReactionsStack == null) {
                    return null;
                }
                return new g9p0((c1c0) aVar5.o0.getValue(), feedReactionsStack, aVar5.G);
            case 23:
                return ((com.vk.folders.impl.configure.c) this.c).p;
            case 24:
                ufs ufsVar = (ufs) this.c;
                lqj0 lqj0Var = ufsVar.i;
                if (lqj0Var != null) {
                    GLES20.glDeleteProgram(lqj0Var.a);
                    GLESUtils.c("glDeleteProgram", new int[0]);
                }
                ufsVar.i = null;
                r1t r1tVar = ufsVar.j;
                if (r1tVar != null) {
                    r1tVar.a();
                }
                ufsVar.j = null;
                r1t r1tVar2 = ufsVar.k;
                if (r1tVar2 != null) {
                    r1tVar2.a();
                }
                ufsVar.k = null;
                s1t s1tVar = ufsVar.l;
                if (s1tVar != null) {
                    s1tVar.b();
                }
                ufsVar.l = null;
                rva0 rva0Var = ufsVar.t;
                if (rva0Var != null) {
                    rva0Var.c();
                }
                ufsVar.t = null;
                np4 np4Var = ufsVar.s;
                if (np4Var != null) {
                    np4Var.c.release();
                }
                ufsVar.s = null;
                return s3q0.a;
            case 25:
                FriendsImportFragment friendsImportFragment = (FriendsImportFragment) this.c;
                int i4 = FriendsImportFragment.a0;
                FragmentActivity activity2 = friendsImportFragment.getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                return s3q0.a;
            case 26:
                FriendsSelectionFragment friendsSelectionFragment = (FriendsSelectionFragment) this.c;
                int i5 = FriendsSelectionFragment.w0;
                Object obj2 = friendsSelectionFragment.h0;
                ((md6) (obj2 != null ? obj2 : null)).g();
                return s3q0.a;
            case 27:
                return new i8u((vig0) ((y4u) this.c).s.getValue());
            case 28:
                RecyclerView recyclerView = ((GridListVh) this.c).n;
                return (recyclerView != null ? recyclerView : null).getContext();
            default:
                ImEngineLifecycleScopedComponentImpl imEngineLifecycleScopedComponentImpl = (ImEngineLifecycleScopedComponentImpl) this.c;
                acw acwVar = imEngineLifecycleScopedComponentImpl.a;
                return acwVar.a ? new s1w(sdy.n(acwVar)) : ((ImEngineLifecycleComponent) imEngineLifecycleScopedComponentImpl.b.getValue()).N();
        }
    }
}
