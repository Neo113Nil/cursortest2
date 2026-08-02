package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5346ze implements InterfaceC5034n8 {
    public final De a;
    public final C5235v3 b;
    public final Ea c;
    public final Tf d;

    public C5346ze() {
        this(new De(), new C5235v3(), new Ea(100), new Tf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ni> fromModel(@NonNull C5321ye c5321ye) {
        Ni ni;
        G8 g8 = new G8();
        g8.a = c5321ye.a;
        g8.f = new C5240v8();
        Ae ae = c5321ye.b;
        C5189t8 c5189t8 = new C5189t8();
        c5189t8.a = StringUtils.getUTF8Bytes(ae.a);
        Wn a = this.c.a(ae.b);
        c5189t8.b = StringUtils.getUTF8Bytes((String) a.a);
        c5189t8.e = ae.c.size();
        Map<String, String> map = ae.d;
        if (map != null) {
            ni = this.a.fromModel(map);
            c5189t8.c = (C5290x8) ni.a;
        } else {
            ni = null;
        }
        g8.f.a = c5189t8;
        int i = 0;
        boolean z = true;
        C5003m3 c5003m3 = new C5003m3(C5003m3.b(a, ni));
        List list = ae.c;
        ArrayList arrayList = new ArrayList();
        this.d.getClass();
        int computeInt32Size = g8.a != new G8().a ? CodedOutputByteBufferNano.computeInt32Size(1, g8.a) : 0;
        F8 f8 = g8.b;
        if (f8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, f8);
        }
        D8 d8 = g8.c;
        if (d8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, d8);
        }
        E8 e8 = g8.d;
        int i2 = 4;
        if (e8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, e8);
        }
        C5086p8 c5086p8 = g8.e;
        if (c5086p8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c5086p8);
        }
        C5240v8 c5240v8 = g8.f;
        if (c5240v8 != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c5240v8);
        }
        ArrayList arrayList2 = new ArrayList();
        G8 g82 = new G8();
        g82.a = g8.a;
        C5240v8 c5240v82 = new C5240v8();
        g82.f = c5240v82;
        c5240v82.a = new C5189t8();
        C5189t8 c5189t82 = g82.f.a;
        C5189t8 c5189t83 = g8.f.a;
        c5189t82.b = c5189t83.b;
        c5189t82.a = c5189t83.a;
        c5189t82.e = c5189t83.e;
        c5189t82.c = c5189t83.c;
        C5003m3 c5003m32 = c5003m3;
        int i3 = 0;
        int i4 = computeInt32Size;
        while (i3 < list.size()) {
            C5260w3 c5260w3 = (C5260w3) list.get(i3);
            boolean z2 = z;
            C5215u8 c5215u8 = new C5215u8();
            c5215u8.a = i3;
            int i5 = i;
            Ni fromModel = this.b.fromModel(c5260w3);
            c5215u8.b = (C5112q8) fromModel.a;
            fromModel.b.getBytesTruncated();
            Ni ni2 = new Ni(c5215u8, fromModel);
            Tf tf = this.d;
            C5215u8 c5215u82 = (C5215u8) ni2.a;
            tf.getClass();
            int computeTagSize = CodedOutputByteBufferNano.computeTagSize(i2);
            int computeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c5215u82);
            int computeRawVarint32Size = computeTagSize + computeMessageSizeNoTag + ((computeMessageSizeNoTag & (-128)) == 0 ? i5 : CodedOutputByteBufferNano.computeRawVarint32Size(computeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i4 + computeRawVarint32Size > 204800) {
                g82.f.a.d = (C5215u8[]) arrayList2.toArray(new C5215u8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new Ni(g82, c5003m32));
                G8 g83 = new G8();
                g83.a = g8.a;
                C5240v8 c5240v83 = new C5240v8();
                g83.f = c5240v83;
                c5240v83.a = new C5189t8();
                C5189t8 c5189t84 = g83.f.a;
                C5189t8 c5189t85 = g8.f.a;
                c5189t84.b = c5189t85.b;
                c5189t84.a = c5189t85.a;
                c5189t84.e = c5189t85.e;
                c5189t84.c = c5189t85.c;
                c5003m32 = c5003m3;
                i4 = computeInt32Size;
                g82 = g83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C5215u8) ni2.a);
            InterfaceC5029n3 interfaceC5029n3 = ni2.b;
            InterfaceC5029n3[] interfaceC5029n3Arr = new InterfaceC5029n3[2];
            interfaceC5029n3Arr[i5] = c5003m32;
            interfaceC5029n3Arr[z2 ? 1 : 0] = interfaceC5029n3;
            c5003m32 = new C5003m3(C5003m3.b(interfaceC5029n3Arr));
            i4 += computeRawVarint32Size;
            i3++;
            z = z2 ? 1 : 0;
            i = i5;
            i2 = 4;
        }
        g82.f.a.d = (C5215u8[]) arrayList2.toArray(new C5215u8[arrayList2.size()]);
        arrayList.add(new Ni(g82, c5003m32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5346ze(De de, C5235v3 c5235v3, Ea ea, Tf tf) {
        this.a = de;
        this.b = c5235v3;
        this.c = ea;
        this.d = tf;
    }

    @NonNull
    public final C5321ye a(@NonNull List<Ni> list) {
        throw new UnsupportedOperationException();
    }
}
