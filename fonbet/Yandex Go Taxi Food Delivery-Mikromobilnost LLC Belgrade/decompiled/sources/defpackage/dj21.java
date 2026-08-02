package defpackage;

import androidx.camera.core.featuregroup.impl.UseCaseType;
import androidx.camera.core.g;
import androidx.camera.core.j;

/* loaded from: classes10.dex */
public final class dj21 {
    public static UseCaseType a(j jVar) {
        return jVar instanceof g ? UseCaseType.PREVIEW : jVar instanceof w8v ? UseCaseType.IMAGE_CAPTURE : qt7.C(jVar) ? UseCaseType.VIDEO_CAPTURE : jVar instanceof iru0 ? UseCaseType.STREAM_SHARING : UseCaseType.UNDEFINED;
    }
}
