package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class c7e {
    public boolean a = false;
    public String b;
    public ConstraintAttribute$AttributeType c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public c7e(c7e c7eVar, Object obj) {
        this.b = c7eVar.b;
        this.c = c7eVar.c;
        g(obj);
    }

    public static HashMap a(View view, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            c7e c7eVar = (c7e) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new c7e(c7eVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new c7e(c7eVar, cls.getMethod("getMap" + str, null).invoke(view, null)));
                }
            } catch (IllegalAccessException e) {
                StringBuilder x = unr0.x(" Custom Attribute \"", str, "\" not found on ");
                x.append(cls.getName());
                Log.e("TransitionLayout", x.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder x2 = unr0.x(" Custom Attribute \"", str, "\" not found on ");
                x2.append(cls.getName());
                Log.e("TransitionLayout", x2.toString(), e3);
            }
        }
        return hashMap2;
    }

    public static void e(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        ConstraintAttribute$AttributeType constraintAttribute$AttributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == z3i0.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == z3i0.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                constraintAttribute$AttributeType2 = ConstraintAttribute$AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == z3i0.CustomAttribute_customColorValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == z3i0.CustomAttribute_customColorDrawableValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == z3i0.CustomAttribute_customPixelDimension) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == z3i0.CustomAttribute_customDimension) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == z3i0.CustomAttribute_customFloatValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == z3i0.CustomAttribute_customIntegerValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == z3i0.CustomAttribute_customStringValue) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == z3i0.CustomAttribute_customReference) {
                    constraintAttribute$AttributeType = ConstraintAttribute$AttributeType.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                constraintAttribute$AttributeType2 = constraintAttribute$AttributeType;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            c7e c7eVar = new c7e();
            c7eVar.b = str;
            c7eVar.c = constraintAttribute$AttributeType2;
            c7eVar.a = z;
            c7eVar.g(obj);
            hashMap.put(str, c7eVar);
        }
        obtainStyledAttributes.recycle();
    }

    public static void f(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            c7e c7eVar = (c7e) hashMap.get(str);
            String o = !c7eVar.a ? g8e.o("set", str) : str;
            try {
                int ordinal = c7eVar.c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (ordinal) {
                    case 0:
                        cls.getMethod(o, cls3).invoke(view, Integer.valueOf(c7eVar.d));
                        break;
                    case 1:
                        cls.getMethod(o, cls2).invoke(view, Float.valueOf(c7eVar.e));
                        break;
                    case 2:
                        cls.getMethod(o, cls3).invoke(view, Integer.valueOf(c7eVar.h));
                        break;
                    case 3:
                        Method method = cls.getMethod(o, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c7eVar.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(o, CharSequence.class).invoke(view, c7eVar.f);
                        break;
                    case 5:
                        cls.getMethod(o, Boolean.TYPE).invoke(view, Boolean.valueOf(c7eVar.g));
                        break;
                    case 6:
                        cls.getMethod(o, cls2).invoke(view, Float.valueOf(c7eVar.e));
                        break;
                    case 7:
                        cls.getMethod(o, cls3).invoke(view, Integer.valueOf(c7eVar.d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder x = unr0.x(" Custom Attribute \"", str, "\" not found on ");
                x.append(cls.getName());
                Log.e("TransitionLayout", x.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + o, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder x2 = unr0.x(" Custom Attribute \"", str, "\" not found on ");
                x2.append(cls.getName());
                Log.e("TransitionLayout", x2.toString(), e3);
            }
        }
    }

    public final float b() {
        switch (this.c.ordinal()) {
            case 2:
            case 3:
                kbs.g("Color does not have a single color to interpolate");
                break;
            case 4:
                kbs.g("Cannot interpolate String");
                break;
            case 5:
                if (this.g) {
                }
                break;
        }
        return 0.0f;
    }

    public final void c(float[] fArr) {
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                break;
            case 1:
                fArr[0] = this.e;
                break;
            case 2:
            case 3:
                int i = (this.h >> 24) & 255;
                float pow = (float) Math.pow(((r9 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r9 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r9 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i / 255.0f;
                break;
            case 4:
                kbs.g("Color does not have a single color to interpolate");
                break;
            case 5:
                fArr[0] = this.g ? 1.0f : 0.0f;
                break;
            case 6:
                fArr[0] = this.e;
                break;
        }
    }

    public final int d() {
        int ordinal = this.c.ordinal();
        return (ordinal == 2 || ordinal == 3) ? 4 : 1;
    }

    public final void g(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                break;
            case 1:
                this.e = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                break;
            case 4:
                this.f = (String) obj;
                break;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }
}
