package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerMemoryTypeDto;
import com.vk.attachpicker.stickers.photo.PhotoStickerStyle;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.StoryUploadType;
import com.vk.dto.stories.model.clickable.ClickablePhoto;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.user.UserProfile;
import com.vk.media.entities.StoryEditorParams;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.nov;

/* compiled from: StoryAvatarChangeController.kt */
/* loaded from: classes6.dex */
public final class wxl0 implements w8i {
    public static boolean i;
    public static int j;
    public static boolean k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    public static final wxl0 b = new wxl0();
    public static final bpn0 c = new bpn0(new g2c0(6));
    public static final bpn0 d = new bpn0(new com.vk.movika.sdk.base.logic.interactor.m(26));
    public static final bpn0 e = new bpn0(new la0(23));
    public static final bpn0 f = new bpn0(new vxl0(0));
    public static File g = new File("");
    public static RectF h = new RectF();
    public static boolean o = true;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(boolean z, boolean z2, boolean z3) {
        m = false;
        n = false;
        k = z;
        l = z2;
        o = z3;
        String str = ((UserProfile) rsg0.a0(new e1r0(o25.a().c(), new String[]{"has_photo", "photo_base"})).a()).P;
        if (str == null) {
            return;
        }
        kd7.m(mcr0.h(Uri.parse(str)).a(), (File) c.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(File file, File file2, Integer num) {
        if (i) {
            return;
        }
        Regex regex = com.vk.core.files.a.a;
        if (vhk0.g(file) && vhk0.g(file2)) {
            i = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(file2.getAbsolutePath());
            if (decodeFile == null) {
                return;
            }
            Bitmap k2 = kd7.k(decodeFile, ahn.t(file2), false);
            if (k2 != null) {
                decodeFile = k2;
            }
            bpn0 bpn0Var = f;
            boolean a = ((cyl0) bpn0Var.getValue()).a(decodeFile);
            Pair<Bitmap, RectF> b2 = ((cyl0) bpn0Var.getValue()).b(decodeFile);
            StoryUploadParams storyUploadParams = new StoryUploadParams();
            storyUploadParams.f = StoryUploadParams.CameraType.AVATAR;
            RectF j2 = b2.j();
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (j2 != null) {
                RectF j3 = b2.j();
                if (j3 != null) {
                    float f3 = j3.left;
                    if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1080.0f) {
                        f3 = 1080.0f;
                    }
                    float f4 = j3.top;
                    if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f4 = 0.0f;
                    }
                    if (f4 > 1920.0f) {
                        f4 = 1920.0f;
                    }
                    float f5 = j3.right;
                    if (f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f5 = 0.0f;
                    }
                    float f6 = f5 <= 1080.0f ? f5 : 1080.0f;
                    float f7 = j3.bottom;
                    if (f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f2 = f7;
                    }
                    float f8 = f2 <= 1920.0f ? f2 : 1920.0f;
                    int i2 = (int) f3;
                    int i3 = (int) f4;
                    int i4 = (int) f6;
                    int i5 = (int) f8;
                    ClickablePhoto clickablePhoto = new ClickablePhoto(0L, e43.l(new WebClickablePoint(i2, i3), new WebClickablePoint(i4, i3), new WebClickablePoint(i4, i5), new WebClickablePoint(i2, i5)), null, null, o25.a().c().b, num != null ? num.intValue() : 0, (a ? PhotoStickerStyle.FULLSCREEN : PhotoStickerStyle.PREVIEW).j(), null, 5, null);
                    storyUploadParams.K = StoriesGetPhotoUploadServerMemoryTypeDto.AVATAR.j();
                    storyUploadParams.j = new ClickableStickers(1080, 1920, e43.o(clickablePhoto));
                }
            } else {
                Bitmap i6 = b2.i();
                r8m0 r8m0Var = new r8m0(new q8m0(((PollAttachment) rsg0.a0(new ztb0(y8g0.e(R.string.story_new_avatar_poll), e43.l(y8g0.e(R.string.story_new_avatar_left), y8g0.e(R.string.story_new_avatar_right)), o25.a().c(), false, false, false, null, null, Long.valueOf(TimeUnit.MINUTES.toSeconds(5L) + TimeUnit.DAYS.toSeconds(1L) + (System.currentTimeMillis() / 1000)), null, null, "story_new_avatar")).a()).f, false, new s8m0(false, null)), true);
                float width = i6.getWidth() * 0.7f;
                nov.a.f(r8m0Var, width / r8m0.Z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                nov.a.i(r8m0Var, (i6.getWidth() - width) * 0.5f, i6.getHeight() * 0.57f);
                nov.a.a(r8m0Var, new Canvas(i6), true);
                storyUploadParams.j = new ClickableStickers(1080, 1920, new ArrayList(aal0.g(r8m0Var)));
            }
            File s = com.vk.core.files.a.s();
            if (kd7.m(b2.i(), s)) {
                List singletonList = Collections.singletonList(new StoryMediaData(s, null, storyUploadParams, null));
                StoryEditorParams storyEditorParams = new StoryEditorParams(1080, 1920);
                CommonUploadParams commonUploadParams = new CommonUploadParams(o25.a().c(), true, null, null, null, null, null, null, null, StoryUploadType.PUBLISH_NOW, null, false, null, false, null, null, 65020, null);
                commonUploadParams.o = false;
                commonUploadParams.h = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.CHANGE_AVATAR.toString().toLowerCase(Locale.ROOT);
                j = ((uvl0) e.getValue()).b(new StoryMultiData(singletonList, storyEditorParams, commonUploadParams, 0, null, 24, null));
                i = false;
            }
        }
    }

    public final void b() {
        if (o) {
            if (!k || m) {
                if (!l || n) {
                    bpn0 bpn0Var = d;
                    String absolutePath = (((File) bpn0Var.getValue()).isFile() ? (File) bpn0Var.getValue() : g).getAbsolutePath();
                    RectF rectF = h;
                    Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath);
                    int width = (int) (rectF.left * decodeFile.getWidth());
                    int height = (int) (rectF.top * decodeFile.getHeight());
                    int width2 = decodeFile.getWidth() + width;
                    if (rectF.width() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        width2 = Math.min((int) (rectF.width() * decodeFile.getWidth()), width2);
                    }
                    int height2 = decodeFile.getHeight() + height;
                    if (rectF.height() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        height2 = Math.min((int) (rectF.height() * decodeFile.getHeight()), height2);
                    }
                    Bitmap k2 = kd7.k(Bitmap.createBitmap(decodeFile, width, height, width2, height2), ahn.t(new File(absolutePath)), false);
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    Bitmap g2 = kd7.g(context, k2);
                    Context context2 = e43.a;
                    i0q0.f(new cf00(new BitmapDrawable((context2 != null ? context2 : null).getResources(), g2), 28));
                    c();
                }
            }
        }
    }

    public final synchronized void c() {
        File file = (File) c.getValue();
        Regex regex = com.vk.core.files.a.a;
        vhk0.b(file);
        vhk0.b((File) d.getValue());
        g = new File("");
        i = false;
        j = 0;
    }
}
