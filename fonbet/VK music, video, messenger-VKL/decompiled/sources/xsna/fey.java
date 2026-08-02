package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: KeyTrigger.java */
/* loaded from: classes11.dex */
public final class fey extends zcy {
    public float q;
    public String e = null;
    public int f = -1;
    public String g = null;
    public String h = null;
    public int i = -1;
    public int j = -1;
    public View k = null;
    public float l = 0.1f;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public float p = Float.NaN;
    public boolean r = false;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public RectF v = new RectF();
    public RectF w = new RectF();
    public HashMap<String, Method> x = new HashMap<>();

    /* compiled from: KeyTrigger.java */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 8);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 1);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(9, 5);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(2, 10);
            sparseIntArray.append(8, 11);
            sparseIntArray.append(10, 12);
            sparseIntArray.append(11, 13);
            sparseIntArray.append(12, 14);
        }
    }

    public fey() {
        this.d = new HashMap<>();
    }

    public static void k(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // xsna.zcy
    public final void a(HashMap<String, w0u0> hashMap) {
        throw null;
    }

    @Override // xsna.zcy
    /* renamed from: b */
    public final zcy clone() {
        fey feyVar = new fey();
        super.c(this);
        feyVar.e = this.e;
        feyVar.f = this.f;
        feyVar.g = this.g;
        feyVar.h = this.h;
        feyVar.i = this.i;
        feyVar.j = this.j;
        feyVar.k = this.k;
        feyVar.l = this.l;
        feyVar.m = this.m;
        feyVar.n = this.n;
        feyVar.o = this.o;
        feyVar.p = this.p;
        feyVar.q = this.q;
        feyVar.r = this.r;
        feyVar.v = this.v;
        feyVar.w = this.w;
        feyVar.x = this.x;
        return feyVar;
    }

    @Override // xsna.zcy
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.l);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.g = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.h = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.e = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 6:
                    this.i = obtainStyledAttributes.getResourceId(index, this.i);
                    break;
                case 7:
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
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.p = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                    break;
                case 10:
                    this.r = obtainStyledAttributes.getBoolean(index, this.r);
                    break;
                case 11:
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 12:
                    this.u = obtainStyledAttributes.getResourceId(index, this.u);
                    break;
                case 13:
                    this.s = obtainStyledAttributes.getResourceId(index, this.s);
                    break;
                case 14:
                    this.t = obtainStyledAttributes.getResourceId(index, this.t);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.j != -1) {
            if (this.k == null) {
                this.k = ((ViewGroup) view.getParent()).findViewById(this.j);
            }
            k(this.v, this.k, this.r);
            k(this.w, view, this.r);
            if (this.v.intersect(this.w)) {
                if (this.m) {
                    this.m = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.o) {
                    this.o = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.n = true;
            } else {
                if (this.m) {
                    z = false;
                } else {
                    this.m = true;
                    z = true;
                }
                if (this.n) {
                    this.n = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.o = true;
                boolean z7 = z3;
                z4 = false;
                z6 = z7;
            }
            z5 = z4;
        } else {
            if (this.m) {
                float f2 = this.p;
                if ((this.q - f2) * (f - f2) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.m = false;
                    z = true;
                    if (!this.n) {
                        float f3 = this.p;
                        float f4 = f - f3;
                        if ((this.q - f3) * f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.n = false;
                            z2 = true;
                            if (this.o) {
                                float f5 = this.p;
                                float f6 = f - f5;
                                if ((this.q - f5) * f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f6 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    this.o = false;
                                    z6 = z2;
                                }
                            } else if (Math.abs(f - this.p) > this.l) {
                                this.o = true;
                            }
                            z5 = false;
                            z6 = z2;
                        }
                    } else if (Math.abs(f - this.p) > this.l) {
                        this.n = true;
                    }
                    z2 = false;
                    if (this.o) {
                    }
                    z5 = false;
                    z6 = z2;
                }
            } else if (Math.abs(f - this.p) > this.l) {
                this.m = true;
            }
            z = false;
            if (!this.n) {
            }
            z2 = false;
            if (this.o) {
            }
            z5 = false;
            z6 = z2;
        }
        this.q = f;
        if (z6 || z || z5) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.i iVar = motionLayout.M;
            CopyOnWriteArrayList<MotionLayout.i> copyOnWriteArrayList = motionLayout.g0;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.i> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
        }
        View findViewById = this.f == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f);
        if (z6) {
            String str = this.g;
            if (str != null) {
                j(findViewById, str);
            }
            if (this.s != -1) {
                ((MotionLayout) view.getParent()).n5(this.s, findViewById);
            }
        }
        if (z5) {
            String str2 = this.h;
            if (str2 != null) {
                j(findViewById, str2);
            }
            if (this.t != -1) {
                ((MotionLayout) view.getParent()).n5(this.t, findViewById);
            }
        }
        if (z) {
            String str3 = this.e;
            if (str3 != null) {
                j(findViewById, str3);
            }
            if (this.u != -1) {
                ((MotionLayout) view.getParent()).n5(this.u, findViewById);
            }
        }
    }

    public final void j(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.x.containsKey(str)) {
                method = this.x.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.x.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.x.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + n2l.d(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.e + "\"on class " + view.getClass().getSimpleName() + " " + n2l.d(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.d.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.d.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    String str3 = constraintAttribute.b;
                    String b = !constraintAttribute.a ? go9.b("set", str3) : str3;
                    try {
                        int i = ConstraintAttribute.a.a[constraintAttribute.c.ordinal()];
                        Class cls2 = Integer.TYPE;
                        Class cls3 = Float.TYPE;
                        switch (i) {
                            case 1:
                            case 6:
                                cls.getMethod(b, cls2).invoke(view, Integer.valueOf(constraintAttribute.d));
                                break;
                            case 2:
                                cls.getMethod(b, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.g));
                                break;
                            case 3:
                                cls.getMethod(b, CharSequence.class).invoke(view, constraintAttribute.f);
                                break;
                            case 4:
                                cls.getMethod(b, cls2).invoke(view, Integer.valueOf(constraintAttribute.h));
                                break;
                            case 5:
                                Method method2 = cls.getMethod(b, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.h);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 7:
                                cls.getMethod(b, cls3).invoke(view, Float.valueOf(constraintAttribute.e));
                                break;
                            case 8:
                                cls.getMethod(b, cls3).invoke(view, Float.valueOf(constraintAttribute.e));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder a2 = t33.a(" Custom Attribute \"", str3, "\" not found on ");
                        a2.append(cls.getName());
                        Log.e("TransitionLayout", a2.toString());
                        e.printStackTrace();
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", e2.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + b);
                    } catch (InvocationTargetException e3) {
                        StringBuilder a3 = t33.a(" Custom Attribute \"", str3, "\" not found on ");
                        a3.append(cls.getName());
                        Log.e("TransitionLayout", a3.toString());
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // xsna.zcy
    public final void d(HashSet<String> hashSet) {
    }
}
