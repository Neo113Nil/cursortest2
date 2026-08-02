package com.yandex.passport.internal.ui.bouncer.error;

import android.widget.TextView;
import com.yandex.passport.internal.ui.bouncer.model.v1;
import com.yandex.passport.internal.ui.bouncer.t;
import defpackage.li91;
import defpackage.rs11;
import defpackage.zy11;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a extends com.lightside.slab.a {
    public final h E;
    public final t F;
    public final com.yandex.passport.common.common.a G;
    public final com.yandex.passport.common.analytics.d H;
    public final com.yandex.passport.internal.clipboard.a I;
    public final com.yandex.passport.internal.properties.p J;

    public a(h hVar, t tVar, com.yandex.passport.common.common.a aVar, com.yandex.passport.common.analytics.d dVar, com.yandex.passport.internal.clipboard.a aVar2, com.yandex.passport.internal.properties.p pVar) {
        this.E = hVar;
        this.F = tVar;
        this.G = aVar;
        this.H = dVar;
        this.I = aVar2;
        this.J = pVar;
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        v1 v1Var = (v1) obj;
        h hVar = this.E;
        li91.e(new ErrorSlab$performBind$2(this, null), hVar.x.y);
        d dVar = hVar.w;
        dVar.z.setText(!this.J.w ? ((com.yandex.passport.internal.common.e) this.G).a() : "");
        TextView textView = dVar.B;
        String str = this.H.b().a;
        textView.setText(str != null ? str : "");
        dVar.A.setText("Error(" + v1Var.a + Extension.FIX_SPACE + v1Var.b + ')');
        dVar.y.setText(new SimpleDateFormat("HH:mm (z) dd.MM.yyyy", Locale.getDefault()).format(Calendar.getInstance().getTime()).toString());
        li91.e(new ErrorSlab$performBind$4(this, null), hVar.z);
        return zy11.a;
    }
}
