package defpackage;

import android.graphics.Point;
import android.view.View;
import com.yandex.mobile.ads.R$id;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Result;
import kotlin.sequences.a;
import yads.bh2;
import yads.dh2;
import yads.gu;

/* loaded from: classes7.dex */
public final class ke71 {
    public final md71 a;
    public final ec71 b;
    public final si61 c;

    public ke71() {
        md71 md71Var = new md71();
        ec71 ec71Var = new ec71();
        si61 si61Var = new si61();
        this.a = md71Var;
        this.b = ec71Var;
        this.c = si61Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:13|(1:90)|17|(1:89)|21|(3:23|(1:25)|(21:27|(1:29)|30|31|32|33|(1:35)|36|(7:68|69|(1:75)|77|(1:79)|80|(12:82|(1:40)|41|42|43|44|(1:46)|47|(6:53|54|(1:56)|58|(1:60)|61)|49|(1:51)|52))|38|(0)|41|42|43|44|(0)|47|(0)|49|(0)|52))|88|(0)|30|31|32|33|(0)|36|(0)|38|(0)|41|42|43|44|(0)|47|(0)|49|(0)|52) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015a, code lost:
    
        if (r10 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
    
        r10 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d9, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00da, code lost:
    
        r10 = new kotlin.Result.Failure(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0051 A[EDGE_INSN: B:11:0x0051->B:12:0x0051 BREAK  A[LOOP:0: B:2:0x000f->B:93:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[LOOP:0: B:2:0x000f->B:93:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap a(View view, Long l) {
        String str;
        Pair pair;
        String str2;
        String str3;
        zy11 zy11Var;
        Object failure;
        View view2;
        Object failure2;
        String str4;
        Object failure3;
        View view3;
        Object failure4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = a.d(gu.w, view).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            View view4 = (View) it.next();
            if (view4 instanceof bh2) {
                this.b.getClass();
                d971 touchRecorder = ((bh2) view4).getTouchRecorder();
                if (touchRecorder != null) {
                    pair = new Pair(view4, touchRecorder);
                    if (pair == null) {
                        break;
                    }
                }
                pair = null;
                if (pair == null) {
                }
            } else {
                if (view4 instanceof dh2) {
                    this.c.getClass();
                    d971 a = ((dh2) view4).a();
                    if (a != null) {
                        pair = new Pair(view4, a);
                        if (pair == null) {
                        }
                    }
                }
                pair = null;
                if (pair == null) {
                }
            }
        }
        if (pair != null) {
            View view5 = (View) pair.getFirst();
            Point point = ((d971) pair.getSecond()).a;
            if (point == null || (str2 = Integer.valueOf(point.x).toString()) == null) {
                str2 = "";
            }
            linkedHashMap.put("{CLICK_X}", str2);
            if (point == null || (str3 = Integer.valueOf(point.y).toString()) == null) {
                str3 = "";
            }
            linkedHashMap.put("{CLICK_Y}", str3);
            linkedHashMap.put("{WIDTH}", String.valueOf(view5.getWidth()));
            linkedHashMap.put("{HEIGHT}", String.valueOf(view5.getHeight()));
            if (l != null) {
                if (l.longValue() < 0) {
                    l = null;
                }
                if (l != null) {
                    linkedHashMap.put("{CLICK_TIME}", String.valueOf(l.longValue()));
                    zy11Var = zy11.a;
                    if (zy11Var == null) {
                        linkedHashMap.put("{CLICK_TIME}", "");
                    }
                    md71 md71Var = this.a;
                    md71Var.getClass();
                    d471 d471Var = md71Var.a;
                    failure = view5.findViewById(R$id.close);
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    view2 = (View) failure;
                    if (view2 == null) {
                        try {
                            failure2 = view5.findViewWithTag("close");
                            if (failure2 == null && (failure2 = view5.findViewWithTag("skip_button")) == null && (failure2 = view5.findViewWithTag("instream_skip")) == null) {
                                failure2 = view5.findViewWithTag("yma_close_button");
                            }
                        } catch (Throwable th) {
                            failure2 = new Result.Failure(th);
                        }
                        if (failure2 instanceof Result.Failure) {
                            failure2 = null;
                        }
                        view2 = (View) failure2;
                        if (view2 == null) {
                            str4 = null;
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap.put("{CLOSE_LOCATION}", str4);
                            failure3 = view5.findViewById(R$id.feedback);
                            if (failure3 instanceof Result.Failure) {
                                failure3 = null;
                            }
                            view3 = (View) failure3;
                            if (view3 == null) {
                                try {
                                    failure4 = view5.findViewWithTag("feedback");
                                    if (failure4 == null) {
                                        failure4 = view5.findViewWithTag("yma_feedback");
                                    }
                                } catch (Throwable th2) {
                                    failure4 = new Result.Failure(th2);
                                }
                                if (failure4 instanceof Result.Failure) {
                                    failure4 = null;
                                }
                                view3 = (View) failure4;
                            }
                            str = d471Var.a(view3, view5);
                            linkedHashMap.put("{FEEDBACK_LOCATION}", str != null ? str : "");
                        }
                    }
                    str4 = d471Var.a(view2, view5);
                    if (str4 == null) {
                    }
                    linkedHashMap.put("{CLOSE_LOCATION}", str4);
                    failure3 = view5.findViewById(R$id.feedback);
                    if (failure3 instanceof Result.Failure) {
                    }
                    view3 = (View) failure3;
                    if (view3 == null) {
                    }
                    str = d471Var.a(view3, view5);
                    linkedHashMap.put("{FEEDBACK_LOCATION}", str != null ? str : "");
                }
            }
            zy11Var = null;
            if (zy11Var == null) {
            }
            md71 md71Var2 = this.a;
            md71Var2.getClass();
            d471 d471Var2 = md71Var2.a;
            failure = view5.findViewById(R$id.close);
            if (failure instanceof Result.Failure) {
            }
            view2 = (View) failure;
            if (view2 == null) {
            }
            str4 = d471Var2.a(view2, view5);
            if (str4 == null) {
            }
            linkedHashMap.put("{CLOSE_LOCATION}", str4);
            failure3 = view5.findViewById(R$id.feedback);
            if (failure3 instanceof Result.Failure) {
            }
            view3 = (View) failure3;
            if (view3 == null) {
            }
            str = d471Var2.a(view3, view5);
            linkedHashMap.put("{FEEDBACK_LOCATION}", str != null ? str : "");
        }
        return linkedHashMap;
    }
}
