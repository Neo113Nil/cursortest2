package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.d74;
import defpackage.dac;
import defpackage.g0d;
import defpackage.gch;
import defpackage.gnh;
import defpackage.ich;
import defpackage.ig4;
import defpackage.j0d;
import defpackage.jgg0;
import defpackage.jx81;
import defpackage.seu;
import defpackage.teu;
import defpackage.ueu;
import defpackage.vwi;
import defpackage.yhl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(HexString.CHAR_SPACE, '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        g0d b = j0d.b(gnh.class);
        b.a(new vwi(2, 0, d74.class));
        b.g = new dac(11);
        arrayList.add(b.c());
        jgg0 jgg0Var = new jgg0(ig4.class, Executor.class);
        g0d g0dVar = new g0d(ich.class, new Class[]{teu.class, ueu.class});
        g0dVar.a(vwi.b(Context.class));
        g0dVar.a(vwi.b(a.class));
        g0dVar.a(new vwi(2, 0, seu.class));
        g0dVar.a(new vwi(1, 1, gnh.class));
        g0dVar.a(new vwi(jgg0Var, 1, 0));
        g0dVar.g = new gch(jgg0Var, 0);
        arrayList.add(g0dVar.c());
        arrayList.add(jx81.j("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(jx81.j("fire-core", "22.0.1"));
        arrayList.add(jx81.j("device-name", a(Build.PRODUCT)));
        arrayList.add(jx81.j("device-model", a(Build.DEVICE)));
        arrayList.add(jx81.j("device-brand", a(Build.BRAND)));
        arrayList.add(jx81.m("android-target-sdk", new yhl(20)));
        arrayList.add(jx81.m("android-min-sdk", new yhl(21)));
        arrayList.add(jx81.m("android-platform", new yhl(22)));
        arrayList.add(jx81.m("android-installer", new yhl(23)));
        try {
            str = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(jx81.j("kotlin", str));
        }
        return arrayList;
    }
}
