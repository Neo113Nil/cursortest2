package xsna;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.clips.upload.vk.ui.api.ClipUploadScreenRuntimeConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadScreenStaticConfig;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$AutoRepostToStoryWithLikes;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DelayedPublication;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DraftsSave;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$DraftsUi;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$EasyPromote;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$OpenChannelFromClip;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$OpenEditor;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$Playlists;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$PostingRedirectBanner;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$Products;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$PublishOnlyFromGroups;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$TrendingHashtags;
import com.vk.clips.upload.vk.ui.impl.ClipUploadScreenFeature$TrendingHashtagsLanding;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.design.view.listitem.infobar.FriendsBirthdayInfoBarView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.photo.editor.markup.view.tools.BrushesPanel;
import com.vk.photo.editor.markup.view.tools.SizeCircleView;
import com.vk.photo.editor.markup.view.tools.SizeSeekBarView;
import com.vk.photo.editor.markup.view.tools.button.ColorButton;
import com.vk.photo.editor.markup.view.tools.button.PipetteButton;
import com.vk.profile.community.creationonboarding.api.models.CommunityCreationOnboardingFinishArguments;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.ldm;
import xsna.oap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class pff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pff(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ClipUploadScreenRuntimeConfig clipUploadScreenRuntimeConfig;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) obj;
                String str = ClipsUploadFragmentImpl.a0;
                iff fo = clipsUploadFragmentImpl.fo();
                oap oapVar = (oap) clipsUploadFragmentImpl.R.getValue();
                if (oapVar instanceof oap.b) {
                    clipUploadScreenRuntimeConfig = ((ClipsUploadUiVkNavigator.ClipUploadDataCompact) ((oap.b) oapVar).a).g;
                } else {
                    if (!(oapVar instanceof oap.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    clipUploadScreenRuntimeConfig = ((ClipsUploadUiVkNavigator.ClipUploadDataFull) ((oap.a) oapVar).a).d;
                }
                ClipsUploadScreenStaticConfig clipsUploadScreenStaticConfig = (ClipsUploadScreenStaticConfig) clipsUploadFragmentImpl.S.getValue();
                HashSet hashSet = new HashSet();
                if (clipsUploadScreenStaticConfig.d) {
                    hashSet.add(ClipUploadScreenFeature$Products.b);
                }
                if (clipsUploadScreenStaticConfig.c) {
                    hashSet.add(ClipUploadScreenFeature$Playlists.b);
                }
                if (clipsUploadScreenStaticConfig.e) {
                    hashSet.add(ClipUploadScreenFeature$DelayedPublication.b);
                }
                if (clipsUploadScreenStaticConfig.b) {
                    hashSet.add(ClipUploadScreenFeature$DraftsUi.b);
                }
                if (clipUploadScreenRuntimeConfig.b) {
                    hashSet.add(ClipUploadScreenFeature$OpenEditor.b);
                }
                if (!clipUploadScreenRuntimeConfig.c) {
                    hashSet.add(ClipUploadScreenFeature$DraftsSave.b);
                }
                if (clipsUploadScreenStaticConfig.f) {
                    SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_CLIP_UPLOAD_EASY_PROMOTE;
                    smbAdFeatures.getClass();
                    if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                        hashSet.add(ClipUploadScreenFeature$EasyPromote.b);
                    }
                }
                if (clipsUploadScreenStaticConfig.g) {
                    hashSet.add(ClipUploadScreenFeature$TrendingHashtags.b);
                }
                if (clipsUploadScreenStaticConfig.h) {
                    hashSet.add(ClipUploadScreenFeature$TrendingHashtagsLanding.b);
                }
                if (clipsUploadScreenStaticConfig.i) {
                    hashSet.add(ClipUploadScreenFeature$PublishOnlyFromGroups.b);
                }
                if (clipsUploadScreenStaticConfig.j) {
                    hashSet.add(ClipUploadScreenFeature$AutoRepostToStoryWithLikes.b);
                }
                if (clipsUploadScreenStaticConfig.k) {
                    ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                    comFeatures.getClass();
                    if (com.vk.toggle.b.A.a(comFeatures)) {
                        hashSet.add(ClipUploadScreenFeature$BroadcastEventOnDraftSavedByUser.b);
                    }
                }
                if (clipsUploadScreenStaticConfig.l) {
                    hashSet.add(ClipUploadScreenFeature$OpenChannelFromClip.b);
                }
                if (clipUploadScreenRuntimeConfig.d && !fo.b().x().e().b().c()) {
                    hashSet.add(ClipUploadScreenFeature$PostingRedirectBanner.b);
                }
                return hashSet;
            case 1:
                return ((CameraClipsComponent) ((k7m) m7m.f((mlf) obj)).a(fpf0.a(CameraClipsComponent.class))).getLogger();
            case 2:
                return ((Posting2Component) ((k7m) m7m.f((yyf) obj)).mo408a(fpf0.a(Posting2Component.class))).Cd();
            case 3:
                return ((r2g) obj).d;
            case 4:
                return ((vng) obj).a;
            case 5:
                qcy<Object>[] qcyVarArr = nzg.k1;
                final zqu zquVar = new zqu();
                return k9q0.g(new y6((CommunityCreationOnboardingFinishArguments) ((nzg) obj).i1.getValue(), 27), new wb0() { // from class: xsna.vzg
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b(zqu.this, sj50Var);
                    }
                });
            case 6:
                d3h d3hVar = (d3h) ((d4h) obj).c.invoke();
                d3hVar.c.f(d3hVar.b.a.c);
                return s3q0.a;
            case 7:
                f8h f8hVar = (f8h) obj;
                f8hVar.e.a.invoke(new CommunityProfileAction.g.d.h(true));
                f8hVar.k.postDelayed(new xqc(f8hVar, 3), 64L);
                return s3q0.a;
            case 8:
                ((cbh) obj).j.a();
                return s3q0.a;
            case 9:
                tlh tlhVar = (tlh) obj;
                sst0 sst0Var = (sst0) tlhVar.t;
                if (sst0Var != null) {
                    tlhVar.E.b(sst0Var);
                }
                return s3q0.a;
            case 10:
                return ((NarrativeComponent) ((h7m) obj).a(fpf0.a(NarrativeComponent.class))).V7();
            case 11:
                int i3 = CommunityRepliesFragment.d0;
                ((CommunityRepliesFragment) obj).a0();
                return s3q0.a;
            case 12:
                ((yok0) obj).b(null);
                return s3q0.a;
            case 13:
                RecyclerView recyclerView = ((fhl) obj).a;
                SmbAdFeatures smbAdFeatures2 = SmbAdFeatures.FEATURE_SMB_DISCLAIMER_REPOSITION;
                smbAdFeatures2.getClass();
                return com.vk.toggle.b.A.a(smbAdFeatures2) ? new x0n(recyclerView) : new v0n(recyclerView);
            case 14:
                return "INSERT INTO " + ((ldm) obj).a.a + " (" + ldm.a.NAME.getKey() + ") VALUES (?)";
            case 15:
                return Integer.valueOf(((w2w) obj).d1());
            case 16:
                int i4 = DialogsScreenFragment.p0;
                return ((VkClientMultiAccountComponent) m7m.d((DialogsScreenFragment) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 17:
                int i5 = DisplayAudioBookChaptersFragment.b0;
                return ((OfflineAudioComponent) m7m.d((DisplayAudioBookChaptersFragment) obj).a(fpf0.a(OfflineAudioComponent.class))).Ja();
            case 18:
                djo djoVar = (djo) obj;
                SizeCircleView sizeCircleView = djoVar.C;
                LayoutInflater from = LayoutInflater.from(djoVar.k);
                ViewGroup viewGroup = djoVar.b;
                View inflate = from.inflate(R.layout.draw_tool_controls_bottom, viewGroup, false);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
                layoutParams.gravity = 80;
                inflate.setLayoutParams(layoutParams);
                djoVar.r = (ColorButton) inflate.findViewById(R.id.color_button);
                djoVar.s = (PipetteButton) inflate.findViewById(R.id.pipette_button);
                djoVar.m = (RecyclerView) inflate.findViewById(R.id.colors_list);
                djoVar.t = inflate.findViewById(R.id.closed_brush_panel_button);
                djoVar.y = (BrushesPanel) inflate.findViewById(R.id.brush_panel);
                djoVar.z = (ViewGroup) inflate.findViewById(R.id.layout_brush_container);
                djoVar.A = (ViewGroup) inflate.findViewById(R.id.layout_color_container);
                RecyclerView recyclerView2 = djoVar.m;
                if (recyclerView2 != null) {
                    recyclerView2.setClipToOutline(true);
                    recyclerView2.setItemAnimator(null);
                    recyclerView2.setAdapter(djoVar.q);
                    recyclerView2.getContext();
                    recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
                }
                djoVar.o.c = new qqe(djoVar, 12);
                djoVar.p.c = new r3h(djoVar, 10);
                ColorButton colorButton = djoVar.r;
                if (colorButton != null) {
                    colorButton.setOnClickListener(new bc(djoVar, 5));
                }
                PipetteButton pipetteButton = djoVar.s;
                if (pipetteButton != null) {
                    pipetteButton.setOnClickListener(new bj6(djoVar, i2));
                }
                View view = djoVar.t;
                if (view != null) {
                    view.setOnClickListener(new qa6(djoVar, 4));
                }
                BrushesPanel brushesPanel = djoVar.y;
                if (brushesPanel != null) {
                    brushesPanel.setListener(djoVar);
                }
                djoVar.p();
                ViewGroup viewGroup2 = djoVar.A;
                if (viewGroup2 != null) {
                    qj80.a(viewGroup2, new ejo(viewGroup2, djoVar));
                }
                viewGroup.addView(inflate);
                viewGroup.addView(djoVar.B);
                SizeSeekBarView j = djoVar.j();
                if (j != null) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, (int) Math.floor(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE * Resources.getSystem().getDisplayMetrics().density));
                    layoutParams2.gravity = 8388629;
                    layoutParams2.setMargins(0, 0, 0, (int) Math.floor(22 * Resources.getSystem().getDisplayMetrics().density));
                    j.setLayoutParams(layoutParams2);
                }
                viewGroup.addView(djoVar.j());
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams3.gravity = 17;
                sizeCircleView.setLayoutParams(layoutParams3);
                viewGroup.addView(sizeCircleView);
                fyt0.h(sizeCircleView);
                StickersDrawingViewGroup stickersDrawingViewGroup = djoVar.c;
                zrl0 zrl0Var = djoVar.l;
                zrl0 zrl0Var2 = stickersDrawingViewGroup.r;
                if (zrl0Var2 != null) {
                    stickersDrawingViewGroup.removeView(zrl0Var2);
                }
                stickersDrawingViewGroup.r = zrl0Var;
                zrl0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                stickersDrawingViewGroup.addView(stickersDrawingViewGroup.r);
                return inflate;
            case 19:
                s3p s3pVar = (s3p) obj;
                RecyclerView recyclerView3 = s3pVar.b;
                if (recyclerView3.isAnimating()) {
                    RecyclerView.l itemAnimator = recyclerView3.getItemAnimator();
                    if (itemAnimator != null) {
                        itemAnimator.o(new ep2(s3pVar, i2));
                    }
                } else {
                    s3pVar.b();
                }
                recyclerView3.invalidateItemDecorations();
                return s3q0.a;
            case 20:
                return "constructor: session= " + ((xti0) obj);
            case 21:
                ((xor) obj).b.requestLayout();
                return s3q0.a;
            case 22:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i6 = ref$IntRef.element + 1;
                ref$IntRef.element = i6;
                return Integer.valueOf(i6);
            case 23:
                ((ahs) obj).getClass();
                return null;
            case 24:
                int i7 = FriendRequestsFragment.d0;
                ((FriendRequestsFragment) obj).s();
                return s3q0.a;
            case 25:
                return (FriendsBirthdayInfoBarView) ((wls) obj).itemView.findViewById(R.id.friends_birthday_info_bar);
            case 26:
                m9t m9tVar = (m9t) obj;
                m9tVar.j1.invoke();
                m9tVar.dismiss();
                return s3q0.a;
            case 27:
                qcy<Object>[] qcyVarArr2 = GeoFragment.c0;
                Bundle arguments = ((GeoFragment) obj).getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = arguments.getParcelable("geo_fragment:nav_bbox", BoundingBox.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = arguments.getParcelable("geo_fragment:nav_bbox");
                    parcelable = (BoundingBox) (parcelable3 instanceof BoundingBox ? parcelable3 : null);
                }
                return (BoundingBox) parcelable;
            case 28:
                qcy<Object>[] qcyVarArr3 = GoodFragment.U0;
                return new mnd0(g5z.a((GoodFragment) obj));
            default:
                ((GroupVh) obj).s(false);
                return s3q0.a;
        }
    }
}
