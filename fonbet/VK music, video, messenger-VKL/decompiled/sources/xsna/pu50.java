package xsna;

import android.os.Bundle;
import android.util.Log;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.a;
import java.io.IOException;
import xsna.dwv0;
import xsna.ixd0;
import xsna.ru50;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class pu50 implements io.reactivex.rxjava3.functions.l, dwp, io.reactivex.rxjava3.functions.m, pcs, yads.as {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pu50(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // yads.as
    public void a(long j, long j2, long j3) {
        ((yads.yk2) this.c).a(j, j2, j3);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return ((ru50.d) this.c).invoke(obj);
            case 1:
                return (x960) ((d410) this.c).invoke(obj);
            case 2:
            case 3:
            case 9:
            case 14:
            case 17:
            default:
                return (s5x0) ((n9t0) this.c).invoke(obj);
            case 4:
                return (dts) ((b8e) this.c).invoke(obj);
            case 5:
                return (VKList) ((ou1) this.c).invoke(obj);
            case 6:
                return (PodcastsGetGroupInfoResponseDto) ((d410) this.c).invoke(obj);
            case 7:
                return (rvc0) ((q520) this.c).invoke(obj);
            case 8:
                return (ixd0.d) ((d410) this.c).invoke(obj);
            case 10:
                return (ta90) ((b8e) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((wug0) this.c).invoke(obj);
            case 12:
                return (Boolean) ((q520) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((wug0) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.b0) ((uyn0) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.t) ((q520) this.c).invoke(obj);
            case 18:
                return (hda) ((hfm0) this.c).invoke(obj);
            case 19:
                return (dwv0.b) ((i54) this.c).invoke(obj);
        }
    }

    @Override // xsna.dwp
    public void b(IOException iOException) {
        Log.e("OkHttpPixelSender", "error processing pixel: " + ((zpa0) this.c) + " error: " + iOException);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) this.c;
        int i = VideoProfileFragmentOld.p0;
        if (str.equals("VideoProfileFragment.profile_has_been_changed") && bundle.getBoolean("VideoProfileFragment.profile_has_been_changed.is_changed")) {
            if (fxc0.B().J().x()) {
                myc0.h(g5z.a(videoProfileFragmentOld), null, null, new com.vk.video.profile.presentation.e(videoProfileFragmentOld, null), 3);
            } else {
                xn50.a.c(videoProfileFragmentOld, a.z.b);
            }
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((q520) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((u620) this.c).invoke(obj)).booleanValue();
        }
    }

    public /* synthetic */ pu50(ky70 ky70Var, zpa0 zpa0Var) {
        this.b = 2;
        this.c = zpa0Var;
    }
}
