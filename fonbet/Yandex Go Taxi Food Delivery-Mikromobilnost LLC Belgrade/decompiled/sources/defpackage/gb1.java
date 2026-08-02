package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public class gb1 {
    public lb1 a = null;

    public static qst a() {
        synchronized (bb1.class) {
            try {
                if (bb1.a == null) {
                    pst pstVar = new pst();
                    List list = qst.l;
                    if ("aj".codePointCount(0, 2) > 100) {
                        throw new IllegalArgumentException(String.format("Wrapped SDK Name must be non-null and not exceed %d characters", 100));
                    }
                    pstVar.a = "aj";
                    if (!qst.b("aj_")) {
                        throw new IllegalArgumentException("Sanitized Name Prefix must be non-null, may only contain alphanumeric charactersand underscores (\"_\"), and must start with an alphabetic character");
                    }
                    pstVar.b = "aj_";
                    if (!qst.a(40, "aj_unnamed_event", qst.m)) {
                        throw new IllegalArgumentException("Empty Event Name must conform to formatting rules outlined at https://firebase.google.com/docs/reference/android/com/google/firebase/analytics/FirebaseAnalytics.Event");
                    }
                    pstVar.c = "aj_unnamed_event";
                    if (!qst.a(40, "aj_unnamed_parameter", qst.n)) {
                        throw new IllegalArgumentException("Empty Param Name must conform to formatting rules outlined at https://firebase.google.com/docs/reference/android/com/google/firebase/analytics/FirebaseAnalytics.Param");
                    }
                    pstVar.d = "aj_unnamed_parameter";
                    if (!qst.a(24, "aj_unnamed_user_property", qst.o)) {
                        throw new IllegalArgumentException("Empty User Property name must conform to formatting rules outlined at https://firebase.google.com/docs/reference/android/com/google/firebase/analytics/FirebaseAnalytics.UserProperty");
                    }
                    pstVar.e = "aj_unnamed_user_property";
                    bb1.a = pstVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bb1.a;
    }
}
