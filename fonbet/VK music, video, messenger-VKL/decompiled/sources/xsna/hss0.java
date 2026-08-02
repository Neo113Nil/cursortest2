package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.toggle.features.VideoFeatures;

/* compiled from: VideoLinkGeneratorImpl.kt */
/* loaded from: classes17.dex */
public final class hss0 implements gss0 {
    public final xmc a;
    public final zof b;

    public hss0(xmc xmcVar, zof zofVar) {
        this.a = xmcVar;
        this.b = zofVar;
    }

    @Override // xsna.gss0
    public final String a(VideoFile videoFile) {
        Uri.Builder appendPath;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_SHARING_LINK;
        videoFeatures.getClass();
        if (com.vk.toggle.b.A.a(videoFeatures) && videoFile.ra().length() > 0) {
            return videoFile.ra();
        }
        xmc xmcVar = this.a;
        if (xmcVar.c(videoFile)) {
            Uri.Builder b = b(videoFile);
            StringBuilder sb = new StringBuilder("clip");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(videoFile.I0());
            sb2.append('_');
            sb2.append(videoFile.o0());
            sb.append(sb2.toString());
            appendPath = b.appendPath(sb.toString());
        } else {
            Uri.Builder b2 = b(videoFile);
            StringBuilder sb3 = new StringBuilder("video");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(videoFile.I0());
            sb4.append('_');
            sb4.append(videoFile.o0());
            sb3.append(sb4.toString());
            appendPath = b2.appendPath(sb3.toString());
        }
        String str = this.b.V().a;
        if (str != null && xmcVar.d(videoFile)) {
            appendPath = appendPath.appendQueryParameter("c", str);
        }
        String C1 = videoFile.C1();
        if (C1 != null && !drm0.N(C1)) {
            appendPath = appendPath.appendQueryParameter("list", videoFile.C1());
        }
        return appendPath.build().toString();
    }

    public final Uri.Builder b(VideoFile videoFile) {
        String str;
        if (BuildInfo.q()) {
            str = "vkvideo.ru";
        } else if (this.a.c(videoFile)) {
            Owner s = videoFile.s();
            if (s == null || (str = emi.o(s)) == null) {
                str = a0a.d;
            }
        } else {
            str = a0a.d;
        }
        return new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(str);
    }
}
