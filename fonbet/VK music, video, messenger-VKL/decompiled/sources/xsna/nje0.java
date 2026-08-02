package xsna;

import androidx.room.RoomDatabase;
import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import xsna.dje0;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class nje0 extends tpp<dje0> {
    public final /* synthetic */ kje0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nje0(kje0 kje0Var, RoomDatabase roomDatabase) {
        super(roomDatabase);
        this.d = kje0Var;
    }

    @Override // xsna.s140
    public final String c() {
        return "UPDATE OR ABORT `push_message` SET `id` = ?,`token_package_id` = ?,`syn` = ?,`collapse_key` = ?,`priority` = ?,`ttl` = ?,`actual_ttl` = ?,`expiring_time` = ?,`from` = ?,`data` = ?,`received_by_push_server_at` = ?,`delivery_attempts` = ?,`received_by` = ?,`title` = ?,`body` = ?,`image` = ?,`icon` = ?,`color` = ?,`channel_id` = ?,`click_action` = ?,`click_action_type` = ? WHERE `id` = ?";
    }

    @Override // xsna.tpp
    public final void i(zin0 zin0Var, dje0 dje0Var) {
        dje0 dje0Var2 = dje0Var;
        zin0Var.bindLong(1, dje0Var2.a);
        zin0Var.bindLong(2, dje0Var2.b);
        zin0Var.bindLong(3, dje0Var2.c);
        String str = dje0Var2.d;
        if (str == null) {
            zin0Var.bindNull(4);
        } else {
            zin0Var.bindString(4, str);
        }
        MessagePriority messagePriority = dje0Var2.e;
        kje0 kje0Var = this.d;
        if (messagePriority == null) {
            zin0Var.bindNull(5);
        } else {
            zin0Var.bindString(5, kje0.h(kje0Var, messagePriority));
        }
        if (dje0Var2.f == null) {
            zin0Var.bindNull(6);
        } else {
            zin0Var.bindLong(6, r0.intValue());
        }
        zin0Var.bindLong(7, dje0Var2.g);
        Long l = dje0Var2.h;
        if (l == null) {
            zin0Var.bindNull(8);
        } else {
            zin0Var.bindLong(8, l.longValue());
        }
        String str2 = dje0Var2.i;
        if (str2 == null) {
            zin0Var.bindNull(9);
        } else {
            zin0Var.bindString(9, str2);
        }
        byte[] bArr = dje0Var2.j;
        if (bArr == null) {
            zin0Var.bindNull(10);
        } else {
            zin0Var.bindBlob(10, bArr);
        }
        zin0Var.bindLong(11, dje0Var2.l);
        zin0Var.bindLong(12, dje0Var2.m);
        ReceivedBy receivedBy = dje0Var2.n;
        if (receivedBy == null) {
            zin0Var.bindNull(13);
        } else {
            zin0Var.bindString(13, kje0.i(kje0Var, receivedBy));
        }
        dje0.a aVar = dje0Var2.k;
        if (aVar != null) {
            String str3 = aVar.a;
            if (str3 == null) {
                zin0Var.bindNull(14);
            } else {
                zin0Var.bindString(14, str3);
            }
            String str4 = aVar.b;
            if (str4 == null) {
                zin0Var.bindNull(15);
            } else {
                zin0Var.bindString(15, str4);
            }
            String str5 = aVar.c;
            if (str5 == null) {
                zin0Var.bindNull(16);
            } else {
                zin0Var.bindString(16, str5);
            }
            String str6 = aVar.d;
            if (str6 == null) {
                zin0Var.bindNull(17);
            } else {
                zin0Var.bindString(17, str6);
            }
            String str7 = aVar.e;
            if (str7 == null) {
                zin0Var.bindNull(18);
            } else {
                zin0Var.bindString(18, str7);
            }
            String str8 = aVar.f;
            if (str8 == null) {
                zin0Var.bindNull(19);
            } else {
                zin0Var.bindString(19, str8);
            }
            String str9 = aVar.g;
            if (str9 == null) {
                zin0Var.bindNull(20);
            } else {
                zin0Var.bindString(20, str9);
            }
            ClickActionType clickActionType = aVar.h;
            if (clickActionType == null) {
                zin0Var.bindNull(21);
            } else {
                zin0Var.bindString(21, kje0.g(kje0Var, clickActionType));
            }
        } else {
            zin0Var.bindNull(14);
            zin0Var.bindNull(15);
            zin0Var.bindNull(16);
            zin0Var.bindNull(17);
            zin0Var.bindNull(18);
            zin0Var.bindNull(19);
            zin0Var.bindNull(20);
            zin0Var.bindNull(21);
        }
        zin0Var.bindLong(22, dje0Var2.a);
    }
}
