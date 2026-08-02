package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.image.ImageProvider;

/* loaded from: classes6.dex */
public final class pb30 implements Cloneable {
    public final String a;
    public boolean b;
    public boolean c;
    public float w;
    public Point x;
    public ImageProvider y;

    public pb30(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final pb30 clone() {
        try {
            return (pb30) super.clone();
        } catch (CloneNotSupportedException e) {
            ny61.f(e);
            return null;
        }
    }
}
