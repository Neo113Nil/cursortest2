package com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.transform.exception;

import com.yandex.div.state.db.StateEntry;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/action/ftrequest/transform/exception/JasonPathNotFoundException;", "Lcom/yandex/fintechsdk/features/bdui/internal/presentation/action/ftrequest/transform/exception/DtoTransformationException;", "", StateEntry.COLUMN_PATH, "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class JasonPathNotFoundException extends DtoTransformationException {
    private final String path;

    public JasonPathNotFoundException(String str) {
        this.path = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JasonPathNotFoundException) && jl40.l(this.path, ((JasonPathNotFoundException) obj).path);
    }

    public final int hashCode() {
        return this.path.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return oyr.p("JasonPathNotFoundException(path=", this.path, Extension.C_BRAKE);
    }
}
