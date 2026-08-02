package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.instantjobs.InstantJob;
import com.vk.messagetemplates.impl.keyboard.TemplatesKeyboardState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qso implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ qso(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tso.n((tgi0) obj, this.c);
                return s3q0.a;
            case 1:
                InstantJob instantJob = (InstantJob) obj;
                boolean z = instantJob instanceof ny30;
                int i = this.c;
                return Boolean.valueOf((z && ((ny30) instantJob).d == i) || ((instantJob instanceof zy30) && ((zy30) instantJob).d == i) || ((instantJob instanceof w5b) && ((w5b) instantJob).c == i));
            case 2:
                TemplatesKeyboardState templatesKeyboardState = (TemplatesKeyboardState) obj;
                List<MsgTemplate> list = templatesKeyboardState.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((MsgTemplate) obj2).b != this.c) {
                        arrayList.add(obj2);
                    }
                }
                return TemplatesKeyboardState.a(templatesKeyboardState, arrayList);
            default:
                VKList vKList = (VKList) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(vKList, 10));
                Iterator<T> it = vKList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new p2t0((VideoFile) it.next()));
                }
                return new e3t0(arrayList2, vKList.i(), this.c == 0);
        }
    }
}
