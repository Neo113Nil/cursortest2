package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.concurrent.futures.b;
import androidx.core.view.ViewCompat$Api21Impl;
import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;
import com.ybsdk.core.common.domain.entities.cache.ExpireableEntity$Behaviour;
import com.ybsdk.feature.divkit.api.domain.LocalVariableMutation;
import com.ybsdk.feature.divkit.api.dto.DivKitDataV2Dto;
import com.ybsdk.feature.pfm.internal.data.local.PfmLocalFilter$Settings;
import defpackage.lz;
import defpackage.np31;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;

/* loaded from: classes3.dex */
public abstract class ni91 {
    public static void a(euy euyVar, iqs iqsVar, Executor executor) {
        iqsVar.getClass();
        euyVar.c(new uqs(0, euyVar, iqsVar), executor);
    }

    public static lry b(List list) {
        return new lry(new ArrayList(list), true, geb1.b());
    }

    public static final ArrayList c(DivKitDataV2Dto divKitDataV2Dto, yvj0 yvj0Var) {
        ArrayList arrayList = new ArrayList();
        List<DataEntryDescriptorDto> variables = divKitDataV2Dto.getVariables();
        if (variables != null) {
            for (DataEntryDescriptorDto dataEntryDescriptorDto : variables) {
                aso c = yvj0Var.c(dataEntryDescriptorDto);
                aso asoVar = c != null ? new aso(new c5z(dataEntryDescriptorDto.getKey(), (String) c.a), c.b, c.c, c.d) : null;
                if (asoVar != null) {
                    arrayList.add(asoVar);
                    aog aogVar = (aog) yvj0Var.d.get(dataEntryDescriptorDto.getKey());
                    boolean z = false;
                    if (aogVar != null && aogVar.d) {
                        z = true;
                    }
                    arrayList.add(new aso(new c5z(b64.j(dataEntryDescriptorDto.getKey(), "_shimmer_shown"), String.valueOf(z), Collections.singletonList(LocalVariableMutation.DISABLE_SHIMMER)), asoVar.b, asoVar.c, ExpireableEntity$Behaviour.OPTIONAL));
                }
            }
        }
        return arrayList;
    }

    public static Object d(Future future) {
        d6z.y("Future was expected to be done, " + future, future.isDone());
        return e(future);
    }

    public static Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static hiv f(Object obj) {
        return obj == null ? hiv.c : new hiv(0, obj);
    }

    public static euy g(euy euyVar) {
        euyVar.getClass();
        return euyVar.isDone() ? euyVar : jx81.r(new qqs(euyVar, 1));
    }

    public static void h(euy euyVar, b bVar) {
        i(true, euyVar, bVar, geb1.b());
    }

    public static void i(boolean z, euy euyVar, b bVar, zkj zkjVar) {
        euyVar.getClass();
        bVar.getClass();
        zkjVar.getClass();
        a(euyVar, new jln(24, bVar), zkjVar);
        if (z) {
            bVar.a(new i8m(14, euyVar), geb1.b());
        }
    }

    public static void j(final View view, final ax60 ax60Var) {
        gq31 gq31Var;
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        t2w t2wVar = new t2w();
        i4u i4uVar = new i4u(t2wVar.a, t2wVar.b, new t26(25, ref$BooleanRef, ax60Var, view), t2wVar.c);
        Object tag = view.getTag(jch0.insetter_initial_state);
        bv31 bv31Var = tag instanceof bv31 ? (bv31) tag : null;
        if (bv31Var == null) {
            gq31 gq31Var2 = new gq31(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                gq31Var = new gq31(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            } else {
                gq31Var = gq31.e;
            }
            bv31Var = new bv31(gq31Var2, gq31Var);
            view.setTag(jch0.insetter_initial_state, bv31Var);
        }
        h2r h2rVar = new h2r(11, i4uVar, bv31Var);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(view, h2rVar);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: dev.chrisbanes.insetter.Insetter$applyToView$$inlined$doOnEveryAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                np31.c(v);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        });
        if (view.isAttachedToWindow()) {
            np31.c(view);
        }
        if (ref$BooleanRef.element) {
            return;
        }
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.mobile.drive.extensions.ViewKt$setOnApplyInsetsListener$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    Ref$BooleanRef ref$BooleanRef2 = Ref$BooleanRef.this;
                    if (ref$BooleanRef2.element) {
                        return;
                    }
                    View view3 = view;
                    view3.postOnAnimation(new lz(ref$BooleanRef2, view, ax60Var, view3));
                }
            });
        } else {
            if (ref$BooleanRef.element) {
                return;
            }
            view.postOnAnimation(new lz(ref$BooleanRef, view, ax60Var, view));
        }
    }

    public static lry k(ArrayList arrayList) {
        return new lry(new ArrayList(arrayList), false, geb1.b());
    }

    public static final ucb0 l(PfmLocalFilter$Settings pfmLocalFilter$Settings) {
        String id = pfmLocalFilter$Settings.getId();
        Set<String> filterIds = pfmLocalFilter$Settings.getFilterIds();
        ArrayList arrayList = new ArrayList(tcc.n(filterIds, 10));
        Iterator<T> it = filterIds.iterator();
        while (it.hasNext()) {
            arrayList.add(new tab0((String) it.next()));
        }
        return new ucb0(id, a.N0(arrayList));
    }

    public static final PfmLocalFilter$Settings m(ucb0 ucb0Var) {
        String str = ucb0Var.a;
        Set set = ucb0Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((tab0) it.next()).a);
        }
        return new PfmLocalFilter$Settings(str, a.N0(arrayList));
    }

    public static o89 n(euy euyVar, aa3 aa3Var, Executor executor) {
        o89 o89Var = new o89(aa3Var, euyVar);
        euyVar.c(o89Var, executor);
        return o89Var;
    }

    public static void o(int i, int i2, int i3, View view) {
        boolean z;
        if ((i3 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i3 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        boolean z2 = true;
        if (i == Integer.MAX_VALUE || marginLayoutParams.topMargin == i) {
            z = false;
        } else {
            marginLayoutParams.topMargin = i;
            z = true;
        }
        if (i2 == Integer.MAX_VALUE || marginLayoutParams.bottomMargin == i2) {
            z2 = z;
        } else {
            marginLayoutParams.bottomMargin = i2;
        }
        if (z2) {
            if (view.isLaidOut()) {
                view.requestLayout();
            } else {
                view.post(new ce0(view, 27));
            }
        }
    }
}
