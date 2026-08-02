package com.ybsdk.feature.divkit.internal.extensions;

import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.feature.divkit.internal.extensions.AbsCoordinatesExtensionHandler;
import defpackage.sls;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ View a;
    public final /* synthetic */ AbsCoordinatesExtensionHandler.Type b;
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ Ref$IntRef w;
    public final /* synthetic */ Div2View x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ a(View view, AbsCoordinatesExtensionHandler absCoordinatesExtensionHandler, AbsCoordinatesExtensionHandler.Type type, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, Div2View div2View, String str, String str2) {
        this.a = view;
        this.b = type;
        this.c = ref$IntRef;
        this.w = ref$IntRef2;
        this.x = div2View;
        this.y = str;
        this.z = str2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Pair pair;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            switch (b.a[this.b.ordinal()]) {
                case 1:
                    pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
                    break;
                case 2:
                    pair = new Pair(Integer.valueOf(view.getWidth() + i), Integer.valueOf(i2));
                    break;
                case 3:
                    pair = new Pair(Integer.valueOf(i), Integer.valueOf(view.getHeight() + i2));
                    break;
                case 4:
                    pair = new Pair(Integer.valueOf(view.getWidth() + i), Integer.valueOf(view.getHeight() + i2));
                    break;
                case 5:
                    pair = new Pair(Integer.valueOf((view.getWidth() / 2) + i), Integer.valueOf((view.getHeight() / 2) + i2));
                    break;
                case 6:
                    pair = new Pair(Integer.valueOf((view.getWidth() / 2) + i), Integer.valueOf(i2));
                    break;
                case 7:
                    pair = new Pair(Integer.valueOf(i), Integer.valueOf((view.getHeight() / 2) + i2));
                    break;
                case 8:
                    pair = new Pair(Integer.valueOf(view.getWidth() + i), Integer.valueOf((view.getHeight() / 2) + i2));
                    break;
                case 9:
                    pair = new Pair(Integer.valueOf((view.getWidth() / 2) + i), Integer.valueOf(view.getHeight() + i2));
                    break;
                default:
                    w511.b();
                    return null;
            }
            int intValue = ((Number) pair.getFirst()).intValue();
            int intValue2 = ((Number) pair.getSecond()).intValue();
            Ref$IntRef ref$IntRef = this.c;
            int i3 = ref$IntRef.element;
            Ref$IntRef ref$IntRef2 = this.w;
            if (intValue != i3 || intValue2 != ref$IntRef2.element) {
                ref$IntRef.element = intValue;
                ref$IntRef2.element = intValue2;
                String valueOf = String.valueOf(intValue);
                Div2View div2View = this.x;
                div2View.setVariable(this.y, valueOf);
                div2View.setVariable(this.z, String.valueOf(intValue2));
            }
        }
        return zy11.a;
    }
}
