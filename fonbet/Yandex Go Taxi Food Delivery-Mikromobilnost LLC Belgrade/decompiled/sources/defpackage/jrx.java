package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.mapkit.styling.automotivenavigation.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class jrx {
    public final Context a;
    public final ArrayList b;
    public final LinearLayout c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final int j = Color.argb(102, 255, 255, 255);

    public jrx(Context context, ArrayList arrayList, LinearLayout linearLayout, int i) {
        this.a = context;
        this.b = arrayList;
        this.c = linearLayout;
        this.d = i;
        this.e = (int) context.getResources().getDimension(R.dimen.mapkit_styling_automotive_overlap_laneitem_small);
        this.f = (int) context.getResources().getDimension(R.dimen.mapkit_styling_automotive_overlap_laneitem_large);
        this.g = (int) context.getResources().getDimension(R.dimen.mapkit_styling_automotive_margin_laneitem_side);
        this.h = context.getResources().getDimension(R.dimen.mapkit_styling_automotive_width_laneicon);
        this.i = context.getResources().getDimension(R.dimen.mapkit_styling_automotive_height_laneicon);
    }

    public final void a() {
        int i;
        int i2;
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = this.g;
        if (size == 1) {
            irx irxVar = (irx) arrayList.get(0);
            ImageView b = b(irxVar);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) b.getLayoutParams();
            if (irxVar.e) {
                layoutParams.leftMargin = i3;
            }
            if (irxVar.g) {
                layoutParams.rightMargin = i3;
            }
            linearLayout.addView(b, 0);
            return;
        }
        irx irxVar2 = (irx) arrayList.get(0);
        ImageView b2 = b(irxVar2);
        if (irxVar2.e) {
            ((LinearLayout.LayoutParams) b2.getLayoutParams()).leftMargin = i3;
        }
        linearLayout.addView(b2, 0);
        int size2 = arrayList.size() - 1;
        int i4 = 1;
        while (true) {
            i = this.e;
            i2 = this.f;
            if (i4 >= size2) {
                break;
            }
            irx irxVar3 = (irx) arrayList.get(i4);
            ImageView b3 = b(irxVar3);
            ((LinearLayout.LayoutParams) b3.getLayoutParams()).leftMargin = irxVar3.f ? -i2 : -i;
            linearLayout.addView(b3, i4);
            i4++;
        }
        irx irxVar4 = (irx) a.Z(arrayList);
        ImageView b4 = b(irxVar4);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) b4.getLayoutParams();
        if (irxVar4.g) {
            layoutParams2.rightMargin = i3;
        }
        layoutParams2.leftMargin = irxVar4.f ? -i2 : -i;
        linearLayout.addView(b4, arrayList.size() - 1);
    }

    public final ImageView b(irx irxVar) {
        int i;
        Context context = this.a;
        ImageView imageView = new ImageView(context);
        int i2 = (int) this.h;
        int i3 = (int) this.i;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i3));
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Iterator it = irxVar.a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = this.d;
            if (!hasNext) {
                break;
            }
            Drawable drawable = context.getDrawable(((Number) it.next()).intValue());
            drawable.setTint(i);
            c(drawable, canvas);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        int i4 = this.j;
        canvas.drawColor(i4, mode);
        Integer num = irxVar.b;
        if (num != null) {
            Drawable drawable2 = context.getDrawable(num.intValue());
            drawable2.setTint(i);
            c(drawable2, canvas);
        }
        Integer num2 = irxVar.c;
        if (num2 != null) {
            Drawable drawable3 = context.getDrawable(num2.intValue());
            drawable3.setTint(i);
            Integer num3 = irxVar.d;
            if (num3 != null) {
                Drawable drawable4 = context.getDrawable(num3.intValue());
                Bitmap createBitmap2 = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                c(drawable4, new Canvas(createBitmap2));
                Paint paint = new Paint();
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
            }
            if (irxVar.b == null) {
                drawable3.setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
            }
            c(drawable3, canvas);
        }
        imageView.setImageBitmap(createBitmap);
        return imageView;
    }

    public final void c(Drawable drawable, Canvas canvas) {
        drawable.setBounds(0, 0, (int) this.h, (int) this.i);
        drawable.draw(canvas);
    }
}
