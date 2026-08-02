package xsna;

import android.content.res.Resources;
import com.vkontakte.android.R;

/* compiled from: NotificationLayoutHelper.kt */
/* loaded from: classes4.dex */
public final class na70 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public int q;
    public int r;

    public na70(Resources resources) {
        int dimension = (int) resources.getDimension(R.dimen.not_content_ver_margin);
        this.a = dimension;
        this.b = (int) resources.getDimension(R.dimen.not_padding_text_footer);
        this.c = (int) resources.getDimension(R.dimen.not_padding_text_avatars);
        this.d = (int) resources.getDimension(R.dimen.not_padding_text_button);
        this.e = (int) resources.getDimension(R.dimen.not_padding_avatars_footer);
        this.f = (int) resources.getDimension(R.dimen.not_padding_avatars_button);
        this.g = (int) resources.getDimension(R.dimen.not_padding_footer_button);
        this.h = (int) resources.getDimension(R.dimen.not_padding_avatars_null);
        this.i = (int) resources.getDimension(R.dimen.not_padding_null_avatars);
        this.j = (int) resources.getDimension(R.dimen.not_padding_button_null);
        this.k = (int) resources.getDimension(R.dimen.not_padding_null_button);
        this.l = (int) resources.getDimension(R.dimen.not_buttons_padding);
        this.m = 1;
        this.n = 2;
        this.o = 3;
        this.p = 4;
        this.q = dimension;
        this.r = 0;
    }

    public final int a(int i) {
        int i2 = this.r;
        if (i2 == 0) {
            this.q += this.i;
        } else if (i2 == this.m) {
            this.q += this.c;
        }
        int i3 = this.q + i;
        this.q = i3;
        this.r = this.o;
        return i3 - i;
    }

    public final int b(int i) {
        int i2 = this.r;
        int i3 = this.m;
        int i4 = this.p;
        if (i2 == i3) {
            this.q += this.d;
        } else if (i2 == this.o) {
            this.q += this.f;
        } else if (i2 == this.n) {
            this.q += this.g;
        } else if (i2 == i4) {
            this.q += this.l;
        } else if (i2 == 0) {
            this.q += this.k;
        }
        int i5 = this.q + i;
        this.q = i5;
        this.r = i4;
        return i5 - i;
    }

    public final int c(int i) {
        int i2 = this.r;
        if (i2 == this.m) {
            this.q += this.b;
        } else if (i2 == this.o) {
            this.q += this.e;
        }
        int i3 = this.q + i;
        this.q = i3;
        this.r = this.n;
        return i3 - i;
    }

    public final int d(int i) {
        int i2 = this.q + i;
        this.q = i2;
        this.r = this.m;
        return i2 - i;
    }
}
