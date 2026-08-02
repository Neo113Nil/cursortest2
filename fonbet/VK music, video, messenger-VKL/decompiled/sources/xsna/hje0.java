package xsna;

import android.database.Cursor;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.pushsdk.domain.model.MessagePriority;
import com.vk.push.pushsdk.domain.model.ReceivedBy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.dje0;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class hje0 implements Callable<List<dje0>> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ kje0 c;

    public hje0(kje0 kje0Var, dmg0 dmg0Var) {
        this.c = kje0Var;
        this.b = dmg0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.util.concurrent.Callable
    public final List<dje0> call() throws Exception {
        char c;
        MessagePriority messagePriority;
        MessagePriority messagePriority2;
        Integer num;
        char c2;
        ReceivedBy receivedBy;
        ReceivedBy receivedBy2;
        ClickActionType clickActionType;
        ClickActionType clickActionType2;
        dje0.a aVar;
        int i = 0;
        Cursor h = u370.h(this.c.a, this.b, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                long j = h.getLong(i);
                long j2 = h.getLong(1);
                long j3 = h.getLong(2);
                String string = h.isNull(3) ? null : h.getString(3);
                String string2 = h.getString(4);
                if (string2 == null) {
                    messagePriority2 = null;
                } else {
                    switch (string2.hashCode()) {
                        case -1986416409:
                            if (string2.equals("NORMAL")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2217378:
                            if (string2.equals("HIGH")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 433141802:
                            if (string2.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN)) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    c = 65535;
                    switch (c) {
                        case 0:
                            messagePriority = MessagePriority.NORMAL;
                            break;
                        case 1:
                            messagePriority = MessagePriority.HIGH;
                            break;
                        case 2:
                            messagePriority = MessagePriority.UNKNOWN;
                            break;
                        default:
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(string2));
                    }
                    messagePriority2 = messagePriority;
                }
                Integer valueOf = h.isNull(5) ? null : Integer.valueOf(h.getInt(5));
                int i2 = h.getInt(6);
                Long valueOf2 = h.isNull(7) ? null : Long.valueOf(h.getLong(7));
                String string3 = h.isNull(8) ? null : h.getString(8);
                byte[] blob = h.isNull(9) ? null : h.getBlob(9);
                long j4 = h.getLong(10);
                int i3 = h.getInt(11);
                String string4 = h.getString(12);
                if (string4 == null) {
                    num = valueOf;
                    receivedBy = null;
                } else {
                    switch (string4.hashCode()) {
                        case -150995234:
                            num = valueOf;
                            if (string4.equals("WEB_SOCKET")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2228360:
                            num = valueOf;
                            if (string4.equals("HTTP")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2571410:
                            num = valueOf;
                            if (string4.equals("TEST")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            num = valueOf;
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            receivedBy = ReceivedBy.WEB_SOCKET;
                            break;
                        case 1:
                            receivedBy = ReceivedBy.HTTP;
                            break;
                        case 2:
                            receivedBy = ReceivedBy.TEST;
                            break;
                        default:
                            throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(string4));
                    }
                }
                if (h.isNull(13) && h.isNull(14) && h.isNull(15) && h.isNull(16) && h.isNull(17) && h.isNull(18) && h.isNull(19) && h.isNull(20)) {
                    receivedBy2 = receivedBy;
                    aVar = null;
                } else {
                    String string5 = h.isNull(13) ? null : h.getString(13);
                    String string6 = h.isNull(14) ? null : h.getString(14);
                    String string7 = h.isNull(15) ? null : h.getString(15);
                    String string8 = h.isNull(16) ? null : h.getString(16);
                    String string9 = h.isNull(17) ? null : h.getString(17);
                    String string10 = h.isNull(18) ? null : h.getString(18);
                    String string11 = h.isNull(19) ? null : h.getString(19);
                    String string12 = h.getString(20);
                    if (string12 == null) {
                        receivedBy2 = receivedBy;
                        clickActionType2 = null;
                    } else {
                        receivedBy2 = receivedBy;
                        if (string12.equals("DEFAULT")) {
                            clickActionType = ClickActionType.DEFAULT;
                        } else {
                            if (!string12.equals("DEEP_LINK")) {
                                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(string12));
                            }
                            clickActionType = ClickActionType.DEEP_LINK;
                        }
                        clickActionType2 = clickActionType;
                    }
                    aVar = new dje0.a(string5, string6, string7, string8, string9, string10, string11, clickActionType2);
                }
                arrayList.add(new dje0(j, j2, j3, string, messagePriority2, num, i2, valueOf2, string3, blob, aVar, j4, i3, receivedBy2));
                i = 0;
            }
            h.close();
            return arrayList;
        } catch (Throwable th) {
            h.close();
            throw th;
        }
    }

    public final void finalize() {
        this.b.n();
    }
}
