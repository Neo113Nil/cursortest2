package xsna;

import com.vk.api.generated.notifications.dto.NotificationsCategoriesVectorResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsCategoryDto;
import com.vk.notifications.list.impl.presentation.base.mvi.common.NotificationCategoryTab;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.wa70;

/* compiled from: NotificationListCategoryTabsFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class ua70 {
    public final s101 a;
    public final he70 b;
    public final wa70.b c;
    public final wa70.c d;

    public ua70(s101 s101Var, he70 he70Var, wa70.b bVar, wa70.c cVar) {
        this.a = s101Var;
        this.b = he70Var;
        this.c = bVar;
        this.d = cVar;
    }

    public static int a(List list, NotificationCategoryTab notificationCategoryTab) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(((zi70) it.next()).a, notificationCategoryTab.getId())) {
                break;
            }
            i++;
        }
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062 A[LOOP:0: B:11:0x005c->B:13:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        sa70 sa70Var;
        int i;
        ArrayList arrayList;
        if (continuationImpl instanceof sa70) {
            sa70Var = (sa70) continuationImpl;
            int i2 = sa70Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sa70Var.label = i2 - Integer.MIN_VALUE;
                Object obj = sa70Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sa70Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ta70 ta70Var = new ta70(this, null);
                    sa70Var.label = 1;
                    obj = myc0.k(b, ta70Var, sa70Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                List<NotificationsCategoryDto> d = ((NotificationsCategoriesVectorResponseDto) obj).d();
                arrayList = new ArrayList(c5g.u(d, 10));
                for (NotificationsCategoryDto notificationsCategoryDto : d) {
                    arrayList.add(new zi70(notificationsCategoryDto.d(), notificationsCategoryDto.getTitle()));
                }
                LinkedHashMap linkedHashMap = jja.a;
                this.b.getClass();
                Long a = he70.a();
                if (!arrayList.isEmpty()) {
                    jja.a.put(a, arrayList);
                }
                return arrayList;
            }
        }
        sa70Var = new sa70(this, continuationImpl);
        Object obj2 = sa70Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sa70Var.label;
        if (i != 0) {
        }
        List<NotificationsCategoryDto> d2 = ((NotificationsCategoriesVectorResponseDto) obj2).d();
        arrayList = new ArrayList(c5g.u(d2, 10));
        while (r6.hasNext()) {
        }
        LinkedHashMap linkedHashMap2 = jja.a;
        this.b.getClass();
        Long a2 = he70.a();
        if (!arrayList.isEmpty()) {
        }
        return arrayList;
    }
}
