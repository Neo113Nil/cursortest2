package xsna;

import android.net.Uri;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.Artist;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoNotificationsStatus;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.o;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class id5 implements zzs {
    public final /* synthetic */ VideoFile b;
    public final /* synthetic */ jd5 c;

    public /* synthetic */ id5(VideoFile videoFile, jd5 jd5Var) {
        this.b = videoFile;
        this.c = jd5Var;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        VideoNotificationsStatus videoNotificationsStatus;
        CharSequence P;
        Long l;
        CharSequence charSequence;
        boolean z;
        Long l2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        Artist artist;
        AboutVideoItem.d.b bVar = (AboutVideoItem.d.b) obj;
        Uri uri = (Uri) obj2;
        AboutVideoItem.d.a aVar = (AboutVideoItem.d.a) obj3;
        AboutVideoItem.d.InterfaceC1215d interfaceC1215d = (AboutVideoItem.d.InterfaceC1215d) obj4;
        if (bVar instanceof com.vk.libvideo.bottomsheet.about.delegate.o) {
            com.vk.libvideo.bottomsheet.about.delegate.o oVar = (com.vk.libvideo.bottomsheet.about.delegate.o) bVar;
            if (epx.f(oVar, o.a.C1219a.a)) {
                videoNotificationsStatus = VideoNotificationsStatus.ALL;
            } else if (epx.f(oVar, o.a.b.a)) {
                videoNotificationsStatus = VideoNotificationsStatus.NONE;
            } else {
                if (!epx.f(oVar, o.a.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                videoNotificationsStatus = VideoNotificationsStatus.PREFERRED;
            }
        } else {
            videoNotificationsStatus = null;
        }
        VideoFile videoFile = this.b;
        videoFile.J6(videoNotificationsStatus);
        Owner s = videoFile.s();
        boolean Y0 = fxc0.B().J().Y0();
        boolean z6 = videoFile instanceof MusicVideoFile;
        if (!z6 || Y0) {
            P = videoFile.P();
        } else {
            dhr0.a.getClass();
            MusicVideoFile musicVideoFile = (MusicVideoFile) videoFile;
            P = s490.d(dhr0.E(), s490.i(musicVideoFile.B1), s490.c(musicVideoFile.C1), R.attr.vk_ui_text_secondary);
        }
        VerifyInfo Y = videoFile.Y();
        boolean z7 = false;
        if (Y == null || !Y.b) {
            l = null;
            charSequence = P;
            z = false;
        } else {
            l = null;
            charSequence = P;
            z = true;
        }
        Owner s2 = videoFile.s();
        if (s2 == null || !s2.i(1024)) {
            l2 = l;
            z2 = false;
        } else {
            l2 = l;
            z2 = true;
        }
        Owner s3 = videoFile.s();
        int i2 = s3 != null ? s3.t : 0;
        Boolean m3 = videoFile.m3();
        boolean booleanValue = m3 != null ? m3.booleanValue() : false;
        if (z6 && fxc0.B().J().M0()) {
            List<Artist> list = ((MusicVideoFile) videoFile).B1;
            if (list != null && (artist = (Artist) j5g.a0(list)) != null) {
                l2 = artist.l;
            }
            if (l2 == null) {
                z3 = false;
                if (s == null && fkq0.d(s.b)) {
                    z4 = z3;
                    i = i2;
                    z5 = true;
                } else {
                    z4 = z3;
                    i = i2;
                    z5 = false;
                }
                if (s != null && s.w && ((Boolean) this.c.e.getValue()).booleanValue()) {
                    z7 = true;
                }
                return new AboutVideoItem.d(charSequence, i, bVar, aVar, z, uri, z2, z6, booleanValue, z4, null, interfaceC1215d, z5, z7);
            }
        }
        z3 = true;
        if (s == null) {
        }
        z4 = z3;
        i = i2;
        z5 = false;
        if (s != null) {
            z7 = true;
        }
        return new AboutVideoItem.d(charSequence, i, bVar, aVar, z, uri, z2, z6, booleanValue, z4, null, interfaceC1215d, z5, z7);
    }
}
