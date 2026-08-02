package xsna;

import android.graphics.Bitmap;
import com.vk.dto.polls.PhotoPoll;

/* compiled from: PollCustomBackground.kt */
/* loaded from: classes4.dex */
public final class inb0 {
    public final Integer a;
    public PhotoPoll b;
    public int c;
    public int d;
    public Bitmap e;
    public Bitmap f;
    public final String g;

    public inb0(Integer num, PhotoPoll photoPoll, int i, String str, int i2) {
        str = (i2 & 64) != 0 ? null : str;
        this.a = num;
        this.b = photoPoll;
        this.c = i;
        this.d = 100;
        this.e = null;
        this.f = null;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!inb0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        inb0 inb0Var = (inb0) obj;
        return epx.f(this.a, inb0Var.a) && epx.f(this.b, inb0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        PhotoPoll photoPoll = this.b;
        return intValue + (photoPoll != null ? photoPoll.b : 0);
    }
}
