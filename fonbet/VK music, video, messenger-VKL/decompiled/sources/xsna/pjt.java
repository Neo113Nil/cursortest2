package xsna;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.facebook.drawee.R$styleable;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.f5h0;

/* compiled from: GenericDraweeHierarchyInflater.java */
/* loaded from: classes.dex */
public final class pjt {
    public static Drawable a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static RoundingParams b(ojt ojtVar) {
        if (ojtVar.q == null) {
            ojtVar.q = new RoundingParams();
        }
        return ojtVar.q;
    }

    public static f5h0.b c(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return f5h0.m.a;
            case 1:
                return f5h0.k.a;
            case 2:
                return f5h0.i.a;
            case 3:
                return f5h0.j.a;
            case 4:
                return f5h0.e.a;
            case 5:
                return f5h0.g.a;
            case 6:
                return f5h0.f.a;
            case 7:
                return f5h0.o.a;
            case 8:
                return f5h0.h.a;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ee, code lost:
    
        if (r13 != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01f0, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0210, code lost:
    
        if (r15 != false) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ojt d(Context context, AttributeSet attributeSet) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        Context context2 = context;
        if (lhs.d()) {
            lhs.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        ojt ojtVar = new ojt(context2.getResources());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.a);
            try {
                int i5 = 0;
                int i6 = 0;
                boolean z6 = true;
                boolean z7 = true;
                boolean z8 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                int i7 = 0;
                for (int indexCount = obtainStyledAttributes.getIndexCount(); i6 < indexCount; indexCount = i3) {
                    try {
                        int index = obtainStyledAttributes.getIndex(i6);
                        if (index == 0) {
                            ojtVar.l = c(obtainStyledAttributes, index);
                        } else if (index == 6) {
                            ojtVar.d = a(context2, obtainStyledAttributes, index);
                        } else {
                            i3 = indexCount;
                            if (index == 8) {
                                Drawable a = a(context2, obtainStyledAttributes, index);
                                if (a == null) {
                                    ojtVar.p = null;
                                } else {
                                    StateListDrawable stateListDrawable = new StateListDrawable();
                                    stateListDrawable.addState(new int[]{R.attr.state_pressed}, a);
                                    ojtVar.p = stateListDrawable;
                                }
                            } else if (index == 10) {
                                ojtVar.j = a(context2, obtainStyledAttributes, index);
                            } else if (index == 2) {
                                ojtVar.b = obtainStyledAttributes.getInt(index, 0);
                            } else if (index == 28) {
                                ojtVar.c = obtainStyledAttributes.getFloat(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            } else if (index == 7) {
                                ojtVar.e = c(obtainStyledAttributes, index);
                            } else if (index == 12) {
                                ojtVar.f = a(context2, obtainStyledAttributes, index);
                            } else if (index == 13) {
                                ojtVar.g = c(obtainStyledAttributes, index);
                            } else if (index == 3) {
                                ojtVar.h = a(context2, obtainStyledAttributes, index);
                            } else if (index == 4) {
                                ojtVar.i = c(obtainStyledAttributes, index);
                            } else if (index == 11) {
                                ojtVar.k = c(obtainStyledAttributes, index);
                            } else {
                                if (index == 9) {
                                    i5 = obtainStyledAttributes.getInteger(index, i5);
                                } else if (index == 1) {
                                    ojtVar.n = a(context2, obtainStyledAttributes, index);
                                } else if (index == 5) {
                                    Drawable a2 = a(context2, obtainStyledAttributes, index);
                                    if (a2 == null) {
                                        ojtVar.o = null;
                                    } else {
                                        ojtVar.o = Arrays.asList(a2);
                                    }
                                } else if (index == 14) {
                                    b(ojtVar).b = obtainStyledAttributes.getBoolean(index, false);
                                } else if (index == 24) {
                                    i7 = obtainStyledAttributes.getDimensionPixelSize(index, i7);
                                } else {
                                    i4 = i7;
                                    if (index == 20) {
                                        z6 = obtainStyledAttributes.getBoolean(index, z6);
                                    } else if (index == 21) {
                                        z8 = obtainStyledAttributes.getBoolean(index, z8);
                                    } else if (index == 16) {
                                        z12 = obtainStyledAttributes.getBoolean(index, z12);
                                    } else if (index == 17) {
                                        z10 = obtainStyledAttributes.getBoolean(index, z10);
                                    } else if (index == 22) {
                                        z7 = obtainStyledAttributes.getBoolean(index, z7);
                                    } else if (index == 19) {
                                        z9 = obtainStyledAttributes.getBoolean(index, z9);
                                    } else if (index == 18) {
                                        z13 = obtainStyledAttributes.getBoolean(index, z13);
                                    } else if (index == 15) {
                                        z11 = obtainStyledAttributes.getBoolean(index, z11);
                                    } else {
                                        if (index == 23) {
                                            RoundingParams b = b(ojtVar);
                                            b.d = obtainStyledAttributes.getColor(index, 0);
                                            b.a = RoundingParams.RoundingMethod.OVERLAY_COLOR;
                                        } else if (index == 27) {
                                            b(ojtVar).d(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                        } else if (index == 25) {
                                            b(ojtVar).f = obtainStyledAttributes.getColor(index, 0);
                                        } else if (index == 26) {
                                            b(ojtVar).g(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                                            i7 = i4;
                                            i6++;
                                            context2 = context;
                                        }
                                        i7 = i4;
                                        i6++;
                                        context2 = context;
                                    }
                                    i7 = i4;
                                }
                                i6++;
                                context2 = context;
                            }
                            i4 = i7;
                            i7 = i4;
                            i6++;
                            context2 = context;
                        }
                        i3 = indexCount;
                        i4 = i7;
                        i7 = i4;
                        i6++;
                        context2 = context;
                    } catch (Throwable th) {
                        th = th;
                        obtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                int i8 = i7;
                obtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z5 = z6 && z9;
                    z = z8 && z7;
                    z3 = z10 && z13;
                    if (z12) {
                    }
                    z4 = false;
                } else {
                    z5 = z6 && z7;
                    z = z8 && z9;
                    z3 = z10 && z11;
                    if (z12) {
                    }
                    z4 = false;
                }
                i = i8;
                i2 = i5;
                z2 = z5;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            i = 0;
            z = true;
            i2 = 0;
            z2 = true;
            z3 = true;
            z4 = true;
        }
        if (ojtVar.j != null && i2 > 0) {
            ojtVar.j = new hj5(ojtVar.j, i2);
        }
        if (i > 0) {
            b(ojtVar).e(z2 ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z3 ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z4 ? i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (lhs.d()) {
            lhs.b();
        }
        return ojtVar;
    }
}
