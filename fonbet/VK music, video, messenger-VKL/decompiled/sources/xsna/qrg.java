package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.vk.dto.profile.Address;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Iterator;
import xsna.e3m;

/* compiled from: CommunityAddressesRenderer.kt */
/* loaded from: classes5.dex */
public final class qrg implements bxf<tqg>, zwf<tqg> {
    public final zwf<tqg> a;
    public final Context b;
    public final wwf<tqg> c;
    public final pf8 d;
    public final Paint e;
    public final HashMap<Integer, sb7> f;
    public final b[] g;
    public sb7 h;
    public sb7 i;
    public xwf j;
    public Address k;
    public ji0 l;

    /* compiled from: CommunityAddressesRenderer.kt */
    public final class a extends alo {
        public final Drawable b;
        public final Bitmap c;
        public final Bitmap d;
        public final Canvas e;

        public a(Drawable drawable, Bitmap bitmap) {
            super(drawable);
            this.b = drawable;
            this.c = bitmap;
            Bitmap createBitmap = Bitmap.createBitmap(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.d = createBitmap;
            this.e = new Canvas(createBitmap);
        }

        public final Bitmap a() {
            PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
            Canvas canvas = this.e;
            canvas.drawColor(0, mode);
            draw(canvas);
            return this.d;
        }

        @Override // xsna.alo, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Drawable drawable = this.a;
            drawable.setBounds(0, 0, width, height);
            drawable.draw(canvas);
            Bitmap bitmap = this.c;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (canvas.getWidth() - bitmap.getWidth()) / 2.0f, (canvas.getHeight() - bitmap.getHeight()) / 2.0f, qrg.this.e);
            }
        }
    }

    /* compiled from: CommunityAddressesRenderer.kt */
    public final class b extends alo {
        public final Drawable b;
        public final Bitmap c;
        public final Canvas d;
        public final int e;
        public String f;

        public b(Drawable drawable) {
            super(drawable);
            this.b = drawable;
            Bitmap createBitmap = Bitmap.createBitmap(this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            this.c = createBitmap;
            this.d = new Canvas(createBitmap);
            this.e = iah0.a(1.5f);
            this.f = "";
        }

        @Override // xsna.alo, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Drawable drawable = this.a;
            drawable.setBounds(0, 0, width, height);
            drawable.draw(canvas);
            qrg qrgVar = qrg.this;
            float textSize = ((qrgVar.e.getTextSize() / 2.0f) + (canvas.getHeight() / 2.0f)) - this.e;
            String str = this.f;
            canvas.drawText(str, 0, str.length(), canvas.getWidth() / 2.0f, textSize, qrgVar.e);
        }
    }

    public qrg(zwf zwfVar, Context context, wwf wwfVar, pf8 pf8Var) {
        this.a = zwfVar;
        this.b = context;
        this.c = wwfVar;
        this.d = pf8Var;
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new HashMap<>();
        e3m.a aVar = e3m.a;
        paint.setColor(context.getColor(R.color.almost_black));
        paint.setTextAlign(Paint.Align.CENTER);
        com.vk.typography.b.j(paint, context, FontFamily.MEDIUM, Float.valueOf(13.0f), 8);
        b[] bVarArr = new b[3];
        int i = 0;
        while (i < 3) {
            bVarArr[i] = new b(i != 0 ? i != 1 ? m33.a(R.drawable.vk_icon_deprecated_bg_nnn_places, this.b) : m33.a(R.drawable.bg_nn_places, this.b) : m33.a(R.drawable.bg_n_places, this.b));
            i++;
        }
        this.g = bVarArr;
        this.h = (sb7) this.d.invoke(new a(m33.a(R.drawable.bg_place, this.b), null).a());
        this.i = (sb7) this.d.invoke(new a(m33.a(R.drawable.bg_place_highlight, this.b), null).a());
    }

    @Override // xsna.zwf
    public final void a(twf twfVar, qdr0 qdr0Var) {
        qdr0Var.c(this.h);
        eo00 eo00Var = qdr0Var.a;
        eo00Var.b(0.5f, 0.5f);
        try {
            eo00Var.a.zzt(0.5f, 1.1f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.zwf
    public final boolean b(xwf xwfVar) {
        int i = xwfVar.c;
        if (i == 2 && this.k != null) {
            ji0 ji0Var = this.l;
            if ((ji0Var != null ? ((CommunityAddressesFragment) ji0Var.c).w0 : null) == null) {
                Iterator it = xwfVar.b.iterator();
                while (it.hasNext()) {
                    Address address = this.k;
                    if (address != null && ((tqg) it.next()).a.b == address.b) {
                        return false;
                    }
                }
            }
        }
        return i >= 2;
    }

    @Override // xsna.zwf
    public final void c(xwf xwfVar, qdr0 qdr0Var) {
        qdr0Var.c(g(xwfVar));
        qdr0Var.a.b(0.5f, 0.5f);
    }

    @Override // xsna.zwf
    public final void d(twf twfVar, rdr0 rdr0Var) {
        rdr0Var.a(this.h);
        MarkerOptions markerOptions = rdr0Var.a;
        markerOptions.f = 0.5f;
        markerOptions.g = 0.5f;
        markerOptions.l = 0.5f;
        markerOptions.m = 1.1f;
    }

    @Override // xsna.zwf
    public final void e(xwf xwfVar, rdr0 rdr0Var) {
        rdr0Var.a(g(xwfVar));
        MarkerOptions markerOptions = rdr0Var.a;
        markerOptions.f = 0.5f;
        markerOptions.g = 0.5f;
    }

    @Override // xsna.zwf
    public final fo00 f(jwf<? extends tqg> jwfVar) {
        return this.a.f(jwfVar);
    }

    public final sb7 g(xwf xwfVar) {
        boolean z;
        Address address = this.k;
        if (address != null) {
            Iterator it = xwfVar.b.iterator();
            while (it.hasNext()) {
                if (((tqg) it.next()).a.b == address.b) {
                    this.j = xwfVar;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        int i = xwfVar.c;
        if (z) {
            i--;
        }
        return h(i);
    }

    @Override // xsna.bxf
    public final zwf<tqg> getParent() {
        return this.a;
    }

    public final sb7 h(int i) {
        sb7 sb7Var;
        Integer valueOf = Integer.valueOf(i);
        HashMap<Integer, sb7> hashMap = this.f;
        if (hashMap.containsKey(valueOf) && (sb7Var = hashMap.get(Integer.valueOf(i))) != null) {
            return sb7Var;
        }
        b bVar = this.g[i < 10 ? (char) 0 : i < 100 ? (char) 1 : (char) 2];
        bVar.f = String.valueOf(i);
        Canvas canvas = bVar.d;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        bVar.draw(canvas);
        sb7 sb7Var2 = (sb7) this.d.invoke(bVar.c);
        hashMap.put(Integer.valueOf(i), sb7Var2);
        return sb7Var2;
    }

    public final void i(Bitmap bitmap) {
        if (bitmap != null) {
            float f = 22;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, iah0.a(f), iah0.a(f), true);
            e3m.a aVar = e3m.a;
            Context context = this.b;
            Bitmap a2 = new a(m33.a(R.drawable.bg_place, context), bitmap).a();
            pf8 pf8Var = this.d;
            this.h = (sb7) pf8Var.invoke(a2);
            this.i = (sb7) pf8Var.invoke(new a(m33.a(R.drawable.bg_place_highlight, context), createScaledBitmap).a());
        }
        this.c.j();
    }

    public final void j(Address address) {
        this.k = address;
        xwf xwfVar = this.j;
        if (xwfVar != null) {
            sb7 h = h(xwfVar.c);
            fo00 f = this.a.f(xwfVar);
            if (h != null && f != null) {
                f.c(h);
            }
        }
        this.j = null;
    }
}
