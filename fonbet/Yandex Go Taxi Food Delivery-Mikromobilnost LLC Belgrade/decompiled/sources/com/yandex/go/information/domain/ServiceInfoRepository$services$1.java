package com.yandex.go.information.domain;

import android.net.Uri;
import com.yandex.go.information.data.dto.LinkDto;
import com.yandex.go.information.data.dto.ServiceDto;
import com.yandex.go.information.data.dto.ServicesResponse;
import defpackage.cvu0;
import defpackage.muq0;
import defpackage.og21;
import defpackage.ouq0;
import defpackage.pux0;
import defpackage.tcc;
import defpackage.xvq0;
import defpackage.zls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ServiceInfoRepository$services$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Iterator it;
        Iterator it2;
        String str;
        ServicesResponse servicesResponse = (ServicesResponse) obj;
        List list = (List) obj2;
        j jVar = (j) this.receiver;
        jVar.getClass();
        List list2 = servicesResponse.c;
        int i = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            ServiceDto serviceDto = (ServiceDto) it3.next();
            String str2 = serviceDto.b;
            String str3 = serviceDto.a;
            String str4 = serviceDto.e;
            String str5 = serviceDto.d;
            String str6 = serviceDto.c;
            List list3 = serviceDto.f;
            ArrayList arrayList2 = new ArrayList(tcc.n(list3, i));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                LinkDto linkDto = (LinkDto) it4.next();
                String str7 = linkDto.a;
                String str8 = linkDto.b;
                Uri parse = Uri.parse(str8);
                String authority = parse.getAuthority();
                if (authority == null) {
                    authority = "";
                }
                List list4 = list;
                String str9 = authority;
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments == null) {
                    pathSegments = EmptyList.a;
                }
                if (og21.b(parse) || pathSegments.isEmpty()) {
                    it = it3;
                    it2 = it4;
                    str = str8;
                } else {
                    it = it3;
                    ((pux0) jVar.e).getClass();
                    List list5 = pux0.b;
                    it2 = it4;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it5 = list5.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                Iterator it6 = it5;
                                str = str8;
                                if (!cvu0.t((String) it5.next(), parse.getScheme(), true)) {
                                    it5 = it6;
                                    str8 = str;
                                } else if (str9.equalsIgnoreCase("legal") && jVar.d.b.a(parse) == null) {
                                    str8 = jVar.f.a(kotlin.collections.a.X(pathSegments, "/", null, null, null, 62));
                                }
                            }
                        }
                    }
                    arrayList2.add(new muq0(str7, str8));
                    list = list4;
                    it3 = it;
                    it4 = it2;
                }
                str8 = str;
                arrayList2.add(new muq0(str7, str8));
                list = list4;
                it3 = it;
                it4 = it2;
            }
            arrayList.add(new ouq0(str2, str3, str4, str5, str6, arrayList2));
            i = 10;
        }
        List list6 = list;
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((ouq0) it7.next()).a);
        }
        Set N0 = kotlin.collections.a.N0(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list6) {
            if (!N0.contains(((ouq0) obj4).a)) {
                arrayList4.add(obj4);
            }
        }
        return new xvq0(servicesResponse.b, kotlin.collections.a.m0(arrayList4, arrayList));
    }
}
