package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.util.Size;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.attachpicker.stickers.reply.ReplyVideoStickerStyle;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.stickers.ShareVmojiStoryParams;
import com.vk.dto.stories.entities.StoryLocalPhotoSticker;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryAnswer;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryQuestion;
import com.vk.dto.stories.model.StoryQuestionAnswer;
import com.vk.dto.stories.model.StoryQuestionSharing;
import com.vk.dto.stories.model.TextBackgroundInfo;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.music.view.ThumbsImageView;
import com.vk.stickers.api.models.AlbumStickerStyle;
import com.vk.stickers.api.models.post.PostStickerStyle;
import com.vk.stickers.api.models.time.TimeStickerStyle;
import com.vk.stories.StoryPostInfo;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.storycamera.entity.attach.StoryEditorAttachPosition;
import com.vk.storycamera.entity.attach.StoryEditorPhotoAlbumAttachment;
import com.vk.storycamera.entity.attach.StoryEditorPollAttach;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.chromium.base.version_info.VersionConstants;
import xsna.e3m;
import xsna.el9;
import xsna.grt0;
import xsna.hmo0;
import xsna.i5a0;
import xsna.kba0;
import xsna.nov;
import xsna.q4g0;
import xsna.q7c0;
import xsna.t4f;
import xsna.u7c0;

/* compiled from: BaseCameraEditorPresenterDelegates.kt */
/* loaded from: classes16.dex */
public final class p86 {
    public final dl9 a;
    public final hk9 b;
    public final jo9 c;
    public final sg9 d;
    public final t4f e;
    public final ek9 f;
    public final yj9 g;
    public final yi9 h;
    public final lh9 i;
    public final qk9 j;
    public final pf9 k;
    public final nj9 l;
    public final ak9 m;
    public final vj9 n;
    public final shb o;
    public final a8w0 p;
    public final r7m0 q;
    public final m9m0 r;
    public final e3f0 s;
    public final e3f0 t;
    public final kl9 u;

