package xsna;

import android.view.ViewGroup;
import com.vk.clips.sdk.shared.item.video.immediate.viewstate.CoverState;
import kotlin.LazyThreadSafetyMode;
import xsna.n5s0;

/* compiled from: VideoBaseImmediateRenderDelegate.kt */
/* loaded from: classes17.dex */
public final class j5s0 {
    public final o5s0 a;
    public final c3f b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new x1c0(13));
    public n5s0 d = n5s0.b.a;
    public n5s0.a e;
    public CoverState.b f;

    /* compiled from: VideoBaseImmediateRenderDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CoverState.ColorFilterType.values().length];
            try {
                iArr[CoverState.ColorFilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoverState.ColorFilterType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j5s0(o5s0 o5s0Var, c3f c3fVar) {
        this.a = o5s0Var;
        this.b = c3fVar;
    }

    public static final boolean a(j5s0 j5s0Var, float f) {
        ViewGroup a2 = j5s0Var.a.a();
        return ((double) ((((float) a2.getHeight()) / ((float) a2.getWidth())) - f)) <= 0.2d;
    }
}
