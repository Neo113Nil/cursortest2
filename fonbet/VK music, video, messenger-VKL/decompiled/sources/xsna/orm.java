package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioSearchResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class orm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ orm(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.im.engine.models.dialogs.d dVar = (com.vk.im.engine.models.dialogs.d) obj;
                return com.vk.im.engine.models.dialogs.d.a(dVar, dVar.b + this.c);
            default:
                AudioSearchResponseDto audioSearchResponseDto = (AudioSearchResponseDto) obj;
                int count = audioSearchResponseDto.getCount();
                List<AudioAudioDto> d = audioSearchResponseDto.d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                int i = this.c;
                return new ta90(i, i + 50, count, null, arrayList);
        }
    }
}
