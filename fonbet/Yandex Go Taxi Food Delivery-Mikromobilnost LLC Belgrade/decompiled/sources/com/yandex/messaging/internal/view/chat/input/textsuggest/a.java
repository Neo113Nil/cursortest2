package com.yandex.messaging.internal.view.chat.input.textsuggest;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.bricks.Brick;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import defpackage.ai91;
import defpackage.e9h0;
import defpackage.i3y;
import defpackage.i5y0;
import defpackage.jqr;
import defpackage.kty0;
import defpackage.lty0;
import defpackage.qet;
import defpackage.qty0;
import kotlin.Pair;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends Brick {
    public final LinearLayoutManager A;
    public final RecyclerView B;
    public Integer C;
    public final BottomSheetBehavior D;
    public final qet a;
    public final b b;
    public final kty0 c;
    public final ChatInputHeightState w;
    public final d x;
    public final int y;
    public final i3y z;

    public a(Activity activity, qet qetVar, b bVar, kty0 kty0Var, ChatInputHeightState chatInputHeightState, d dVar) {
        this.a = qetVar;
        this.b = bVar;
        this.c = kty0Var;
        this.w = chatInputHeightState;
        this.x = dVar;
        Point point = new Point();
        ((WindowManager) activity.getSystemService("window")).getDefaultDisplay().getSize(point);
        int height = new Size(point.x, point.y).getHeight() / 3;
        this.y = height;
        this.z = kotlin.a.a(new i5y0(8, this, activity));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, 1, false);
        this.A = linearLayoutManager;
        RecyclerView recyclerView = (RecyclerView) q().findViewById(e9h0.text_suggest_view);
        recyclerView.setAdapter(kty0Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(null);
        recyclerView.setHasFixedSize(false);
        this.B = recyclerView;
        BottomSheetBehavior D = BottomSheetBehavior.D(recyclerView);
        D.T(true);
        D.V(height, false);
        D.v(new lty0(this));
        this.D = D;
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return q();
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        b bVar = this.b;
        e.H(getBrickScope(), new jqr(bVar.d, new TextSuggestBrick$onBrickAttach$1(this, null), 3));
        e.H(getBrickScope(), new jqr(e.X(bVar.d, new TextSuggestBrick$onBrickAttach$$inlined$flatMapLatest$1(this, null)), new TextSuggestBrick$onBrickAttach$3(this, null), 3));
        e.H(getBrickScope(), new jqr(this.w.b, new TextSuggestBrick$onBrickAttach$4(this, null), 3));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        r();
    }

    public final View q() {
        return (View) this.z.getValue();
    }

    public final void r() {
        BottomSheetBehavior bottomSheetBehavior = this.D;
        bottomSheetBehavior.f0 = false;
        ai91.c(q(), false);
        kty0 kty0Var = this.c;
        kty0Var.w = null;
        kty0Var.notifyDataSetChanged();
        bottomSheetBehavior.W(5);
        d dVar = this.x;
        qty0 qty0Var = dVar.g;
        if (qty0Var == null) {
            return;
        }
        dVar.g = null;
        int i = qty0Var.d;
        if (i > 0) {
            dVar.d.reportEvent("hide suggests", kotlin.collections.b.i(new Pair("chat id", dVar.f), new Pair("action id", qty0Var.b), new Pair("count", Integer.valueOf(i))));
        }
    }
}
