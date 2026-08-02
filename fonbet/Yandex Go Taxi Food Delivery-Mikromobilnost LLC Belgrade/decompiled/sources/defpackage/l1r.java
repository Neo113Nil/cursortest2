package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.format.Formatter;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.messaging.internal.entities.MediaFileMessageData;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;

/* loaded from: classes15.dex */
public final class l1r implements w0r {
    public final int A;
    public final int B;
    public final u0r C;
    public final AnimatedVectorDrawableCompat D;
    public int E;
    public final Drawable F;
    public final Drawable G;
    public String H;
    public boolean I;
    public z0r J;
    public Long K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final int O;
    public boolean P;
    public final Context a;
    public final ImageView b;
    public final TextView c;
    public final a1r w;
    public final oyq x;
    public final xzq y;
    public final int z;

    public l1r(Context context, ImageView imageView, TextView textView, a1r a1rVar, oyq oyqVar, xzq xzqVar, int i, int i2, int i3, int i4, int i5, h3y h3yVar, int i6) {
        i2 = (i6 & 128) != 0 ? 0 : i2;
        h3yVar = (i6 & 4096) != 0 ? null : h3yVar;
        this.a = context;
        this.b = imageView;
        this.c = textView;
        this.w = a1rVar;
        this.x = oyqVar;
        this.y = xzqVar;
        this.z = i;
        this.A = i5;
        this.B = i5;
        this.C = new u0r(context, imageView, h3yVar);
        AnimatedVectorDrawableCompat create = AnimatedVectorDrawableCompat.create(context, i4);
        if (create == null) {
            ny61.r("resource for load animation not found");
            throw null;
        }
        this.D = create;
        this.E = i;
        this.F = vqb1.e(i3, context);
        this.G = i2 != 0 ? rm91.d(vqb1.e(i2, context), i5) : null;
        this.O = fxa1.c(jng0.messagingCommonTextSecondaryColor, textView.getContext()).data;
        create.setColorFilter(new ColorFilter());
        textView.setTextColor(i5);
        textView.setCompoundDrawablePadding(kjs0.b(4));
    }

    public static void a(l1r l1rVar, String str, MediaFileMessageData mediaFileMessageData, int i, Long l, boolean z, boolean z2, int i2) {
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            z2 = false;
        }
        a1r a1rVar = l1rVar.w;
        TextView textView = l1rVar.c;
        l1rVar.L = true;
        l1rVar.H = mediaFileMessageData.fileId;
        l1rVar.I = mediaFileMessageData.detentionReason != 0;
        l1rVar.K = l;
        l1rVar.M = z;
        l1rVar.N = z2;
        Integer a = l1rVar.y.a(vkb1.c(mediaFileMessageData));
        int intValue = a != null ? a.intValue() : l1rVar.z;
        l1rVar.E = intValue;
        l1rVar.C.c(intValue, l1rVar.H, l1rVar.M);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Drawable drawable = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.rightMargin = i;
            textView.setLayoutParams(marginLayoutParams);
        }
        l1rVar.b();
        String str2 = l1rVar.H;
        if (str2 != null) {
            a1rVar.getClass();
            l1rVar.J = new z0r(a1rVar, str2, l1rVar);
        } else if (str != null) {
            if (l1rVar.I) {
                l1rVar.c();
            } else {
                l1rVar.d();
            }
            a1rVar.getClass();
            l1rVar.J = new z0r(a1rVar, str, l1rVar);
        }
        Drawable drawable2 = l1rVar.G;
        Integer num = mediaFileMessageData.fileSource;
        if (num != null && num.intValue() == 1) {
            drawable = drawable2;
        }
        bob1.e(textView, drawable, true);
        if (l1rVar.L) {
            return;
        }
        textView.setTextColor(l1rVar.O);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        String str;
        Long l = this.K;
        if (l != null) {
            str = Formatter.formatShortFileSize(this.a, l.longValue());
        }
        str = "";
        if (evu0.J(str)) {
            return;
        }
        TextView textView = this.c;
        textView.setText(str);
        String str2 = this.H;
        oyq oyqVar = this.x;
        bob1.d(textView, (oyqVar.a(str2) || !this.L || this.N) ? null : this.F, true);
        textView.setTextColor(!this.L ? this.O : (this.N || oyqVar.a(this.H)) ? this.B : this.A);
    }

    public final void c() {
        String str = this.H;
        int i = this.E;
        boolean z = this.M;
        u0r u0rVar = this.C;
        u0rVar.c(i, str, z);
        this.P = false;
        this.D.stop();
        u0rVar.b();
    }

    public final void d() {
        if (this.P) {
            return;
        }
        ImageView imageView = this.b;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.D;
        imageView.setImageDrawable(animatedVectorDrawableCompat);
        this.P = true;
        animatedVectorDrawableCompat.start();
        this.C.b();
    }

    public final void e() {
        if (!this.L) {
            this.c.setTextColor(this.O);
            return;
        }
        String str = this.H;
        if (str == null) {
            b();
            if (this.I) {
                c();
                return;
            } else {
                d();
                return;
            }
        }
        boolean a = this.x.a(str);
        u0r u0rVar = this.C;
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = this.D;
        if (a) {
            b();
            u0rVar.c(this.E, this.H, this.M);
            this.P = false;
            animatedVectorDrawableCompat.stop();
            return;
        }
        b();
        u0rVar.c(this.E, this.H, this.M);
        this.P = false;
        animatedVectorDrawableCompat.stop();
    }

    @Override // defpackage.w0r
    public final void f(long j, long j2) {
        d();
        TextView textView = this.c;
        Context context = textView.getContext();
        textView.setText(context.getResources().getString(oyh0.chat_message_file_send_progress, Formatter.formatShortFileSize(context, j), Formatter.formatShortFileSize(context, j2)));
        bob1.d(textView, null, true);
    }

    @Override // defpackage.w0r
    public final void q(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        int i = k1r.a[fileProgressObservable$Listener$Status.ordinal()];
        if (i == 1) {
            e();
            return;
        }
        if (i == 2) {
            d();
            return;
        }
        if (i == 3) {
            e();
            return;
        }
        if (i == 4) {
            e();
        } else if (i == 5) {
            c();
        } else {
            w511.b();
        }
    }
}
