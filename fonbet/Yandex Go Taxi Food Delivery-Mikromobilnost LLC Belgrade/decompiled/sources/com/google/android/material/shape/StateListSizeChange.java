package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import defpackage.eng0;
import defpackage.z2i0;

/* loaded from: classes11.dex */
public class StateListSizeChange {
    public int a;
    public d b;
    public int[][] c = new int[10][];
    public d[] d = new d[10];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SizeChangeType {
        private static final /* synthetic */ SizeChangeType[] $VALUES;
        public static final SizeChangeType PERCENT;
        public static final SizeChangeType PIXELS;

        static {
            SizeChangeType sizeChangeType = new SizeChangeType("PERCENT", 0);
            PERCENT = sizeChangeType;
            SizeChangeType sizeChangeType2 = new SizeChangeType("PIXELS", 1);
            PIXELS = sizeChangeType2;
            $VALUES = new SizeChangeType[]{sizeChangeType, sizeChangeType2};
        }

        public static SizeChangeType valueOf(String str) {
            return (SizeChangeType) Enum.valueOf(SizeChangeType.class, str);
        }

        public static SizeChangeType[] values() {
            return (SizeChangeType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        e eVar;
        int attributeCount;
        int i;
        int i2;
        int[][] iArr;
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
                TypedArray obtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, z2i0.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, z2i0.StateListSizeChange, 0, 0);
                TypedValue peekValue = obtainAttributes.peekValue(z2i0.StateListSizeChange_widthChange);
                if (peekValue != null) {
                    int i3 = peekValue.type;
                    if (i3 == 5) {
                        eVar = new e(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(peekValue.data, obtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i3 == 6) {
                        eVar = new e(SizeChangeType.PERCENT, peekValue.getFraction(1.0f, 1.0f));
                    }
                    obtainAttributes.recycle();
                    attributeCount = attributeSet.getAttributeCount();
                    int[] iArr2 = new int[attributeCount];
                    int i4 = 0;
                    for (i = 0; i < attributeCount; i++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i);
                        if (attributeNameResource != eng0.widthChange) {
                            int i5 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr2[i4] = attributeNameResource;
                            i4 = i5;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr2, i4);
                    d dVar = new d();
                    dVar.a = eVar;
                    i2 = this.a;
                    if (i2 != 0 || trimStateSet.length == 0) {
                        this.b = dVar;
                    }
                    iArr = this.c;
                    if (i2 >= iArr.length) {
                        int i6 = i2 + 10;
                        int[][] iArr3 = new int[i6][];
                        System.arraycopy(iArr, 0, iArr3, 0, i2);
                        this.c = iArr3;
                        d[] dVarArr = new d[i6];
                        System.arraycopy(this.d, 0, dVarArr, 0, i2);
                        this.d = dVarArr;
                    }
                    int[][] iArr4 = this.c;
                    int i7 = this.a;
                    iArr4[i7] = trimStateSet;
                    this.d[i7] = dVar;
                    this.a = i7 + 1;
                }
                eVar = null;
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr22 = new int[attributeCount];
                int i42 = 0;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr22, i42);
                d dVar2 = new d();
                dVar2.a = eVar;
                i2 = this.a;
                if (i2 != 0) {
                }
                this.b = dVar2;
                iArr = this.c;
                if (i2 >= iArr.length) {
                }
                int[][] iArr42 = this.c;
                int i72 = this.a;
                iArr42[i72] = trimStateSet2;
                this.d[i72] = dVar2;
                this.a = i72 + 1;
            }
        }
    }
}
