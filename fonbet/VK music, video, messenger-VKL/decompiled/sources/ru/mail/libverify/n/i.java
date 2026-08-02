package ru.mail.libverify.n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import ru.mail.libverify.n.l;

/* loaded from: classes9.dex */
public final class i {

    @NonNull
    private final j a;

    @Nullable
    private l.a b;

    @NonNull
    private Pattern c;

    @NonNull
    private Pattern d;

    public i(@NonNull j jVar) {
        Pattern pattern = m.g;
        this.c = pattern;
        this.d = pattern;
        this.a = jVar;
    }

    @NonNull
    public final i a(@Nullable l.a aVar) {
        this.b = aVar;
        return this;
    }

    @NonNull
    public final e a() {
        final l.a aVar = this.b;
        return this.a.a(this.c, this.d, new l.a() { // from class: xsna.kzy0
            @Override // ru.mail.libverify.n.l.a
            public final void a(ru.mail.libverify.n.b bVar) {
                ru.mail.libverify.n.i.a(l.a.this, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(l.a aVar, b bVar) {
        if (aVar != null) {
            aVar.a(bVar);
        }
    }
}
