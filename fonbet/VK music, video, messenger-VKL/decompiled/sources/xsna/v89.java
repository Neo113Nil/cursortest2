package xsna;

import com.vk.api.generated.messages.dto.MessagesCallPreviewDto;
import com.vk.api.generated.messages.dto.MessagesGetCallPreviewResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class v89 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ v89(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer d;
        switch (this.b) {
            case 0:
                MessagesGetCallPreviewResponseDto messagesGetCallPreviewResponseDto = (MessagesGetCallPreviewResponseDto) obj;
                CallId callId = new CallId(messagesGetCallPreviewResponseDto.d());
                MessagesCallPreviewDto f = messagesGetCallPreviewResponseDto.f();
                String title = f != null ? f.getTitle() : null;
                MessagesCallPreviewDto f2 = messagesGetCallPreviewResponseDto.f();
                int intValue = (f2 == null || (d = f2.d()) == null) ? 0 : d.intValue();
                MessagesCallPreviewDto f3 = messagesGetCallPreviewResponseDto.f();
                String valueOf = String.valueOf(f3 != null ? f3.getTitle() : null);
                String valueOf2 = String.valueOf(messagesGetCallPreviewResponseDto.e());
                MessagesCallPreviewDto f4 = messagesGetCallPreviewResponseDto.f();
                JoinData joinData = new JoinData(valueOf2, valueOf, w89.d(f4 != null ? f4.e() : null));
                UserId userId = messagesGetCallPreviewResponseDto.getUserId();
                if (userId == null) {
                    userId = UserId.d;
                }
                String g = messagesGetCallPreviewResponseDto.g();
                if (g == null) {
                    g = "";
                }
                Boolean k = messagesGetCallPreviewResponseDto.k();
                break;
            case 1:
                break;
            case 2:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "post_view_fragment_toolbar_tag");
                qgi0.h(tgi0Var, this.c);
                break;
            default:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.u(tgi0Var2);
                qgi0.h(tgi0Var2, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ v89(String str, w89 w89Var) {
        this.b = 0;
        this.c = str;
    }
}
