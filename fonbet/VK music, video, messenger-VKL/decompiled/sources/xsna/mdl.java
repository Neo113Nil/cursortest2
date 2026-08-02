package xsna;

import com.ironsource.B5;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class mdl<T> implements vgo<T> {
    public final List<T> a;
    public final float[] b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public mdl(float[] fArr, List list) {
        Object obj;
        this.a = list;
        this.b = fArr;
        if (list.size() != fArr.length) {
            StringBuilder sb = new StringBuilder("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ");
            sb.append(list);
            sb.append(" | Anchors: ");
            int length = fArr.length;
            if (length != 0) {
                if (length != 1) {
                    obj = new ArrayList(fArr.length);
                    for (float f : fArr) {
                        obj.add(Float.valueOf(f));
                    }
                } else {
                    obj = Collections.singletonList(Float.valueOf(fArr[0]));
                }
            } else {
                obj = EmptyList.b;
            }
            sb.append(obj);
            xzw.a(sb.toString());
        }
        this.c = fArr.length;
    }

    @Override // xsna.vgo
    public final T a(float f) {
        float[] fArr = this.b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float abs = Math.abs(f - fArr[i]);
            if (abs <= f2) {
                i2 = i3;
                f2 = abs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    @Override // xsna.vgo
    public final T b(float f, boolean z) {
        float[] fArr = this.b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.a.get(i2);
    }

    @Override // xsna.vgo
    public final float c(T t) {
        int indexOf = this.a.indexOf(t);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.b;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    @Override // xsna.vgo
    public final float d() {
        float[] fArr = this.b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    @Override // xsna.vgo
    public final float e() {
        float[] fArr = this.b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float f = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                f = Math.min(f, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdl)) {
            return false;
        }
        mdl mdlVar = (mdl) obj;
        return epx.f(this.a, mdlVar.a) && Arrays.equals(this.b, mdlVar.b) && this.c == mdlVar.c;
    }

    @Override // xsna.vgo
    public final boolean f(T t) {
        return this.a.indexOf(t) != -1;
    }

    @Override // xsna.vgo
    public final int getSize() {
        return this.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31) + this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.c;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j5g.b0(i, this.a));
            sb2.append(B5.U);
            if (i >= 0) {
                float[] fArr = this.b;
                if (i < fArr.length) {
                    f = fArr[i];
                    sb2.append(f);
                    sb.append(sb2.toString());
                    if (i >= i2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
            f = Float.NaN;
            sb2.append(f);
            sb.append(sb2.toString());
            if (i >= i2 - 1) {
            }
            i++;
        }
    }
}
