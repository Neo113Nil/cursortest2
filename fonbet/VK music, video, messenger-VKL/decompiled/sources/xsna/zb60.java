package xsna;

import android.content.Context;
import android.graphics.Paint;
import android.location.Location;
import android.net.Uri;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.zxing.Result;
import com.vk.api.base.Document;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.small.SmallVkMixVh;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.PostCaptionInfo;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.reviews.ui.reviewheader.ReviewHeaderView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import xsna.bcw0;
import xsna.fh8;
import xsna.ikv0;
import xsna.l6c0;
import xsna.qn60;
import xsna.rye;
import xsna.sl60;
import xsna.txb0;
import xsna.umc0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zb60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zb60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cf  */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.util.Size, java.lang.Integer, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r4v23 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        PhotoAttachment Mb;
        int zb;
        Photo photo;
        UserProfile userProfile;
        PhotoAttachment Mb2;
        VideoAttachment Nb;
        int i;
        int i2;
        int i3;
        int i4 = this.b;
        int i5 = 6;
        UserProfile userProfile2 = null;
        int i6 = 0;
        Object obj2 = this.c;
        switch (i4) {
            case 0:
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) obj;
                ((awq) obj2).b(newsEntriesContainer.c.size(), newsEntriesContainer.b.b);
                return s3q0.a;
            case 1:
                sg60 sg60Var = (sg60) obj2;
                x960 x960Var = (x960) obj;
                wg60 wg60Var = sg60Var.j;
                wg60Var.c.a();
                return new io.reactivex.rxjava3.internal.operators.single.b(new hxi(wg60Var.b, new qn60.b[]{new aic(), new xc3(x960Var.a().c, null, wg60Var.c, sg60Var.l, null, true, null)})).l(new x34(new o440(x960Var, 5), 21));
            case 2:
                PostCaptionInfo postCaptionInfo = (PostCaptionInfo) obj;
                s0c0 s0c0Var = new s0c0((Context) obj2, null);
                if (postCaptionInfo == null) {
                    throw new IllegalStateException("info not set");
                }
                View inflate = LayoutInflater.from(s0c0Var.c).inflate(R.layout.post_caption_info, (ViewGroup) null, false);
                s0c0Var.D0(inflate, false);
                s0c0Var.F0(true);
                s0c0Var.u(0);
                s0c0Var.x(0);
                s0c0Var.d.m = Integer.valueOf(inflate.getId());
                s0c0Var.q(true);
                s0c0Var.p(true);
                s0c0Var.I(true);
                dw20 I0 = s0c0Var.I0(null);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
                TextView textView = (TextView) inflate.findViewById(R.id.title);
                TextView textView2 = (TextView) inflate.findViewById(R.id.text);
                TextView textView3 = (TextView) inflate.findViewById(R.id.button);
                TextView textView4 = (TextView) inflate.findViewById(R.id.dismiss_button);
                String str2 = postCaptionInfo.b;
                LinkButton linkButton = postCaptionInfo.e;
                String str3 = postCaptionInfo.d;
                String str4 = postCaptionInfo.c;
                int i7 = epx.f(str2, "fake_news") ? R.drawable.vk_icon_info_outline_56 : 0;
                if (i7 != 0) {
                    imageView.setImageResource(i7);
                    bwt0.p0(imageView, true);
                } else {
                    bwt0.p0(imageView, false);
                }
                textView.setText(str4);
                bwt0.p0(textView, !(str4 == null || str4.length() == 0));
                textView2.setText(str3);
                bwt0.p0(textView2, !(str3 == null || str3.length() == 0));
                textView3.setText(linkButton != null ? linkButton.b : null);
                r4 = linkButton != null ? linkButton.b : 0;
                bwt0.p0(textView3, !(r4 == 0 || r4.length() == 0));
                textView3.setOnClickListener(new r0c0(i6, postCaptionInfo, I0));
                textView4.setOnClickListener(new mo3(I0, 13));
                return s3q0.a;
            case 3:
                VideoFile videoFile = (VideoFile) obj2;
                Throwable th = (Throwable) obj;
                if (o25.a().b()) {
                    cvk.u(h03.a(th) ? R.string.video_common_network_error : R.string.err_internal, false);
                } else {
                    wjs0.a(new wxr0(videoFile, r4, r4, i5));
                    cvk.u(R.string.clip_not_interested_hidden, false);
                }
                return s3q0.a;
            case 4:
                ((com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.f) obj2).e.invoke((com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.h) obj);
                return s3q0.a;
            case 5:
                return ((hx80) obj2).a((gx80) obj);
            case 6:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).h.b((b9a0) obj);
                return s3q0.a;
            case 7:
                return Integer.valueOf(((com.vk.attachpicker.b) obj2).d((MediaStoreEntry) obj));
            case 8:
                bwt0.p0(((com.vk.photos.root.presentation.h) obj2).o, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 9:
                bwt0.p0(((qia0) obj2).h, ((Boolean) obj).booleanValue());
                return s3q0.a;
            case 10:
                sxb0 sxb0Var = (sxb0) obj2;
                bwt0.p0(sxb0Var.f, false);
                bwt0.p0(sxb0Var.e, true);
                nyb0 a = ((txb0.a) obj).a.a();
                if (a != null) {
                    lxb0 lxb0Var = sxb0Var.g;
                    lxb0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    yp2 yp2Var = a.b;
                    arrayList.add(new StickerSettingsCheckItem(R.string.sticker_popup_animation_autoplay_on_get, null, yp2Var.a, yp2Var.b, StickerSettingsCheckItem.Setting.POPUP_ANIMATIONS_ON_GET, 2));
                    Integer valueOf = Integer.valueOf(R.string.sticker_popup_animation_autoplay_on_send_description);
                    zp2 zp2Var = a.a;
                    arrayList.add(new StickerSettingsCheckItem(R.string.sticker_popup_animation_autoplay_on_send, valueOf, zp2Var.a, zp2Var.b, StickerSettingsCheckItem.Setting.POPUP_ANIMATIONS_ON_SEND));
                    lxb0Var.setItems(arrayList);
                    if (a.c) {
                        View view = sxb0Var.d;
                        ikv0.a aVar = new ikv0.a(view.getContext());
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, (Integer) r4, (Size) r4, 14);
                        aVar.u = new ikv0.d(view.getContext().getString(R.string.sticker_popup_animation_settings_error_messgae), (String) r4, (ikv0.d.a) r4, i5);
                        aVar.b().c();
                    }
                }
                return s3q0.a;
            case 11:
                l6c0 l6c0Var = (l6c0) obj2;
                NewsEntry newsEntry = (NewsEntry) obj;
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = l6c0Var.b;
                m5c0 m5c0Var = (m5c0) nn50Var.getCurrentState();
                int zb2 = newsEntry.zb();
                if (zb2 != 1) {
                    if (zb2 == 2) {
                        Videos videos = newsEntry instanceof Videos ? (Videos) newsEntry : null;
                        VideoFile videoFile2 = (videos == null || (Nb = videos.Nb()) == null) ? null : Nb.k;
                        if (videoFile2 == null || (str = videoFile2.C1()) == null) {
                            str = m5c0Var.l;
                        }
                    } else if (zb2 != 7 && zb2 != 9) {
                        str = m5c0Var.l;
                    }
                    zb = newsEntry.zb();
                    if (zb != 1 || zb == 7 || zb == 9) {
                        Photos photos = !(newsEntry instanceof Photos) ? (Photos) newsEntry : null;
                        photo = (photos != null || (Mb2 = photos.Mb()) == null) ? null : Mb2.l;
                        if (photo != null || zb == 7) {
                            userProfile = ((m5c0) nn50Var.getCurrentState()).e;
                        } else {
                            f0c0 f0c0Var = l6c0Var.f.h;
                            List<PhotoTag> list = f0c0Var.r;
                            if (list == null) {
                                list = photo.b;
                            }
                            photo.b = list;
                            UserProfile userProfile3 = f0c0Var.s;
                            if (userProfile3 == null) {
                                PhotoTag photoTag = (PhotoTag) j5g.a0(list);
                                if (photoTag != null) {
                                    userProfile2 = photoTag.m;
                                }
                            } else {
                                userProfile2 = userProfile3;
                            }
                            userProfile = userProfile2;
                        }
                    } else {
                        userProfile = ((m5c0) nn50Var.getCurrentState()).e;
                    }
                    return new l6c0.a(newsEntry, str, userProfile);
                }
                Photos photos2 = newsEntry instanceof Photos ? (Photos) newsEntry : null;
                Photo photo2 = (photos2 == null || (Mb = photos2.Mb()) == null) ? null : Mb.l;
                str = photo2 != null ? photo2.v : m5c0Var.l;
                zb = newsEntry.zb();
                if (zb != 1) {
                }
                if (!(newsEntry instanceof Photos)) {
                }
                if (photos != null) {
                }
                if (photo != null) {
                }
                userProfile = ((m5c0) nn50Var.getCurrentState()).e;
                return new l6c0.a(newsEntry, str, userProfile);
            case 12:
                Document document = (Document) obj;
                z84 z84Var = ((scc0) obj2).f;
                if (z84Var != null && z84Var.f0(document)) {
                    r5 = false;
                }
                return Boolean.valueOf(r5);
            case 13:
                ArrayList arrayList2 = (ArrayList) obj2;
                String str5 = (String) obj;
                if (!arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (epx.f(((umc0.a) it.next()).a, str5)) {
                                i6 = 1;
                            }
                        }
                    }
                }
                return Boolean.valueOf(i6 ^ 1);
            case 14:
                NewsEntry newsEntry2 = (NewsEntry) obj2;
                sl60.a aVar2 = (sl60.a) obj;
                String str6 = aVar2.b;
                if (str6 != null && str6.length() != 0) {
                    cvk.w(aVar2.b, false);
                }
                qr.d(ce60.b, 100, newsEntry2);
                return s3q0.a;
            case 15:
                com.vk.attachpicker.screen.l lVar = (com.vk.attachpicker.screen.l) obj2;
                int intValue = ((Integer) obj).intValue();
                nne0 nne0Var = lVar.z;
                ((wg1) lVar.B.b).invoke(new rne0((Result) nne0Var.a.get(intValue), nne0Var.b));
                return s3q0.a;
            case 16:
                com.vk.auth.modal.qrwithcode.a aVar3 = (com.vk.auth.modal.qrwithcode.a) obj2;
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                aVar3.n = null;
                QrWithCodeAuthModal qrWithCodeAuthModal = aVar3.h;
                qrWithCodeAuthModal.f(false);
                qrWithCodeAuthModal.e();
                return s3q0.a;
            case 17:
                int i8 = ReviewHeaderView.k;
                ((ReviewHeaderView) obj2).b();
                return s3q0.a;
            case 18:
                ((rzq0) obj).b(new wow(((sjg0) obj2).g), tjg0.b);
                return s3q0.a;
            case 19:
                rye.b bVar = (rye.b) obj2;
                bVar.d.post(new uye(bVar, ((Integer) obj).intValue() / 100.0f));
                return s3q0.a;
            case 20:
                feh0.d((Uri) obj2, (Paint) obj);
                return s3q0.a;
            case 21:
                wh50<tho0> wh50Var = ((zph0) obj2).j;
                String str7 = ((bcw0.a) obj).a;
                if (str7 == null) {
                    str7 = "";
                }
                ((zak0) wh50Var).setValue(new tho0(str7, 0L, 6));
                return s3q0.a;
            case 22:
                Integer num = (Integer) obj;
                num.getClass();
                ((me2) obj2).invoke(num);
                return s3q0.a;
            case 23:
                clj0 clj0Var = (clj0) obj2;
                fvw fvwVar = (fvw) ((it80) obj).a;
                clj0Var.e.invoke(fvwVar == null ? fh8.k.d.a : new fh8.k.a(fvwVar));
                return s3q0.a;
            case 24:
                SmallVkMixVh smallVkMixVh = (SmallVkMixVh) obj2;
                smallVkMixVh.r = true;
                ((View) obj).performHapticFeedback(0);
                MusicRoundPlayView musicRoundPlayView = smallVkMixVh.m;
                if (musicRoundPlayView == null) {
                    musicRoundPlayView = null;
                }
                MusicVkMixVh.h(smallVkMixVh, musicRoundPlayView.a(), null, null, 6);
                return s3q0.a;
            case 25:
                return new PackStylesListHolder(((f3l0) obj2).i, (ViewGroup) obj, false);
            case 26:
                vpl0 vpl0Var = (vpl0) obj2;
                for (StoryEntry storyEntry : ((Narrative) obj).g) {
                    vpl0Var.c.put(storyEntry.Gb(), storyEntry);
                }
                return s3q0.a;
            case 27:
                ((r3m0) obj2).c = (Location) obj;
                return s3q0.a;
            case 28:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj2;
                int i9 = StoryMediaPickerFragment.d0;
                p3t go = storyMediaPickerFragment.go();
                if (go != null && go.Wm()) {
                    xn50.a.c(storyMediaPickerFragment, new a.f(storyMediaPickerFragment.c0.getCurrentList(), storyMediaPickerFragment.ho()));
                }
                return s3q0.a;
            default:
                r7m0 r7m0Var = (r7m0) obj2;
                gu80 gu80Var = (gu80) obj;
                boolean z = gu80Var.a;
                HashMap<Integer, OrdData> hashMap = r7m0Var.b;
                OrdData ordData = hashMap.get(Integer.valueOf(r7m0Var.c));
                boolean z2 = (ordData == null || !ordData.b) && z;
                r5 = (ordData == null || !ordData.b || z) ? false : true;
                Context context = r7m0Var.a;
                if (!z2) {
                    if (r5) {
                        i = R.drawable.vk_icon_loudspeaker_slash_outline_28;
                        i2 = R.attr.vk_ui_icon_negative;
                        i3 = R.string.story_snackbar_ad_removed;
                    }
                    hashMap.put(Integer.valueOf(r7m0Var.c), new OrdData(z, gu80Var.b, gu80Var.c));
                    return s3q0.a;
                }
                i = R.drawable.vk_icon_check_circle_outline_28;
                i2 = R.attr.vk_ui_icon_positive;
                i3 = R.string.story_snackbar_ad_added;
                ikv0.a aVar4 = new ikv0.a(bwt0.u(context));
                aVar4.t = new ikv0.c.C3058c(i, Integer.valueOf(i2), (Size) r4, 12);
                aVar4.u = new ikv0.d(context.getString(i3), (String) r4, (ikv0.d.a) r4, i5);
                aVar4.o = Integer.valueOf(cn70.b(8));
                aVar4.n();
                hashMap.put(Integer.valueOf(r7m0Var.c), new OrdData(z, gu80Var.b, gu80Var.c));
                return s3q0.a;
        }
    }
}
