package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.LocalizedData;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class mi60 {
    public final ki60 a;
    public final ttq0 b;
    public final o1b0 c;
    public final k020 d;
    public final iv21 e;
    public final z5z f;
    public final meb g;
    public final l6b h;

    public mi60(ki60 ki60Var, ttq0 ttq0Var, o1b0 o1b0Var, at2 at2Var, k020 k020Var, iv21 iv21Var, z5z z5zVar) {
        this.a = ki60Var;
        this.b = ttq0Var;
        this.c = o1b0Var;
        this.d = k020Var;
        this.e = iv21Var;
        this.f = z5zVar;
        this.g = at2Var.Y();
        this.h = at2Var.x();
    }

    public static ArrayList a(u1l u1lVar) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object obj : u1lVar) {
            if (z) {
                arrayList.add(obj);
            } else if (!evu0.J(((ii60) obj).e)) {
                arrayList.add(obj);
                z = true;
            }
        }
        return arrayList;
    }

    public final ii60 b(ii60 ii60Var) {
        String displayName;
        LocalizedData a = this.f.a(ii60Var.e);
        return (a == null || (displayName = a.getDisplayName()) == null) ? ii60Var : ii60.a(ii60Var, null, displayName, 8159);
    }
}
