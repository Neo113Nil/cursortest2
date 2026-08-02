package defpackage;

import android.graphics.Color;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.entities.ChatId;

/* loaded from: classes6.dex */
public abstract class nob1 {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-516404993);
        int i2 = (btsVar.e(slsVar) ? 4 : 2) | i | 48;
        int i3 = 9;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(c530Var, 8.0f);
            ButtonSize buttonSize = ButtonSize.M;
            y8d.a.getClass();
            slsVar2 = slsVar;
            vpa1.a(k, false, buttonSize, slsVar2, y8d.b, btsVar, ((i2 << 9) & 7168) | 24960, 2);
            f530Var = c530Var;
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vl5(slsVar2, f530Var, i, i3);
        }
    }

    public static final ThreadChat b(ServerMessageRef serverMessageRef) {
        String requiredChatId = serverMessageRef.getRequiredChatId();
        return new ThreadChat(ChatId.Companion.a(requiredChatId).b(serverMessageRef.getTimestamp()).a);
    }

    public static int c(String str) {
        if (str.charAt(0) == '#') {
            if (str.length() == 5) {
                char charAt = str.charAt(1);
                char charAt2 = str.charAt(2);
                char charAt3 = str.charAt(3);
                char charAt4 = str.charAt(4);
                str = new String(new char[]{'#', charAt, charAt, charAt2, charAt2, charAt3, charAt3, charAt4, charAt4});
            } else if (str.length() == 4) {
                char charAt5 = str.charAt(1);
                char charAt6 = str.charAt(2);
                char charAt7 = str.charAt(3);
                str = new String(new char[]{'#', charAt5, charAt5, charAt6, charAt6, charAt7, charAt7});
            }
        }
        return Color.parseColor(str);
    }
}
