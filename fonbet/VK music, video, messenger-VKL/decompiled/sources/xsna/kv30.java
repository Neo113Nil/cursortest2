package xsna;

import android.database.Cursor;
import com.vk.im.engine.models.messages.MsgReaction;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MsgReactionsStorageManagerImpl.kt */
/* loaded from: classes2.dex */
public final class kv30 implements jv30 {
    public final tgl0 b;

    public kv30(tgl0 tgl0Var) {
        this.b = tgl0Var;
    }

    @Override // xsna.jv30
    public final bux0 D(int i, long j) {
        bux0 bux0Var = null;
        Cursor d = this.b.b().d("SELECT reactions, my_reaction_id FROM messages WHERE dialog_id = " + j + " AND cnv_msg_id = " + i, null);
        try {
            if (d.moveToFirst()) {
                Integer B = fl3.B(d, "my_reaction_id");
                List<? extends MsgReaction> b = MsgReaction.a.b(fl3.F(d, "reactions"));
                bux0 bux0Var2 = new bux0();
                bux0Var2.b = b;
                bux0Var2.c = B;
                bux0Var = bux0Var2;
            }
            return bux0Var;
        } finally {
            d.close();
        }
    }

    @Override // xsna.jv30
    public final void I(long j, int i, Integer num, ArrayList arrayList) {
        this.b.b().execSQL("UPDATE messages SET my_reaction_id = ?, reactions = ? WHERE dialog_id = ? AND cnv_msg_id = ?", new Object[]{num, MsgReaction.a.a(arrayList), String.valueOf(j), String.valueOf(i)});
    }

    @Override // xsna.jv30
    public final void c0(int i, long j, List list) {
        this.b.b().execSQL("UPDATE messages SET reactions = ? WHERE dialog_id = ? AND cnv_msg_id = ?", new String[]{MsgReaction.a.a(list), String.valueOf(j), String.valueOf(i)});
    }

    @Override // xsna.jv30
    public final void d(long j, int i, Integer num) {
        this.b.b().execSQL("UPDATE messages SET my_reaction_id = ? WHERE dialog_id = ? AND cnv_msg_id = ?", new Object[]{num, String.valueOf(j), String.valueOf(i)});
    }
}
