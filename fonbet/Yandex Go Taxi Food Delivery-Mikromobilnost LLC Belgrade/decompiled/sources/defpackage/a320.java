package defpackage;

import java.util.Map;
import org.json.JSONObject;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ChatRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MessengerHeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MessengerParametersDto;

/* loaded from: classes.dex */
public final class a320 {
    public static z220 a(MessengerParametersDto messengerParametersDto) {
        rkb1 rkb1Var;
        MessengerHeaderDto messengerHeader = messengerParametersDto.getMessengerHeader();
        v120 v120Var = new v120(messengerHeader.getTitle(), messengerHeader.getSubtitle(), messengerHeader.getChatIcon());
        ChatRequestDto chatRequest = messengerParametersDto.getChatRequest();
        String str = null;
        if (chatRequest instanceof ChatRequestDto.ChatRequest_DirectChatDto) {
            rkb1Var = new h8b(((ChatRequestDto.ChatRequest_DirectChatDto) chatRequest).b.getChatId());
        } else if (chatRequest instanceof ChatRequestDto.ChatRequest_ChatWithBotDto) {
            rkb1Var = new g8b(((ChatRequestDto.ChatRequest_ChatWithBotDto) chatRequest).b.getBotId());
        } else {
            if (!(chatRequest instanceof ChatRequestDto.Unknown_ChatRequestDto)) {
                w511.b();
                return null;
            }
            rkb1Var = o8b.a;
        }
        Object chatMeta = messengerParametersDto.getChatMeta();
        if (chatMeta != null) {
            try {
                if (chatMeta instanceof Map) {
                    str = new JSONObject((Map) chatMeta).toString();
                }
            } catch (Exception e) {
                jgz jgzVar = jgz.a;
                jgz.d(e, "Failed to serialize chatMeta to JSON string", new Object[0]);
            }
        }
        return new z220(v120Var, rkb1Var, str);
    }
}
