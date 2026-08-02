package xsna;

import com.vk.clips.upload.ui.api.entities.ErrorType;

/* compiled from: ClipsUploadScreenViewState.kt */
/* loaded from: classes17.dex */
public interface yhf {

    /* compiled from: ClipsUploadScreenViewState.kt */
    public static final class a implements yhf {
        public final gze a;
        public final ErrorType b;

        public a(gze gzeVar, ErrorType errorType) {
            this.a = gzeVar;
            this.b = errorType;
        }

        @Override // xsna.yhf
        public final gze a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(buttonsState=" + this.a + ", errorType=" + this.b + ')';
        }
    }

    /* compiled from: ClipsUploadScreenViewState.kt */
    public static final class b implements yhf {
        public final t1m a;
        public final adk b;
        public final zbj0 c;
        public final tne d;
        public final gze e;

        public b(t1m t1mVar, adk adkVar, zbj0 zbj0Var, tne tneVar, gze gzeVar) {
            this.a = t1mVar;
            this.b = adkVar;
            this.c = zbj0Var;
            this.d = tneVar;
            this.e = gzeVar;
        }

        @Override // xsna.yhf
        public final gze a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Loaded(descriptionBlock=" + this.a + ", authorsBlock=" + this.b + ", sharingOptionsBlock=" + this.c + ", overlayViewState=" + this.d + ", buttonsState=" + this.e + ')';
        }
    }

    /* compiled from: ClipsUploadScreenViewState.kt */
    public static final class c implements yhf {
        public final gze a;

        public c(gze gzeVar) {
            this.a = gzeVar;
        }

        @Override // xsna.yhf
        public final gze a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Loading(buttonsState=" + this.a + ')';
        }
    }

    gze a();
}
