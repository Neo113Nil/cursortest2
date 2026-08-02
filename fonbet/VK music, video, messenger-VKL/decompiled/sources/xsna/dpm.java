package xsna;

import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.dto.common.data.VKList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dpm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ dpm(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar.J;
                int i = this.c;
                if (!(!list.contains(Integer.valueOf(i)))) {
                    return bVar;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(Integer.valueOf(i));
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, arrayList, null, 0, false, false, null, null, 0, null, 0, -1, 2097147);
            default:
                AudioGetResponseDto audioGetResponseDto = (AudioGetResponseDto) obj;
                List<AudioAudioDto> d = audioGetResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(oc4.d((AudioAudioDto) it.next()));
                }
                VKList vKList = new VKList(arrayList2);
                int i2 = this.c + 30;
                vKList.n(i2 < audioGetResponseDto.getCount() ? String.valueOf(i2) : null);
                return vKList;
        }
    }
}
