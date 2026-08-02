package defpackage;

import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.navigation.automotive.Annotator;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class bmj extends k45 {
    public final /* synthetic */ int b;
    public final fmj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmj(ssr ssrVar, fmj fmjVar, int i) {
        super(ssrVar, "directions_annotator");
        this.b = i;
        switch (i) {
            case 1:
                super(ssrVar, "directions_windshield");
                this.c = fmjVar;
                break;
            default:
                this.c = fmjVar;
                break;
        }
    }

    public Annotator b() {
        return ((Navigation) this.c.a).getGuidance().getAnnotator();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        switch (this.b) {
            case 0:
                Object obj = x920Var.b;
                String str = x920Var.a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -840405966:
                            if (str.equals("unmute")) {
                                b().unmute();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case -775190565:
                            if (str.equals("getAnnotatedRoadEvents")) {
                                ((ba20) da20Var).success(Integer.valueOf(b().getAnnotatedRoadEvents()));
                                break;
                            }
                            break;
                        case 3363353:
                            if (str.equals("mute")) {
                                b().mute();
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 537937743:
                            if (str.equals("setAnnotatedRoadEvents")) {
                                b().setAnnotatedRoadEvents(((Integer) obj).intValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                        case 684656027:
                            if (str.equals("getAnnotatedEvents")) {
                                ((ba20) da20Var).success(Integer.valueOf(b().getAnnotatedEvents()));
                                break;
                            }
                            break;
                        case 1604689679:
                            if (str.equals("setAnnotatedEvents")) {
                                b().setAnnotatedEvents(((Integer) obj).intValue());
                                ((ba20) da20Var).success(null);
                                break;
                            }
                            break;
                    }
                }
                ((ba20) da20Var).notImplemented();
                break;
            default:
                if (!jl40.l(x920Var.a, "getManoeuvres")) {
                    ((ba20) da20Var).notImplemented();
                    break;
                } else {
                    Guidance guidance = ((Navigation) this.c.a).getGuidance();
                    DrivingRoute currentRoute = guidance.getCurrentRoute();
                    List<UpcomingManoeuvre> manoeuvres = guidance.getWindshield().getManoeuvres();
                    ArrayList arrayList = new ArrayList(tcc.n(manoeuvres, 10));
                    Iterator<T> it = manoeuvres.iterator();
                    while (it.hasNext()) {
                        arrayList.add(rsq0.p((UpcomingManoeuvre) it.next(), currentRoute));
                    }
                    ((ba20) da20Var).success(arrayList);
                    break;
                }
        }
    }
}
