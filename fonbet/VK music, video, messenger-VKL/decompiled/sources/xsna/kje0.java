package xsna;

import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.pushsdk.data.VkpnsPushDatabase;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class kje0 implements fje0 {
    public final RoomDatabase a;
    public final lje0 b;
    public final mje0 c;
    public final oje0 d;

    /* compiled from: PushMessageDao_Impl.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ClickActionType.values().length];
            c = iArr;
            try {
                iArr[ClickActionType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ClickActionType.DEEP_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ReceivedBy.values().length];
            b = iArr2;
            try {
                iArr2[ReceivedBy.TEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ReceivedBy.WEB_SOCKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ReceivedBy.HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[MessagePriority.values().length];
            a = iArr3;
            try {
                iArr3[MessagePriority.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MessagePriority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MessagePriority.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public kje0(VkpnsPushDatabase vkpnsPushDatabase) {
        this.a = vkpnsPushDatabase;
        this.b = new lje0(this, vkpnsPushDatabase);
        this.c = new mje0(vkpnsPushDatabase);
        new nje0(this, vkpnsPushDatabase);
        this.d = new oje0(vkpnsPushDatabase);
    }

    public static String g(kje0 kje0Var, ClickActionType clickActionType) {
        if (clickActionType == null) {
            return null;
        }
        int i = a.c[clickActionType.ordinal()];
        if (i == 1) {
            return "DEFAULT";
        }
        if (i == 2) {
            return "DEEP_LINK";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + clickActionType);
    }

    public static String h(kje0 kje0Var, MessagePriority messagePriority) {
        if (messagePriority == null) {
            return null;
        }
        int i = a.a[messagePriority.ordinal()];
        if (i == 1) {
            return "HIGH";
        }
        if (i == 2) {
            return "NORMAL";
        }
        if (i == 3) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + messagePriority);
    }

    public static String i(kje0 kje0Var, ReceivedBy receivedBy) {
        if (receivedBy == null) {
            return null;
        }
        int i = a.b[receivedBy.ordinal()];
        if (i == 1) {
            return "TEST";
        }
        if (i == 2) {
            return "WEB_SOCKET";
        }
        if (i == 3) {
            return "HTTP";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + receivedBy);
    }

    @Override // xsna.fje0
    public final Object a(ric ricVar) {
        return fwj.a.b(this.a, true, new gje0(this, 0), ricVar);
    }

    @Override // xsna.fje0
    public final Object b(String str, ilc ilcVar) {
        dmg0 c = dmg0.c(1, "SELECT COUNT(*) AS count FROM push_message INNER JOIN package_info on package_info.package_name = ?");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        return fwj.a.a(this.a, new CancellationSignal(), new jje0(this, c), ilcVar);
    }

    @Override // xsna.fje0
    public final Object c(List list, ContinuationImpl continuationImpl) {
        return fwj.a.b(this.a, true, new i790(1, this, list), continuationImpl);
    }

    @Override // xsna.fje0
    public final FlowUtil$createFlow$$inlined$map$1 d(String str) {
        dmg0 c = dmg0.c(2, "SELECT `id`, `token_package_id`, `syn`, `collapse_key`, `priority`, `ttl`, `actual_ttl`, `expiring_time`, `from`, `data`, `received_by_push_server_at`, `delivery_attempts`, `received_by`, `title`, `body`, `image`, `icon`, `color`, `channel_id`, `click_action`, `click_action_type` FROM (SELECT * FROM push_message INNER JOIN push_token on push_token.package_info_id = push_message.token_package_id INNER JOIN package_info on package_info.package_id = push_token.package_info_id WHERE package_name = ? ORDER BY syn LIMIT ?)");
        if (str == null) {
            c.bindNull(1);
        } else {
            c.bindString(1, str);
        }
        c.bindLong(2, 10);
        return fwj.a(this.a, new String[]{"push_message", "push_token", "package_info"}, new hje0(this, c));
    }

    @Override // xsna.fje0
    public final Object e(ArrayList arrayList, sje0 sje0Var) {
        return fwj.a.b(this.a, true, new h790(1, this, arrayList), sje0Var);
    }

    @Override // xsna.fje0
    public final Object f(int i, ContinuationImpl continuationImpl) {
        dmg0 c = dmg0.c(1, "SELECT COUNT(*) AS count, package_info.package_name, push_token.token  FROM push_message INNER JOIN push_token on push_token.package_info_id = push_message.token_package_id INNER JOIN package_info on package_info.package_id = push_token.package_info_id GROUP BY push_token.package_info_id HAVING COUNT(*) > ?");
        c.bindLong(1, i);
        return fwj.a.a(this.a, new CancellationSignal(), new ije0(this, c), continuationImpl);
    }
}
