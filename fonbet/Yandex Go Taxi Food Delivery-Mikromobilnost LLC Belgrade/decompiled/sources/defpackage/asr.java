package defpackage;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.platform.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class asr {
    public final ArrayList a = new ArrayList();

    public asr(Context context, String[] strArr) {
        psr psrVar = jsr.d().a;
        if (psrVar.a) {
            return;
        }
        psrVar.d(context.getApplicationContext());
        psrVar.b(context.getApplicationContext(), strArr);
    }

    public final FlutterEngine a(zrr zrrVar) {
        FlutterEngine flutterEngine;
        Context context = (Context) zrrVar.x;
        tfg tfgVar = (tfg) zrrVar.y;
        String str = (String) zrrVar.b;
        List<String> list = (List) zrrVar.a;
        d dVar = new d();
        boolean z = zrrVar.c;
        boolean z2 = zrrVar.w;
        if (tfgVar == null) {
            psr psrVar = jsr.d().a;
            if (!psrVar.a) {
                ny61.f("DartEntrypoints can only be created once a FlutterEngine is created.");
                return null;
            }
            tfgVar = new tfg((String) psrVar.d.c, "main");
        }
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            flutterEngine = new FlutterEngine(context, null, dVar, null, z, z2);
            if (str != null) {
                flutterEngine.j.a.a("setInitialRoute", str, null);
            }
            flutterEngine.c.a(tfgVar, list);
        } else {
            FlutterEngine flutterEngine2 = (FlutterEngine) arrayList.get(0);
            if (!flutterEngine2.a.isAttached()) {
                ny61.r("Spawn can only be called on a fully constructed FlutterEngine");
                return null;
            }
            flutterEngine = new FlutterEngine(context, flutterEngine2.a.spawn(tfgVar.c, tfgVar.b, str, list, FlutterEngine.y), dVar, null, z, z2);
        }
        arrayList.add(flutterEngine);
        flutterEngine.v.add(new yrr(this, flutterEngine));
        return flutterEngine;
    }
}
