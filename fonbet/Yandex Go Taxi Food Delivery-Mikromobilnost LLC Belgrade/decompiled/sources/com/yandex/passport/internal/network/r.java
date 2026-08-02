package com.yandex.passport.internal.network;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.core.app.a1;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.sls;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes15.dex */
public final class r {
    public final Context a;
    public final com.yandex.passport.common.analytics.f b;
    public final com.yandex.passport.internal.helper.g c;
    public final com.yandex.passport.common.common.a d;
    public final Map e;
    public final Map f;

    public r(Context context, com.yandex.passport.common.analytics.f fVar, com.yandex.passport.internal.helper.g gVar, com.yandex.passport.common.common.a aVar) {
        this.a = context;
        this.b = fVar;
        this.c = gVar;
        this.d = aVar;
        final int i = 5;
        final int i2 = 6;
        final int i3 = 7;
        final int i4 = 0;
        this.e = kotlin.collections.b.i(new Pair("app_platform", new a1(3)), new Pair(CommonUrlParts.APP_ID, new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i;
                r rVar = this.b;
                switch (i5) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair(CommonUrlParts.APP_VERSION, new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i2;
                r rVar = this.b;
                switch (i5) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair("am_version_name", new a1(i)), new Pair(MetaDataField.DEVICE_ID_FIELD, new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i3;
                r rVar = this.b;
                switch (i5) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair(DivkitThemeChangeListener.THEME_VARIABLE_NAME, new a1(i2)), new Pair("lang", new a1(4)), new Pair("locale", new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i5 = i4;
                r rVar = this.b;
                switch (i5) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }));
        final int i5 = 1;
        final int i6 = 2;
        final int i7 = 3;
        final int i8 = 4;
        this.f = kotlin.collections.b.i(new Pair("app_platform", new a1(3)), new Pair(CommonUrlParts.APP_ID, new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i52 = i5;
                r rVar = this.b;
                switch (i52) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair(CommonUrlParts.APP_VERSION, new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i52 = i6;
                r rVar = this.b;
                switch (i52) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair("am_version_name", new a1(5)), new Pair(MetaDataField.DEVICE_ID_FIELD, new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i52 = i7;
                r rVar = this.b;
                switch (i52) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }), new Pair(DivkitThemeChangeListener.THEME_VARIABLE_NAME, new a1(6)), new Pair("lang", new a1(i3)), new Pair("locale", new sls(this) { // from class: com.yandex.passport.internal.network.q
            public final /* synthetic */ r b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i52 = i8;
                r rVar = this.b;
                switch (i52) {
                    case 0:
                        com.yandex.passport.internal.helper.g gVar2 = rVar.c;
                        Configuration configuration = rVar.a.getResources().getConfiguration();
                        gVar2.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration).getLanguage();
                    case 1:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 2:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    case 3:
                        String d = rVar.b.d();
                        return d == null ? "" : d;
                    case 4:
                        com.yandex.passport.internal.helper.g gVar3 = rVar.c;
                        Configuration configuration2 = rVar.a.getResources().getConfiguration();
                        gVar3.getClass();
                        return com.yandex.passport.internal.helper.g.a(configuration2).getLanguage();
                    case 5:
                        return ((com.yandex.passport.internal.common.e) rVar.d).a();
                    case 6:
                        return ((com.yandex.passport.internal.common.e) rVar.d).b();
                    default:
                        String d2 = rVar.b.d();
                        return d2 == null ? "" : d2;
                }
            }
        }));
    }

    public final Uri a(long j, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (!queryParameterNames.contains("uid")) {
            buildUpon.appendQueryParameter("uid", String.valueOf(j));
        }
        Map map = this.e;
        Set keySet = map.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!queryParameterNames.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str3 : arrayList) {
            sls slsVar = (sls) map.get(str3);
            if (slsVar != null && (str2 = (String) slsVar.invoke()) != null) {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        return buildUpon.build();
    }

    public final Uri b(long j, String str) {
        String str2;
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (!queryParameterNames.contains("uid")) {
            buildUpon.appendQueryParameter("uid", String.valueOf(j));
        }
        Map map = this.f;
        Set keySet = map.keySet();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (!queryParameterNames.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        for (String str3 : arrayList) {
            sls slsVar = (sls) map.get(str3);
            if (slsVar != null && (str2 = (String) slsVar.invoke()) != null) {
                buildUpon.appendQueryParameter(str3, str2);
            }
        }
        return buildUpon.build();
    }
}
