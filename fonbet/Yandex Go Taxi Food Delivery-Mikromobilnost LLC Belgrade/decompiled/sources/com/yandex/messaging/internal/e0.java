package com.yandex.messaging.internal;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.entities.TechBaseMessage;
import com.yandex.messaging.internal.entities.TechMessagesInterestedGuidsRetriever;
import defpackage.e1k;
import defpackage.g8e;
import defpackage.jcy0;
import defpackage.kcy0;
import defpackage.kgx;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tje;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class e0 implements e1k {
    public static final /* synthetic */ kgx[] B;
    public final /* synthetic */ kcy0 A;
    public final jcy0 a;
    public final TechBaseMessage b;
    public final boolean c;
    public final ChatRequest w;
    public final String[] y;
    public final ArrayList x = new ArrayList();
    public final rp3 z = new rp3();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("chatInfoJob", 0, "getChatInfoJob()Lkotlinx/coroutines/Job;", e0.class);
        qoi0.a.getClass();
        B = new kgx[]{mutablePropertyReference1Impl};
    }

    public e0(kcy0 kcy0Var, jcy0 jcy0Var, TechBaseMessage techBaseMessage, String str, boolean z, ChatRequest chatRequest) {
        this.A = kcy0Var;
        this.a = jcy0Var;
        this.b = techBaseMessage;
        this.c = z;
        this.w = chatRequest;
        String[] strArr = (String[]) techBaseMessage.a(chatRequest instanceof ExistingChatRequest ? new TechMessagesInterestedGuidsRetriever(str, ((ExistingChatRequest) chatRequest).id()) : new TechMessagesInterestedGuidsRetriever(str, null));
        this.y = strArr;
        if (strArr.length != 0) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String[] strArr2 = this.y;
                strArr2[i] = g8e.o("@", strArr2[i]);
            }
        }
        kcy0 kcy0Var2 = this.A;
        pzt0 N = tje.N(kcy0Var2.b, null, null, new TechnicalMessageObservable$Subscription$1(kcy0Var2, this, null), 3);
        rp3 rp3Var = this.z;
        kgx kgxVar = B[0];
        rp3Var.a(N);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((e1k) it.next()).close();
        }
        arrayList.clear();
        kgx kgxVar = B[0];
        this.z.a(null);
    }
}
