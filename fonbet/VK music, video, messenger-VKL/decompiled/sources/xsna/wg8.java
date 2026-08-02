package xsna;

import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.voip.ui.onboarding.features.FeatureId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.g69;
import xsna.ghw0;
import xsna.qr9;
import xsna.xn50;

/* compiled from: BroadcastLaunchView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class wg8 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg8(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((xg8) this.receiver).f.setText((CharSequence) obj);
                return s3q0.a;
            case 1:
                g69 g69Var = (g69) obj;
                h69 h69Var = (h69) this.receiver;
                u0d u0dVar = h69Var.b;
                io.reactivex.rxjava3.subjects.d<o69> dVar = h69Var.c;
                o69 P0 = dVar.P0();
                if (g69Var instanceof g69.d) {
                    List<suq> list = ((g69.d) g69Var).a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    for (suq suqVar : list) {
                        FeatureId featureId = suqVar.a;
                        ArrayList arrayList2 = arrayList;
                        if (!Preference.e(((UserId) u0dVar.invoke()).b, featureId.h()).getBoolean("feature_used", false)) {
                            linkedHashMap.put(featureId, suqVar);
                            if (pla.e().b().a(featureId.h())) {
                                arrayList2.add(featureId);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    ArrayList arrayList3 = arrayList;
                    Collection values = linkedHashMap.values();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : values) {
                        if (!((suq) obj2).b) {
                            arrayList4.add(obj2);
                        }
                    }
                    boolean z = !arrayList4.isEmpty();
                    P0.getClass();
                    dVar.onNext(new o69(linkedHashMap, z));
                    h69Var.a.a(new ghw0.q(arrayList3));
                } else if (g69Var instanceof g69.b) {
                    Map<FeatureId, suq> map = P0.b;
                    FeatureId featureId2 = ((g69.b) g69Var).a;
                    suq suqVar2 = map.get(featureId2);
                    if (suqVar2 != null) {
                        FeatureId featureId3 = suqVar2.a;
                        pla.e().b().b(featureId2.h());
                        qaj0.c(Preference.e(((UserId) u0dVar.invoke()).b, featureId2.h()), "banner_disposed", Boolean.TRUE);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (suq suqVar3 : P0.b.values()) {
                            FeatureId featureId4 = suqVar3.a;
                            if (featureId4 != featureId3) {
                                if (suqVar3.b) {
                                    qaj0.c(Preference.e(((UserId) u0dVar.invoke()).b, featureId4.h()), "feature_used", Boolean.TRUE);
                                } else {
                                    linkedHashMap2.put(featureId4, suqVar3);
                                }
                            }
                        }
                        linkedHashMap2.put(featureId2, new suq(featureId3, Preference.e(((UserId) u0dVar.invoke()).b, featureId2.h()).getBoolean("banner_disposed", false), suqVar2.c));
                        dVar.onNext(new o69(linkedHashMap2, linkedHashMap2.size() > 1));
                    }
                } else if (g69Var instanceof g69.c) {
                    FeatureId featureId5 = ((g69.c) g69Var).a;
                    if (h69Var.f.g() != 0) {
                        h69Var.a(P0, featureId5);
                        h69Var.g.onNext(featureId5);
                    }
                } else if (g69Var instanceof g69.a) {
                    for (FeatureId featureId6 : ((g69.a) g69Var).a) {
                        if (P0.b.get(featureId6) != null) {
                            pla.e().b().b(featureId6.h());
                        }
                    }
                } else {
                    if (!(g69Var instanceof g69.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h69Var.a(P0, ((g69.e) g69Var).a);
                }
                return s3q0.a;
            case 2:
                ((com.vk.channels.impl.channel_screen.send_msg.a) this.receiver).getClass();
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 3:
                ((f4z) this.receiver).b((ruf) obj);
                return s3q0.a;
            case 4:
                ((com.vk.profile.community.details.impl.name_history.b) this.receiver).T((com.vk.profile.community.details.impl.name_history.c) obj);
                return s3q0.a;
            case 5:
                ((eka0) this.receiver).g.setText((CharSequence) obj);
                return s3q0.a;
            case 6:
                ofk0 ofk0Var = (ofk0) this.receiver;
                ofk0Var.getClass();
                par0.a.getClass();
                par0.d((Throwable) obj);
                ofk0Var.b(new qr9.d(ofk0Var.b));
                return s3q0.a;
            case 7:
                ((wzh0) this.receiver).i(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 8:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) this.receiver;
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, (com.vk.video.ui.discovery.minimizable.c) obj);
                return s3q0.a;
            default:
                ((xgx0) this.receiver).getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg8(Object obj, int i) {
        super(1, obj, f4z.class, "notify", "notify(Ljava/lang/Object;)V", 0);
        this.b = i;
        switch (i) {
            case 9:
                super(1, obj, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
