package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.common.links.LaunchContext;
import com.vk.dto.music.MusicCameraData;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: CameraLink.kt */
/* loaded from: classes17.dex */
public final class wi9 implements pje {
    public final mhd a;

    public wi9(mhd mhdVar) {
        this.a = mhdVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (!this.a.c()) {
            return false;
        }
        if (jh.h("/clips/camera", peq0Var, null, null, 14)) {
            return true;
        }
        return jh.h("/camera", peq0Var, null, null, 14) && epx.f(peq0Var.d, "clips");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // xsna.pje
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        String str;
        Uri uri = peq0Var.a;
        Activity h = e3m.h(context);
        if (h == null) {
            return false;
        }
        String a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.LINK);
        String queryParameter = uri.getQueryParameter("mask");
        String queryParameter2 = uri.getQueryParameter("tooltip");
        String queryParameter3 = uri.getQueryParameter("hashtag");
        if (queryParameter3 != null) {
            if (!myc0.f(queryParameter3)) {
                queryParameter3 = null;
            }
            if (queryParameter3 != null) {
                str = "#".concat(queryParameter3);
                String queryParameter4 = uri.getQueryParameter("audio");
                MusicCameraData musicCameraData = queryParameter4 != null ? new MusicCameraData(queryParameter4, true) : null;
                pkd f = g620.f();
                bc6 L = xa4.L(h);
                String str2 = launchContext.e;
                pkd.A(f, L, 0, a, str2 != null ? a : str2, null, null, queryParameter, null, null, 0, str, null, null, queryParameter2, musicCameraData, false, null, 211890);
                if (yp80Var != null) {
                    yp80Var.onSuccess();
                }
                return true;
            }
        }
        str = null;
        String queryParameter42 = uri.getQueryParameter("audio");
        MusicCameraData musicCameraData2 = queryParameter42 != null ? new MusicCameraData(queryParameter42, true) : null;
        pkd f2 = g620.f();
        bc6 L2 = xa4.L(h);
        String str22 = launchContext.e;
        pkd.A(f2, L2, 0, a, str22 != null ? a : str22, null, null, queryParameter, null, null, 0, str, null, null, queryParameter2, musicCameraData2, false, null, 211890);
        if (yp80Var != null) {
        }
        return true;
    }
}
