package xsna;

import com.vk.api.generated.messages.dto.MessagesChatSettingsPhotoDto;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import xsna.s89;

/* compiled from: CallPreviewRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class w89 {
    public final vg20 a = new vg20();
    public final bpn0 b = new bpn0(new yh(this, 10));

    public static ImageList d(MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto) {
        ImageList imageList = new ImageList(null, 1, null);
        if (messagesChatSettingsPhotoDto != null) {
            String g = messagesChatSettingsPhotoDto.g();
            if (g != null) {
                m900<String, Image> m900Var = Image.g;
                imageList.zb(new Image(480, 480, g, true));
                return imageList;
            }
            String f = messagesChatSettingsPhotoDto.f();
            if (f != null) {
                imageList.zb(new Image(50, 50, f, false));
            }
            String d = messagesChatSettingsPhotoDto.d();
            if (d != null) {
                imageList.zb(new Image(100, 100, d, false));
            }
            String e = messagesChatSettingsPhotoDto.e();
            if (e != null) {
                imageList.zb(new Image(200, 200, e, false));
            }
        }
        return imageList;
    }

    public final io.reactivex.rxjava3.internal.operators.single.r a(String str, String str2) {
        return new io.reactivex.rxjava3.internal.operators.single.r(c(str), new d22(new m9(2, this, str2), 5));
    }

    public final io.reactivex.rxjava3.core.x<wt2> b(s89 s89Var, String str) {
        s89.a aVar = s89Var.f;
        if (aVar == null) {
            return io.reactivex.rxjava3.core.x.i(new IllegalArgumentException("anon data is empty!"));
        }
        io.reactivex.rxjava3.core.x xVar = (io.reactivex.rxjava3.core.x) this.b.getValue();
        t34 t34Var = new t34(new nn4(aVar, s89Var, str, 2), 3);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(xVar, t34Var);
    }

    public final io.reactivex.rxjava3.internal.operators.single.r c(String str) {
        io.reactivex.rxjava3.core.x xVar = (io.reactivex.rxjava3.core.x) this.b.getValue();
        u5 u5Var = new u5(new v53(2, str, this), 1);
        xVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.r(xVar, u5Var);
    }
}
