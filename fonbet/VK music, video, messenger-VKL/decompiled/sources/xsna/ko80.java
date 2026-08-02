package xsna;

import android.content.Intent;
import xsna.po80;

/* compiled from: OngoingCallActionsProcessor.kt */
/* loaded from: classes7.dex */
public interface ko80 {
    void a(Intent intent);

    void b(String str);

    void c(String str, po80.b bVar);

    /* compiled from: OngoingCallActionsProcessor.kt */
    public interface a {
        default void a() {
        }

        default void onAccept() {
        }

        default void onFinish() {
        }
    }
}
