package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.user.SocialButtonType;

/* compiled from: CommunityHelper.kt */
/* loaded from: classes11.dex */
public interface e4h {

    /* compiled from: CommunityHelper.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean a() {
            return this.c;
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }
    }

    /* compiled from: CommunityHelper.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final GroupLeaveMode f;
        public final boolean g;

        public b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, GroupLeaveMode groupLeaveMode, boolean z6) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = groupLeaveMode;
            this.g = z6;
        }

        public final boolean a() {
            return this.g;
        }

        public final GroupLeaveMode b() {
            return this.f;
        }

        public final boolean c() {
            return this.d;
        }

        public final boolean d() {
            return this.e;
        }

        public final boolean e() {
            return this.a;
        }

        public final boolean f() {
            return this.b;
        }

        public final boolean g() {
            return this.c;
        }
    }

    /* compiled from: CommunityHelper.kt */
    /* loaded from: classes6.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public c(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.d;
        }

        public final int c() {
            return this.a;
        }

        public final int d() {
            return this.c;
        }
    }

    static /* synthetic */ void l(e4h e4hVar, Context context, UserId userId, izs izsVar, Group group, int i) {
        if ((i & 8) != 0) {
            group = null;
        }
        e4hVar.m(context, userId, izsVar, group);
    }

    void a(Context context, Group group, myh myhVar, flu fluVar, defpackage.v vVar);

    void b(Context context, Group group, gzs<s3q0> gzsVar);

    void c(Context context, UserId userId, izs izsVar, izs izsVar2, Group group, SocialButtonType socialButtonType);

    void d(a aVar, zzs<? super Integer, ? super Integer, ? super Integer, ? super Integer, s3q0> zzsVar, izs<? super Integer, s3q0> izsVar);

    void e(Context context, c cVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2);

    void f(boolean z, iy7 iy7Var);

    void g(Context context, gzs gzsVar, boolean z);

    @ozl
    void h(int i, Context context, UserId userId);

    io.reactivex.rxjava3.internal.operators.maybe.c i(Context context, UserId userId);

    void j(Context context, UserId userId, izs izsVar, tbg tbgVar, Group group);

    void k(Context context, b bVar, izs izsVar, izs izsVar2);

    void m(Context context, UserId userId, izs izsVar, Group group);
}
