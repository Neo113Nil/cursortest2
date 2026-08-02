package com.yandex.go.safety.center.lost_item.modal.mapper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.yandex.go.safety.center.lost_item.data.Image$ImageType;
import com.yandex.go.safety.center.lost_item.modal.interactor.LostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
import defpackage.bvf0;
import defpackage.f7v;
import defpackage.frz;
import defpackage.grz;
import defpackage.h7v;
import defpackage.hjy0;
import defpackage.hrz;
import defpackage.ijy0;
import defpackage.jjy0;
import defpackage.jrz;
import defpackage.kyh0;
import defpackage.m7v;
import defpackage.mjy0;
import defpackage.ny61;
import defpackage.orz;
import defpackage.prz;
import defpackage.q3h0;
import defpackage.qrz;
import defpackage.tje;
import defpackage.vqz;
import defpackage.w511;
import java.util.Map;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;

    public a(e eVar) {
        this.a = eVar;
    }

    public static final Object a(a aVar, mjy0 mjy0Var, Map map, SuspendLambda suspendLambda) {
        e eVar = aVar.a;
        if (mjy0Var instanceof ijy0) {
            return c.i(eVar.d, ((ijy0) mjy0Var).a, map, suspendLambda, 28);
        }
        if (mjy0Var instanceof jjy0) {
            return ((jjy0) mjy0Var).a;
        }
        if (mjy0Var instanceof hjy0) {
            return eVar.a.getString(((hjy0) mjy0Var).a);
        }
        w511.b();
        return null;
    }

    public final Object b(m7v m7vVar, ContinuationImpl continuationImpl) {
        boolean z = m7vVar instanceof h7v;
        e eVar = this.a;
        if (z) {
            Object f = e.f(eVar, ((h7v) m7vVar).a, null, continuationImpl, 6);
            return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : (Drawable) f;
        }
        if (m7vVar instanceof f7v) {
            return tje.y(((f7v) m7vVar).a, eVar.a);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(m7v m7vVar, ContinuationImpl continuationImpl) {
        LostItemsUiMapper$mapImageToUiImage$1 lostItemsUiMapper$mapImageToUiImage$1;
        int i;
        if (continuationImpl instanceof LostItemsUiMapper$mapImageToUiImage$1) {
            lostItemsUiMapper$mapImageToUiImage$1 = (LostItemsUiMapper$mapImageToUiImage$1) continuationImpl;
            int i2 = lostItemsUiMapper$mapImageToUiImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lostItemsUiMapper$mapImageToUiImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lostItemsUiMapper$mapImageToUiImage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lostItemsUiMapper$mapImageToUiImage$1.label;
                grz grzVar = null;
                if (i != 0) {
                    b.b(obj);
                    lostItemsUiMapper$mapImageToUiImage$1.L$0 = m7vVar;
                    lostItemsUiMapper$mapImageToUiImage$1.L$1 = null;
                    lostItemsUiMapper$mapImageToUiImage$1.label = 1;
                    obj = b(m7vVar, lostItemsUiMapper$mapImageToUiImage$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    grzVar = (grz) lostItemsUiMapper$mapImageToUiImage$1.L$1;
                    m7vVar = (m7v) lostItemsUiMapper$mapImageToUiImage$1.L$0;
                    b.b(obj);
                }
                Drawable drawable = (Drawable) obj;
                return drawable != null ? grzVar : new grz(drawable, m7vVar.getType());
            }
        }
        lostItemsUiMapper$mapImageToUiImage$1 = new LostItemsUiMapper$mapImageToUiImage$1(this, continuationImpl);
        Object obj3 = lostItemsUiMapper$mapImageToUiImage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lostItemsUiMapper$mapImageToUiImage$1.label;
        grz grzVar2 = null;
        if (i != 0) {
        }
        Drawable drawable2 = (Drawable) obj3;
        if (drawable2 != null) {
        }
    }

    public final Object d(qrz qrzVar, LostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
        if (qrzVar instanceof prz) {
            int i = q3h0.ic_warning_fill_circle;
            Context context = this.a.a;
            return new hrz(new grz(tje.y(i, context), Image$ImageType.ICON), context.getString(kyh0.forgotten_items_modal_error_title), context.getString(kyh0.forgotten_items_modal_error_subtitle), EmptyList.a, new frz(null, context.getString(kyh0.forgotten_items_modal_error_button), vqz.a));
        }
        if (qrzVar instanceof orz) {
            Object n = bvf0.n(new LostItemsUiMapper$mapContentToUi$2((orz) qrzVar, this, null), lostItemsUiStateInteractor$uiStateFlow$$inlined$map$1$2$1);
            return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : (jrz) n;
        }
        w511.b();
        return null;
    }
}
