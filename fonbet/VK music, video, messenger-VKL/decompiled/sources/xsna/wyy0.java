package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.f2z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class wyy0 implements a520 {
    public String b;
    public WeakReference d;
    public final ArrayList a = new ArrayList();
    public WeakReference c = null;

    @Override // xsna.a520
    public final void a(fvy0 fvy0Var) {
        this.c = new WeakReference(fvy0Var);
    }

    @Override // xsna.a520
    public final void b(b520 b520Var) {
        this.a.add(b520Var);
    }

    @Override // xsna.a520
    public final void c(Context context) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            gu8.c(null, "AdChoicesOptionMenu: there are no actions, can't present.");
            return;
        }
        if (this.c == null) {
            gu8.c(null, "AdChoicesOptionMenu: there is no listener, can't present");
            return;
        }
        f2z0 f2z0Var = new f2z0(context, arrayList, this.b, this.c);
        this.d = new WeakReference(f2z0Var);
        ArrayList arrayList2 = f2z0Var.f;
        if (arrayList2.isEmpty() || (arrayList2.size() == 1 && ((b520) arrayList2.get(0)).d == 1)) {
            gu8.c(null, "AdChoicesOptionsView: there are no actions. Can't open dialog");
            return;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b520 b520Var = (b520) it.next();
            if (b520Var.d != 0) {
                f2z0Var.k = b520Var;
                l37 l37Var = new l37(2, f2z0Var, b520Var);
                Context context2 = f2z0Var.getContext();
                ImageButton imageButton = new ImageButton(context2);
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int d = c1z0.d(1, context2);
                int i = d * 20;
                Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setStrokeWidth(d * 2);
                paint.setAntiAlias(true);
                paint.setColor(-5131855);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStyle(Paint.Style.STROKE);
                Path path = new Path();
                path.setFillType(Path.FillType.EVEN_ODD);
                float f = d * 7;
                path.moveTo(d, f);
                path.lineTo(d * 10, d * 14);
                path.lineTo(d * 19, f);
                canvas.drawPath(path, paint);
                imageButton.setImageBitmap(createBitmap);
                c1z0.h(imageButton, -1, -3158065);
                imageButton.setOnClickListener(l37Var);
                f2z0Var.i = imageButton;
                f2z0Var.addView(imageButton);
                f2z0Var.setOnClickListener(l37Var);
                break;
            }
        }
        b520 b520Var2 = f2z0Var.k;
        if (b520Var2 != null) {
            arrayList2.remove(b520Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        String str = f2z0Var.g;
        if (str != null) {
            arrayList3.add(new f2z0.d(str));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new f2z0.c((b520) it2.next()));
        }
        f2z0Var.b.setAdapter((ListAdapter) new f2z0.a(arrayList3, f2z0Var.h));
        try {
            j7z0 j7z0Var = new j7z0(f2z0Var, f2z0Var.getContext());
            f2z0Var.j = new WeakReference(j7z0Var);
            j7z0Var.show();
        } catch (Throwable th) {
            th.printStackTrace();
            gu8.e(null, "AdChoicesOptionsController: Unable to start adchoices dialog");
            f2z0Var.m();
        }
    }

    @Override // xsna.a520
    public final void d(String str) {
        this.b = str;
    }

    @Override // xsna.a520
    public final void dismiss() {
        j7z0 j7z0Var;
        WeakReference weakReference = this.d;
        if (weakReference == null) {
            gu8.c(null, "AdChoicesOptionMenu: can't dismiss not existing view");
            return;
        }
        f2z0 f2z0Var = (f2z0) weakReference.get();
        if (f2z0Var == null) {
            gu8.c(null, "AdChoicesOptionMenu: can't dismiss not existing or garbage-collected view");
            return;
        }
        WeakReference weakReference2 = f2z0Var.j;
        if (weakReference2 == null || (j7z0Var = (j7z0) weakReference2.get()) == null) {
            return;
        }
        j7z0Var.dismiss();
    }
}
