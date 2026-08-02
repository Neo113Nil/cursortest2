package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import yads.k43;

/* loaded from: classes7.dex */
public final class b371 implements zc81 {
    public final xf81 a;
    public final lr71 b;

    public b371() {
        xf81 xf81Var = new xf81();
        k43[] values = k43.values();
        lr71 lr71Var = new lr71(new HashSet(scc.g(Arrays.copyOf(values, values.length))));
        this.a = xf81Var;
        this.b = lr71Var;
    }

    public final tz61 a(XmlPullParser xmlPullParser) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, DatabaseHelper.OttTrackingTable.COLUMN_EVENT);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String a = xf81.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || a.length() <= 0) {
            return null;
        }
        return new tz61(attributeValue, a, attributeValue2 != null ? this.b.c(attributeValue2) : null);
    }

    @Override // defpackage.zc81
    public final /* bridge */ /* synthetic */ Object f(XmlPullParser xmlPullParser, zy2 zy2Var) {
        return a(xmlPullParser);
    }
}
