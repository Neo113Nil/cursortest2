package sg.bigo.ads.g;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.aj.f;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.controller.landing.d;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.p;

/* loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r2) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0042, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r4) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e a(@NonNull Context context, @Nullable Activity activity, @NonNull Ad ad, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable String str, @Nullable p pVar, @Nullable a.C2478a c2478a, boolean z, boolean z2) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = c2478a == null ? null : c2478a.a;
        if (bVar instanceof sg.bigo.ads.cp.a) {
            sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) bVar;
            str3 = d.a(str3, aVar.bw(), aVar.bx(), 6, 13);
        }
        if (!TextUtils.isEmpty(str3) && !str3.startsWith("http")) {
            arrayList.add(str3);
        }
        str3 = null;
        if (!TextUtils.isEmpty(str2)) {
            if (!str2.startsWith("http")) {
                arrayList.add(str2);
            } else if (TextUtils.isEmpty(str3)) {
            }
        }
        str2 = str3;
        String str4 = pVar == null ? null : pVar.m;
        if (!TextUtils.isEmpty(str4)) {
            if (!str4.startsWith("http")) {
                arrayList.add(str4);
            } else if (TextUtils.isEmpty(str2) && URLUtil.isNetworkUrl(str4)) {
                str2 = str4;
            }
        }
        b.InterfaceC2428b O = bVar.O();
        if (!TextUtils.isEmpty(O.b())) {
            arrayList.add(O.b());
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = O.a();
            if (bVar instanceof sg.bigo.ads.cp.a) {
                sg.bigo.ads.cp.a aVar2 = (sg.bigo.ads.cp.a) bVar;
                str2 = d.a(str2, aVar2.bw(), aVar2.bx(), 6, 13);
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        sg.bigo.ads.d.c cVar = ad instanceof sg.bigo.ads.d.c ? (sg.bigo.ads.d.c) ad : null;
        String str5 = str2;
        e a = d.a(context, activity, (List<String>) arrayList, str5, O.h(), bVar.a(2), O.d(), O.e(), (sg.bigo.ads.d.c<?, ?>) cVar, bVar.as(), d.a((sg.bigo.ads.d.c<?, ?>) cVar), z && !(cVar instanceof f), false, z2);
        a.f = str5;
        return a;
    }
}
