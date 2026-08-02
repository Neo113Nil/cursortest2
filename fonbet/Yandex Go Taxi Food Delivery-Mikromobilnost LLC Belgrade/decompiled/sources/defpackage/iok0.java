package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import defpackage.iok0;
import defpackage.tje;
import defpackage.zy11;
import kotlin.a;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final class iok0 implements gok0 {
    public final zuj0 a;
    public final tse b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public iok0(zuj0 zuj0Var, tse tseVar) {
        this.a = zuj0Var;
        this.b = tseVar;
        final int i = 0;
        this.c = a.a(new sls(this) { // from class: hok0
            public final /* synthetic */ iok0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i2 = i;
                iok0 iok0Var = this.b;
                switch (i2) {
                    case 0:
                        c = ((avj0) iok0Var.a).c(erg0.expand_panorama_entry_point_width);
                        break;
                    case 1:
                        c = ((avj0) iok0Var.a).c(erg0.panorama_entry_point_height);
                        break;
                    default:
                        c = ((avj0) iok0Var.a).c(erg0.expand_panorama_entry_point_radius);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i2 = 1;
        this.d = a.a(new sls(this) { // from class: hok0
            public final /* synthetic */ iok0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i2;
                iok0 iok0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) iok0Var.a).c(erg0.expand_panorama_entry_point_width);
                        break;
                    case 1:
                        c = ((avj0) iok0Var.a).c(erg0.panorama_entry_point_height);
                        break;
                    default:
                        c = ((avj0) iok0Var.a).c(erg0.expand_panorama_entry_point_radius);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
        final int i3 = 2;
        this.e = a.a(new sls(this) { // from class: hok0
            public final /* synthetic */ iok0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int c;
                int i22 = i3;
                iok0 iok0Var = this.b;
                switch (i22) {
                    case 0:
                        c = ((avj0) iok0Var.a).c(erg0.expand_panorama_entry_point_width);
                        break;
                    case 1:
                        c = ((avj0) iok0Var.a).c(erg0.panorama_entry_point_height);
                        break;
                    default:
                        c = ((avj0) iok0Var.a).c(erg0.expand_panorama_entry_point_radius);
                        break;
                }
                return Integer.valueOf(c);
            }
        });
    }

    public final void a(RotatableFloatButton rotatableFloatButton, Bitmap bitmap, final tls tlsVar, String str) {
        Resources resources = rotatableFloatButton.getResources();
        if (resources == null) {
            return;
        }
        c.z(new sls() { // from class: ru.yandex.taxi.panorama.ridecard.a
            @Override // defpackage.sls
            public final Object invoke() {
                tje.N(iok0.this.b, null, null, new RideCardTaxiPanoramaEntryPointInteractorImpl$changePanoramaButtonType$1$1(tlsVar, null), 3);
                return zy11.a;
            }
        }, rotatableFloatButton);
        RotatableFloatButton.show$default(rotatableFloatButton, null, 1, null);
        rotatableFloatButton.setContentDescription(str);
        i3y i3yVar = this.d;
        zuj0 zuj0Var = this.a;
        if (bitmap == null) {
            rotatableFloatButton.setImageDrawable(vng.t(yyg0.panorama_button_text_main, ((avj0) zuj0Var).a));
            rotatableFloatButton.setImageSize(((Number) i3yVar.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
            rotatableFloatButton.setEnableShadowBackground(true);
            return;
        }
        Drawable t = vng.t(yyg0.bg_panorama_expand_button, ((avj0) zuj0Var).a);
        LayerDrawable layerDrawable = t instanceof LayerDrawable ? (LayerDrawable) t : null;
        if (layerDrawable == null) {
            return;
        }
        float intValue = ((Number) this.e.getValue()).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-16777215);
        canvas.drawRoundRect(rectF, intValue, intValue, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        layerDrawable.setDrawable(0, new BitmapDrawable(resources, createBitmap));
        rotatableFloatButton.setImageDrawable(layerDrawable);
        rotatableFloatButton.setImageSize(((Number) this.c.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue());
        rotatableFloatButton.setEnableShadowBackground(false);
        rotatableFloatButton.invalidate();
    }

    public final void b(glk0 glk0Var, RotatableFloatButton rotatableFloatButton) {
        if (jl40.l(glk0Var, dlk0.a)) {
            rotatableFloatButton.hide();
            return;
        }
        if (glk0Var instanceof elk0) {
            elk0 elk0Var = (elk0) glk0Var;
            a(rotatableFloatButton, elk0Var.b, elk0Var.a, elk0Var.c);
        } else if (!(glk0Var instanceof flk0)) {
            w511.b();
        } else {
            flk0 flk0Var = (flk0) glk0Var;
            a(rotatableFloatButton, null, flk0Var.a, flk0Var.b);
        }
    }
}
