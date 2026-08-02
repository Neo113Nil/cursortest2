package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;

/* compiled from: VkUiCloseData.kt */
/* loaded from: classes6.dex */
public abstract class lvv0 {

    /* compiled from: VkUiCloseData.kt */
    public static final class a extends lvv0 {
        public final AuthResult a;

        public a(AuthResult authResult) {
            this.a = authResult;
        }
    }

    /* compiled from: VkUiCloseData.kt */
    public static final class b extends lvv0 {
        public final boolean a;
        public final String b;
        public final UtilityTokens c;
        public final boolean d;

        public b(boolean z, String str, UtilityTokens utilityTokens, boolean z2) {
            this.a = z;
            this.b = str;
            this.c = utilityTokens;
            this.d = z2;
        }
    }

    /* compiled from: VkUiCloseData.kt */
    public static final class c extends lvv0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public c(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }
}
