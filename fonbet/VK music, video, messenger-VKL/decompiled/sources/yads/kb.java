package yads;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.drm0;
import xsna.e43;
import xsna.fo8;

/* loaded from: classes10.dex */
public final class kb {
    public static List a(y90 y90Var) {
        ListBuilder e = e43.e();
        e.add(v90.a);
        e.add(new w90("Info"));
        if (y90Var.f() == c50.c && y90Var.a() != null) {
            String d = y90Var.d();
            e.add(new x90((d == null || drm0.N(d)) ? "ID" : y90Var.d(), y90Var.a()));
        }
        e.add(new x90("Type", y90Var.f().a()));
        List<d80> e2 = y90Var.e();
        if (e2 != null) {
            for (d80 d80Var : e2) {
                e.add(new x90(d80Var.a(), d80Var.b()));
            }
        }
        List b = y90Var.b();
        if (b != null && !b.isEmpty()) {
            e.add(v90.a);
            e.add(new w90("CPM floors"));
            String d2 = y90Var.d();
            String a = (d2 == null || drm0.N(d2)) ? "" : fo8.a(y90Var.d(), ": ");
            for (ha0 ha0Var : y90Var.b()) {
                e.add(new x90(fo8.a(a, ha0Var.b()), "cpm: " + ha0Var.a()));
            }
        }
        return e.g();
    }
}
