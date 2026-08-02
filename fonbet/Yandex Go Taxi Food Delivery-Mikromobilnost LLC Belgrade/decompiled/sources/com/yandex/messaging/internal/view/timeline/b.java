package com.yandex.messaging.internal.view.timeline;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.GalleryMessageData;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.yandex.messaging.internal.view.timeline.galleryview.GalleryView;
import defpackage.a1r;
import defpackage.a7b;
import defpackage.ak51;
import defpackage.ase;
import defpackage.dmt0;
import defpackage.e9h0;
import defpackage.evu0;
import defpackage.fxa1;
import defpackage.gl;
import defpackage.ip31;
import defpackage.jcz0;
import defpackage.jng0;
import defpackage.jqr;
import defpackage.jwf;
import defpackage.llg0;
import defpackage.lqo;
import defpackage.m6;
import defpackage.mw10;
import defpackage.ooy0;
import defpackage.ors;
import defpackage.oyh0;
import defpackage.p8b;
import defpackage.r15;
import defpackage.s15;
import defpackage.sbb;
import defpackage.t15;
import defpackage.tj91;
import defpackage.tz10;
import defpackage.ult0;
import defpackage.uv10;
import defpackage.v3k0;
import defpackage.vb5;
import defpackage.w0r;
import defpackage.x22;
import defpackage.yab;
import defpackage.z0r;
import defpackage.z83;
import defpackage.z9z0;
import defpackage.zf0;
import java.util.Arrays;

/* loaded from: classes15.dex */
public abstract class b extends c implements w0r, llg0 {
    public final jwf B2;
    public final TextView B3;
    public final i0 C2;
    public z0r C3;
    public final a1r H2;
    public String H3;
    public final GalleryView N2;
    public a0 N3;
    public final int T2;
    public final ors V2;
    public boolean X2;
    public boolean v3;
    public final int x2;
    public final int y2;

