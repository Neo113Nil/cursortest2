package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.extension.a;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifCompressStrategy;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifLoadingStrategy;

/* loaded from: classes15.dex */
public final class mt10 {
    public final AppCompatImageView a;
    public final ProgressIndicator b;
    public final xav c;
    public final x22 d;
    public final sls e;
    public final MessageImageLoader$GifLoadingStrategy f;
    public final MessageImageLoader$GifCompressStrategy g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final jse k;
    public boolean l;
    public kt10 m;
    public pzt0 n;
    public yn50 o;
    public pzt0 p;
    public yn50 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public mav u;
    public final Handler v;

    public mt10(AppCompatImageView appCompatImageView, ProgressIndicator progressIndicator, xav xavVar, x22 x22Var, sls slsVar, MessageImageLoader$GifLoadingStrategy messageImageLoader$GifLoadingStrategy, MessageImageLoader$GifCompressStrategy messageImageLoader$GifCompressStrategy, int i) {
        slsVar = (i & 16) != 0 ? new s7s0(23) : slsVar;
        messageImageLoader$GifCompressStrategy = (i & 64) != 0 ? MessageImageLoader$GifCompressStrategy.ORIGINAL : messageImageLoader$GifCompressStrategy;
        boolean z = (i & 128) == 0;
        boolean z2 = (i & 256) == 0;
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = appCompatImageView;
        this.b = progressIndicator;
        this.c = xavVar;
        this.d = x22Var;
        this.e = slsVar;
        this.f = messageImageLoader$GifLoadingStrategy;
        this.g = messageImageLoader$GifCompressStrategy;
        this.h = z;
        this.i = z2;
        this.j = true;
        this.k = mdhVar;
        this.l = z2;
        this.v = new Handler(Looper.getMainLooper());
        progressIndicator.setOnClickAction(new it10(this, 2));
    }

    public final void a() {
        this.l = this.i;
        this.b.setGif(false);
        this.m = null;
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.n = null;
        yn50 yn50Var = this.o;
        if (yn50Var != null) {
            yn50Var.a();
        }
        this.o = null;
        pzt0 pzt0Var2 = this.p;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.p = null;
        yn50 yn50Var2 = this.q;
        if (yn50Var2 != null) {
            yn50Var2.a();
        }
        this.q = null;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = null;
        this.v.removeCallbacksAndMessages(null);
    }

    public final boolean b() {
        kt10 kt10Var = this.m;
        if (kt10Var == null || !kt10Var.d) {
            return false;
        }
        MessageImageLoader$GifLoadingStrategy messageImageLoader$GifLoadingStrategy = MessageImageLoader$GifLoadingStrategy.NEVER;
        MessageImageLoader$GifLoadingStrategy messageImageLoader$GifLoadingStrategy2 = this.f;
        if (messageImageLoader$GifLoadingStrategy2 != messageImageLoader$GifLoadingStrategy) {
            return (messageImageLoader$GifLoadingStrategy2 == MessageImageLoader$GifLoadingStrategy.ALL || kt10Var.e < 10485760) && !this.t;
        }
        return false;
    }

