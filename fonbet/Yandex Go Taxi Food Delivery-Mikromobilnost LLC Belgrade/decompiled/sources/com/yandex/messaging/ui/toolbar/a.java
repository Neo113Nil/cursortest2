package com.yandex.messaging.ui.toolbar;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.extension.flow.c;
import com.yandex.messaging.ui.timeline.b;
import defpackage.hi91;
import defpackage.i3y;
import defpackage.jh91;
import defpackage.jp31;
import defpackage.kzx;
import defpackage.lqo;
import defpackage.ny61;
import defpackage.olh0;
import defpackage.sfl0;
import defpackage.v5t;
import defpackage.zgz0;
import defpackage.zls;

/* loaded from: classes15.dex */
public final class a extends com.yandex.dsl.bricks.a {
    public final i3y A;
    public final ToolbarBackWithCounterBrick$Behaviour B;
    public final sfl0 c;
    public final v5t w;
    public final ChatRequest x;
    public final b y;
    public final lqo z;

    public a(Activity activity, sfl0 sfl0Var, v5t v5tVar, ChatRequest chatRequest, b bVar, lqo lqoVar) {
        super(activity);
        this.c = sfl0Var;
        this.w = v5tVar;
        this.x = chatRequest;
        this.y = bVar;
        this.z = lqoVar;
        this.A = kotlin.a.a(new zgz0(4, this));
        this.B = ToolbarBackWithCounterBrick$Behaviour.BACK;
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        c.b(this.w.a(this.x), getBrickScope(), new ToolbarBackWithCounterBrick$onBrickAttach$1(this, null));
    }

    @Override // com.yandex.dsl.bricks.a
    public final View q(jp31 jp31Var) {
        final int i = olh0.msg_back_with_counter;
        View view = (View) new zls() { // from class: com.yandex.messaging.ui.toolbar.ToolbarBackWithCounterBrick$layout$$inlined$xmlLayout$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                Object systemService = ((Context) obj).getSystemService("layout_inflater");
                if (systemService == null) {
                    ny61.t("null cannot be cast to non-null type android.view.LayoutInflater");
                    return null;
                }
                View inflate = ((LayoutInflater) systemService).inflate(i, (ViewGroup) null, false);
                if (inflate != null) {
                    return inflate;
                }
                ny61.t("null cannot be cast to non-null type V of splitties.views.LayoutInflaterKt.inflate");
                return null;
            }
        }.invoke(jh91.e(0, jp31Var.getCtx()), 0, 0);
        if (jp31Var instanceof kzx) {
            ((kzx) jp31Var).addToParent(view);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        hi91.g(new ToolbarBackWithCounterBrick$layout$1$1(this, null), frameLayout);
        return frameLayout;
    }
}