    public b(boolean z, View view, int i, int i2, jwf jwfVar) {
        super(z, view, jwfVar);
        this.x2 = i;
        this.y2 = i2;
        this.B2 = jwfVar;
        this.C2 = new i0(jwfVar, this.v0);
        this.H2 = (a1r) jwfVar.m;
        GalleryView galleryView = (GalleryView) view.findViewById(e9h0.dialog_item_gallery);
        this.N2 = galleryView;
        this.T2 = 10;
        ors orsVar = new ors(this.J0, view.getContext(), (lqo) jwfVar.i, (x22) jwfVar.a);
        this.V2 = orsVar;
        TextView textView = (TextView) view.findViewById(e9h0.gallery_message_text);
        this.B3 = textView;
        galleryView.setGalleryAdapter(orsVar);
        textView.setOnLongClickListener(new r15(this, 0));
        textView.setOnClickListener(new s15(this, 0));
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final Drawable A0(z9z0 z9z0Var, boolean z, boolean z2) {
        return z9z0Var.a(z, z2, this.R, this.v2.x.F, G0());
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return this.T2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final /* bridge */ /* synthetic */ View C0() {
        return this.N2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final ak51 F0() {
        return this.C2;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final void J0(String str, boolean z) {
        CharSequence text;
        TextView textView = this.B3;
        String z0 = z0((textView.getVisibility() != 0 || (text = textView.getText()) == null || text.length() == 0) ? this.a.getContext().getString(oyh0.messenger_message_with_gallery) : textView.getText().toString(), z);
        if (textView.getVisibility() == 0) {
            textView.setContentDescription(z0);
            y0(textView);
        } else {
            View view = this.N2;
            view.setContentDescription(z0);
            y0(view);
        }
    }

    public abstract ase K0(boolean z, boolean z2);

    @Override // defpackage.qdz0
    public final boolean W() {
        return this.v2.b();
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public void X(yab yabVar, vb5 vb5Var) {
        CharSequence text;
        String obj;
        String spannableStringBuilder;
        int H;
        super.X(yabVar, vb5Var);
        l lVar = e0().g;
        lVar.c = this.x2;
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.a.findViewById(e9h0.gallery_message_text);
        m6 m6Var = new m6(13, this);
        jwf jwfVar = this.B2;
        this.O0 = new mw10(appCompatTextView, m6Var, this.I0, lVar, (v3k0) ((ooy0) jwfVar.q).b(e0().g), (ult0) jwfVar.o, (lqo) jwfVar.i, null, 256);
        this.v3 = this.S0 || this.T0;
        GalleryMessageData galleryMessageData = (GalleryMessageData) yabVar.R();
        gl glVar = this.L0;
        int l = glVar.l();
        String str = galleryMessageData.text;
        TextView textView = this.B3;
        if (str == null || evu0.J(str)) {
            this.X2 = false;
            textView.setVisibility(8);
            glVar.p();
        } else {
            textView.setVisibility(0);
            this.X2 = true;
            glVar.o();
            mw10 mw10Var = this.O0;
            if (mw10Var != null) {
                mw10Var.e(galleryMessageData, l);
                mw10Var.a.setTextColor(this.y2);
            }
        }
        PlainMessage.Item[] itemArr = galleryMessageData.items;
        if (itemArr.length > 10) {
            itemArr = (PlainMessage.Item[]) Arrays.copyOf(itemArr, 10);
        }
        this.N2.bindView(itemArr, this.k0);
        this.V2.w = new t15(this, galleryMessageData);
        if (this.d0 != null && !yabVar.W0()) {
            String str2 = this.d0;
            a1r a1rVar = this.H2;
            a1rVar.getClass();
            this.C3 = new z0r(a1rVar, str2, this);
        }
        this.v2.a(this.t0, yabVar, e0().f);
        String str3 = this.c0;
        if (str3 != null) {
            kotlinx.coroutines.flow.e.H(this.v0, new jqr(e0().s.a(p8b.a(str3)), new BaseGalleryMessageViewHolder$bind$3$1(this, null), 3));
        }
        String str4 = this.H3;
        if (str4 == null || (text = textView.getText()) == null || (obj = text.toString()) == null || (H = evu0.H(obj, (spannableStringBuilder = ((v3k0) ((ooy0) jwfVar.q).a()).b(0, str4).toString()), 0, false, 6)) < 0) {
            return;
        }
        int length = spannableStringBuilder.length() + H;
        int i = fxa1.c(jng0.dsTextBrand, textView.getContext()).data;
        if (this.N3 == null) {
            this.N3 = new a0(textView);
        }
        a0 a0Var = this.N3;
        if (a0Var != null) {
            a0.b(a0Var, H, length, i);
        }
        this.H3 = null;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean b0() {
        return true;
    }

    @Override // defpackage.w0r
    public final void f(long j, long j2) {
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void f0() {
        super.f0();
        a0 a0Var = this.N3;
        if (a0Var != null) {
            a0Var.a();
        }
        this.N3 = null;
        mw10 mw10Var = this.O0;
        if (mw10Var != null) {
            mw10Var.a();
        }
        this.v2.e();
        z0r z0rVar = this.C3;
        if (z0rVar != null) {
            z0rVar.close();
        }
        this.C3 = null;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void g0() {
        f0();
        this.N2.cleanup();
    }

    @Override // defpackage.llg0
    public final void i(a7b a7bVar, sbb sbbVar, boolean z) {
        mw10 mw10Var = this.O0;
        if (mw10Var == null) {
            return;
        }
        TextView textView = this.B3;
        if (textView.getVisibility() != 0) {
            return;
        }
        textView.setOnLongClickListener(null);
        textView.setOnClickListener(null);
        mw10Var.c(new QuoteTextSelectionCallback(this.B3, (dmt0) this.B2.p, a7bVar, sbbVar, new BaseGalleryMessageViewHolder$enableQuoteTextSelection$callback$1(0, this, b.class, "disableQuoteTextSelection", "disableQuoteTextSelection()V", 0)), z);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void i0(Canvas canvas, z9z0 z9z0Var, boolean z, boolean z2) {
        mw10 mw10Var;
        super.i0(canvas, z9z0Var, z, z2);
        GalleryView galleryView = this.N2;
        Integer smallImageHeight = galleryView.getSmallImageHeight();
        ip31 ip31Var = this.H1;
        if (smallImageHeight != null) {
            int intValue = smallImageHeight.intValue();
            ViewParent parent = galleryView.getParent();
            z83.h(null, (parent instanceof ViewGroup ? (ViewGroup) parent : null) == this.y1);
            ase K0 = K0(z, z2);
            View view = this.a;
            if (tj91.b(view)) {
                K0 = K0.a();
            }
            int i = K0.a;
            int i2 = this.p1;
            Drawable b = z9z0.b(z9z0Var, view.getContext(), new int[]{(i == i2 || this.v3) ? 2 : 3, (K0.b == i2 || this.v3) ? 2 : 3, 2, 2});
            b.setLayoutDirection(view.getLayoutDirection());
            b.setBounds(galleryView.getImagePadding() + ip31Var.f(), galleryView.getTop(), ip31Var.g() - galleryView.getImagePadding(), galleryView.getTop() + intValue);
            b.draw(canvas);
        }
        if (!((lqo) this.B2.i).a(tz10.D) || (mw10Var = this.O0) == null) {
            return;
        }
        mw10Var.b(canvas, ip31Var);
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final m l0() {
        return e0().a;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final boolean n0() {
        ServerMessageRef serverMessageRef;
        String str;
        jcz0 jcz0Var;
        boolean n0 = super.n0();
        if (n0 && p0()) {
            uv10 uv10Var = this.m0.a;
            if ((uv10Var != null ? uv10Var.b.a.size() : 0) <= 1 && this.B3.getVisibility() == 0 && (serverMessageRef = this.T1) != null && (str = this.c0) != null && (jcz0Var = e0().f) != null) {
                jcz0Var.r(str, serverMessageRef);
            }
        }
        return n0;
    }

    @Override // defpackage.w0r
    public final void q(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        if (this.k0 || fileProgressObservable$Listener$Status != FileProgressObservable$Listener$Status.UNKNOWN) {
            boolean z = fileProgressObservable$Listener$Status == FileProgressObservable$Listener$Status.ERROR;
            zf0 zf0Var = this.T;
            zf0Var.a = z;
            zf0Var.b();
        }
    }

    @Override // defpackage.llg0
    public final ServerMessageRef r() {
        return this.T1;
    }

    @Override // com.yandex.messaging.internal.view.timeline.e
    public final void w0(boolean z, boolean z2) {
        ase K0 = K0(z, z2);
        if (tj91.b(this.a)) {
            K0 = K0.a();
        }
        this.N2.setRounds(K0);
    }

    @Override // defpackage.llg0
    public final void z(String str) {
        this.H3 = str;
    }
}
