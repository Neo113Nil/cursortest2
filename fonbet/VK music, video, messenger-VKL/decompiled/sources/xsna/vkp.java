package xsna;

import android.text.SpannableStringBuilder;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;

/* compiled from: EndOverlayState.kt */
/* loaded from: classes17.dex */
public interface vkp extends r3q0 {

    /* compiled from: EndOverlayState.kt */
    public static final class a implements vkp {
        public final String a;

        public a(String str) {
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
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Hidden(uniqueKey="), this.a, ')');
        }
    }

    /* compiled from: EndOverlayState.kt */
    public static final class b implements vkp {
        public final String a;
        public final SdkVerifyInfo b;
        public final boolean c;
        public final tgg d;
        public final SdkOwner e;
        public final SdkImages f;
        public final String g;
        public final SpannableStringBuilder h;
        public final tlo0 i;
        public final String j;

        public b(String str, SdkVerifyInfo sdkVerifyInfo, boolean z, tgg tggVar, SdkOwner sdkOwner, SdkImages sdkImages, String str2, SpannableStringBuilder spannableStringBuilder, tlo0 tlo0Var, String str3) {
            this.a = str;
            this.b = sdkVerifyInfo;
            this.c = z;
            this.d = tggVar;
            this.e = sdkOwner;
            this.f = sdkImages;
            this.g = str2;
            this.h = spannableStringBuilder;
            this.i = tlo0Var;
            this.j = str3;
        }

        @Override // xsna.r3q0
        public final String F() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d.equals(bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && this.h.equals(bVar.h) && epx.f(this.i, bVar.i) && epx.f(this.j, bVar.j);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            SdkVerifyInfo sdkVerifyInfo = this.b;
            int hashCode2 = (this.d.hashCode() + qoy.b((hashCode + (sdkVerifyInfo == null ? 0 : sdkVerifyInfo.hashCode())) * 31, 31, this.c)) * 31;
            SdkOwner sdkOwner = this.e;
            int hashCode3 = (hashCode2 + (sdkOwner == null ? 0 : sdkOwner.hashCode())) * 31;
            SdkImages sdkImages = this.f;
            int hashCode4 = (hashCode3 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
            String str = this.g;
            int hashCode5 = (this.h.hashCode() + ((hashCode4 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            tlo0 tlo0Var = this.i;
            int hashCode6 = (hashCode5 + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            String str2 = this.j;
            return hashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(uniqueKey=");
            sb.append(this.a);
            sb.append(", verifyInfo=");
            sb.append(this.b);
            sb.append(", isAdWithAnyFakeId=");
            sb.append(this.c);
            sb.append(", adsData=");
            sb.append(this.d);
            sb.append(", owner=");
            sb.append(this.e);
            sb.append(", ownerPhoto=");
            sb.append(this.f);
            sb.append(", titleText=");
            sb.append(this.g);
            sb.append(", text=");
            sb.append((Object) this.h);
            sb.append(", actionTextSource=");
            sb.append(this.i);
            sb.append(", bottomText=");
            return ho8.a(sb, this.j, ')');
        }
    }
}
