package xsna;

import android.view.View;
import com.vk.ecomm.orders.impl.order.presentation.mvi.OrderAction;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.stories.design.view.camera.StoryMediaPickerTabView;
import com.vk.stories.design.view.camera.StoryTabType;
import com.vk.writebar.WriteBar;
import xsna.d4k0;
import xsna.o9t;
import xsna.z7k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class d8k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ d8k(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        izs izsVar = this.c;
        switch (i) {
            case 0:
                izsVar.invoke(new z7k.d((String) obj));
                break;
            case 1:
                izsVar.invoke(d4k0.d.c.b);
                break;
            case 2:
                izsVar.invoke(new o9t.a((uet) obj));
                break;
            case 3:
                izsVar.invoke(new OrderAction.ClickSpan("OPEN_LINK", (String) obj));
                break;
            case 4:
                break;
            case 5:
                int i2 = StoryMediaPickerTabView.i;
                izsVar.invoke(StoryTabType.GALLERY);
                break;
            case 6:
                izsVar.invoke(obj);
                break;
            case 7:
                NestedMsg nestedMsg = (NestedMsg) obj;
                if (nestedMsg.b == NestedMsg.Type.FWD) {
                    izsVar.invoke(nestedMsg);
                }
                break;
            default:
                int i3 = WriteBar.h0;
                izsVar.invoke((View) obj);
                break;
        }
        return s3q0.a;
    }
}
