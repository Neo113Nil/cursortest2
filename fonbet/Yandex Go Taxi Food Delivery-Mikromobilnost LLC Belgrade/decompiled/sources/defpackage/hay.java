package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.x0;
import com.google.android.gms.internal.identity.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.tankerapp.domain.error.PaymentKitPluginError;
import ru.yandex.taxi.plaque.animation.transitions.TextSizeTransition;

/* loaded from: classes9.dex */
public final class hay implements sj10, mld0, xli0, lq31, r3t0, ve31, py71, g991 {
    public static final /* synthetic */ hay b = new hay(22);
    public final /* synthetic */ int a;

    public hay(Context context) {
        this.a = 12;
        context.getApplicationContext();
    }

    public static final Bitmap d(TextView textView) {
        String[] strArr = TextSizeTransition.h0;
        Drawable background = textView.getBackground();
        textView.setBackground(null);
        int width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        int height = (textView.getHeight() - textView.getPaddingTop()) - textView.getPaddingBottom();
        if (width == 0 || height == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-textView.getPaddingLeft(), -textView.getPaddingTop());
        textView.draw(canvas);
        textView.setBackground(background);
        return createBitmap;
    }

    public static final void e(da20 da20Var, PaymentKitPluginError paymentKitPluginError) {
        da20Var.error(paymentKitPluginError.getCode(), paymentKitPluginError.getMessage(), null);
    }

    public static final void f(TextView textView, rsy0 rsy0Var, float f) {
        String[] strArr = TextSizeTransition.h0;
        textView.setTextSize(0, f);
        textView.setPadding(rsy0Var.a, rsy0Var.b, rsy0Var.c, rsy0Var.d);
        textView.setRight(textView.getLeft() + rsy0Var.e);
        textView.setBottom(textView.getTop() + rsy0Var.f);
        textView.measure(View.MeasureSpec.makeMeasureSpec(textView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(textView.getHeight(), 1073741824));
        textView.layout(textView.getLeft(), textView.getTop(), textView.getRight(), textView.getBottom());
    }

    public static wi70 g(CharSequence charSequence, CharSequence charSequence2, bj70 bj70Var, boolean z, int i) {
        if ((i & 2) != 0) {
            charSequence2 = "";
        }
        CharSequence charSequence3 = charSequence2;
        if ((i & 16) != 0) {
            z = false;
        }
        return new wi70(charSequence, charSequence3, p(charSequence, charSequence3), bj70Var, true, false, z);
    }

    public static wi70 m(String str, String str2, bj70 bj70Var, boolean z, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            bj70Var = bj70.d;
        }
        return new wi70(str, str3, p(str, str3), bj70Var, false, true, z);
    }

    public static CharSequence p(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() == 0) {
            return charSequence;
        }
        return ((Object) charSequence) + Extension.FIX_SPACE + ((Object) charSequence2);
    }

    @Override // defpackage.py71
    public os71 a(Context context) {
        return new ji41(26, new iv2(context));
    }

    @Override // defpackage.g991
    public /* synthetic */ void b(e eVar, luy luyVar, boolean z, atx0 atx0Var) {
        eVar.u(luyVar, z, atx0Var);
    }

    @Override // defpackage.py71
    public np71 c(Context context) {
        return new ji41(22, new hv2(context));
    }

    public String h(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e) {
            ny61.j(e);
            return null;
        }
    }

    @Override // defpackage.ve31
    public void i(ux31 ux31Var) {
    }

    @Override // defpackage.ve31
    public void j(String str) {
    }

    @Override // defpackage.ve31
    public void k() {
    }

    @Override // defpackage.ve31
    public void l() {
    }

    @Override // defpackage.ve31
    public void n(x0 x0Var, elx0 elx0Var) {
    }

    @Override // defpackage.ve31
    public void o() {
    }

    @Override // defpackage.sj10
    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.sj10
    public void onMenuModeChange(MenuBuilder menuBuilder) {
    }

    @Override // defpackage.ve31
    public void r(elx0 elx0Var, boolean z, int i) {
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ hay(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ hay(int i) {
        this.a = i;
    }
}
