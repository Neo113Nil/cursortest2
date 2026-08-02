package ru.mail.libverify.j0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public class h implements Gsonable, l {
    private transient String a;

    @NonNull
    private String data;

    @Nullable
    private String tag;

    private h() {
        this.data = "";
    }

    @NonNull
    public final String a() {
        return this.data;
    }

    @Override // ru.mail.libverify.j0.l
    @NonNull
    public final String getId() {
        if (this.tag == null) {
            return this.data;
        }
        if (this.a == null) {
            this.a = this.data + this.tag;
        }
        return this.a;
    }

    public h(@NonNull String str, @Nullable String str2) {
        this.data = str;
        this.tag = str2;
    }
}
