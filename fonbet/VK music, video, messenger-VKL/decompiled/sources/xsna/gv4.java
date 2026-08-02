package xsna;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.qv4;

/* compiled from: AudioRecordVc.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class gv4 extends PropertyReference1Impl {
    public static final gv4 b = new gv4(qv4.b.class, NotificationCompat.CATEGORY_PROGRESS, "getProgress()F", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return Float.valueOf(((qv4.b) obj).f);
    }
}
