package defpackage;

import kotlin.text.Regex;

/* loaded from: classes4.dex */
public abstract class k791 {
    public static final String[] a = {"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String a(Throwable th) {
        String str;
        String str2;
        w610 b;
        w610 b2;
        Regex regex = cg90.a;
        String message = th.getMessage();
        String str3 = null;
        if (message != null) {
            int G = evu0.G(message, '\n', 0, 6);
            if (G != -1) {
                message = message.substring(0, G);
            }
            try {
                b2 = cg90.a.b(message);
            } catch (Throwable unused) {
            }
            if (b2 != null) {
                t610 a2 = b2.c.a(1);
                String str4 = a2 != null ? a2.a : null;
                if (str4 != null) {
                    str = "не найден парсер для типа '" + str4 + "'";
                    if (str == null) {
                        return str;
                    }
                    String message2 = th.getMessage();
                    if (message2 != null) {
                        int G2 = evu0.G(message2, '\n', 0, 6);
                        if (G2 != -1) {
                            message2 = message2.substring(0, G2);
                        }
                        try {
                            b = cg90.b.b(message2);
                        } catch (Throwable unused2) {
                        }
                        if (b != null) {
                            t610 a3 = b.c.a(1);
                            String str5 = a3 != null ? a3.a : null;
                            if (str5 != null) {
                                str2 = "не найден парсер для дискриминатора '" + str5 + "'";
                                if (str2 == null) {
                                    return str2;
                                }
                                String message3 = th.getMessage();
                                if (message3 != null) {
                                    int G3 = evu0.G(message3, '\n', 0, 6);
                                    if (G3 != -1) {
                                        message3 = message3.substring(0, G3);
                                    }
                                    try {
                                        w610 g = cg90.c.g(message3);
                                        if (g != null) {
                                            t610 a4 = g.c.a(2);
                                            String str6 = a4 != null ? a4.a : null;
                                            t610 a5 = g.c.a(1);
                                            String str7 = a5 != null ? a5.a : null;
                                            if (str6 != null && str7 != null) {
                                                str3 = "отсутствуют обязательные для типа '" + str6 + "' поля '" + str7 + "'";
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                    }
                                }
                                return str3;
                            }
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                }
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public static void b(Throwable th) {
        hst hstVar = jst.e;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        xby.l(hstVar, "USER_PHOTO_UPLOAD:USER_PHOTO_COMPRESSION_ERROR", null, th, message, 2);
    }
}
