package xsna;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Arrays;
import kotlin.collections.builders.ListBuilder;
import xsna.npl;
import xsna.yn80;

/* compiled from: OneVideoTrackSelector.kt */
/* loaded from: classes8.dex */
public final class ao80 extends npl {
    public static final /* synthetic */ int m = 0;
    public final yn80.a l;

    /* compiled from: OneVideoTrackSelector.kt */
    public static final class a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ao80(Context context, yn80.a aVar, r8l r8lVar) {
        super(new npl.d(r1), aVar, context);
        ListBuilder e = e43.e();
        if (r8lVar.b) {
            e.add(MimeTypes.VIDEO_AV1);
        }
        if (r8lVar.a) {
            e.add(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9);
        }
        e.add("video/avc");
        ListBuilder g = e.g();
        ListBuilder e2 = e43.e();
        if (r8lVar.c) {
            e2.add(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_OPUS);
        }
        e2.add("audio/mp4a-latm");
        e2.add(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.AUDIO_MP4);
        ListBuilder g2 = e2.g();
        npl.d.a aVar2 = new npl.d.a();
        String[] strArr = (String[]) g.toArray(new String[0]);
        aVar2.i = ImmutableList.n((String[]) Arrays.copyOf(strArr, strArr.length));
        String[] strArr2 = (String[]) g2.toArray(new String[0]);
        aVar2.p = ImmutableList.n((String[]) Arrays.copyOf(strArr2, strArr2.length));
        this.l = aVar;
    }
}
