package xsna;

import androidx.room.RoomDatabase;

/* compiled from: UGCChatSettingsDao_Impl.kt */
/* loaded from: classes5.dex */
public final class awp0 implements zvp0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: UGCChatSettingsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            bwp0 bwp0Var = (bwp0) obj;
            qyg0Var.bindLong(1, bwp0Var.a);
            qyg0Var.bindLong(2, bwp0Var.b ? 1L : 0L);
            qyg0Var.bindLong(3, bwp0Var.c ? 1L : 0L);
            qyg0Var.bindLong(4, bwp0Var.d ? 1L : 0L);
            qyg0Var.bindLong(5, bwp0Var.e ? 1L : 0L);
            qyg0Var.bindLong(6, bwp0Var.f ? 1L : 0L);
            qyg0Var.bindLong(7, bwp0Var.g ? 1L : 0L);
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `ugc_chat_settings` (`chat_id`,`isHiddenInKb`,`isHiddenEverywhere`,`needToShowOnboarding`,`isEditBanned`,`canEdit`,`canHide`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public awp0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.zvp0
    public final bwp0 a(long j) {
        return (bwp0) u370.f(this.a, true, false, new yj2(j, 2));
    }

    @Override // xsna.zvp0
    public final void b(bwp0 bwp0Var) {
        u370.f(this.a, false, true, new ufg0(7, this, bwp0Var));
    }
}
