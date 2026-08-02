package defpackage;

import androidx.room.RoomDatabase;
import com.yandex.messaging.ChatRequest;
import java.util.List;
import kotlin.a;

/* loaded from: classes15.dex */
public final class nsa0 extends ksa0 {
    public final RoomDatabase a;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y i;
    public final msa0 b = new msa0(this, 0);
    public final msa0 h = new msa0(this, 1);

    public nsa0(RoomDatabase roomDatabase) {
        this.c = a.a(new e4r(roomDatabase, 2));
        this.d = a.a(new e4r(roomDatabase, 3));
        this.e = a.a(new e4r(roomDatabase, 4));
        this.f = a.a(new e4r(roomDatabase, 5));
        this.g = a.a(new e4r(roomDatabase, 6));
        this.i = a.a(new e4r(roomDatabase, 7));
        this.a = roomDatabase;
    }

    public static void m(nsa0 nsa0Var, ChatRequest chatRequest, osa0 osa0Var) {
        super.g(chatRequest, osa0Var);
    }

    public static void n(nsa0 nsa0Var, ChatRequest chatRequest, String str) {
        super.k(chatRequest, str);
    }

    @Override // defpackage.ksa0
    public final osa0 a(String str) {
        return (osa0) androidx.room.util.a.b(this.a, true, false, new lsa0(str, this, 1));
    }

    @Override // defpackage.ksa0
    public final List b() {
        return (List) androidx.room.util.a.b(this.a, true, false, new u290(29, this));
    }

    @Override // defpackage.ksa0
    public final int c(String str) {
        return ((Number) androidx.room.util.a.b(this.a, true, false, new my30(str, 20))).intValue();
    }

    @Override // defpackage.ksa0
    public final List d(String str) {
        return (List) androidx.room.util.a.b(this.a, true, false, new lsa0(str, this, 0));
    }

    @Override // defpackage.ksa0
    public final long e(wra0 wra0Var) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new ww90(3, this, wra0Var))).longValue();
    }

    @Override // defpackage.ksa0
    public final long f(osa0 osa0Var) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new ww90(4, this, osa0Var))).longValue();
    }

    @Override // defpackage.ksa0
    public final void g(ChatRequest chatRequest, osa0 osa0Var) {
        androidx.room.util.a.b(this.a, false, true, new th40(13, this, chatRequest, osa0Var));
    }

    @Override // defpackage.ksa0
    public final int h(String str) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new my30(str, 21))).intValue();
    }

    @Override // defpackage.ksa0
    public final int i(String str) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new my30(str, 22))).intValue();
    }

    @Override // defpackage.ksa0
    public final int j(String str) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new my30(str, 18))).intValue();
    }

    @Override // defpackage.ksa0
    public final void k(ChatRequest chatRequest, String str) {
        androidx.room.util.a.b(this.a, false, true, new th40(this, chatRequest, str, 14));
    }

    @Override // defpackage.ksa0
    public final int l(String str) {
        return ((Number) androidx.room.util.a.b(this.a, false, true, new my30(str, 19))).intValue();
    }

    public final xsu0 o() {
        return (xsu0) this.d.getValue();
    }
}
