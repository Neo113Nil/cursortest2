package xsna;

import android.view.View;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.stories.design.view.stickerbutton.StickerType;
import xsna.m5u;
import xsna.qdx;
import xsna.w9m0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class a6u implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a6u(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        switch (this.b) {
            case 0:
                d6u d6uVar = (d6u) this.c;
                sop sopVar = (sop) this.d;
                p5u p5uVar = d6uVar.o;
                if ((p5uVar == null ? null : p5uVar).e == null) {
                    if (!(p5uVar == null ? null : p5uVar).d) {
                        UserId userId = (p5uVar == null ? null : p5uVar).b.a.c;
                        if (p5uVar == null) {
                            p5uVar = null;
                        }
                        sopVar.invoke(new m5u.a(p5uVar.b.a.b, userId));
                        break;
                    } else {
                        sopVar.invoke(m5u.c.b);
                        break;
                    }
                } else {
                    if (p5uVar == null) {
                        p5uVar = null;
                    }
                    CallProducerButton callProducerButton = p5uVar.e;
                    if (callProducerButton == null || (str = callProducerButton.k) == null) {
                        str = "";
                    }
                    sopVar.invoke(new m5u.n(str));
                    break;
                }
                break;
            case 1:
                qdx.a aVar = (qdx.a) this.c;
                qdx qdxVar = (qdx) this.d;
                int bindingAdapterPosition = aVar.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    qdxVar.c.invoke(qdxVar.getItem(bindingAdapterPosition).a);
                    break;
                }
                break;
            case 2:
                ((m2l0) this.c).invoke((StickerType) this.d);
                break;
            default:
                ((f9m0) this.c).l.invoke(((w9m0.a) this.d).f);
                break;
        }
    }
}
