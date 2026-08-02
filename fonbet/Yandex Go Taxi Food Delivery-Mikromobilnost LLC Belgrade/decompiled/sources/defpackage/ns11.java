package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.LinearLayoutBuilder;
import com.yandex.messaging.ui.createpoll.CreatePollActivity;
import com.yandex.messaging.ui.createpoll.Ui$special$$inlined$brickSlot$default$1;

/* loaded from: classes15.dex */
public final class ns11 extends a {
    public final c c;

    /* JADX WARN: Multi-variable type inference failed */
    public ns11(CreatePollActivity createPollActivity) {
        super(createPollActivity);
        View view = (View) Ui$special$$inlined$brickSlot$default$1.b.invoke(jh91.e(0, createPollActivity), 0, 0);
        if (this instanceof kzx) {
            ((kzx) this).addToParent(view);
        }
        BrickSlotView brickSlotView = (BrickSlotView) view;
        c cVar = new c(brickSlotView);
        ViewGroup.LayoutParams layoutParams = brickSlotView.getLayoutParams();
        brickSlotView.setLayoutParams(layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams);
        this.c = cVar;
    }

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        final View view = this.c.a;
        linearLayoutBuilder.addToParent((View) new zls() { // from class: com.yandex.messaging.ui.createpoll.Ui$layout$lambda$1$$inlined$include$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return view;
            }
        }.invoke(jh91.e(0, linearLayoutBuilder.getCtx()), 0, 0));
        return linearLayoutBuilder;
    }
}
