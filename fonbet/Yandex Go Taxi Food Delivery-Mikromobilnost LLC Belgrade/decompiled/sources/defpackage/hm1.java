package defpackage;

import com.yandex.go.quark.ai_assistant.api.chat.ChatViewController$Mode;
import com.yandex.go.quark.ai_assistant.api.router.AiAssistantRouter$Payload$AnalyticsType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hm1 {
    public final cm1 a;
    public final fm1 b;
    public final ChatViewController$Mode c;
    public final String d;
    public final gm1 e;
    public final zl1 f;
    public final AiAssistantRouter$Payload$AnalyticsType g;
    public final String h;
    public final nl1 i;

    public hm1(cm1 cm1Var, fm1 fm1Var, ChatViewController$Mode chatViewController$Mode, String str, gm1 gm1Var, zl1 zl1Var, AiAssistantRouter$Payload$AnalyticsType aiAssistantRouter$Payload$AnalyticsType, String str2, nl1 nl1Var, int i) {
        cm1Var = (i & 1) != 0 ? am1.a : cm1Var;
        fm1Var = (i & 2) != 0 ? dm1.a : fm1Var;
        chatViewController$Mode = (i & 4) != 0 ? ChatViewController$Mode.Go : chatViewController$Mode;
        gm1Var = (i & 16) != 0 ? null : gm1Var;
        aiAssistantRouter$Payload$AnalyticsType = (i & 64) != 0 ? AiAssistantRouter$Payload$AnalyticsType.Empty : aiAssistantRouter$Payload$AnalyticsType;
        str2 = (i & 128) != 0 ? null : str2;
        this.a = cm1Var;
        this.b = fm1Var;
        this.c = chatViewController$Mode;
        this.d = str;
        this.e = gm1Var;
        this.f = zl1Var;
        this.g = aiAssistantRouter$Payload$AnalyticsType;
        this.h = str2;
        this.i = nl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm1)) {
            return false;
        }
        hm1 hm1Var = (hm1) obj;
        return jl40.l(this.a, hm1Var.a) && jl40.l(this.b, hm1Var.b) && this.c == hm1Var.c && jl40.l(this.d, hm1Var.d) && jl40.l(this.e, hm1Var.e) && jl40.l(this.f, hm1Var.f) && this.g == hm1Var.g && jl40.l(this.h, hm1Var.h) && jl40.l(this.i, hm1Var.i);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        gm1 gm1Var = this.e;
        int hashCode3 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + (gm1Var == null ? 0 : gm1Var.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.h;
        return this.i.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Payload(launchType=" + this.a + ", openingAnimation=" + this.b + ", initialMode=" + this.c + ", initialMessage=" + this.d + ", quarkConfigOverrides=" + this.e + ", header=" + this.f + ", analyticsType=" + this.g + ", promoId=" + this.h + ", errorScreenConfiguration=" + this.i + Extension.C_BRAKE;
    }
}
