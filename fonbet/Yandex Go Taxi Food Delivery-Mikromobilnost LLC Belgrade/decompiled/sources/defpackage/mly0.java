package defpackage;

import android.view.textclassifier.TextClassification;

/* loaded from: classes10.dex */
public final class mly0 extends yky0 {
    public final TextClassification b;
    public final int c;

    public mly0(Object obj, TextClassification textClassification, int i) {
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
        return oyr.s(sb, this.c, ')');
    }
}
