package xsna;

import java.util.List;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsAction.kt */
/* loaded from: classes4.dex */
public abstract class i8a0 implements kj50 {

    /* compiled from: PhotoFlowSettingsAction.kt */
    public static final class a extends i8a0 {
        public static final a b = new a();
    }

    /* compiled from: PhotoFlowSettingsAction.kt */
    public static final class b extends i8a0 {
        public final Throwable b;
        public final boolean c;

        public b(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: PhotoFlowSettingsAction.kt */
    public static final class c extends i8a0 {
        public final List<q8a0.a> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends q8a0.a> list, boolean z) {
            this.b = list;
            this.c = z;
        }
    }

    /* compiled from: PhotoFlowSettingsAction.kt */
    public static final class d extends i8a0 {
        public final q8a0.a b;

        public d(q8a0.a aVar) {
            this.b = aVar;
        }
    }

    /* compiled from: PhotoFlowSettingsAction.kt */
    public static final class e extends i8a0 {
        public static final e b = new e();
    }

    /* compiled from: PhotoFlowSettingsAction.kt */
    public static final class f extends i8a0 {
        public final q8a0.a b;

        public f(q8a0.a aVar) {
            this.b = aVar;
        }
    }
}
