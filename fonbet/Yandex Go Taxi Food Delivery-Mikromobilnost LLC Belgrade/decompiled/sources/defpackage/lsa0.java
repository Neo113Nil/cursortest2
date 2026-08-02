package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class lsa0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nsa0 c;

    public /* synthetic */ lsa0(String str, nsa0 nsa0Var, int i) {
        this.a = i;
        this.b = str;
        this.c = nsa0Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v5, types: [osa0] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i;
        nsa0 nsa0Var;
        int i2;
        String Y1;
        int i3;
        String Y12;
        int i4 = this.a;
        nsa0 nsa0Var2 = this.c;
        String str = this.b;
        switch (i4) {
            case 0:
                nsa0 nsa0Var3 = nsa0Var2;
                T0 = ((oll0) obj).T0("SELECT * FROM pending_message_to_chat_request WHERE message_chat_request_id = ? AND message_is_paused = 0 ORDER BY message_order");
                try {
                    T0.g1(1, str);
                    int r = eja1.r(T0, "message_order");
                    int r2 = eja1.r(T0, "message_chat_request_id");
                    int r3 = eja1.r(T0, "message_id");
                    int r4 = eja1.r(T0, "message_internal_id");
                    int r5 = eja1.r(T0, "message_time");
                    int r6 = eja1.r(T0, "message_data");
                    int r7 = eja1.r(T0, "message_attachment_uri");
                    int r8 = eja1.r(T0, "message_attachment_uris");
                    int r9 = eja1.r(T0, "message_force_as_file");
                    int r10 = eja1.r(T0, "message_existing_attachments");
                    int r11 = eja1.r(T0, "message_voice_file_uri");
                    int r12 = eja1.r(T0, "message_payload");
                    int r13 = eja1.r(T0, "message_mentioned_guids");
                    int r14 = eja1.r(T0, "message_is_paused");
                    int r15 = eja1.r(T0, "chat_source");
                    int r16 = eja1.r(T0, "message_forwards");
                    int r17 = eja1.r(T0, "is_starred");
                    int r18 = eja1.r(T0, "forced_translation");
                    int r19 = eja1.r(T0, "is_silent");
                    int r20 = eja1.r(T0, "quoted_text");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        long j = T0.getLong(r);
                        String Y13 = T0.Y1(r2);
                        String Y14 = T0.Y1(r3);
                        long j2 = T0.getLong(r4);
                        double d = T0.getDouble(r5);
                        if (T0.isNull(r6)) {
                            nsa0 nsa0Var4 = nsa0Var3;
                            i = r3;
                            nsa0Var = nsa0Var4;
                            i2 = r;
                            Y1 = null;
                        } else {
                            nsa0 nsa0Var5 = nsa0Var3;
                            i = r3;
                            nsa0Var = nsa0Var5;
                            i2 = r;
                            Y1 = T0.Y1(r6);
                        }
                        int i5 = r2;
                        MessageData messageData = (MessageData) ((us10) nsa0Var.c.getValue()).l(Y1);
                        if (messageData == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.yandex.messaging.`internal`.entities.MessageData', but it was NULL.");
                        }
                        String Y15 = T0.isNull(r7) ? null : T0.Y1(r7);
                        String[] strArr = (String[]) nsa0Var.o().l(T0.isNull(r8) ? null : T0.Y1(r8));
                        int i6 = r4;
                        boolean z = ((int) T0.getLong(r9)) != 0;
                        OutgoingAttachment$ExistingAttachment[] outgoingAttachment$ExistingAttachmentArr = (OutgoingAttachment$ExistingAttachment[]) ((dmo) nsa0Var.e.getValue()).l(T0.isNull(r10) ? null : T0.Y1(r10));
                        String Y16 = T0.isNull(r11) ? null : T0.Y1(r11);
                        CustomPayload customPayload = (CustomPayload) ((okf) nsa0Var.f.getValue()).l(T0.isNull(r12) ? null : T0.Y1(r12));
                        String[] strArr2 = (String[]) nsa0Var.o().l(T0.isNull(r13) ? null : T0.Y1(r13));
                        boolean z2 = ((int) T0.getLong(r14)) != 0;
                        int i7 = r15;
                        String Y17 = T0.Y1(i7);
                        int i8 = r16;
                        if (T0.isNull(i8)) {
                            i3 = i6;
                            Y12 = null;
                        } else {
                            i3 = i6;
                            Y12 = T0.Y1(i8);
                        }
                        ForwardMessageRef[] forwardMessageRefArr = (ForwardMessageRef[]) ((kas) nsa0Var.g.getValue()).l(Y12);
                        int i9 = r17;
                        nsa0 nsa0Var6 = nsa0Var;
                        boolean z3 = ((int) T0.getLong(i9)) != 0;
                        int i10 = r18;
                        int i11 = r19;
                        int i12 = r20;
                        arrayList.add(new osa0(j, Y13, Y14, j2, d, messageData, Y15, strArr, z, outgoingAttachment$ExistingAttachmentArr, Y16, customPayload, strArr2, z2, Y17, forwardMessageRefArr, z3, T0.isNull(i10) ? null : T0.Y1(i10), ((int) T0.getLong(i11)) != 0, T0.isNull(i12) ? null : T0.Y1(i12)));
                        r4 = i3;
                        r15 = i7;
                        r16 = i8;
                        r20 = i12;
                        r3 = i;
                        nsa0Var3 = nsa0Var6;
                        r17 = i9;
                        r18 = i10;
                        r = i2;
                        r19 = i11;
                        r2 = i5;
                    }
                    T0.close();
                    return arrayList;
                } finally {
                    T0.close();
                }
            default:
                T0 = ((oll0) obj).T0("SELECT * FROM pending_message_to_chat_request WHERE message_id = ?");
                try {
                    T0.g1(1, str);
                    int r21 = eja1.r(T0, "message_order");
                    int r22 = eja1.r(T0, "message_chat_request_id");
                    int r23 = eja1.r(T0, "message_id");
                    int r24 = eja1.r(T0, "message_internal_id");
                    int r25 = eja1.r(T0, "message_time");
                    int r26 = eja1.r(T0, "message_data");
                    int r27 = eja1.r(T0, "message_attachment_uri");
                    int r28 = eja1.r(T0, "message_attachment_uris");
                    int r29 = eja1.r(T0, "message_force_as_file");
                    int r30 = eja1.r(T0, "message_existing_attachments");
                    int r31 = eja1.r(T0, "message_voice_file_uri");
                    int r32 = eja1.r(T0, "message_payload");
                    int r33 = eja1.r(T0, "message_mentioned_guids");
                    int r34 = eja1.r(T0, "message_is_paused");
                    int r35 = eja1.r(T0, "chat_source");
                    int r36 = eja1.r(T0, "message_forwards");
                    int r37 = eja1.r(T0, "is_starred");
                    int r38 = eja1.r(T0, "forced_translation");
                    int r39 = eja1.r(T0, "is_silent");
                    int r40 = eja1.r(T0, "quoted_text");
                    if (T0.q()) {
                        long j3 = T0.getLong(r21);
                        String Y18 = T0.Y1(r22);
                        String Y19 = T0.Y1(r23);
                        long j4 = T0.getLong(r24);
                        double d2 = T0.getDouble(r25);
                        MessageData messageData2 = (MessageData) ((us10) nsa0Var2.c.getValue()).l(T0.isNull(r26) ? null : T0.Y1(r26));
                        if (messageData2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.yandex.messaging.`internal`.entities.MessageData', but it was NULL.");
                        }
                        r19 = new osa0(j3, Y18, Y19, j4, d2, messageData2, T0.isNull(r27) ? null : T0.Y1(r27), (String[]) nsa0Var2.o().l(T0.isNull(r28) ? null : T0.Y1(r28)), ((int) T0.getLong(r29)) != 0, (OutgoingAttachment$ExistingAttachment[]) ((dmo) nsa0Var2.e.getValue()).l(T0.isNull(r30) ? null : T0.Y1(r30)), T0.isNull(r31) ? null : T0.Y1(r31), (CustomPayload) ((okf) nsa0Var2.f.getValue()).l(T0.isNull(r32) ? null : T0.Y1(r32)), (String[]) nsa0Var2.o().l(T0.isNull(r33) ? null : T0.Y1(r33)), ((int) T0.getLong(r34)) != 0, T0.Y1(r35), (ForwardMessageRef[]) ((kas) nsa0Var2.g.getValue()).l(T0.isNull(r36) ? null : T0.Y1(r36)), ((int) T0.getLong(r37)) != 0, T0.isNull(r38) ? null : T0.Y1(r38), ((int) T0.getLong(r39)) != 0, T0.isNull(r40) ? null : T0.Y1(r40));
                    }
                    return r19;
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
        }
    }
}
