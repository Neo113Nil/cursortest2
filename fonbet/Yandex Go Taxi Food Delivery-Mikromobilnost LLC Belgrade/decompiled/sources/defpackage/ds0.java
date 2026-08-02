package defpackage;

import com.adjust.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ds0 implements ekb0 {
    public final jwh a;

    public /* synthetic */ ds0(jwh jwhVar) {
        this.a = jwhVar;
    }

    public void a(String str, String str2) {
        if (str != null) {
            d(str, "Tapped");
        } else {
            this.a.a.o("SharedOrderCard.Tapped", null, g8e.x("button_name", str2));
        }
    }

    @Override // defpackage.ekb0
    public void b(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("num_pictures", Integer.valueOf(i));
        linkedHashMap.put("button_name", "continue");
        this.a.a.o("DeliveryDetailsCard.PhotoComment.UploadError.Tapped", null, linkedHashMap);
    }

    public void c(String str, String str2, Map map) {
        if (str2 != null) {
            String p = g8e.p(str2, Extension.DOT_CHAR, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                linkedHashMap.put(Constants.REFERRER_API_META, map);
            }
            this.a.a.o(p, null, linkedHashMap);
        }
    }

    public void d(String str, String str2) {
        this.a.a.o(g8e.p(str, Extension.DOT_CHAR, str2), null, new LinkedHashMap());
    }

    @Override // defpackage.ekb0
    public void h(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("num_pictures", Integer.valueOf(i));
        this.a.a.o("DeliveryDetailsCard.PhotoComment.MaxPicturesNumNotif.Shown", null, linkedHashMap);
    }

    @Override // defpackage.ekb0
    public void i(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("num_pictures", Integer.valueOf(i));
        linkedHashMap.put("button_name", "retry");
        this.a.a.o("DeliveryDetailsCard.PhotoComment.UploadError.Tapped", null, linkedHashMap);
    }

    @Override // defpackage.ekb0
    public void w() {
        this.a.a.o("DeliveryDetailsCard.PhotoComment.MaxPicturesNumNotif.Shown", null, new LinkedHashMap());
    }
}
