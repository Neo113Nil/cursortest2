package com.yandex.messaging.internal.entities;

import com.yandex.messaging.core.net.entities.proto.NotificationMeta;
import com.yandex.messaging.core.net.entities.proto.message.CustomFromUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.ThreadState;

/* loaded from: classes15.dex */
public class Message {
    public final String a;
    public long b;
    public long c;
    public long d;
    public final long e;
    public final String f;
    public String g;
    public final MessageData h;
    public final CustomPayload i;
    public final long j;
    public final long k;
    public Message[] l;
    public String m;
    public final ReducedUserInfo n;
    public final CustomFromUserInfo o;
    public final ThreadState p;
    public MessageTranslation q;
    public ReducedUserInfo[] r;
    public final NotificationMeta s;
    public final long t;
    public final long u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public Message(String str, long j, long j2, long j3, long j4, String str2, String str3, MessageData messageData, CustomPayload customPayload, long j5, long j6, ReducedUserInfo reducedUserInfo, CustomFromUserInfo customFromUserInfo, int i, long j7, long j8, NotificationMeta notificationMeta, boolean z, ThreadState threadState, boolean z2, boolean z3) {
        this.a = str;
        this.b = j;
        this.d = j2;
        this.c = j3;
        this.e = j4;
        this.f = str2;
        this.g = str3;
        this.h = messageData;
        this.i = customPayload;
        this.j = j5;
        this.k = j6;
        this.n = reducedUserInfo;
        this.o = customFromUserInfo;
        messageData.hiddenByModeration = i == 1;
        this.t = j7;
        this.u = j8;
        this.s = notificationMeta;
        this.v = z;
        this.p = threadState;
        this.q = null;
        this.w = z2;
        this.x = z3;
    }

    public Message() {
    }
}
