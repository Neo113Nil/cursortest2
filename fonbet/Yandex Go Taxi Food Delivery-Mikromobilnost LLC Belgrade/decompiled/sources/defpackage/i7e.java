package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.constraintlayout.widget.e;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class i7e {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final e d;

    public i7e(Context context, XmlResourceParser xmlResourceParser) {
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.State_android_id) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == z3i0.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    e eVar = new e();
                    this.d = eVar;
                    eVar.f(resourceId, context);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void a(j7e j7eVar) {
        this.b.add(j7eVar);
    }

    public final int b(float f, float f2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((j7e) arrayList.get(i)).a(f, f2)) {
                return i;
            }
            i++;
        }
    }
}
