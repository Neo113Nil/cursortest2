package ru.mail.libverify.x;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class c implements VerificationApi.SmsDialogItem {

    @NonNull
    private final String a;
    private final long b;
    private volatile long c;
    private volatile String d;
    private volatile boolean e;
    private volatile boolean f;
    private final a<d> g = new a<>();
    private final TreeMap<Long, d> h = new TreeMap<>();

    public c(@NonNull String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final void a(@NonNull d dVar) {
        d put = this.h.put(Long.valueOf(dVar.getId()), dVar);
        if (put != null) {
            this.g.c(put);
            this.g.b(dVar);
        } else {
            int b = this.g.b(dVar);
            this.f = false;
            FileLog.v("SmsDialogItem", "%s added into %s at index %d", dVar, this.a, Integer.valueOf(b));
        }
    }

    public final void b(long j) {
        d remove = this.h.remove(Long.valueOf(j));
        if (remove != null) {
            this.g.c(remove);
        }
    }

    public final void c(long j) {
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull VerificationApi.SmsDialogItem smsDialogItem) {
        return ru.mail.libverify.n0.e.a(smsDialogItem.getLastTimestamp(), this.c);
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsDialogItem
    @NonNull
    public final String getFrom() {
        return this.a;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsDialogItem
    public final long getId() {
        return this.b;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsDialogItem
    @Nullable
    public final String getLastText() {
        return this.d;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsDialogItem
    public final long getLastTimestamp() {
        return this.c;
    }

    @Override // ru.mail.libverify.api.VerificationApi.SmsDialogItem
    public final boolean hasUnread() {
        return this.e;
    }

    public final void c() {
        this.f = true;
    }

    public final void b(boolean z) {
        this.e = z;
    }

    public final boolean b() {
        return this.f;
    }

    @Nullable
    public final VerificationApi.SmsItem a(long j) {
        return this.h.get(Long.valueOf(j));
    }

    @Nullable
    public final VerificationApi.SmsItem a(boolean z) {
        if (this.g.a() == 0) {
            return null;
        }
        d a = this.g.a(r0.a() - 1);
        if (a.c() || !z) {
            return a;
        }
        return null;
    }

    @NonNull
    public final ArrayList a(int i) {
        ArrayList arrayList = new ArrayList(i);
        if (this.g.a() != 0) {
            int a = this.g.a() - 1;
            for (int i2 = 0; i2 < i && a >= 0; i2++) {
                d a2 = this.g.a(a);
                if (!a2.c()) {
                    break;
                }
                arrayList.add(a2);
                a--;
            }
        }
        FileLog.v("SmsDialogItem", "first %d sms:\n%s", Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @NonNull
    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(this.g.a());
        for (int a = this.g.a() - 1; a >= 0; a--) {
            d a2 = this.g.a(a);
            if (!a2.c()) {
                break;
            }
            arrayList.add(a2);
        }
        FileLog.v("SmsDialogItem", "all %d sms:\n%s", Integer.valueOf(this.g.a()), arrayList);
        return arrayList;
    }

    public final List<VerificationApi.SmsItem> a(long j, int i) {
        d dVar = this.h.get(Long.valueOf(j));
        if (dVar == null) {
            return Collections.EMPTY_LIST;
        }
        return a(dVar, i);
    }

    @NonNull
    public final List<VerificationApi.SmsItem> a(@NonNull d dVar, int i) {
        if (!dVar.c()) {
            return Collections.EMPTY_LIST;
        }
        int a = this.g.a(dVar);
        if (a < 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(i);
        while (true) {
            a--;
            if (arrayList.size() >= i || a < 0) {
                break;
            }
            d a2 = this.g.a(a);
            if (!a2.c()) {
                break;
            }
            arrayList.add(a2);
        }
        FileLog.v("SmsDialogItem", "%d sms starting from %d:\n%s", Integer.valueOf(i), Long.valueOf(this.b), arrayList);
        return arrayList;
    }

    public final void a(String str) {
        this.d = str;
    }
}
