package xsna;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.LinkedHashMap;

/* compiled from: DebugTraceUtil.java */
/* loaded from: classes12.dex */
public final class a7l {
    public static final LinkedHashMap a;

    static {
        ImmutableMap.a aVar = new ImmutableMap.a(4);
        ImmutableList.b bVar = ImmutableList.c;
        Object[] objArr = {"SetComposition", "SeekTo", "SetVideoOutput", "Release"};
        ne7.l(objArr);
        aVar.d("CompositionPlayer", ImmutableList.l(4, objArr));
        aVar.d("TransformerInternal", ImmutableList.p("Start"));
        aVar.d("AssetLoader", ImmutableList.q("InputFormat", "OutputFormat"));
        aVar.d("AudioDecoder", ImmutableList.t("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        aVar.d("AudioGraph", ImmutableList.q("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        ne7.l(objArr2);
        aVar.d("AudioMixer", ImmutableList.l(3, objArr2));
        aVar.d("AudioEncoder", ImmutableList.t("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        aVar.d("VideoDecoder", ImmutableList.t("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        Object[] objArr3 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        ne7.l(objArr3);
        aVar.d("VideoFrameProcessor", ImmutableList.l(9, objArr3));
        aVar.d("ExternalTextureManager", ImmutableList.q("SignalEOS", "SurfaceTextureTransformFix"));
        aVar.d("BitmapTextureManager", ImmutableList.p("SignalEOS"));
        aVar.d("TexIdTextureManager", ImmutableList.p("SignalEOS"));
        aVar.d("Compositor", ImmutableList.p("OutputTextureRendered"));
        aVar.d("VideoEncoder", ImmutableList.t("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        aVar.d("Muxer", ImmutableList.r("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        aVar.a(true);
        a = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (a7l.class) {
            synchronized (a7l.class) {
            }
        }
    }
}
