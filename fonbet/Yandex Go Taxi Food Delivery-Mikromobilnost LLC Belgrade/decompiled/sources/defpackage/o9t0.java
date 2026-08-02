package defpackage;

import com.yandex.go.quark.soul.experiments.SoulAiAssistantExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class o9t0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SoulAiAssistantExperiment.Navbar.Mode.values().length];
        try {
            iArr[SoulAiAssistantExperiment.Navbar.Mode.Native.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SoulAiAssistantExperiment.Navbar.Mode.Web.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
