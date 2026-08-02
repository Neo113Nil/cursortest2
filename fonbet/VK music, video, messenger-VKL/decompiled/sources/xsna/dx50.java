package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.core.fragments.FragmentImpl;
import com.vk.home.HomeFragment2;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dx50 implements izs {
    public final /* synthetic */ nx50 b;

    public /* synthetic */ dx50(nx50 nx50Var) {
        this.b = nx50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0142, code lost:
    
        if (r2 == null) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object obj2;
        boolean z;
        ArrayList arrayList;
        Iterator it;
        View view;
        Object obj3;
        List list = (List) obj;
        nx50 nx50Var = this.b;
        qot0 qot0Var = nx50Var.I0;
        FragmentImpl m = nx50Var.y0().m();
        boolean z2 = (m == null || m.isHidden() || !m.getClass().equals(HomeFragment2.class)) ? false : true;
        rot0 rot0Var = qot0Var.l;
        List<eed> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            eed b = qot0Var.b((eed) it2.next(), true);
            if (b != null) {
                arrayList2.add(b);
            }
        }
        if (arrayList2.isEmpty()) {
            qot0Var.s = null;
            utj utjVar = qot0Var.q;
            if (utjVar != null) {
                utjVar.b();
            }
        }
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            eed b2 = qot0Var.b((eed) obj2, false);
            if (b2 != null && (b2 instanceof jed)) {
                jed jedVar = (jed) b2;
                boolean c = jedVar.c();
                xdd xddVar = jedVar.a;
                if (!c) {
                    ClipUploadData d = xddVar.d();
                    if (!((Boolean) qot0Var.k.getValue()).booleanValue() || !jedVar.d()) {
                        if (d.Ab().w0() != null && jedVar.d()) {
                            break;
                        }
                    } else if (xddVar.c() != null) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        eed eedVar = (eed) obj2;
        if (eedVar != null) {
            int f = eedVar.a.f();
            Integer num = qot0Var.s;
            if (num == null || f != num.intValue()) {
                z = true;
                if (eedVar != null) {
                    qot0Var.s = Integer.valueOf(eedVar.a.f());
                    qot0Var.t = z;
                }
                if (qot0Var.s != null && qot0Var.p) {
                    arrayList = new ArrayList();
                    it = list2.iterator();
                    while (it.hasNext()) {
                        eed b3 = qot0Var.b((eed) it.next(), true);
                        if (b3 != null) {
                            arrayList.add(b3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (eed eedVar2 : list2) {
                            if (qot0Var.b(eedVar2, true) != null) {
                                xdd xddVar2 = eedVar2.a;
                                if (qot0Var.t) {
                                    qot0Var.t = false;
                                    view = (View) rot0Var.d.getValue();
                                    view.findViewById(R.id.cancel_button).setOnClickListener(new m1l(3, qot0Var, xddVar2));
                                } else {
                                    view = qot0Var.o;
                                }
                                View view2 = view;
                                if (view2.equals(qot0Var.o) || qot0Var.a(xddVar2.c(), 0L, view2, true)) {
                                    qot0Var.i(z2);
                                    TextView textView = (TextView) view2.findViewById(R.id.status);
                                    xddVar2.getClass();
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj4 : list2) {
                                        if (qot0Var.b((eed) obj4, true) != null) {
                                            arrayList3.add(obj4);
                                        }
                                    }
                                    NavigationDelegateActivity navigationDelegateActivity = qot0Var.a;
                                    ArrayList arrayList4 = new ArrayList();
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        Object next = it4.next();
                                        eed eedVar3 = (eed) next;
                                        if ((eedVar3 instanceof jed) || (eedVar3 instanceof med)) {
                                            arrayList4.add(next);
                                        }
                                    }
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = arrayList3.iterator();
                                    while (it5.hasNext()) {
                                        Object next2 = it5.next();
                                        if (next2 instanceof ydd) {
                                            arrayList5.add(next2);
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it6 = arrayList3.iterator();
                                    while (it6.hasNext()) {
                                        Object next3 = it6.next();
                                        if (next3 instanceof ged) {
                                            arrayList6.add(next3);
                                        }
                                    }
                                    if (arrayList6.size() == arrayList3.size()) {
                                        qot0Var.h(navigationDelegateActivity.getString(R.string.video_upload_clip_failed));
                                    } else if (arrayList5.size() == arrayList3.size()) {
                                        qot0Var.h(navigationDelegateActivity.getString(R.string.video_upload_progress_snack_canceled));
                                    } else {
                                        Iterator it7 = arrayList3.iterator();
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = it7.next();
                                            if (((eed) obj3) instanceof jed) {
                                                break;
                                            }
                                        }
                                        jed jedVar2 = obj3 instanceof jed ? (jed) obj3 : null;
                                        if (jedVar2 == null || !jedVar2.c()) {
                                            Iterator it8 = arrayList4.iterator();
                                            double d2 = 0.0d;
                                            while (it8.hasNext()) {
                                                eed eedVar4 = (eed) it8.next();
                                                jed jedVar3 = eedVar4 instanceof jed ? (jed) eedVar4 : null;
                                                d2 += (jedVar3 != null ? Float.valueOf(jedVar3.b()) : Double.valueOf(ConnectivityTracker.DEFAULT_UPLINK_BITRATE)).doubleValue();
                                            }
                                            int size = (int) ((d2 / arrayList4.size()) * 100);
                                            List c0 = drm0.c0(textView.getText(), new String[]{" · "}, 0, 6);
                                            StringBuilder sb = new StringBuilder();
                                            sb.append((String) c0.get(0));
                                            sb.append(" · " + size + '%');
                                            textView.setText(sb.toString());
                                        } else {
                                            qot0Var.g((View) rot0Var.e.getValue());
                                        }
                                    }
                                }
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                return s3q0.a;
            }
        }
        z = false;
        if (eedVar != null) {
        }
        if (qot0Var.s != null) {
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        return s3q0.a;
    }
}
