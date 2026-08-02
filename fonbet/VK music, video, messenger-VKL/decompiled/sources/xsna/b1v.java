package xsna;

import com.unity3d.services.core.di.ServiceProvider;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseItemDto;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.internal.ToggleManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.vbw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class b1v implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ b1v(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return new l9r((File) obj, ServiceProvider.HTTP_CACHE_DISK_SIZE);
            case 2:
                k720.a.h(Collections.singletonList(SuperAppShowcaseItemDto.TypeDto.SERVICES_MENU.i()));
                return s3q0.a;
            case 3:
                ArrayList arrayList = new ArrayList();
                for (MsgFromUser msgFromUser : (List) obj) {
                    AttachAudioMsg a7 = msgFromUser.a7();
                    ur4 D = a7 != null ? hr80.D(a7, msgFromUser, null) : null;
                    if (D != null) {
                        arrayList.add(D);
                    }
                }
                return arrayList;
            case 4:
                return new SakFeatures((ToggleManager) obj);
            default:
                vbw.b.getClass();
                return vbw.a.a((String) obj);
        }
    }
}
