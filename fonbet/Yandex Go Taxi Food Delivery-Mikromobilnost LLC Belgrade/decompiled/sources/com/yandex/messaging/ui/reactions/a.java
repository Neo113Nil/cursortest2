package com.yandex.messaging.ui.reactions;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.yandex.bricks.Brick;
import com.yandex.bricks.BrickSlotView;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.yandex.messaging.views.bottomsheet.NavConfiguration;
import defpackage.arg;
import defpackage.b220;
import defpackage.b890;
import defpackage.cmi;
import defpackage.dfj;
import defpackage.e3r;
import defpackage.ewh0;
import defpackage.h8g;
import defpackage.i2b;
import defpackage.jng0;
import defpackage.kjs0;
import defpackage.ms11;
import defpackage.mv10;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.pyf0;
import defpackage.q5z;
import defpackage.qyf0;
import defpackage.r0d0;
import defpackage.ryf0;
import defpackage.sfl0;
import defpackage.ss11;
import defpackage.ugd0;
import defpackage.vng;
import defpackage.vse;
import defpackage.wwf;
import defpackage.wwg0;
import defpackage.xav;
import defpackage.z8g;

/* loaded from: classes15.dex */
public final class a extends ss11 implements com.yandex.messaging.views.bottomsheet.b {
    public c B;
    public final Activity a;
    public final dfj b;
    public final wwf c;
    public final sfl0 w;
    public final i2b x;
    public MessageMenuDialog y;
    public final qyf0 z = new qyf0();
    public final qyf0 A = new qyf0();

    public a(Activity activity, dfj dfjVar, wwf wwfVar, sfl0 sfl0Var, i2b i2bVar) {
        this.a = activity;
        this.b = dfjVar;
        this.c = wwfVar;
        this.w = sfl0Var;
        this.x = i2bVar;
        dfjVar.insertInto((BrickSlotView) i2bVar.x);
    }

    @Override // com.yandex.messaging.views.bottomsheet.b
    public final Brick j() {
        return this;
    }

    @Override // com.yandex.messaging.views.bottomsheet.b
    public final NavConfiguration k() {
        return NavConfiguration.a(new NavConfiguration(0), 0, NavConfiguration.OpenMode.PreviousScreen, 1);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        this.x.w.setVisibility(8);
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        c cVar = this.B;
        if (cVar != null) {
            cVar.a.a();
        }
    }

    @Override // com.yandex.messaging.views.bottomsheet.b
    public final void p(Bundle bundle) {
        if (bundle == null) {
            ny61.r("PublicReactionListBrick args is missing");
            return;
        }
        Object u = vng.u(bundle, ServerMessageRef.class, "MESSAGE_REF_KEY");
        if (u == null) {
            ny61.r("ServerMessageRef is missing");
            return;
        }
        ServerMessageRef serverMessageRef = (ServerMessageRef) u;
        RecyclerView recyclerView = (RecyclerView) this.x.y;
        wwf wwfVar = this.c;
        wwfVar.getClass();
        z8g z8gVar = (z8g) wwfVar.a;
        p8g p8gVar = (p8g) wwfVar.b;
        h8g h8gVar = (h8g) wwfVar.c;
        new ryf0();
        b890 b890Var = new b890(new pyf0(serverMessageRef, p8gVar.p(), (mv10) p8gVar.e3.get()), new Handler(Looper.getMainLooper()), 50, 25);
        com.yandex.messaging.internal.avatar.a aVar = (com.yandex.messaging.internal.avatar.a) p8gVar.A2.get();
        vse vseVar = (vse) z8gVar.g.get();
        xav xavVar = (xav) p8gVar.j0.get();
        arg argVar = (arg) h8gVar.M2.get();
        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) p8gVar.i.get();
        b220 b220Var = p8gVar.b.a.o;
        q5z.i(b220Var);
        c cVar = new c(b890Var, aVar, vseVar, xavVar, argVar, messengerEnvironment, new e3r(b220Var, 1), p8gVar.h());
        cVar.a.b();
        this.B = cVar;
        cVar.b = new PublicReactionListBrick$createMultiAdapter$1$1(1, this, a.class, "onDataChanged", "onDataChanged(Ljava/util/List;)V", 0);
        cVar.c = new PublicReactionListBrick$createMultiAdapter$1$2(2, this, a.class, "onStateChanged", "onStateChanged(Lcom/yandex/messaging/paging/PagedLoader$LoadType;Lcom/yandex/messaging/paging/PagedLoader$LoadState;)V", 0);
        cVar.E = new ugd0(15, this, serverMessageRef);
        int i = 2;
        recyclerView.setAdapter(new e(this.z, cVar, this.A));
        Activity activity = this.a;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        int i2 = bundle.getInt("REACTION_COUNT");
        int i3 = wwg0.msg_ic_reactions_close;
        String quantityString = activity.getResources().getQuantityString(ewh0.menu_reactions, i2, Integer.valueOf(i2));
        ColorStateList colorStateList = dfj.z;
        dfj dfjVar = this.b;
        TextView textView = dfjVar.x;
        ImageView imageView = dfjVar.b;
        TextView textView2 = dfjVar.w;
        ImageView imageView2 = dfjVar.c;
        imageView.setImageResource(i3);
        imageView.setVisibility(0);
        int b = kjs0.b(40);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = b;
        layoutParams.height = b;
        imageView.setLayoutParams(layoutParams);
        imageView.setPadding(0, 0, 0, 0);
        if (colorStateList != null) {
            imageView.setImageTintList(null);
        }
        imageView2.setVisibility(4);
        textView2.setVisibility(0);
        textView2.setText(quantityString);
        textView.setVisibility(8);
        dfjVar.y.setVisibility(8);
        int i4 = jng0.messagingCommonTextSecondaryColor;
        TypedValue typedValue = new TypedValue();
        imageView.getContext().getTheme().resolveAttribute(i4, typedValue, true);
        int i5 = typedValue.data;
        Drawable drawable = imageView.getDrawable();
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        if (layerDrawable != null && 1 < layerDrawable.getNumberOfLayers()) {
            Drawable mutate = layerDrawable.getDrawable(1).mutate();
            mutate.setTint(i5);
            layerDrawable.setDrawable(1, mutate);
        }
        imageView.setOnClickListener(new cmi(i, new r0d0(29, this)));
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.x;
    }
}
