package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class osa0 {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final double e;
    public final MessageData f;
    public final String g;
    public final String[] h;
    public final boolean i;
    public final OutgoingAttachment$ExistingAttachment[] j;
    public final String k;
    public final CustomPayload l;
    public final String[] m;
    public final boolean n;
    public final String o;
    public final ForwardMessageRef[] p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final String t;

    public osa0(long j, String str, String str2, long j2, double d, MessageData messageData, String str3, String[] strArr, boolean z, OutgoingAttachment$ExistingAttachment[] outgoingAttachment$ExistingAttachmentArr, String str4, CustomPayload customPayload, String[] strArr2, boolean z2, String str5, ForwardMessageRef[] forwardMessageRefArr, boolean z3, String str6, boolean z4, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = d;
        this.f = messageData;
        this.g = str3;
        this.h = strArr;
        this.i = z;
        this.j = outgoingAttachment$ExistingAttachmentArr;
        this.k = str4;
        this.l = customPayload;
        this.m = strArr2;
        this.n = z2;
        this.o = str5;
        this.p = forwardMessageRefArr;
        this.q = z3;
        this.r = str6;
        this.s = z4;
        this.t = str7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final uw80[] a() {
        ArrayList arrayList;
        OutgoingAttachment$ExistingAttachment[] outgoingAttachment$ExistingAttachmentArr = this.j;
        String[] strArr = this.h;
        if (strArr == null && outgoingAttachment$ExistingAttachmentArr == null) {
            return null;
        }
        ?? r2 = EmptyList.a;
        if (strArr != null) {
            arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(new tw80(str, this.i));
            }
        } else {
            arrayList = r2;
        }
        if (outgoingAttachment$ExistingAttachmentArr != null) {
            r2 = j73.d0(outgoingAttachment$ExistingAttachmentArr);
        }
        return (uw80[]) a.m0((Iterable) r2, arrayList).toArray(new uw80[0]);
    }
}
