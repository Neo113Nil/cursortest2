package ru.mail.libverify.x;

import androidx.annotation.NonNull;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.x.a;
import xsna.vu5;

/* loaded from: classes9.dex */
final class d implements VerificationApi.SmsItem, a.InterfaceC2219a {

    @NonNull
    private final String a;

    @NonNull
    private final String b;
    private final long c;
    private final long d;
    private final long e;
    private boolean f = false;

    public d(@NonNull String str, @NonNull String str2, long j, long j2, long j3) {
        this.a = str;
        this.b = str2;
        this.e = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // ru.mail.libverify.x.a.InterfaceC2219a
    public final long a() {
        return this.e;
    }

    @Override // ru.mail.libverify.x.a.InterfaceC2219a
    public final long b() {
        return this.d;
    }

    public final boolean c() {
        return this.f;
    }

    public final void d() {
        this.f = true;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsItem
    @NonNull
    public final String getFrom() {
        return this.a;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsItem
    public final long getId() {
        return this.e;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsItem
    @NonNull
    public final String getText() {
        return this.b;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsItem
    public final long getTimestamp() {
        return this.c;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmsItemImpl{from='");
        sb.append(this.a);
        sb.append("', text='");
        sb.append(this.b);
        sb.append("', timestamp=");
        sb.append(this.c);
        sb.append(", serverTimestamp=");
        sb.append(this.d);
        sb.append(", id=");
        return vu5.a('}', this.e, sb);
    }
}
