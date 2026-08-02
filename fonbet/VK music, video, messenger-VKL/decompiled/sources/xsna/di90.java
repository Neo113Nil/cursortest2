package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.pixels.model.PixelParam;

/* compiled from: ParamsPixel.java */
/* loaded from: classes8.dex */
public final class di90 extends zpa0 {
    public final ArrayList d;

    public di90(int i, ArrayList arrayList, List list) {
        super(list, i);
        this.d = arrayList;
    }

    @Override // xsna.zpa0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Pixel{urls=");
        sb.append(b());
        sb.append(", type=");
        sb.append(a());
        sb.append(", params=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            PixelParam pixelParam = (PixelParam) it.next();
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append("param:(");
            sb2.append(pixelParam.b);
            sb2.append(" : ");
            sb2.append(pixelParam.c);
            sb2.append(")");
        }
        sb2.append(']');
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }
}
