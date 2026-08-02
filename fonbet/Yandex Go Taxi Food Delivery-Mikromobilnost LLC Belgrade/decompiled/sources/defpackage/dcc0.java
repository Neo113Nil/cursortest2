package defpackage;

import androidx.compose.ui.semantics.f;

/* loaded from: classes13.dex */
public final /* synthetic */ class dcc0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ dcc0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        boolean z = false;
        zy11 zy11Var = zy11.a;
        String str = this.b;
        switch (i) {
            case 0:
                ((kl80) obj).o1(str);
                return zy11Var;
            case 1:
                ((kl80) obj).o1(str);
                return zy11Var;
            case 2:
                ((kl80) obj).o1(str);
                return zy11Var;
            case 3:
                mo11 mo11Var = (mo11) obj;
                mo11Var.getClass();
                mo11Var.b.r(new jl01(29, new qxx0(str, w2d0.f, null)));
                return zy11Var;
            case 4:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 5:
                ((abe0) obj).b0(str);
                return zy11Var;
            case 6:
                ((abe0) obj).b0(str);
                return zy11Var;
            case 7:
                x4c.g(b64.l("Failed to parse subtitleColor=", (String) obj, " in product ", str), null, null, null, 14);
                return zy11Var;
            case 8:
                x4c.g(g8e.o("Failed to parse subtitle shimmerAnimateColor in product ", str), null, null, null, 14);
                return zy11Var;
            case 9:
                ((prf0) obj).Y(str);
                return zy11Var;
            case 10:
                ((prf0) obj).Y(str);
                return zy11Var;
            case 11:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 12:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 13:
                T0 = ((oll0) obj).T0("SELECT row_id FROM remote_contacts WHERE remotes_phone_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q() && !T0.isNull(0)) {
                        r2 = Long.valueOf(T0.getLong(0));
                    }
                    return r2;
                } finally {
                }
            case 14:
                oll0 oll0Var = (oll0) obj;
                T0 = oll0Var.T0("DELETE FROM remote_contacts WHERE remotes_phone_id = ?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
            case 15:
                T0 = ((oll0) obj).T0("SELECT * FROM remote_contacts WHERE remotes_phone_id = ?");
                try {
                    T0.g1(1, str);
                    int r = eja1.r(T0, "row_id");
                    int r2 = eja1.r(T0, "remotes_user_id");
                    int r3 = eja1.r(T0, "remotes_phone_id");
                    int r4 = eja1.r(T0, "remotes_deleted");
                    int r5 = eja1.r(T0, "remotes_contact_name");
                    if (T0.q()) {
                        r2 = new cvi0(T0.Y1(r2), T0.Y1(r3), T0.isNull(r5) ? null : T0.Y1(r5), ((int) T0.getLong(r4)) != 0, T0.isNull(r) ? null : Long.valueOf(T0.getLong(r)));
                    }
                    return r2;
                } finally {
                }
            case 16:
                T0 = ((oll0) obj).T0("SELECT blacklisted FROM restrictions WHERE user_id = ?");
                try {
                    T0.g1(1, str);
                    if (T0.q()) {
                        z = ((int) T0.getLong(0)) != 0;
                    }
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 17:
                oll0 oll0Var2 = (oll0) obj;
                T0 = oll0Var2.T0("UPDATE revisions SET cache_owner = ?");
                try {
                    T0.g1(1, str);
                    T0.q();
                    int x2 = jx81.x(oll0Var2);
                    T0.close();
                    return Integer.valueOf(x2);
                } finally {
                }
            case 18:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 19:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 20:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, str);
                return zy11Var;
            case 21:
                f.l((mnq0) obj, str);
                return zy11Var;
            case 22:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.l(mnq0Var2, str);
                f.p(mnq0Var2, 0);
                return zy11Var;
            case 23:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.l(mnq0Var3, str);
                f.p(mnq0Var3, 0);
                return zy11Var;
            case 24:
                mnq0 mnq0Var4 = (mnq0) obj;
                f.p(mnq0Var4, 0);
                f.l(mnq0Var4, str);
                return zy11Var;
            case 25:
                return cvu0.v((String) obj, str, "", false);
            case 26:
                return cvu0.v((String) obj, "$SPEED_LIMIT$", str, false);
            case 27:
                ((enn0) obj).a.invoke(str);
                return zy11Var;
            case 28:
                ((dtw0) obj).a.invoke(str);
                return zy11Var;
            default:
                f.s((mnq0) obj, str);
                return zy11Var;
        }
    }
}
