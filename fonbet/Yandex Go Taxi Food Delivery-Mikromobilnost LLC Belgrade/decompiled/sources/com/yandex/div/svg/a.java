package com.yandex.div.svg;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.BitmapSource;
import defpackage.btk;
import defpackage.bvf0;
import defpackage.cvu0;
import defpackage.d5j0;
import defpackage.g2b;
import defpackage.gjf;
import defpackage.gtk;
import defpackage.gxw0;
import defpackage.hxy;
import defpackage.ike;
import defpackage.nci0;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.uhk;
import defpackage.yf7;
import okhttp3.OkHttpClient;

/* loaded from: classes.dex */
public final class a implements gtk {
    public final Context a;
    public final OkHttpClient b = new OkHttpClient(new OkHttpClient.a());
    public final ike c = bvf0.b();
    public final gxw0 d = new gxw0();

    public a(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.gtk
    public final Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        yf7 newCall;
        PictureDrawable pictureDrawable = (PictureDrawable) this.d.a.get(str);
        if (pictureDrawable != null) {
            btkVar.f(new uhk(pictureDrawable, BitmapSource.MEMORY));
            return new gjf(2);
        }
        if (cvu0.x(str, "http://", false) || cvu0.x(str, "https://", false)) {
            t4j0 t4j0Var = new t4j0();
            t4j0Var.h(str);
            newCall = this.b.newCall(new d5j0(t4j0Var));
        } else {
            newCall = null;
        }
        tje.N(this.c, null, null, new SvgDivImageLoader$loadImage$2(newCall, this, str, btkVar, null), 3);
        return new g2b(4, (nci0) newCall);
    }
}
