package ru.mail.libverify.g0;

import androidx.annotation.NonNull;
import java.util.LinkedList;
import xsna.bqy;

/* loaded from: classes9.dex */
public final class s {
    private final LinkedList<bqy<f>> a = new LinkedList<>();

    @NonNull
    public final <T extends f> s a(@NonNull bqy<T> bqyVar) {
        this.a.add(bqyVar);
        return this;
    }

    @NonNull
    public final LinkedList a() {
        return this.a;
    }
}
