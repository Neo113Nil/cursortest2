package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLeaveMode;
import com.vk.dto.user.SocialButtonType;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.e4h;
import xsna.h7u0;
import xsna.u6h;

/* compiled from: CommunityHelperImpl.kt */
/* loaded from: classes11.dex */
public final class j4h implements e4h {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommunityHelperImpl.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CLOSED_EVENT;
        public static final a CLOSED_GROUP;
        public static final a PRIVATE_GROUP;

        static {
            a aVar = new a("PRIVATE_GROUP", 0);
            PRIVATE_GROUP = aVar;
            a aVar2 = new a("CLOSED_EVENT", 1);
            CLOSED_EVENT = aVar2;
            a aVar3 = new a("CLOSED_GROUP", 2);
            CLOSED_GROUP = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: CommunityHelperImpl.kt */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PRIVATE_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CLOSED_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.CLOSED_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void n(final j4h j4hVar, final Context context, e4h.b bVar, izs<? super AdminLeaveAction, s3q0> izsVar, final gzs<s3q0> gzsVar, izs<? super Integer, s3q0> izsVar2, AdminLeaveAction adminLeaveAction) {
        j4hVar.getClass();
        boolean f = bVar.f();
        boolean c = bVar.c();
        boolean g = bVar.g();
        boolean e = bVar.e();
        izs<? super Integer, s3q0> izsVar3 = null;
        final tx txVar = izsVar != null ? new tx(8, (Object) adminLeaveAction, (izs) izsVar) : null;
        if (izsVar2 != null) {
            if (adminLeaveAction != null) {
                izsVar2 = new n6f(txVar, 3);
            }
            izsVar3 = izsVar2;
        }
        if (!f && !c) {
            j4hVar.d(new e4h.a(e, g, bVar.b() != null), new zzs() { // from class: xsna.h4h
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j4h.this.e(context, new e4h.c(((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue()), txVar, gzsVar);
                    return s3q0.a;
                }
            }, izsVar3);
            return;
        }
        int i = e ? R.string.leave_event : R.string.leave_group;
        if (izsVar3 != null) {
            izsVar3.invoke(Integer.valueOf(i));
        }
    }

    @Override // xsna.e4h
    public final void a(Context context, Group group, myh myhVar, flu fluVar, defpackage.v vVar) {
        b(context, group, new rk(this, group, myhVar, fluVar, vVar));
    }

    @Override // xsna.e4h
    public final void b(Context context, Group group, gzs<s3q0> gzsVar) {
        if (group.n() || group.C()) {
            g(context, gzsVar, group.n());
        } else {
            gzsVar.invoke();
        }
    }

    @Override // xsna.e4h
    public final void c(Context context, UserId userId, izs izsVar, izs izsVar2, Group group, SocialButtonType socialButtonType) {
        boolean b2 = fkq0.b(userId);
        int i = R.string.profile_unsubscribe;
        if (!b2) {
            if (socialButtonType == SocialButtonType.ADD) {
                i = R.string.profile_friend_cancel;
            }
            izsVar2.invoke(Integer.valueOf(i));
            return;
        }
        t6g0 t6g0Var = t6g0.b;
        Group C0 = t6g0.b().C0(fkq0.e(userId));
        if (C0 != null) {
            group = C0;
        }
        if (group == null) {
            izsVar2.invoke(Integer.valueOf(R.string.profile_unsubscribe));
            return;
        }
        boolean z = group.p == 1;
        int i2 = group.m;
        k(context, new e4h.b(z, i2 == 0, i2 == 2, group.C == 4, group.i, group.j0, group.y0.booleanValue()), izsVar, izsVar2);
    }

    @Override // xsna.e4h
    public final void d(e4h.a aVar, zzs<? super Integer, ? super Integer, ? super Integer, ? super Integer, s3q0> zzsVar, izs<? super Integer, s3q0> izsVar) {
        int i;
        int i2 = aVar.b() ? R.string.leave_event : R.string.leave_group;
        a aVar2 = (!aVar.c() || aVar.b()) ? aVar.b() ? a.CLOSED_EVENT : a.CLOSED_GROUP : a.PRIVATE_GROUP;
        if (aVar.a()) {
            if (izsVar != null) {
                izsVar.invoke(Integer.valueOf(i2));
                return;
            }
            return;
        }
        int i3 = b.$EnumSwitchMapping$0[aVar2.ordinal()];
        int i4 = R.string.leave_group_no;
        int i5 = R.string.leave_group_yes;
        if (i3 == 1) {
            i = R.string.leave_private_group_confirm;
        } else if (i3 == 2) {
            i = R.string.leave_closed_event_confirm;
            i5 = R.string.leave_event_yes;
            i4 = R.string.leave_event_no;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.leave_closed_group_confirm;
        }
        zzsVar.invoke(Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(i5), Integer.valueOf(i4));
    }

    @Override // xsna.e4h
    public final void e(Context context, e4h.c cVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(cVar.c());
        aVar.U(cVar.a());
        aVar.c0(cVar.d(), new f4h(gzsVar, 0));
        aVar.h(gzsVar2 != null ? new k9a(new xye(1, gzsVar2), 1) : null);
        aVar.setNegativeButton(cVar.b(), gzsVar2 != null ? new kp3(new g4h(gzsVar2), 1) : null);
        aVar.m();
    }

    @Override // xsna.e4h
    public final void f(boolean z, iy7 iy7Var) {
        iy7Var.invoke(Integer.valueOf(z ? R.string.leave_event : R.string.leave_group));
    }

    @Override // xsna.e4h
    public final void g(Context context, gzs gzsVar, boolean z) {
        int i = z ? R.string.leave_invited_closed_group_confirm_text : R.string.leave_invited_private_group_confirm_text;
        h7u0.a aVar = new h7u0.a(context);
        aVar.g0(R.string.leave_invited_group_title);
        aVar.U(i);
        aVar.c0(R.string.leave_invited_group_yes, new w56(1, gzsVar));
        aVar.W(R.string.leave_invited_group_no, null);
        aVar.m();
    }

    @Override // xsna.e4h
    @ozl
    public final void h(int i, Context context, UserId userId) {
        n2i0.a(context, hf8.a, new Intent("com.vkontakte.android.ACTION_GROUP_STATUS_CHANGED").putExtra("id", userId).putExtra("status", i));
    }

    @Override // xsna.e4h
    public final io.reactivex.rxjava3.internal.operators.maybe.c i(Context context, UserId userId) {
        return io.reactivex.rxjava3.core.k.e(new za6(context, userId));
    }

    @Override // xsna.e4h
    public final void j(Context context, UserId userId, izs izsVar, tbg tbgVar, Group group) {
        c(context, userId, izsVar, new ppd(izsVar, 1), group, null);
    }

    @Override // xsna.e4h
    public final void k(Context context, e4h.b bVar, izs izsVar, izs izsVar2) {
        boolean f = bVar.f();
        boolean d = bVar.d();
        GroupLeaveMode b2 = bVar.b();
        if (d && b2 == GroupLeaveMode.OPTIONS_SELECTOR) {
            new u6h.a(context, null, null, bVar.a(), new nvg(new k4h(this, context, bVar, izsVar, izsVar2), 2), 78).I0(null);
        } else if (d && !f && b2 == GroupLeaveMode.NO_MODE_ALERT) {
            lzy.a(context, new l4h(this, context, bVar, izsVar, izsVar2), bVar.a()).m();
        } else {
            n(this, context, bVar, izsVar, null, izsVar2, null);
        }
    }

    @Override // xsna.e4h
    public final void m(Context context, UserId userId, izs izsVar, Group group) {
        j(context, userId, izsVar, null, group);
    }
}
