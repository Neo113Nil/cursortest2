package xsna;

import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;

/* compiled from: ThumbInfo.kt */
/* loaded from: classes4.dex */
public final class kso0 {
    public int a;
    public int b;
    public int c;
    public PhotoAttachment d;
    public boolean e;

    public kso0(int i, int i2, int i3, PhotoAttachment photoAttachment, DocumentAttachment documentAttachment, int i4) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        photoAttachment = (i4 & 8) != 0 ? null : photoAttachment;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = photoAttachment;
        this.e = false;
    }

    public final int a() {
        return this.c;
    }

    public final PhotoAttachment b() {
        return this.d;
    }

    public final int c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final int e() {
        return this.b;
    }

    public final void f(int i) {
        this.c = i;
    }

    public final void g(PhotoAttachment photoAttachment) {
        this.d = photoAttachment;
    }

    public final void h(int i) {
        this.a = i;
    }

    public final void i() {
        this.e = true;
    }

    public final void j(int i) {
        this.b = i;
    }
}
