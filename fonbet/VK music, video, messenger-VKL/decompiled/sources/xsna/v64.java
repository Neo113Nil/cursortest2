package xsna;

import com.vk.dto.common.Attachment;

/* compiled from: AttachmentGridItemUiDto.kt */
/* loaded from: classes4.dex */
public abstract class v64<T extends Attachment> {
    public final int a;
    public final T b;
    public final int c;
    public final int d;

    public v64(int i, T t, int i2, int i3) {
        this.a = i;
        this.b = t;
        this.c = i2;
        this.d = i3;
    }

    public T a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.c;
    }
}
