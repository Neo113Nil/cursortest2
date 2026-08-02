package xsna;

import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.os.Parcelable;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.io.File;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.gleffects.EffectHolder;
import ru.ok.gleffects.dto.UserInfo;
import ru.ok.proto.PublisherConfiguration;
import xsna.bi9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xh9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Parcelable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xh9(int i, Parcelable parcelable, Object obj, Object obj2, Object obj3) {
        this.b = i;
        this.c = obj;
        this.d = parcelable;
        this.e = obj2;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaExtractor mediaExtractor;
        switch (this.b) {
            case 0:
                bi9 bi9Var = (bi9) this.c;
                ClipVideoFile clipVideoFile = (ClipVideoFile) this.d;
                File file = (File) this.e;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f;
                i0q0.f(new ey0(bi9Var, 7));
                bi9.b bVar = new bi9.b(0, bi9Var, bi9.class, "afterDuetLoading", "afterDuetLoading()V", 0);
                MediaUtils.f e = MediaUtils.a.e(file.getAbsolutePath(), false);
                MusicTrack musicTrack = clipVideoFile.D1;
                boolean z = clipVideoFile.Q0;
                lno lnoVar = new lno(file, z, e != null ? e.a : PublisherConfiguration.DEFAULT_MAX_RES, e != null ? e.b : CoverVideoUploadTask.y, bVar);
                MediaExtractor mediaExtractor2 = null;
                try {
                    try {
                        mediaExtractor = new MediaExtractor();
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    mediaExtractor.setDataSource(file.getPath());
                    r11 = ar10.a(mediaExtractor).i != -1;
                    mediaExtractor.release();
                } catch (Exception e3) {
                    e = e3;
                    mediaExtractor2 = mediaExtractor;
                    L.i(e);
                    if (mediaExtractor2 != null) {
                        mediaExtractor2.release();
                    }
                    lnoVar.b = (!r11) | z;
                    i0q0.f(new fu5(bi9Var, lnoVar, ref$ObjectRef, 1));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    mediaExtractor2 = mediaExtractor;
                    if (mediaExtractor2 != null) {
                        mediaExtractor2.release();
                    }
                    throw th;
                }
                lnoVar.b = (!r11) | z;
                i0q0.f(new fu5(bi9Var, lnoVar, ref$ObjectRef, 1));
                return;
            default:
                ((EffectHolder) this.c).lambda$setUserData$17((Bitmap) this.d, (String) this.e, (UserInfo) this.f);
                return;
        }
    }
}
