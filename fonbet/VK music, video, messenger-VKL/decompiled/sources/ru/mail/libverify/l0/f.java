package ru.mail.libverify.l0;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class f implements e {

    @NonNull
    private final Context a;

    public f(@NonNull Context context) {
        this.a = context;
    }

    @Override // ru.mail.libverify.l0.e
    public final void a(@NonNull Object obj, boolean z, int i) {
        ru.mail.verify.core.utils.e.a(this.a, obj, z);
        b.a(this.a, obj, i);
    }

    @Override // ru.mail.libverify.l0.e
    public final void a(@NonNull Object obj) {
        ru.mail.verify.core.utils.e.a(this.a, obj);
        b.a(this.a, obj);
    }

    @Override // ru.mail.libverify.l0.e
    public final void a() {
        ru.mail.verify.core.utils.e.a(this.a);
    }
}
