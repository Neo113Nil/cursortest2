package xsna;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.R$styleable;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* compiled from: ColorStateListInflaterCompat.java */
/* loaded from: classes.dex */
public final class i8g {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009f  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        Resources resources2;
        int color;
        float f;
        int attributeCount;
        int i;
        boolean z;
        int i2;
        TypedValue typedValue;
        ?? r0 = resources;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                int[] iArr3 = R$styleable.a;
                ?? obtainAttributes = theme == null ? r0.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i3, i3);
                int resourceId = obtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    ThreadLocal<TypedValue> threadLocal = a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, r4);
                    int i5 = typedValue.type;
                    if (i5 < 28 || i5 > 31) {
                        try {
                            color = a(r0, r0.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i3, -65281);
                        }
                        f = !obtainAttributes.hasValue(r4) ? obtainAttributes.getFloat(r4, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f2 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr4 = new int[attributeCount];
                        i = i3;
                        int i6 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i7 = i6 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr4[i6] = attributeNameResource;
                                i6 = i7;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr4, i6);
                        z = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= 100.0f;
                        if (f == 1.0f || z) {
                            int b = xwk.b((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                            if (z) {
                                td9 a2 = td9.a(color);
                                color = td9.e(a2.d(), a2.c(), f2);
                            }
                            color = (16777215 & color) | (b << 24);
                        }
                        i2 = i4 + 1;
                        if (i2 > iArr2.length) {
                            int[] iArr5 = new int[i4 <= 4 ? 8 : i4 * 2];
                            System.arraycopy(iArr2, 0, iArr5, 0, i4);
                            iArr2 = iArr5;
                        }
                        iArr2[i4] = color;
                        if (i2 > iArr.length) {
                            ?? r7 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i4 > 4 ? i4 * 2 : 8);
                            System.arraycopy(iArr, 0, r7, 0, i4);
                            iArr = r7;
                        }
                        iArr[i4] = trimStateSet;
                        iArr = iArr;
                        resources2 = resources;
                        i4 = i2;
                    }
                }
                color = obtainAttributes.getColor(i3, -65281);
                if (!obtainAttributes.hasValue(r4)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr42 = new int[attributeCount];
                i = i3;
                int i62 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr42, i62);
                if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (f == 1.0f) {
                }
                int b2 = xwk.b((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                if (z) {
                }
                color = (16777215 & color) | (b2 << 24);
                i2 = i4 + 1;
                if (i2 > iArr2.length) {
                }
                iArr2[i4] = color;
                if (i2 > iArr.length) {
                }
                iArr[i4] = trimStateSet2;
                iArr = iArr;
                resources2 = resources;
                i4 = i2;
            } else {
                resources2 = resources;
            }
            r4 = 1;
            i3 = 0;
            r0 = resources2;
        }
        int[] iArr6 = new int[i4];
        int[][] iArr7 = new int[i4][];
        System.arraycopy(iArr2, 0, iArr6, 0, i4);
        System.arraycopy(iArr, 0, iArr7, 0, i4);
        return new ColorStateList(iArr7, iArr6);
    }
}
