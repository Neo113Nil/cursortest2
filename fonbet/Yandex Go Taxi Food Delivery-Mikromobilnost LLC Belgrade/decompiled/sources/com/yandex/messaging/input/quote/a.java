package com.yandex.messaging.input.quote;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji2.text.EmojiSpan;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.images.b;
import com.yandex.messaging.internal.translator.k;
import defpackage.ahv;
import defpackage.asb1;
import defpackage.bct;
import defpackage.cct;
import defpackage.d5b0;
import defpackage.e1k;
import defpackage.evu0;
import defpackage.ewh0;
import defpackage.fxa1;
import defpackage.g9v;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.i4u;
import defpackage.ike;
import defpackage.iv31;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.mlg0;
import defpackage.nlg0;
import defpackage.oyh0;
import defpackage.oyr;
import defpackage.p4t;
import defpackage.p8b;
import defpackage.plg0;
import defpackage.qlg0;
import defpackage.qoi0;
import defpackage.qp3;
import defpackage.rlg0;
import defpackage.rmt0;
import defpackage.tmt0;
import defpackage.vyf0;
import defpackage.wlg0;
import defpackage.wwg0;
import defpackage.xav;
import defpackage.xbg0;
import defpackage.xn50;
import defpackage.xv10;
import defpackage.yn50;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class a implements rmt0 {
    public static final /* synthetic */ kgx[] I = {new MutablePropertyReference1Impl("userSubscribtion", 0, "getUserSubscribtion()Lcom/yandex/alicekit/core/Disposable;", a.class), oyr.B(qoi0.a, a.class, "messageSpannableSubscription", "getMessageSpannableSubscription()Lcom/yandex/alicekit/core/Disposable;", 0)};
    public final p4t A;
    public final ChatRequest B;
    public final h3y C;
    public xv10 D;
    public final qp3 E = new qp3();
    public final qp3 F = new qp3();
    public i4u G;
    public final ike H;
    public final Context a;
    public final wlg0 b;
    public final cct c;
    public final h3y w;
    public final h3y x;
    public final tmt0 y;
    public final k z;

    public a(Context context, wlg0 wlg0Var, Lifecycle lifecycle, cct cctVar, h3y h3yVar, h3y h3yVar2, tmt0 tmt0Var, k kVar, p4t p4tVar, ChatRequest chatRequest, h3y h3yVar3) {
        this.a = context;
        this.b = wlg0Var;
        this.c = cctVar;
        this.w = h3yVar;
        this.x = h3yVar2;
        this.y = tmt0Var;
        this.z = kVar;
        this.A = p4tVar;
        this.B = chatRequest;
        this.C = h3yVar3;
        this.H = asb1.d(r.a(lifecycle));
        wlg0Var.i.setOnClickListener(new d5b0(25, this));
        g(null, true);
    }

    public final void a() {
        this.D = null;
        g(null, true);
        b();
        b();
        wlg0 wlg0Var = this.b;
        yn50 yn50Var = wlg0Var.n;
        if (yn50Var != null) {
            yn50Var.a();
            wlg0Var.n = null;
        }
        wlg0Var.o.a();
        wlg0Var.q = null;
    }

    public final void b() {
        kgx[] kgxVarArr = I;
        kgx kgxVar = kgxVarArr[0];
        this.E.b(null);
        kgx kgxVar2 = kgxVarArr[1];
        this.F.b(null);
        kotlinx.coroutines.a.g(this.H.a, null);
    }

    public final List c() {
        List list;
        xv10 xv10Var = this.D;
        if (xv10Var == null || (list = (List) xv10Var.b) == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public final e1k d() {
        kgx kgxVar = I[1];
        return (e1k) this.F.a();
    }

    public final xv10 e() {
        if (c() != null) {
            return this.D;
        }
        return null;
    }

    public final void f(xv10 xv10Var) {
        this.D = xv10Var;
        b();
        List c = c();
        if (c == null) {
            g(null, true);
            return;
        }
        int size = c.size();
        ike ikeVar = this.H;
        if (size == 1) {
            List c2 = c();
            if (c2 != null) {
                ServerMessageRef serverMessageRef = (ServerMessageRef) c2.get(0);
                ExistingChatRequest a = p8b.a(serverMessageRef.getRequiredChatId());
                e.H(ikeVar, new m0(this.z.b(a), this.c.a(new bct(a, serverMessageRef)), new QuotePresenter$subscribeSingleMessageInfo$1(this, true, null)));
            }
        } else if (c.size() > 1) {
            List c3 = c();
            if (c3 != null) {
                int size2 = c3.size();
                if (size2 >= 1000) {
                    size2 = 1000;
                }
                e.H(ikeVar, new jqr(((com.yandex.messaging.internal.displayname.a) this.x.get()).a(p8b.a((String) e().a), gvg0.avatar_size_24), new QuotePresenter$subscribeManyMessageInfo$1(this, this.a.getResources().getQuantityString(ewh0.forward_messages_text, size2, Integer.valueOf(size2)), true, null), 3));
            }
        } else {
            g(null, true);
        }
        e.H(ikeVar, new jqr(e.t(this.A.a(this.B)), new QuotePresenter$updateQuote$1(this, null), 3));
    }

    public final void g(rlg0 rlg0Var, boolean z) {
        i4u i4uVar = this.G;
        if (i4uVar != null) {
            com.yandex.messaging.input.bricks.writing.e eVar = (com.yandex.messaging.input.bricks.writing.e) i4uVar.a;
            if (rlg0Var == null) {
                eVar.g();
                eVar.d();
            } else {
                eVar.g();
                eVar.d();
            }
        }
        vyf0 vyf0Var = (rlg0Var == null || !rlg0Var.c) ? null : new vyf0(6, this);
        wlg0 wlg0Var = this.b;
        ImageView imageView = wlg0Var.l;
        TextView textView = wlg0Var.h;
        TextView textView2 = wlg0Var.g;
        View view = wlg0Var.j;
        View view2 = wlg0Var.m;
        ImageView imageView2 = wlg0Var.k;
        wlg0Var.q = rlg0Var;
        mlg0 mlg0Var = wlg0Var.a;
        if (rlg0Var == null) {
            mlg0Var.a.c(8);
            imageView.setVisibility(8);
            view2.setBackground(null);
            mlg0Var.a.a().setOnClickListener(null);
            return;
        }
        String str = rlg0Var.a;
        mlg0Var.a.c(0);
        iv31 iv31Var = mlg0Var.a;
        if (evu0.J(str)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        String str2 = rlg0Var.b;
        TextView.BufferType bufferType = TextView.BufferType.EDITABLE;
        textView.setText(str2, bufferType);
        imageView2.setBackground(null);
        imageView2.setBackgroundTintList(null);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setVisibility(8);
        if (rlg0Var instanceof plg0) {
            view.setVisibility(0);
            wlg0Var.a((plg0) rlg0Var);
        } else if (rlg0Var instanceof nlg0) {
            view.setVisibility(0);
            nlg0 nlg0Var = (nlg0) rlg0Var;
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            String f = b.f(nlg0Var.d);
            imageView2.setImageDrawable(null);
            g9v load = ((xav) wlg0Var.c.get()).load(f);
            int i = layoutParams.width;
            yn50 yn50Var = (yn50) load;
            xn50 xn50Var = yn50Var.b;
            xn50Var.i = i;
            xn50Var.j = layoutParams.height;
            xn50Var.k = ScaleMode.CENTER_CROP;
            wlg0Var.n = yn50Var;
            yn50Var.b(imageView2, new ahv(imageView2, nlg0Var.e));
            String str3 = nlg0Var.b;
            if (str3 == null || evu0.J(str3)) {
                textView.setText(oyh0.messenger_message_with_gallery);
            } else {
                textView.setText(str3, bufferType);
            }
        } else if (rlg0Var instanceof qlg0) {
            view.setVisibility(0);
            imageView2.setBackgroundResource(wwg0.msg_bg_circle);
            imageView2.setBackgroundTintList(ColorStateList.valueOf(fxa1.c(jng0.messagingCommonBackgroundSecondaryColor, imageView2.getContext()).data));
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setImageResource(wwg0.msg_ic_user_poll_18);
        }
        if (rlg0Var.c) {
            imageView.setVisibility(0);
            int i2 = fxa1.c(jng0.messagingCommonSurfaceGenericColor, view2.getContext()).data;
            float f2 = view2.getContext().getResources().getDisplayMetrics().density;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(i2);
            gradientDrawable.setCornerRadius(f2 * 8.0f);
            view2.setBackground(gradientDrawable);
            iv31Var.a().setOnClickListener(new xbg0(2, vyf0Var));
        } else {
            imageView.setVisibility(8);
            view2.setBackground(null);
            iv31Var.a().setOnClickListener(null);
        }
        if (z) {
            wlg0Var.b.a.x.requestFocusAndOpenKeyboard();
        }
    }

    @Override // defpackage.rmt0
    public final void o(Editable editable) {
        if (editable.getSpans(0, editable.length(), EmojiSpan.class).length == 0) {
            return;
        }
        this.b.b(editable);
    }
}
