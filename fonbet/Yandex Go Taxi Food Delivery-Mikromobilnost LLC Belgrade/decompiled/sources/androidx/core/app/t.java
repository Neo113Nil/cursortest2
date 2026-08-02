package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ie4;
import defpackage.ny61;
import defpackage.szh0;
import defpackage.yci0;
import defpackage.zf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class t {

    public static class a extends g {
        public IconCompat e;
        public IconCompat f;
        public boolean g;

        @Override // androidx.core.app.t.g
        public final void b(m0 m0Var) {
            Bitmap bitmap;
            Context context = m0Var.a;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(m0Var.b).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    s.a(bigContentTitle, iconCompat.i(context));
                } else {
                    int i = iconCompat.a;
                    if (i == -1) {
                        i = ((Icon) iconCompat.b).getType();
                    }
                    if (i == 1) {
                        IconCompat iconCompat2 = this.e;
                        int i2 = iconCompat2.a;
                        if (i2 == -1) {
                            Object obj = iconCompat2.b;
                            bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                        } else if (i2 == 1) {
                            bitmap = (Bitmap) iconCompat2.b;
                        } else {
                            if (i2 != 5) {
                                yci0.k(iconCompat2, "called getBitmap() on ");
                                return;
                            }
                            Bitmap bitmap2 = (Bitmap) iconCompat2.b;
                            int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Paint paint = new Paint(3);
                            float f = min;
                            float f2 = 0.5f * f;
                            float f3 = 0.9166667f * f2;
                            float f4 = 0.010416667f * f;
                            paint.setColor(0);
                            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
                            canvas.drawCircle(f2, f2, f3, paint);
                            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
                            canvas.drawCircle(f2, f2, f3, paint);
                            paint.clearShadowLayer();
                            paint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f2, f2, f3, paint);
                            canvas.setBitmap(null);
                            bitmap = createBitmap;
                        }
                        bigContentTitle = bigContentTitle.bigPicture(bitmap);
                    }
                }
            }
            if (this.g) {
                IconCompat iconCompat3 = this.f;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    r.a(bigContentTitle, iconCompat3.i(context));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                s.c(bigContentTitle, false);
                s.b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.t.g
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public final void e(Bitmap bitmap) {
            this.e = bitmap == null ? null : IconCompat.b(bitmap);
        }
    }

    public static class b extends g {
        public CharSequence e;

        @Override // androidx.core.app.t.g
        public final void b(m0 m0Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(m0Var.b).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigText.setSummaryText(this.c);
            }
        }

        @Override // androidx.core.app.t.g
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public final void e(CharSequence charSequence) {
            this.e = v.d(charSequence);
        }
    }

    public static class c extends g {
        public int e;
        public x0 f;
        public PendingIntent g;
        public PendingIntent h;

        @Override // androidx.core.app.t.g
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.e);
            bundle.putBoolean("android.callIsVideo", false);
            x0 x0Var = this.f;
            if (x0Var != null) {
                bundle.putParcelable("android.callPerson", y.b(x0Var.a()));
            }
            bundle.putCharSequence("android.verificationText", null);
            bundle.putParcelable("android.answerIntent", this.g);
            bundle.putParcelable("android.declineIntent", this.h);
            bundle.putParcelable("android.hangUpIntent", null);
        }

        @Override // androidx.core.app.t.g
        public final void b(m0 m0Var) {
            Notification.CallStyle a;
            Notification.Builder builder = m0Var.b;
            PendingIntent pendingIntent = this.g;
            int i = this.e;
            x0 x0Var = this.f;
            String str = null;
            if (Build.VERSION.SDK_INT >= 31) {
                if (i == 1) {
                    a = z.a(x0Var.a(), this.h, pendingIntent);
                } else if (i == 2) {
                    a = z.b(x0Var.a(), null);
                } else if (i != 3) {
                    Log.isLoggable("NotifCompat", 3);
                    a = null;
                } else {
                    a = z.c(x0Var.a(), null, pendingIntent);
                }
                if (a != null) {
                    a.setBuilder(builder);
                    z.e(a, null);
                    z.d(a, false);
                    return;
                }
                return;
            }
            builder.setContentTitle(x0Var != null ? x0Var.a : null);
            Bundle bundle = this.a.y;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.a.y.getCharSequence("android.text");
            if (charSequence == null) {
                if (i == 1) {
                    str = this.a.a.getResources().getString(szh0.call_notification_incoming_text);
                } else if (i == 2) {
                    str = this.a.a.getResources().getString(szh0.call_notification_ongoing_text);
                } else if (i == 3) {
                    str = this.a.a.getResources().getString(szh0.call_notification_screening_text);
                }
                charSequence = str;
            }
            builder.setContentText(charSequence);
            if (x0Var != null) {
                IconCompat iconCompat = x0Var.b;
                if (iconCompat != null) {
                    x.a(builder, iconCompat.i(this.a.a));
                }
                y.a(builder, x0Var.a());
            }
            w.a(builder, "call");
        }

        @Override // androidx.core.app.t.g
        public final String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public final q e(int i, int i2, int i3, PendingIntent pendingIntent) {
            Integer valueOf = Integer.valueOf(this.a.a.getColor(i3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            q a = new zf0(IconCompat.c(i, this.a.a), spannableStringBuilder, pendingIntent).a();
            a.a.putBoolean("key_action_priority", true);
            return a;
        }
    }

    public static class d extends g {
        @Override // androidx.core.app.t.g
        public final void b(m0 m0Var) {
            m0Var.b.setStyle(a0.a());
        }

        @Override // androidx.core.app.t.g
        public final String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }
    }

    public static class e extends g {
        public final ArrayList e = new ArrayList();

        @Override // androidx.core.app.t.g
        public final void b(m0 m0Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(m0Var.b).setBigContentTitle(this.b);
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.t.g
        public final String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public final void e(CharSequence charSequence) {
            if (charSequence != null) {
                this.e.add(v.d(charSequence));
            }
        }

        public final void f(String str) {
            this.c = v.d(str);
            this.d = true;
        }
    }

    public static class f extends g {
        public ArrayList e = new ArrayList();
        public final ArrayList f = new ArrayList();
        public int g = 0;
        public boolean h = true;
        public IconCompat i;

        @Override // androidx.core.app.t.g
        public final void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 36) {
                ArrayList arrayList = this.e;
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        j0 j0Var = (j0) arrayList.get(i);
                        if (j0Var.a > 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("length", j0Var.a);
                            bundle2.putInt("id", 0);
                            bundle2.putInt("colorInt", j0Var.b);
                            arrayList2.add(bundle2);
                        }
                    }
                }
                bundle.putParcelableArrayList("android.progressSegments", arrayList2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                ArrayList arrayList4 = this.f;
                if (arrayList4 != null && !arrayList4.isEmpty() && arrayList4.size() > 0) {
                    arrayList4.get(0).getClass();
                    ny61.u();
                    return;
                }
                bundle.putParcelableArrayList("android.progressPoints", arrayList3);
                bundle.putInt("android.progress", this.g);
                bundle.putBoolean("android.progressIndeterminate", false);
                bundle.putInt("android.progressMax", e());
                bundle.putBoolean("android.styledByProgress", this.h);
                v vVar = this.a;
                Context context = vVar != null ? vVar.a : null;
                if (context != null) {
                    IconCompat iconCompat = this.i;
                    if (iconCompat != null) {
                        bundle.putParcelable("android.progressTrackerIcon", iconCompat.i(context));
                    } else {
                        bundle.remove("android.progressTrackerIcon");
                    }
                    bundle.remove("android.progressStartIcon");
                    bundle.remove("android.progressEndIcon");
                }
            }
        }

        @Override // androidx.core.app.t.g
        public final void b(m0 m0Var) {
            Notification.Builder builder = m0Var.b;
            if (Build.VERSION.SDK_INT < 36) {
                int e = e();
                builder.setProgress(e, Math.min(this.g, e), false);
                return;
            }
            Context context = m0Var.a;
            Notification.ProgressStyle d = ie4.d();
            i0.h(d, this.h);
            i0.a(d, this.g);
            i0.c(d, false);
            i0.f(d, null);
            i0.b(d, null);
            IconCompat iconCompat = this.i;
            i0.g(d, iconCompat != null ? iconCompat.i(context) : null);
            i0.d(d, this.f);
            i0.e(d, this.e);
            builder.setStyle(d);
        }

        @Override // androidx.core.app.t.g
        public final String c() {
            return "androidx.core.app.NotificationCompat$ProgressStyle";
        }

        public final int e() {
            ArrayList arrayList = this.e;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    int i4 = ((j0) arrayList.get(i3)).a;
                    if (i4 > 0) {
                        try {
                            i2 = Math.addExact(i2, i4);
                            i++;
                        } catch (ArithmeticException unused) {
                            return 100;
                        }
                    }
                }
                if (i != 0) {
                    return i2;
                }
            }
            return 100;
        }

        public final void f(int i) {
            this.g = i;
        }

        public final void g(List list) {
            if (this.e == null) {
                this.e = new ArrayList();
            }
            this.e.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                if (this.e == null) {
                    this.e = new ArrayList();
                }
                if (j0Var.a > 0) {
                    this.e.add(j0Var);
                }
            }
        }

        public final void h(IconCompat iconCompat) {
            this.i = iconCompat;
        }

        public final void i() {
            this.h = false;
        }
    }

    public static abstract class g {
        public v a;
        public CharSequence b;
        public CharSequence c;
        public boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c = c();
            if (c != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c);
            }
        }

        public void b(m0 m0Var) {
        }

        public String c() {
            return null;
        }

        public final void d(v vVar) {
            if (this.a != vVar) {
                this.a = vVar;
                vVar.l(this);
            }
        }
    }

    @Deprecated
    public t() {
    }

    public static String a(Notification notification) {
        return notification.getChannelId();
    }

    public static CharSequence b(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static CharSequence c(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static Bundle d(Notification notification) {
        return notification.extras;
    }

    public static boolean e(Notification notification) {
        return (notification.flags & 512) != 0;
    }
}
