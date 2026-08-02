package com.yandex.messaging.internal.view.chat;

import android.app.Activity;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.bricks.Brick;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.Metadata;
import defpackage.ai91;
import defpackage.c220;
import defpackage.e2k0;
import defpackage.e9h0;
import defpackage.evu0;
import defpackage.g9v;
import defpackage.jqr;
import defpackage.k5;
import defpackage.kgx;
import defpackage.mdb;
import defpackage.nob1;
import defpackage.olh0;
import defpackage.poy0;
import defpackage.qha;
import defpackage.qoi0;
import defpackage.u4t;
import defpackage.v3k0;
import defpackage.x22;
import defpackage.xav;
import defpackage.ymu;
import defpackage.yn50;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class b extends Brick {
    public static final /* synthetic */ kgx[] K;
    public final mdb A;
    public final View B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final Button F;
    public final v3k0 G;
    public final ymu H;
    public final int I;
    public final ColorFilter J;
    public final ChatRequest a;
    public final u4t b;
    public final xav c;
    public final Activity w;
    public final x22 x;
    public final c220 y;
    public final e2k0 z;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("imageCreator", 0, "getImageCreator()Lcom/yandex/images/ImageCreator;", b.class);
        qoi0.a.getClass();
        K = new kgx[]{mutablePropertyReference1Impl};
    }

    public b(ChatRequest chatRequest, u4t u4tVar, xav xavVar, Activity activity, x22 x22Var, c220 c220Var, e2k0 e2k0Var, poy0 poy0Var, mdb mdbVar) {
        this.a = chatRequest;
        this.b = u4tVar;
        this.c = xavVar;
        this.w = activity;
        this.x = x22Var;
        this.y = c220Var;
        this.z = e2k0Var;
        this.A = mdbVar;
        View inflate = inflate(activity, olh0.msg_b_chat_metadata);
        this.B = inflate;
        this.C = (ImageView) inflate.findViewById(e9h0.metadata_image);
        this.D = (TextView) inflate.findViewById(e9h0.metadata_title_text);
        this.E = (TextView) inflate.findViewById(e9h0.metadata_body_text);
        Button button = (Button) inflate.findViewById(e9h0.metadata_button);
        this.F = button;
        this.G = (v3k0) poy0Var.a();
        this.H = new ymu(new qha(10));
        this.I = button.getTextColors().getDefaultColor();
        this.J = button.getBackground().getColorFilter();
    }

    @Override // com.yandex.bricks.Brick
    public final View getView() {
        return this.B;
    }

    @Override // com.yandex.bricks.Brick
    public final void onBrickAttach(Bundle bundle) {
        super.onBrickAttach(bundle);
        if (this.A.q) {
            kotlinx.coroutines.flow.e.H(getBrickScope(), new jqr(this.b.a(this.a), new ChatMetadataBrick$onBrickAttach$1(this, null), 3));
        }
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.H.setValue(this, K[0], null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(Metadata.ChatbarButton chatbarButton) {
        Integer valueOf;
        String str;
        Integer num = null;
        Metadata.Text text = chatbarButton != null ? chatbarButton.title : null;
        Button button = this.F;
        if (chatbarButton == null || text == null) {
            button.setVisibility(8);
            return;
        }
        button.setVisibility(0);
        s(button, text);
        String str2 = chatbarButton.textColor;
        if (!TextUtils.isEmpty(str2)) {
            try {
                valueOf = Integer.valueOf(nob1.c(str2));
            } catch (IllegalArgumentException unused) {
            }
            button.setTextColor(valueOf == null ? valueOf.intValue() : this.I);
            Drawable background = button.getBackground();
            str = chatbarButton.bgColor;
            if (!TextUtils.isEmpty(str)) {
                try {
                    num = Integer.valueOf(nob1.c(str));
                } catch (IllegalArgumentException unused2) {
                }
            }
            background.setColorFilter(num == null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC) : this.J);
            button.setOnClickListener(new k5(17, chatbarButton, this));
        }
        valueOf = null;
        button.setTextColor(valueOf == null ? valueOf.intValue() : this.I);
        Drawable background2 = button.getBackground();
        str = chatbarButton.bgColor;
        if (!TextUtils.isEmpty(str)) {
        }
        background2.setColorFilter(num == null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC) : this.J);
        button.setOnClickListener(new k5(17, chatbarButton, this));
    }

    public final void r(String str) {
        ImageView imageView = this.C;
        if (str == null || str.length() == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        kgx[] kgxVarArr = K;
        kgx kgxVar = kgxVarArr[0];
        ymu ymuVar = this.H;
        g9v g9vVar = (g9v) ((AtomicReference) ymuVar.c).get();
        if (g9vVar != null) {
            ((yn50) g9vVar).a();
        }
        yn50 yn50Var = (yn50) this.c.load(str);
        yn50Var.b.k = ScaleMode.FIT_CENTER;
        ymuVar.setValue(this, kgxVarArr[0], yn50Var);
        kgx kgxVar2 = kgxVarArr[0];
        g9v g9vVar2 = (g9v) ((AtomicReference) ymuVar.c).get();
        if (g9vVar2 != null) {
            ((yn50) g9vVar2).b(imageView, null);
        }
    }

    public final void s(TextView textView, Metadata.Text text) {
        int i;
        CharSequence charSequence;
        if (text != null) {
            Activity activity = this.w;
            i = activity.getResources().getIdentifier(text.locKey, "string", activity.getPackageName());
        } else {
            i = 0;
        }
        if (i != 0) {
            textView.setText(i, TextView.BufferType.EDITABLE);
            return;
        }
        if (text != null) {
            charSequence = this.G.b(2, text.text);
        } else {
            charSequence = "";
        }
        textView.setText(charSequence, TextView.BufferType.EDITABLE);
        if (evu0.J(charSequence)) {
            ai91.c(textView, false);
        } else {
            ai91.f(textView, false);
        }
    }
}
