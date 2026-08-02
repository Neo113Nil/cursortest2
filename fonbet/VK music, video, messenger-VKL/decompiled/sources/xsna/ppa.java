package xsna;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.Base64;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveInteractiveTime;
import com.vk.newsfeed.posting.mediapicker.photovk.album.VkPhotoAlbumFragment;
import com.vk.rlottie.RLottieDrawable;
import com.vk.rlottie.RLottieView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ppa implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ppa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((qpa) obj).a.U == ObsceneTextFilter.ENABLED);
            case 1:
                RLottieView rLottieView = (RLottieView) obj;
                int i2 = RLottieView.i;
                Resources resources = rLottieView.getResources();
                int i3 = rLottieView.d;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i3), emb.b), 8192);
                try {
                    String b = a0a.b(bufferedReader);
                    bufferedReader.close();
                    rLottieView.f = b;
                    StringBuilder a = vq.a("res-", i3, '-');
                    a.append(SystemClock.elapsedRealtimeNanos());
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(b, a.toString(), rLottieView.getWidth(), rLottieView.getHeight(), null, false, false, null, 496);
                    rLottieView.e = i3;
                    return rLottieDrawable;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ro.e(bufferedReader, th);
                        throw th2;
                    }
                }
            case 2:
                String str = (String) obj;
                File file = new File(str);
                if (file.exists()) {
                    str = brm0.u(nbr.p(file));
                    file.delete();
                }
                return Base64.decode((String) j5g.i0(drm0.c0(str, new String[]{StringUtils.COMMA}, 0, 6)), 0);
            default:
                int i4 = VkPhotoAlbumFragment.p0;
                efc0 mo = ((VkPhotoAlbumFragment) obj).mo();
                if (mo == null) {
                    return null;
                }
                mo.C(new PostingAction$TechStats$Picker$SaveInteractiveTime(MobileOfficialAppsFeedStat$PickerType.ALBUM, SystemClock.elapsedRealtime()));
                return s3q0.a;
        }
    }
}
