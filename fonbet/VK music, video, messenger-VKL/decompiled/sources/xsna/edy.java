package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R$styleable;
import androidx.core.app.NotificationCompat;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import xsna.gdy;

/* compiled from: KeyCycle.java */
/* loaded from: classes11.dex */
public final class edy extends zcy {
    public int e = 0;
    public int f = -1;
    public String g = null;
    public float h = Float.NaN;
    public float i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float k = Float.NaN;
    public int l = -1;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    /* compiled from: KeyCycle.java */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public edy() {
        this.d = new HashMap<>();
    }

    @Override // xsna.zcy
    public final void a(HashMap<String, w0u0> hashMap) {
        throw null;
    }

    @Override // xsna.zcy
    /* renamed from: b */
    public final zcy clone() {
        edy edyVar = new edy();
        super.c(this);
        edyVar.e = this.e;
        edyVar.f = this.f;
        edyVar.g = this.g;
        edyVar.h = this.h;
        edyVar.i = this.i;
        edyVar.j = this.j;
        edyVar.k = this.k;
        edyVar.l = this.l;
        edyVar.m = this.m;
        edyVar.n = this.n;
        edyVar.o = this.o;
        edyVar.p = this.p;
        edyVar.q = this.q;
        edyVar.r = this.r;
        edyVar.s = this.s;
        edyVar.t = this.t;
        edyVar.u = this.u;
        edyVar.v = this.v;
        edyVar.w = this.w;
        return edyVar;
    }

    @Override // xsna.zcy
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // xsna.zcy
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.i);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.H0) {
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
                    obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = obtainStyledAttributes.getString(index);
                        this.f = 7;
                        break;
                    } else {
                        this.f = obtainStyledAttributes.getInt(index, this.f);
                        break;
                    }
                case 6:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type == 5) {
                        this.i = obtainStyledAttributes.getDimension(index, this.i);
                        break;
                    } else {
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    }
                case 8:
                    this.l = obtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 11:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 12:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 13:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 15:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 16:
                    this.t = obtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 17:
                    this.u = obtainStyledAttributes.getDimension(index, this.u);
                    break;
                case 18:
                    this.v = obtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 19:
                    this.w = obtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 20:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 21:
                    this.j = obtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c3, code lost:
    
        if (r1.equals("scaleY") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(HashMap<String, dzt0> hashMap) {
        dzt0 dzt0Var;
        float f;
        dzt0 dzt0Var2;
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            char c = 7;
            if (next.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute = this.d.get(next.substring(7));
                if (constraintAttribute != null && constraintAttribute.c == ConstraintAttribute.AttributeType.FLOAT_TYPE && (dzt0Var = hashMap.get(next)) != null) {
                    int i = this.a;
                    int i2 = this.f;
                    String str = this.g;
                    int i3 = this.l;
                    dzt0Var.f.add(new gdy.b(this.h, this.i, this.j, constraintAttribute.a(), i));
                    if (i3 != -1) {
                        dzt0Var.e = i3;
                    }
                    dzt0Var.c = i2;
                    dzt0Var.b(constraintAttribute);
                    dzt0Var.d = str;
                }
            } else {
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1001078227:
                        if (next.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -908189617:
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        f = this.q;
                        break;
                    case 1:
                        f = this.r;
                        break;
                    case 2:
                        f = this.u;
                        break;
                    case 3:
                        f = this.v;
                        break;
                    case 4:
                        f = this.w;
                        break;
                    case 5:
                        f = this.k;
                        break;
                    case 6:
                        f = this.s;
                        break;
                    case 7:
                        f = this.t;
                        break;
                    case '\b':
                        f = this.o;
                        break;
                    case '\t':
                        f = this.n;
                        break;
                    case '\n':
                        f = this.p;
                        break;
                    case 11:
                        f = this.m;
                        break;
                    case '\f':
                        f = this.i;
                        break;
                    case '\r':
                        f = this.j;
                        break;
                    default:
                        next.startsWith("CUSTOM");
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (dzt0Var2 = hashMap.get(next)) != null) {
                    int i4 = this.a;
                    int i5 = this.f;
                    String str2 = this.g;
                    int i6 = this.l;
                    dzt0Var2.f.add(new gdy.b(this.h, this.i, this.j, f2, i4));
                    if (i6 != -1) {
                        dzt0Var2.e = i6;
                    }
                    dzt0Var2.c = i5;
                    dzt0Var2.d = str2;
                }
            }
        }
    }
}
