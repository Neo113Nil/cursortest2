package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.google.android.material.shape.b;
import defpackage.eng0;
import defpackage.fhr0;
import defpackage.s4u0;
import defpackage.u4u0;
import defpackage.xre;
import defpackage.z2i0;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public final class c implements fhr0 {
    public final int a;
    public final b b;
    public final int[][] c;
    public final b[] d;
    public final s4u0 e;
    public final s4u0 f;
    public final s4u0 g;
    public final s4u0 h;

    public c(u4u0 u4u0Var) {
        this.a = u4u0Var.a;
        this.b = u4u0Var.b;
        this.c = u4u0Var.c;
        this.d = u4u0Var.d;
        this.e = u4u0Var.e;
        this.f = u4u0Var.f;
        this.g = u4u0Var.g;
        this.h = u4u0Var.h;
    }

    public static void g(u4u0 u4u0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, z2i0.MaterialShape) : theme.obtainStyledAttributes(attributeSet, z2i0.MaterialShape, 0, 0);
                b a = b.g(context, obtainAttributes.getResourceId(z2i0.MaterialShape_shapeAppearance, 0), obtainAttributes.getResourceId(z2i0.MaterialShape_shapeAppearanceOverlay, 0)).a();
                obtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != eng0.shapeAppearance && attributeNameResource != eng0.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                u4u0Var.a(StateSet.trimStateSet(iArr, i), a);
            }
        }
    }

    public static c h(Context context, TypedArray typedArray, int i) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        u4u0 u4u0Var = new u4u0();
        u4u0Var.c();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            u4u0Var.c();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                g(u4u0Var, context, xml, asAttributeSet, context.getTheme());
            }
            xml.close();
            return u4u0Var.b();
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.fhr0
    public final b a(float f) {
        return i().a(f);
    }

    @Override // defpackage.fhr0
    public final b b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i4 >= i2) {
                i4 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr2[i3], iArr3)) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i4 = i;
        }
        b[] bVarArr = this.d;
        s4u0 s4u0Var = this.h;
        s4u0 s4u0Var2 = this.g;
        s4u0 s4u0Var3 = this.f;
        s4u0 s4u0Var4 = this.e;
        if (s4u0Var4 == null && s4u0Var3 == null && s4u0Var2 == null && s4u0Var == null) {
            return bVarArr[i4];
        }
        b.a m = bVarArr[i4].m();
        if (s4u0Var4 != null) {
            m.e = s4u0Var4.c(iArr);
        }
        if (s4u0Var3 != null) {
            m.f = s4u0Var3.c(iArr);
        }
        if (s4u0Var2 != null) {
            m.h = s4u0Var2.c(iArr);
        }
        if (s4u0Var != null) {
            m.g = s4u0Var.c(iArr);
        }
        return m.a();
    }

    @Override // defpackage.fhr0
    public final b c() {
        return i();
    }

    @Override // defpackage.fhr0
    public final b[] d() {
        return this.d;
    }

    @Override // defpackage.fhr0
    public final b e(xre xreVar) {
        return i().e(xreVar);
    }

    @Override // defpackage.fhr0
    public final boolean f() {
        s4u0 s4u0Var;
        s4u0 s4u0Var2;
        s4u0 s4u0Var3;
        s4u0 s4u0Var4;
        return this.a > 1 || ((s4u0Var = this.e) != null && s4u0Var.a > 1) || (((s4u0Var2 = this.f) != null && s4u0Var2.a > 1) || (((s4u0Var3 = this.g) != null && s4u0Var3.a > 1) || ((s4u0Var4 = this.h) != null && s4u0Var4.a > 1)));
    }

    public final b i() {
        b bVar = this.b;
        s4u0 s4u0Var = this.h;
        s4u0 s4u0Var2 = this.g;
        s4u0 s4u0Var3 = this.f;
        s4u0 s4u0Var4 = this.e;
        if (s4u0Var4 == null && s4u0Var3 == null && s4u0Var2 == null && s4u0Var == null) {
            return bVar;
        }
        b.a m = bVar.m();
        if (s4u0Var4 != null) {
            m.e = s4u0Var4.b;
        }
        if (s4u0Var3 != null) {
            m.f = s4u0Var3.b;
        }
        if (s4u0Var2 != null) {
            m.h = s4u0Var2.b;
        }
        if (s4u0Var != null) {
            m.g = s4u0Var.b;
        }
        return m.a();
    }

    public final u4u0 j() {
        u4u0 u4u0Var = new u4u0();
        int i = this.a;
        u4u0Var.a = i;
        u4u0Var.b = this.b;
        int[][] iArr = this.c;
        int[][] iArr2 = new int[iArr.length][];
        u4u0Var.c = iArr2;
        b[] bVarArr = this.d;
        u4u0Var.d = new b[bVarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(bVarArr, 0, u4u0Var.d, 0, u4u0Var.a);
        u4u0Var.e = this.e;
        u4u0Var.f = this.f;
        u4u0Var.g = this.g;
        u4u0Var.h = this.h;
        return u4u0Var;
    }
}
