package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.ImageView;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.samsung.android.sdk.samsungpay.v2.ErrorType;
import com.samsung.android.sdk.samsungpay.v2.PartnerRequest;
import com.yandex.go.lootbox.impl.presentation.modal.LootBoxModalView;
import java.util.List;
import ru.yandex.taxi.utils.TouchDelegateComposite;

/* loaded from: classes15.dex */
public final /* synthetic */ class mbb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ mbb(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.w = obj2;
        this.x = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AccessibilityNodeProvider accessibilityNodeProvider;
        AccessibilityNodeInfo findFocus;
        int i = this.a;
        Object obj = this.x;
        int i2 = this.b;
        Object obj2 = this.w;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((obb) obj3).a((yab) obj2, null, i2, (yab) obj);
                break;
            case 1:
                RecyclerView recyclerView = (RecyclerView) obj3;
                x1n x1nVar = (x1n) obj2;
                RecyclerView.e eVar = (RecyclerView.e) obj;
                x0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
                if (findViewHolderForAdapterPosition != null) {
                    int[] c = x1nVar.c(eVar, findViewHolderForAdapterPosition.a);
                    recyclerView.scrollBy(c[0], c[1]);
                    break;
                } else {
                    recyclerView.scrollToPosition(i2);
                    x1nVar.i = i2;
                    break;
                }
            case 2:
                ((j) obj3).e(i2, (String) obj2, (Throwable) obj);
                break;
            case 3:
                ((xyn) obj3).e(new EncodeException(i2, (String) obj2, (Throwable) obj));
                break;
            case 4:
                LootBoxModalView.animateGifts$lambda$0$3$1((LootBoxModalView) obj3, (ImageView) obj2, i2, (List) obj);
                break;
            case 5:
                ((PartnerRequest) obj3).g((ErrorType) obj2, i2, (Bundle) obj);
                break;
            case 6:
                View[] viewArr = (View[]) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                View view = (View) obj;
                if (viewArr.length == 1) {
                    TouchDelegateComposite.Companion.getClass();
                    xyz0.a(viewGroup, xyz0.c(i2, view, viewGroup), view);
                    break;
                } else {
                    TouchDelegateComposite touchDelegateComposite = new TouchDelegateComposite(view);
                    for (View view2 : viewArr) {
                        TouchDelegateComposite.Companion.getClass();
                        touchDelegateComposite.addDelegate(xyz0.c(i2, view2, viewGroup));
                    }
                    TouchDelegateComposite.Companion.getClass();
                    xyz0.a(viewGroup, touchDelegateComposite, view);
                    break;
                }
            default:
                View view3 = (View) obj2;
                sls slsVar = (sls) obj;
                if (!((Boolean) ((sls) obj3).invoke()).booleanValue() && (accessibilityNodeProvider = view3.getAccessibilityNodeProvider()) != null && (findFocus = accessibilityNodeProvider.findFocus(2)) != null) {
                    Rect rect = new Rect();
                    findFocus.getBoundsInScreen(rect);
                    findFocus.recycle();
                    int[] iArr = new int[2];
                    view3.getLocationOnScreen(iArr);
                    if (rect.top >= (view3.getHeight() + iArr[1]) - i2) {
                        slsVar.invoke();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mbb(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
        this.x = obj3;
    }
}
