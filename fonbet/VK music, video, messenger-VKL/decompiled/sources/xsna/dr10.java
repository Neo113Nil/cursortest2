package xsna;

import android.content.Context;
import com.vk.media.recorder.RecorderBase;
import org.json.JSONObject;
import xsna.sy70;

/* compiled from: MediaFactory.kt */
/* loaded from: classes3.dex */
public final class dr10 {
    public final Context a;
    public final JSONObject b;
    public final boolean c;
    public final sy70.c d;
    public final boolean e;

    /* compiled from: MediaFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecorderBase.RecordingType.values().length];
            try {
                iArr[RecorderBase.RecordingType.LOOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecorderBase.RecordingType.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecorderBase.RecordingType.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dr10(Context context, JSONObject jSONObject, boolean z, sy70.c cVar, boolean z2) {
        this.a = context;
        this.b = jSONObject;
        this.c = z;
        this.d = cVar;
        this.e = z2;
    }
}
