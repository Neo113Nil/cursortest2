package defpackage;

/* loaded from: classes15.dex */
public final class k5e {
    public static final k5e c = new k5e(3, "CONNECTED");
    public static final k5e d = new k5e(2, "CONNECTING");
    public static final k5e e = new k5e(6, "HISTORY_ERROR");
    public static final k5e f = new k5e(0, "INIT");
    public static final k5e g = new k5e(7, "NOT_CONNECTED");
    public static final k5e h = new k5e(1, "NO_NETWORK");
    public static final k5e i = new k5e(9, "SYNCED");
    public static final k5e j = new k5e(5, "BOOTSTRAP_ERROR");
    public static final k5e k = new k5e(4, "UPDATING");
    public static final k5e l = new k5e(8, "WHOAMI_ERROR");
    public final int a;
    public final String b;

    public k5e(int i2, String str) {
        this.a = i2;
        this.b = str;
    }

    public final boolean a() {
        if (equals(j) || equals(e) || equals(l) || equals(h) || equals(g)) {
            return true;
        }
        if (!equals(f) && !equals(d) && !equals(k) && !equals(c) && !equals(i)) {
            w511.b();
        }
        return false;
    }

    public final boolean b() {
        if (equals(d) || equals(k) || equals(f)) {
            return true;
        }
        if (!equals(c) && !equals(i) && !equals(h) && !equals(j) && !equals(e) && !equals(l) && !equals(g)) {
            w511.b();
        }
        return false;
    }

    public final Integer c() {
        if (equals(c) || equals(i) || equals(f)) {
            return null;
        }
        if (equals(d)) {
            return Integer.valueOf(oyh0.chat_list_connection_status_connecting);
        }
        if (equals(k)) {
            return Integer.valueOf(oyh0.chat_list_connection_status_updating);
        }
        if (equals(h)) {
            return Integer.valueOf(oyh0.connection_status_no_network);
        }
        if (equals(g)) {
            return Integer.valueOf(oyh0.messenger_connection_status_disconnected);
        }
        if (equals(j) || equals(e) || equals(l)) {
            return Integer.valueOf(oyh0.messenger_connection_status_sync_failed);
        }
        w511.b();
        return null;
    }
}
