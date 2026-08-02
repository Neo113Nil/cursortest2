package com.yandex.messaging.internal.view.chat;

import defpackage.bvf0;
import defpackage.k4o;
import defpackage.ny61;
import defpackage.x4e;
import defpackage.z83;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class ChatInputHeightState {
    public final HashMap a = new HashMap();
    public final r0 b = bvf0.c(-1);
    public final r0 c = bvf0.c(-1);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/internal/view/chat/ChatInputHeightState$HeightConsumer;", "", "", "isInputConsumer", "Z", "a", "()Z", "Miniapp", "Other", "DndWarning", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeightConsumer {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ HeightConsumer[] $VALUES;
        public static final HeightConsumer DndWarning;
        public static final HeightConsumer Miniapp;
        public static final HeightConsumer Other;
        private final boolean isInputConsumer;

        static {
            HeightConsumer heightConsumer = new HeightConsumer("Miniapp", 0, true);
            Miniapp = heightConsumer;
            HeightConsumer heightConsumer2 = new HeightConsumer("Other", 1, true);
            Other = heightConsumer2;
            HeightConsumer heightConsumer3 = new HeightConsumer("DndWarning", 2, false);
            DndWarning = heightConsumer3;
            HeightConsumer[] heightConsumerArr = {heightConsumer, heightConsumer2, heightConsumer3};
            $VALUES = heightConsumerArr;
            $ENTRIES = kotlin.enums.a.a(heightConsumerArr);
        }

        public HeightConsumer(String str, int i, boolean z) {
            this.isInputConsumer = z;
        }

        public static HeightConsumer valueOf(String str) {
            return (HeightConsumer) Enum.valueOf(HeightConsumer.class, str);
        }

        public static HeightConsumer[] values() {
            return (HeightConsumer[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final boolean getIsInputConsumer() {
            return this.isInputConsumer;
        }
    }

    public final void a(int i) {
        z83.h(null, i >= 0);
        this.a.put(HeightConsumer.Other, Integer.valueOf(i));
        b();
    }

    public final void b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((HeightConsumer) entry.getKey()).getIsInputConsumer()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Integer num = (Integer) kotlin.collections.a.c0(linkedHashMap.values());
        int intValue = num != null ? num.intValue() : 0;
        Integer valueOf = Integer.valueOf(intValue);
        r0 r0Var = this.c;
        r0Var.getClass();
        r0Var.m(null, valueOf);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!((HeightConsumer) entry2.getKey()).getIsInputConsumer()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        x4e.z(kotlin.collections.a.z0(linkedHashMap2.values()) + intValue, this.b, null);
    }

    public final void c(HeightConsumer heightConsumer) {
        if (heightConsumer == HeightConsumer.Other) {
            ny61.g("Other is legacy consumer, it may not be removed");
        } else {
            this.a.remove(heightConsumer);
            b();
        }
    }
}
