package ru.mail.libverify.storage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import xsna.bqy;

/* loaded from: classes9.dex */
final class d extends g {

    @NonNull
    private final Locale A;

    @Nullable
    private final String B;

    @NonNull
    private final Map<String, String> C;

    @NonNull
    private final String z;

    public d(@NonNull g gVar, @NonNull Context context, @NonNull ru.mail.libverify.c.g gVar2, @NonNull bqy bqyVar, @NonNull bqy bqyVar2, @NonNull bqy bqyVar3, @NonNull bqy bqyVar4, @NonNull bqy bqyVar5, @NonNull bqy bqyVar6, @NonNull bqy bqyVar7) {
        super(context, gVar2, bqyVar, bqyVar2, bqyVar3, bqyVar4, bqyVar5, bqyVar6, bqyVar7);
        this.z = gVar.getId();
        this.A = gVar.d();
        this.B = gVar.B();
        this.C = gVar.p();
    }

    @Override // ru.mail.libverify.storage.g, ru.mail.libverify.u.w
    @Nullable
    public final String B() {
        return this.B;
    }

    @Override // ru.mail.libverify.storage.g, ru.mail.libverify.u.w
    @NonNull
    public final Locale d() {
        return this.A;
    }

    @Override // ru.mail.libverify.storage.g, ru.mail.libverify.u.w
    @NonNull
    public final String getId() {
        return this.z;
    }

    @Override // ru.mail.libverify.storage.g, ru.mail.libverify.u.w
    @NonNull
    public final String h() {
        return ru.mail.libverify.n0.e.f(this.z);
    }

    @Override // ru.mail.libverify.storage.g, ru.mail.libverify.u.w
    @NonNull
    public final Map<String, String> p() {
        return this.C;
    }
}
