package defpackage;

import android.util.Log;
import android.util.LongSparseArray;
import io.flutter.plugins.videoplayer.c;
import java.util.Collections;
import java.util.List;
import kotlin.a;

/* loaded from: classes4.dex */
public final class bd2 {
    public static final /* synthetic */ bd2 a = new bd2();
    public static final i3y b = a.a(new ly1(14));

    public static rs10 a() {
        return (rs10) b.getValue();
    }

    public static void b(tt5 tt5Var, final c cVar) {
        Object obj = null;
        m2v m2vVar = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.initialize".concat(""), a(), obj);
        if (cVar != null) {
            final int i = 0;
            m2vVar.G(new ee5() { // from class: ad2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i2 = i;
                    cd2 cd2Var = cVar;
                    switch (i2) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c) cd2Var).a;
                                for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                                    ((nm31) longSparseArray.valueAt(i3)).b();
                                }
                                longSparseArray.clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((c) cd2Var).a((z8f) ((List) obj2).get(0))));
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            try {
                                g3 = Collections.singletonList(((c) cd2Var).b((z8f) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c) cd2Var).a;
                                nm31 nm31Var = (nm31) longSparseArray2.get(longValue);
                                if (nm31Var == null) {
                                    String k = qv10.k(longValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        k = k.concat(" and no active players created by the plugin.");
                                    }
                                    ny61.r(k);
                                } else {
                                    nm31Var.b();
                                    longSparseArray2.remove(longValue);
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            try {
                                ((c) cd2Var).c.a = ((Boolean) ((List) obj2).get(0)).booleanValue();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list = (List) obj2;
                            try {
                                g6 = Collections.singletonList(((c) cd2Var).c((String) list.get(0), (String) list.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForPlatformView".concat(""), a(), obj);
        if (cVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5() { // from class: ad2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i2;
                    cd2 cd2Var = cVar;
                    switch (i22) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c) cd2Var).a;
                                for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                                    ((nm31) longSparseArray.valueAt(i3)).b();
                                }
                                longSparseArray.clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((c) cd2Var).a((z8f) ((List) obj2).get(0))));
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            try {
                                g3 = Collections.singletonList(((c) cd2Var).b((z8f) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c) cd2Var).a;
                                nm31 nm31Var = (nm31) longSparseArray2.get(longValue);
                                if (nm31Var == null) {
                                    String k = qv10.k(longValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        k = k.concat(" and no active players created by the plugin.");
                                    }
                                    ny61.r(k);
                                } else {
                                    nm31Var.b();
                                    longSparseArray2.remove(longValue);
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            try {
                                ((c) cd2Var).c.a = ((Boolean) ((List) obj2).get(0)).booleanValue();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list = (List) obj2;
                            try {
                                g6 = Collections.singletonList(((c) cd2Var).c((String) list.get(0), (String) list.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.createForTextureView".concat(""), a(), obj);
        if (cVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5() { // from class: ad2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i3;
                    cd2 cd2Var = cVar;
                    switch (i22) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c) cd2Var).a;
                                for (int i32 = 0; i32 < longSparseArray.size(); i32++) {
                                    ((nm31) longSparseArray.valueAt(i32)).b();
                                }
                                longSparseArray.clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((c) cd2Var).a((z8f) ((List) obj2).get(0))));
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            try {
                                g3 = Collections.singletonList(((c) cd2Var).b((z8f) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c) cd2Var).a;
                                nm31 nm31Var = (nm31) longSparseArray2.get(longValue);
                                if (nm31Var == null) {
                                    String k = qv10.k(longValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        k = k.concat(" and no active players created by the plugin.");
                                    }
                                    ny61.r(k);
                                } else {
                                    nm31Var.b();
                                    longSparseArray2.remove(longValue);
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            try {
                                ((c) cd2Var).c.a = ((Boolean) ((List) obj2).get(0)).booleanValue();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list = (List) obj2;
                            try {
                                g6 = Collections.singletonList(((c) cd2Var).c((String) list.get(0), (String) list.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.dispose".concat(""), a(), obj);
        if (cVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5() { // from class: ad2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i4;
                    cd2 cd2Var = cVar;
                    switch (i22) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c) cd2Var).a;
                                for (int i32 = 0; i32 < longSparseArray.size(); i32++) {
                                    ((nm31) longSparseArray.valueAt(i32)).b();
                                }
                                longSparseArray.clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((c) cd2Var).a((z8f) ((List) obj2).get(0))));
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            try {
                                g3 = Collections.singletonList(((c) cd2Var).b((z8f) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c) cd2Var).a;
                                nm31 nm31Var = (nm31) longSparseArray2.get(longValue);
                                if (nm31Var == null) {
                                    String k = qv10.k(longValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        k = k.concat(" and no active players created by the plugin.");
                                    }
                                    ny61.r(k);
                                } else {
                                    nm31Var.b();
                                    longSparseArray2.remove(longValue);
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            try {
                                ((c) cd2Var).c.a = ((Boolean) ((List) obj2).get(0)).booleanValue();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list = (List) obj2;
                            try {
                                g6 = Collections.singletonList(((c) cd2Var).c((String) list.get(0), (String) list.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.setMixWithOthers".concat(""), a(), obj);
        if (cVar != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5() { // from class: ad2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i5;
                    cd2 cd2Var = cVar;
                    switch (i22) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c) cd2Var).a;
                                for (int i32 = 0; i32 < longSparseArray.size(); i32++) {
                                    ((nm31) longSparseArray.valueAt(i32)).b();
                                }
                                longSparseArray.clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((c) cd2Var).a((z8f) ((List) obj2).get(0))));
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            try {
                                g3 = Collections.singletonList(((c) cd2Var).b((z8f) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c) cd2Var).a;
                                nm31 nm31Var = (nm31) longSparseArray2.get(longValue);
                                if (nm31Var == null) {
                                    String k = qv10.k(longValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        k = k.concat(" and no active players created by the plugin.");
                                    }
                                    ny61.r(k);
                                } else {
                                    nm31Var.b();
                                    longSparseArray2.remove(longValue);
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            try {
                                ((c) cd2Var).c.a = ((Boolean) ((List) obj2).get(0)).booleanValue();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list = (List) obj2;
                            try {
                                g6 = Collections.singletonList(((c) cd2Var).c((String) list.get(0), (String) list.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.video_player_android.AndroidVideoPlayerApi.getLookupKeyForAsset".concat(""), a(), obj);
        if (cVar == null) {
            m2vVar6.G(null);
        } else {
            final int i6 = 5;
            m2vVar6.G(new ee5() { // from class: ad2
                @Override // defpackage.ee5
                public final void m(Object obj2, ce5 ce5Var) {
                    List g;
                    List g2;
                    List g3;
                    List g4;
                    List g5;
                    List g6;
                    int i22 = i6;
                    cd2 cd2Var = cVar;
                    switch (i22) {
                        case 0:
                            try {
                                LongSparseArray longSparseArray = ((c) cd2Var).a;
                                for (int i32 = 0; i32 < longSparseArray.size(); i32++) {
                                    ((nm31) longSparseArray.valueAt(i32)).b();
                                }
                                longSparseArray.clear();
                                g = Collections.singletonList(null);
                            } catch (Throwable th) {
                                g = scc.g(th.getClass().getSimpleName(), th.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                            }
                            ce5Var.a(g);
                            break;
                        case 1:
                            try {
                                g2 = Collections.singletonList(Long.valueOf(((c) cd2Var).a((z8f) ((List) obj2).get(0))));
                            } catch (Throwable th2) {
                                g2 = scc.g(th2.getClass().getSimpleName(), th2.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                            }
                            ce5Var.a(g2);
                            break;
                        case 2:
                            try {
                                g3 = Collections.singletonList(((c) cd2Var).b((z8f) ((List) obj2).get(0)));
                            } catch (Throwable th3) {
                                g3 = scc.g(th3.getClass().getSimpleName(), th3.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                            }
                            ce5Var.a(g3);
                            break;
                        case 3:
                            long longValue = ((Long) ((List) obj2).get(0)).longValue();
                            try {
                                LongSparseArray longSparseArray2 = ((c) cd2Var).a;
                                nm31 nm31Var = (nm31) longSparseArray2.get(longValue);
                                if (nm31Var == null) {
                                    String k = qv10.k(longValue, "No player found with playerId <", ">");
                                    if (longSparseArray2.size() == 0) {
                                        k = k.concat(" and no active players created by the plugin.");
                                    }
                                    ny61.r(k);
                                } else {
                                    nm31Var.b();
                                    longSparseArray2.remove(longValue);
                                }
                                g4 = Collections.singletonList(null);
                            } catch (Throwable th4) {
                                g4 = scc.g(th4.getClass().getSimpleName(), th4.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th4), th4.getCause()));
                            }
                            ce5Var.a(g4);
                            break;
                        case 4:
                            try {
                                ((c) cd2Var).c.a = ((Boolean) ((List) obj2).get(0)).booleanValue();
                                g5 = Collections.singletonList(null);
                            } catch (Throwable th5) {
                                g5 = scc.g(th5.getClass().getSimpleName(), th5.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th5), th5.getCause()));
                            }
                            ce5Var.a(g5);
                            break;
                        default:
                            List list = (List) obj2;
                            try {
                                g6 = Collections.singletonList(((c) cd2Var).c((String) list.get(0), (String) list.get(1)));
                            } catch (Throwable th6) {
                                g6 = scc.g(th6.getClass().getSimpleName(), th6.toString(), smw0.j("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th6), th6.getCause()));
                            }
                            ce5Var.a(g6);
                            break;
                    }
                }
            });
        }
    }
}
