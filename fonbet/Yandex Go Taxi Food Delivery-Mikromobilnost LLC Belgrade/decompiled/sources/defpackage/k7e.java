package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class k7e {
    public final ConstraintLayout a;
    public int b = -1;
    public int c = -1;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public o8e f = null;

    public k7e(Context context, ConstraintLayout constraintLayout, int i) {
        i7e i7eVar = null;
        this.a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    int hashCode = name.hashCode();
                    if (hashCode != -1349929691) {
                        if (hashCode != 80204913) {
                            if (hashCode == 1901439077 && name.equals("Variant")) {
                                j7e j7eVar = new j7e(context, xml);
                                if (i7eVar != null) {
                                    i7eVar.a(j7eVar);
                                }
                            }
                        } else if (name.equals("State")) {
                            i7eVar = new i7e(context, xml);
                            this.d.put(i7eVar.a, i7eVar);
                        }
                    } else if (name.equals("ConstraintSet")) {
                        a(context, xml);
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        e eVar = new e();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.r(context, xmlResourceParser);
                this.e.put(identifier, eVar);
                return;
            }
        }
    }

    public final void b(float f, float f2, int i) {
        int i2 = this.b;
        ConstraintLayout constraintLayout = this.a;
        SparseArray sparseArray = this.d;
        if (i2 != i) {
            this.b = i;
            i7e i7eVar = (i7e) sparseArray.get(i);
            int b = i7eVar.b(f, f2);
            ArrayList arrayList = i7eVar.b;
            e eVar = b == -1 ? i7eVar.d : ((j7e) arrayList.get(b)).f;
            if (b != -1) {
                int i3 = ((j7e) arrayList.get(b)).e;
            }
            if (eVar == null) {
                return;
            }
            this.c = b;
            o8e o8eVar = this.f;
            if (o8eVar != null) {
                o8eVar.getClass();
            }
            eVar.b(constraintLayout);
            o8e o8eVar2 = this.f;
            if (o8eVar2 != null) {
                o8eVar2.getClass();
                return;
            }
            return;
        }
        i7e i7eVar2 = i == -1 ? (i7e) sparseArray.valueAt(0) : (i7e) sparseArray.get(i2);
        int i4 = this.c;
        if (i4 == -1 || !((j7e) i7eVar2.b.get(i4)).a(f, f2)) {
            int b2 = i7eVar2.b(f, f2);
            ArrayList arrayList2 = i7eVar2.b;
            if (this.c == b2) {
                return;
            }
            e eVar2 = b2 == -1 ? null : ((j7e) arrayList2.get(b2)).f;
            if (b2 != -1) {
                int i5 = ((j7e) arrayList2.get(b2)).e;
            }
            if (eVar2 == null) {
                return;
            }
            this.c = b2;
            o8e o8eVar3 = this.f;
            if (o8eVar3 != null) {
                o8eVar3.getClass();
            }
            eVar2.b(constraintLayout);
            o8e o8eVar4 = this.f;
            if (o8eVar4 != null) {
                o8eVar4.getClass();
            }
        }
    }
}
