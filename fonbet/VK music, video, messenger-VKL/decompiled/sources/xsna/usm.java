package xsna;

import android.content.Context;
import com.vk.api.generated.account.dto.AccountGetInfoFieldsDto;
import com.vk.api.generated.account.dto.AccountInfoDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarDto;
import com.vk.api.generated.messages.dto.MessagesConversationBarHideSourceDto;
import java.util.Collections;
import java.util.NoSuchElementException;
import xsna.cs;
import xsna.p8q0;

/* compiled from: DialogsListInfoBarHideBatchApiRequest.kt */
/* loaded from: classes2.dex */
public final class usm extends com.vk.api.request.rx.batch.a<BaseOkResponseDto, AccountInfoDto, xsm> {
    public final Context v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public usm(Context context, String str, String str2) {
        super(yfb.x(r5), yfb.x(cs.a.b(Collections.singletonList(AccountGetInfoFieldsDto.CONVERSATIONS_BAR))));
        for (MessagesConversationBarHideSourceDto messagesConversationBarHideSourceDto : MessagesConversationBarHideSourceDto.values()) {
            if (brm0.w(messagesConversationBarHideSourceDto.i(), str2, true)) {
                tfx tfxVar = new tfx("messages.conversationBarHide", new io.reactivex.rxjava3.internal.operators.observable.n0(28), new dr(23));
                if (str != null) {
                    tfx.o(tfxVar, "name", str, 0, 0, 12);
                }
                tfx.o(tfxVar, "source", messagesConversationBarHideSourceDto.i(), 0, 0, 12);
                this.v = context;
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // com.vk.api.request.rx.batch.a
    public final xsm K0(bv6<BaseOkResponseDto> bv6Var, bv6<AccountInfoDto> bv6Var2) {
        MessagesConversationBarDto g = bv6Var2.a.g();
        return new xsm(g != null ? p8q0.a.a(this.v, g) : null);
    }
}
