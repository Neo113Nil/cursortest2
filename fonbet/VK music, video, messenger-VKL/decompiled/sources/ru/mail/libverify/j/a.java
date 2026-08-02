package ru.mail.libverify.j;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.widget.BaseAdapter;
import java.text.DateFormat;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;
import ru.mail.libverify.api.VerificationApi;
import xsna.bpn0;
import xsna.gzs;

/* loaded from: classes9.dex */
public abstract class a extends BaseAdapter {
    private final Context a;
    private final VerificationApi b;
    private boolean e;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Lazy d = new bpn0(new C2204a());
    private final int[] f = {Color.parseColor("#F44336"), Color.parseColor("#E91E63"), Color.parseColor("#9C27B0"), Color.parseColor("#673AB7"), Color.parseColor("#3F51B5"), Color.parseColor("#2196F3"), Color.parseColor("#03A9F4"), Color.parseColor("#00BCD4"), Color.parseColor("#009688"), Color.parseColor("#4CAF50"), Color.parseColor("#8BC34A"), Color.parseColor("#03A9F4"), Color.parseColor("#CDDC39"), Color.parseColor("#43A047"), Color.parseColor("#5C6BC0"), Color.parseColor("#00695C"), Color.parseColor("#C2185B"), Color.parseColor("#795548"), Color.parseColor("#9E9E9E"), Color.parseColor("#607D8B")};

    /* renamed from: ru.mail.libverify.j.a$a, reason: collision with other inner class name */
    public static final class C2204a extends Lambda implements gzs<DateFormat> {
        public C2204a() {
            super(0);
        }

        @Override // xsna.gzs
        public final DateFormat invoke() {
            return android.text.format.DateFormat.getTimeFormat(a.this.d());
        }
    }

    public a(Context context, VerificationApi verificationApi) {
        this.a = context;
        this.b = verificationApi;
    }

    public abstract void a();

    public void a(int i) {
    }

    public abstract void b();

    public final VerificationApi c() {
        return this.b;
    }

    public final Context d() {
        return this.a;
    }

    public final Handler e() {
        return this.c;
    }

    public final DateFormat f() {
        return (DateFormat) this.d.getValue();
    }

    public final void g() {
        this.e = false;
    }

    public final void h() {
        this.e = false;
    }

    public final void i() {
        if (this.e) {
            return;
        }
        this.e = true;
        j();
    }

    public abstract void j();

    public final int a(String str) {
        char charAt = str.charAt(0);
        int[] iArr = this.f;
        return iArr[charAt % iArr.length];
    }
}
