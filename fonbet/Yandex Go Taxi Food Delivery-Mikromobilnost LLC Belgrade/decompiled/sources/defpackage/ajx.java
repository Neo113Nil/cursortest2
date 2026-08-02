package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes10.dex */
public class ajx extends jhx {
    public int e = -1;
    public String f = null;
    public int g = -1;
    public int h = 0;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public int o = 0;

    @Override // defpackage.jhx
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.jhx
    /* renamed from: b */
    public final jhx clone() {
        ajx ajxVar = new ajx();
        super.c(this);
        ajxVar.f = this.f;
        ajxVar.g = this.g;
        ajxVar.h = this.h;
        ajxVar.i = this.i;
        ajxVar.j = Float.NaN;
        ajxVar.k = this.k;
        ajxVar.l = this.l;
        ajxVar.m = this.m;
        ajxVar.n = this.n;
        return ajxVar;
    }

    @Override // defpackage.jhx
    public final void d(HashSet hashSet) {
    }

    @Override // defpackage.jhx
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.KeyPosition);
        SparseIntArray sparseIntArray = zix.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = zix.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 2:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f = qbn.c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    this.h = obtainStyledAttributes.getInt(index, this.h);
                    break;
                case 6:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 7:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.j);
                    this.i = f;
                    this.j = f;
                    break;
                case 9:
                    this.o = obtainStyledAttributes.getInt(index, this.o);
                    break;
                case 10:
                    this.g = obtainStyledAttributes.getInt(index, this.g);
                    break;
                case 11:
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 12:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void h(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f = obj.toString();
                break;
            case "percentWidth":
                this.i = jhx.g((Number) obj);
                break;
            case "percentHeight":
                this.j = jhx.g((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float g = jhx.g((Number) obj);
                this.i = g;
                this.j = g;
                break;
            case "percentX":
                this.k = jhx.g((Number) obj);
                break;
            case "percentY":
                this.l = jhx.g((Number) obj);
                break;
        }
    }
}
