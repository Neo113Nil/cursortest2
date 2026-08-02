package xsna;

import com.vk.libvideo.api.ad.AdChoice;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.mg0;

/* compiled from: AdMenuBottomSheetItemConverter.kt */
/* loaded from: classes3.dex */
public final class ng0 {

    /* compiled from: AdMenuBottomSheetItemConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdChoice.Type.values().length];
            try {
                iArr[AdChoice.Type.AGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdChoice.Type.COMPLAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AdChoice adChoice = (AdChoice) it.next();
            int i = a.$EnumSwitchMapping$0[adChoice.b.ordinal()];
            arrayList2.add(new mg0.b(adChoice, i != 1 ? i != 2 ? mg0.b.a.C3341a.a : mg0.b.a.C3342b.a : mg0.b.a.c.a));
        }
        return arrayList2;
    }
}