    public p86(Context context, v76 v76Var, u440 u440Var, vf6 vf6Var, StoryEditorCameraParams storyEditorCameraParams, gpj0 gpj0Var, spj0 spj0Var, rqj0 rqj0Var, h7v h7vVar, w2l0 w2l0Var, Lazy lazy, scd scdVar) {
        el9 el9Var;
        dl9 dl9Var;
        lh9 lh9Var;
        jo9 jo9Var;
        qk9 qk9Var;
        gpj0 gpj0Var2;
        u440 u440Var2 = u440Var;
        StoryEditorCameraParams.Attaches attaches = storyEditorCameraParams.l;
        lh9 lh9Var2 = new lh9(v76Var, u440Var, vf6Var, lazy);
        this.i = lh9Var2;
        StoryEntryExtended storyEntryExtended = storyEditorCameraParams.d;
        StoryEntry storyEntry = storyEntryExtended != null ? storyEntryExtended.b : null;
        StoryOwner storyOwner = storyEntryExtended != null ? storyEntryExtended.c : null;
        VideoFile videoFile = (attaches == null || (videoFile = attaches.j) == null || !spj0Var.c(videoFile)) ? null : videoFile;
        if (videoFile != null) {
            el9Var = new el9.a(videoFile);
        } else if (storyOwner == null || storyEntry == null) {
            el9Var = null;
        } else {
            el9Var = new el9.b(storyEntry, storyOwner, storyEntryExtended != null ? storyEntryExtended.d : false);
        }
        if (el9Var == null) {
            dl9Var = null;
        } else {
            dl9Var = new dl9(el9Var, v76Var, u440Var2, lh9Var2, scdVar);
            u440Var2 = u440Var2;
        }
        this.a = dl9Var;
        StoryPostInfo storyPostInfo = attaches.b;
        this.b = storyPostInfo == null ? null : new hk9(v76Var, u440Var, storyPostInfo, lh9Var2);
        VideoFile videoFile2 = attaches.j;
        if (videoFile2 == null || videoFile2.C2()) {
            lh9Var = lh9Var2;
            jo9Var = null;
        } else {
            jo9Var = new jo9(v76Var, u440Var2, videoFile2, lh9Var2, storyPostInfo);
            lh9Var = lh9Var2;
        }
        this.c = jo9Var;
        ChannelMessageAttachment channelMessageAttachment = attaches.m;
        this.d = channelMessageAttachment != null ? new sg9(v76Var, u440Var, channelMessageAttachment, lh9Var) : null;
        ClipStatStoryData clipStatStoryData = storyEditorCameraParams.j;
        this.e = clipStatStoryData == null ? null : new t4f(v76Var, clipStatStoryData, u440Var);
        StoryEditorPollAttach storyEditorPollAttach = attaches.c;
        this.f = storyEditorPollAttach == null ? null : new ek9(u440Var, storyEditorPollAttach, w2l0Var);
        Photo photo = attaches.d;
        this.g = photo == null ? null : new yj9(context, u440Var, photo, lh9Var);
        StoryLocalPhotoSticker storyLocalPhotoSticker = attaches.e;
        this.h = storyLocalPhotoSticker == null ? null : new yi9(v76Var.getRequireContext(), u440Var, storyLocalPhotoSticker, lh9Var);
        StoryQuestion storyQuestion = attaches.l;
        if (storyQuestion == null) {
            gpj0Var2 = gpj0Var;
            qk9Var = null;
        } else {
            gpj0Var2 = gpj0Var;
            qk9Var = new qk9(v76Var, u440Var, storyQuestion, gpj0Var2);
        }
        this.j = qk9Var;
        List<StoryAnswer> list = attaches.k;
        this.k = list == null ? null : new pf9(v76Var, u440Var2, list, gpj0Var2, rqj0Var);
        MusicTrack musicTrack = attaches.g;
        this.l = musicTrack == null ? null : new nj9(v76Var, u440Var, musicTrack, lh9Var);
        Playlist playlist = attaches.i;
        this.m = playlist == null ? null : new ak9(v76Var, u440Var, playlist, lh9Var);
        ShareVmojiStoryParams shareVmojiStoryParams = attaches.h;
        this.p = shareVmojiStoryParams == null ? null : new a8w0(u440Var, shareVmojiStoryParams, lh9Var);
        StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment = attaches.n;
        this.n = storyEditorPhotoAlbumAttachment != null ? new vj9(context, u440Var, storyEditorPhotoAlbumAttachment, lh9Var) : null;
        this.o = new shb(v76Var, u440Var);
        this.q = new r7m0(context);
        this.r = new m9m0(v76Var);
        this.s = new e3f0(v76Var);
        this.t = new e3f0(v76Var);
        this.u = new kl9(v76Var, h7vVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0be5, code lost:
    
        if (r6 != null) goto L448;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(tam0 tam0Var) {
        zcl0 zcl0Var;
        String str;
        nov novVar;
        nov novVar2;
        nov novVar3;
        nov novVar4;
        vj9 vj9Var;
        String D;
        List list;
        Uri Cb;
        char c;
        String Db;
        List list2;
        yj9 yj9Var;
        u440 u440Var;
        tam0 tam0Var2;
        t4f t4fVar;
        u440 u440Var2;
        tam0 tam0Var3;
        rcd rcdVar;
        sg9 sg9Var;
        String str2;
        List a;
        p7c0 a2;
        jo9 jo9Var;
        UserId userId;
        p7c0 a3;
        u440 u440Var3;
        tam0 tam0Var4;
        p7c0 a4;
        dl9 dl9Var;
        v76 v76Var;
        StoryOwner storyOwner;
        boolean z;
        Drawable drawable;
        boolean z2;
        boolean z3;
        nov novVar5;
        MusicTrack musicTrack;
        VideoUrlStorage w9;
        nov novVar6;
        nov novVar7;
        StoryEntry storyEntry;
        hk9 hk9Var = this.b;
        zcl0 zcl0Var2 = tam0Var.h;
        kl9 kl9Var = this.u;
        if (kl9Var != null) {
            kl9Var.a.getStickersState().d = new u4(kl9Var);
        }
        boolean t = zcl0Var2.t();
        CopyOnWriteArrayList<nov> copyOnWriteArrayList = zcl0Var2.a;
        if (t || (dl9Var = this.a) == null) {
            zcl0Var = zcl0Var2;
            str = "";
        } else {
            String str3 = dl9Var.g;
            lh9 lh9Var = dl9Var.d;
            ImageSize imageSize = dl9Var.h;
            v76 v76Var2 = dl9Var.b;
            u440 u440Var4 = dl9Var.c;
            u440Var4.O7(false);
            el9 el9Var = dl9Var.a;
            if (el9Var instanceof el9.a) {
                novVar7 = dl9Var.e.a(v76Var2.getRequireContext(), (ClipVideoFile) ((el9.a) el9Var).a, imageSize.d.d, null, null);
                if (novVar7 == null) {
                    throw new IllegalStateException("clips sticker factory return null or unexcepted sticker type");
                }
                r4g0 r4g0Var = (r4g0) novVar7;
                r4g0Var.setLoadingVisible(true);
                r4g0Var.setDeterminateProgress(false);
                r4g0Var.getVideo().setDownloadListener(new cl9(r4g0Var, dl9Var));
                r4g0Var.getVideo().z();
                lh9Var.b(str3, new fb(dl9Var, 10));
                zcl0Var = zcl0Var2;
                str = "";
            } else {
                if (!(el9Var instanceof el9.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                el9.b bVar = (el9.b) el9Var;
                StoryEntry storyEntry2 = bVar.a;
                boolean z4 = bVar.c;
                StoryOwner storyOwner2 = bVar.b;
                int i = 14;
                if (storyEntry2.Sb()) {
                    zcl0Var = zcl0Var2;
                    lh9Var.b(str3, new com.vk.im.ui.fragments.b(dl9Var, i));
                    float E0 = dl9Var.f.E0();
                    List s0 = dl9.a(storyEntry2) ? j5g.s0(PhotoStickerStyle.i(), PhotoStickerStyle.FULLSCREEN) : PhotoStickerStyle.i();
                    String Db2 = storyOwner2.Db();
                    String str4 = Db2 == null ? "" : Db2;
                    kba0.a aVar = new kba0.a(PhotoStickerStyle.PREVIEW, s0);
                    dnr0 i2 = fco0.i(storyOwner2.Y());
                    String str5 = imageSize.d.d;
                    boolean z5 = !z4;
                    Photo photo = storyEntry2.m;
                    long j = photo.e.b;
                    int i3 = photo.c;
                    UserProfile userProfile = photo.B;
                    novVar5 = new g4g0(v76Var2.getRequireContext(), new kba0(str4, E0, aVar, str5, true, z5, userProfile != null ? userProfile.D() : null, j, i3, i2));
                    storyOwner = storyOwner2;
                    str = "";
                    v76Var = v76Var2;
                    z = z4;
                } else {
                    zcl0Var = zcl0Var2;
                    VideoFile videoFile = storyEntry2.n;
                    String T7 = (videoFile == null || (w9 = videoFile.w9()) == null) ? null : w9.T7();
                    boolean z6 = storyEntry2.y != null;
                    VideoFile videoFile2 = storyEntry2.n;
                    int width = videoFile2 != null ? videoFile2.getWidth() : 0;
                    VideoFile videoFile3 = storyEntry2.n;
                    str = "";
                    v76Var = v76Var2;
                    grt0.a aVar2 = new grt0.a(width, videoFile3 != null ? videoFile3.getHeight() : 0, z6, storyEntry2.b0, T7, T7, (storyEntry2.n != null ? r11.getDuration() : 0) * 1000);
                    ClickableStickers clickableStickers = storyEntry2.X;
                    if (clickableStickers != null) {
                        clickableStickers.Db();
                        if (storyEntry2.b0) {
                            i0q0.d(200L, new fs2(dl9Var, 3));
                            i0q0.d(4600L, new gs2(dl9Var, 5));
                        } else {
                            ClickableMusic Ab = storyEntry2.Ab();
                            if (Ab != null && (musicTrack = Ab.e) != null) {
                                u440Var4.v2(new g7m0(musicTrack));
                            }
                        }
                    }
                    List singletonList = dl9.a(storyEntry2) ? Collections.singletonList(ReplyVideoStickerStyle.PREVIEW) : e43.l(ReplyVideoStickerStyle.PREVIEW, ReplyVideoStickerStyle.FULLSCREEN);
                    VerifyInfo Y = storyOwner2.Y();
                    if (Y != null) {
                        storyOwner = storyOwner2;
                        z = z4;
                        drawable = VerifyInfoHelper.h(VerifyInfoHelper.a, Y, v76Var.getRequireContext(), VerifyInfoHelper.ColorTheme.white, 24);
                    } else {
                        storyOwner = storyOwner2;
                        z = z4;
                        drawable = null;
                    }
                    q4g0.b.C3548b c3548b = q4g0.b.C3548b.a;
                    String Db3 = storyOwner.Db();
                    q4g0 q4g0Var = new q4g0(c3548b, Db3 == null ? str : Db3, drawable, R.string.sticker_type_prefix_story, new q4g0.a(ReplyVideoStickerStyle.PREVIEW, singletonList), !z, ((b2m0) lh9Var.d.getValue()).b());
                    Context requireContext = v76Var.getRequireContext();
                    VideoFile videoFile4 = storyEntry2.n;
                    p4g0 p4g0Var = new p4g0(requireContext, aVar2, videoFile4 != null ? videoFile4.E0() : 1.0f, imageSize.d.d, null, VersionConstants.PRODUCT_MAJOR_VERSION);
                    ClickableStickers clickableStickers2 = storyEntry2.X;
                    if (clickableStickers2 != null) {
                        z2 = true;
                        if (clickableStickers2.Db()) {
                            z3 = true;
                            p4g0Var.setHasMusic(z3);
                            r4g0 r4g0Var2 = new r4g0(v76Var.getRequireContext(), q4g0Var, p4g0Var, false);
                            r4g0Var2.setLoadingVisible(z2);
                            r4g0Var2.setDeterminateProgress(false);
                            r4g0Var2.getVideo().setDownloadListener(new cl9(r4g0Var2, dl9Var));
                            r4g0Var2.getVideo().z();
                            lh9Var.b(str3, new a8(dl9Var, 14));
                            novVar5 = r4g0Var2;
                        }
                    } else {
                        z2 = true;
                    }
                    z3 = false;
                    p4g0Var.setHasMusic(z3);
                    r4g0 r4g0Var22 = new r4g0(v76Var.getRequireContext(), q4g0Var, p4g0Var, false);
                    r4g0Var22.setLoadingVisible(z2);
                    r4g0Var22.setDeterminateProgress(false);
                    r4g0Var22.getVideo().setDownloadListener(new cl9(r4g0Var22, dl9Var));
                    r4g0Var22.getVideo().z();
                    lh9Var.b(str3, new a8(dl9Var, 14));
                    novVar5 = r4g0Var22;
                }
                if (z) {
                    StoryEntryExtended storyEntryExtended = u440Var4.k.f;
                    yjm0 yjm0Var = new yjm0(new nvo0(false, new m0g0(new Date((storyEntryExtended == null || (storyEntry = storyEntryExtended.b) == null) ? System.currentTimeMillis() : storyEntry.f)), TimeStickerStyle.STYLE_TIME_STICKER_MEMORIES, v76Var.getRequireContext().getString(R.string.story_memory).toUpperCase(Locale.US)));
                    float f = f2l0.a;
                    u440Var4.R7(yjm0Var, new mmi(2));
                }
                if (novVar5 instanceof l4g0) {
                    String Bb = storyOwner.Bb();
                    if (Bb == null) {
                        Bb = str;
                    }
                    novVar6 = novVar5;
                    lh9Var.b(Bb, new zk9(1, novVar6, l4g0.class, "setAvatarBitmap", "setAvatarBitmap(Landroid/graphics/Bitmap;Z)V", 0));
                } else {
                    novVar6 = novVar5;
                }
                novVar7 = novVar6;
            }
            if (!tam0Var.c) {
                u440Var4.v2(novVar7);
            }
        }
        if (zcl0Var.s()) {
            BackgroundInfo backgroundInfo = tam0Var.d;
            if ((backgroundInfo == null || backgroundInfo.c == StoryBackgroundType.BLUR) && hk9Var != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<nov> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    nov next = it.next();
                    if (next instanceof p7c0) {
                        arrayList.add(next);
                    }
                }
                p7c0 p7c0Var = (p7c0) j5g.a0(arrayList);
                if (p7c0Var != null) {
                    hk9Var.a(p7c0Var);
                }
            }
        } else if (hk9Var != null && (tam0Var4 = (u440Var3 = hk9Var.b).B0) != null && !tam0Var4.c) {
            v7c0 v7c0Var = hk9Var.e;
            v76 v76Var3 = hk9Var.a;
            a4 = t7c0.a(v76Var3.getRequireContext(), v7c0Var.a(v76Var3.getRequireContext(), hk9Var.c.b, hk9Var.d.a(), null), new d7(hk9Var, 11), new s7c0(0));
            u440Var3.v2((nov) a4);
            hk9Var.a(a4);
        }
        if (!zcl0Var.s() && (jo9Var = this.c) != null) {
            lh9 lh9Var2 = jo9Var.d;
            u440 u440Var5 = jo9Var.b;
            tam0 tam0Var5 = u440Var5.B0;
            if (tam0Var5 != null && !tam0Var5.c) {
                v7c0 v7c0Var2 = (v7c0) jo9Var.f.getValue();
                v76 v76Var4 = jo9Var.a;
                Context requireContext2 = v76Var4.getRequireContext();
                VideoFile videoFile5 = jo9Var.c;
                StoryPostInfo storyPostInfo = jo9Var.e;
                Post post = storyPostInfo != null ? storyPostInfo.b : null;
                Size a5 = lh9Var2.a();
                v7c0Var2.getClass();
                Owner s = videoFile5.s();
                List singletonList2 = Collections.singletonList(q7c0.b.e.a);
                List singletonList3 = Collections.singletonList(new VideoAttachment(videoFile5));
                u7c0.a aVar3 = new u7c0.a(singletonList2, singletonList3, null, 0, 16);
                List c2 = v7c0.c(singletonList3, a5);
                PostStickerStyle postStickerStyle = (PostStickerStyle) j5g.Y(c2);
                u7c0.f fVar = new u7c0.f(videoFile5.o0(), videoFile5.I0());
                if (s == null || (userId = s.b) == null) {
                    userId = UserId.d;
                }
                a3 = t7c0.a(v76Var4.getRequireContext(), new u7c0(0, userId, v7c0Var2.b(requireContext2, post, s), v7c0.d(post), "", null, aVar3, fVar, null, new u7c0.e(postStickerStyle, c2)), new kf1(jo9Var, 8), new s7c0(0));
                u440Var5.v2((nov) a3);
                String contentImageUrl = a3.getContentImageUrl();
                if (contentImageUrl != null) {
                    lh9Var2.b(contentImageUrl, new e87(1, lh9Var2, lh9.class, "setBlurredBackground", "setBlurredBackground(Landroid/graphics/Bitmap;Z)V", 0));
                } else {
                    Context requireContext3 = v76Var4.getRequireContext();
                    e3m.a aVar4 = e3m.a;
                    Bitmap createBitmap = Bitmap.createBitmap(new int[]{requireContext3.getColor(R.color.vk_gray_700)}, 1, 1, Bitmap.Config.ARGB_8888);
                    u440 u440Var6 = lh9Var2.b;
                    gyl0 gyl0Var = u440Var6.p;
                    if (gyl0Var != null) {
                        gyl0Var.L5(createBitmap);
                    }
                    u440Var6.N7(createBitmap);
                    tam0 tam0Var6 = u440Var6.B0;
                    if (tam0Var6 != null) {
                        tam0Var6.t = createBitmap;
                    }
                }
            }
        }
        if (!zcl0Var.s() && (sg9Var = this.d) != null) {
            lh9 lh9Var3 = (lh9) sg9Var.e;
            u440 u440Var7 = (u440) sg9Var.c;
            tam0 tam0Var7 = u440Var7.B0;
            if (tam0Var7 != null && !tam0Var7.c) {
                v7c0 v7c0Var3 = (v7c0) sg9Var.f.getValue();
                v76 v76Var5 = (v76) sg9Var.b;
                v76Var5.getRequireContext();
                ChannelMessageAttachment channelMessageAttachment = (ChannelMessageAttachment) sg9Var.d;
                Size a6 = lh9Var3.a();
                v7c0Var3.getClass();
                long j2 = channelMessageAttachment.f;
                gzs<s3q0> gzsVar = fkq0.a;
                UserId userId2 = new UserId(j2);
                String str6 = channelMessageAttachment.i;
                ImageList imageList = channelMessageAttachment.q;
                if (imageList == null || (str2 = imageList.Db()) == null) {
                    str2 = str;
                }
                u7c0.c cVar = new u7c0.c(str6, null, str2);
                List D0 = j5g.D0(new ig2(1), channelMessageAttachment.l);
                ArrayList a7 = r7c0.a(null, D0);
                u7c0.a aVar5 = new u7c0.a(a7, D0, null, 0, 24);
                boolean f2 = v7c0.f(a7);
                v7c0Var3.a = f2;
                if (!f2) {
                    a = v7c0.c(D0, a6);
                } else if (D0.isEmpty()) {
                    PostStickerStyle.Companion.getClass();
                    a = e43.l(PostStickerStyle.SIMPLIFIED_LIGHT, PostStickerStyle.SIMPLIFIED_DARK, PostStickerStyle.LIGHT, PostStickerStyle.DARK);
                } else {
                    PostStickerStyle.Companion.getClass();
                    a = PostStickerStyle.a.a(false);
                }
                a2 = t7c0.a(v76Var5.getRequireContext(), new u7c0(0, userId2, cVar, null, channelMessageAttachment.j, null, aVar5, null, new u7c0.b(channelMessageAttachment.h, new UserId(j2), new UserId(channelMessageAttachment.g.b)), new u7c0.e((PostStickerStyle) j5g.Y(a), a)), new j9(sg9Var, 16), new s7c0(0));
                u440Var7.v2((nov) a2);
                String contentImageUrl2 = a2.getContentImageUrl();
                if (contentImageUrl2 != null) {
                    lh9Var3.b(contentImageUrl2, new rg9(1, lh9Var3, lh9.class, "setBlurredBackground", "setBlurredBackground(Landroid/graphics/Bitmap;Z)V", 0, 0));
                } else {
                    Context requireContext4 = v76Var5.getRequireContext();
                    e3m.a aVar6 = e3m.a;
                    Bitmap createBitmap2 = Bitmap.createBitmap(new int[]{requireContext4.getColor(R.color.vk_gray_700)}, 1, 1, Bitmap.Config.ARGB_8888);
                    u440 u440Var8 = lh9Var3.b;
                    gyl0 gyl0Var2 = u440Var8.p;
                    if (gyl0Var2 != null) {
                        gyl0Var2.L5(createBitmap2);
                    }
                    u440Var8.N7(createBitmap2);
                    tam0 tam0Var8 = u440Var8.B0;
                    if (tam0Var8 != null) {
                        tam0Var8.t = createBitmap2;
                    }
                }
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 == copyOnWriteArrayList.size()) {
                novVar = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i4) instanceof rcd) {
                    novVar = copyOnWriteArrayList.get(i4);
                    break;
                }
                i4++;
            }
        }
        if (((rcd) novVar) == null && (t4fVar = this.e) != null && (tam0Var3 = (u440Var2 = t4fVar.c).B0) != null && !tam0Var3.c) {
            v76 v76Var6 = t4fVar.a;
            ClipStatStoryData clipStatStoryData = t4fVar.b;
            long j3 = clipStatStoryData.c;
            UserId userId3 = clipStatStoryData.d;
            char c3 = (char) 8239;
            DecimalFormat decimalFormat = uqm0.d;
            if (decimalFormat == null) {
                decimalFormat = new DecimalFormat();
                uqm0.d = decimalFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setGroupingSeparator(c3);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
            String format = decimalFormat.format(j3);
            int i5 = t4f.a.$EnumSwitchMapping$0[clipStatStoryData.b.ordinal()];
            if (i5 == 1) {
                rcdVar = new rcd(R.drawable.icon_profile_views, t4fVar.a(enj.h(v76Var6.getRequireContext().getResources(), fkq0.b(userId3) ? R.plurals.clips_stat_story_group_views : R.plurals.clips_stat_story_views, j3, format)), v76Var6.getRequireContext());
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rcdVar = new rcd(R.drawable.icon_profile_likes, t4fVar.a(enj.h(v76Var6.getRequireContext().getResources(), fkq0.b(userId3) ? R.plurals.clips_stat_story_group_likes : R.plurals.clips_stat_story_likes, j3, format)), v76Var6.getRequireContext());
            }
            u440Var2.v2(rcdVar);
        }
        int i6 = 9;
        int i7 = 7;
        if (tam0Var.a == null && tam0Var.d() == null && (yj9Var = this.g) != null && (tam0Var2 = (u440Var = yj9Var.b).B0) != null && !tam0Var2.c && !yj9Var.e) {
            Photo photo2 = yj9Var.c;
            PhotoRestriction photoRestriction = photo2.L;
            if (photoRestriction != null) {
                int i8 = 1;
                if (!photoRestriction.d) {
                    io.reactivex.rxjava3.internal.operators.observable.m1 a0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new vm8(yj9Var, i8)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    ea eaVar = new ea(yj9Var, 8);
                    int i9 = kwg0.a;
                    u440Var.a(a0.subscribe(eaVar, new iwg0()));
                }
            }
            boolean Ib = photo2.Ib();
            ImageSize Fb = photo2.Fb(iah0.z(yj9Var.a), false);
            String valueOf = Ib ? String.valueOf(ixj0.n(photo2.y.b)) : Fb.d.d;
            int b = Ib ? cn70.b(360) : 0;
            io.reactivex.rxjava3.internal.operators.observable.m1 a02 = mcr0.i(Uri.parse(valueOf), 0, 0, 0, null, photo2.Hb() ? edg0.a : null).U(new ft0(new xj9(yj9Var, b, Ib ? an10.b(b / Fb.E0()) : 0), i7)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            js1 js1Var = new js1(yj9Var, i6);
            int i10 = kwg0.a;
            u440Var.a(a02.subscribe(js1Var, new iwg0()));
        }
        int i11 = 0;
        while (true) {
            if (i11 == copyOnWriteArrayList.size()) {
                novVar2 = null;
                break;
            } else {
                if (copyOnWriteArrayList.get(i11) instanceof ixs0) {
                    novVar2 = copyOnWriteArrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (novVar2 == null) {
            shb shbVar = this.o;
            v76 v76Var7 = (v76) shbVar.a;
            u440 u440Var9 = (u440) shbVar.b;
            tam0 tam0Var9 = u440Var9.B0;
            mat0 d = tam0Var9 != null ? tam0Var9.d() : null;
            tam0 tam0Var10 = u440Var9.B0;
            String str7 = tam0Var10 != null ? tam0Var10.r : null;
            if (str7 != null && d != null) {
                gxs0 gxs0Var = new gxs0(v76Var7.getRequireContext(), str7);
                u440Var9.O = new m360(gxs0Var, 21);
                ixs0 ixs0Var = new ixs0(v76Var7.getRequireContext(), d, false);
                ixs0Var.setOnMatrixChanged(new hsc0(gxs0Var, 15));
                ixs0Var.z();
                u440Var9.v2(ixs0Var);
                u440Var9.v2(gxs0Var);
            }
        }
        this.s.a(tam0Var);
        this.t.getClass();
        Iterator<nov> it2 = tam0Var.h.a.iterator();
        while (it2.hasNext() && !(it2.next() instanceof abm0)) {
        }
        a8w0 a8w0Var = this.p;
        int i12 = 17;
        int i13 = 13;
        if (a8w0Var != null) {
            ShareVmojiStoryParams shareVmojiStoryParams = a8w0Var.b;
            if (!shareVmojiStoryParams.c.isEmpty()) {
                lh9 lh9Var4 = a8w0Var.c;
                StoryBackgroundType storyBackgroundType = StoryBackgroundType.GRAPHICS;
                List<StoryBackground> list3 = shareVmojiStoryParams.c;
                gyl0 gyl0Var3 = lh9Var4.b.p;
                if (gyl0Var3 != null) {
                    gyl0Var3.M1(storyBackgroundType, list3);
                }
            }
            int i14 = iah0.f().widthPixels;
            io.reactivex.rxjava3.internal.operators.observable.y2 E02 = new io.reactivex.rxjava3.internal.operators.observable.i0(io.reactivex.rxjava3.core.q.O(shareVmojiStoryParams.b).U(new cyh0(new zjb(i14, 1), 8)), new d810(new n1g0(i13), 16)).L(new wx40(new ye40(29), i12), false).U(new xx40(new ja90(a8w0Var, i14, 1), 18)).E0();
            vks0 vks0Var = new vks0(new vgs0(a8w0Var, 8), 2);
            int i15 = kwg0.a;
            E02.subscribe(vks0Var, new iwg0());
        }
        yi9 yi9Var = this.h;
        if (yi9Var != null) {
            StoryLocalPhotoSticker storyLocalPhotoSticker = yi9Var.c;
            Context context = yi9Var.a;
            u440 u440Var10 = yi9Var.b;
            tam0 tam0Var11 = u440Var10.B0;
            if (tam0Var11 != null && !tam0Var11.c) {
                InputStream openInputStream = context.getContentResolver().openInputStream(storyLocalPhotoSticker.b);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                    ro.e(openInputStream, null);
                    Bitmap a8 = yi9.a(decodeStream, context, Float.valueOf(storyLocalPhotoSticker.c));
                    lh9.d(yi9Var.d, a8);
                    com.vk.stickers.api.models.photo.PhotoStickerStyle.Companion.getClass();
                    list2 = com.vk.stickers.api.models.photo.PhotoStickerStyle.patterns;
                    c8m0 c8m0Var = new c8m0(a8, (com.vk.stickers.api.models.photo.PhotoStickerStyle) j5g.Y(list2), false, false);
                    c8m0Var.q = u440Var10.j.x().f != null;
                    u440Var10.v2(c8m0Var);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(openInputStream, th);
                        throw th2;
                    }
                }
            }
        }
        ek9 ek9Var = this.f;
        if (ek9Var != null) {
            StoryEditorPollAttach storyEditorPollAttach = ek9Var.b;
            u440 u440Var11 = ek9Var.a;
            tam0 tam0Var12 = u440Var11.B0;
            if (tam0Var12 == null || !tam0Var12.c) {
                Poll poll = (Poll) storyEditorPollAttach.b;
                PollBackground pollBackground = poll.s;
                y2l0 a9 = pollBackground instanceof PollContentColor ? ek9Var.c.a(pollBackground != null ? pollBackground.c : 0) : null;
                float f3 = r8m0.Z;
                boolean z7 = a9 != null;
                if ((1 & 4) != 0) {
                    a9 = null;
                }
                q8m0 q8m0Var = new q8m0(poll, true, new s8m0(z7, a9));
                r8m0 r8m0Var = new r8m0(q8m0Var, true);
                r8m0Var.c.q = storyEditorPollAttach.d;
                StoryEditorAttachPosition storyEditorAttachPosition = storyEditorPollAttach.c;
                if (storyEditorAttachPosition == null) {
                    u440Var11.v2(r8m0Var);
                } else {
                    float f4 = f2l0.a;
                    u440Var11.R7(r8m0Var, new bk9(storyEditorAttachPosition, 0));
                }
                final int b2 = an10.b(r8m0.Z);
                if ((pollBackground instanceof PhotoPoll) && ((PhotoPoll) pollBackground).g == null) {
                    final PhotoPoll photoPoll = (PhotoPoll) pollBackground;
                    io.reactivex.rxjava3.internal.operators.observable.m1 a03 = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.ck9
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            PhotoPoll photoPoll2 = (PhotoPoll) photoPoll;
                            Bitmap bitmap = photoPoll2.f;
                            if (bitmap != null) {
                                return bitmap;
                            }
                            ImageSize Cb2 = photoPoll2.e.Cb(b2, true, true);
                            return mcr0.h(Uri.parse(Cb2 != null ? Cb2.d.d : null)).a();
                        }
                    }).r0(u440Var11.H0).a0(io.reactivex.rxjava3.android.schedulers.a.b());
                    j50 j50Var = new j50(new dk9(photoPoll, b2, r8m0Var, q8m0Var), i7);
                    int i16 = kwg0.a;
                    u440Var11.a(a03.subscribe(j50Var, new iwg0()));
                }
            }
        }
        qk9 qk9Var = this.j;
        if (qk9Var != null) {
            u440 u440Var12 = qk9Var.b;
            v76 v76Var8 = qk9Var.a;
            gpj0 gpj0Var = qk9Var.d;
            if (!tam0Var.b()) {
                StoryQuestion storyQuestion = qk9Var.c;
                if (storyQuestion instanceof StoryQuestionAnswer) {
                    u440Var12.v2(new ppe0(v76Var8.getRequireContext(), (StoryQuestionAnswer) storyQuestion, gpj0Var.s(), gpj0Var.getName(), gpj0Var.getUid()));
                } else {
                    if (!epx.f(storyQuestion, StoryQuestionSharing.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hmo0.e eVar = hmo0.d;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    String a10 = imo0.a(alignment);
                    switch (a10.hashCode()) {
                        case -1364013995:
                            if (a10.equals(TtmlNode.CENTER)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3317767:
                            if (a10.equals(TtmlNode.LEFT)) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 108511772:
                            if (a10.equals(TtmlNode.RIGHT)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case 1:
                            break;
                        case 2:
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        default:
                            alignment = null;
                            break;
                    }
                    imo0 imo0Var = (eVar == null || alignment == null) ? null : new imo0(eVar, -1, alignment);
                    new cco0().b(imo0Var);
                    if (eVar != null) {
                        eVar.d = imo0Var.b(eVar);
                        eVar.b(imo0Var);
                    }
                    xlo0 xlo0Var = new xlo0(v76Var8.getLayoutWidth() - xlo0.p, y8g0.e(R.string.story_question_sharing_sticker_body), imo0Var);
                    TextBackgroundInfo textBackgroundInfo = imo0Var.k;
                    float f5 = 2;
                    nov.a.i(xlo0Var, (((xlo0Var.getOriginalWidth() + (textBackgroundInfo.b + textBackgroundInfo.d)) - iah0.f().widthPixels) / f5) + cn70.b(20), cn70.b(30) + xlo0Var.getOriginalHeight());
                    u440Var12.v2(xlo0Var);
                    ImageList f6 = gpj0Var.f();
                    if (f6 != null && (Db = f6.Db()) != null) {
                        qpe0 qpe0Var = new qpe0(v76Var8.getRequireContext(), Db);
                        nov.a.i(qpe0Var, wq.a(qpe0Var.getOriginalWidth(), iah0.f().widthPixels, f5, cn70.b(20)), cn70.b(30) + (-qpe0Var.getOriginalHeight()));
                        u440Var12.v2(qpe0Var);
                    }
                }
            }
        }
        pf9 pf9Var = this.k;
        if (pf9Var != null) {
            List<StoryAnswer> list4 = pf9Var.c;
            if (!tam0Var.b()) {
                int i17 = 0;
                for (Object obj : j5g.H0(list4, 9)) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        e43.t();
                        throw null;
                    }
                    StoryAnswer storyAnswer = (StoryAnswer) obj;
                    gpj0 gpj0Var2 = pf9Var.d;
                    int i19 = storyAnswer.d;
                    UserId userId4 = storyAnswer.b;
                    StoryQuestionAnswer storyQuestionAnswer = new StoryQuestionAnswer(Integer.valueOf(i19), fkq0.b(userId4) ? new UserProfile(pf9Var.e.b(userId4)).l0() : gpj0Var2.s(), storyAnswer.e, storyAnswer.f, storyAnswer.j, storyAnswer.k);
                    Context requireContext5 = pf9Var.a.getRequireContext();
                    String name = gpj0Var2.getName();
                    UserId uid = gpj0Var2.getUid();
                    UserProfile userProfile2 = storyAnswer.g;
                    ppe0 ppe0Var = new ppe0(requireContext5, storyQuestionAnswer, userProfile2 != null ? userProfile2.l0() : null, name, uid);
                    pf9Var.b.R7(ppe0Var, ((yzs[]) pf9.f.getValue())[i17]);
                    if (list4.size() > 6) {
                        nov.a.f(ppe0Var, 0.66f, ppe0Var.getCenterX(), ppe0Var.getCenterY());
                    }
                    i17 = i18;
                }
            }
        }
        nj9 nj9Var = this.l;
        if (nj9Var != null) {
            j9 j9Var = new j9(nj9Var, i12);
            MusicTrack musicTrack2 = nj9Var.c;
            Thumb Jb = musicTrack2.Jb();
            String Ab2 = Jb != null ? Jb.Ab(0, false) : null;
            if (Ab2 != null) {
                nj9Var.d.b(Ab2, new nm1(2, j9Var, nj9Var));
            } else {
                j9Var.invoke(nj9Var.e.b());
            }
            nj9Var.b.v2(new p550(nj9Var.a.getRequireContext(), musicTrack2));
        }
        ak9 ak9Var = this.m;
        if (ak9Var != null) {
            v76 v76Var9 = ak9Var.a;
            ha haVar = new ha(ak9Var, i13);
            Playlist playlist = ak9Var.c;
            Thumb thumb = playlist.m;
            String Ab3 = thumb != null ? thumb.Ab(0, false) : null;
            if (Ab3 != null) {
                ak9Var.d.b(Ab3, new rh4(4, haVar, ak9Var));
                novVar3 = null;
            } else {
                List<Thumb> list5 = playlist.p;
                if (list5 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        Cb = ((Thumb) it3.next()).Cb(0, false);
                        if (Cb != null) {
                            arrayList2.add(Cb);
                        }
                    }
                    list = j5g.O0(arrayList2);
                }
                list = EmptyList.b;
                if (list.isEmpty()) {
                    novVar3 = null;
                    haVar.invoke(ak9Var.e.b());
                } else {
                    novVar3 = null;
                    ThumbsImageView.a aVar7 = new ThumbsImageView.a(list, e3m.a(R.dimen.music_playlist_image, v76Var9.getRequireContext()), null);
                    zj9 zj9Var = new zj9(haVar, ak9Var);
                    asu0.a.getClass();
                    aVar7.d(zj9Var, asu0.n());
                }
            }
            ak9Var.b.v2(new eeb0(v76Var9.getRequireContext(), playlist));
        } else {
            novVar3 = null;
        }
        int i20 = 0;
        while (true) {
            if (i20 == copyOnWriteArrayList.size()) {
                novVar4 = novVar3;
            } else if (copyOnWriteArrayList.get(i20) instanceof h5a0) {
                novVar4 = copyOnWriteArrayList.get(i20);
            } else {
                i20++;
            }
        }
        if (novVar4 == null && (vj9Var = this.n) != null) {
            Context context2 = vj9Var.a;
            u440 u440Var13 = vj9Var.b;
            Photo photo3 = vj9Var.e;
            float f7 = r5.b / r5.c;
            String str8 = photo3.Fb(iah0.z(context2), false).d.d;
            lh9 lh9Var5 = vj9Var.d;
            lh9Var5.b(jeq0.g(str8).toString(), new kh9(1, lh9Var5, lh9.class, "setBlurredBackground", "setBlurredBackground(Landroid/graphics/Bitmap;Z)V", 0));
            StoryEditorPhotoAlbumAttachment storyEditorPhotoAlbumAttachment = vj9Var.c;
            Object obj2 = storyEditorPhotoAlbumAttachment.b;
            Photo photo4 = (Photo) obj2;
            long j4 = photo4.e.b;
            int i21 = photo4.d;
            int i22 = storyEditorPhotoAlbumAttachment.f;
            UserProfile userProfile3 = photo4.B;
            String str9 = (userProfile3 == null || (D = userProfile3.D()) == null) ? str : D;
            Photo photo5 = (Photo) obj2;
            UserProfile userProfile4 = photo5.B;
            h5a0 h5a0Var = new h5a0(context2, new i5a0(j4, i21, str8, f7, i22, str9, userProfile4 != null ? VerifyInfoHelper.h(VerifyInfoHelper.a, userProfile4.B, context2, VerifyInfoHelper.ColorTheme.white, 24) : novVar3, photo3.L, new i5a0.a(AlbumStickerStyle.Preview, AlbumStickerStyle.h())), false);
            if (drm0.N(str9)) {
                io.reactivex.rxjava3.internal.operators.observable.j1 a11 = ((b2m0) lh9Var5.d.getValue()).a(photo5.e);
                int i23 = 8;
                com.vk.movika.sdk.base.flow.binding.c cVar2 = new com.vk.movika.sdk.base.flow.binding.c(new wr0(4), i23);
                a11.getClass();
                u440Var13.a(new io.reactivex.rxjava3.internal.operators.observable.c2(a11, cVar2).a0(asu0.a.d()).subscribe(new cw(new nk0(3, h5a0Var, vj9Var), i23), new ew(new od3(2), 5)));
            }
            u440Var13.v2(h5a0Var);
        }
        qx5 e = zcl0Var.e();
        if (e != null) {
            e.setStickerVisible(true);
        }
    }
}
