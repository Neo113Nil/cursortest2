package xsna;

import android.R;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.music.reactions.Reaction;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gm50;
import xsna.kxi0;
import xsna.smm0;
import xsna.sx40;
import xsna.tx40;
import xsna.uoj0;
import xsna.utq0;
import xsna.xn50;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class twi0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ twi0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [T, io.reactivex.rxjava3.disposables.c] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.b) {
            case 0:
                vwi0 vwi0Var = (vwi0) this.c;
                kxi0 kxi0Var = (kxi0) this.d;
                gm50.a.a(vwi0Var, ((ywi0.e) obj).a, new z6f0(kxi0Var, 8));
                kxi0Var.a.onNext(kxi0.a.MAIN_CALL);
                return s3q0.a;
            case 1:
                uoj0 uoj0Var = (uoj0) this.c;
                uoj0.a aVar = (uoj0.a) this.d;
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new joj0((VideoFile) it.next(), aVar.a, aVar.b));
                }
                uoj0Var.c = arrayList;
                uoj0Var.a.invoke(arrayList);
                return s3q0.a;
            case 2:
                ((Ref$ObjectRef) this.c).element = znk0.i((b3k0) this.d, null);
                return s3q0.a;
            case 3:
                qkk0 qkk0Var = (qkk0) this.c;
                VkScreenSpinner.SpinnerMode spinnerMode = (VkScreenSpinner.SpinnerMode) this.d;
                Context context = (Context) obj;
                VkScreenSpinner m = qkk0.m(qkk0Var, context, VkSpinnerContent.SpinnerState.Loading, spinnerMode, spinnerMode.name(), 40);
                m.setColor(context.getColor(R.color.holo_orange_dark));
                return m;
            case 4:
                xn50.a.c((jfl0) this.c, new sx40.d0((Reaction) obj, ((tx40.n) this.d).a.b));
                return s3q0.a;
            case 5:
                dhl0 dhl0Var = (dhl0) this.c;
                Collection collection = (Collection) this.d;
                synchronized (dhl0Var.g) {
                    try {
                        linkedHashMap = new LinkedHashMap();
                        dhl0Var.h.clear();
                        dhl0Var.h.ensureCapacity(collection.size());
                        for (Object obj2 : collection) {
                            Object obj3 = dhl0Var.g.get(obj2);
                            if (obj3 != null) {
                                linkedHashMap.put(dhl0Var.c.invoke(obj3), obj3);
                            } else {
                                dhl0Var.h.add(obj2);
                            }
                        }
                        if (!dhl0Var.h.isEmpty()) {
                            Map map = (Map) dhl0Var.d.invoke(dhl0Var.h);
                            for (Map.Entry entry : map.entrySet()) {
                                dhl0Var.g.put(entry.getKey(), entry.getValue());
                            }
                            linkedHashMap.putAll(map);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return linkedHashMap;
            case 6:
                ((smm0.a) this.c).b.remove((otz) this.d);
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            case 7:
                utq0.a aVar2 = (utq0.a) this.c;
                utq0 utq0Var = (utq0) this.d;
                ExtendedUserProfile extendedUserProfile = aVar2.e;
                if (extendedUserProfile == null) {
                    return s3q0.a;
                }
                utq0Var.o.B(new f.e.m0(extendedUserProfile));
                return s3q0.a;
            default:
                dnt0 dnt0Var = (dnt0) this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.d;
                Object obj4 = (RecyclerView.e0) obj;
                ent0 ent0Var = obj4 instanceof ent0 ? (ent0) obj4 : null;
                mnt0 c = ent0Var != null ? x5t0.c(ent0Var) : null;
                if (c != null) {
                    c.setVideoFocused(c == dnt0Var);
                }
                ref$BooleanRef.element = ref$BooleanRef.element || c == dnt0Var;
                return s3q0.a;
        }
    }
}
