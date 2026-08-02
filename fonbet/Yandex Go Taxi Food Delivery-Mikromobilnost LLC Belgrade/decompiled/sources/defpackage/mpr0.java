package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mpr0 {
    public static final /* synthetic */ mpr0 a = new mpr0();
    public static final i3y b = a.a(new mkr0(11));

    public static rs10 a() {
        return (rs10) b.getValue();
    }

    public static void b(tt5 tt5Var, final npr0 npr0Var, String str) {
        String concat = str.length() > 0 ? Extension.DOT_CHAR.concat(str) : "";
        o501 d = tt5Var.d(new st5());
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i = 6;
            m2vVar.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i2 = i;
                    npr0 npr0Var2 = npr0Var;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i2 = 12;
            m2vVar2.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i2;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i3 = 13;
            m2vVar3.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i3;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i4 = 14;
            m2vVar4.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i4;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i5 = 0;
            m2vVar5.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i5;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i6 = 1;
            m2vVar6.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i6;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i7 = 2;
            m2vVar7.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i7;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar7.G(null);
        }
        m2v m2vVar8 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i8 = 3;
            m2vVar8.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i8;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar8.G(null);
        }
        m2v m2vVar9 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i9 = 4;
            m2vVar9.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i9;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar9.G(null);
        }
        m2v m2vVar10 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i10 = 5;
            m2vVar10.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i10;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar10.G(null);
        }
        m2v m2vVar11 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i11 = 7;
            m2vVar11.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i11;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar11.G(null);
        }
        m2v m2vVar12 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i12 = 8;
            m2vVar12.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i12;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar12.G(null);
        }
        m2v m2vVar13 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i13 = 9;
            m2vVar13.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i13;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar13.G(null);
        }
        m2v m2vVar14 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll".concat(concat), a(), d);
        if (npr0Var != null) {
            final int i14 = 10;
            m2vVar14.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i14;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        } else {
            m2vVar14.G(null);
        }
        m2v m2vVar15 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys".concat(concat), a(), d);
        if (npr0Var == null) {
            m2vVar15.G(null);
        } else {
            final int i15 = 11;
            m2vVar15.G(new ee5() { // from class: lpr0
                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    List g7;
                    List g8;
                    List g9;
                    List g10;
                    List g11;
                    List g12;
                    List g13;
                    List g14;
                    List g15;
                    int i22 = i15;
                    npr0 npr0Var2 = npr0Var;
                    switch (i22) {
                        case 0:
                            List list = (List) obj;
                            try {
                                npr0Var2.w((String) list.get(0), (String) list.get(1), (spr0) list.get(2));
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            List list2 = (List) obj;
                            try {
                                npr0Var2.o((String) list2.get(0), (List) list2.get(1), (spr0) list2.get(2));
                                g2 = Collections.singletonList(null);
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            List list3 = (List) obj;
                            try {
                                g3 = Collections.singletonList(npr0Var2.p((String) list3.get(0), (spr0) list3.get(1)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            List list4 = (List) obj;
                            try {
                                g4 = Collections.singletonList(npr0Var2.d((String) list4.get(0), (spr0) list4.get(1)));
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            List list5 = (List) obj;
                            try {
                                g5 = Collections.singletonList(npr0Var2.n((String) list5.get(0), (spr0) list5.get(1)));
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        case 5:
                            List list6 = (List) obj;
                            try {
                                g6 = Collections.singletonList(npr0Var2.r((String) list6.get(0), (spr0) list6.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                        case 6:
                            List list7 = (List) obj;
                            try {
                                npr0Var2.f((String) list7.get(0), ((Boolean) list7.get(1)).booleanValue(), (spr0) list7.get(2));
                                g7 = Collections.singletonList(null);
                            } catch (Throwable th7) {
                                g7 = scc.g(th7.getClass().getSimpleName(), th7.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th7), th7.getCause()));
                            }
                            ce5Var.a(g7);
                            break;
                        case 7:
                            List list8 = (List) obj;
                            try {
                                g8 = Collections.singletonList(npr0Var2.g((String) list8.get(0), (spr0) list8.get(1)));
                            } catch (Throwable th8) {
                                g8 = scc.g(th8.getClass().getSimpleName(), th8.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th8), th8.getCause()));
                            }
                            ce5Var.a(g8);
                            break;
                        case 8:
                            List list9 = (List) obj;
                            try {
                                g9 = Collections.singletonList(npr0Var2.u((String) list9.get(0), (spr0) list9.get(1)));
                            } catch (Throwable th9) {
                                g9 = scc.g(th9.getClass().getSimpleName(), th9.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th9), th9.getCause()));
                            }
                            ce5Var.a(g9);
                            break;
                        case 9:
                            List list10 = (List) obj;
                            try {
                                npr0Var2.v((List) list10.get(0), (spr0) list10.get(1));
                                g10 = Collections.singletonList(null);
                            } catch (Throwable th10) {
                                g10 = scc.g(th10.getClass().getSimpleName(), th10.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th10), th10.getCause()));
                            }
                            ce5Var.a(g10);
                            break;
                        case 10:
                            List list11 = (List) obj;
                            try {
                                g11 = Collections.singletonList(npr0Var2.m((List) list11.get(0), (spr0) list11.get(1)));
                            } catch (Throwable th11) {
                                g11 = scc.g(th11.getClass().getSimpleName(), th11.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th11), th11.getCause()));
                            }
                            ce5Var.a(g11);
                            break;
                        case 11:
                            List list12 = (List) obj;
                            try {
                                g12 = Collections.singletonList(npr0Var2.e((List) list12.get(0), (spr0) list12.get(1)));
                            } catch (Throwable th12) {
                                g12 = scc.g(th12.getClass().getSimpleName(), th12.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th12), th12.getCause()));
                            }
                            ce5Var.a(g12);
                            break;
                        case 12:
                            List list13 = (List) obj;
                            try {
                                npr0Var2.y((String) list13.get(0), (String) list13.get(1), (spr0) list13.get(2));
                                g13 = Collections.singletonList(null);
                            } catch (Throwable th13) {
                                g13 = scc.g(th13.getClass().getSimpleName(), th13.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th13), th13.getCause()));
                            }
                            ce5Var.a(g13);
                            break;
                        case 13:
                            List list14 = (List) obj;
                            try {
                                npr0Var2.i((String) list14.get(0), ((Long) list14.get(1)).longValue(), (spr0) list14.get(2));
                                g14 = Collections.singletonList(null);
                            } catch (Throwable th14) {
                                g14 = scc.g(th14.getClass().getSimpleName(), th14.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th14), th14.getCause()));
                            }
                            ce5Var.a(g14);
                            break;
                        default:
                            List list15 = (List) obj;
                            try {
                                npr0Var2.E((String) list15.get(0), ((Double) list15.get(1)).doubleValue(), (spr0) list15.get(2));
                                g15 = Collections.singletonList(null);
                            } catch (Throwable th15) {
                                g15 = scc.g(th15.getClass().getSimpleName(), th15.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th15), th15.getCause()));
                            }
                            ce5Var.a(g15);
                            break;
                    }
                }
            });
        }
    }
}