    public final void c() {
        this.v.post(new fbz(23, this));
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [jt10] */
    /* JADX WARN: Type inference failed for: r5v1, types: [jt10] */
    public final void d(kt10 kt10Var, boolean z) {
        if (!jl40.l(this.m, kt10Var) || z) {
            boolean z2 = this.l;
            ProgressIndicator progressIndicator = this.b;
            final int i = 1;
            final int i2 = 0;
            AppCompatImageView appCompatImageView = this.a;
            if (!z2) {
                appCompatImageView.setImageDrawable(null);
                kt10 kt10Var2 = this.m;
                if (kt10Var2 != null ? jl40.l(kt10Var2.h, Boolean.FALSE) : false) {
                    return;
                }
                ProgressIndicator.setLoadingState$default(progressIndicator, 0, 1, null);
                return;
            }
            progressIndicator.setShowProgress(this.j || z);
            progressIndicator.setVisibility(8);
            if (!z && this.m != null) {
                appCompatImageView.setImageDrawable(null);
            }
            this.m = kt10Var;
            xav xavVar = this.c;
            xavVar.c(appCompatImageView);
            this.r = false;
            this.s = false;
            this.t = false;
            this.u = null;
            kt10 kt10Var3 = this.m;
            if (kt10Var3 != null) {
                progressIndicator.setGif(kt10Var3 != null ? kt10Var3.d : false);
                g9v load = xavVar.load(kt10Var3.a);
                kt10 kt10Var4 = this.m;
                int i3 = kt10Var4 != null ? kt10Var4.b : -1;
                yn50 yn50Var = (yn50) load;
                xn50 xn50Var = yn50Var.b;
                xn50Var.i = i3;
                xn50Var.j = kt10Var4 != null ? kt10Var4.c : -1;
                xn50Var.f = true;
                ScaleMode scaleMode = ScaleMode.FIT_CENTER;
                xn50Var.k = scaleMode;
                this.o = yn50Var;
                boolean b = b();
                pzt0 pzt0Var = this.n;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                yn50 yn50Var2 = this.o;
                this.n = yn50Var2 != null ? a.a(yn50Var2, this.a, null, new it10(this, i2), new ex0(this, kt10Var3, b, 13), new it10(this, i), 2) : null;
                if (b()) {
                    z83.d(this.m, null);
                    kt10 kt10Var5 = this.m;
                    if (kt10Var5 != null) {
                        pzt0 pzt0Var2 = this.p;
                        if (pzt0Var2 != null) {
                            pzt0Var2.a(null);
                        }
                        yn50 yn50Var3 = (yn50) xavVar.load(kt10Var5.a);
                        xn50 xn50Var2 = yn50Var3.b;
                        xn50Var2.i = -1;
                        xn50Var2.j = -1;
                        xn50Var2.f = true;
                        xn50Var2.k = scaleMode;
                        this.q = yn50Var3;
                        MessageImageLoader$GifCompressStrategy messageImageLoader$GifCompressStrategy = this.g;
                        this.p = a.b(yn50Var3, this.a, messageImageLoader$GifCompressStrategy.getMaxGifSizeBytes(), messageImageLoader$GifCompressStrategy.getBadGifRatio(), this.n, this.k, new it10(this, 3), new sls(this) { // from class: jt10
                            public final /* synthetic */ mt10 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i2;
                                zy11 zy11Var = zy11.a;
                                mt10 mt10Var = this.b;
                                switch (i4) {
                                    case 0:
                                        mt10Var.c();
                                        break;
                                    default:
                                        mt10Var.t = true;
                                        mt10Var.c();
                                        break;
                                }
                                return zy11Var;
                            }
                        }, new sls(this) { // from class: jt10
                            public final /* synthetic */ mt10 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = i;
                                zy11 zy11Var = zy11.a;
                                mt10 mt10Var = this.b;
                                switch (i4) {
                                    case 0:
                                        mt10Var.c();
                                        break;
                                    default:
                                        mt10Var.t = true;
                                        mt10Var.c();
                                        break;
                                }
                                return zy11Var;
                            }
                        }, new vmz(16, this, kt10Var5));
                    }
                }
                if (this.h) {
                    ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
                    int i4 = layoutParams.width;
                    kt10 kt10Var6 = this.m;
                    if (i4 == (kt10Var6 != null ? kt10Var6.b : -1)) {
                        if (layoutParams.height == (kt10Var6 != null ? kt10Var6.c : -1)) {
                            return;
                        }
                    }
                    layoutParams.width = kt10Var6 != null ? kt10Var6.b : -1;
                    layoutParams.height = kt10Var6 != null ? kt10Var6.c : -1;
                    appCompatImageView.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
