package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes11.dex */
public final /* synthetic */ class fvb1 implements ewb1 {
    public final /* synthetic */ Object a;

    public /* synthetic */ fvb1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ewb1
    public void zza() {
        XmlPullParser xmlPullParser;
        c491 c491Var = (c491) this.a;
        int i = 0;
        String str = null;
        String str2 = null;
        while (true) {
            xmlPullParser = c491Var.a;
            if (i >= xmlPullParser.getAttributeCount()) {
                break;
            }
            if ("module".equals(xmlPullParser.getAttributeName(i))) {
                str = xmlPullParser.getAttributeValue(i);
            }
            if (ErrorResponseData.JSON_ERROR_CODE.equals(xmlPullParser.getAttributeName(i))) {
                str2 = xmlPullParser.getAttributeValue(i);
            }
            i++;
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", xmlPullParser, null);
        }
        gr81 gr81Var = c491Var.b;
        Integer num = (Integer) l391.c.get(str2);
        if (num == null) {
            ny61.g(str2.concat(" is unknown error."));
            return;
        }
        Map map = (Map) gr81Var.c;
        if (map == null) {
            ny61.r("Property \"splitInstallErrorCodeByModule\" has not been set");
        } else {
            map.put(str, num);
            while (xmlPullParser.next() != 3) {
            }
        }
    }
}
