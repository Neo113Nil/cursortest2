package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;
import xsna.bbv0;
import xsna.gm50;
import xsna.tlo0;
import xsna.wpc0;
import xsna.xn50;

/* compiled from: AlbumsSettingsBottomSheet.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class yp1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SdkVideoFile sdkVideoFile;
        VkButton vkButton;
        Set dataOrigins;
        c3t0 c3t0Var;
        boolean z;
        String quantityString;
        String str;
        String title;
        String str2;
        boolean z2;
        String str3;
        String k;
        boolean z3;
        boolean z4;
        jwx jwxVar;
        Drawable drawable;
        Image image;
        ImageSize Cb;
        CharSequence text;
        boolean z5 = false;
        boolean z6 = true;
        switch (this.b) {
            case 0:
                xp1 xp1Var = (xp1) this.receiver;
                xp1Var.getClass();
                xn50.a.c(xp1Var, (vp1) obj);
                return s3q0.a;
            case 1:
                return ((ez2) this.receiver).a((JSONObject) obj);
            case 2:
                m8b.X0((m8b) this.receiver, (List) obj);
                return s3q0.a;
            case 3:
                List list = (List) obj;
                yie yieVar = ((qie) this.receiver).b;
                if (yieVar.isEnabled() && (sdkVideoFile = (SdkVideoFile) j5g.a0(list)) != null) {
                    yieVar.a(sdkVideoFile);
                }
                return s3q0.a;
            case 4:
                kse kseVar = (kse) this.receiver;
                kseVar.getClass();
                xn50.a.c(kseVar, (jse) obj);
                return s3q0.a;
            case 5:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.receiver;
                d9e d9eVar = (d9e) ((mjd) clipsWrapperFragment.k0.getValue()).a.invoke();
                if (d9eVar != null && (d9eVar.Ka() instanceof ClipFeedTab.NewsMonotheme)) {
                    new cof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_MONOTOPIC, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.CLIPS_MONOTOPIC, SchemeStat$TypeClipViewerItem.EventType.BACK_FROM_MONOTOPIC_TO_CLIPS_FEED_CLICK, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null), 2), qsk0.a).q();
                }
                d9e ko = clipsWrapperFragment.ko();
                if ((ko == null || !ko.onBack()) && !clipsWrapperFragment.ho() && !clipsWrapperFragment.qo()) {
                    Fragment parentFragment = clipsWrapperFragment.getParentFragment();
                    FragmentImpl fragmentImpl = parentFragment instanceof FragmentImpl ? (FragmentImpl) parentFragment : null;
                    if (fragmentImpl != null) {
                        fragmentImpl.finish();
                    }
                }
                return s3q0.a;
            case 6:
                L.i((Throwable) obj);
                return s3q0.a;
            case 7:
                ipm ipmVar = (ipm) obj;
                pim pimVar = (pim) this.receiver;
                f9w f9wVar = pim.q;
                pimVar.getClass();
                pimVar.Y0(ipmVar.a, true);
                btk0 btk0Var = pimVar.l;
                btk0Var.a = ipmVar.a(btk0Var.a.e);
                pimVar.l.e = null;
                pimVar.X0();
                pimVar.d1();
                return s3q0.a;
            case 8:
                ((nma0) this.receiver).e.xn(R.string.vk_common_network_error);
                bbv0.g.getClass();
                bbv0.a.c((Throwable) obj);
                return s3q0.a;
            case 9:
                wpc0 wpc0Var = (wpc0) obj;
                enc0 enc0Var = (enc0) this.receiver;
                List<MediaPickerState.Tab> list2 = enc0.q0;
                enc0Var.getClass();
                if (wpc0Var instanceof wpc0.c) {
                    wpc0.c cVar = (wpc0.c) wpc0Var;
                    gm50.a.a(enc0Var, cVar.a, new bnc0(enc0Var, 0));
                    gm50.a.a(enc0Var, cVar.b, new h630(enc0Var, 20));
                } else if (wpc0Var instanceof wpc0.a.b) {
                    wpc0.a.b bVar = (wpc0.a.b) wpc0Var;
                    bwt0.p0(enc0Var.J, false);
                    ActionsAvailabilityState a = bVar.w.a();
                    if (a == null) {
                        a = ActionsAvailabilityState.j;
                    }
                    enc0Var.O = a;
                    bVar.y.a();
                    h0c0 h0c0Var = enc0Var.p;
                    ActionsAvailabilityState actionsAvailabilityState = enc0Var.O;
                    pcc0 pcc0Var = h0c0Var.g;
                    if (pcc0Var != null) {
                        boolean z7 = actionsAvailabilityState.h instanceof ActionsAvailabilityState.Availability.NotAvailable;
                        a4d0 a4d0Var = pcc0Var.n.g;
                        if (a4d0Var != null && (vkButton = a4d0Var.M) != null) {
                            vkButton.setEnabled(!z7);
                        }
                    }
                    gm50.a.a(enc0Var, bVar.z, new qi00(enc0Var, 27));
                    gm50.a.a(enc0Var, bVar.e, new xnc0(1, enc0Var, enc0.class, "bindPickerMediaOwnerId", "bindPickerMediaOwnerId(Lcom/vk/dto/common/id/UserId;)V", 0));
                    gm50.a.a(enc0Var, bVar.a, new ync0(1, enc0Var, enc0.class, "bindToolbarData", "bindToolbarData(Lcom/vk/newsfeed/posting/impl/presentation/model/PostingToolbarViewState;)V", 0));
                    gm50.a.a(enc0Var, bVar.j, new znc0(1, enc0Var, enc0.class, "bindSelectedLocalAlbum", "bindSelectedLocalAlbum(Lcom/vk/newsfeed/posting/impl/domain/model/LocalAlbum;)V", 0));
                    gm50.a.a(enc0Var, bVar.i, new aoc0(1, enc0Var, enc0.class, "bindLocalAlbums", "bindLocalAlbums(Ljava/util/List;)V", 0));
                    gm50.a.a(enc0Var, bVar.k, new boc0(1, enc0Var, enc0.class, "bindMediaPickerLocalMedia", "bindMediaPickerLocalMedia(Lcom/vk/newsfeed/posting/impl/presentation/model/LocalMediaListViewState;)V", 0));
                    gm50.a.a(enc0Var, bVar.l, new coc0(1, enc0Var, enc0.class, "bindMediaPickerSelectedMedia", "bindMediaPickerSelectedMedia(Ljava/util/List;)V", 0));
                    gm50.a.a(enc0Var, bVar.c, new doc0(1, enc0Var, enc0.class, "bindBackStack", "bindBackStack(Lcom/vk/newsfeed/posting/impl/presentation/model/BackStack;)V", 0));
                    gm50.a.a(enc0Var, bVar.m, new eoc0(1, enc0Var, enc0.class, "bindMediaPickerToolbar", "bindMediaPickerToolbar(Lcom/vk/newsfeed/posting/impl/presentation/model/PostingMediaPickerToolbarViewState;)V", 0));
                    gm50.a.a(enc0Var, bVar.n, new onc0(1, enc0Var, enc0.class, "bindMediaPickerNextSheetState", "bindMediaPickerNextSheetState(Ljava/lang/Integer;)V", 0));
                    gm50.a.a(enc0Var, bVar.o, new pnc0(1, enc0Var, enc0.class, "bindMediaCurrentPickerSheetState", "bindMediaCurrentPickerSheetState(Ljava/lang/Integer;)V", 0));
                    gm50.a.a(enc0Var, bVar.q, new qnc0(1, enc0Var, enc0.class, "bindCrops", "bindCrops(Lcom/vk/newsfeed/posting/impl/domain/model/PostingCropsForRatio;)V", 0));
                    gm50.a.a(enc0Var, bVar.p, new rnc0(1, enc0Var, enc0.class, "bindAttachments", "bindAttachments(Ljava/util/List;)V", 0));
                    gm50.a.a(enc0Var, bVar.r, new snc0(1, enc0Var, enc0.class, "bindArticle", "bindArticle(Lcom/vk/newsfeed/posting/impl/domain/model/attachments/PostingArticleDto;)V", 0));
                    gm50.a.a(enc0Var, bVar.s, new tnc0(1, enc0Var, enc0.class, "bindLink", "bindLink(Lcom/vk/newsfeed/posting/impl/domain/model/attachments/PostingLinkDto;)V", 0));
                    gm50.a.a(enc0Var, bVar.t, new xc50(enc0Var, 8));
                    gm50.a.a(enc0Var, bVar.v, new unc0(1, enc0Var, enc0.class, "bindMentionState", "bindMentionState(Lcom/vk/newsfeed/posting/mentions/PostingMentionState;)V", 0));
                    gm50.a.a(enc0Var, bVar.g, new vnc0(1, enc0Var.j0, j8c0.class, "updateRestrictionTextView", "updateRestrictionTextView(Lcom/vk/newsfeed/posting/impl/presentation/model/PostingTextRestriction;)V", 0));
                    gm50.a.a(enc0Var, bVar.A, new wnc0(1, enc0Var, enc0.class, "bindDraftsButtonState", "bindDraftsButtonState(Z)V", 0));
                }
                return s3q0.a;
            case 10:
                dataOrigins = v81.a(this.receiver).getDataOrigins(vw6.b(obj));
                return dataOrigins;
            case 11:
                ((vqh0) this.receiver).T((rrh0) obj);
                return s3q0.a;
            case 12:
                c3t0 c3t0Var2 = (c3t0) obj;
                x2t0 x2t0Var = (x2t0) this.receiver;
                x2t0Var.getClass();
                e3t0<p2t0> e3t0Var = c3t0Var2.c;
                if (e3t0Var == null) {
                    return null;
                }
                ArrayList<p2t0> arrayList = e3t0Var.a;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (p2t0 p2t0Var : arrayList) {
                    l0w0 l0w0Var = x2t0Var.d;
                    VideoFile videoFile = p2t0Var.a;
                    boolean contains = c3t0Var2.d.contains(videoFile.a1());
                    l0w0Var.getClass();
                    VideoRestriction O = videoFile.O();
                    boolean z8 = O != null ? z6 : z5;
                    if (O == null || O.f) {
                        boolean W9 = videoFile.W9();
                        boolean z9 = !W9;
                        Context context = e43.a;
                        String m = gpt0.m(context != null ? context : null, videoFile, z5, z5);
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        if (uqm0.g(videoFile.L8())) {
                            c3t0Var = c3t0Var2;
                            z = W9;
                            quantityString = context2.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8()));
                        } else {
                            c3t0Var = c3t0Var2;
                            z = W9;
                            quantityString = context2.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8()));
                        }
                        str = quantityString;
                        jwx jwxVar2 = (O == null || !O.d) ? null : l0w0Var.a;
                        ImageSize Cb2 = videoFile.getImage().Cb(cn70.b(142), true, false);
                        String str4 = Cb2 != null ? Cb2.d.d : null;
                        title = videoFile.getTitle();
                        gpt0 gpt0Var = gpt0.a;
                        Context context3 = e43.a;
                        if (context3 == null) {
                            context3 = null;
                        }
                        str2 = str4;
                        z2 = z9;
                        str3 = m;
                        k = gpt0.k(context3, videoFile);
                        z3 = z;
                        z4 = true;
                        jwxVar = jwxVar2;
                        drawable = null;
                    } else {
                        str = y8g0.e(R.string.media_picker_vk_video_no_views);
                        Drawable a2 = dhr0.t.a(R.drawable.background_vk_video_unavailable_holder);
                        title = y8g0.e(R.string.media_picker_vk_video_no_access);
                        c3t0Var = c3t0Var2;
                        drawable = a2;
                        z3 = z5;
                        z2 = z3;
                        z4 = z2;
                        str3 = "";
                        k = null;
                        jwxVar = null;
                        str2 = null;
                    }
                    int c = (O == null || O.f) ? O != null ? dhr0.t.c(R.attr.vk_ui_icon_contrast) : -1 : dhr0.t.c(R.attr.vk_ui_icon_secondary);
                    boolean z10 = (O == null || O.f) && !videoFile.k0();
                    VkCell.Middle.a aVar = VkCell.Middle.Companion;
                    tlo0.a aVar2 = tlo0.Companion;
                    if (title == null) {
                        title = "";
                    }
                    tlo0.h d = oq.d(aVar2, title);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    arrayList2.add(new m0w0(videoFile, contains, drawable, jwxVar, str2, VkCell.Middle.a.a(aVar, new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d((tlo0) new tlo0.h(str), (gzs) (0 == true ? 1 : 0), 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), new VkCell.Middle.c(new tlo0.h(k != null ? k : ""), null, 1, 2), 8), z10, z3, z2, str3, z4, z8, c, (O == null || (image = O.g) == null || (Cb = image.Cb(cn70.b(28), true, false)) == null) ? null : Cb.d.d));
                    c3t0Var2 = c3t0Var;
                    z5 = false;
                    z6 = true;
                }
                return new e3t0(arrayList2, e3t0Var.b, e3t0Var.c);
            default:
                float floatValue = ((Number) obj).floatValue();
                VideoView videoView = (VideoView) this.receiver;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                if (((Boolean) videoView.h.getValue()).booleanValue() && videoView.r0) {
                    videoView.G0(false, false);
                }
                o4 o4Var = videoView.F0;
                TextView textView = videoView.getViewBinding().B;
                if (textView != null && (text = textView.getText()) != null) {
                    String format = String.format(Locale.US, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
                    if (!text.equals(format)) {
                        videoView.removeCallbacks(o4Var);
                        videoView.postDelayed(o4Var, ((Boolean) videoView.h.getValue()).booleanValue() ? 1000L : 200L);
                        TextView textView2 = videoView.getViewBinding().B;
                        if (textView2 != null) {
                            textView2.setText(format);
                        }
                        if (f4m.g(videoView.getViewBinding().B)) {
                            d3m.c(videoView.getViewBinding().B, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    }
                }
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp1(Object obj, int i) {
        super(1, obj, xp1.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
        this.b = i;
        switch (i) {
            case 3:
                super(1, obj, qie.class, "prefetch", "prefetch(Ljava/util/List;)V", 0);
                break;
            case 4:
            case 5:
            case 8:
            case 11:
            default:
                break;
            case 6:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 7:
                super(1, obj, pim.class, "onUpdateAllByCacheSuccess", "onUpdateAllByCacheSuccess(Lcom/vk/im/engine/models/dialogs/DialogsExt;)V", 0);
                break;
            case 9:
                super(1, obj, enc0.class, "render", "render(Lcom/vk/newsfeed/posting/impl/presentation/model/PostingViewStateRender;)V", 0);
                break;
            case 10:
                super(1, obj, t92.f(), "getDataOrigins", "getDataOrigins(Landroid/health/connect/datatypes/AggregationType;)Ljava/util/Set;", 0);
                break;
            case 12:
                super(1, obj, x2t0.class, "mapVideoItemsToListItems", "mapVideoItemsToListItems(Lcom/vk/newsfeed/posting/mediapicker/videovk/domain/VideoPickerState;)Lcom/vk/newsfeed/posting/mediapicker/videovk/presentation/VideoPickerUiModel;", 0);
                break;
            case 13:
                super(1, obj, VideoView.class, "onZoomValueChanged", "onZoomValueChanged(F)V", 0);
                break;
        }
    }
}
