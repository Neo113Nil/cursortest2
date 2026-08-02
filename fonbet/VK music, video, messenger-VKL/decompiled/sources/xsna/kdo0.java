package xsna;

import android.view.textclassifier.TextClassification;

/* compiled from: TextContextMenuData.android.kt */
/* loaded from: classes11.dex */
public final class kdo0 extends uco0 {
    public final TextClassification b;
    public final int c;

    public kdo0(Object obj, TextClassification textClassification, int i) {
        super(obj);
        this.b = textClassification;
        this.c = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.a);
        sb.append(", textClassification=");
        sb.append(this.b);
        sb.append(", index=");
        return vu5.b(sb, this.c, ')');
    }
}
