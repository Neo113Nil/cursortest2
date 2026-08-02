package com.yandex.messaging.internal.view.chat.input;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.bricks.Brick;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.g;
import com.yandex.messaging.domain.statuses.e;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import defpackage.bvf0;
import defpackage.dj10;
import defpackage.e9h0;
import defpackage.ej10;
import defpackage.fj10;
import defpackage.fjg0;
import defpackage.gci0;
import defpackage.gj10;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.jqr;
import defpackage.k200;
import defpackage.kgx;
import defpackage.kp50;
import defpackage.olh0;
import defpackage.op3;
import defpackage.oyr;
import defpackage.q0k;
import defpackage.qoi0;
import defpackage.qv10;
import defpackage.rp3;
import defpackage.t1s;
import defpackage.tqs;
import defpackage.v8t;
import defpackage.x08;
import defpackage.z83;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class a extends Brick {
    public static final /* synthetic */ kgx[] J = {new MutablePropertyReference1Impl("suggestQuerySubscription", 0, "getSuggestQuerySubscription()Lcom/yandex/messaging/Cancelable;", a.class), oyr.B(qoi0.a, a.class, "suggestJob", "getSuggestJob()Lkotlinx/coroutines/Job;", 0)};
    public final BottomSheetBehavior A;
    public InputTextController B;
    public SuggestQueryWatcher C;
    public final op3 D;
    public final rp3 E;
    public fjg0 F;
    public List G;
    public final r0 H;
    public final gci0 I;
    public final ChatRequest a;
    public final v8t b;
    public final gj10 c;
    public final ChatInputHeightState w;
    public final View x;
    public final ej10 y;
    public final LinearLayoutManager z;

    public a(Activity activity, ChatRequest chatRequest, com.yandex.messaging.internal.team.gaps.a aVar, v8t v8tVar, e eVar, g gVar, h3y h3yVar, q0k q0kVar, gj10 gj10Var, ChatInputHeightState chatInputHeightState) {
        this.a = chatRequest;
        this.b = v8tVar;
        this.c = gj10Var;
        this.w = chatInputHeightState;
        View inflate = inflate(activity, olh0.msg_b_mentions_suggest);
        this.x = inflate;
        ej10 ej10Var = new ej10(q0kVar, aVar, eVar, h3yVar, gVar, new k200(19, this));
        this.y = ej10Var;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, 1, true);
        this.z = linearLayoutManager;
        View findViewById = inflate.findViewById(e9h0.suggest_mentions_view);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setAdapter(ej10Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        BottomSheetBehavior D = BottomSheetBehavior.D((RecyclerView) findViewById);
        D.T(true);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(gvg0.legacy_suggest_item_height);
        D.V((dimensionPixelSize / 2) + (dimensionPixelSize * 4), false);
        fj10 fj10Var = new fj10(this);
        ArrayList arrayList = D.x0;
        arrayList.clear();
        arrayList.add(fj10Var);
        this.A = D;
        this.D = new op3();
        this.E = new rp3();
        this.G = EmptyList.a;
        r0 c = bvf0.c(Boolean.FALSE);
        this.H = c;
        this.I = kotlinx.coroutines.flow.e.d(c);
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.x;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        InputTextController inputTextController;
        super.onBrickAttach(bundle);
        x08 x08Var = null;
        kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.w.b, new MentionSuggestBrick$onBrickAttach$1(this, null), 3));
        if (isAttached()) {
            SuggestQueryWatcher suggestQueryWatcher = this.C;
            if (suggestQueryWatcher != null && (inputTextController = this.B) != null) {
                x08Var = inputTextController.subscribeForTextChanges(suggestQueryWatcher);
            }
            kgx kgxVar = J[0];
            this.D.b(x08Var);
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        kgx kgxVar = J[0];
        this.D.b(null);
        this.G = EmptyList.a;
        r();
    }

    public final void q(InputTextController inputTextController) {
        InputTextController inputTextController2;
        InputTextController inputTextController3 = this.B;
        if (inputTextController3 == inputTextController) {
            return;
        }
        x08 x08Var = null;
        z83.f(inputTextController3, null);
        this.B = inputTextController;
        this.C = new SuggestQueryWatcher(this, inputTextController);
        if (isAttached()) {
            SuggestQueryWatcher suggestQueryWatcher = this.C;
            if (suggestQueryWatcher != null && (inputTextController2 = this.B) != null) {
                x08Var = inputTextController2.subscribeForTextChanges(suggestQueryWatcher);
            }
            kgx kgxVar = J[0];
            this.D.b(x08Var);
        }
    }

    public final void r() {
        List list = this.G;
        ej10 ej10Var = this.y;
        ej10Var.A = list;
        dj10 dj10Var = ej10Var.z;
        dj10Var.a = dj10Var.b;
        dj10Var.b = new ArrayList(list);
        kp50.f(dj10Var, true).b(dj10Var.c);
        int size = this.G.size();
        qv10.B(size > 0, this.H, null);
        BottomSheetBehavior bottomSheetBehavior = this.A;
        gj10 gj10Var = this.c;
        if (size == 0) {
            gj10Var.c = null;
            bottomSheetBehavior.W(5);
            return;
        }
        t1s t1sVar = gj10Var.c;
        if (t1sVar != null) {
            t1sVar.b = true;
            View decorView = ((gj10) t1sVar.c).a.getWindow().getDecorView();
            OneShotPreDrawListener.add(decorView, new tqs(11, decorView, t1sVar));
        }
        this.x.setVisibility(0);
        bottomSheetBehavior.W(size <= 4 ? 3 : 4);
        this.z.r(size - 1, 0);
    }
}
