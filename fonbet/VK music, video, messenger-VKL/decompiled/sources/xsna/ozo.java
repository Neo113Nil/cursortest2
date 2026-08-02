package xsna;

/* compiled from: EditChannelUseCase.kt */
/* loaded from: classes2.dex */
public final class ozo {
    public final a1w a;
    public final v3q b;

    /* compiled from: EditChannelUseCase.kt */
    public static final class a {
        public final boolean a;
        public final Throwable b;

        public a(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
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
            int hashCode = Boolean.hashCode(this.a) * 31;
            Throwable th = this.b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(channelUpdated=");
            sb.append(this.a);
            sb.append(", avatarError=");
            return oq.c(sb, this.b, ')');
        }
    }

    public ozo(a1w a1wVar, asu0 asu0Var) {
        this.a = a1wVar;
        this.b = asu0Var;
    }
}
