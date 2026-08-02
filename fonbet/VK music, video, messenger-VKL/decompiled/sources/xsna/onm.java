package xsna;

import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.im.engine.models.dialogs.ChatSettings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class onm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ onm(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                ChatSettings chatSettings = bVar.z;
                return chatSettings == null ? bVar : com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, ChatSettings.zb(chatSettings, null, null, null, chatSettings.f + this.c, false, -17), null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -16777217, 2097151);
            case 1:
                com.vk.im.engine.models.dialogs.b bVar2 = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar2.J;
                int i = this.c;
                if (!list.contains(Integer.valueOf(i))) {
                    return bVar2;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Number) obj2).intValue() != i) {
                        arrayList.add(obj2);
                    }
                }
                return com.vk.im.engine.models.dialogs.b.a(bVar2, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, arrayList, null, 0, false, false, null, null, 0, null, 0, -1, 2097147);
            default:
                AudioBookChapter audioBookChapter = ((ib50) obj).a.O;
                boolean z = false;
                if (audioBookChapter != null && (str = audioBookChapter.b) != null && brm0.B(str, String.valueOf(this.c), false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
