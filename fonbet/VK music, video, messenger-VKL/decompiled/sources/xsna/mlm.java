package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationStyleLangDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationStylesLangResponseDto;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* compiled from: DialogThemesLangLoadApiCmd.kt */
/* loaded from: classes2.dex */
public final class mlm extends nx2<nlm> {
    public final boolean b;
    public final String c;
    public final String d;

    public mlm(boolean z, String str, String str2) {
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlm)) {
            return false;
        }
        mlm mlmVar = (mlm) obj;
        return this.b == mlmVar.b && epx.f(this.c, mlmVar.c) && epx.f(this.d, mlmVar.d);
    }

    @Override // xsna.nx2
    public final nlm f(l7r0 l7r0Var) {
        tfx tfxVar = new tfx("messages.getConversationStylesLang", new sn(29), new nr(21));
        tfx.o(tfxVar, "lang", this.c, 0, 0, 12);
        String str = this.d;
        if (str != null) {
            tfx.o(tfxVar, "version_hash", str, 0, 0, 12);
        }
        MessagesGetConversationStylesLangResponseDto messagesGetConversationStylesLangResponseDto = (MessagesGetConversationStylesLangResponseDto) bz2.l(tfxVar, this.b);
        List<MessagesConversationStyleLangDto> e = messagesGetConversationStylesLangResponseDto.e();
        int e2 = on00.e(c5g.u(e, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (MessagesConversationStyleLangDto messagesConversationStyleLangDto : e) {
            Pair pair = new Pair(messagesConversationStyleLangDto.getId(), messagesConversationStyleLangDto.d());
            linkedHashMap.put(pair.i(), pair.j());
        }
        String f = messagesGetConversationStylesLangResponseDto.f();
        Boolean d = messagesGetConversationStylesLangResponseDto.d();
        return new nlm(f, linkedHashMap, d != null ? d.booleanValue() : false);
    }

    public final int hashCode() {
        int a = urd0.a(Boolean.hashCode(this.b) * 31, 31, this.c);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemesLangLoadApiCmd(isAwaitNetwork=");
        sb.append(this.b);
        sb.append(", langCode=");
        sb.append(this.c);
        sb.append(", versionHash=");
        return ho8.a(sb, this.d, ')');
    }
}
