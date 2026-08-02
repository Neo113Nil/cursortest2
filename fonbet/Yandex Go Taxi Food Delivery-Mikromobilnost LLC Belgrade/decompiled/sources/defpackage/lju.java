package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class lju {
    public static final Range e = new Range(120, 120);
    public final ep7 a;
    public final i3y b;
    public final i3y c;
    public final i3y d;

    public lju(ep7 ep7Var) {
        this.a = ep7Var;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: kju
            public final /* synthetic */ lju b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                lju ljuVar = this.b;
                switch (i2) {
                    case 0:
                        int[] iArr = (int[]) ljuVar.a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    if (iArr[i3] == 9) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) ljuVar.d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            ny61.p();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int a = vjs0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int a2 = vjs0.a((Size) next2);
                                if (a < a2) {
                                    next = next2;
                                    a = a2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((wor0) ljuVar.a.c().a).a).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? j73.A(highSpeedVideoSizes) : EmptyList.a;
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: kju
            public final /* synthetic */ lju b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                lju ljuVar = this.b;
                switch (i22) {
                    case 0:
                        int[] iArr = (int[]) ljuVar.a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    if (iArr[i3] == 9) {
                                        z = true;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) ljuVar.d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            ny61.p();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int a = vjs0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int a2 = vjs0.a((Size) next2);
                                if (a < a2) {
                                    next = next2;
                                    a = a2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((wor0) ljuVar.a.c().a).a).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? j73.A(highSpeedVideoSizes) : EmptyList.a;
                }
            }
        });
        final int i3 = 2;
        this.d = a.a(new sls(this) { // from class: kju
            public final /* synthetic */ lju b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                lju ljuVar = this.b;
                switch (i22) {
                    case 0:
                        int[] iArr = (int[]) ljuVar.a.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        boolean z = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i32 = 0;
                            while (true) {
                                if (i32 < length) {
                                    if (iArr[i32] == 9) {
                                        z = true;
                                    } else {
                                        i32++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) ljuVar.d.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            ny61.p();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int a = vjs0.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int a2 = vjs0.a((Size) next2);
                                if (a < a2) {
                                    next = next2;
                                    a = a2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    default:
                        Size[] highSpeedVideoSizes = ((StreamConfigurationMap) ((wor0) ljuVar.a.c().a).a).getHighSpeedVideoSizes();
                        return highSpeedVideoSizes != null ? j73.A(highSpeedVideoSizes) : EmptyList.a;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList((Collection) kotlin.collections.a.P(list));
        Iterator it = kotlin.collections.a.J(list, 1).iterator();
        while (it.hasNext()) {
            arrayList.retainAll((List) it.next());
        }
        return arrayList;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && kotlin.collections.a.I(list).size() == 1) {
            List c = c((Size) list.get(0));
            if (c.isEmpty()) {
                c = null;
            }
            if (c != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : c) {
                        Range range = (Range) obj;
                        if (jl40.l(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    c = arrayList;
                }
                return (Range[]) c.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object failure;
        try {
            failure = ((StreamConfigurationMap) ((wor0) this.a.c().a).a).getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Range[] rangeArr = (Range[]) failure;
        return rangeArr != null ? kotlin.collections.a.J0(j73.A(rangeArr)) : EmptyList.a;
    }
}
