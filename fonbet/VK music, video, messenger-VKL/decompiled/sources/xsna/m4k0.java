package xsna;

import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.base.dto.BasePropertyExistsDto;
import com.vk.api.generated.video.dto.VideoGetAlbumsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stories.StorySettingsActivity;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import java.util.ArrayList;
import java.util.List;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m4k0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ m4k0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0201 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0203  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        tjo0 b;
        hik0 hik0Var;
        Image image;
        switch (this.b) {
            case 0:
                return SmartCropState.a((SmartCropState) obj, null, null, null, null, 0L, false, null, false, false, null, 1535);
            case 1:
                return drm0.p0(((pno0) obj).d()).toString();
            case 2:
                return StickerPackPreview.zb((StickerPackPreview) obj, 258047);
            case 3:
                qgi0.r((tgi0) obj, "add_naratives_button");
                return s3q0.a;
            case 4:
                int i2 = StorySettingsActivity.P;
                qgi0.r((tgi0) obj, "toolbar");
                return s3q0.a;
            case 5:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM story_statistics_viewers_meta");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 6:
                qgo0 qgo0Var = (qgo0) obj;
                String str = qgo0Var.g.c;
                long j = qgo0Var.f;
                int i3 = qko0.c;
                int i4 = (int) (j & 4294967295L);
                if (i4 > 0) {
                    androidx.emoji2.text.c h = kci.h();
                    if (h != null) {
                        int b2 = h.b(i4 - 1, str);
                        if (b2 >= 0) {
                            i = b2;
                        } else if (i4 > 0) {
                            i = Character.offsetByCodePoints(str, i4, -1);
                        }
                        if (i == -1) {
                        }
                    } else if (i4 > 0) {
                        i = Character.offsetByCodePoints(str, i4, -1);
                        if (i == -1) {
                            return null;
                        }
                        return new ivl(((int) (qgo0Var.f & 4294967295L)) - i, 0);
                    }
                }
                i = -1;
                if (i == -1) {
                }
            case 7:
                us2.d dVar = (us2.d) obj;
                T t = dVar.a;
                if (!(t instanceof q8z) || (b = ((q8z) t).b()) == null || (b.a == null && b.b == null && b.c == null && b.d == null)) {
                    return e43.a(dVar);
                }
                tjo0 b3 = ((q8z) dVar.a).b();
                if (b3 == null || (hik0Var = b3.a) == null) {
                    hik0Var = new hik0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, MinElf.PN_XNUM);
                }
                return e43.a(dVar, new us2.d(hik0Var, dVar.b, dVar.c));
            case 8:
                MusicTrack musicTrack = ((fgp0) obj).b;
                Thumb Jb = musicTrack.Jb();
                if (Jb == null) {
                    Jb = lso0.a;
                }
                Thumb thumb = Jb;
                String str2 = musicTrack.d;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = musicTrack.e;
                String str4 = str3 != null ? str3 : "";
                if (!drm0.N(str4)) {
                    str2 = str2 + " (" + drm0.q0(str4, '(', ')') + ')';
                }
                return new sb50(thumb, str2, fai.d(musicTrack).toString(), musicTrack.Lb(), (musicTrack.Q & 4) != 0);
            case 9:
                return new sq2(((Float) obj).floatValue());
            case 10:
                int intValue = ((Integer) obj).intValue();
                int i5 = VideoProfileCreatorOnboardingVideoCounterView.o;
                return Integer.valueOf(-intValue);
            case 11:
                return ((SubtitleRenderItem) obj).b;
            case 12:
                return xbu0.i;
            case 13:
                return new g6w0((ViewGroup) obj);
            default:
                VideoGetAlbumsExtendedResponseDto videoGetAlbumsExtendedResponseDto = (VideoGetAlbumsExtendedResponseDto) obj;
                List<VideoVideoAlbumFullDto> d = videoGetAlbumsExtendedResponseDto.d();
                int i6 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (VideoVideoAlbumFullDto videoVideoAlbumFullDto : d) {
                    int id = videoVideoAlbumFullDto.getId();
                    UserId q = videoVideoAlbumFullDto.q();
                    int l = videoVideoAlbumFullDto.l();
                    String title = videoVideoAlbumFullDto.getTitle();
                    int count = videoVideoAlbumFullDto.getCount();
                    List<VideoVideoImageDto> g = videoVideoAlbumFullDto.g();
                    if (g != null) {
                        List<VideoVideoImageDto> list = g;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list, i6));
                        for (VideoVideoImageDto videoVideoImageDto : list) {
                            String url = videoVideoImageDto.getUrl();
                            int width = videoVideoImageDto.getWidth();
                            int height = videoVideoImageDto.getHeight();
                            BasePropertyExistsDto d2 = videoVideoImageDto.d();
                            arrayList2.add(new ImageSize(url, width, height, videoVideoImageDto.e(), (char) 0, d2 != null && d2.i() == 1, 16, null));
                        }
                        image = new Image(arrayList2);
                    } else {
                        image = Image.d;
                    }
                    arrayList.add(new lvw0(id, q, title, l, count, image, videoVideoAlbumFullDto.i() == BasePropertyExistsDto.PROPERTY_EXISTS));
                    i6 = 10;
                }
                return new s6x0(arrayList, videoGetAlbumsExtendedResponseDto.getCount());
        }
    }

    public /* synthetic */ m4k0(kvw0 kvw0Var) {
        this.b = 14;
    }
}
