package xsna;

import xsna.luc;

/* compiled from: ClipsEditorStateSideEffect.kt */
/* loaded from: classes16.dex */
public interface wzd {

    /* compiled from: ClipsEditorStateSideEffect.kt */
    public static final class a implements wzd {
        public final boolean a;
        public final luc b;

        public a() {
            this((luc) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "AddHistoryRecord(forceWithoutChanges=" + this.a + ", itemType=" + this.b + ')';
        }

        public a(boolean z, luc lucVar) {
            this.a = z;
            this.b = lucVar;
        }

        public /* synthetic */ a(luc lucVar, int i) {
            this(false, (i & 2) != 0 ? luc.d.a : lucVar);
        }
    }

    /* compiled from: ClipsEditorStateSideEffect.kt */
    public static final class b implements wzd {
        public final com.vk.clips.editor.state.model.b a;

        public b() {
            this(null);
        }

        public b(com.vk.clips.editor.state.model.b bVar) {
            this.a = bVar;
        }
    }

    /* compiled from: ClipsEditorStateSideEffect.kt */
    public static final class c implements wzd {
        public final izs<com.vk.clips.editor.state.model.a, Long> a;
        public boolean b;

        public c() {
            this(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(izs<? super com.vk.clips.editor.state.model.a, Long> izsVar) {
            this.a = izsVar;
        }

        public /* synthetic */ c(int i) {
            this(xzd.b);
        }
    }
}
