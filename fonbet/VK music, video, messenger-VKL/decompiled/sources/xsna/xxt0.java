package xsna;

/* compiled from: ViewHolderPlayerHoldersProviderFactory.kt */
/* loaded from: classes17.dex */
public final class xxt0 {
    public final sux a;

    /* compiled from: ViewHolderPlayerHoldersProviderFactory.kt */
    public static final class a implements t1b0 {
        public final o0f b;

        public a(o0f o0fVar) {
            this.b = o0fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        @Override // xsna.t1b0
        public final o0f getAttachedPlayer() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PlayerHolderImpl(attachedPlayer=" + this.b + ')';
        }
    }

    public xxt0(sux suxVar) {
        this.a = suxVar;
    }
}
