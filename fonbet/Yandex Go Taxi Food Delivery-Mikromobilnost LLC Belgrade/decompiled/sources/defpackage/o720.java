package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.yandex.bricks.BrickSlotView;
import com.yandex.bricks.c;
import com.yandex.dsl.views.a;
import com.yandex.dsl.views.layouts.LinearLayoutBuilder;
import com.yandex.messaging.ui.toolbar.MessengerToolbarUi$special$$inlined$brickSlot$default$1;
import com.yandex.messaging.ui.toolbar.MessengerToolbarUi$special$$inlined$view$default$1;

/* loaded from: classes15.dex */
public abstract class o720 extends a {
    public static final int y = kjs0.b(56);
    public final n720 c;
    public final i3y w;
    public final View x;

    /* JADX WARN: Multi-variable type inference failed */
    public o720(Activity activity, n720 n720Var, h3y h3yVar) {
        super(activity);
        this.c = n720Var;
        int i = e9h0.toolbar_back_button;
        View view = (View) MessengerToolbarUi$special$$inlined$brickSlot$default$1.b.invoke(jh91.e(0, activity), 0, 0);
        if (i != -1) {
            view.setId(i);
        }
        boolean z = this instanceof kzx;
        if (z) {
            ((kzx) this).addToParent(view);
        }
        new c((BrickSlotView) view);
        this.w = kotlin.a.a(new m020(3, (fdz0) this));
        View view2 = (View) MessengerToolbarUi$special$$inlined$view$default$1.b.invoke(jh91.e(0, activity), 0, 0);
        if (z) {
            ((kzx) this).addToParent(view2);
        }
        view2.setBackgroundColor(fxa1.c(jng0.messagingCommonDividerColor, view2.getContext()).data);
        this.x = view2;
    }

    @Override // com.yandex.dsl.views.a
    public final View a(jp31 jp31Var) {
        LinearLayoutBuilder linearLayoutBuilder = new LinearLayoutBuilder(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(linearLayoutBuilder);
        }
        linearLayoutBuilder.setOrientation(1);
        final Toolbar toolbar = (Toolbar) this.w.getValue();
        linearLayoutBuilder.addToParent((View) new zls() { // from class: com.yandex.messaging.ui.toolbar.MessengerToolbarUi$layout$lambda$9$$inlined$include$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return toolbar;
            }
        }.invoke(jh91.e(0, linearLayoutBuilder.getCtx()), 0, 0));
        linearLayoutBuilder.invoke(this.x, new k720(linearLayoutBuilder, 0));
        linearLayoutBuilder.setVisibility(this.c.a() ? 0 : 8);
        return linearLayoutBuilder;
    }
}
