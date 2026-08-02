package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountGetInfoFieldsDto;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarCallbackSourceDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarDto;
import com.vk.im.engine.models.InfoBar;
import java.util.Collections;
import java.util.Iterator;
import xsna.cs;
import xsna.p8q0;

/* compiled from: DialogsListInfoBarCallbackRequest.kt */
/* loaded from: classes2.dex */
public final class ssm extends com.vk.api.request.rx.batch.a<BaseBoolIntDto, AccountInfoDto, InfoBar> {
    public final Context v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ssm(Context context, String str, String str2, boolean z) {
        super(yfb.x(r2), yfb.x(cs.a.b(Collections.singletonList(AccountGetInfoFieldsDto.CONVERSATIONS_BAR))));
        Object obj;
        Iterator<E> it = MessagesConversationBarCallbackSourceDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((MessagesConversationBarCallbackSourceDto) obj).j(), str)) {
                    break;
                }
            }
        }
        MessagesConversationBarCallbackSourceDto messagesConversationBarCallbackSourceDto = (MessagesConversationBarCallbackSourceDto) obj;
        tfx tfxVar = new tfx("messages.conversationBarCallback", new dt(18), new cq(20));
        tfx.o(tfxVar, "callback_data", str2, 0, 1000, 4);
        if (messagesConversationBarCallbackSourceDto != null) {
            tfx.o(tfxVar, "source", messagesConversationBarCallbackSourceDto.j(), 0, 0, 12);
        }
        this.v = context;
        this.n = z;
    }

    @Override // com.vk.api.request.rx.batch.a
    public final InfoBar K0(bv6<BaseBoolIntDto> bv6Var, bv6<AccountInfoDto> bv6Var2) {
        MessagesConversationBarDto g = bv6Var2.a.g();
        if (g != null) {
            return p8q0.a.a(this.v, g);
        }
        return null;
    }
}
