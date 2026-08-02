package xsna;

import com.vk.clips.upload.ui.api.entities.ClipsUploadAnalyticsInfo;
import com.vk.clips.upload.ui.api.entities.ErrorType;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import xsna.gif;

/* compiled from: ClipsUploadViewState.kt */
/* loaded from: classes17.dex */
public interface hlf extends lm50 {

    /* compiled from: ClipsUploadViewState.kt */
    public static final class a implements hlf, gif.a {
        public final as8 b;
        public final ErrorType c;

        public a(as8 as8Var, ErrorType errorType) {
            this.b = as8Var;
            this.c = errorType;
        }

        @Override // xsna.gif.a
        public final as8 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        @Override // xsna.gif.a
        public final ErrorType getErrorType() {
            return this.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "Error(buttonsConfig=" + this.b + ", errorType=" + this.c + ')';
        }
    }

    /* compiled from: ClipsUploadViewState.kt */
    public static final class b implements hlf, gif.b {
        public final bed b;
        public final pb5 c;
        public final acj0 d;
        public final as8 e;
        public final ClipsEncoderParameters f;
        public final ClipsUploadAnalyticsInfo g;

        public b(bed bedVar, pb5 pb5Var, acj0 acj0Var, as8 as8Var, ClipsEncoderParameters clipsEncoderParameters, ClipsUploadAnalyticsInfo clipsUploadAnalyticsInfo) {
            this.b = bedVar;
            this.c = pb5Var;
            this.d = acj0Var;
            this.e = as8Var;
            this.f = clipsEncoderParameters;
            this.g = clipsUploadAnalyticsInfo;
        }

        @Override // xsna.gif.b
        public final as8 a() {
            return this.e;
        }

        @Override // xsna.gif.b
        public final ClipsEncoderParameters c() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g);
        }

        @Override // xsna.gif.b
        public final acj0 h() {
            return this.d;
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
        }

        @Override // xsna.gif.b
        public final pb5 j() {
            return this.c;
        }

        @Override // xsna.gif.b
        public final ClipsUploadAnalyticsInfo m() {
            return this.g;
        }

        @Override // xsna.gif.b
        public final bed o() {
            return this.b;
        }

        public final String toString() {
            return "Loaded(descriptionInfo=" + this.b + ", authorInfo=" + this.c + ", sharingOptionsItems=" + this.d + ", buttonsConfig=" + this.e + ", encoderParams=" + this.f + ", analyticsInfo=" + this.g + ')';
        }
    }

    /* compiled from: ClipsUploadViewState.kt */
    public static final class c implements hlf, gif.c {
        public final as8 b;

        public c(as8 as8Var) {
            this.b = as8Var;
        }

        @Override // xsna.gif.c
        public final as8 a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Loading(buttonsConfig=" + this.b + ')';
        }
    }
}
