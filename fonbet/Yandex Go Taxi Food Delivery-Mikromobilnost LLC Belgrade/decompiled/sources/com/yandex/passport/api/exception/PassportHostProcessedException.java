package com.yandex.passport.api.exception;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.p53;
import defpackage.qje;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0002\t\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/yandex/passport/api/exception/PassportHostProcessedException;", "Lcom/yandex/passport/api/exception/PassportException;", "", "", "errors", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "Companion", "com/yandex/passport/api/exception/b", "com/yandex/passport/api/exception/a", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportHostProcessedException extends PassportException {
    public static final b Companion = new b();
    public static final KSerializer[] a = {new p53(auu0.a, 0)};
    private final List<String> errors;

    public /* synthetic */ PassportHostProcessedException(int i, List list) {
        if (1 == (i & 1)) {
            this.errors = list;
        } else {
            qje.Z(i, 1, a.a.getDescriptor());
            throw null;
        }
    }

    public PassportHostProcessedException(ArrayList arrayList) {
        super("Host-processed errors: " + arrayList);
        this.errors = arrayList;
    }
}
