package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class mge {
    public final lge a;

    public mge(lge lgeVar) {
        this.a = lgeVar;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    public final ClipData b() {
        return this.a.e();
    }

    public final int c() {
        return this.a.getFlags();
    }

    public final int d() {
        return this.a.getSource();
    }

    public final String toString() {
        return this.a.toString();
    }
}
