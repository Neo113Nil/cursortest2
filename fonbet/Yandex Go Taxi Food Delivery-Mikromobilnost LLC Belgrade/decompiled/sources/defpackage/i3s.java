package defpackage;

import java.util.UUID;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.AsyncTaskCommunicationDto;

/* loaded from: classes9.dex */
public final class i3s {
    public static cb3 a(AsyncTaskCommunicationDto asyncTaskCommunicationDto) {
        if (!(asyncTaskCommunicationDto instanceof AsyncTaskCommunicationDto.AsyncTaskCommunication_InfoDto)) {
            if (asyncTaskCommunicationDto instanceof AsyncTaskCommunicationDto.Unknown_AsyncTaskCommunicationDto) {
                return null;
            }
            w511.b();
            return null;
        }
        AsyncTaskCommunicationDto.AsyncTaskCommunication_InfoDto asyncTaskCommunication_InfoDto = (AsyncTaskCommunicationDto.AsyncTaskCommunication_InfoDto) asyncTaskCommunicationDto;
        String id = asyncTaskCommunication_InfoDto.getB().getId();
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
        return new cb3(id, asyncTaskCommunication_InfoDto.getB().getTitle(), asyncTaskCommunication_InfoDto.getB().getMessage(), asyncTaskCommunication_InfoDto.getB().getImageTag(), asyncTaskCommunication_InfoDto.getB().getButtonText());
    }
}
