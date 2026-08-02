package defpackage;

import com.yandex.go.taxi.order.chat.domain.model.MessagePresentationModel$State;
import java.util.Date;

/* loaded from: classes14.dex */
public abstract class jv10 implements Comparable {
    public final long a;
    public final int b;
    public final Date c;
    public final MessagePresentationModel$State w;
    public static final int x = xkh0.item_chat_client_message;
    public static final int y = xkh0.item_chat_client_location;
    public static final int z = xkh0.item_chat_system_message;
    public static final int A = xkh0.item_chat_driver_message;
    public static final int B = xkh0.item_chat_driver_message_with_translation;
    public static final int C = xkh0.item_chat_driver_location;

    public jv10(long j, int i, Date date, MessagePresentationModel$State messagePresentationModel$State) {
        this.a = j;
        this.b = i;
        this.c = date;
        this.w = messagePresentationModel$State;
    }

    public abstract isa0 a();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jv10 jv10Var = (jv10) obj;
        int compareTo = this.c.compareTo(jv10Var.c);
        if (compareTo != 0) {
            return compareTo;
        }
        long j = this.a;
        long j2 = jv10Var.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
