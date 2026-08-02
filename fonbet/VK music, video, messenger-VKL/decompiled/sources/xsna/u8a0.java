package xsna;

import java.util.List;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsPatch.kt */
/* loaded from: classes4.dex */
public abstract class u8a0 implements xl50 {

    /* compiled from: PhotoFlowSettingsPatch.kt */
    public static final class a extends u8a0 {
        public final Throwable b;
        public final boolean c;

        public a(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: PhotoFlowSettingsPatch.kt */
    public static final class b extends u8a0 {
        public final List<q8a0.a> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends q8a0.a> list) {
            this.b = list;
        }
    }

    /* compiled from: PhotoFlowSettingsPatch.kt */
    public static final class c extends u8a0 {
    }

    /* compiled from: PhotoFlowSettingsPatch.kt */
    public static final class d extends u8a0 {
        public final List<q8a0.a> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends q8a0.a> list) {
            this.b = list;
        }
    }

    /* compiled from: PhotoFlowSettingsPatch.kt */
    public static final class e extends u8a0 {
        public final q8a0.a b;
        public final boolean c;

        public e(q8a0.a aVar, boolean z) {
            this.b = aVar;
            this.c = z;
        }
    }
}
