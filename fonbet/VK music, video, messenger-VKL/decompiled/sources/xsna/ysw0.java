package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.utils.dto.UtilsResolveScreenNameWithDataPlatformDto;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.xsw0;

/* compiled from: VoipMiniAppRouterImpl.kt */
/* loaded from: classes7.dex */
public final class ysw0 implements xsw0 {
    @Override // xsna.xsw0
    public final io.reactivex.rxjava3.core.x<oz50> a(xsw0.a aVar) {
        Context context = aVar.a.get();
        if (context == null) {
            return sn.b("Context is dead");
        }
        int i = aVar.b;
        String str = aVar.c;
        Integer num = aVar.d;
        return hf3.a(new np20(i, context, null, new iq20(null, NotificationCompat.CATEGORY_CALL, null, null, null, null, null, null, 253), new aq20(null, null, null, null, null, num == null ? null : num.intValue() == 1 ? 2 : num.intValue() == 0 ? 1 : 0, str, false, null, false, 3903), 4));
    }

    @Override // xsna.xsw0
    public final io.reactivex.rxjava3.core.x<oz50> b(xsw0.b bVar) {
        Context context = bVar.a.get();
        if (context == null) {
            return sn.b("Context is dead");
        }
        Uri parse = Uri.parse(bVar.b);
        if (parse.getPathSegments().isEmpty()) {
            return io.reactivex.rxjava3.core.x.i(new IllegalStateException(i6n0.a(parse, "Incorrect URI: ")));
        }
        po40 po40Var = new po40();
        String str = parse.getPathSegments().get(0);
        UtilsResolveScreenNameWithDataPlatformDto utilsResolveScreenNameWithDataPlatformDto = UtilsResolveScreenNameWithDataPlatformDto.ANDROID;
        String str2 = bVar.b;
        Parcelable.Creator<WebApiApplication> creator = WebApiApplication.CREATOR;
        ArrayList arrayList = new ArrayList(WebApiApplication.a.a());
        arrayList.add(AppFields.IS_IN_CATALOG);
        s3q0 s3q0Var = s3q0.a;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppFields) it.next()).h());
        }
        return new io.reactivex.rxjava3.internal.operators.single.r(rsg0.W(yfb.x(po40.s(po40Var, str, utilsResolveScreenNameWithDataPlatformDto, NotificationCompat.CATEGORY_CALL, null, str2, arrayList2, 24)), 7), new hl30(new g86(this, bVar, context), 25));
    }
}
