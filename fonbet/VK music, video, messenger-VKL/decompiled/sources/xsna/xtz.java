package xsna;

import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.List;
import java.util.ListIterator;

/* compiled from: LocalAnchorCalculator.kt */
/* loaded from: classes2.dex */
public final class xtz implements zy1<n5w, wy1> {
    @Override // xsna.zy1
    public final /* bridge */ /* synthetic */ boolean D(wy1 wy1Var) {
        return false;
    }

    @Override // xsna.zy1
    public final wy1 n(n5w n5wVar) {
        a5w a5wVar;
        a5w a5wVar2;
        x7w x7wVar;
        x7w x7wVar2;
        d5w d5wVar = n5wVar.b;
        List<a5w> list = d5wVar.a;
        ListIterator<a5w> listIterator = list.listIterator(list.size());
        while (true) {
            a5wVar = null;
            if (!listIterator.hasPrevious()) {
                a5wVar2 = null;
                break;
            }
            a5wVar2 = listIterator.previous();
            if (a5wVar2.M8() == ImItemType.DIALOG) {
                break;
            }
        }
        a5w a5wVar3 = a5wVar2;
        if (a5wVar3 == null || (x7wVar = a5wVar3.y9()) == null) {
            x7wVar = x7w.g;
        }
        List<a5w> list2 = d5wVar.a;
        ListIterator<a5w> listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                break;
            }
            a5w previous = listIterator2.previous();
            if (previous.M8() == ImItemType.CHANNEL) {
                a5wVar = previous;
                break;
            }
        }
        a5w a5wVar4 = a5wVar;
        if (a5wVar4 == null || (x7wVar2 = a5wVar4.y9()) == null) {
            x7wVar2 = x7w.g;
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER LocalAnchorCalculator.calculateAnchor: dialogs=" + com.vk.im.engine.models.im_item.b.a(x7wVar) + ", channels=" + com.vk.im.engine.models.im_item.b.a(x7wVar2)});
        }
        return new wy1(x7wVar, x7wVar2);
    }
}
