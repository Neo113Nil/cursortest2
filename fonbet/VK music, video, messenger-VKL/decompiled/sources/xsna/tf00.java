package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.common.description.DescriptionViewState;
import xsna.ti50;

/* compiled from: MainOverlayState.kt */
/* loaded from: classes17.dex */
public interface tf00 extends r3q0 {

    /* compiled from: MainOverlayState.kt */
    public static final class a {
        public final lw a;
        public final boolean b;

        public a(lw lwVar, boolean z) {
            this.a = lwVar;
            this.b = z;
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
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButtonWithArrowViewState(actionButtonState=");
            sb.append(this.a);
            sb.append(", arrowUpVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class b implements tf00 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class c {
        public final jvm0 a;
        public final boolean b;

        public c(jvm0 jvm0Var, boolean z) {
            this.a = jvm0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RightTitleState(subscribeButtonState=");
            sb.append(this.a);
            sb.append(", dotSeparatorVisible=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: MainOverlayState.kt */
    public static final class d implements tf00 {
        public final String a;
        public final SdkClipVideoFile b;
        public final DescriptionViewState c;
        public final c d;
        public final a e;
        public final g1n f;
        public final x590 g;
        public final ti50.b h;
        public final e21 i;

        public d(String str, SdkClipVideoFile sdkClipVideoFile, DescriptionViewState descriptionViewState, c cVar, a aVar, g1n g1nVar, x590 x590Var, ti50.b bVar, e21 e21Var) {
            this.a = str;
            this.b = sdkClipVideoFile;
            this.c = descriptionViewState;
            this.d = cVar;
            this.e = aVar;
            this.f = g1nVar;
            this.g = x590Var;
            this.h = bVar;
            this.i = e21Var;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b.equals(dVar.b) && epx.f(this.c, dVar.c) && this.d.equals(dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f) && this.g.equals(dVar.g) && this.h.equals(dVar.h) && epx.f(this.i, dVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Visible(uniqueKey=" + this.a + ", clip=" + this.b + ", descriptionState=" + this.c + ", rightTitleState=" + this.d + ", actionButtonWithArrowState=" + this.e + ", disclaimerState=" + this.f + ", ownerState=" + this.g + ", muteState=" + this.h + ", adsSubscribeBannerViewState=" + this.i + ')';
        }
    }
}
