package com.yandex.go.places.impl.ui.common.compression_resistant;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.g6u;
import defpackage.jl40;
import defpackage.jwd;
import defpackage.lwd;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o400;
import defpackage.oe7;
import defpackage.sdd;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0013\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/places/impl/ui/common/compression_resistant/CompressionResistantListComponent;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "Ljwd;", "texts", "Ltt2;", "appDispatchers", "Lzy11;", "setTexts$impl", "(Ljava/util/List;Ltt2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTexts", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "totalPriority", CA20Status.STATUS_USER_I, "Companion", "lwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompressionResistantListComponent extends LinearLayout {
    public static final int $stable = 8;
    private static final lwd Companion = new lwd();

    @Deprecated
    public static final String TEXT_DELIMITER = "·";
    private int totalPriority;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.valueOf(((View) obj).getMeasuredWidth()).compareTo(Integer.valueOf(((View) obj2).getMeasuredWidth()));
        }
    }

    public /* synthetic */ CompressionResistantListComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onMeasure$lambda$1(Integer num, Integer num2) {
        return jl40.q(num2.intValue(), num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onMeasure$lambda$2(wls wlsVar, Object obj, Object obj2) {
        return ((Number) wlsVar.invoke(obj, obj2)).intValue();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i = this.totalPriority;
        int measuredWidth = getMeasuredWidth();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        while (true) {
            if (!(i2 < getChildCount())) {
                TreeMap treeMap = new TreeMap(new oe7(2, new sdd(26)));
                treeMap.putAll(linkedHashMap);
                for (Map.Entry entry : treeMap.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    for (View view : kotlin.collections.a.x0((List) entry.getValue(), new a())) {
                        view.measure(View.MeasureSpec.makeMeasureSpec((int) ((measuredWidth / i) * num.intValue()), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                        measuredWidth -= view.getMeasuredWidth();
                        i -= num.intValue();
                    }
                }
                return;
            }
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                ny61.s();
                return;
            }
            Object tag = childAt.getTag();
            Integer num2 = tag instanceof Integer ? (Integer) tag : null;
            Integer valueOf = Integer.valueOf(num2 != null ? num2.intValue() : 1);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(childAt);
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (defpackage.tje.k0(r7, r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setTexts$impl(List<jwd> list, tt2 tt2Var, Continuation<? super zy11> continuation) {
        CompressionResistantListComponent$setTexts$1 compressionResistantListComponent$setTexts$1;
        int i;
        if (continuation instanceof CompressionResistantListComponent$setTexts$1) {
            compressionResistantListComponent$setTexts$1 = (CompressionResistantListComponent$setTexts$1) continuation;
            int i2 = compressionResistantListComponent$setTexts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compressionResistantListComponent$setTexts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compressionResistantListComponent$setTexts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compressionResistantListComponent$setTexts$1.label;
                if (i != 0) {
                    b.b(obj);
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    CompressionResistantListComponent$setTexts$items$1 compressionResistantListComponent$setTexts$items$1 = new CompressionResistantListComponent$setTexts$items$1(this, list, null);
                    compressionResistantListComponent$setTexts$1.L$0 = null;
                    compressionResistantListComponent$setTexts$1.L$1 = tt2Var;
                    compressionResistantListComponent$setTexts$1.label = 1;
                    obj = tje.k0(mdhVar, compressionResistantListComponent$setTexts$items$1, compressionResistantListComponent$setTexts$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return zy11.a;
                    }
                    tt2Var = (tt2) compressionResistantListComponent$setTexts$1.L$1;
                    b.b(obj);
                }
                tt2Var.getClass();
                sjh sjhVar2 = uyj.a;
                g6u g6uVar = o400.a;
                CompressionResistantListComponent$setTexts$2 compressionResistantListComponent$setTexts$2 = new CompressionResistantListComponent$setTexts$2(this, (List) obj, null);
                compressionResistantListComponent$setTexts$1.L$0 = null;
                compressionResistantListComponent$setTexts$1.L$1 = null;
                compressionResistantListComponent$setTexts$1.L$2 = null;
                compressionResistantListComponent$setTexts$1.label = 2;
            }
        }
        compressionResistantListComponent$setTexts$1 = new CompressionResistantListComponent$setTexts$1(this, continuation);
        Object obj2 = compressionResistantListComponent$setTexts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compressionResistantListComponent$setTexts$1.label;
        if (i != 0) {
        }
        tt2Var.getClass();
        sjh sjhVar22 = uyj.a;
        g6u g6uVar2 = o400.a;
        CompressionResistantListComponent$setTexts$2 compressionResistantListComponent$setTexts$22 = new CompressionResistantListComponent$setTexts$2(this, (List) obj2, null);
        compressionResistantListComponent$setTexts$1.L$0 = null;
        compressionResistantListComponent$setTexts$1.L$1 = null;
        compressionResistantListComponent$setTexts$1.L$2 = null;
        compressionResistantListComponent$setTexts$1.label = 2;
    }

    public CompressionResistantListComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CompressionResistantListComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public CompressionResistantListComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public CompressionResistantListComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
